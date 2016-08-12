package com.adanac.tool.rageon.sfunc.intf;

import com.alibaba.fastjson.JSONObject;

public interface IdCardService {
	JSONObject queryByCardno(String cardno);

	JSONObject queryByNameAndCardno(String name, String cardno);

}
