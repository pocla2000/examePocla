 package com.example.poclava.convertorunidades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

 public class MainActivity extends AppCompatActivity {

     public Button btnCelFar,btnFarCel,btnCelKel,btnKelCel,btnMetCen,btnCenMet,btnCenPul,btnPulCen;
     public String TipC="",Conver="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Conversor Unidades");
    }

     public void CambiarVentana()
     {
         Intent Ventana=new Intent(getApplicationContext(),SegPant.class);
         Ventana.putExtra("Tipo De Conversion",TipC);
         Ventana.putExtra("Conver",Conver);
         startActivity(Ventana);
     }

    public void celfar(View view)
    {
        btnCelFar=(Button)findViewById(R.id.btnCelFar);
        TipC=btnCelFar.getText().toString();
        Conver="1";
        CambiarVentana();
    }
    public void farcel(View view)
    {
        btnFarCel=(Button)findViewById(R.id.btnFarCel);
        TipC=btnFarCel.getText().toString();
        Conver="2";
        CambiarVentana();
    }
    public void celkel(View view)
    {
        btnCelKel=(Button)findViewById(R.id.btnCelKel);
        TipC=btnCelKel.getText().toString();
        Conver="3";
        CambiarVentana();
    }
    public void kelcel(View view)
    {
        btnKelCel=(Button)findViewById(R.id.btnKelCel);
        TipC=btnKelCel.getText().toString();
        Conver="4";
        CambiarVentana();
    }
    public void metcen(View view)
    {
        btnMetCen=(Button)findViewById(R.id.btnMetCen);
        TipC=btnMetCen.getText().toString();
        Conver="5";
        CambiarVentana();
    }
    public void cenmet(View view)
    {
        btnCenMet=(Button)findViewById(R.id.btnCenMet);
        TipC=btnCenMet.getText().toString();
        Conver="6";
        CambiarVentana();
    }
    public void cenpul(View view)
    {
        btnCenPul=(Button)findViewById(R.id.btnCenPul);
        TipC=btnCenPul.getText().toString();
        Conver="7";
        CambiarVentana();
    }
    public void pulcen(View view)
    {
        btnPulCen=(Button)findViewById(R.id.btnPulCen);
        TipC=btnPulCen.getText().toString();
        Conver="8";
        CambiarVentana();
    }
}
