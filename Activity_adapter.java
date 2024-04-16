package com.example.recyclermgm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Activity_adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final Context context;
    private final List<Activity> act;

    public Activity_adapter(Context context, List<Activity> act){
        this.context = context;
        this.act = act;
    }

    public static class ListHolder extends RecyclerView.ViewHolder{

        private final TextView tvID, tvActivity, tvTime;

        public ListHolder(@NonNull View itemView) {
            super(itemView);
            this.tvID = itemView.findViewById(R.id.tvID);
            this.tvActivity = itemView.findViewById(R.id.tvActivity);
            this.tvTime = itemView.findViewById(R.id.tvTime);
        }
    }

    @NonNull
    @Override
    public ListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View vh = LayoutInflater.from(this.context)
                .inflate(R.layout.row_list, parent, false);
        return new ListHolder(vh);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Activity c = this.act.get(position);
        ListHolder vh = (ListHolder) holder;
        vh.tvID.setText(c.getId());
        vh.tvActivity.setText(c.getWhat());
        vh.tvTime.setText(c.getTime());
    }

    @Override
    public int getItemCount() {
        return this.act.size();
    }
}
