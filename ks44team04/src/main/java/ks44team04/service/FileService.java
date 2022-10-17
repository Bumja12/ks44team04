package ks44team04.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import ks44team04.dto.FileDto;
import ks44team04.mapper.FileMapper;
import ks44team04.util.FileUtil;

@Service
@Transactional
public class FileService {
	
	private FileUtil fileUtil;
	private FileMapper fileMapper;	
	
	public FileService(FileUtil fileUtil, FileMapper fileMapper) {
		
		this.fileUtil = fileUtil;
		this.fileMapper = fileMapper;
	}

	public void fileUpload(MultipartFile[] uploadfile, String fileRealPath, boolean isLocalhost) {
		
		List<FileDto> fileList= fileUtil.parseFileInfo(uploadfile, fileRealPath , isLocalhost);
		
		System.out.println(fileList);
		
		if(fileList != null) fileMapper.addFile(fileList);
		
	}
	
	public List<FileDto> getFileList(boolean fileIsLocal){
		return fileMapper.getFileList(fileIsLocal);
	}
	
	public FileDto getFileInfoByIdx(String fileIdx, boolean fileIsLocal) {
		return fileMapper.getFileInfoByIdx(fileIdx, fileIsLocal);
	}
}
