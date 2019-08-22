package com.example.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    DecimalFormat df = new DecimalFormat("##.00");
    public void calculate (View v){
        EditText bill = (EditText) findViewById(R.id.billInput);
        EditText tip = (EditText) findViewById(R.id.tipInput);
        TextView output = (TextView) findViewById(R.id.textView3);
        int billInt = Integer.parseInt(bill.getText().toString());
        int tipInt = Integer.parseInt(tip.getText().toString());
        double total = billInt + billInt * ((double)tipInt/100);
        output.setText("Your bill will be: $" + df.format(total));
    }
}
