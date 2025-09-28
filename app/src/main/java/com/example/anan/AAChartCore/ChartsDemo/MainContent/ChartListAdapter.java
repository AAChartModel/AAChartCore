package com.example.anan.AAChartCore.ChartsDemo.MainContent;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.anan.AAChartCore.ChartsDemo.ChartListProvider.ChartCategories;
import com.example.anan.AAChartCore.R;
import com.github.AAChartModel.AAChartCore.AAChartCreator.AAChartModel;
import com.github.AAChartModel.AAChartCore.AAChartCreator.AAChartView;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAOptions;

import java.util.Locale;

public class ChartListAdapter extends RecyclerView.Adapter<ChartListAdapter.ChartViewHolder> {

    private final Context mContext;
    private final String mCategoryKey;
    private final AAChartModel[] mChartModels;
    private final AAOptions[] mChartOptions;
    private final String[] mChartOptionTitles;
    private final boolean isOptionsMode;

    public ChartListAdapter(Context context, String categoryKey, AAChartModel[] chartModels) {
        this.mContext = context;
        this.mCategoryKey = categoryKey;
        this.mChartModels = chartModels;
        this.mChartOptions = null;
        this.mChartOptionTitles = null;
        this.isOptionsMode = false;
    }

    public ChartListAdapter(Context context, String categoryKey, AAOptions[] chartOptions) {
        this(context, categoryKey, generateDefaultTitles(chartOptions != null ? chartOptions.length : 0), chartOptions);
    }

    public ChartListAdapter(Context context, String categoryKey, String[] chartOptionTitles, AAOptions[] chartOptions) {
        this.mContext = context;
        this.mCategoryKey = categoryKey;
        this.mChartModels = null;
        this.mChartOptions = chartOptions;
        this.mChartOptionTitles = chartOptionTitles;
        this.isOptionsMode = true;
    }

    @NonNull
    @Override
    public ChartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.list_item_chart, parent, false);
        return new ChartViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChartViewHolder holder, int position) {
    holder.chartIndex.setText(String.format(Locale.getDefault(), "#%02d", position + 1));
        holder.chartMeta.setText(buildMetaLabel(position));

        if (isOptionsMode && mChartOptions != null) {
            AAOptions chartOption = mChartOptions[position];
        String title = (mChartOptionTitles != null && position < mChartOptionTitles.length)
            ? mChartOptionTitles[position]
            : String.format(Locale.getDefault(), "%s %02d", getCategoryDisplayName(mCategoryKey, true), position + 1);
            holder.chartTitle.setText(title);
            holder.chartView.aa_drawChartWithChartOptions(chartOption);
        } else if (mChartModels != null) {
            AAChartModel chartModel = mChartModels[position];
        String title = !TextUtils.isEmpty(chartModel.title)
            ? chartModel.title
            : String.format(Locale.getDefault(), "%s 示例 %02d", getCategoryDisplayName(mCategoryKey, false), position + 1);
            holder.chartTitle.setText(title);
            holder.chartView.aa_drawChartWithChartModel(chartModel);
        }
    }

    @Override
    public int getItemCount() {
        if (isOptionsMode) {
            return mChartOptions != null ? mChartOptions.length : 0;
        } else {
            return mChartModels != null ? mChartModels.length : 0;
        }
    }

    private String buildMetaLabel(int position) {
        String categoryName = getCategoryDisplayName(mCategoryKey, isOptionsMode);
        if (isOptionsMode) {
            return categoryName != null ? categoryName + " · AAOptions" : "AAOptions 示例";
        }

        if (mChartModels != null && position < mChartModels.length) {
            AAChartModel chartModel = mChartModels[position];
            String chartType = !TextUtils.isEmpty(chartModel.chartType) ? chartModel.chartType : "AAChartModel";
            return categoryName != null ? categoryName + " · " + chartType : chartType;
        }
        return categoryName != null ? categoryName : "AAChartModel";
    }

    private String getCategoryDisplayName(String categoryKey, boolean isOptions) {
        if (categoryKey == null) {
            return isOptions ? "图表选项" : "图表示例";
        }
        switch (categoryKey) {
            case ChartCategories.BASIC:
                return "基础图表";
            case ChartCategories.SPECIAL:
                return "特殊图表";
            case ChartCategories.MIXED:
                return "混合图表";
            case ChartCategories.CUSTOM:
                return "自定义样式";
            case ChartCategories.OPTIONS:
                return "图表选项";
            case ChartCategories.JS_AXIS:
                return "JS 函数 · 坐标轴";
            case ChartCategories.JS_TOOLTIP:
                return "JS 函数 · Tooltip";
            case ChartCategories.JS_LEGEND:
                return "JS 函数 · Legend";
            case ChartCategories.JS_OPTIONS:
                return "JS 函数 · Options";
            case ChartCategories.JS_CHART_EVENTS:
                return "JS 函数 · Chart Events";
            default:
                return isOptions ? "图表选项" : "图表示例";
        }
    }

    private static String[] generateDefaultTitles(int count) {
        String[] titles = new String[count];
        for (int i = 0; i < count; i++) {
            titles[i] = "Chart Options " + (i + 1);
        }
        return titles;
    }

    static class ChartViewHolder extends RecyclerView.ViewHolder {
        TextView chartIndex;
        TextView chartTitle;
        TextView chartMeta;
        AAChartView chartView;

        ChartViewHolder(@NonNull View itemView) {
            super(itemView);
            chartIndex = itemView.findViewById(R.id.chart_index);
            chartTitle = itemView.findViewById(R.id.chart_title);
            chartMeta = itemView.findViewById(R.id.chart_meta);
            chartView = itemView.findViewById(R.id.chart_view);
        }
    }
}