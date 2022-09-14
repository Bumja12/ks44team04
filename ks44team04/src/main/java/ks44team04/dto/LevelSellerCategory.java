package ks44team04.dto;

public class LevelSellerCategory {

    private String levelCode;
    private String levelName;
    private String regId;
    private String levelRegDate;
    private String useCheck;
    private int sellerPriceTerms;
    private int sellerScoreTerms;
    private int sellerReviewTerms;
    private String levelCodeNpk;

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
