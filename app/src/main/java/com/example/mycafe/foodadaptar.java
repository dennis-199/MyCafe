package com.example.mycafe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class foodadaptar extends RecyclerView.Adapter<foodadaptar.ViwHolder>{

    fooddata[] Fooddata;
    Context context;
    public foodadaptar(fooddata[] fooddata, MainActivity activity) {
        this.Fooddata = fooddata;
        this.context = activity;

    }

    @NonNull
    @Override
    public ViwHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.foods_item_list,parent, false);
        ViwHolder viwHolder = new ViwHolder(view);
        return viwHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViwHolder holder, int position) {
        final fooddata fooddtalist = Fooddata[position];
        holder.foodImage.setImageResource(fooddtalist.getFoodImage());
        holder.timetext.setText(fooddtalist.getTime());
        holder.about.setText(fooddtalist.getAbout());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, fooddtalist.getAbout(),Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViwHolder extends RecyclerView.ViewHolder{
        ImageView foodImage;
        TextView timetext;
        TextView about;

        public ViwHolder(@NonNull View itemView) {
            super(itemView);
            foodImage = itemView.findViewById(R.id.imageimage);
            timetext = itemView.findViewById(R.id.timetaken);
            about = itemView.findViewById(R.id.abouttext);
        }
    }
}
