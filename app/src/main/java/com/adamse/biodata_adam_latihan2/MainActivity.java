package com.adamse.biodata_adam_latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnGallery;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGallery = findViewById(R.id.btnGallery);
        btnGallery.setOnClickListener(this);
    }
    public void onClick(View v){

        switch (v.getId()){
            case R.id.btnGallery:
                Intent menujuGaleri = new Intent(MainActivity.this, GalleryActivity.class);
                startActivity(menujuGaleri);
                break;
        }
    }
}
