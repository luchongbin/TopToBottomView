package com.luchongbin.toptobottomlayout;


import android.support.v7.widget.Toolbar;
import android.view.View;
/**
 * Created by luchongbin on 2018/6/27/027.
 */

public interface TopToBottomlListener {

     void onPanelSlide(Toolbar toolbar, View panelView, float slideOffset);


     void onPanelOpened(Toolbar toolbar, View panelView);


     void onPanelClosed(Toolbar toolbar, View panelView);
}