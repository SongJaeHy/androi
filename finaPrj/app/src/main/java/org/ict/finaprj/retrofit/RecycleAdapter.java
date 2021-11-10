package org.ict.finaprj.retrofit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.ict.finaprj.R;
import org.ict.finaprj.VO.Body;

import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder> {

    List<Body> item;

    public RecycleAdapter(List<Body> item){
        this.item = item;
    }

    @NonNull
    @Override
    public RecycleAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Body items = item.get(position);
        holder.setItem(items);
    }


    @Override
    public int getItemCount() {
        return item.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tv1;

        public ViewHolder(View itemView){
            super(itemView);
            tv1 = itemView.findViewById(R.id.tv1);
        }

        public void setItem(Body item){
            tv1.setText(item.getPageNo());
        }

    }

}
