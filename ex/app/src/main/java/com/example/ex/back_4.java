package com.example.ex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class back_4 extends AppCompatActivity {

    private Button back4_choose;
    private EditText back4_set;
    private String Temp = "";
    private int num;
    TextView back4_text;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_4);

        back4_text = findViewById(R.id.back4_text);

        back4_set = findViewById(R.id.back4_set);

        back4_choose = findViewById(R.id.back4_choose);

        back4_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = Integer.parseInt(back4_set.getText().toString());
                Temp = Temp + "랫 풀 다운";
                basket.getAdapter().addItem(new exercise_list(Temp, num));
                Intent intent = new Intent(back_4.this, back_area.class);
                startActivity(intent);
            }
        });
    }
}