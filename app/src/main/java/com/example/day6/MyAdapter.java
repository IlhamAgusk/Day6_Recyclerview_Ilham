//package com.example.day6;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.ArrayList;
//
//public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
//
//    private ArrayList<Image_model> image_models;
//
//    public MyAdapter(ArrayList<Image_model> image_models) {
//        this.image_models = image_models;
//    }
//
//    @NonNull
//    @Override
//    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
//        ViewHolder vh = new ViewHolder(view);
//        return vh;
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
//        holder.namaImage.setText(image_models.get(position).getNamaImage());
//        holder.Image.setImageResource(image_models.get(position).getImage());
//    }
//
//    @Override
//    public int getItemCount() {
//        return image_models.size();
//    }
//
//    public static class ViewHolder extends RecyclerView.ViewHolder {
//
//        TextView namaImage;
//        ImageView Image;
//
//
//        public ViewHolder(@NonNull View itemView) {
//            super(itemView);
//
//            namaImage = itemView.findViewById(R.id.Name);
//            Image = itemView.findViewById(R.id.Img_v);
//        }
//    }
//}
