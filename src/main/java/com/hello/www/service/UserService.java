package com.hello.www.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hello.www.dao.UserDao;

/**
 * @author zhangtb
 * @date 2015年5月28日13:26:50
 */
@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	/**
	 * 根据用户名和密码查询
	 * @param username
	 * @param password
	 * @return
	 */
	public Map<String, Object> queryUser(String username, String password) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("username", username);
		map.put("password", password);
		List<Map<String, Object>> list = userDao.queryByCondition(map);
		if(list!=null && list.size()>0) {
			return list.get(0);
		}
		return null;
	}
	
	public List<Map<String, Object>> queryAll() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("pageFirst", 0);
		map.put("pageSize", 10);
		return userDao.queryPage(map);
	}
	
}
