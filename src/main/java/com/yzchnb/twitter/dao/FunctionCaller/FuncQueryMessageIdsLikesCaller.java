package com.yzchnb.twitter.dao.FunctionCaller;

import com.yzchnb.twitter.dao.FunctionCaller.BaseCaller.FuncBaseCaller;
import com.yzchnb.twitter.dao.FunctionMapper.FuncQueryMessageIdsLikesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Repository
public class FuncQueryMessageIdsLikesCaller extends FuncBaseCaller {
	@Autowired
	private FuncQueryMessageIdsLikesMapper funcQueryMessageIdsLikesMapper;

	public java.util.ArrayList call(java.lang.Integer userId, java.lang.Integer startfrom, java.lang.Integer limitation){
		Map map = new HashMap();
		map.put("userId", userId);
		map.put("startfrom", startfrom);
		map.put("limitation", limitation);
		return resolveArrayList(funcQueryMessageIdsLikesMapper, map);
	}
}
