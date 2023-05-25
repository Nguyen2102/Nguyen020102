package com.example.customfontstextviewexample.custom_textview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

public class SinkinSans400RegularTextView extends AppCompatTextView {
    public SinkinSans400RegularTextView(@NonNull Context context) {
        super(context);
        setFontsTextView();
    }

    public SinkinSans400RegularTextView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setFontsTextView();
    }

    public SinkinSans400RegularTextView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFontsTextView();
    }

    private void setFontsTextView() {
        Typeface typeface = Utils.getSinkinSans400RegularTypeface(getContext());
        setTypeface(typeface);
    }
}
