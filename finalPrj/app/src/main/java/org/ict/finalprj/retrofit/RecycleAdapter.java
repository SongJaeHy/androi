package org.ict.finalprj.retrofit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.ict.finalprj.R;
import org.ict.finalprj.VO.Body;
import org.ict.finalprj.VO.Header;

import java.util.ArrayList;
import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder> {

    List<Object> items;

    public RecycleAdapter(List<Object> items){
        this.items = items;
    }

    @NonNull
    @Override
    public RecycleAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tv1, title, page;

        public ViewHolder(View itemView){
            super(itemView);
            tv1 = itemView.findViewById(R.id.tv1);
            title = itemView.findViewById(R.id.title);
            page = itemView.findViewById(R.id.page);
        }

        public void setItem(Body item){
            tv1.setText(item.getTotalCount());
            title.setText(item.getNumOfRows());
            page.setText(item.getPageNo() + "페이지");
        }
    }


}
