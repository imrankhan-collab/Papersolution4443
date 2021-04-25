package com.mids.paper_solution4443.Question4;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mids.paper_solution4443.R;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.holder> {

    String[] Dummy={
            "Dummy Text","Dummy Text","Dummy Text","Dummy Text","Dummy Text","Dummy Text","Dummy Text","Dummy Text","Dummy Text",
            "Dummy Text","Dummy Text","Dummy Text","Dummy Text","Dummy Text","Dummy Text" ,"Dummy Text","Dummy Text","Dummy Text",
            "Dummy Text","Dummy Text","Dummy Text","Dummy Text","Dummy Text","Dummy Text","Dummy Text","Dummy Text","Dummy Text"

    };
    String[] description1={
            "Description","Description","Description","Description","Description","Description","Description","Description",
            "Description","Description","Description","Description","Description","Description","Description","Description",
            "Description", "Description","Description","Description","Description","Description","Description", "Description"
            ,"Description","Description","Description","Description"




    };






    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_question_4,parent,false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
        holder.dummy.setText(Dummy[position]);
        holder.description.setText(description1[position]);



    }

    @Override
    public int getItemCount() {
        return Dummy.length;
    }


    class holder extends RecyclerView.ViewHolder{
        TextView dummy,description;
        ImageView imageView;
        public holder(@NonNull View itemView) {
            super(itemView);

            dummy=(TextView)itemView.findViewById(R.id.dummy_txt);
            description=(TextView)itemView.findViewById(R.id.description);


        }
    }

}
