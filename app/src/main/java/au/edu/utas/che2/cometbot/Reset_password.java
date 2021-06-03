package au.edu.utas.che2.cometbot;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Reset_password extends AppCompatActivity {

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reset_password);

        //Click on the blank space to lose focus
        final InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        final RelativeLayout reset_password = findViewById(R.id.reset_password);

        reset_password.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                reset_password.setFocusable(true);
                reset_password.setFocusableInTouchMode(true);
                reset_password.requestFocus();
                assert imm != null;
                imm.hideSoftInputFromWindow(reset_password.getWindowToken(), 0);
                return false;
            }
        });

        //back button
        View back_btn = findViewById(R.id.back_btn);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Reset_password.this, Signin.class);
                startActivity(intent);
                finish();
            }
        });

        //next button
        View next_btn = findViewById(R.id.next_btn);
        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Reset_password.this, Home.class);
                startActivity(intent);
                finish();
            }
        });

        //sign in button
        View sign_in_btn = findViewById(R.id.sign_in_btn);
        sign_in_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Reset_password.this, Signin.class);
                startActivity(intent);
                finish();
            }
        });
    }
}