package ks44team04.dto;

public class Pagination {

    private int totalContentsCount;
    private int totalPageCount;
    private int startNumber;
    private int startPage;
    private int endPage;

    public Pagination(Paging paging, int totalContentsCount) {

        if (totalContentsCount > 0) {
            this.totalPageCount = totalContentsCount;
            totalPageCount = (totalContentsCount / paging.getContentsPerPage()) + 1;
            this.calculation(paging);
        }
    }

    private void calculation(Paging paging) {

        startPage = paging.getCurrentPage() - (paging.getIndexSize() / 2);
        endPage = startPage + paging.getIndexSize() - 1;
        if (endPage < 9) endPage = 9;
        if (endPage > totalPageCount) {
            endPage = totalPageCount;
            startPage = totalPageCount - paging.getIndexSize() + 1;
        }
        if (startPage < 1) startPage = 1;

        startNumber = (paging.getCurrentPage() - 1) * paging.getContentsPerPage();
    }

    public int getTotalContentsCount() {
        return totalContentsCount;
    }

    public int getTotalPageCount() {
        return totalPageCount;
    }

    public int getStartNumber() {
        return startNumber;
    }

    public int getStartPage() {
        return startPage;
    }

    public int getEndPage() {
        return endPage;
    }

    @Override
    public String toString() {
        return "Pagination{" +
                "totalContentsCount=" + totalContentsCount +
                ", totalPageCount=" + totalPageCount +
                ", startNumber=" + startNumber +
                ", startPage=" + startPage +
                ", endPage=" + endPage +
                '}';
    }
}
