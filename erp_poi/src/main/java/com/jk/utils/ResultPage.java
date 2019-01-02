package com.jk.utils;

import java.io.Serializable;
import java.util.List;

public class ResultPage implements Serializable {

	private static final long serialVersionUID = -4001170869153477938L;
	private Integer total;
	
	private List<?> rows;

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<?> getRows() {
		return rows;
	}

	public void setRows(List<?> rows) {
		this.rows = rows;
	}

	public ResultPage(Integer total, List<?> rows) {
		super();
		this.total = total;
		this.rows = rows;
	}

	public ResultPage() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ResultPage [total=" + total + ", rows=" + rows + "]";
	}
	
}
