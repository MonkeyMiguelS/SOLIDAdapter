package com.jmperezra.solidadapter.view.commons;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.io.IOException;
import java.io.InputStream;

public class AssetsHelper {

    public static Drawable obtainDrawable(Context context, String name) throws IOException {
        InputStream is = context.getAssets().open(name);
        return Drawable.createFromStream(is, null);
    }

}
