package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;

/* loaded from: assets/audience_network.dex */
public final class LU {
    public static Bitmap A00(Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.setScale(-1.0f, 1.0f);
        matrix.postTranslate(bitmap.getWidth(), 0.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static Bitmap A01(LT lt) {
        byte[] decode = Base64.decode(lt.A00(Kk.A02), 0);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    public static Bitmap A02(LT lt) {
        byte[] decode = Base64.decode(lt.A00(Kk.A02), 0);
        return A00(BitmapFactory.decodeByteArray(decode, 0, decode.length));
    }

    public static Drawable A03(C0887Xc c0887Xc, LT lt) {
        return new BitmapDrawable(c0887Xc.getResources(), A01(lt));
    }
}
