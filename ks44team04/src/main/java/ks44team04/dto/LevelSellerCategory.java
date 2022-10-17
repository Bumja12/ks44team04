package ks44team04.dto;

public class LevelSellerCategory {

	
    private String levelCode;      // 등급 코드 PK
    private String levelName;      // 등급 이름
    private String regId;          // 회원 아이디 FK(등록)
    private String levelRegDate;   // 등록일
    private String useCheck; 	   // 사용 여부
    private int sellerPriceTerms;  // 1년 누적 판매 금액
    private int sellerScoreTerms;  // 1년 누적 판매 건수
    private int sellerReviewTerms; // 6개월 평균 리뷰 평점
    private String levelCodeNpk;   // 등급 코드
    
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

    public int getSellerPriceTerms() {
        return sellerPriceTerms;
    }

    public void setSellerPriceTerms(int sellerPriceTerms) {
        this.sellerPriceTerms = sellerPriceTerms;
    }

    public int getSellerScoreTerms() {
        return sellerScoreTerms;
    }

    public void setSellerScoreTerms(int sellerScoreTerms) {
        this.sellerScoreTerms = sellerScoreTerms;
    }

    public int getSellerReviewTerms() {
        return sellerReviewTerms;
    }

    public void setSellerReviewTerms(int sellerReviewTerms) {
        this.sellerReviewTerms = sellerReviewTerms;
    }

    public String getLevelCodeNpk() {
        return levelCodeNpk;
    }

    public void setLevelCodeNpk(String levelCodeNpk) {
        this.levelCodeNpk = levelCodeNpk;
    }

    @Override
    public String toString() {
        return "LevelSellerCategory{" +
                "levelCode='" + levelCode + '\'' +
                ", levelName='" + levelName + '\'' +
                ", regId='" + regId + '\'' +
                ", levelRegDate='" + levelRegDate + '\'' +
                ", useCheck='" + useCheck + '\'' +
                ", sellerPriceTerms=" + sellerPriceTerms +
                ", sellerScoreTerms=" + sellerScoreTerms +
                ", sellerReviewTerms=" + sellerReviewTerms +
                ", levelCodeNpk='" + levelCodeNpk + '\'' +
                '}';
    }
}
