package com.example.customfontstextviewexample.custom_textview;

import android.content.Context;
import android.graphics.Path;
import android.graphics.Typeface;

public class Utils {

    private static Typeface alexBrushRegularTypeface;
    private static Typeface allerRgTypeface;
    private static Typeface ambleRegularTypeface;
    private static Typeface cantarellObliqueTypeface;
    private static Typeface chunkFiveRegularTypeface;
    private static Typeface firaSansRegularTypeface;
    private static Typeface kaushanScriptRegularTypeface;
    private static Typeface nobileRegularTypeface;
    private static Typeface openSansRegularTypeface;
    private static Typeface pTS55FTypeface;
    private static Typeface quicksandRegularTypeface;
    private static Typeface rubikRegularTypeface;
    private static Typeface sinkinSans400RegularTypeface;
    private static Typeface sourceCodeProRegularTypeface;
    private static Typeface sourceSansProRegularTypeface;

    public static Typeface getAlexBrushRegularTypeface(Context context) {
        if (alexBrushRegularTypeface == null) {
            alexBrushRegularTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/AlexBrush-Regular.ttf");
        }
        return alexBrushRegularTypeface;
    }

    public static Typeface getAllerRgTypeface(Context context) {
        if (allerRgTypeface == null) {
            allerRgTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/Aller_Rg.ttf");
        }
        return allerRgTypeface;
    }

    public static Typeface getAmbleRegularTypeface(Context context) {
        if (ambleRegularTypeface == null) {
            ambleRegularTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/Amble-Regular.ttf");
        }
        return ambleRegularTypeface;
    }

    public static Typeface getCantarellObliqueTypeface(Context context) {
        if (cantarellObliqueTypeface == null) {
            cantarellObliqueTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/Cantarell-Oblique.ttf");
        }
        return cantarellObliqueTypeface;
    }

    public static Typeface getChunkFiveRegularTypeface(Context context) {
        if (chunkFiveRegularTypeface == null) {
            chunkFiveRegularTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/ChunkFive-Regular.otf");
        }
        return chunkFiveRegularTypeface;
    }

    public static Typeface getFiraSansRegularTypeface(Context context) {
        if (firaSansRegularTypeface == null) {
            firaSansRegularTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/FiraSans-Regular.otf");
        }
        return firaSansRegularTypeface;
    }

    public static Typeface getKaushanScriptRegularTypeface(Context context) {
        if (kaushanScriptRegularTypeface == null) {
            kaushanScriptRegularTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/KaushanScript-Regular.otf");
        }
        return kaushanScriptRegularTypeface;
    }

    public static Typeface getNobileRegularTypeface(Context context) {
        if (nobileRegularTypeface == null) {
            nobileRegularTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/Nobile-Regular.ttf");
        }
        return nobileRegularTypeface;
    }

    public static Typeface getOpenSansRegularTypeface(Context context) {
        if (openSansRegularTypeface == null) {
            openSansRegularTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/OpenSans-Regular.ttf");
        }
        return openSansRegularTypeface;
    }

    public static Typeface getpTS55FTypeface(Context context) {
        if (pTS55FTypeface == null) {
            pTS55FTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/PTS55F.ttf");
        }
        return pTS55FTypeface;
    }

    public static Typeface getQuicksandRegularTypeface(Context context) {
        if (quicksandRegularTypeface == null) {
            quicksandRegularTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/Quicksand-Regular.otf");
        }
        return quicksandRegularTypeface;
    }

    public static Typeface getRubikRegularTypeface(Context context) {
        if (rubikRegularTypeface == null) {
            rubikRegularTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/Rubik-Regular.ttf");
        }
        return rubikRegularTypeface;
    }

    public static Typeface getSinkinSans400RegularTypeface(Context context) {
        if (sinkinSans400RegularTypeface == null) {
            sinkinSans400RegularTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/SinkinSans-400Regular.otf");
        }
        return sinkinSans400RegularTypeface;
    }

    public static Typeface getSourceCodeProRegularTypeface(Context context) {
        if (sourceCodeProRegularTypeface == null) {
            sourceCodeProRegularTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/SourceCodePro-Regular.otf");
        }
        return sourceCodeProRegularTypeface;
    }

    public static Typeface getSourceSansProRegularTypeface(Context context) {
        if (sourceSansProRegularTypeface == null) {
            sourceSansProRegularTypeface =Typeface.createFromAsset(context.getAssets(), "fonts/SourceSansPro-Regular.otf");
        }
        return sourceSansProRegularTypeface;
    }
}
