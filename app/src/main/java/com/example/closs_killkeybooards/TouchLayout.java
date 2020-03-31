package com.example.closs_killkeybooards;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

public class TouchLayout extends LinearLayout {

    private OnInterceptTouchEventListener mListener;




    public TouchLayout(Context context) {
        super(context);
    }

    public TouchLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public TouchLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @SuppressLint("NewApi")
    public TouchLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (mListener != null)
        {
            return mListener.onInterceptTouchEvent(ev);
        }
        return super.onInterceptTouchEvent(ev);
    }



    public void setOnInterceptTouchEventListener(OnInterceptTouchEventListener listener){
        mListener = listener;
    }

}
