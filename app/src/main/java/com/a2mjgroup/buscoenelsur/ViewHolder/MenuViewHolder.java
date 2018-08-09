package com.a2mjgroup.buscoenelsur.ViewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.a2mjgroup.buscoenelsur.Interface.ItemClickListener;
import com.a2mjgroup.buscoenelsur.R;

public class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public MenuViewHolder(@NonNull View itemView) {
        super(itemView);

        txtMenuName=(TextView)itemView.findViewById(R.id.menu_name);
        imageView=(ImageView)itemView.findViewById(R.id.menu_image);

        itemView.setOnClickListener(this);
    }

    public TextView txtMenuName;
    public ImageView imageView;

    private ItemClickListener itemClickListener;

    @Override
    public void onClick(View view) {

    }
}
