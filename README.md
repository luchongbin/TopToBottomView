# TopToBottomView
从上往下拉的抽屉效果

## 先来张效果图
![效果图](https://github.com/luchongbin/TopToBottomView/blob/master/gif/gif.gif)
## 使用说明：  
1、Add the JitPack repository to your build file
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
2、Add the dependency  
```
dependencies {
	        implementation 'com.github.luchongbin:TopToBottomView:v1.0.0'
	}
```
3、使用的xml 实例如下：
```
<?xml version="1.0" encoding="utf-8"?>
<com.luchongbin.toptobottomlayout.TopToBottomLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:id="@+id/sliding_down_toolbar_layout"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    app:panelId="@+id/panel"   //绑定下拉的view
    app:pullableToolbarId="@+id/toolbar">//绑定Toolbar

    <RelativeLayout
        android:id="@+id/content_container"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="@color/white">

        <TextView
            android:id="@+id/open_button"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_centerInParent="true"
            android:text="@string/open_panel"
            android:textColor="@color/color_accent"
            android:textSize="20sp" />

    </RelativeLayout>
   <!--Toolbar 必须有 如果不想显示 可设高度为0dp-->
    <android.support.v7.widget.Toolbar
        android:id="@+id/toolbar"
        android:layout_width="match_parent"
        android:layout_height="50dp"
        android:background="@color/color_accent" />
    <!--RelativeLayout 为下拉的view-->
    <RelativeLayout
        android:id="@+id/panel"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="@color/color_accent">

        <TextView
            android:id="@+id/close_button"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_centerInParent="true"
            android:text="@string/close_panel"
            android:textColor="@color/white"
            android:textSize="20sp" />

    </RelativeLayout>
</com.luchongbin.toptobottomlayout.TopToBottomLayout>
```
##  在需要打开抽屉或者关闭抽屉的地方使用如下：
```
TopToBottomLayout mTopToBottomLayout =  findViewById(R.id.sliding_down_toolbar_layout);
mTopToBottomLayout.openPanel();//打开抽屉
mTopToBottomLayout.closePanel();//关闭抽屉
```
