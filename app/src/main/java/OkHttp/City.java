package OkHttp;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class City {

    /**
     * code : 200
     * location : [{"name":"北","id":"61DA1","lat":"33.61570","lon":"-81.10204","adm2":"奥兰治堡县","adm1":"南卡罗来纳州","country":"美国","tz":"America/New_York","utcOffset":"-04:00","isDst":"1","type":"city","rank":"89","fxLink":"http://hfx.link/7rpa0jxi7p1"},{"name":"北京","id":"101010100","lat":"39.90498","lon":"116.40528","adm2":"北京","adm1":"北京市","country":"中国","tz":"Asia/Shanghai","utcOffset":"+08:00","isDst":"0","type":"city","rank":"10","fxLink":"http://hfx.link/2ax1"},{"name":"北海","id":"101301301","lat":"21.47334","lon":"109.11925","adm2":"北海","adm1":"广西壮族自治区","country":"中国","tz":"Asia/Shanghai","utcOffset":"+08:00","isDst":"0","type":"city","rank":"23","fxLink":"http://hfx.link/3mp1"},{"name":"北流","id":"101300903","lat":"22.70164","lon":"110.34805","adm2":"玉林","adm1":"广西壮族自治区","country":"中国","tz":"Asia/Shanghai","utcOffset":"+08:00","isDst":"0","type":"city","rank":"25","fxLink":"http://hfx.link/3lv1"},{"name":"北区","id":"C6265","lat":"35.17410","lon":"126.91220","adm2":"光州广域市","adm1":"光州广域市","country":"韩国","tz":"Asia/Seoul","utcOffset":"+09:00","isDst":"0","type":"city","rank":"28","fxLink":"http://hfx.link/72xclr6i5o1"},{"name":"北榄府","id":"39138","lat":"13.60040","lon":"100.59639","adm2":"北榄府","adm1":"沙没巴干府","country":"泰国","utcOffset":"+07:00","isDst":"0","type":"city","rank":"31","fxLink":"http://hfx.link/1hir1"},{"name":"北干巴鲁","id":"EC919","lat":"0.53333","lon":"101.44999","adm2":"北干巴鲁","adm1":"廖内省","country":"印度尼西亚","tz":"Asia/Jakarta","utcOffset":"+07:00","isDst":"0","type":"city","rank":"31","fxLink":"http://hfx.link/1f8h1"},{"name":"北榄坡","id":"222EF","lat":"15.70578","lon":"100.13300","adm2":"北榄坡","adm1":"那空沙旺府","country":"泰国","tz":"Asia/Bangkok","utcOffset":"+07:00","isDst":"0","type":"city","rank":"35","fxLink":"http://hfx.link/3vht1"},{"name":"北区","id":"D82A7","lat":"35.88550","lon":"128.58288","adm2":"大邱广域市","adm1":"大邱广域市","country":"韩国","tz":"Asia/Seoul","utcOffset":"+09:00","isDst":"0","type":"city","rank":"33","fxLink":"http://hfx.link/72xclr6i4f1"},{"name":"北安","id":"101050606","lat":"48.24543","lon":"126.50873","adm2":"黑河","adm1":"黑龙江省","country":"中国","tz":"Asia/Shanghai","utcOffset":"+08:00","isDst":"0","type":"city","rank":"33","fxLink":"http://hfx.link/2f11"}]
     * refer : {"sources":["QWeather"],"license":["commercial license"]}
     */

    @SerializedName("code")
    private String code;
    @SerializedName("refer")
    private ReferDTO refer;
    @SerializedName("location")
    private List<LocationDTO> location;

    public static City objectFromData(String str) {

        return new Gson().fromJson(str, City.class);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ReferDTO getRefer() {
        return refer;
    }

    public void setRefer(ReferDTO refer) {
        this.refer = refer;
    }

    public List<LocationDTO> getLocation() {
        return location;
    }

    public void setLocation(List<LocationDTO> location) {
        this.location = location;
    }
}
