package com.example.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemViewHolder extends RecyclerView.ViewHolder {
    ImageView image;
    TextView title;
    TextView description;
    LinearLayout post;
    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);
        image=itemView.findViewById(R.id.image);
        title=itemView.findViewById(R.id.title);
        description=itemView.findViewById(R.id.description);
        post=itemView.findViewById(R.id.item);
    }
}
