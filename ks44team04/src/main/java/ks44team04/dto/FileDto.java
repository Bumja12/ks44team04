package ks44team04.dto;

public class FileDto {

	private String fileIdx;
	private String fileOriginalName;
	private String fileNewName;
	private String filePath;
	private Long fileSize;
	private boolean fileIsLocal;
	private String tableName;
	private String tablePk;
	
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
	
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	
	public String getTablePk() {
		return tablePk;
	}
	public void setTablePk(String tablePk) {
		this.tablePk = tablePk;
	}
	
	@Override
	public String toString() {
		return "FileDto [fileIdx=" + fileIdx + ", fileOriginalName=" + fileOriginalName + ", fileNewName=" + fileNewName
				+ ", filePath=" + filePath + ", fileSize=" + fileSize + ", fileIsLocal=" + fileIsLocal + ""
						+ ", tableName=\" + tableName + \", tablePk=\" + tablePk + \"]";
	}
	
	
}
