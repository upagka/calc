package vip.irada.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String firstValue;
    String secondValue;
    String tempValue = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button number1 = findViewById(R.id.number1);
        number1.setOnClickListener(this);

        Button number2 = findViewById(R.id.number2);
        number2.setOnClickListener(this);

        Button number3 = findViewById(R.id.number3);
        number3.setOnClickListener(this);

        Button number4 = findViewById(R.id.number4);
        number4.setOnClickListener(this);

        Button number5 = findViewById(R.id.number5);
        number5.setOnClickListener(this);

        Button number6 = findViewById(R.id.number6);
        number6.setOnClickListener(this);

        Button number7 = findViewById(R.id.number7);
        number7.setOnClickListener(this);

        Button number8 = findViewById(R.id.number8);
        number8.setOnClickListener(this);

        Button number9 = findViewById(R.id.number9);
        number9.setOnClickListener(this);

        Button zero = findViewById(R.id.zero);
        zero.setOnClickListener(this);

        Button doubleZero = findViewById(R.id.doubleZero);
        doubleZero.setOnClickListener(this);

        Button Clean = findViewById(R.id.c);
        Clean.setOnClickListener(this);

        Button backSpace = findViewById(R.id.backspace);
        backSpace.setOnClickListener(this);

        Button plus = findViewById(R.id.plus);
        plus.setOnClickListener(this);

        Button minus = findViewById(R.id.minus);
        minus.setOnClickListener(this);

        Button percent = findViewById(R.id.percent);
        percent.setOnClickListener(this);

        Button enter = findViewById(R.id.enter);
        enter.setOnClickListener(this);

        Button point = findViewById(R.id.point);
        point.setOnClickListener(this);

        Button division = findViewById(R.id.division);
        division.setOnClickListener(this);

        Button multiplication = findViewById(R.id.multiplication);
        multiplication.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        TextView textView = findViewById(R.id.inputView);

        switch (v.getId()) {
            case R.id.number1:
                tempValue = tempValue + "1";
                textView.setText(tempValue);
                break;
            case R.id.number2:
                tempValue = tempValue + "2";
                textView.setText(tempValue);
                break;
            case R.id.number3:
                tempValue = tempValue + "3";
                textView.setText(tempValue);
                break;
            case R.id.number4:
                tempValue = tempValue + "4";
                textView.setText(tempValue);
                break;
            case R.id.number5:
                tempValue = tempValue + "5";
                textView.setText(tempValue);
                break;
            case R.id.number6:
                tempValue = tempValue + "6";
                textView.setText(tempValue);
                break;
            case R.id.number7:
                tempValue = tempValue + "7";
                textView.setText(tempValue);
                break;
            case R.id.number8:
                tempValue = tempValue + "8";
                textView.setText(tempValue);
                break;
            case R.id.number9:
                tempValue = tempValue + "9";
                textView.setText(tempValue);
                break;
            case R.id.zero:
                if (tempValue.length() == 0) {
                    tempValue = tempValue + "0";
                    textView.setText(tempValue);
                }
                else if (tempValue.contains(".")) {
                    tempValue = tempValue + "0";
                    textView.setText(tempValue);
                    break;
                }
                else if (tempValue.charAt(0) != '0') {
                    tempValue = tempValue + "0";
                    textView.setText(tempValue);
                }
                break;
            case R.id.doubleZero:
                if (tempValue.length() == 0) {
                    tempValue = tempValue + "0";
                    textView.setText(tempValue);
                }
                else if (tempValue.contains(".")) {
                    tempValue = tempValue + "00";
                    textView.setText(tempValue);
                    break;
                }
                else if (tempValue.charAt(0) != '0') {
                    tempValue = tempValue + "00";
                    textView.setText(tempValue);
                }
                break;
            case R.id.plus:
                textView.setText("+");
                break;
            case R.id.minus:
                textView.setText("-");
                break;
            case R.id.division:
                textView.setText(":");
                break;
            case R.id.multiplication:
                textView.setText("x");
                break;
            case R.id.enter:
                textView.setText("=");
                break;
            case R.id.point:
                if (tempValue.length() == 0) {
                    tempValue = "0.";
                    textView.setText(tempValue);
                    break;
                }
                if (!tempValue.contains(".")) {
                    tempValue = tempValue + ".";
                    textView.setText(tempValue);
                }
                break;

            case R.id.percent:
                textView.setText("%");
                break;

//            case R.id.backspace:
//
//                break;
            case R.id.c:
                tempValue = "";
                textView.setText(tempValue);
                break;
//
            default:
                break;



       }

    }
}