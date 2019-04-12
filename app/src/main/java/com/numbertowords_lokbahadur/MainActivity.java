package com.numbertowords_lokbahadur;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etValue;
    private Button btnConvert;
    private TextView tvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etValue = findViewById(R.id.etValue);
        tvOutput = findViewById(R.id.tvOutput);
        btnConvert = findViewById(R.id.btnConvert);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(etValue.getText().toString());
                Convert c = new Convert();
                if (num<=10000000) {
                    String res = c.convert(num);
                    tvOutput.setText(res);
                }else{
                    tvOutput.setText("High number of length");
                }
            }
        });
    }
}
