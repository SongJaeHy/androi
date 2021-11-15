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
        private TextView tv1, title, grade, or, pm;

        public ViewHolder(View apiView){
            super(apiView);
            tv1 = apiView.findViewById(R.id.tv1);
            title = apiView.findViewById(R.id.title);
            grade = apiView.findViewById(R.id.grade);
            or = apiView.findViewById(R.id.or);
            pm = apiView.findViewById(R.id.pm);
        }

        public void setItem(Row api){
            tv1.setText("측정소 : " + api.getMsrstename());
            title.setText("환경 지수 :" + api.getMaxindex());
            grade.setText("등급 : " + api.getGrade());
            or.setText("오존:" + api.getOzone());
            pm.setText("미세먼지 : " + api.getPm10());
        }
    }
}
