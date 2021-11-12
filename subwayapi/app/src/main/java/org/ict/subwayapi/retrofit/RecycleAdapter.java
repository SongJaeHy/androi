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
        private TextView t1, mug, up;

        public ViewHolder(View suView){
            super(suView);
            t1 = suView.findViewById(R.id.t1);
            mug = suView.findViewById(R.id.mug);
            up = suView.findViewById(R.id.up);
        }

        public void setItem(Row subway){
            t1.setText(subway.getUseDt());
            mug.setText(subway.getLineNum());
            up.setText(subway.getSubStaNm());
        }

    }

}
