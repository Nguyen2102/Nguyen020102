package com.example.customfontstextviewexample.custom_textview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

public class SourceCodeProRegularTextView extends AppCompatTextView {
    public SourceCodeProRegularTextView(@NonNull Context context) {
        super(context);
        setFontsTextView();
    }

    public SourceCodeProRegularTextView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setFontsTextView();
    }

    public SourceCodeProRegularTextView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFontsTextView();
    }

    private void setFontsTextView() {
        Typeface typeface = Utils.getFiraSansRegularTypeface(getContext());
        setTypeface(typeface);
    }
}
