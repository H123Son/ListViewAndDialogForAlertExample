package com.son.listviewanddialogforalertexample;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SegundaActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        textView = findViewById(R.id.textView);
        String nombrePerro = getIntent().getStringExtra(MiAdaptador.EXTRA_PERRO);
        textView.setText(nombrePerro);

    }
}