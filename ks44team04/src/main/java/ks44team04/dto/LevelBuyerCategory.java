package ks44team04.dto;

public class LevelBuyerCategory {

    private String levelCode;
    private String levelName;
    private String regId;
    private String levelRegDate;
    private String useCheck;
    private int buyerPriceTerms;
    private int saveRate;
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
        return "LevelBuyerCategory{" +
                "levelCode='" + levelCode + '\'' +
                ", levelName='" + levelName + '\'' +
                ", regId='" + regId + '\'' +
                ", levelRegDate='" + levelRegDate + '\'' +
                ", useCheck='" + useCheck + '\'' +
                ", buyerPriceTerms=" + buyerPriceTerms +
                ", saveRate=" + saveRate +
                ", levelCodeNpk='" + levelCodeNpk + '\'' +
                '}';
    }
}
