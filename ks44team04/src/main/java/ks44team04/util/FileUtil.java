package ks44team04.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.web.multipart.MultipartFile;

import ks44team04.dto.FileDto;


@Component
public class FileUtil {
	
	public List<FileDto> parseFileInfo(MultipartFile[] uploadfile, String fileRealPath, boolean isLocalhost){
		
		// 파일이 존재하지 않은 경우 
		if(ObjectUtils.isEmpty(uploadfile)){
			return null;
		}
		
		// 날짜 패턴 
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyyMMdd"); 
    	// 현재 날짜(디렉토리 명)
		ZonedDateTime current = ZonedDateTime.now();
    	
		// 파일idx, 파일 타입, 헤더안의 콘텐츠의 실제 콘텐츠 유형, 파일 경로, 디렉토리 분류
    	String fileIdx, originalFileExtension, contentType, path, directory;
    	
    	List<FileDto> fileList = new ArrayList<>();    	
		
		for (MultipartFile multipartFile : uploadfile){
			if(multipartFile.isEmpty() == false){
				contentType = multipartFile.getContentType();
				
				if(ObjectUtils.isEmpty(contentType)){
					break;
				}
				else{
					// 콘텐츠 이미지 파일 타입별 분류 ( 이미지, file폴더 구분)
					if(contentType.indexOf("image/") > -1) {						
						if(contentType.contains("image/jpeg")) {
							originalFileExtension = ".jpg";
						}
						else if(contentType.contains("image/png")) {
							originalFileExtension = ".png";
						}
						else if(contentType.contains("image/gif")) {
							originalFileExtension = ".gif";
						}
						if(isLocalhost) {							
							directory = "images" + File.separator;
						}else {
							directory = "resource" + File.separator + "images" + File.separator;							
						}
					}else {
						if(isLocalhost) {
							directory = "files" + File.separator;
						}else {							
							directory = "resource" + File.separator + "files" + File.separator;							
						}
					}
					
					// Paths 클래스를 통한 파일의 경로 ( 주소의 / 경로와 실제 os의 경로 \ 와 차이)
					path = Paths.get(fileRealPath + directory + current.format(format)).toString();
			    	
					// 파일 경로 셋팅
			    	File file = new File(path);
					
			    	// 파일 디렉토리 없을 경우 디렉토리생성
			    	if(file.exists() == false){
						file.mkdirs();
					}
			    	
			    	// 파일 명이 겹치지 않게 파일명 설정
			    	String resultFileName = "";
			    	String[] fileNameSplit = multipartFile.getOriginalFilename().split("\\.");

			    	for(int i=0; i<fileNameSplit.length; i++) {
			    		if(i == (fileNameSplit.length-1)) {
			    			fileNameSplit[i] = "." + fileNameSplit[i];
			    		}else {			    			
			    			fileNameSplit[i] = fileNameSplit[i].replaceAll("\\s", "") + Long.toString(System.nanoTime());
			    		}
			    		resultFileName += fileNameSplit[i];
			    	}
			    	
			    	// 파일의 업로드 경로 설정
			    	byte[] bytes;			    	
			    	Path uploadPath = Paths.get(path + "/" + resultFileName);
			    	
					try {
						
						bytes = multipartFile.getBytes();
						
						// 파일업로드 
						Files.write(uploadPath, bytes);
						
					} catch (IOException e) {
						e.printStackTrace();
						return null;
					}
			    	
					// 올려진 파일 리스트로 정리(테이블에 삽입할 내용)
					fileIdx = "file_"+current.format(format)+Long.toString(System.nanoTime());
					FileDto fileDto = new FileDto();
					fileDto.setFileIdx(fileIdx);
					fileDto.setFileSize(multipartFile.getSize());
					fileDto.setFileOriginalName(multipartFile.getOriginalFilename());
					fileDto.setFileNewName(resultFileName);
					fileDto.setFileIsLocal(isLocalhost);
					if(isLocalhost) {						
						fileDto.setFilePath(directory+ current.format(format)+ File.separator + resultFileName);
					}else {						
						fileDto.setFilePath("resources"+ File.separator + directory + current.format(format)+ File.separator + resultFileName);
					}
					fileList.add(fileDto);
				}
				
			}
		}
		return fileList;
	}
}
