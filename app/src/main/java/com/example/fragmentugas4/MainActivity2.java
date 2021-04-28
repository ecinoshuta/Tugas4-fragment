package com.example.fragmentugas4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MainActivity2 extends AppCompatActivity {
    TextView tv3, tvpreview3;
    ImageView iv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        iv3 = findViewById(R.id.iv2);
        tv3 = findViewById(R.id.tv2);
        tvpreview3 = findViewById(R.id.tvpreview);

        int logoHero = getIntent().getIntExtra("logo", 0);
        String namHero = getIntent().getStringExtra("nama");
        String previewHero = getIntent().getStringExtra("privew");

        Glide.with(this).asBitmap().load(logoHero).into(iv3);
        tv3.setText(namHero);
        tvpreview3.setText(previewHero);

    }

    public void Kembali(View view) {
        Intent intent = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(intent);
    }
}