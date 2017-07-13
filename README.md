# 基于MPAndroidChart自定义的LineChart，添加了在节点绘制叉号和分段绘制背景的功能
演示图片：
![](http://upload-images.jianshu.io/upload_images/1849253-6a540de8e118c693.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
节点的细节图片：

![](http://upload-images.jianshu.io/upload_images/1849253-dbf288161baffcee.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


> 注意：基于MPAndroidChart开发，使用前项目要导入[MPAndroidChart](https://github.com/PhilJay/MPAndroidChart)

# 使用方法

## 1.导入CustomLineChart.java和BgColor.java文件

## 2.在布局文件添加控件
 ```xml 
    <com.example.ast.customchart.CustomLineChart
        android:id="@+id/test_lineChart"
        android:layout_width="match_parent"
        android:layout_height="360dp"
        android:padding="5dp" />
```
## 3.设置叉号的属性

```java
        //相关设置
        //在节点绘制叉号
        mChart.setDrawCross(true);
        //设置叉号线条长度
        mChart.setCrossLength(5f);
        //设置叉号线条宽度
        mChart.setCrossWidth(1f);
```
## 4.设置背景
```java
//给表格背景添加颜色
mChart.setDrawBgColor(true);
//设置背景颜色的属性
mChart.setBgColor(getBg());
```
### 4.1 获取分段背景设置getBg()
```java
    /**
     * 分段背景设置
     * @return 每条背景的组合
     */
    private ArrayList<BgColor> getBg() {
        ArrayList<BgColor> bgList = new ArrayList<>();

        bgList.add(new BgColor(0, 20, Color.YELLOW));//参数信息：纵坐标从0到20设置颜色为黄色
        bgList.add(new BgColor(20, 40, 0xFF00FF00));//支持16进制颜色
        bgList.add(new BgColor(40, 70, Color.BLUE));
        bgList.add(new BgColor(70, 80, Color.RED));
        return bgList;
    }
```