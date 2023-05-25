package com.example.loginpageui.custom_textview;

import android.content.Context;
import android.graphics.Typeface;

public class Utils {
    private static Typeface alexBrushRegularTypeface;

    public static Typeface getAlexBrushRegularTypeface(Context context) {
        if (alexBrushRegularTypeface == null) {
            alexBrushRegularTypeface = Typeface.createFromAsset(context.getAssets(),"fonts/alexBrushRegular.ttf");
        }
        return alexBrushRegularTypeface;
    }
}
