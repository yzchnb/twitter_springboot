package com.yzchnb.twitter.dao.FunctionCaller;

import com.yzchnb.twitter.dao.FunctionCaller.BaseCaller.FuncBaseCaller;
import com.yzchnb.twitter.dao.FunctionMapper.FuncQueryFollowersListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Repository
public class FuncQueryFollowersListCaller extends FuncBaseCaller {
	@Autowired
	private FuncQueryFollowersListMapper funcQueryFollowersListMapper;

	public java.util.ArrayList call(java.lang.Integer myUserId, java.lang.Integer startfrom, java.lang.Integer limitation){
		Map map = new HashMap();
		map.put("myUserId", myUserId);
		map.put("startfrom", startfrom);
		map.put("limitation", limitation);
		return resolveArrayList(funcQueryFollowersListMapper, map);
	}
}
