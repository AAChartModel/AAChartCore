package com.example.anan.AAChartCore.ChartsDemo.AdditionalContent;

import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.example.anan.AAChartCore.R;

public class UpdateChartBackgroundColorActivity extends AppCompatActivity {
    private Button lastSelectedBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_chart_background_color);
    }


    void setupUpdateBackgroundColorButtons() {
        String[] titleArr = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun","Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int titleArrLength = titleArr.length;
        //获取屏幕大小，以合理设定 按钮 大小及位置
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = 100;

        //自定义layout组件
        RelativeLayout layout = new RelativeLayout(this);

        int j = -1;
        for (int i = 0; i < titleArrLength; i++) {
            Button btn = new Button(this);
            btn.setId(i);
            btn.setText(titleArr[i]);
            RelativeLayout.LayoutParams btnParams = new RelativeLayout.LayoutParams((width - 50) / 4, height); //设置按钮的宽度和高度
            //每行放置4个按钮
            if (i % 4 == 0) {
                j++;
            }

            btnParams.leftMargin = 10 + ((width - 50) / 4 + 10) * (i % 4); //横坐标定位
            btnParams.topMargin = 20 + height * j; //纵坐标定位
            layout.addView(btn,btnParams); //将按钮放入layout组件

            btn.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View btn) {
                    int id = btn.getId();

                    if (lastSelectedBtn != null && id != lastSelectedBtn.getId()) {
                        lastSelectedBtn.setBackgroundColor(Color.GRAY);
                    }

                    btn.setBackgroundColor(Color.RED);


                    lastSelectedBtn = (Button) btn;
                }
            });
        }

        this.setContentView(layout);
    }

}
