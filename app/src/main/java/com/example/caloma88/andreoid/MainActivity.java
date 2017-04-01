package com.example.caloma88.andreoid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView vistal;
    Button boton1, boton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vistal = (TextView) findViewById(R.id.View1);
        boton1 = (Button) findViewById(R.id.buttonone);
        boton2 = (Button) findViewById(R.id.buttontwo) ;
        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);
        pepito();
    }
    public void pepito ()
    {
        vistal.setText(" Este texto no se ha modificado :) ");
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.buttonone:
                vistal.setText("oprimimos el boton 1");
                Intent intent1 = new Intent(this, activity2.class);
                startActivity(intent1);
                break;

            case R.id.buttontwo:
                vistal.setText("oprimimos el boton 2");
                break;
            default:
                break;
        }
    }
}
