package com.example.weather_report_1;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class hourtime {

    /**
     * code : 200
     * updateTime : 2022-10-07T16:35+08:00
     * fxLink : http://hfx.link/40c1
     * hourly : [{"fxTime":"2022-10-07T18:00+08:00","temp":"12","icon":"101","text":"多云","wind360":"15","windDir":"东北风","windScale":"1-2","windSpeed":"7","humidity":"76","pop":"7","precip":"0.0","pressure":"970","cloud":"99","dew":"8"},{"fxTime":"2022-10-07T19:00+08:00","temp":"11","icon":"151","text":"多云","wind360":"174","windDir":"南风","windScale":"1-2","windSpeed":"9","humidity":"81","pop":"7","precip":"0.0","pressure":"970","cloud":"99","dew":"8"},{"fxTime":"2022-10-07T20:00+08:00","temp":"11","icon":"151","text":"多云","wind360":"171","windDir":"南风","windScale":"1-2","windSpeed":"9","humidity":"83","pop":"7","precip":"0.0","pressure":"970","cloud":"98","dew":"8"},{"fxTime":"2022-10-07T21:00+08:00","temp":"10","icon":"151","text":"多云","wind360":"178","windDir":"南风","windScale":"1-2","windSpeed":"7","humidity":"82","pop":"7","precip":"0.0","pressure":"970","cloud":"97","dew":"7"},{"fxTime":"2022-10-07T22:00+08:00","temp":"10","icon":"151","text":"多云","wind360":"190","windDir":"南风","windScale":"1-2","windSpeed":"7","humidity":"80","pop":"7","precip":"0.0","pressure":"970","cloud":"95","dew":"7"},{"fxTime":"2022-10-07T23:00+08:00","temp":"9","icon":"151","text":"多云","wind360":"199","windDir":"西南风","windScale":"1-2","windSpeed":"7","humidity":"78","pop":"7","precip":"0.0","pressure":"970","cloud":"93","dew":"6"},{"fxTime":"2022-10-08T00:00+08:00","temp":"9","icon":"151","text":"多云","wind360":"200","windDir":"西南风","windScale":"1-2","windSpeed":"7","humidity":"77","pop":"7","precip":"0.0","pressure":"971","cloud":"96","dew":"5"},{"fxTime":"2022-10-08T01:00+08:00","temp":"9","icon":"151","text":"多云","wind360":"199","windDir":"西南风","windScale":"1-2","windSpeed":"7","humidity":"79","pop":"7","precip":"0.0","pressure":"971","cloud":"98","dew":"5"},{"fxTime":"2022-10-08T02:00+08:00","temp":"10","icon":"151","text":"多云","wind360":"198","windDir":"西南风","windScale":"1-2","windSpeed":"7","humidity":"77","pop":"7","precip":"0.0","pressure":"973","cloud":"100","dew":"6"},{"fxTime":"2022-10-08T03:00+08:00","temp":"10","icon":"151","text":"多云","wind360":"202","windDir":"西南风","windScale":"1-2","windSpeed":"5","humidity":"79","pop":"7","precip":"0.0","pressure":"973","cloud":"100","dew":"6"},{"fxTime":"2022-10-08T04:00+08:00","temp":"10","icon":"151","text":"多云","wind360":"214","windDir":"西南风","windScale":"1-2","windSpeed":"5","humidity":"82","pop":"7","precip":"0.0","pressure":"973","cloud":"100","dew":"7"},{"fxTime":"2022-10-08T05:00+08:00","temp":"10","icon":"151","text":"多云","wind360":"242","windDir":"西南风","windScale":"1-2","windSpeed":"5","humidity":"86","pop":"7","precip":"0.0","pressure":"973","cloud":"100","dew":"8"},{"fxTime":"2022-10-08T06:00+08:00","temp":"10","icon":"151","text":"多云","wind360":"282","windDir":"西北风","windScale":"1-2","windSpeed":"3","humidity":"90","pop":"7","precip":"0.0","pressure":"973","cloud":"100","dew":"8"},{"fxTime":"2022-10-08T07:00+08:00","temp":"10","icon":"101","text":"多云","wind360":"266","windDir":"西风","windScale":"1-2","windSpeed":"7","humidity":"93","pop":"7","precip":"0.0","pressure":"973","cloud":"100","dew":"9"},{"fxTime":"2022-10-08T08:00+08:00","temp":"11","icon":"101","text":"多云","wind360":"271","windDir":"西风","windScale":"1-2","windSpeed":"9","humidity":"93","pop":"7","precip":"0.0","pressure":"973","cloud":"100","dew":"10"},{"fxTime":"2022-10-08T09:00+08:00","temp":"12","icon":"101","text":"多云","wind360":"245","windDir":"西南风","windScale":"1-2","windSpeed":"11","humidity":"85","pop":"7","precip":"0.0","pressure":"973","cloud":"100","dew":"10"},{"fxTime":"2022-10-08T10:00+08:00","temp":"13","icon":"101","text":"多云","wind360":"235","windDir":"西南风","windScale":"3-4","windSpeed":"13","humidity":"77","pop":"7","precip":"0.0","pressure":"974","cloud":"100","dew":"9"},{"fxTime":"2022-10-08T11:00+08:00","temp":"14","icon":"101","text":"多云","wind360":"234","windDir":"西南风","windScale":"3-4","windSpeed":"14","humidity":"70","pop":"7","precip":"0.0","pressure":"974","cloud":"100","dew":"8"},{"fxTime":"2022-10-08T12:00+08:00","temp":"14","icon":"101","text":"多云","wind360":"243","windDir":"西南风","windScale":"3-4","windSpeed":"14","humidity":"66","pop":"10","precip":"0.0","pressure":"974","cloud":"100","dew":"8"},{"fxTime":"2022-10-08T13:00+08:00","temp":"15","icon":"305","text":"小雨","wind360":"256","windDir":"西南风","windScale":"3-4","windSpeed":"16","humidity":"70","pop":"66","precip":"0.7","pressure":"975","cloud":"100","dew":"9"},{"fxTime":"2022-10-08T14:00+08:00","temp":"16","icon":"305","text":"小雨","wind360":"261","windDir":"西风","windScale":"3-4","windSpeed":"16","humidity":"72","pop":"66","precip":"0.7","pressure":"976","cloud":"100","dew":"11"},{"fxTime":"2022-10-08T15:00+08:00","temp":"15","icon":"305","text":"小雨","wind360":"250","windDir":"西南风","windScale":"3-4","windSpeed":"16","humidity":"76","pop":"66","precip":"0.7","pressure":"976","cloud":"100","dew":"11"},{"fxTime":"2022-10-08T16:00+08:00","temp":"15","icon":"101","text":"多云","wind360":"234","windDir":"西南风","windScale":"3-4","windSpeed":"18","humidity":"76","pop":"47","precip":"0.0","pressure":"977","cloud":"100","dew":"11"},{"fxTime":"2022-10-08T17:00+08:00","temp":"14","icon":"305","text":"小雨","wind360":"223","windDir":"西南风","windScale":"3-4","windSpeed":"20","humidity":"77","pop":"55","precip":"0.7","pressure":"978","cloud":"100","dew":"10"}]
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
    @SerializedName("hourly")
    private List<HourlyDTO> hourly;

    public static hourtime objectFromData(String str) {

        return new Gson().fromJson(str, hourtime.class);
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

    public List<HourlyDTO> getHourly() {
        return hourly;
    }

    public void setHourly(List<HourlyDTO> hourly) {
        this.hourly = hourly;
    }
}
