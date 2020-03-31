package com.example.closs_killkeybooards;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    TouchLayout log_main_LinearLayout_C_all;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);



        log_main_LinearLayout_C_all = findViewById(R.id.log_main_LinearLayout_C_all);
        log_main_LinearLayout_C_all.setOnInterceptTouchEventListener(new OnInterceptTouchEventListener() {
            @Override
            public boolean onInterceptTouchEvent(MotionEvent event) {
                View view = getCurrentFocus();


/*

                if (view != null && view.equals(password)){
                    final int screenCords[] = new int[2];
                    password.getLocationOnScreen(screenCords);

                    final Rect textRect = new Rect(screenCords[0], screenCords[1], screenCords[0] + password.getWidth(), screenCords[1] + password.getHeight());

                    int x = (int) event.getRawX();
                    int y = (int) event.getRawY();
//                    if (!textRect.contains(event.getRawX(), event.getRawY(){
                    if (!textRect.contains(x,y)) {
                        CommonUse.hideSoftKeyboard(Activity_Login.this);
                        password.setCursorVisible(false);
                        password.clearFocus();
                    } else {
                        return false;
                    }

                }

                */

/*
-------------------------------------------------------------------------
* //                this is for closing the username feilds edittext close

 * */

                if (view != null && view.equals(editText)){
                    final int screenCordsusername[] = new int[2];
                    editText.getLocationOnScreen(screenCordsusername);

                    final Rect textRect = new Rect(screenCordsusername[0], screenCordsusername[1], screenCordsusername[0] + editText.getWidth(), screenCordsusername[1] + editText.getHeight());

                    int xusername = (int) event.getRawX();
                    int yusername = (int) event.getRawY();
//                    if (!textRect.contains(event.getRawX(), event.getRawY(){
                    if (!textRect.contains(xusername,yusername)) {
                        CommonUse.hideSoftKeyboard(MainActivity.this);
                        editText.setCursorVisible(false);
                        editText.clearFocus();
                    } else {
                        return false;
                    }

                }

                return false;
            }
        });

    }
 }

