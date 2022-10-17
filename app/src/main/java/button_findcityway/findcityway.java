package button_findcityway;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import androidx.core.content.ContextCompat;

import com.example.weather_report_1.MainActivity;
import com.example.weather_report_1.MainActivity2;

public class findcityway {
    public static void OnClick(Button button, Context context){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, MainActivity2.class);
                view.getContext().startActivity(intent);
            }
        });
    }



}
