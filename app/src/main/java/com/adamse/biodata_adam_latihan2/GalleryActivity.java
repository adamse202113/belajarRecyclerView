package com.adamse.biodata_adam_latihan2;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class GalleryActivity extends AppCompatActivity {
    private RecyclerView rv_photo;
    private ArrayList<Photo> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        rv_photo = findViewById(R.id.rv_gallery);
        rv_photo.setHasFixedSize(true);


        list.addAll(PhotoData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rv_photo.setLayoutManager(new LinearLayoutManager(this));
        ListPhotoAdapter listPhotoAdapter = new ListPhotoAdapter(list);
        rv_photo.setAdapter(listPhotoAdapter);
    }
    private void showRecyclerGrid() {
        rv_photo.setLayoutManager(new GridLayoutManager(this, 2));
        GridPhotoAdapter gridPhotoAdapter = new GridPhotoAdapter(list);
        rv_photo.setAdapter(gridPhotoAdapter);
    }
    private void showRecyclerCardView(){
        rv_photo.setLayoutManager(new LinearLayoutManager(this));
        CardViewPhotoAdapter cardViewHeroAdapter = new CardViewPhotoAdapter(list);
        rv_photo.setAdapter(cardViewHeroAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int selectedMode) {
        switch (selectedMode){
            case R.id.action_list:
                showRecyclerList();
                break;
            case R.id.action_grid:
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                showRecyclerCardView();
                break;
        }
    }
}
