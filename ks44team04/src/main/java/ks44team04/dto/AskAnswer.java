package ks44team04.dto;

public class AskAnswer {

    private String askAnswer;
    private String userId;
    private String customerAsk;
    private String askAnswerContent;
    private String askAnswerDate;

    public String getAskAnswer() {
        return askAnswer;
    }

    public void setAskAnswer(String askAnswer) {
        this.askAnswer = askAnswer;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCustomerAsk() {
        return customerAsk;
    }

    public void setCustomerAsk(String customerAsk) {
        this.customerAsk = customerAsk;
    }

    public String getAskAnswerContent() {
        return askAnswerContent;
    }

    public void setAskAnswerContent(String askAnswerContent) {
        this.askAnswerContent = askAnswerContent;
    }

    public String getAskAnswerDate() {
        return askAnswerDate;
    }

    public void setAskAnswerDate(String askAnswerDate) {
        this.askAnswerDate = askAnswerDate;
    }

    @Override
    public String toString() {
        return "AskAnswer{" +
                "askAnswer='" + askAnswer + '\'' +
                ", userId='" + userId + '\'' +
                ", customerAsk='" + customerAsk + '\'' +
                ", askAnswerContent='" + askAnswerContent + '\'' +
                ", askAnswerDate='" + askAnswerDate + '\'' +
                '}';
    }
}
