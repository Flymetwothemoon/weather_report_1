package com.example.weather_report_1;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class DailyDTO {
    /**
     * fxDate : 2022-10-06
     * sunrise : 06:42
     * sunset : 18:23
     * moonrise : 16:39
     * moonset : 03:32
     * moonPhase : 盈凸月
     * moonPhaseIcon : 803
     * tempMax : 12
     * tempMin : 8
     * iconDay : 305
     * textDay : 小雨
     * iconNight : 104
     * textNight : 阴
     * wind360Day : 180
     * windDirDay : 南风
     * windScaleDay : 1-2
     * windSpeedDay : 3
     * wind360Night : 45
     * windDirNight : 东北风
     * windScaleNight : 1-2
     * windSpeedNight : 3
     * humidity : 85
     * precip : 1.0
     * pressure : 973
     * vis : 24
     * cloud : 55
     * uvIndex : 1
     */

    @SerializedName("fxDate")
    private String fxDate;
    @SerializedName("sunrise")
    private String sunrise;
    @SerializedName("sunset")
    private String sunset;
    @SerializedName("moonrise")
    private String moonrise;
    @SerializedName("moonset")
    private String moonset;
    @SerializedName("moonPhase")
    private String moonPhase;
    @SerializedName("moonPhaseIcon")
    private String moonPhaseIcon;
    @SerializedName("tempMax")
    private String tempMax;
    @SerializedName("tempMin")
    private String tempMin;
    @SerializedName("iconDay")
    private String iconDay;
    @SerializedName("textDay")
    private String textDay;
    @SerializedName("iconNight")
    private String iconNight;
    @SerializedName("textNight")
    private String textNight;
    @SerializedName("wind360Day")
    private String wind360Day;
    @SerializedName("windDirDay")
    private String windDirDay;
    @SerializedName("windScaleDay")
    private String windScaleDay;
    @SerializedName("windSpeedDay")
    private String windSpeedDay;
    @SerializedName("wind360Night")
    private String wind360Night;
    @SerializedName("windDirNight")
    private String windDirNight;
    @SerializedName("windScaleNight")
    private String windScaleNight;
    @SerializedName("windSpeedNight")
    private String windSpeedNight;
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
    @SerializedName("uvIndex")
    private String uvIndex;

    public static DailyDTO objectFromData(String str) {

        return new Gson().fromJson(str, DailyDTO.class);
    }

    public String getFxDate() {
        return fxDate;
    }

    public void setFxDate(String fxDate) {
        this.fxDate = fxDate;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public String getMoonrise() {
        return moonrise;
    }

    public void setMoonrise(String moonrise) {
        this.moonrise = moonrise;
    }

    public String getMoonset() {
        return moonset;
    }

    public void setMoonset(String moonset) {
        this.moonset = moonset;
    }

    public String getMoonPhase() {
        return moonPhase;
    }

    public void setMoonPhase(String moonPhase) {
        this.moonPhase = moonPhase;
    }

    public String getMoonPhaseIcon() {
        return moonPhaseIcon;
    }

    public void setMoonPhaseIcon(String moonPhaseIcon) {
        this.moonPhaseIcon = moonPhaseIcon;
    }

    public String getTempMax() {
        return tempMax;
    }

    public void setTempMax(String tempMax) {
        this.tempMax = tempMax;
    }

    public String getTempMin() {
        return tempMin;
    }

    public void setTempMin(String tempMin) {
        this.tempMin = tempMin;
    }

    public String getIconDay() {
        return iconDay;
    }

    public void setIconDay(String iconDay) {
        this.iconDay = iconDay;
    }

    public String getTextDay() {
        return textDay;
    }

    public void setTextDay(String textDay) {
        this.textDay = textDay;
    }

    public String getIconNight() {
        return iconNight;
    }

    public void setIconNight(String iconNight) {
        this.iconNight = iconNight;
    }

    public String getTextNight() {
        return textNight;
    }

    public void setTextNight(String textNight) {
        this.textNight = textNight;
    }

    public String getWind360Day() {
        return wind360Day;
    }

    public void setWind360Day(String wind360Day) {
        this.wind360Day = wind360Day;
    }

    public String getWindDirDay() {
        return windDirDay;
    }

    public void setWindDirDay(String windDirDay) {
        this.windDirDay = windDirDay;
    }

    public String getWindScaleDay() {
        return windScaleDay;
    }

    public void setWindScaleDay(String windScaleDay) {
        this.windScaleDay = windScaleDay;
    }

    public String getWindSpeedDay() {
        return windSpeedDay;
    }

    public void setWindSpeedDay(String windSpeedDay) {
        this.windSpeedDay = windSpeedDay;
    }

    public String getWind360Night() {
        return wind360Night;
    }

    public void setWind360Night(String wind360Night) {
        this.wind360Night = wind360Night;
    }

    public String getWindDirNight() {
        return windDirNight;
    }

    public void setWindDirNight(String windDirNight) {
        this.windDirNight = windDirNight;
    }

    public String getWindScaleNight() {
        return windScaleNight;
    }

    public void setWindScaleNight(String windScaleNight) {
        this.windScaleNight = windScaleNight;
    }

    public String getWindSpeedNight() {
        return windSpeedNight;
    }

    public void setWindSpeedNight(String windSpeedNight) {
        this.windSpeedNight = windSpeedNight;
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

    public String getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(String uvIndex) {
        this.uvIndex = uvIndex;
    }
}
