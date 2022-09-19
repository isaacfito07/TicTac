package com.example.tictac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {
    CheckBox _CBJugador;
    CheckBox _CBCelular;
    Button _BTNIniciar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        _CBJugador =(CheckBox) findViewById(R.id.CBJugador);
        _CBCelular =(CheckBox) findViewById(R.id.CBCelular);
        _BTNIniciar = findViewById(R.id.BTNIniciar);

    }

    public void CBJugador(View view){
        if (_CBCelular.isChecked() == true){
            _CBCelular.setChecked(false);
        }
    }


    public void CBCelular(View view){
        if (_CBJugador.isChecked() == true){
            _CBJugador.setChecked(false);
        }
    }


    public void IniciarJuego(View view){
        if(_CBJugador.isChecked() == true){
            Intent vsJugador = new Intent(this,MainActivity.class);
            startActivity(vsJugador);
        }else{
            if (_CBCelular.isChecked() == true){
                Intent vsCelular = new Intent(this,IAActivity.class);
                startActivity(vsCelular);
            }else{
                Toast.makeText(getApplicationContext(),"Selecciona un modo de juego",Toast.LENGTH_LONG).show();
            }
        }

    }
}