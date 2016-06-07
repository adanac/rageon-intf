package com.adanac.tool.rageon.intf.file.dom4j;

/**天气格式 */
public class WeatherInfo {

	private String city, windForce, windDirection, suggest, updateTime, quality;
	// 温度，湿度
	private int temperature, humidity, pm2_5, qualityNum;
	private ForecastWeather foreweathers[];
	private Pollution pollution;
	private Zhishu zhishus[];
	private String week, date;

	public WeatherInfo() {
		foreweathers = new ForecastWeather[7];
		for (int i = 0; i < foreweathers.length; i++) {
			foreweathers[i] = new ForecastWeather();
		}
		pollution = new Pollution();
		zhishus = new Zhishu[11];
		for (int i = 0; i < zhishus.length; i++)
			zhishus[i] = new Zhishu();
	}

	public void setWeek(String week) {
		this.week = week;
	}

	public String getWeek() {
		return week;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDate() {
		return date;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getWindForce() {
		return windForce;
	}

	public void setWindForce(String windForce) {
		this.windForce = windForce;
	}

	public String getWindDirection() {
		return windDirection;
	}

	public void setWindDirection(String windDirection) {
		this.windDirection = windDirection;
	}

	public String getSuggest() {
		return suggest;
	}

	public void setSuggest(String suggest) {
		this.suggest = suggest;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public int getPM2_5() {
		return pm2_5;
	}

	public void setPM2_5(int pm2_5) {
		this.pm2_5 = pm2_5;
	}

	public void setQualityNum(int qualityNum) {
		this.qualityNum = qualityNum;
	};

	public int getQualityNum() {
		return qualityNum;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	};

	public String getQuality() {
		return quality;
	}

	// 今日的序号作为0，接下来第aftertody天的最高温度
	public int getForecastHigh(int aftertoday) {
		return foreweathers[aftertoday].highTemperature;
	}

	public void setForecastHign(int aftertoday, int high) {
		foreweathers[aftertoday].highTemperature = high;
	}

	// 今日的序号作为0，接下来第aftertody天的最低温度
	public int getForecastLow(int aftertoday) {
		return foreweathers[aftertoday].lowTemperature;
	}

	public void setForecastLow(int aftertoday, int low) {
		foreweathers[aftertoday].lowTemperature = low;
	}

	// 第aftertody的日期：*月*日
	public String getForecastDate(int aftertoday) {
		return foreweathers[aftertoday].date;
	}

	public void setForecastDate(int aftertoday, String date) {
		foreweathers[aftertoday].date = date;
	}

	/**forcast中weather中day和night的部分*/
	public String getForecastWindForce(int aftertoday, int isNight) {
		return foreweathers[aftertoday].simpleweather[isNight].windForce;
	}

	public void setForecastWindForce(int aftertoday, String windforce, int isNight) {
		foreweathers[aftertoday].simpleweather[isNight].windForce = windforce;
	}

	public String getForecastWindDirection(int aftertoday, int isNight) {
		return foreweathers[aftertoday].simpleweather[isNight].windDirection;
	}

	public void setForecastWindDirection(int aftertoday, String windDirection, int isNight) {
		foreweathers[aftertoday].simpleweather[isNight].windDirection = windDirection;
	}

	public String getForecasttype(int aftertoday, int isNight) {
		return foreweathers[aftertoday].simpleweather[isNight].type;
	}

	public void setForecasttype(int aftertoday, String type, int isNight) {
		foreweathers[aftertoday].simpleweather[isNight].type = type;
	}

	public Pollution getPollution() {
		return pollution;
	}

	public void setPollution(Pollution pollution) {
		this.pollution = pollution;
	}

	public Zhishu getZhishus(int i) {
		return zhishus[i];
	}

	public void setZhishus(int i, Zhishu zhishu) {
		this.zhishus[i] = zhishu;
	}
}