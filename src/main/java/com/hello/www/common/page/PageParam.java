package com.hello.www.common.page;

public class PageParam {

	private int pageFirst = 0;// 开始页
	private int currentPage = 1; // 当前页
	private int numPerPage = 20; // 每页显示多少条
	private int totalCount = 0; // 总条数
	private int totalPage = 0; // 总页数
	private int pageNum = 1; // 当前页
	
	public PageParam() {
		super();
	}

	public PageParam(int currentPage, int numPerPage, int totalCount,
			int totalPage, int pageNum) {
		super();
		this.currentPage = currentPage;
		this.numPerPage = numPerPage;
		this.totalCount = totalCount;
		this.totalPage = totalPage;
		this.pageNum = pageNum;
	}

	public int getPageFirst() {
		return pageFirst;
	}

	public void setPageFirst(int pageFirst) {
		this.pageFirst = pageFirst;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getNumPerPage() {
		return numPerPage;
	}

	public void setNumPerPage(int numPerPage) {
		this.numPerPage = numPerPage;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
		this.currentPage = pageNum;
	}
	
}
