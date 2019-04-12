package com.car_design_rakesh;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnCreateCar;
    private EditText etMake, etYear, etColor, etPrice, etEngine;
    private TextView tvOutput;
    private int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etMake = findViewById(R.id.etCarMake);
        etYear = findViewById(R.id.etYear);
        etColor = findViewById(R.id.etColor);
        etPrice = findViewById(R.id.etPrice);
        etEngine = findViewById(R.id.etEngine);
        tvOutput = findViewById(R.id.tvOutput);
        btnCreateCar = findViewById(R.id.btnCreateCar);
        btnCreateCar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        i++;
        String manu=etMake.getText().toString();
        int year=Integer.parseInt(etYear.getText().toString());
        float price=Float.parseFloat(etPrice.getText().toString());
        float size=Float.parseFloat(etEngine.getText().toString());
        tvOutput.append( "This is vehicle No." +i + "\n" + "Manufacturer: " + manu + " Current value: " +
                price + " Effective engine size: " + size + "\n");
    }
}

