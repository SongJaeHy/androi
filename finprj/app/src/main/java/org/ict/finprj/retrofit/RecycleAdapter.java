package org.ict.finprj.retrofit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.ict.finprj.R;
import org.ict.finprj.VO.Body;
import org.ict.finprj.VO.Example;
import org.ict.finprj.VO.Item;

import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder> {

    List<Body> items;
    String item;

    public RecycleAdapter(List<Body> items, String item){
        this.item = item;
        this.items = items;
    }

    public RecycleAdapter(String stdrYm) {
        stdrYm = "202109";
    }

    public RecycleAdapter(List<String> columns) {
        
    }

    @NonNull
    @Override
    public RecycleAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Body item = items.get(position);
        holder.setItem(item);
    }


    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tv1, title;

        public ViewHolder(View itenView){
            super(itenView);
            tv1 = itenView.findViewById(R.id.tv1);
            title = itenView.findViewById(R.id.title);
        }

        public void setItem(Body item){
            tv1.setText(item.getPageNo());
            title.setText(item.getNumOfRows());
        }

    }
}
