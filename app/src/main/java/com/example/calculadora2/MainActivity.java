package com.example.calculadora2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText dato1, dato2, nombre, apellido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dato1 = findViewById(R.id.dato1);
        dato2 = findViewById(R.id.Dato2);
        nombre = findViewById(R.id.nombre);
        apellido = findViewById(R.id.Apellido);
    }

    public void suma(View view) {
        double num1 = Double.parseDouble(dato1.getText().toString());
        double num2 = Double.parseDouble(dato2.getText().toString());
        double resultado = num1 + num2;
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("nombre", nombre.getText().toString());
        intent.putExtra("apellido", apellido.getText().toString());
        intent.putExtra("resultado", resultado);
        startActivity(intent);
    }

    public void resta(View view) {
        double num1 = Double.parseDouble(dato1.getText().toString());
        double num2 = Double.parseDouble(dato2.getText().toString());
        double resultado = num1 - num2;
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("nombre", nombre.getText().toString());
        intent.putExtra("apellido", apellido.getText().toString());
        intent.putExtra("resultado", resultado);
        startActivity(intent);
    }

    public void multiplicacion(View view) {
        double num1 = Double.parseDouble(dato1.getText().toString());
        double num2 = Double.parseDouble(dato2.getText().toString());
        double resultado = num1 * num2;
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("nombre", nombre.getText().toString());
        intent.putExtra("apellido", apellido.getText().toString());
        intent.putExtra("resultado", resultado);
        startActivity(intent);
    }

    public void division(View view) {
        double num1 = Double.parseDouble(dato1.getText().toString());
        double num2 = Double.parseDouble(dato2.getText().toString());
        double division = num1 / num2;
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("nombre", nombre.getText().toString());
        intent.putExtra("apellido", apellido.getText().toString());
        intent.putExtra("resultado", division);
        startActivity(intent);
    }


    public void Fibonacci(View view) {
        int n = Integer.parseInt(dato1.getText().toString());
        int fibonacci = fibonacci(n);
        Intent intent = new Intent(MainActivity.this, ResultActivity.class);
        intent.putExtra("resultado", fibonacci);
        startActivity(intent);

    }

    private int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int prev1 = 0;
        int prev2 = 1;
        int fib = 0;
        for (int i = 2; i <= n; i++) {
            fib = prev1 + prev2;
            prev2 = prev1;
            prev1 = fib;
        }
        return fib;
    }


    public void Factorial(View view) {
        int base = Integer.parseInt(dato1.getText().toString());
        int expo = Integer.parseInt(dato2.getText().toString());
        int poten = (int) Math.pow(base, expo);
        Intent intent = new Intent(MainActivity.this, ResultActivity.class);
        intent.putExtra("resultado", poten);
        startActivity(intent);
    }
}
