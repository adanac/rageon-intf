package com.adanac.tool.rageon.intf.file.dom4j;

/**污染情况详细。主要包括<br>
 *空气质量、主要污染物、臭氧、一氧化碳、PM10、二氧化硫、二氧化氮
 * */
public class Pollution {
	String quality, majorPollutants;
	int o3, co, pm10, so2, no2;

	public String getQuality() {
		return quality;
	};

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public String getMajorPollutants() {
		return majorPollutants;
	}

	public void setMajorPollutants(String majorPollutants) {
		this.majorPollutants = majorPollutants;
	}

	public int getO3() {
		return o3;
	}

	public void setO3(int o3) {
		this.o3 = o3;
	}

	public int getCO() {
		return co;
	}

	public void setCO(int co) {
		this.co = co;
	}

	public int getpm10() {
		return pm10;
	}

	public void setPM10(int pm10) {
		this.pm10 = pm10;
	}

	public int getSO2() {
		return so2;
	}

	public void setSO2(int so2) {
		this.so2 = so2;
	}

	public int getNO2() {
		return no2;
	}

	public void setNO2(int no2) {
		this.no2 = no2;
	}

}
