package com.adanac.tool.rageon.intf.file.dom4j;

public class ForecastWeather {
	String date;
	int highTemperature, lowTemperature;
	/**0:day<br>1:Night*/
	SimpleWeather simpleweather[];

	public ForecastWeather() {
		simpleweather = new SimpleWeather[2];
		simpleweather[0] = new SimpleWeather();
		simpleweather[1] = new SimpleWeather();
	}
}

class SimpleWeather {
	String type;
	String windForce, windDirection;
}
