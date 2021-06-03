package au.edu.utas.che2.cometbot;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Startpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startpage);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);//去掉信息栏

        //set color pink
        TextView enjoy_your_ = findViewById(R.id.enjoy_your_);
        SpannableStringBuilder ssb = new SpannableStringBuilder(enjoy_your_.getText().toString());
        ssb.setSpan(new ForegroundColorSpan(getColor(R.color.pink)),24,32, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        enjoy_your_.setText(ssb);

        View next_btn = findViewById(R.id.next_btn);
        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Startpage.this, Home.class);
                startActivity(intent);
                overridePendingTransition(17,33);
            }
        });
    }
}