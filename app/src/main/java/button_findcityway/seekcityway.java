package button_findcityway;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.example.weather_report_1.MainActivity2;
import com.example.weather_report_1.MainActivity3;

public class seekcityway {
    public static void seek_OnClick(Button button, Context context){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, MainActivity3.class);
                view.getContext().startActivity(intent);
            }
        });
    }
}
