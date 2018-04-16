package com.jswym.cloud.statistics;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.google.gson.Gson;
import com.jswym.utils.LoggerUtils;

/**
 * Created by AnAn on 2017/9/8.
 */

public class AAChartView extends WebView {

    public Float contentWidth;
    public Float contentHeight;
    public Boolean chartSeriesHidden;
    public String testTheAutoGenerateGetMethod;

    private String optionsJson;

    public AAChartView(Context context) {
        super(context);
        sharedConstructor();


    }

    public AAChartView(Context context, AttributeSet attrs) {
        super(context, attrs);
        sharedConstructor();
    }

    public AAChartView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        sharedConstructor();
    }

    private void sharedConstructor() {
        // Do some initialize work.
        this.contentWidth = 320.f;
        this.contentHeight = 350.f;
//        //设置WebView支持JavaScript(这一句是十分关键的一句)
//        this.getSettings().setJavaScriptEnabled(true);
//        this.loadUrl("file:///android_asset/AAChartView.html");//神奇了,这个方法写在aa_drawChartWithChartModel方法里面就不行,难道是因为不能在还未加载成功的时候就直接调用 JS 方法?(跟 OC 一样)必须在加载完成后的代理里面调用 JS 方法

    }

    public void aa_drawChartWithChartModel(final AAChartModel chartModel){
        //设置WebView支持JavaScript(这一句是十分关键的一句)
        this.getSettings().setJavaScriptEnabled(true);
        this.loadUrl("file:///android_asset/AAChartView.html");//神奇了,这个方法写在aa_drawChartWithChartModel方法里面就不行,难道是因为不能在还未加载成功的时候就直接调用 JS 方法?(跟 OC 一样)必须在加载完成后的代理里面调用 JS 方法

            this.setWebViewClient(new WebViewClient()
            {
                @Override
                public void onPageFinished(WebView view,String url)
                {
                    System.out.println("图表加载完成!!!!!!!! ");
//                            configureTheChartModelAndDrawChart(chartModel);
        drawChartWithChartModel(chartModel);
                }
            });



        // 将对象编译成json
        Gson gson = new Gson();
        optionsJson = gson.toJson(chartModel);
        LoggerUtils.verbose("aa", "获得了最后的字符串 Options "+optionsJson);

        this.loadUrl("javascript:loadTheHighChartView('" + optionsJson + "', '" + 320 + "', '" + 380 + "')");

    }

    private void drawChartWithChartModel(AAChartModel chartModel) {

        // 将对象编译成json
        Gson gson = new Gson();
        optionsJson = gson.toJson(chartModel);
        System.out.println("获得了最后的字符串 Options "+optionsJson);

//        this.loadUrl("javascript:loadTheHighChartView('" + optionsJson + "','" + contentWidth + "','" + contentHeight + "',)");
        this.loadUrl("javascript:loadTheHighChartView('" + optionsJson + "','" + 320 + "','" + 380 + "')");




    }


    public void aa_refreshChartWithChartModel(AAChartModel chartModel){
        // 将对象编译成json
        Gson gson = new Gson();
        String newOptions = gson.toJson(chartModel);
         this.loadUrl("javascript:loadTheHighChartView('" + newOptions + "','" + contentWidth + "','" + contentHeight + "')");
    }

    public void aa_onlyRefreshTheChartDataWithChartModel(AAChartModel chartModel){
        // 将对象编译成json
        Gson gson = new Gson();
        String newOptions = gson.toJson(chartModel);
        this.loadUrl("javascript:onlyRefreshTheChartDataWithAAChartModel('" + newOptions + "','" + contentWidth + "','" + contentHeight + "')");
    }



}
