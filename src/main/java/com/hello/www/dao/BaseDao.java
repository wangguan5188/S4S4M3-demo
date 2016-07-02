package com.hello.www.dao;

import java.util.List;
import java.util.Map;

public interface BaseDao {
	
	public int add(Object obj);
	
	public int addForMap(Map<String, Object> map);
	
	public int insertAndReturnId(Object obj);
	
	public int insertAndGetId(Map<String, Object> map); 
	
	public int delete(int id);
	
	public int update(Object obj);
	
	public int updateForMap(Map<String, Object> map);
	
	public Object findForObject(Object obj);
	
	public Map<String, Object> queryForMap(Map<String, Object> map);
	
	public List<Object> findByCondition(Object obj);
	
	public List<Map<String, Object>> queryByCondition(Map<String, Object> map);
	
	public List<Object> findAll();
	
	public List<Map<String, Object>> queryAll();
	
	public int selectTotalCount();
	
	public int find(Object obj);
	
	public int query(Map<String, Object> map);
	
	public List<Object> findPage(Object obj);
	
	public List<Map<String, Object>> queryPage(Map<String, Object> map);

}
