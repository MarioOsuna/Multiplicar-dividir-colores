package com.example.multydiv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DivisionActivity extends AppCompatActivity {
    Button buttonResDiv;
    EditText editTextDiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division);

        buttonResDiv=findViewById(R.id.buttonResDiv);
        editTextDiv=findViewById(R.id.editTextDiv);


        buttonResDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.putExtra(MainActivity.NOMBRE,editTextDiv.getText().toString());
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}
