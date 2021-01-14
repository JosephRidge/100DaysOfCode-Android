package com.jayr.day8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>
{
    ArrayList<Contact>contacts= new ArrayList<>() ;
    private Context context;

    public RecyclerViewAdapter(Context context) {
    this.context=context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_list,parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.userName.setText(contacts.get(position).getName());
        holder.userEmail.setText(contacts.get(position).getEmail());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,contacts.get(position).getName() +" Selected.", Toast.LENGTH_SHORT).show();
            }
        });


    }
    public void setContacts(ArrayList<Contact>contacts){
            this.contacts=contacts;
            notifyDataSetChanged(); // this allows you to receive update when the datas et has changed
    }
    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView userName, userEmail;
        RecyclerView recyclerView;
        RelativeLayout relativeLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        userName = itemView.findViewById(R.id.names);
        userEmail = itemView.findViewById(R.id.email);
        relativeLayout = itemView.findViewById(R.id.parent);
        recyclerView = itemView.findViewById(R.id.contRecylView);

        }


    }

}
