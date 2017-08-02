package kr.co.tjeit.beautisalon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import kr.co.tjeit.beautisalon.adapters.PortfolioAdapter;
import kr.co.tjeit.beautisalon.datas.Designer;

public class ViewDesignerDetailActivity extends BaseActivity {

    private Designer mDesigner;
    private android.widget.TextView nameTxt;
    private android.widget.TextView genderTxt;
    private android.widget.TextView nickNameTxt;
    private android.widget.TextView ageTxt;
    private android.widget.TextView ratingTxt;
    private android.widget.ImageView star1;
    private android.widget.ImageView star2;
    private android.widget.ImageView star3;
    private android.widget.ImageView star4;
    private android.widget.ImageView star5;
    ArrayList<ImageView> stars = new ArrayList<ImageView>();
    private android.widget.Button checkScheduleBtn;
    private android.widget.Button reservationBtn;
    private android.widget.ListView portfolioListView;
    PortfolioAdapter portfolioAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_designer_detail);
        bindViews();
        setupEvents();
        mDesigner = (Designer) getIntent().getSerializableExtra("designer");
        setValues();
        nameTxt.setText(mDesigner.getName());



        if(mDesigner.getGender() == 0){
            genderTxt.setText(R.string.man);
        }
        else {
            genderTxt.setText(R.string.woman);
        }

    }

    @Override
    public void setupEvents() {
        super.setupEvents();

        checkScheduleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, R.string.ready_to, Toast.LENGTH_SHORT).show();
            }
        });

        reservationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(mContext,MarkReservationActivity.class);
                myIntent.putExtra("designer", mDesigner);
                startActivity(myIntent);
            }
        });

        ;


        // 일정확인 버튼을 누르면, 준비중인 기능입니다. 토스트 띄워주기
        // 예약하러 가기 버튼 -> MakeReservationActivity 생성후 넘겨주기

    }

    @Override
    public void setValues() {
        super.setValues();
        nameTxt.setText(mDesigner.getName());
        genderTxt.setText(mDesigner.getGender()+"");
        ageTxt.setText(mDesigner.getMajorAge()+"");
        nickNameTxt.setText(mDesigner.getNickName());
        ratingTxt.setText(mDesigner.getAvgRating()+"");
        // setText에 String이외의 자료형을 넣으면
        // 코드 작성시에는 에러가 안나지만 실행중에 앱이 뻗게됨
        // String외의 자료형을 넣는다 -> 변수 +""

        portfolioAdapter = new PortfolioAdapter(mContext, mDesigner.getPortfolio());
        portfolioListView.setAdapter(portfolioAdapter);

        int index = (int) mDesigner.getAvgRating();
        for (int i = 0; i < index; i++){

            stars.get(i).setVisibility(View.VISIBLE);
        }



    }

    @Override
    public void bindViews() {
        super.bindViews();

        this.reservationBtn = (Button) findViewById(R.id.reservationBtn);
        this.checkScheduleBtn = (Button) findViewById(R.id.checkScheduleBtn);
        this.portfolioListView = (ListView) findViewById(R.id.portfolioListView);
        this.star5 = (ImageView) findViewById(R.id.star5);
        this.star4 = (ImageView) findViewById(R.id.star4);
        this.star3 = (ImageView) findViewById(R.id.star3);
        this.star2 = (ImageView) findViewById(R.id.star2);
        this.star1 = (ImageView) findViewById(R.id.star1);
        this.ratingTxt = (TextView) findViewById(R.id.ratingTxt);
        this.ageTxt = (TextView) findViewById(R.id.ageTxt);
        this.nickNameTxt = (TextView) findViewById(R.id.nickNameTxt);
        this.genderTxt = (TextView) findViewById(R.id.genderTxt);
        this.nameTxt = (TextView) findViewById(R.id.nameTxt);

        stars.add(star1);
        stars.add(star2);
        stars.add(star3);
        stars.add(star4);
        stars.add(star5);
    }
}
