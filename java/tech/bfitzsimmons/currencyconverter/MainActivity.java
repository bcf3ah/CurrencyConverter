package tech.bfitzsimmons.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){
        Spinner fromSpinner =(Spinner) findViewById(R.id.fromSpinner);
        String fromCurrencyString = fromSpinner.getSelectedItem().toString();
        Spinner toSpinner =(Spinner) findViewById(R.id.toSpinner);
        String toCurrencyString = toSpinner.getSelectedItem().toString();
        EditText input = (EditText) findViewById(R.id.input);
        double inputNum = Double.parseDouble(input.getText().toString());
        double result = 0;

        switch (fromCurrencyString){
            case "USD":
                switch (toCurrencyString){
                    case "KRW":
                        result = inputNum*1133.90;
                        break;
                    case "YEN":
                        result = inputNum*111.27;
                        break;
                    case "EURO":
                        result = inputNum*0.89;
                }
                break;
            case "KRW":
                switch (toCurrencyString){
                    case "USD":
                        result = inputNum*0.00088;
                        break;
                    case "YEN":
                        result = inputNum*0.098;
                        break;
                    case "EURO":
                        result = inputNum*0.00079;
                }
                break;
            case "YEN":
                switch (toCurrencyString){
                    case "KRW":
                        result = inputNum*10.19;
                        break;
                    case "USD":
                        result = inputNum*0.0090;
                        break;
                    case "EURO":
                        result = inputNum*0.0080;
                }
                break;
            case "EURO":
                switch (toCurrencyString){
                    case "KRW":
                        result = inputNum*1270.36;
                        break;
                    case "YEN":
                        result = inputNum*124.6;
                        break;
                    case "USD":
                        result = inputNum*1.12;
                }
                break;
            default:
                result = 0;
        }

        Toast.makeText(this, String.format("%.2f", result), Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
