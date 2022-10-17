package com.example.weather_report_1;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {

    /**
     * code : 200
     * updateTime : 2022-10-06T15:35+08:00
     * fxLink : http://hfx.link/40c1
     * daily : [{"fxDate":"2022-10-06","sunrise":"06:42","sunset":"18:23","moonrise":"16:39","moonset":"03:32","moonPhase":"盈凸月","moonPhaseIcon":"803","tempMax":"12","tempMin":"8","iconDay":"305","textDay":"小雨","iconNight":"104","textNight":"阴","wind360Day":"180","windDirDay":"南风","windScaleDay":"1-2","windSpeedDay":"3","wind360Night":"45","windDirNight":"东北风","windScaleNight":"1-2","windSpeedNight":"3","humidity":"85","precip":"1.0","pressure":"973","vis":"24","cloud":"55","uvIndex":"1"},{"fxDate":"2022-10-07","sunrise":"06:43","sunset":"18:21","moonrise":"17:13","moonset":"04:40","moonPhase":"盈凸月","moonPhaseIcon":"803","tempMax":"17","tempMin":"9","iconDay":"104","textDay":"阴","iconNight":"501","textNight":"雾","wind360Day":"225","windDirDay":"西南风","windScaleDay":"1-2","windSpeedDay":"3","wind360Night":"180","windDirNight":"南风","windScaleNight":"1-2","windSpeedNight":"3","humidity":"78","precip":"0.0","pressure":"970","vis":"25","cloud":"25","uvIndex":"2"},{"fxDate":"2022-10-08","sunrise":"06:43","sunset":"18:20","moonrise":"17:43","moonset":"05:47","moonPhase":"盈凸月","moonPhaseIcon":"803","tempMax":"15","tempMin":"10","iconDay":"305","textDay":"小雨","iconNight":"151","textNight":"多云","wind360Day":"225","windDirDay":"西南风","windScaleDay":"1-2","windSpeedDay":"3","wind360Night":"315","windDirNight":"西北风","windScaleNight":"3-4","windSpeedNight":"16","humidity":"43","precip":"1.0","pressure":"980","vis":"25","cloud":"55","uvIndex":"4"}]
     * refer : {"sources":["QWeather","NMC","ECMWF"],"license":["no commercial use"]}
     */

    @SerializedName("code")
    private String code;
    @SerializedName("updateTime")
    private String updateTime;
    @SerializedName("fxLink")
    private String fxLink;
    @SerializedName("refer")
    private ReferDTO refer;
    @SerializedName("daily")
    private List<DailyDTO> daily;

    public static Weather objectFromData(String str) {

        return new Gson().fromJson(str, Weather.class);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getFxLink() {
        return fxLink;
    }

    public void setFxLink(String fxLink) {
        this.fxLink = fxLink;
    }

    public ReferDTO getRefer() {
        return refer;
    }

    public void setRefer(ReferDTO refer) {
        this.refer = refer;
    }

    public List<DailyDTO> getDaily() {
        return daily;
    }

    public void setDaily(List<DailyDTO> daily) {
        this.daily = daily;
    }
}
