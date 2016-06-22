package com.example.abc.touchtest;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by 50230 on 2016/4/27.
 */
public class TouchChild extends LinearLayout {
    private static String TAG="touchTest";

    public TouchChild(Context context) {
        super(context);
    }

    public TouchChild(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d(TAG, "TouchEventChild | dispatchTouchEvent --> " + ev.getAction());
       // return super.dispatchTouchEvent(ev);
        return false;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d(TAG, "TouchEventChild |onInterceptTouchEvent --> " + ev.getAction());
        return super.onInterceptTouchEvent(ev);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(TAG, "TouchEventChild |onTouchEvent --> " + event.getAction());
        return super.onTouchEvent(event);
    }

}
