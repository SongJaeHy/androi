package org.ict.movieprj.retrofit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.ict.movieprj.R;
import org.ict.movieprj.VO.DailyBoxOffice;

import java.util.List;

// 라시아클러뷰의 어댑터 관련 내용을 정의하는 클래스입니다.
// RecycleView 클래스 내부의 Adapter를 상속해 만듭니다.
public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder> {

    // 반복해서 뷰로 깔아줄 요소를 선언합니다.
    List<DailyBoxOffice> items;

    // 생성자에 뷰로 깔아줄 요소를 입력해야만 실행되도록 파라미터 처리합니다.
    public RecycleAdapter(List<DailyBoxOffice> items){
        this.items = items;
    }

    // Override Methods 를 활용해 onCreateViewHolder를 선언해주세요.
    // 이 메서드는 Layout폴더 내에 있는 리사이클러 뷰의 본체로 활용될
    // 현 프로젝트의 card.xml을 불러옵니다.
    @NonNull
    @Override
    public RecycleAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false);
        return new ViewHolder(itemView);
    }


    // 위에서 불러온 card.xml내부의 카드 한 장 한 장에 DailyBoxOffice에 해당하는
    // 영화 정보를 하나하나 붙여줘야 합니다.
    // onBindViewHolder를 오버라이드합니다.
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // holder에 각각 하나하나의 영화 정보를 바인딩합니다.
        DailyBoxOffice item = items.get(position);
        holder.setItem(item);
    }


    // 출력할 영화 개수 체크
    public  int getItemCount(){
        return  items.size();
    }

    // 클래스의 내부에 ViewHolder 클래스 선언을 하는데 card.xml TextView 3개에 대한 설정을
    // 할 수 있도록 처리해줍니다.
    public static class ViewHolder extends RecyclerView.ViewHolder{
        // card.xml내부에 뚫려있는 구멍을 전부 부품 선언
        private TextView tv1, title, date;

        // 생성자에서 card.xml내부 부품들 연결하기
        public ViewHolder(View itemView){
            super(itemView);
            tv1 = itemView.findViewById(R.id.tv1);
            title = itemView.findViewById(R.id.title);
            date = itemView.findViewById(R.id.date);

        }

        public void setItem(DailyBoxOffice item){
            tv1.setText(item.getRank() + "위");
            title.setText("영화 제목 : " +item.getMovieNm());
            date.setText("개봉일 : " +item.getOpenDt());
        }
    }
}
