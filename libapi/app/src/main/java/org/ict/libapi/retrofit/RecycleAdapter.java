package org.ict.libapi.retrofit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.ict.libapi.R;
import org.ict.libapi.vo.Row;

import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder> {

    List<Row> lapi;

    public RecycleAdapter(List<Row> lapi){
        this.lapi = lapi;
    }

    @NonNull
    @Override
    public RecycleAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View apiView = LayoutInflater.from(parent.getContext()).inflate(R.layout.li,parent,false);
        return new ViewHolder(apiView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Row api = lapi.get(position);
        holder.setItem(api);
    }


    @Override
    public int getItemCount() {
        return lapi.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView title, nm,from,end,place;

        public ViewHolder(View liView){
            super(liView);
            title = liView.findViewById(R.id.title);
            nm = liView.findViewById(R.id.nm);
            from = liView.findViewById(R.id.from);
            end = liView.findViewById(R.id.end);
            place = liView.findViewById(R.id.place);
        }

        public void setItem(Row api){
            title.setText("제목:"+api.getSchdulTitle());
            nm.setText("구분:"+api.getSchdulNm());
            from.setText("날짜 처음:"+api.getDateFrom());
            end.setText("날짜 마지막:"+api.getDateTo());
            place.setText("장소 : " + api.getPlace());
        }
    }

}
