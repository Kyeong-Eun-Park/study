package com.example.and0515_contextmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout baseLayout;
    ImageView iv;
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        baseLayout = findViewById(R.id.baseLayout);
        iv = findViewById(R.id.iv);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);

        // 컨텍스트 메뉴를 위젯에 등록하기 위해서는
        // registerForContextMenu() 메서드를 호출하여 파라미터로 위젯 객체를 전달
        registerForContextMenu(btn1);
        registerForContextMenu(btn2);
    }

    // onCreateContextMenu() 메서드를 오버라이딩하여 해당 위젯에 메뉴 표시

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater menuInflater = getMenuInflater();
        if(v == btn1){
            menuInflater.inflate(R.menu.menu1, menu);
            menu.setHeaderTitle("배경색 선택");
        } else if(v == btn2){
            menuInflater.inflate(R.menu.menu2, menu);
            menu.setHeaderTitle("이미지 작업 선택");
        }

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        return super.onContextItemSelected(item);

        switch (item.getItemId()) {
            case R.id.itemRed: baseLayout.setBackgroundColor(Color.RED); break;
            case R.id.itemGreen: baseLayout.setBackgroundColor(Color.GREEN); break;
            case R.id.itemBlue: baseLayout.setBackgroundColor(Color.BLUE); break;
            case R.id.itemRotate: iv.setRotation(iv.getRotation() + 30); break;
            case R.id.itemExpand: iv.setScaleX(iv.getScaleX() + 1); iv.setScaleY(iv.getScaleY() + 1); break;


        }
        return true;
    }
}


