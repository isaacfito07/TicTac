package com.example.tictac;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

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
    TextView _textView;
    Button _btnRestart;
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
        _textView=findViewById(R.id.textView);
        _btnRestart=findViewById(R.id.btnRestart);

    }

    public void arreglo00(View view) {
        if (turno=="X"){
            _imageView1.setImageResource(R.drawable.gato_x);
            _imageView1.setEnabled(false);
            arreglo[0][0]=turno;
            turn();
            ganadorX(arreglo);
        }else{
            _imageView1.setImageResource(R.drawable.gato_o);
            _imageView1.setEnabled(false);
            arreglo[0][0]=turno;
            turn();
            ganadorO(arreglo);
        }
    }

    public void arreglo01(View view) {
        if (turno=="X"){
            _imageView2.setImageResource(R.drawable.gato_x);
            _imageView2.setEnabled(false);
            arreglo[0][1]=turno;
            turn();
            ganadorX(arreglo);
        }else{
            _imageView2.setImageResource(R.drawable.gato_o);
            _imageView2.setEnabled(false);
            arreglo[0][1]=turno;
            turn();
            ganadorO(arreglo);
        }
    }

    public void arreglo02(View view) {
        if (turno=="X"){
            _imageView3.setImageResource(R.drawable.gato_x);
            _imageView3.setEnabled(false);
            arreglo[0][2]=turno;
            turn();
            ganadorX(arreglo);
        }else{
            _imageView3.setImageResource(R.drawable.gato_o);
            //HOla
            _imageView3.setEnabled(false);
            arreglo[0][2]=turno;
            turn();
            ganadorO(arreglo);
        }
    }

    public void arreglo10(View view) {
        if (turno=="X"){
            _imageView4.setImageResource(R.drawable.gato_x);
            //HOla
            _imageView4.setEnabled(false);
            arreglo[1][0]=turno;
            turn();
            ganadorX(arreglo);
        }else{
            _imageView4.setImageResource(R.drawable.gato_o);
            //HOla
            _imageView4.setEnabled(false);
            arreglo[1][0]=turno;
            turn();
            ganadorO(arreglo);
        }
    }

    public void arreglo11(View view) {
        if (turno=="X"){
            _imageView5.setImageResource(R.drawable.gato_x);
            _imageView5.setEnabled(false);
            arreglo[1][1]=turno;
            turn();
            ganadorX(arreglo);
        }else{
            _imageView5.setImageResource(R.drawable.gato_o);
            _imageView5.setEnabled(false);
            arreglo[1][1]=turno;
            turn();
            ganadorO(arreglo);
        }
    }

    public void arreglo12(View view) {
        if (turno=="X"){
            _imageView6.setImageResource(R.drawable.gato_x);
            _imageView6.setEnabled(false);
            arreglo[1][2]=turno;
            turn();
            ganadorX(arreglo);
        }else{
            _imageView6.setImageResource(R.drawable.gato_o);
            _imageView6.setEnabled(false);
            arreglo[1][2]=turno;
            turn();
            ganadorO(arreglo);
        }
    }

    public void arreglo20(View view) {
        if (turno=="X"){
            _imageView7.setImageResource(R.drawable.gato_x);
            _imageView7.setEnabled(false);
            arreglo[2][0]=turno;
            turn();
            ganadorX(arreglo);
        }else{
            _imageView7.setImageResource(R.drawable.gato_o);
            _imageView7.setEnabled(false);
            arreglo[2][0]=turno;
            turn();
            ganadorO(arreglo);
        }
    }

    public void arreglo21(View view) {
        if (turno=="X"){
            _imageView8.setImageResource(R.drawable.gato_x);
            _imageView8.setEnabled(false);
            arreglo[2][1]=turno;
            turn();
            ganadorX(arreglo);
        }else{
            _imageView8.setImageResource(R.drawable.gato_o);
            //HOla
            _imageView8.setEnabled(false);
            arreglo[2][1]=turno;
            turn();
            ganadorO(arreglo);
        }
    }

    public void arreglo22(View view) {
        if (turno=="X"){
            _imageView9.setImageResource(R.drawable.gato_x);
            _imageView9.setEnabled(false);
            arreglo[2][2]=turno;
            turn();
            ganadorX(arreglo);
        }else{
            _imageView9.setImageResource(R.drawable.gato_o);
            _imageView9.setEnabled(false);
            arreglo[2][2]=turno;
            turn();
            ganadorO(arreglo);
        }
    }

    //Metodo para cambiar el turno
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

    public boolean ganadorX(String [][] arreglo){
        if(arreglo[0][0]=="X" && arreglo[0][1]=="X" && arreglo[0][2]=="X"){
            _imageView1.setBackgroundColor(Color.parseColor("#42ab49"));
            _imageView2.setBackgroundColor(Color.parseColor("#42ab49"));
            _imageView3.setBackgroundColor(Color.parseColor("#42ab49"));
            _gatoX.setBackgroundColor(Color.parseColor("#42ab49"));
            _gatoO.setBackgroundColor(Color.parseColor("#c63637"));
            _textView.setText("El Ganador es 'X'");
            Disable();
            return true;
        }
        if(arreglo[1][0]=="X" && arreglo[1][1]=="X" && arreglo[1][2]=="X"){
            _imageView4.setBackgroundColor(Color.parseColor("#42ab49"));
            _imageView5.setBackgroundColor(Color.parseColor("#42ab49"));
            _imageView6.setBackgroundColor(Color.parseColor("#42ab49"));
            _gatoX.setBackgroundColor(Color.parseColor("#42ab49"));
            _gatoO.setBackgroundColor(Color.parseColor("#c63637"));
            _textView.setText("El Ganador es 'X'");
            Disable();
            return true;
        }
        if(arreglo[2][0]=="X" && arreglo[2][1]=="X" && arreglo[2][2]=="X"){
            _imageView7.setBackgroundColor(Color.parseColor("#42ab49"));
            _imageView8.setBackgroundColor(Color.parseColor("#42ab49"));
            _imageView9.setBackgroundColor(Color.parseColor("#42ab49"));
            _gatoX.setBackgroundColor(Color.parseColor("#42ab49"));
            _gatoO.setBackgroundColor(Color.parseColor("#c63637"));
            _textView.setText("El Ganador es 'X'");
            Disable();
            return true;
        }
        if(arreglo[0][0]=="X" && arreglo[1][0]=="X" && arreglo[2][0]=="X"){
            _imageView1.setBackgroundColor(Color.parseColor("#42ab49"));
            _imageView4.setBackgroundColor(Color.parseColor("#42ab49"));
            _imageView7.setBackgroundColor(Color.parseColor("#42ab49"));
            _gatoX.setBackgroundColor(Color.parseColor("#42ab49"));
            _gatoO.setBackgroundColor(Color.parseColor("#c63637"));
            _textView.setText("El Ganador es 'X'");
            Disable();
            return true;
        }
        if(arreglo[0][1]=="X" && arreglo[1][1]=="X" && arreglo[2][1]=="X"){
            _imageView2.setBackgroundColor(Color.parseColor("#42ab49"));
            _imageView5.setBackgroundColor(Color.parseColor("#42ab49"));
            _imageView8.setBackgroundColor(Color.parseColor("#42ab49"));
            _gatoX.setBackgroundColor(Color.parseColor("#42ab49"));
            _gatoO.setBackgroundColor(Color.parseColor("#c63637"));
            _textView.setText("El Ganador es 'X'");
            Disable();
            return true;
        }
        if(arreglo[0][2]=="X" && arreglo[1][2]=="X" && arreglo[2][2]=="X"){
            _imageView3.setBackgroundColor(Color.parseColor("#42ab49"));
            _imageView6.setBackgroundColor(Color.parseColor("#42ab49"));
            _imageView9.setBackgroundColor(Color.parseColor("#42ab49"));
            _gatoX.setBackgroundColor(Color.parseColor("#42ab49"));
            _gatoO.setBackgroundColor(Color.parseColor("#c63637"));
            _textView.setText("El Ganador es 'X'");
            Disable();
            return true;
        }
        if(arreglo[0][0]=="X" && arreglo[1][1]=="X" && arreglo[2][2]=="X"){
            _imageView1.setBackgroundColor(Color.parseColor("#42ab49"));
            _imageView5.setBackgroundColor(Color.parseColor("#42ab49"));
            _imageView9.setBackgroundColor(Color.parseColor("#42ab49"));
            _gatoX.setBackgroundColor(Color.parseColor("#42ab49"));
            _gatoO.setBackgroundColor(Color.parseColor("#c63637"));
            _textView.setText("El Ganador es 'X'");
            Disable();
            return true;
        }
        if(arreglo[2][0]=="X" && arreglo[1][1]=="X" && arreglo[0][2]=="X"){
            _imageView7.setBackgroundColor(Color.parseColor("#42ab49"));
            _imageView5.setBackgroundColor(Color.parseColor("#42ab49"));
            _imageView3.setBackgroundColor(Color.parseColor("#42ab49"));
            _gatoX.setBackgroundColor(Color.parseColor("#42ab49"));
            _gatoO.setBackgroundColor(Color.parseColor("#c63637"));
            _textView.setText("El Ganador es 'X'");
            Disable();
            return true;
        }
        return false;
    }

    public boolean ganadorO(String [][] arreglo){
        if(arreglo[0][0]=="O" && arreglo[0][1]=="O" && arreglo[0][2]=="O"){
            _imageView1.setBackgroundColor(Color.parseColor("#42ab49"));
            _imageView2.setBackgroundColor(Color.parseColor("#42ab49"));
            _imageView3.setBackgroundColor(Color.parseColor("#42ab49"));
            _gatoO.setBackgroundColor(Color.parseColor("#42ab49"));
            _gatoX.setBackgroundColor(Color.parseColor("#c63637"));
            _textView.setText("El Ganador es 'O'");
            Disable();
            return true;
        }
        if(arreglo[1][0]=="O" && arreglo[1][1]=="O" && arreglo[1][2]=="O"){
            _imageView4.setBackgroundColor(Color.parseColor("#42ab49"));
            _imageView5.setBackgroundColor(Color.parseColor("#42ab49"));
            _imageView6.setBackgroundColor(Color.parseColor("#42ab49"));
            _gatoO.setBackgroundColor(Color.parseColor("#42ab49"));
            _gatoX.setBackgroundColor(Color.parseColor("#c63637"));
            _textView.setText("El Ganador es 'O'");
            Disable();
            return true;
        }
        if(arreglo[2][0]=="O" && arreglo[2][1]=="O" && arreglo[2][2]=="O"){
            _imageView7.setBackgroundColor(Color.parseColor("#42ab49"));
            _imageView8.setBackgroundColor(Color.parseColor("#42ab49"));
            _imageView9.setBackgroundColor(Color.parseColor("#42ab49"));
            _gatoO.setBackgroundColor(Color.parseColor("#42ab49"));
            _gatoX.setBackgroundColor(Color.parseColor("#c63637"));
            _textView.setText("El Ganador es 'O'");
            Disable();
            return true;
        }
        if(arreglo[0][0]=="O" && arreglo[1][0]=="O" && arreglo[2][0]=="O"){
            _imageView1.setBackgroundColor(Color.parseColor("#42ab49"));
            _imageView4.setBackgroundColor(Color.parseColor("#42ab49"));
            _imageView7.setBackgroundColor(Color.parseColor("#42ab49"));
            _gatoO.setBackgroundColor(Color.parseColor("#42ab49"));
            _gatoX.setBackgroundColor(Color.parseColor("#c63637"));
            _textView.setText("El Ganador es 'O'");
            Disable();
            return true;
        }
        if(arreglo[0][1]=="O" && arreglo[1][1]=="O" && arreglo[2][1]=="O"){
            _imageView2.setBackgroundColor(Color.parseColor("#42ab49"));
            _imageView5.setBackgroundColor(Color.parseColor("#42ab49"));
            _imageView8.setBackgroundColor(Color.parseColor("#42ab49"));
            _gatoO.setBackgroundColor(Color.parseColor("#42ab49"));
            _gatoX.setBackgroundColor(Color.parseColor("#c63637"));
            _textView.setText("El Ganador es 'O'");
            Disable();
            return true;
        }
        if(arreglo[0][2]=="O" && arreglo[1][2]=="O" && arreglo[2][2]=="O"){
            _imageView3.setBackgroundColor(Color.parseColor("#42ab49"));
            _imageView6.setBackgroundColor(Color.parseColor("#42ab49"));
            _imageView9.setBackgroundColor(Color.parseColor("#42ab49"));
            _gatoO.setBackgroundColor(Color.parseColor("#42ab49"));
            _gatoX.setBackgroundColor(Color.parseColor("#c63637"));
            _textView.setText("El Ganador es 'O'");
            Disable();
            return true;
        }
        if(arreglo[0][0]=="O" && arreglo[1][1]=="O" && arreglo[2][2]=="O"){
            _imageView1.setBackgroundColor(Color.parseColor("#42ab49"));
            _imageView5.setBackgroundColor(Color.parseColor("#42ab49"));
            _imageView9.setBackgroundColor(Color.parseColor("#42ab49"));
            _gatoO.setBackgroundColor(Color.parseColor("#42ab49"));
            _gatoX.setBackgroundColor(Color.parseColor("#c63637"));
            _textView.setText("El Ganador es 'O'");
            Disable();
            return true;
        }
        if(arreglo[2][0]=="O" && arreglo[1][1]=="O" && arreglo[0][2]=="O"){
            _imageView7.setBackgroundColor(Color.parseColor("#42ab49"));
            _imageView5.setBackgroundColor(Color.parseColor("#42ab49"));
            _imageView3.setBackgroundColor(Color.parseColor("#42ab49"));
            _gatoO.setBackgroundColor(Color.parseColor("#42ab49"));
            _gatoX.setBackgroundColor(Color.parseColor("#c63637"));
            _textView.setText("El Ganador es 'O'");
            Disable();
            return true;
        }
        return false;
    }

    public void Disable(){
        _imageView1.setEnabled(false);
        _imageView2.setEnabled(false);
        _imageView3.setEnabled(false);
        _imageView4.setEnabled(false);
        _imageView5.setEnabled(false);
        _imageView6.setEnabled(false);
        _imageView7.setEnabled(false);
        _imageView8.setEnabled(false);
        _imageView9.setEnabled(false);
        _btnRestart.setVisibility(View.VISIBLE);
    }

    public void Enable(){
        _imageView1.setEnabled(true);
        _imageView2.setEnabled(true);
        _imageView3.setEnabled(true);
        _imageView4.setEnabled(true);
        _imageView5.setEnabled(true);
        _imageView6.setEnabled(true);
        _imageView7.setEnabled(true);
        _imageView8.setEnabled(true);
        _imageView9.setEnabled(true);

        _imageView1.setImageResource(R.drawable.cuadro);
        _imageView2.setImageResource(R.drawable.cuadro);
        _imageView3.setImageResource(R.drawable.cuadro);
        _imageView4.setImageResource(R.drawable.cuadro);
        _imageView5.setImageResource(R.drawable.cuadro);
        _imageView6.setImageResource(R.drawable.cuadro);
        _imageView7.setImageResource(R.drawable.cuadro);
        _imageView8.setImageResource(R.drawable.cuadro);
        _imageView9.setImageResource(R.drawable.cuadro);

        _imageView1.setBackgroundColor(0);
        _imageView2.setBackgroundColor(0);
        _imageView3.setBackgroundColor(0);
        _imageView4.setBackgroundColor(0);
        _imageView5.setBackgroundColor(0);
        _imageView6.setBackgroundColor(0);
        _imageView7.setBackgroundColor(0);
        _imageView8.setBackgroundColor(0);
        _imageView9.setBackgroundColor(0);
        _gatoO.setBackgroundColor(0);
        _gatoX.setBackgroundColor(0);

        for(int x=0; x<=2; x++){
            for(int y=0; y<=2;y++){
                arreglo[x][y]=null;
            }
        }
    }


    public void Restart(View view) {
        _btnRestart.setVisibility(View.INVISIBLE);
        Enable();
    }
}