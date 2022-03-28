package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Objects;
import java.util.function.Function;

public class MainActivity extends AppCompatActivity {

    TextView Txttotal, Txtop;
    float num1,num2;
    String op="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Txttotal = findViewById(R.id.result);
        Txtop = findViewById(R.id.calculation);

        TextView txtclean = findViewById(R.id.clean);
        txtclean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Txttotal.setText("");
                Txtop.setText("");
                op="";
            }
        });

        ImageView txtBackspace = findViewById(R.id.backspace);
        txtBackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!Txttotal.getText().toString().isEmpty()) {
                    int var1 = Txttotal.getText().toString().length()-1;
                    Txttotal.setText(Txttotal.getText().toString().substring(0,var1));
                }
            }
        });

        TextView txtdivision = findViewById(R.id.division);
        txtdivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!Txttotal.getText().toString().isEmpty()) {
                    if (op.equals("")) {
                    num1 = Float.parseFloat((String) Txttotal.getText());
                    Txtop.setText(Txttotal.getText());
                    op = "/";
                    Txttotal.setText("");
                    }else{
                        num2 = Float.parseFloat((String)Txttotal.getText());
                        if(op=="+"){
                            num1 = num1+num2;}
                        else if (op=="-"){
                            num1 = num1-num2;}
                        else if (op=="/"){
                            num1 = num1/num2;}
                        else{
                            num1= num1*num2;}
                        Txtop.setText((String)Txtop.getText()+" / "+Txttotal.getText());
                        Txttotal.setText("");
                        op = "/";
                    }
                }
            }
        });

        TextView txtmultiplication = findViewById(R.id.multiplication);
        txtmultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!Txttotal.getText().toString().isEmpty()) {
                    if (op.equals("")) {
                    num1 = Float.parseFloat((String) Txttotal.getText());
                    Txtop.setText(Txttotal.getText());
                    Txttotal.setText("");
                    op = "*";
                    }else{
                        num2 = Float.parseFloat((String)Txttotal.getText());
                        if(op=="+"){
                            num1 = num1+num2;}
                        else if (op=="-"){
                            num1 = num1-num2;}
                        else if (op=="/"){
                            num1 = num1/num2;}
                        else{
                            num1= num1*num2;}
                        Txtop.setText((String)Txtop.getText()+" * "+Txttotal.getText());
                        Txttotal.setText("");
                        op = "*";
                    }
                }
            }
        });

        TextView txtsubtraction = findViewById(R.id.subtraction);
        txtsubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!Txttotal.getText().toString().isEmpty()) {
                    if (op.equals("")) {
                    num1 = Float.parseFloat((String) Txttotal.getText());
                    Txtop.setText(Txttotal.getText());
                    Txttotal.setText("");
                    op = "-";
                    }else{
                        num2 = Float.parseFloat((String)Txttotal.getText());
                        if(op=="+"){
                            num1 = num1+num2;}
                        else if (op=="-"){
                            num1 = num1-num2;}
                        else if (op=="/"){
                            num1 = num1/num2;}
                        else{
                            num1= num1*num2;}
                        Txtop.setText((String)Txtop.getText()+" - "+Txttotal.getText());
                        Txttotal.setText("");
                        op = "-";
                    }
                }
            }
        });

        TextView txtaddition = findViewById(R.id.addition);
        txtaddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!Txttotal.getText().toString().isEmpty()) {
                    if (op.equals("")) {
                    num1 = Float.parseFloat((String) Txttotal.getText());
                    Txtop.setText(Txttotal.getText());
                    Txttotal.setText("");
                    op = "+";
                    }else{
                        num2 = Float.parseFloat((String)Txttotal.getText());
                        if(op=="+"){
                            num1 = num1+num2;}
                        else if (op=="-"){
                               num1 = num1-num2;}
                        else if (op=="/"){
                            num1 = num1/num2;}
                        else{
                            num1= num1*num2;}
                        Txtop.setText((String)Txtop.getText()+" + "+Txttotal.getText());
                        Txttotal.setText("");
                        op = "+";
                    }
                }
            }
        });

        TextView txtequals = findViewById(R.id.equals);
        txtequals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!Txttotal.getText().toString().isEmpty()) {
                    num2 = Float.parseFloat((String) Txttotal.getText());

                    if (op.equals("+")) {
                        Txtop.setText((String)Txtop.getText()+" + "+Txttotal.getText());
                        Txttotal.setText(String.valueOf(num1 + num2));
                    }
                    if (op.equals("-")) {
                        Txtop.setText((String)Txtop.getText()+" - "+Txttotal.getText());
                        Txttotal.setText(String.valueOf(num1 - num2));
                    }
                    if (op.equals("*")) {
                        Txtop.setText((String)Txtop.getText()+" * "+Txttotal.getText());
                        Txttotal.setText(String.valueOf(num1 * num2));
                    }
                    if (op.equals("/")) {
                        Txtop.setText((String)Txtop.getText()+" / "+Txttotal.getText());
                        Txttotal.setText(String.valueOf(num1 / num2));
                    }
                }
            }
        });
    }
    public void calculate(View v){
       TextView tvw = (TextView) v;
       Txttotal.setText((String) Txttotal.getText()+tvw.getText());
    }
}