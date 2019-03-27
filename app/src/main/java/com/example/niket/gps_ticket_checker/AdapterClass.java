package com.example.niket.gps_ticket_checker;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.UsersViewHolder> {
    ArrayList<Users> list;
    public AdapterClass(ArrayList<Users> list){
        this.list=list;
    }
    @NonNull
    @Override
    public UsersViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.list_layout, viewGroup, false);

        return new UsersViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UsersViewHolder holder, int i) {
        holder.user_name.setText(list.get(i).getName());
        holder.user_status.setText(list.get(i).getStatus());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class UsersViewHolder extends RecyclerView.ViewHolder {


        TextView user_name,user_status;

        public UsersViewHolder(View itemView) {
            super(itemView);
            user_name=itemView.findViewById(R.id.name_text);
            user_status = itemView.findViewById(R.id.status_text);

        }






    }
}
