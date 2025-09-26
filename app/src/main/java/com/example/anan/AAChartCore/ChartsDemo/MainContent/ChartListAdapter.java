package com.example.anan.AAChartCore.ChartsDemo.MainContent;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.anan.AAChartCore.R;
import com.github.AAChartModel.AAChartCore.AAChartCreator.AAChartModel;
import com.github.AAChartModel.AAChartCore.AAChartCreator.AAChartView;

public class ChartListAdapter extends RecyclerView.Adapter<ChartListAdapter.ChartViewHolder> {

    private Context mContext;
    private AAChartModel[] mChartModels;

    public ChartListAdapter(Context context, AAChartModel[] chartModels) {
        mContext = context;
        mChartModels = chartModels;
    }

    @NonNull
    @Override
    public ChartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.list_item_chart, parent, false);
        return new ChartViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChartViewHolder holder, int position) {
        AAChartModel chartModel = mChartModels[position];
        holder.chartTitle.setText(chartModel.title);
        holder.chartView.aa_drawChartWithChartModel(chartModel);
    }

    @Override
    public int getItemCount() {
        return mChartModels.length;
    }

    static class ChartViewHolder extends RecyclerView.ViewHolder {
        TextView chartTitle;
        AAChartView chartView;

        ChartViewHolder(@NonNull View itemView) {
            super(itemView);
            chartTitle = itemView.findViewById(R.id.chart_title);
            chartView = itemView.findViewById(R.id.chart_view);
        }
    }
}