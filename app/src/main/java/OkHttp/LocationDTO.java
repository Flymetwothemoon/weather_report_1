package OkHttp;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class LocationDTO {
    /**
     * name : 北
     * id : 61DA1
     * lat : 33.61570
     * lon : -81.10204
     * adm2 : 奥兰治堡县
     * adm1 : 南卡罗来纳州
     * country : 美国
     * tz : America/New_York
     * utcOffset : -04:00
     * isDst : 1
     * type : city
     * rank : 89
     * fxLink : http://hfx.link/7rpa0jxi7p1
     */

    @SerializedName("name")
    private String name;
    @SerializedName("id")
    private String id;
    @SerializedName("lat")
    private String lat;
    @SerializedName("lon")
    private String lon;
    @SerializedName("adm2")
    private String adm2;
    @SerializedName("adm1")
    private String adm1;
    @SerializedName("country")
    private String country;
    @SerializedName("tz")
    private String tz;
    @SerializedName("utcOffset")
    private String utcOffset;
    @SerializedName("isDst")
    private String isDst;
    @SerializedName("type")
    private String type;
    @SerializedName("rank")
    private String rank;
    @SerializedName("fxLink")
    private String fxLink;

    public static LocationDTO objectFromData(String str) {

        return new Gson().fromJson(str, LocationDTO.class);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getAdm2() {
        return adm2;
    }

    public void setAdm2(String adm2) {
        this.adm2 = adm2;
    }

    public String getAdm1() {
        return adm1;
    }

    public void setAdm1(String adm1) {
        this.adm1 = adm1;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTz() {
        return tz;
    }

    public void setTz(String tz) {
        this.tz = tz;
    }

    public String getUtcOffset() {
        return utcOffset;
    }

    public void setUtcOffset(String utcOffset) {
        this.utcOffset = utcOffset;
    }

    public String getIsDst() {
        return isDst;
    }

    public void setIsDst(String isDst) {
        this.isDst = isDst;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getFxLink() {
        return fxLink;
    }

    public void setFxLink(String fxLink) {
        this.fxLink = fxLink;
    }
}
