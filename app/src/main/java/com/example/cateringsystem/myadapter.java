package com.example.cateringsystem;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import io.reactivex.rxjava3.annotations.NonNull;

public class myadapter extends FirebaseRecyclerAdapter<model,myadapter.myviewholder> {

    public myadapter(@androidx.annotation.NonNull FirebaseRecyclerOptions<model> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@androidx.annotation.NonNull myviewholder holder, int position, @androidx.annotation.NonNull model model) {
        holder.nametext.setText(model.getName());
        holder.category.setText(model.getCategory());
        Glide.with(holder.img1.getContext()).load(model.getPurl()).into(holder.img1);
        holder.img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppCompatActivity activity =(AppCompatActivity)view.getContext();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.wrapper,new descfragment(model.getName(),model.getCategory(),model.getPurl())).addToBackStack(null).commit();

            }
        });
    }

    @androidx.annotation.NonNull
    @Override
    public myviewholder onCreateViewHolder(@androidx.annotation.NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerowdesign,parent,false);
        return new myviewholder(view);
    }

    public class myviewholder extends RecyclerView.ViewHolder{
        ImageView img1;
        TextView nametext,category;
        public myviewholder(@NonNull View itemView){
            super(itemView);

            img1 =itemView.findViewById(R.id.img1);
            nametext = itemView.findViewById(R.id.nametext);
            category = itemView.findViewById(R.id.category);


        }
    }
}
