package com.example.multydiv;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button buttonMult,buttonDiv;
TextView textViewResultado;

    private int VUELVO_DE_MULT=1;
    private int VUELVO_DE_DIV=2;
    static String NOMBRE="NOMBRE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonMult=findViewById(R.id.buttonMult);
        buttonDiv=findViewById(R.id.buttonDiv);
        textViewResultado=findViewById(R.id.textViewResultado);

        buttonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento=new Intent(MainActivity.this,MultiplicacionActivity.class);

                startActivityForResult(intento, VUELVO_DE_MULT);
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento2=new Intent(MainActivity.this,DivisionActivity.class);

                startActivityForResult(intento2, VUELVO_DE_DIV);
            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if ( requestCode==VUELVO_DE_MULT && resultCode==RESULT_OK){
            String nombre = data.getStringExtra(NOMBRE);
            int res= Integer.parseInt(nombre)*2;

            textViewResultado.setText( String.valueOf(res));
        }
        if ( requestCode==VUELVO_DE_DIV && resultCode==RESULT_OK){
            String nombre = data.getStringExtra(NOMBRE);
            int res= Integer.parseInt(nombre)/2;
            textViewResultado.setText(String.valueOf(res));
        }


    }
}
