package com.example.day6;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter2 extends RecyclerView.Adapter<MyViewHolder>{
    private Context context;
    private List<DataClass> dataList;
    public MyAdapter2(Context context, List<DataClass> dataList){
        this.context = context;
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new MyViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.recImage.setImageResource(dataList.get(position).getDataImage());
        holder.namaImage.setText(dataList.get(position).getDataTitle());

        holder.recCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("Image", dataList.get(holder.getAdapterPosition()).getDataImage());
                intent.putExtra("Title", dataList.get(holder.getAdapterPosition()).getDataTitle());
                intent.putExtra("Judul", dataList.get(holder.getAdapterPosition()).getDataJudul());
                intent.putExtra("Tanggal", dataList.get(holder.getAdapterPosition()).getDataTgl());
                intent.putExtra("Genre", dataList.get(holder.getAdapterPosition()).getDataGenre());
                intent.putExtra("Sutradara", dataList.get(holder.getAdapterPosition()).getDataSutradara());
                intent.putExtra("Bintang", dataList.get(holder.getAdapterPosition()).getDataBintang());
                intent.putExtra("Desc", dataList.get(holder.getAdapterPosition()).getDataDesc());
                context.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
class MyViewHolder extends RecyclerView.ViewHolder{
    ImageView recImage;
    TextView namaImage;
    CardView recCard;
    Button button;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        recImage = itemView.findViewById(R.id.Img_v);
        namaImage = itemView.findViewById(R.id.Name);
        recCard = itemView.findViewById(R.id.recCard);
        button = itemView.findViewById(R.id.btn_share);
    }
}
