package com.inception.shoecart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView qty_txt;

    TextView price_txt;

    int qty = 1;

    int size = 7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        qty_txt = findViewById(R.id.qty_txt);
        price_txt = findViewById(R.id.price_txt);

    }


    public void minus_qty(View v)
    {
        if(qty == 0)

        {
            return;
        }

        qty --;

        qty_txt.setText(String.valueOf(qty) );

        price_txt.setText(String.valueOf( 5 * qty));
    }

    public void add_qty(View v)
    {
        if(qty == 5)
        {
            return;
        }
       qty ++;

        qty_txt.setText(String.valueOf( qty ) );

        price_txt.setText(String.valueOf( 5 * qty));


    }

}
