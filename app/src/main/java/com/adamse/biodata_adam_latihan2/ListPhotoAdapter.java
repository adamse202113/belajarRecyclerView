package com.adamse.biodata_adam_latihan2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListPhotoAdapter extends RecyclerView.Adapter<ListPhotoAdapter.ListViewHolder> {
    private ArrayList<Photo> listPhoto;
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_gallery, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int posisi) {
        Photo photo = listPhoto.get(posisi);

        Glide.with(holder.itemView.getContext())
                .load(photo.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);

        holder.tvName.setText(photo.getName());
        holder.tvDetail.setText(photo.getDetail());
    }

    @Override
    public int getItemCount() {
        return listPhoto.size();
    }

    public ListPhotoAdapter(ArrayList<Photo> list){
        this.listPhoto = list ;
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

        public ImageView imgPhoto;
        public TextView tvName, tvDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}
