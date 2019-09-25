package com.adamse.biodata_adam_latihan2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridPhotoAdapter extends RecyclerView.Adapter<GridPhotoAdapter.GridViewHolder> {
    private ArrayList<Photo> listPhoto;

    public GridPhotoAdapter(ArrayList<Photo> list){
        this.listPhoto = list;
    }

    @NonNull
    @Override

    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_grid_gallery, viewGroup, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridPhotoAdapter.GridViewHolder holder, int posisi) {
        Glide.with(holder.itemView.getContext())
                .load(listPhoto.get(posisi).getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return listPhoto.size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        public GridViewHolder(@NonNull View itemView){
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);

        }
    }
}

