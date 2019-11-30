package com.example.debitandcreditapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class CalculatorActivity extends Activity {

    Button selectBtn, calBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final View view = View.inflate(this, R.layout.calculator,null);
        setContentView(view);

        selectBtn = findViewById(R.id.selectButton);
        selectBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(getApplicationContext(), SelectFileActivity.class);
                startActivity(mainIntent);
                finish();
            }
        });
    }

}
