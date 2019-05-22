package com.example.poclava.convertorunidades;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SegPant extends AppCompatActivity {

    public String TipC="",Conver;
    public double Num,Tot;
    EditText txtDato;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seg_pant);
        TipC = getIntent().getStringExtra("Tipo De Conversion");
        Conver = getIntent().getStringExtra("Conver");
        this.setTitle(TipC);
    }
    public void Cal(View v){
        //Uso de Try,Catch por si sucede algun error
        try{
            txtResultado=(TextView)findViewById(R.id.txtResultado);
            txtDato=(EditText)findViewById(R.id.txtDato);
            Num=Integer.parseInt(txtDato.getText().toString());
            switch (Conver){
                case "1":
                    Tot=(Num*9/5)+32;
                    txtResultado.setText(Tot+" F°");
                    break;
                case "2":
                    Tot=(Num-32)*5/9;
                    txtResultado.setText(Tot+" C°");
                    break;
                case "3":
                    Tot=Num+273.15;
                    txtResultado.setText(Tot+" K°");
                    break;
                case "4":
                    Tot=Num-273.15;
                    txtResultado.setText(Tot+" C°");
                    break;
                case "5":
                    Tot=Num*100;
                    txtResultado.setText(Tot+" CM");
                    break;
                case "6":
                    Tot=Num/100;
                    txtResultado.setText(Tot+" M");
                    break;
                case "7":
                    Tot=Num/2.54;
                    txtResultado.setText(Tot+" INCH");
                    break;
                case "8":
                    Tot=Num*2.54;
                    txtResultado.setText(Tot+" CM");
                    break;
            }
        }
        catch (Exception e)
        {
            Toast.makeText(getApplicationContext(),"No debe dejar el campo en blanco...",Toast.LENGTH_SHORT).show();
        }
        SharedPreferences prefe=getSharedPreferences("Datos",Context.MODE_PRIVATE);
        SharedPreferences.Editor edi=prefe.edit();
        edi.putString("Conversion",txtDato.getText().toString());
        edi.commit();
    }
}
