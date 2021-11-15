package org.ict.smallapi.retrofit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.ict.smallapi.R;
import org.ict.smallapi.vo.Row;

import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder> {

    List<Row> sapi;

    public RecycleAdapter(List<Row> sapi){
        this.sapi = sapi;
    }

    @NonNull
    @Override
    public RecycleAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View apiView = LayoutInflater.from(parent.getContext()).inflate(R.layout.sapi,parent,false);
        return new ViewHolder(apiView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Row api = sapi.get(position);
        holder.setItem(api);
    }


    @Override
    public int getItemCount() {
        return sapi.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tv1, ad, time, date;

        public ViewHolder(View sapiView){
            super(sapiView);
            tv1 = sapiView.findViewById(R.id.tv1);
            ad = sapiView.findViewById(R.id.ad);
            time = sapiView.findViewById(R.id.time);
            date = sapiView.findViewById(R.id.date);
        }

        public void setItem(Row api){
            tv1.setText("도서관명 : "+api.getLbrryName());
            ad.setText("주소 : " +api.getAdres());
            time.setText("운영 시간 : "+api.getOpTime());
            date.setText("휴관일 : "+api.getFdrmCloseDate());
        }
    }


}
