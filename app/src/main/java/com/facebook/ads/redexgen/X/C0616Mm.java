package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.List;

@TargetApi(19)
/* renamed from: com.facebook.ads.redexgen.X.Mm */
/* loaded from: assets/audience_network.dex */
public final class C0616Mm extends LinearLayout {
    public static byte[] A0A;
    public static String[] A0B = {"knq4crm7fvqQP", "POuWJNR6FFtqsTvB6KeDXgsqVDDrfXB5", "10LYd3PkBnL3JTlwXO74lkb8laVhyfxM", "yGvyB2PsIdOlgSHN7xWAdIyeKrkcUuSJ", "30OsfDGqNeLBXhmKwxFpv8WuoKRgKdOB", "v4mwmIuaROl", "LuFvPWZsJ2RrZ", "py7QobRXpH9AZVstdVJJOkEIejHuBaN9"};
    public static final int A0C;
    public static final int A0D;
    public static final Uri A0E;
    public static final View.OnTouchListener A0F;
    @Nullable
    public ImageView A00;
    public ImageView A01;
    @Nullable
    public ImageView A02;
    public ImageView A03;
    public InterfaceC0615Ml A04;
    public C0622Ms A05;
    public String A06;
    public boolean A07;
    public final WebView A08;
    public final InterfaceC0625Mv A09;

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] ^ i3) ^ 39);
            String[] strArr = A0B;
            if (strArr[3].charAt(13) == strArr[1].charAt(13)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[6] = "2vQcPj1ELj1bu";
            strArr2[0] = "7aOELiI6quiDs";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0A = new byte[]{80, airhockey.J_SAVEDGAME_SAVE, airhockey.J_BACK, airhockey.J_WAIT, 27, 52, 55, 43, 61, 39, 14, 19, 22, 0, 19, 5, 14, 49, 36, 47, airhockey.J_SDKVER, 47, 32, 53, 40, 55, 36, airhockey.J_SDKVER, 35, 51, 46, 54, 50, 36, 51, 5, 6, 11, 17, 16, 94, 6, 8, 5, 10, 15, 18, 29, 23, 1, 28, 26, 23, 93, 26, 29, 7, 22, 29, 7, 93, 18, 16, 7, 26, 28, 29, 93, 37, 58, 54, 36, 27, 23, 21, 86, 25, 22, 28, 10, 23, 17, 28, 86, 27, 16, 10, 23, 21, 29, 80, 76, 76, airhockey.P_GAME_MYLOSE, 2, 23, 23, 79, 79, 79, 22, 94, 89, 91, 93, 90, 87, 87, 83, 22, 91, 87, 85};
    }

    static {
        A07();
        A0C = Color.rgb(224, 224, 224);
        A0E = KT.A00(A05(90, 23, 31));
        A0F = new View$OnTouchListenerC0610Mg();
        A0D = Color.argb(34, 0, 0, 0);
    }

    public C0616Mm(C0887Xc c0887Xc, WebView webView) {
        super(c0887Xc);
        this.A09 = new C0776Sr(this);
        this.A08 = webView;
        this.A07 = IL.A06(c0887Xc);
        A08(c0887Xc);
    }

    private void A08(C0887Xc c0887Xc) {
        float density = 50.0f * getResources().getDisplayMetrics().density;
        int i = (int) density;
        LL.A0M(this, -1);
        setGravity(16);
        this.A01 = new ImageView(c0887Xc);
        this.A01.setContentDescription(A05(4, 5, 127));
        LinearLayout.LayoutParams closeButtonParams = new LinearLayout.LayoutParams(i, i);
        this.A01.setScaleType(ImageView.ScaleType.CENTER);
        this.A01.setImageBitmap(LU.A01(LT.BROWSER_CLOSE));
        this.A01.setOnTouchListener(A0F);
        this.A01.setOnClickListener(new View$OnClickListenerC0611Mh(this));
        addView(this.A01, closeButtonParams);
        if (this.A07) {
            this.A00 = new ImageView(c0887Xc);
            this.A00.setEnabled(false);
            this.A00.setAlpha(0.3f);
            this.A00.setContentDescription(A05(0, 4, 53));
            LinearLayout.LayoutParams closeButtonParams2 = new LinearLayout.LayoutParams(i, i);
            this.A00.setScaleType(ImageView.ScaleType.CENTER);
            this.A00.setImageBitmap(LU.A01(LT.BACK_ARROW));
            this.A00.setOnTouchListener(A0F);
            this.A00.setOnClickListener(new View$OnClickListenerC0612Mi(this));
            addView(this.A00, closeButtonParams2);
        }
        this.A05 = new C0622Ms(c0887Xc);
        LinearLayout.LayoutParams closeButtonParams3 = new LinearLayout.LayoutParams(0, -2);
        float density2 = this.A07 ? 0.5f : 1.0f;
        closeButtonParams3.weight = density2;
        this.A05.setGravity(17);
        addView(this.A05, closeButtonParams3);
        if (this.A07) {
            this.A02 = new ImageView(c0887Xc);
            this.A02.setEnabled(false);
            this.A02.setAlpha(0.3f);
            this.A02.setContentDescription(A05(9, 7, 70));
            LinearLayout.LayoutParams closeButtonParams4 = new LinearLayout.LayoutParams(i, i);
            this.A02.setScaleType(ImageView.ScaleType.CENTER);
            this.A02.setImageBitmap(LU.A02(LT.BACK_ARROW));
            this.A02.setOnTouchListener(A0F);
            this.A02.setOnClickListener(new View$OnClickListenerC0613Mj(this));
            addView(this.A02, closeButtonParams4);
        }
        this.A03 = new ImageView(c0887Xc);
        LinearLayout.LayoutParams nativeButtonParams = new LinearLayout.LayoutParams(i, i);
        this.A03.setContentDescription(A05(16, 19, 102));
        this.A03.setScaleType(ImageView.ScaleType.CENTER);
        this.A03.setOnTouchListener(A0F);
        this.A03.setOnClickListener(new View$OnClickListenerC0614Mk(this, c0887Xc));
        addView(this.A03, nativeButtonParams);
        setupDefaultNativeBrowser(c0887Xc);
    }

    public InterfaceC0625Mv getBrowserNavigationListener() {
        return this.A09;
    }

    public void setListener(InterfaceC0615Ml interfaceC0615Ml) {
        this.A04 = interfaceC0615Ml;
    }

    public void setTitle(String str) {
        this.A05.setTitle(str);
    }

    public void setUrl(String str) {
        this.A06 = str;
        if (TextUtils.isEmpty(str) || A05(35, 11, 67).equals(str)) {
            this.A05.setSubtitle(null);
            this.A03.setEnabled(false);
            this.A03.setColorFilter(new PorterDuffColorFilter(A0C, PorterDuff.Mode.SRC_IN));
            return;
        }
        this.A05.setSubtitle(str);
        this.A03.setEnabled(true);
        this.A03.setColorFilter((ColorFilter) null);
    }

    private void setupDefaultNativeBrowser(C0887Xc c0887Xc) {
        Bitmap A01;
        List<ResolveInfo> queryIntentActivities = c0887Xc.getPackageManager().queryIntentActivities(new Intent(A05(46, 26, 84), A0E), 65536);
        if (queryIntentActivities.size() == 0) {
            this.A03.setVisibility(8);
            A01 = null;
        } else {
            if (queryIntentActivities.size() == 1) {
                if (A05(72, 18, 95).equals(queryIntentActivities.get(0).activityInfo.packageName)) {
                    LT lt = LT.BROWSER_LAUNCH_CHROME;
                    if (A0B[5].length() == 31) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0B;
                    strArr[6] = "ER9o4D5KfsgKq";
                    strArr[0] = "PVCMoHz4n3Ffn";
                    A01 = LU.A01(lt);
                }
            }
            A01 = LU.A01(LT.BROWSER_LAUNCH_NATIVE);
        }
        this.A03.setImageBitmap(A01);
    }
}
