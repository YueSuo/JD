package com.example.sy.jd_sy;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

/**
 * Created by suoyue on 2018/4/10.
 */

public class JdActivity extends Activity {
    private TextView textView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jd);

        textView = findViewById(R.id.sy_text);
        String string = textView.getText().toString();

        int b = string.indexOf("自营");
        int i = b + "自营".length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(new BackgroundColorSpan(Color.RED),b,i, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.WHITE),b,i, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        textView.setText(spannableStringBuilder);
    }
}
