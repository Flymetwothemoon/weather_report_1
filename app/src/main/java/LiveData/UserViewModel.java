package LiveData;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class UserViewModel extends ViewModel {
    private MutableLiveData<String> weather;

    public MutableLiveData<Integer> getTemp() {
        if(temp==null){
            temp = new MutableLiveData<>();
        }
        return temp;
    }

    public MutableLiveData<String> getWeather() {
        if(weather==null){
            weather = new MutableLiveData<>();
        }
        return weather;
    }

    private MutableLiveData<Integer>temp;

}
