package com.hello.www.common.page;

public class PageUtil {

	public static PageParam get(int currentPage, int numPerPage) {
		if (currentPage < 1)
			currentPage = 1;
		PageParam p = new PageParam();
		int pageFirst = (currentPage - 1) * numPerPage;
		p.setPageFirst(pageFirst);
		p.setCurrentPage(currentPage);
		p.setNumPerPage(numPerPage);
		return p;
	}

	public static PageParam get(int currentPage, int numPerPage, int totalCount) {
		int pageFirst = (currentPage - 1) * numPerPage;
		int totalPage = (totalCount - 1) / numPerPage + 1;
		PageParam p = new PageParam();
		p.setPageFirst(pageFirst);
		p.setCurrentPage(currentPage);
		p.setNumPerPage(numPerPage);
		p.setTotalCount(totalCount);
		p.setTotalPage(totalPage);
		p.setPageNum(currentPage);
		return p;
	}

}
