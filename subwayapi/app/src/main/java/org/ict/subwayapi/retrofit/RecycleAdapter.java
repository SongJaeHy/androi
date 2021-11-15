package org.ict.subwayapi.retrofit;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.ict.subwayapi.R;
import org.ict.subwayapi.VO.Row;

import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder> {

    List<Row> subways;

    public RecycleAdapter(List<Row> subways){
        this.subways = subways;
    }

    @NonNull
    @Override
    public RecycleAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View suView = LayoutInflater.from(parent.getContext()).inflate(R.layout.subway, parent, false);
        return new ViewHolder(suView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Row subway = subways.get(position);
        holder.setItem(subway);
    }


    @Override
    public int getItemCount() {
        return subways.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView mug, up, ride;

        public ViewHolder(View suView){
            super(suView);
            mug = suView.findViewById(R.id.mug);
            up = suView.findViewById(R.id.up);
            ride = suView.findViewById(R.id.ride);
        }

        public void setItem(Row subway){
            mug.setText("호선명:"+subway.getLineNum());
            up.setText("역:"+subway.getSubStaNm());
            ride.setText(subway.getWorkDt());
        }

    }

}
