package com.example.myapplication000000.ui.adapters;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
//import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication000000.R;
import com.example.practice6.data.models.Drinks2;

import java.util.ArrayList;
import java.util.List;

public class MyCustomListAdapter extends RecyclerView.Adapter<MyCustomListAdapter.MyViewHolder> {

    private List<Drinks2> drinks;
    public MyCustomListAdapter() {
        this.drinks =  new ArrayList<>();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_view, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Drinks2 drinks2 = drinks.get(position);
        holder.name.setText(drinks2.getName());
        holder.ml.setText(drinks2.getDrinks2());
        holder.imageView.setImageResource(drinks2.getImage());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("Name", drinks2.getName());
                bundle.putString("Ml", drinks2.getDrinks2());
                bundle.putInt("Image", drinks2.getImage());
               // Navigation.findNavController(view).navigate(R.id.action_drinks2_list_fragment_to_single_drinks2_fragment, bundle);
            }
        });

    }

    @Override
    public int getItemCount() {
        return drinks.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView ml;
        public TextView name;
        public ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
          //  ml = itemView.findViewById(R.id.item_drink1);
         //   imageView = itemView.findViewById(R.id.item_image);
          //  name = itemView.findViewById(R.id.item_ml);
        }
    }
    public void updateDrinks2(List<Drinks2> books) {
        this.drinks.clear();
        this.drinks = books;
        notifyDataSetChanged();
    }
}

