package com.example.basiccal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//On create sadece uygulama ilk başladığında ki aktivitemiz olduğu için görünümleri
// orada değil global değişkende tanımlıyoruz.Sonra her bir işlem metodu içinde kullanacağız.
    EditText numtext1;
    EditText numtext2;
    TextView resultext;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numtext1 = findViewById(R.id.num);
        numtext2 = findViewById(R.id.num2);
        resultext = findViewById(R.id.result);



    }
//İşlemlerimizi yapacağımız sınıflarımızı tanımlıyoruz.
    public void summit(View view){
        int number1 = Integer.parseInt(numtext1.getText().toString());
        int number2 = Integer.parseInt(numtext2.getText().toString());
        int result = number1 + number2;
        resultext.setText("Result: " + result);
    }
    public void deduct(View view){
        int number1 = Integer.parseInt(numtext1.getText().toString());
        int number2 = Integer.parseInt(numtext2.getText().toString());
        int result = number1 - number2;
        resultext.setText("Result: " + result);

    }

    public void multiply(View view){
        int number1 = Integer.parseInt(numtext1.getText().toString());
        int number2 = Integer.parseInt(numtext2.getText().toString());
        int result = number1 * number2;
        resultext.setText("Result: " + result);

    }
    public void divide(View view){
        int number1 = Integer.parseInt(numtext1.getText().toString());
        int number2 = Integer.parseInt(numtext2.getText().toString());
        int result = number1 / number2;
        resultext.setText("Result: " + result);

    }


}
