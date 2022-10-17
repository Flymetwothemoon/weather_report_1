package com.example.weather_report_1;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class HourlyDTO {
    /**
     * fxTime : 2022-10-07T18:00+08:00
     * temp : 12
     * icon : 101
     * text : 多云
     * wind360 : 15
     * windDir : 东北风
     * windScale : 1-2
     * windSpeed : 7
     * humidity : 76
     * pop : 7
     * precip : 0.0
     * pressure : 970
     * cloud : 99
     * dew : 8
     */

    @SerializedName("fxTime")
    private String fxTime;
    @SerializedName("temp")
    private String temp;
    @SerializedName("icon")
    private String icon;
    @SerializedName("text")
    private String text;
    @SerializedName("wind360")
    private String wind360;
    @SerializedName("windDir")
    private String windDir;
    @SerializedName("windScale")
    private String windScale;
    @SerializedName("windSpeed")
    private String windSpeed;
    @SerializedName("humidity")
    private String humidity;
    @SerializedName("pop")
    private String pop;
    @SerializedName("precip")
    private String precip;
    @SerializedName("pressure")
    private String pressure;
    @SerializedName("cloud")
    private String cloud;
    @SerializedName("dew")
    private String dew;

    public static HourlyDTO objectFromData(String str) {

        return new Gson().fromJson(str, HourlyDTO.class);
    }

    public String getFxTime() {
        return fxTime;
    }

    public void setFxTime(String fxTime) {
        this.fxTime = fxTime;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getWind360() {
        return wind360;
    }

    public void setWind360(String wind360) {
        this.wind360 = wind360;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public String getWindScale() {
        return windScale;
    }

    public void setWindScale(String windScale) {
        this.windScale = windScale;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getPop() {
        return pop;
    }

    public void setPop(String pop) {
        this.pop = pop;
    }

    public String getPrecip() {
        return precip;
    }

    public void setPrecip(String precip) {
        this.precip = precip;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getCloud() {
        return cloud;
    }

    public void setCloud(String cloud) {
        this.cloud = cloud;
    }

    public String getDew() {
        return dew;
    }

    public void setDew(String dew) {
        this.dew = dew;
    }
}
