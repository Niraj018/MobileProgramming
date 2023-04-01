package com.example.event;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.Nullable;

public class seventh extends Activity{
    Button btn;
    TextView tview;

    @Override
    protected void onCreate (@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seventh);
        btn = (Button)findViewById(R.id.btnClick);
        tview = (TextView)findViewById(R.id.txtResult);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tview.setText("Button Has Been Clicked");
            }
        });
    }
}
