package ks44team04.dto;

public class SellerTotal {

	private String sellerTotal;
	private String sellerId;
	private int totalSellerPrice;
	private int totalSellerNumber;
	private int reviewAverageScore;
	private String totalDate;

	public String getSellerTotal() {
		return sellerTotal;
	}

	public void setSellerTotal(String sellerTotal) {
		this.sellerTotal = sellerTotal;
	}

	public String getSellerId() {
		return sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public int getTotalSellerPrice() {
		return totalSellerPrice;
	}

	public void setTotalSellerPrice(int totalSellerPrice) {
		this.totalSellerPrice = totalSellerPrice;
	}

	public int getTotalSellerNumber() {
		return totalSellerNumber;
	}

	public void setTotalSellerNumber(int totalSellerNumber) {
		this.totalSellerNumber = totalSellerNumber;
	}

	public int getReviewAverageScore() {
		return reviewAverageScore;
	}

	public void setReviewAverageScore(int reviewAverageScore) {
		this.reviewAverageScore = reviewAverageScore;
	}

	public String getTotalDate() {
		return totalDate;
	}

	public void setTotalDate(String totalDate) {
		this.totalDate = totalDate;
	}

	@Override
	public String toString() {
		return "SellerTotal{" + "sellerTotal='" + sellerTotal + '\'' + ", sellerId='" + sellerId + '\''
				+ ", totalSellerPrice=" + totalSellerPrice + ", totalSellerNumber=" + totalSellerNumber
				+ ", reviewAverageScore=" + reviewAverageScore + ", totalDate='" + totalDate + '\'' + '}';
	}
}
