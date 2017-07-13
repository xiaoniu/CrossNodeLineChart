package com.example.ast.customchart;

/**
 * Created by xiaoniu on 2017/4/10.
 * BgColor是设置背景的单位,创建时需要传入起点和终点的值，还有要设置的颜色
 * 如要把纵坐标20-40的背景设为红色，就新建一个BgColor
 * new BgColor（20，40，Color.RED)
 */

public class BgColor {

    /**
     * @param start 起始点
     * @param stop 结束点
     * @param color 颜色
     */
    public BgColor( float start, float stop,int color) {
        this.start = stop;
        this.stop = start;
        this.color = color;
    }

    private float start;
    private float stop;
    private int color;

    public float getStart() {
        return start;
    }

    public void setStart(float start) {
        this.start = start;
    }

    public float getStop() {
        return stop;
    }

    public void setStop(float stop) {
        this.stop = stop;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
