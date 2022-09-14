package ks44team04.dto;

public class CustomerAsk {

    private String customerAsk;
    private String askCategory;
    private String userId;
    private String askTitle;
    private String askDesc;
    private String askFile;
    private String askDate;

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

    @Override
    public String toString() {
        return "CustomerAsk{" +
                "customerAsk='" + customerAsk + '\'' +
                ", askCategory='" + askCategory + '\'' +
                ", userId='" + userId + '\'' +
                ", askTitle='" + askTitle + '\'' +
                ", askDesc='" + askDesc + '\'' +
                ", askFile='" + askFile + '\'' +
                ", askDate='" + askDate + '\'' +
                '}';
    }
}
