package ks44team04.dto;

public class Paging {

    private int currentPage;	// 현재 페이지
    private int contentsPerPage; // 페이지 당 보여줄 
    private int indexSize;           // 페이지 버튼 수
    private String searchKey;  // select option value="user_id"
    private String searchValue;
    private String condition;
    private Pagination pagination;

    public Paging() {
        this.currentPage = 1;
        this.contentsPerPage = 10;
        this.indexSize = 6;
    }
    
    

    public String getCondition() {
		return condition;
	}



	public void setCondition(String condition) {
		this.condition = condition;
	}



	public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getContentsPerPage() {
        return contentsPerPage;
    }

    public void setContentsPerPage(int contentsPerPage) {
        this.contentsPerPage = contentsPerPage;
    }

    public int getIndexSize() {
        return indexSize;
    }

    public void setIndexSize(int indexSize) {
        this.indexSize = indexSize;
    }

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

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }



	@Override
	public String toString() {
		return "Paging [currentPage=" + currentPage + ", contentsPerPage=" + contentsPerPage + ", indexSize="
				+ indexSize + ", searchKey=" + searchKey + ", searchValue=" + searchValue + ", condition=" + condition
				+ ", pagination=" + pagination + "]";
	}

    
}
