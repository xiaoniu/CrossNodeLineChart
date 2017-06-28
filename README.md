# 可以在节点绘制叉号和绘制背景色的MPAndroid

> 基于MPAndroidChart开发，使用前项目要导入[MPAndroidChart](https://github.com/PhilJay/MPAndroidChart)

#使用方法
在布局文件添加控件
 ```xml 
    <com.example.ast.customchart.CustomLineChart
        android:id="@+id/test_lineChart"
        android:layout_width="match_parent"
        android:layout_height="360dp"
        android:padding="5dp" />
```
配置图表

```java
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
```



