package vip.irada.calc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String firstValue = "";
    String secondValue = "";
    String tempValue = "";
    String currentOperation = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.ThemeBlack);
        setContentView(R.layout.activity_main);

        findViewById(R.id.switch1).setOnClickListener(v -> {
            recreate();
        });


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
        TextView textOperation = findViewById(R.id.inputOperation);

        switch (v.getId()) {
            case R.id.number1:
                if (tempValue.equals("0")) {
                    tempValue = "";
                }
                tempValue = tempValue + "1";
                textView.setText(tempValue);
                break;
            case R.id.number2:
                if (tempValue.equals("0")) {
                    tempValue = "";
                }
                tempValue = tempValue + "2";
                textView.setText(tempValue);
                break;
            case R.id.number3:
                if (tempValue.equals("0")) {
                    tempValue = "";
                }
                tempValue = tempValue + "3";
                textView.setText(tempValue);
                break;
            case R.id.number4:
                if (tempValue.equals("0")) {
                    tempValue = "";
                }
                tempValue = tempValue + "4";
                textView.setText(tempValue);
                break;
            case R.id.number5:
                if (tempValue.equals("0")) {
                    tempValue = "";
                }
                tempValue = tempValue + "5";
                textView.setText(tempValue);
                break;
            case R.id.number6:
                if (tempValue.equals("0")) {
                    tempValue = "";
                }
                tempValue = tempValue + "6";
                textView.setText(tempValue);
                break;
            case R.id.number7:
                if (tempValue.equals("0")) {
                    tempValue = "";
                }
                tempValue = tempValue + "7";
                textView.setText(tempValue);
                break;
            case R.id.number8:
                if (tempValue.equals("0")) {
                    tempValue = "";
                }
                tempValue = tempValue + "8";
                textView.setText(tempValue);
                break;
            case R.id.number9:
                if (tempValue.equals("0")) {
                    tempValue = "";
                }
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
                if (tempValue == "") {
                    currentOperation = "+";
                    textOperation.setText("+");
                    break;
                }
                if (firstValue != "") {
                    secondValue = String.copyValueOf(tempValue.toCharArray());
                    tempValue = "";
                    firstValue = calculate(firstValue, secondValue, currentOperation);
                    secondValue = "";
                    currentOperation = "+";
                    textOperation.setText("+");
                    textView.setText(firstValue);
                    break;
                }
                //Первый ввод
                firstValue = String.copyValueOf(tempValue.toCharArray());
                tempValue = "";
                currentOperation = "+";
                textOperation.setText("+");
                break;
            case R.id.minus:
                if (tempValue == "") {
                    currentOperation = "-";
                    textOperation.setText("-");
                    break;
                }
                if (firstValue != "") {
                    secondValue = String.copyValueOf(tempValue.toCharArray());
                    tempValue = "";
                    firstValue = calculate(firstValue, secondValue, currentOperation);
                    secondValue = "";
                    currentOperation = "-";
                    textOperation.setText("-");
                    textView.setText(firstValue);
                    break;
                }
                //Первый ввод
                firstValue = String.copyValueOf(tempValue.toCharArray());
                tempValue = "";
                currentOperation = "-";
                textOperation.setText("-");
                break;
            case R.id.division:
                if (tempValue == "") {
                    currentOperation = "/";
                    textOperation.setText("/");
                    break;
                }
                if (firstValue != "") {
                    secondValue = String.copyValueOf(tempValue.toCharArray());
                    tempValue = "";
                    firstValue = calculate(firstValue, secondValue, currentOperation);
                    secondValue = "";
                    currentOperation = "/";
                    textOperation.setText("/");
                    textView.setText(firstValue);
                    break;
                }
                //Первый ввод
                firstValue = String.copyValueOf(tempValue.toCharArray());
                tempValue = "";
                currentOperation = "/";
                textOperation.setText("/");
                break;
            case R.id.multiplication:
                if (tempValue == "") {
                    currentOperation = "x";
                    textOperation.setText("x");
                    break;
                }
                if (firstValue != "") {
                    secondValue = String.copyValueOf(tempValue.toCharArray());
                    tempValue = "";
                    firstValue = calculate(firstValue, secondValue, currentOperation);
                    secondValue = "";
                    currentOperation = "x";
                    textOperation.setText("x");
                    textView.setText(firstValue);
                    break;
                }
                //Первый ввод
                firstValue = String.copyValueOf(tempValue.toCharArray());
                tempValue = "";
                currentOperation = "x";
                textOperation.setText("x");
                break;
            case R.id.enter:
                if (firstValue != "") {
                    if (secondValue == "") {
                        secondValue = String.copyValueOf(tempValue.toCharArray());
                    }
                    tempValue = "";
                    firstValue = calculate(firstValue, secondValue, currentOperation);
                    textView.setText(firstValue);
                    break;
                }
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



            case R.id.backspace:
                    if (tempValue == "0")
                        break;
                    if (tempValue.length() >= 1)
                    {
                        StringBuilder sb = new StringBuilder(tempValue);
                        sb.deleteCharAt(tempValue.length() - 1);
                        tempValue = sb.toString();
                        if (tempValue.length() == 0)
                            tempValue = "0";
                        textView.setText(tempValue);
                    }

                break;


            case R.id.c:
                tempValue = "";
                firstValue = "";
                secondValue = "";
                textOperation.setText("");
                currentOperation = "";
                textView.setText("");
                break;
//
            default:
                break;



       }

    }

    private String calculate(String firstValue, String secondValue, String currentOperation) {
        float firstValueF;
        float secondValueF;
        float resultF;
        String result = "0";
        firstValueF = Float.parseFloat(firstValue);
        secondValueF = Float.parseFloat(secondValue);
        switch (currentOperation) {
            case "+":
                resultF = firstValueF + secondValueF;
                result = Float.toString(resultF);
                break;
            case "-":
                resultF = firstValueF - secondValueF;
                result = Float.toString(resultF);
                break;
            case "x":
                resultF = firstValueF * secondValueF;
                result = Float.toString(resultF);
                break;
            case "/":
                resultF = firstValueF / secondValueF;
                result = Float.toString(resultF);
                break;
        }
        return result;
    }
}