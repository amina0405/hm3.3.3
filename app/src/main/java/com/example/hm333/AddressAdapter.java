package com.example.hm333;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AddressAdapter extends RecyclerView.Adapter {
    private ArrayList<String> list;


    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContactViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_address,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }


    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        holder.bind(list.get(position));


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ContactViewHolder extends RecyclerView.ViewHolder{
        private TextView contact;

        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);
            contact = itemView.findViewById(R.id.address);
        }

        public void bind(String s) {
            contact.setText(s);
        }
    }
}
