package com.a2mjgroup.buscoenelsur;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnEsp, btnEng, btnPor;
    TextView txtLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEsp = (Button)findViewById(R.id.btnEsp);
        btnEng = (Button)findViewById(R.id.btnEng);
        btnPor = (Button)findViewById(R.id.btnPor);

        txtLogo = (TextView)findViewById(R.id.txtLogo);

        Typeface text = Typeface.createFromAsset(getAssets(),"fonts/RobotoSlab-Bold.ttf");
        txtLogo.setTypeface(text);

        btnEsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Home.class);
                startActivity(intent);
            }
        });

    }
}
