package com.a2mjgroup.buscoenelsur.ViewHolder;

import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.a2mjgroup.buscoenelsur.Interface.ItemClickListener;
import com.a2mjgroup.buscoenelsur.R;

public class NegociosViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView negocio_name;
    public ImageView negocio_image;

    private ItemClickListener itemClickListener;

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener=itemClickListener;
    }

    public NegociosViewHolder(@NonNull View itemView) {
        super(itemView);

        negocio_name = (TextView)itemView.findViewById(R.id.negocio_name);
        negocio_image = (ImageView) itemView.findViewById(R.id.negocio_image);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        itemClickListener.onClick(view,getAdapterPosition(),false);

    }
}
