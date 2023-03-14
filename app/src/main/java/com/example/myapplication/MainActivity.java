package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView textResult = findViewById(R.id.result);
        EditText num1 = findViewById(R.id.f_num);
        EditText num2 = findViewById(R.id.s_num);
        Button btn_sum = findViewById(R.id.add);
        Button btn_minus = findViewById(R.id.minus);
        Button btn_div = findViewById(R.id.div);
        Button btn_mult = findViewById(R.id.mult);

        btn_sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                double sum = number1 + number2;
                textResult.setText(Double.toString(sum));

            }
}


        );
        btn_minus.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           double number1 = Double.parseDouble(num1.getText().toString());
                                           double number2 = Double.parseDouble(num2.getText().toString());
                                           double diff = number1 - number2;
                                           textResult.setText(Double.toString(diff));

                                       }
                                   }


        );
        btn_div.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View view) {
                                             double number1 = Double.parseDouble(num1.getText().toString());
                                             double number2 = Double.parseDouble(num2.getText().toString());
                                             double quot = number1 / number2;
                                             textResult.setText(Double.toString(quot));

                                         }
                                     }


        );
        btn_mult.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View view) {
                                             double number1 = Double.parseDouble(num1.getText().toString());
                                             double number2 = Double.parseDouble(num2.getText().toString());
                                             double pro= number1 * number2;
                                             textResult.setText(Double.toString(pro));

                                         }
                                     }


        );
        Button btn_clear = findViewById(R.id.button13);
        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1.setText(" ");
                num2.setText(" ");
                textResult.setText(" ");
            }
        });
    }

}

