package org.ict.replayprj.retrofit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.ict.replayprj.R;
import org.ict.replayprj.VO.Example;

import java.util.List;

public class ReplyAdapter extends RecyclerView.Adapter<ReplyAdapter.ViewHolder> {

    List<Example> replay;

    public ReplyAdapter(List<Example> replay){
        this.replay = replay;
    }

    @NonNull
    @Override
    public ReplyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View replyView = LayoutInflater.from(parent.getContext()).inflate(R.layout.reply, parent, false);
        return new ViewHolder(replyView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Example example = replay.get(position);
        holder.setItem(example);
    }


    @Override
    public int getItemCount() {
        return replay.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private TextView tv1,title, writer;

        public ViewHolder(View itemView){
            super(itemView);
            tv1 = itemView.findViewById(R.id.tv1);
            title = itemView.findViewById(R.id.title);
            writer = itemView.findViewById(R.id.writer);
        }

        public void setItem(Example example){
            tv1.setText(example.getBno() + "번");
            title.setText(example.getReply() + "본문");
            writer.setText(example.getReplyer() + "작성자");
        }
    }

}
