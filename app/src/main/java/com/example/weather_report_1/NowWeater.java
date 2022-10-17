package com.example.weather_report_1;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class NowWeater {

    /**
     * code : 200
     * updateTime : 2022-10-06T16:27+08:00
     * fxLink : http://hfx.link/40c1
     * now : {"obsTime":"2022-10-06T16:14+08:00","temp":"10","feelsLike":"9","icon":"305","text":"小雨","wind360":"265","windDir":"西风","windScale":"1","windSpeed":"3","humidity":"90","precip":"0.0","pressure":"977","vis":"13","cloud":"100","dew":"7"}
     * refer : {"sources":["QWeather","NMC","ECMWF"],"license":["no commercial use"]}
     */

    @SerializedName("code")
    private String code;
    @SerializedName("updateTime")
    private String updateTime;
    @SerializedName("fxLink")
    private String fxLink;
    @SerializedName("now")
    private NowDTO now;
    @SerializedName("refer")
    private ReferDTO refer;

    public static NowWeater objectFromData(String str) {

        return new Gson().fromJson(str, NowWeater.class);
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

    public NowDTO getNow() {
        return now;
    }

    public void setNow(NowDTO now) {
        this.now = now;
    }

    public ReferDTO getRefer() {
        return refer;
    }

    public void setRefer(ReferDTO refer) {
        this.refer = refer;
    }
}
