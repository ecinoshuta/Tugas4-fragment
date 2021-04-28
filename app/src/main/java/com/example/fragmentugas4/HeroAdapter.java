package com.example.fragmentugas4;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class HeroAdapter extends RecyclerView.Adapter<HeroAdapter.viewHolder>{
    private Context context;
    private ArrayList<HeroModel> heroModels;

    public ArrayList<HeroModel> getHeroModels(){
        return heroModels;
    }
    public void setHeroModels(ArrayList<HeroModel> heroModels){
        this.heroModels = heroModels;
    }

    public HeroAdapter(ArrayList<HeroModel> listData, Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public HeroAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hero,parent, false);
        return new viewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull HeroAdapter.viewHolder holder, int position) {
        Glide.with(context).load(getHeroModels().get(position).getLogoHero()).into(holder.iv1);
        holder.tv1.setText(getHeroModels().get(position).getNamaHero());

        holder.share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, getHeroModels().get(position).getPrivew());
                intent.setType("text/plain");
                context.startActivity(Intent.createChooser(intent, "Send To"));
            }
        });
        holder.detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MainActivity2.class);

                intent.putExtra("logo", getHeroModels().get(position).getLogoHero());
                intent.putExtra("nama", getHeroModels().get(position).getNamaHero());
                intent.putExtra("privew", getHeroModels().get(position).getPrivew());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return heroModels.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        private ImageView iv1;
        private TextView tv1;
        private Button share;
        private Button detail;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            iv1 = itemView.findViewById(R.id.iv1);
            tv1 = itemView.findViewById(R.id.tv1);
            share = itemView.findViewById(R.id.btn_share);
            detail = itemView.findViewById(R.id.btn_preview);

        }
    }
}
