package ks44team04.dto;

import java.util.Arrays;

public class Search {
	
	private String 		searchKey;
	private String 		searchValue;
	private String[] 	indivChecks;
	private String 		userStatus;
	private String 		fromDate;
	private String 		toDate;
	
	public String getSearchKey() {
		return searchKey;
	}
	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}
	public String getSearchValue() {
		return searchValue;
	}
	public void setSearchValue(String searchValue) {
		this.searchValue = searchValue;
	}
	public String[] getIndivChecks() {
		return indivChecks;
	}
	public void setIndivChecks(String[] indivChecks) {
		this.indivChecks = indivChecks;
	}
	public String getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	@Override
	public String toString() {
		return "Search [searchKey=" + searchKey + ", searchValue=" + searchValue + ", indivChecks="
				+ Arrays.toString(indivChecks) + ", userStatus=" + userStatus + ", fromDate=" + fromDate + ", toDate="
				+ toDate + "]";
	}
	
	
	
}
