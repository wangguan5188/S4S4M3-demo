package com.hello.www.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("baseDaoImpl")
public class BaseDaoImpl {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	protected int queryCount(String sql, Object[] params){
		System.out.println("[sql]" + sql);
		//return jdbcTemplate.queryForInt(sql, params);
		return jdbcTemplate.queryForObject(sql, params, Integer.class);
	}
	
	protected Map<String, Object> queryOneBySql(String sql, Object[] params){
		System.out.println("[sql]" + sql);
		return jdbcTemplate.queryForMap(sql, params);
	}
	
	protected List<Map<String, Object>> queryBySql(String sql, Object[] params){
		System.out.println("[sql]" + sql);
		return jdbcTemplate.queryForList(sql, params);
	}
	
}
