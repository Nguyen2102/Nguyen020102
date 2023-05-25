package com.example.customfontstextviewexample.custom_textview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

public class AllerRgTextView extends AppCompatTextView {
    public AllerRgTextView(@NonNull Context context) {
        super(context);
        setFontsTextView();
    }

    public AllerRgTextView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setFontsTextView();
    }

    public AllerRgTextView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFontsTextView();
    }

    private void setFontsTextView() {
        Typeface typeface = Utils.getAllerRgTypeface(getContext());
        setTypeface(typeface);
    }
}
