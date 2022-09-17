package com.example.tictac;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView _imageView1;
    ImageView _imageView2;
    ImageView _imageView3;
    ImageView _imageView4;
    ImageView _imageView5;
    ImageView _imageView6;
    ImageView _imageView7;
    ImageView _imageView8;
    ImageView _imageView9;
    ImageView _gatoX;
    ImageView _gatoO;
    String turno="X";

    String [][] arreglo = new String[3][3]; //Arreglo para calcular ganador

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Seccion de seteo de objetos usados
        _imageView1 = findViewById(R.id.imageView1);
        _imageView2 = findViewById(R.id.imageView2);
        _imageView3 = findViewById(R.id.imageView3);
        _imageView4 = findViewById(R.id.imageView4);
        _imageView5 = findViewById(R.id.imageView5);
        _imageView6 = findViewById(R.id.imageView6);
        _imageView7 = findViewById(R.id.imageView7);
        _imageView8 = findViewById(R.id.imageView8);
        _imageView9 = findViewById(R.id.imageView9);
        _gatoX = findViewById(R.id.gato_x);
        _gatoO = findViewById(R.id.gato_o);

    }

    public void arreglo00(View view) {
        if (turno=="X"){
            _imageView1.setImageResource(R.drawable.gato_x);
            turn();
            _imageView1.setEnabled(false);
        }else{
            _imageView1.setImageResource(R.drawable.gato_o);
            turn();
            _imageView1.setEnabled(false);
        }
    }

    public void arreglo01(View view) {
        if (turno=="X"){
            _imageView2.setImageResource(R.drawable.gato_x);
            turn();
            _imageView2.setEnabled(false);
        }else{
            _imageView2.setImageResource(R.drawable.gato_o);
            turn();
            _imageView2.setEnabled(false);
        }
    }

    public void arreglo02(View view) {
        if (turno=="X"){
            _imageView3.setImageResource(R.drawable.gato_x);
            turn();
            _imageView3.setEnabled(false);
        }else{
            _imageView3.setImageResource(R.drawable.gato_o);
            turn();
            _imageView3.setEnabled(false);
        }
    }

    public void arreglo10(View view) {
        if (turno=="X"){
            _imageView4.setImageResource(R.drawable.gato_x);
            turn();
            _imageView4.setEnabled(false);
        }else{
            _imageView4.setImageResource(R.drawable.gato_o);
            turn();
            _imageView4.setEnabled(false);
        }
    }

    public void arreglo11(View view) {
        if (turno=="X"){
            _imageView5.setImageResource(R.drawable.gato_x);
            turn();
            _imageView5.setEnabled(false);
        }else{
            _imageView5.setImageResource(R.drawable.gato_o);
            turn();
            _imageView5.setEnabled(false);
        }
    }

    public void arreglo12(View view) {
        if (turno=="X"){
            _imageView6.setImageResource(R.drawable.gato_x);
            turn();
            _imageView6.setEnabled(false);
        }else{
            _imageView6.setImageResource(R.drawable.gato_o);
            turn();
            _imageView6.setEnabled(false);
        }
    }

    public void arreglo20(View view) {
        if (turno=="X"){
            _imageView7.setImageResource(R.drawable.gato_x);
            turn();
            _imageView7.setEnabled(false);
        }else{
            _imageView7.setImageResource(R.drawable.gato_o);
            turn();
            _imageView7.setEnabled(false);
        }
    }

    public void arreglo21(View view) {
        if (turno=="X"){
            _imageView8.setImageResource(R.drawable.gato_x);
            turn();
            _imageView8.setEnabled(false);
        }else{
            _imageView8.setImageResource(R.drawable.gato_o);
            turn();
            _imageView8.setEnabled(false);
        }
    }

    public void arreglo22(View view) {
        if (turno=="X"){
            _imageView9.setImageResource(R.drawable.gato_x);
            turn();
            _imageView9.setEnabled(false);
        }else{
            _imageView9.setImageResource(R.drawable.gato_o);
            turn();
            _imageView9.setEnabled(false);
        }
    }

    public void turn(){
        if (turno=="X"){
            turno="O";
            _gatoX.setBackgroundColor(0);
            _gatoO.setBackgroundColor(Color.parseColor("#42ab49"));
        }else{
            turno="X";
            _gatoO.setBackgroundColor(0);
            _gatoX.setBackgroundColor(Color.parseColor("#42ab49"));
        }
    }

    public static boolean ganadorX(String [][] arreglo){
        if(arreglo[0][0]=="X" && arreglo[0][1]=="X" && arreglo[0][2]=="X"){
            return true;
        }
        if(arreglo[1][0]=="X" && arreglo[1][1]=="X" && arreglo[1][2]=="X"){
            return true;
        }
        if(arreglo[2][0]=="X" && arreglo[2][1]=="X" && arreglo[2][2]=="X"){
            return true;
        }
        if(arreglo[0][0]=="X" && arreglo[1][0]=="X" && arreglo[2][0]=="X"){
            return true;
        }
        if(arreglo[0][1]=="X" && arreglo[1][1]=="X" && arreglo[2][1]=="X"){
            return true;
        }
        if(arreglo[0][2]=="X" && arreglo[1][2]=="X" && arreglo[2][2]=="X"){
            return true;
        }
        if(arreglo[0][0]=="X" && arreglo[1][1]=="X" && arreglo[2][2]=="X"){
            return true;
        }
        if(arreglo[2][0]=="X" && arreglo[1][1]=="X" && arreglo[0][2]=="X"){
            return true;
        }
        return false;
    }

    public static boolean ganadorO(String [][] arreglo){
        if(arreglo[0][0]=="O" && arreglo[0][1]=="O" && arreglo[0][2]=="O"){
            return true;
        }
        if(arreglo[1][0]=="O" && arreglo[1][1]=="O" && arreglo[1][2]=="O"){
            return true;
        }
        if(arreglo[2][0]=="O" && arreglo[2][1]=="O" && arreglo[2][2]=="O"){
            return true;
        }
        if(arreglo[0][0]=="O" && arreglo[1][0]=="O" && arreglo[2][0]=="O"){
            return true;
        }
        if(arreglo[0][1]=="O" && arreglo[1][1]=="O" && arreglo[2][1]=="O"){
            return true;
        }
        if(arreglo[0][2]=="O" && arreglo[1][2]=="O" && arreglo[2][2]=="O"){
            return true;
        }
        if(arreglo[0][0]=="O" && arreglo[1][1]=="O" && arreglo[2][2]=="O"){
            return true;
        }
        if(arreglo[2][0]=="O" && arreglo[1][1]=="O" && arreglo[0][2]=="O"){
            return true;
        }
        return false;
    }
}