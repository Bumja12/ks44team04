package ks44team04.dto;

public class RegularAsk {

    private String regularAsk;
    private String regularAskCategory;
    private String regId;
    private String regularAskTitle;
    private String regularAskContent;
    private String useCheck;
    private String regDate;
    private String updateDate;

    public String getRegularAsk() {
        return regularAsk;
    }

    public void setRegularAsk(String regularAsk) {
        this.regularAsk = regularAsk;
    }

    public String getRegularAskCategory() {
        return regularAskCategory;
    }

    public void setRegularAskCategory(String regularAskCategory) {
        this.regularAskCategory = regularAskCategory;
    }

    public String getRegId() {
        return regId;
    }

    public void setRegId(String regId) {
        this.regId = regId;
    }

    public String getRegularAskTitle() {
        return regularAskTitle;
    }

    public void setRegularAskTitle(String regularAskTitle) {
        this.regularAskTitle = regularAskTitle;
    }

    public String getRegularAskContent() {
        return regularAskContent;
    }

    public void setRegularAskContent(String regularAskContent) {
        this.regularAskContent = regularAskContent;
    }

    public String getUseCheck() {
        return useCheck;
    }

    public void setUseCheck(String useCheck) {
        this.useCheck = useCheck;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "RegularAsk{" +
                "regularAsk='" + regularAsk + '\'' +
                ", regularAskCategory='" + regularAskCategory + '\'' +
                ", regId='" + regId + '\'' +
                ", regularAskTitle='" + regularAskTitle + '\'' +
                ", regularAskContent='" + regularAskContent + '\'' +
                ", useCheck='" + useCheck + '\'' +
                ", regDate='" + regDate + '\'' +
                ", updateDate='" + updateDate + '\'' +
                '}';
    }
}
