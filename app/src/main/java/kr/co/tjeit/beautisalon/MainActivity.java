package kr.co.tjeit.beautisalon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Set;

import kr.co.tjeit.beautisalon.adapters.DesignerAdapter;
import kr.co.tjeit.beautisalon.datas.DesignCase;
import kr.co.tjeit.beautisalon.datas.Designer;
import kr.co.tjeit.beautisalon.utills.GeneralUtill;

public class MainActivity extends BaseActivity {


    private android.widget.ListView designerListView;
    private DesignerAdapter designerAdapter;

    // 일반 사용자가 로그인했을때 나타나는 화면

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
        setValues();
        setupEvents();

    }

    @Override
    public void setupEvents() {
        super.setupEvents();
        designerListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Designer tempDesigner = GeneralUtill.designers.get(position);
//                Toast.makeText(mContext, tempDesigner.getName(), Toast.LENGTH_SHORT).show();

                // 각 줄을 클릭하면, 클릭된 줄의 디자이너의 본명을 출력

                // 아이템을 누르면 디자이너 상세 화면으로 넘겨주기

                Intent myIntent = new Intent(mContext, ViewDesignerDetailActivity.class);
                myIntent.putExtra("designer", tempDesigner);
                startActivity(myIntent);



            }
        });
    }



    @Override
    public void setValues() {
        super.setValues();
        designerAdapter = new DesignerAdapter(mContext, GeneralUtill.designers);

        designerListView.setAdapter(designerAdapter);

    }

    @Override
    public void bindViews() {
        super.bindViews();

        this.designerListView = (ListView) findViewById(R.id.designerListView);
    }
}
