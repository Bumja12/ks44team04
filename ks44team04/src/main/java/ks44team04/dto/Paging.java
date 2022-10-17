package ks44team04.dto;

public class Paging {

    private int currentPage;
    private int contentsPerPage;
    private int indexSize;
    private String searchKey;
    private String searchValue;
    private Pagination pagination;

    public Paging() {
        this.currentPage = 1;
        this.contentsPerPage = 3;
        this.indexSize = 9;
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
        return "Paging{" +
                "currentPage=" + currentPage +
                ", contentsPerPage=" + contentsPerPage +
                ", indexSize=" + indexSize +
                ", searchKey='" + searchKey + '\'' +
                ", searchValue='" + searchValue + '\'' +
                ", pagination=" + pagination +
                '}';
    }
}
