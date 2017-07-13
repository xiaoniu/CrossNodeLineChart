package com.example.ast.customchart;

import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private CustomLineChart mChart;

    private ArrayList<Entry> values = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mChart = (CustomLineChart) findViewById(R.id.test_lineChart);
        mChart.getDescription().setEnabled(false);
        mChart.setTouchEnabled(false);
        mChart.setDragEnabled(false);
        mChart.setScaleEnabled(false);
        mChart.setPinchZoom(false);
        mChart.setDrawBorders(false);

        //相关设置
        //在节点绘制叉号
        mChart.setDrawCross(true);
        //设置叉号线条长度
        mChart.setCrossLength(5f);
        //设置叉号线条宽度
        mChart.setCrossWidth(1f);
        //给表格背景添加颜色
        mChart.setDrawBgColor(true);
        //设置背景颜色的属性
        mChart.setBgColor(getBg());


        XAxis xAxis = mChart.getXAxis();
        xAxis.setAxisMinimum(-1f);
        xAxis.setAxisMaximum(9f);
        xAxis.setGranularity(1f);
        xAxis.enableGridDashedLine(10f, 10f, 0f);
        xAxis.setDrawAxisLine(false);
        xAxis.setDrawLabels(true);
        xAxis.setLabelCount(11);
        YAxis leftAxis = mChart.getAxisLeft();
        leftAxis.removeAllLimitLines();
        leftAxis.setAxisMaximum(80f);
        leftAxis.setAxisMinimum(10f);
        leftAxis.setGranularity(10f);
        leftAxis.enableGridDashedLine(10f, 10f, 0f);
        leftAxis.setDrawZeroLine(false);
        leftAxis.setDrawAxisLine(false);
        leftAxis.setDrawLabels(true);
        mChart.getAxisRight().setEnabled(false);

        values.add(new Entry(0, 22));
        values.add(new Entry(1, 43));
        values.add(new Entry(2, 34));
        values.add(new Entry(3, 13));
        values.add(new Entry(4, 24));
        values.add(new Entry(5, 13));
        values.add(new Entry(6, 31));
        values.add(new Entry(7, 25));
        values.add(new Entry(8, 34));

        Legend l = mChart.getLegend();
        l.setForm(Legend.LegendForm.LINE);

        LineDataSet set1 = new LineDataSet(values, "听力线");

        set1.enableDashedLine(10f, 5f, 0f);
        set1.enableDashedHighlightLine(10f, 5f, 0f);
        set1.setColor(Color.RED);
        set1.setDrawCircles(true);
        set1.setLineWidth(1f);
        set1.setValueTextSize(9f);
        set1.setDrawFilled(false);
        set1.setFormLineWidth(1f);
        set1.setFormLineDashEffect(new DashPathEffect(new float[]{10f, 5f}, 0f));
        set1.setFormSize(15.f);

        ArrayList<ILineDataSet> dataSets = new ArrayList<>();
        dataSets.add(set1);

        LineData data = new LineData(dataSets);

        mChart.setData(data);
    }

    /**
     * 分段背景设置
     * @return 每条背景的组合
     */
    private ArrayList<BgColor> getBg() {
        ArrayList<BgColor> bgList = new ArrayList<>();

        bgList.add(new BgColor(10, 20, Color.YELLOW));//参数信息：纵坐标从0到20设置颜色为黄色
        bgList.add(new BgColor(20, 40, 0xFF00FF00));//支持16进制颜色
        bgList.add(new BgColor(40, 70, Color.BLUE));
        bgList.add(new BgColor(70, 80, Color.RED));
        return bgList;
    }
}
