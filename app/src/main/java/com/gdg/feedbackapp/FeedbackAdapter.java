package com.gdg.feedbackapp;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FeedbackAdapter extends RecyclerView.Adapter<FeedbackAdapter.FeedBackViewHolder> {

ArrayList<GDGFeedback> gdgFeedbackList;
Context context;

public FeedbackAdapter(ArrayList<GDGFeedback>feedbackList){

    gdgFeedbackList = feedbackList;
    GDGFeedback g =
            new GDGFeedback("Sourabh","studebt",1,"graduate","good",20,true);
gdgFeedbackList.add(g);
}

  class FeedBackViewHolder extends  RecyclerView.ViewHolder{

    TextView name,occupation,qualification,rating;
      public FeedBackViewHolder( View itemView) {
          super(itemView);
          name = (TextView)itemView.findViewById(R.id.nameTV);
          occupation=(TextView)itemView.findViewById(R.id.occupationTV);
          qualification=(TextView)itemView.findViewById(R.id.qualificationTV);
          rating=(TextView)itemView.findViewById(R.id.ratingTV);

      }
  }

    @Override
    public FeedBackViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
    View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new FeedBackViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(FeedBackViewHolder holder, int position) {

      GDGFeedback gf = gdgFeedbackList.get(position);
      holder.rating.setText(gf.rating+"");
      holder.qualification.setText(gf.qualification);
      holder.occupation.setText(gf.occupation);
      holder.name.setText(gf.name+", "+gf.age);
    }

    @Override
    public int getItemCount() {
        return gdgFeedbackList.size();
    }
}
