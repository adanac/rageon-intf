package com.adanac.tool.rageon.intf.sfunc;

import com.alibaba.fastjson.JSONObject;

public interface IdCard {
	JSONObject queryByCardno(String cardno);

	JSONObject queryByNameAndCardno(String name, String cardno);

}
