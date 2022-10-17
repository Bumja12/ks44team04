package ks44team04.dto;

public class FileDto {

	private String fileIdx;				//파일코드
	private String fileOriginalName;	//실제 파일 이름
	private String fileNewName;			//새로운 이름 (사용자가 같은 이름의 파일을 업로드했을 때 중복되므로 세컨드이름)
	private String filePath;			//파일 경로
	private Long fileSize;				//파일 사이즈
	private boolean fileIsLocal;
	
	public String getFileIdx() {
		return fileIdx;
	}
	public void setFileIdx(String fileIdx) {
		this.fileIdx = fileIdx;
	}
	public String getFileOriginalName() {
		return fileOriginalName;
	}
	public void setFileOriginalName(String fileOriginalName) {
		this.fileOriginalName = fileOriginalName;
	}
	public String getFileNewName() {
		return fileNewName;
	}
	public void setFileNewName(String fileNewName) {
		this.fileNewName = fileNewName;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}
	
	public Long getFileSize() {
		return fileSize;
	}
	
	public boolean getFileIsLocal() {
		return fileIsLocal;
	}
	
	public void setFileIsLocal(boolean fileIsLocal) {
		this.fileIsLocal = fileIsLocal;
	}
	
	@Override
	public String toString() {
		return "FileDto [fileIdx=" + fileIdx + ", fileOriginalName=" + fileOriginalName + ", fileNewName=" + fileNewName
				+ ", filePath=" + filePath + ", fileSize=" + fileSize + ", fileIsLocal=" + fileIsLocal + "]";
	}
	
	
}
