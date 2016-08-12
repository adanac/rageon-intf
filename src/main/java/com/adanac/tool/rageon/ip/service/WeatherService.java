package com.adanac.tool.rageon.ip.service;

import java.util.Map;

public interface WeatherService {
	Map<String, String> qrWeather(String city, String day);
}
