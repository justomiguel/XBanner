package com.stx.xhb.mylibrary;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;

/**
 * Created by jxnk25 on 2016/9/13.
 *
 * @link https://xiaohaibin.github.io/
 * @email： xhb_199409@163.com
 * @github: https://github.com/xiaohaibin
 * @description： XBanner轮播控件的工具类
 */
public class XBannerUtil {

    /**
     * 设置背景选择器
     *
     * @param pressedDraw
     * @param normalDraw
     * @return
     */
    public static StateListDrawable getSelector(Drawable normalDraw, Drawable pressedDraw) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_enabled}, pressedDraw);
        stateListDrawable.addState(new int[]{}, normalDraw);
        return stateListDrawable;
    }

    /**
     * 设置shape
     *
     * @param radius
     * @param fillColor
     * @param width
     * @param strokeColor
     * @return
     */
    public static GradientDrawable getDrawable(int radius, int fillColor, int width, int strokeColor) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(radius);
        gradientDrawable.setColor(fillColor);
        gradientDrawable.setStroke(width, strokeColor);
        return gradientDrawable;
    }

}
