package com.adanac.tool.rageon.intf.ip.service;

import java.util.Map;

public interface WeatherService {
	Map<String, String> qrWeather(String city, String day);
}
