package com.adamse.biodata_adam_latihan2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewPhotoAdapter extends RecyclerView.Adapter<CardViewPhotoAdapter.CardViewViewHolder> {
    private ArrayList<Photo> listPhoto;

    public CardViewPhotoAdapter(ArrayList<Photo> list) {
        this.listPhoto = list;
    }
    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_gallery, viewGroup, false);
        return new CardViewViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int posisi) {
        Photo photo = listPhoto.get(posisi);

        Glide.with(holder.itemView.getContext())
                .load(photo.getPhoto())
                .apply(new RequestOptions().override(350,550))
                .into(holder.imgPhoto);

        holder.tvName.setText(photo.getName());
        holder.tvDetail.setText(photo.getDetail());

        holder.btnFavorite.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(holder.itemView.getContext(), "Favorite " +
                        listPhoto.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
            }
        });

        holder.btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Share " +
                        listPhoto.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return listPhoto.size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgPhoto;
        private TextView tvName, tvDetail;
        private Button btnFavorite, btnShare;
        public CardViewViewHolder(@NonNull View itemView){
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            btnFavorite = itemView.findViewById(R.id.btn_set_favorite);
            btnShare = itemView.findViewById(R.id.btn_set_share);

        }
    }
}
