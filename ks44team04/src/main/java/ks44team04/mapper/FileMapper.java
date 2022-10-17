package ks44team04.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import ks44team04.dto.FileDto;

@Mapper
public interface FileMapper {

	public int addFile(List<FileDto> fileList); 
	
	public int addFileControl(List<FileDto> fileList);
	
	public List<FileDto> getFileList(boolean fileIsLocal);
	
	public FileDto getFileInfoByIdx(String fileIdx, boolean fileIsLocal);
}
