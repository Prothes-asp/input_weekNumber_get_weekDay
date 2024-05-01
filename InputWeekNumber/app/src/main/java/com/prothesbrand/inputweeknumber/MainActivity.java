package com.prothesbrand.inputweeknumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvDisplay;
    private Button btn;
    private EditText edText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES,WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES);
        this.getWindow().setStatusBarColor(getResources().getColor(R.color.black));
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.tvDisplay);
        btn = findViewById(R.id.btn);
        edText = findViewById(R.id.edText);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String getStr = edText.getText().toString();
               if (getStr.length()>0){
                   int num = Integer.parseInt(getStr);
                   if (num <= 7 && num >=1){
                       if (num == 1){
                           tvDisplay.setText("Sunday");
                       }else if (num == 2) {
                           tvDisplay.setText("Monday");
                       }else if (num == 3) {
                           tvDisplay.setText("Tuesday");
                       }else if (num == 4) {
                           tvDisplay.setText("Wednesday");
                       }else if (num == 5) {
                           tvDisplay.setText("Thursday");
                       }else if (num == 6) {
                           tvDisplay.setText("Friday");
                       }else if (num == 7) {
                           tvDisplay.setText("Saturday");
                       }
                   }else{
                       edText.setError("Max value 7");
                       tvDisplay.setText(null);
                   }
               }else{
                   edText.setError("Empty Field");
                   tvDisplay.setText(null);
               }
            }
        });

    }
}