package com.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.hello.www.dao.UserDao;
import com.util.MybatisUtil;

public class test1 {
	
	/**
	 * 测试带条件的查询
	 */
	@Test
	public void test() {
		SqlSession session = MybatisUtil.getSqlSession();
		System.out.println(session);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("username", "admin");
		map.put("password", "123456");
		//map.put("password", "74AEBE10C6455194CD0D1E6E8E02FFFE");
		List<Map<String, Object>> list = session.getMapper(UserDao.class).queryByCondition(map);
		if(list!=null && list.size()>0) {
			for(Map<String, Object> user : list) {
				System.out.println(user.get("username") + "---" + user.get("password"));
			}
		}else {
			System.out.println("................");
		}
		session.close();
	}

}
