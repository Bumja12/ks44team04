package ks44team04.dto;

public class CustomerAsk {

    private String customerAsk;  // 문의 PK
    private String askCategory;	 // 문의 카테고리 FK 
    private String userId;	     // 회원 아이디 FK(문의인)
    private String askTitle;     // 문의 제목
    private String askDesc;	     // 문의 내용 
    private String askFile;	     // 첨부 파일
    private String askDate;	     // 문의일
    private String modifyDate;   // 수정일
    private String answercheck;  // 답변 여부
    
	public String getCustomerAsk() {
		return customerAsk;
	}
	public void setCustomerAsk(String customerAsk) {
		this.customerAsk = customerAsk;
	}
	public String getAskCategory() {
		return askCategory;
	}
	public void setAskCategory(String askCategory) {
		this.askCategory = askCategory;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAskTitle() {
		return askTitle;
	}
	public void setAskTitle(String askTitle) {
		this.askTitle = askTitle;
	}
	public String getAskDesc() {
		return askDesc;
	}
	public void setAskDesc(String askDesc) {
		this.askDesc = askDesc;
	}
	public String getAskFile() {
		return askFile;
	}
	public void setAskFile(String askFile) {
		this.askFile = askFile;
	}
	public String getAskDate() {
		return askDate;
	}
	public void setAskDate(String askDate) {
		this.askDate = askDate;
	}
	public String getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}
	public String getAnswercheck() {
		return answercheck;
	}
	public void setAnswercheck(String answercheck) {
		this.answercheck = answercheck;
	}
	
	@Override
	public String toString() {
		return "CustomerAsk [customerAsk=" + customerAsk + ", askCategory=" + askCategory + ", userId=" + userId
				+ ", askTitle=" + askTitle + ", askDesc=" + askDesc + ", askFile=" + askFile + ", askDate=" + askDate
				+ ", modifyDate=" + modifyDate + ", answercheck=" + answercheck + "]";
	}
	
}
