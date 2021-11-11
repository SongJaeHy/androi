package org.ict.airapi.retrofit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.ict.airapi.R;
import org.ict.airapi.VO.Row;

import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder> {

    List<Row> apis;

    public RecycleAdapter(List<Row> apis){
        this.apis = apis;
    }

    @NonNull
    @Override
    public RecycleAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View apiView = LayoutInflater.from(parent.getContext()).inflate(R.layout.api, parent, false);
        return new ViewHolder(apiView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Row api = apis.get(position);
        holder.setItem(api);
    }


    @Override
    public int getItemCount() {
        return apis.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tv1, title, grade;

        public ViewHolder(View apiView){
            super(apiView);
            tv1 = apiView.findViewById(R.id.tv1);
            title = apiView.findViewById(R.id.title);
            grade = apiView.findViewById(R.id.grade);
        }

        public void setItem(Row api){
            tv1.setText(api.getMsrstename() + "측정소명");
            title.setText(api.getMaxindex()+"환경지수");
            grade.setText(api.getGrade() + "등급");
        }
    }


}
