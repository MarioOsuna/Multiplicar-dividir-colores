package com.example.multydiv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MultiplicacionActivity extends AppCompatActivity {
Button buttonResMult;
EditText editTextMult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicacion);

        buttonResMult=findViewById(R.id.buttonMult);
        editTextMult=findViewById(R.id.editTextMult);

        buttonResMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.putExtra(MainActivity.NOMBRE,editTextMult.getText().toString());
                setResult(RESULT_OK,intent);
                finish();
            }
        });

    }
}
