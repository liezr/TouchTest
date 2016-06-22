package com.example.abc.touchtest;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by 50230 on 2016/4/27.
 */
public class TouchFather extends LinearLayout {
    private static String TAG="touchTest";

    public TouchFather(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TouchFather(Context context) {
        super(context);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d(TAG, "TouchEventFather | dispatchTouchEvent --> " + ev.getAction());
        return super.dispatchTouchEvent(ev);
        //return false;
        //return true;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d(TAG, "TouchEventFather | onInterceptTouchEvent --> " + ev.getAction());
        //return super.onInterceptTouchEvent(ev);
        //return true;
        return false;
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(TAG, "TouchEventFather | onTouchEven --> " + event.getAction());
        return super.onTouchEvent(event);
        //return true;
    }
}
