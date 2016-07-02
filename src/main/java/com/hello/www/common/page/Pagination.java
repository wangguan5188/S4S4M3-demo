package com.hello.www.common.page;

import java.util.List;

public class Pagination<T> {

	private PageParam pageParam;
	private List<T> list;

	public Pagination() {
		super();
	}

	public Pagination(PageParam pageParam, List<T> list) {
		super();
		this.pageParam = pageParam;
		this.list = list;
	}

	public PageParam getPageParam() {
		return pageParam;
	}

	public void setPageParam(PageParam pageParam) {
		this.pageParam = pageParam;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

}
