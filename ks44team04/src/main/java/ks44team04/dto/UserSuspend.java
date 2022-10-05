package ks44team04.dto;

public class UserSuspend {

    private String userSuspendCode;
    private String suspendId;
    private String approveId;
    private int suspendDay;
    private String startSuspend;
    private String endSuspend;
    private String suspendResult;
    private String suspendReason;

    public String getSuspendReason() {
		return suspendReason;
	}

	public void setSuspendReason(String suspendReason) {
		this.suspendReason = suspendReason;
	}

	public String getSuspendResult() {
		return suspendResult;
	}

	public void setSuspendResult(String suspendResult) {
		this.suspendResult = suspendResult;
	}

	public String getUserSuspendCode() {
        return userSuspendCode;
    }

    public void setUserSuspendCode(String userSuspendCode) {
        this.userSuspendCode = userSuspendCode;
    }

    public String getSuspendId() {
        return suspendId;
    }

    public void setSuspendId(String suspendId) {
        this.suspendId = suspendId;
    }

    public String getApproveId() {
        return approveId;
    }

    public void setApproveId(String approveId) {
        this.approveId = approveId;
    }

    public int getSuspendDay() {
        return suspendDay;
    }

    public void setSuspendDay(int suspendDay) {
        this.suspendDay = suspendDay;
    }

    public String getStartSuspend() {
        return startSuspend;
    }

    public void setStartSuspend(String startSuspend) {
        this.startSuspend = startSuspend;
    }

    public String getEndSuspend() {
        return endSuspend;
    }

    public void setEndSuspend(String endSuspend) {
        this.endSuspend = endSuspend;
    }

    @Override
	public String toString() {
		return "UserSuspend [userSuspendCode=" + userSuspendCode + ", suspendId=" + suspendId + ", approveId="
				+ approveId + ", suspendDay=" + suspendDay + ", startSuspend=" + startSuspend + ", endSuspend="
				+ endSuspend + ", suspendResult=" + suspendResult + ", suspendReason=" + suspendReason + "]";
	}
}
