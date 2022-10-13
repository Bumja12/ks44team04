package ks44team04.dto;

public class LevelBuyerCategory {

	private String levelCode; 	 // 등급 코드 PK
	private String levelName; 	 // 등급 이름
	private String regId; 		 // 회원 아이디 FK(등록인)
	private String levelRegDate; // 등급 생성일
	private String useCheck;     // 사용 여부
	private int buyerPriceTerms; // 구매자 구매 금액 조건 (6개월)
	private int saveRate; 		 // 적립율(%)	
	private String levelCodeNpk; // 등급 코드

	public String getLevelCode() {
		return levelCode;
	}

	public void setLevelCode(String levelCode) {
		this.levelCode = levelCode;
	}

	public String getLevelName() {
		return levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

	public String getRegId() {
		return regId;
	}

	public void setRegId(String regId) {
		this.regId = regId;
	}

	public String getLevelRegDate() {
		return levelRegDate;
	}

	public void setLevelRegDate(String levelRegDate) {
		this.levelRegDate = levelRegDate;
	}

	public String getUseCheck() {
		return useCheck;
	}

	public void setUseCheck(String useCheck) {
		this.useCheck = useCheck;
	}

	public int getBuyerPriceTerms() {
		return buyerPriceTerms;
	}

	public void setBuyerPriceTerms(int buyerPriceTerms) {
		this.buyerPriceTerms = buyerPriceTerms;
	}

	public int getSaveRate() {
		return saveRate;
	}

	public void setSaveRate(int saveRate) {
		this.saveRate = saveRate;
	}

	public String getLevelCodeNpk() {
		return levelCodeNpk;
	}

	public void setLevelCodeNpk(String levelCodeNpk) {
		this.levelCodeNpk = levelCodeNpk;
	}

	@Override
	public String toString() {
		return "LevelBuyerCategory{" + "levelCode='" + levelCode + '\'' + ", levelName='" + levelName + '\''
				+ ", regId='" + regId + '\'' + ", levelRegDate='" + levelRegDate + '\'' + ", useCheck='" + useCheck
				+ '\'' + ", buyerPriceTerms=" + buyerPriceTerms + ", saveRate=" + saveRate + ", levelCodeNpk='"
				+ levelCodeNpk + '\'' + '}';
	}
}
