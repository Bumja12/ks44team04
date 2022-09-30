package ks44team04.dto;

public class SellerLevelStatus {

	private String levelStatusCode;
	private String sellerId;
	private String levelCode;
	private String levelChangeDate;
	private int totalSellerPrice;
	private int totalSellerSale;
	private int starRatingAvg;

	public String getLevelStatusCode() {
		return levelStatusCode;
	}

	public void setLevelStatusCode(String levelStatusCode) {
		this.levelStatusCode = levelStatusCode;
	}

	public String getSellerId() {
		return sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getLevelCode() {
		return levelCode;
	}

	public void setLevelCode(String levelCode) {
		this.levelCode = levelCode;
	}

	public String getLevelChangeDate() {
		return levelChangeDate;
	}

	public void setLevelChangeDate(String levelChangeDate) {
		this.levelChangeDate = levelChangeDate;
	}

	public int getTotalSellerPrice() {
		return totalSellerPrice;
	}

	public void setTotalSellerPrice(int totalSellerPrice) {
		this.totalSellerPrice = totalSellerPrice;
	}

	public int getTotalSellerSale() {
		return totalSellerSale;
	}

	public void setTotalSellerSale(int totalSellerSale) {
		this.totalSellerSale = totalSellerSale;
	}

	public int getStarRatingAvg() {
		return starRatingAvg;
	}

	public void setStarRatingAvg(int starRatingAvg) {
		this.starRatingAvg = starRatingAvg;
	}

	@Override
	public String toString() {
		return "SellerLevelStatus{" + "levelStatusCode='" + levelStatusCode + '\'' + ", sellerId='" + sellerId + '\''
				+ ", levelCode='" + levelCode + '\'' + ", levelChangeDate='" + levelChangeDate + '\''
				+ ", totalSellerPrice=" + totalSellerPrice + ", totalSellerSale=" + totalSellerSale + ", starRatingAvg="
				+ starRatingAvg + '}';
	}
}
