package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String number ="";
    private double num1 = 0;
    private double num2 = 0;
    private String symbol;

    // Variables
    private TextView solucion;
    private Button keyPad0, keyPad1,keyPad2,keyPad3,keyPad4, keyPad5,keyPad6,keyPad7, keyPad8, keyPad9;
    private Button keyPadSum, keyPadSubstract, keyPadMultiply, keyPadDivision, keyPadClear, keyPadEqual;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        solucion =  findViewById(R.id.solucion);

        keyPad1 = findViewById(R.id.num_uno);
        keyPad2 = findViewById(R.id.num_dos);
        keyPad3 = findViewById(R.id.num_tres);
        keyPad4 = findViewById(R.id.num_cuatro);
        keyPad5 = findViewById(R.id.num_cinco);
        keyPad6 = findViewById(R.id.num_seis);
        keyPad7 = findViewById(R.id.num_siete);
        keyPad8 = findViewById(R.id.num_ocho);
        keyPad9 = findViewById(R.id.num_nueve);
        keyPad0 = findViewById(R.id.num_cero);




        keyPadSum = findViewById(R.id.num_suma);
        keyPadSubstract = findViewById(R.id.num_menos);
        keyPadMultiply = findViewById(R.id.num_x);
        keyPadDivision = findViewById(R.id.num_division);
        keyPadClear = findViewById(R.id.num_equal);
        keyPadEqual = findViewById(R.id.num_CE);
        //listener for button

        keyPad0.setOnClickListener(this);
        keyPad1.setOnClickListener(this);
        keyPad2.setOnClickListener(this);
        keyPad3.setOnClickListener(this);
        keyPad4.setOnClickListener(this);
        keyPad5.setOnClickListener(this);
        keyPad6.setOnClickListener(this);
        keyPad7.setOnClickListener(this);
        keyPad8.setOnClickListener(this);
        keyPad9.setOnClickListener(this);




        keyPadSum.setOnClickListener(this);
        keyPadSubstract.setOnClickListener(this);
        keyPadMultiply.setOnClickListener(this);
        keyPadDivision.setOnClickListener(this);
        keyPadClear.setOnClickListener(this);
        keyPadEqual.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.num_cero:
                number = number + "0";
                solucion.setText(number);
                break;

            case R.id.num_uno:
                number = number + "1";
                solucion.setText(number);
                break;

            case R.id.num_dos:
                number = number + "2";
                solucion.setText(number);
                break;

            case R.id.num_tres:
                number = number + "3";
                solucion.setText(number);
                break;

            case R.id.num_cuatro:
                number = number + "4";
                solucion.setText(number);
                break;

            case R.id.num_cinco:
                number = number + "5";
                solucion.setText(number);
                break;

            case R.id.num_seis:
                number = number + "6";
                solucion.setText(number);
                break;

            case R.id.num_siete:
                number = number + "7";
                solucion.setText(number);
                break;

            case R.id.num_ocho:
                number = number + "8";
                solucion.setText(number);
                break;

            case R.id.num_nueve:
                number = number + "9";
                solucion.setText(number);
                break;

            case R.id.num_suma:
                symbol = "+";
                num1 = Integer.parseInt(number);
                number = "";
                break;

            case R.id.num_menos:
                symbol = "-";
                num1 = Integer.parseInt(number);
                number = "";
                break;

            case R.id.num_division:
                symbol = "/";
                num1 = Integer.parseInt(number);
                number = "";
                break;

            case R.id.num_x:
                symbol = "X";
                num1 = Integer.parseInt(number);
                number = "";
                break;

            case R.id.num_CE:
                symbol = "";
                num1 = 0;
                num2 = 0;
                number = "";
                solucion.setText("");
                break;

            case R.id.num_equal:
                num2 = Integer.parseInt(number);

                switch (symbol){
                    case "+":
                        solucion.setText("solucion: " + (num1 + num2));
                        break;
                    case "-":
                        solucion.setText("solucion: " + (num1 - num2));
                        break;
                    case "/":
                        solucion.setText("solucion: " + (num1 / num2));
                        break;
                    case "X":
                        solucion.setText("solucion: " + (num1 * num2));
                        break;
                }

                num1 = 0;
                num2 = 0;
                number = "";

                break;



        }
    }
}
