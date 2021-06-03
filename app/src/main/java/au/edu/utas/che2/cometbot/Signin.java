package au.edu.utas.che2.cometbot;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Signin extends AppCompatActivity {

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);

        //Click on the blank space to lose focus
        final InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        final RelativeLayout signIn = findViewById(R.id.signIn);

        signIn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                signIn.setFocusable(true);
                signIn.setFocusableInTouchMode(true);
                signIn.requestFocus();
                assert imm != null;
                imm.hideSoftInputFromWindow(signIn.getWindowToken(), 0);
                return false;
            }
        });

        //back button
        View back_btn = findViewById(R.id.back_btn);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Signin.this, Home.class);
                startActivity(intent);
                finish();
            }
        });

        //set color to pink
        TextView welcome_to_ = findViewById(R.id.welcome_to_);
        SpannableStringBuilder ssb = new SpannableStringBuilder(welcome_to_.getText().toString());
        ssb.setSpan(new ForegroundColorSpan(getColor(R.color.pink)),17,26, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        welcome_to_.setText(ssb);

        //next button
        View next_btn = findViewById(R.id.next_btn);
        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Signin.this, Home.class);
                startActivity(intent);
                finish();
            }
        });

        //register button
        View register_btn = findViewById(R.id.register_btn);
        register_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Signin.this, Register.class);
                startActivity(intent);
                finish();
            }
        });

        //forget password button
        View forget_pass = findViewById(R.id.forgot_pass);
        forget_pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Signin.this, Reset_password.class);
                startActivity(intent);
                finish();
            }
        });
    }
}