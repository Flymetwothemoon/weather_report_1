package OkHttp;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ReferDTO {
    @SerializedName("sources")
    private List<String> sources;
    @SerializedName("license")
    private List<String> license;

    public static ReferDTO objectFromData(String str) {

        return new Gson().fromJson(str, ReferDTO.class);
    }

    public List<String> getSources() {
        return sources;
    }

    public void setSources(List<String> sources) {
        this.sources = sources;
    }

    public List<String> getLicense() {
        return license;
    }

    public void setLicense(List<String> license) {
        this.license = license;
    }
}
