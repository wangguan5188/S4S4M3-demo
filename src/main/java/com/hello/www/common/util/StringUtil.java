package com.hello.www.common.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Map.Entry;

public class StringUtil {

	public static boolean isBlank(String s) {
		if (s == null || s.trim().equals("")) {
			return true;
		} else {
			return false;
		}
	}

	public static String loop(String s, int count, String split) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < count; i++) {
			sb.append(s);
			int last_index = count - 1;
			if (i < last_index) {
				sb.append(split);
			}
		}
		return sb.toString();
	}

	public static String listToString(List<String> list, String split) {
		StringBuffer sb = new StringBuffer();
		if (list != null) {
			int size = list.size();
			for (int i = 0; i < size; i++) {
				String s = list.get(i);
				sb.append(s);
				int last_index = size - 1;
				if (i < last_index) {
					sb.append(split);
				}
			}
		}
		return sb.toString();
	}

	public static List<String> stringToList(String s, String split) {
		if (s == null || s.trim().equals("")) {
			return new ArrayList<String>();
		} else {

			String[] arr = s.split(split);
			List<String> list = Arrays.asList(arr);
			return list;
		}
	}

	public static List<Integer> stringToIntList(String s, String split) {
		if (s == null || s.trim().equals("")) {
			return new ArrayList<Integer>();
		} else {

			String[] arr = s.split(split);
			List<Integer> list = new ArrayList<Integer>();
			for (String str : arr) {
				int t = toInt(str);
				list.add(t);
			}
			return list;
		}
	}

	public static String toString(Object obj) {
		if (obj != null && !obj.toString().trim().equals("")) {
			return obj.toString();
		} else {
			return "";
		}
	}

	public static String toString(Object obj, String init) {
		if (obj != null && !obj.toString().trim().equals("")) {
			return obj.toString();
		} else {
			return init;
		}
	}

	public static int toInt(Object obj) {
		if (obj == null) {
			return 0;
		}
		String s = obj.toString();
		if (s != null && !s.trim().equals("")) {
			if (s.matches("\\d+")) {
				return Integer.parseInt(s);
			}
		}
		return 0;
	}

	public static int toInt(Object obj, int i) {
		if (obj == null) {
			return i;
		}
		String s = obj.toString();
		if (s != null && !s.trim().equals("")) {
			if (s.matches("-?\\d+")) {
				return Integer.parseInt(s);
			}
		}
		return i;
	}

	public static long toLong(Object obj, long i) {
		if (obj == null) {
			return i;
		}
		String s = obj.toString();
		if (s != null && !s.trim().equals("")) {
			if (s.matches("\\d+")) {
				return Long.parseLong(s);
			}
		}
		return i;
	}

	public static float toFloat(Object obj) {
		if (obj == null) {
			return 0.0f;
		}
		String s = obj.toString();
		if (s != null && !s.trim().equals("")) {
			if (s.matches("\\d+(\\.\\d+)?")) {
				return Float.parseFloat(s);
			}
		}
		return 0.0f;
	}

	/**
	 * 
	 * @param list
	 * @param word
	 * @param show_count
	 * @return
	 */
	public static List<String> like(List<String> list, String word, int show_count) {
		List<String> result = new ArrayList<String>();
		for (String s : list) {
			if (result.size() > (show_count - 1)) {
				break;
			}
			if (s.indexOf(word) > -1) {
				result.add(s);
			}
		}
		return result;
	}

	public static Map<String, String> likePair(Map<String, String> map, String word, int show_count) {
		Map<String, String> result = new HashMap<String, String>();

		for (Entry<String, String> entry : map.entrySet()) {
			String k = entry.getKey();
			String v = entry.getValue();
			if (result.size() > (show_count - 1)) {
				break;
			}
			if (v.indexOf(word) > -1) {
				result.put(k, v);
			}
		}
		//		Set<String> keys = map.keySet();
		//		for (String s : keys) {
		//			if (result.size()>(show_count-1)) {
		//				break;
		//			}
		//			if (s.indexOf(word)>-1) {
		//				String id = map.get(s);
		//				result.put(s, id);
		//			}
		//		}
		return result;
	}

	/**
	 * String类型数据转换成队列
	 * @Date: 2014-1-10上午09:54:36
	 * @Author hualei
	 * @Description: List<String>
	 * @param s String数据
	 * @param split 分隔符
	 * @return
	 */
	public static List<String> StringtoList(String s, String split) {
		List<String> list = new ArrayList<String>();
		StringTokenizer tokenizer = new StringTokenizer(s, split);
		while (tokenizer.hasMoreElements()) {
			String str = (String) tokenizer.nextElement();
			list.add(str);
		}

		return list;
	}

	/**
	 * String类型数据转换成数组	
	 * @Date: 2014-1-10上午09:54:36
	 * @Author liujh
	 * @Description: String[]
	 * @param s String数据
	 * @param split 分隔符
	 * @return
	 */
	public static String[] toStringArray(String s, String split) {
		String[] sArray = new String[] {};
		if (!isBlank(s))
			sArray = s.split(split);
		return sArray;
	}

	/**
	 * 倒序排列
	 * @param list
	 * @return
	 */
	public static List<Map<String, Object>> sortDesc(List<Map<String, Object>> list) {
		List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
		if (list != null && list.size() > 0) {
			for (int i = list.size() - 1; i > -1; i--) {
				result.add(list.get(i));
			}
		}
		return result;
	}

	public static void main(String[] args) {

		//		List<String> t = new ArrayList<String>();
		//		t.add("1");
		//		t.add("2");
		//		t.add("4");
		//		t.add("5");
		//		System.out.println(listToString(t, ","));
		//		
		//		System.out.println(loop("?", 3, ","));

		List<Integer> t = stringToIntList("", ",");
		System.out.println(t.toString());
	}

	public static Timestamp stringToTimestamp(String dateStr) {
		if(StringUtil.isBlank(dateStr))
			return null;

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		try {
			Date date = sdf.parse(dateStr);
			date.getTime();
			cal.setTime(date);
			return new Timestamp(cal.getTimeInMillis());
		} catch (Exception e) {
			e.printStackTrace();
		}

		cal.setTime(new Date());
		return new Timestamp(cal.getTimeInMillis());
	}
}
