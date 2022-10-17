package com.example.weather_report_1;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class NowDTO {
    /**
     * obsTime : 2022-10-06T16:14+08:00
     * temp : 10
     * feelsLike : 9
     * icon : 305
     * text : 小雨
     * wind360 : 265
     * windDir : 西风
     * windScale : 1
     * windSpeed : 3
     * humidity : 90
     * precip : 0.0
     * pressure : 977
     * vis : 13
     * cloud : 100
     * dew : 7
     */

    @SerializedName("obsTime")
    private String obsTime;
    @SerializedName("temp")
    private String temp;
    @SerializedName("feelsLike")
    private String feelsLike;
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
    @SerializedName("precip")
    private String precip;
    @SerializedName("pressure")
    private String pressure;
    @SerializedName("vis")
    private String vis;
    @SerializedName("cloud")
    private String cloud;
    @SerializedName("dew")
    private String dew;

    public static NowDTO objectFromData(String str) {

        return new Gson().fromJson(str, NowDTO.class);
    }

    public String getObsTime() {
        return obsTime;
    }

    public void setObsTime(String obsTime) {
        this.obsTime = obsTime;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(String feelsLike) {
        this.feelsLike = feelsLike;
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

    public String getVis() {
        return vis;
    }

    public void setVis(String vis) {
        this.vis = vis;
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
