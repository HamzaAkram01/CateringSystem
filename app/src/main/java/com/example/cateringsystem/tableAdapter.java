package com.example.cateringsystem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class tableAdapter extends RecyclerView.Adapter<tableAdapter.ViewHolder>{

    Context context;
    List<tableModel> list;

    public tableAdapter(Context context, List<tableModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tablelayout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        if(list != null && list.size()>0) {
            holder.amount.setText(list.get(position).getAmount());
            holder.sno.setText(list.get(position).getSno());
            holder.name.setText(list.get(position).getName());
            holder.price.setText(list.get(position).getPrice());
            holder.quan.setText(list.get(position).getQuantity());

        }
        else{
            return;
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView sno,name,price,quan,amount;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            sno = itemView.findViewById(R.id.sno);
            name = itemView.findViewById(R.id.name);
            price = itemView.findViewById(R.id.price);
            quan = itemView.findViewById(R.id.quan);
            amount = itemView.findViewById(R.id.amount);

        }
    }
}