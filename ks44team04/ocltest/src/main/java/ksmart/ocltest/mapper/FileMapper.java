package ksmart.ocltest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart.ocltest.dto.FileDto;

@Mapper
public interface FileMapper {

	public int addFile(List<FileDto> fileList); 
	
	public List<FileDto> getFileList(boolean fileIsLocal);
	
	public FileDto getFileInfoByIdx(String fileIdx, boolean fileIsLocal);
}
