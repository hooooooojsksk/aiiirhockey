package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.internal.api.AdComponentViewApi;
import com.facebook.ads.internal.api.AdOptionsViewApi;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class YM extends C5K implements AdOptionsViewApi {
    public static byte[] A03;
    public static final int A04;
    public static final int A05;
    public final ImageView A00;
    public final ImageView A01;
    public final AdOptionsView A02;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 125);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{91, airhockey.J_GAME_DISCONNECT, airhockey.J_WAIT, 102, 123, 125, 41, airhockey.P_GAME_MYLOSE, 109};
    }

    static {
        A02();
        A04 = (int) (Kk.A02 * 23.0f);
        A05 = (int) (Kk.A02 * 4.0f);
    }

    public YM(final Context context, NativeAdBase nativeAdBase, @Nullable NativeAdLayout nativeAdLayout, AdOptionsView.Orientation orientation, int i, AdOptionsView adOptionsView) {
        int i2;
        this.A02 = adOptionsView;
        final LinearLayout linearLayout = new LinearLayout(context);
        this.A02.addView(linearLayout);
        if (orientation == AdOptionsView.Orientation.HORIZONTAL) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        linearLayout.setOrientation(i2);
        this.A01 = A00(LT.DEFAULT_INFO_ICON);
        this.A00 = A00(LT.AD_CHOICES_ICON);
        this.A00.setContentDescription(A01(0, 9, 116));
        linearLayout.addView(this.A01);
        linearLayout.addView(this.A00);
        setIconSizeDp(i);
        setIconColor(-10459280);
        final C0799Tp A0L = C0799Tp.A0L(nativeAdBase.getInternalNativeAd());
        A0L.A1S(nativeAdLayout);
        A0L.A1U(this);
        C0967a7 A0y = A0L.A0y();
        if (A0y != null && A0y.A0T() && !A0y.A0R()) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.58
            public static String[] A04 = {"KRKQmCMMKryGk4zgpNIytFvS3TD6bAeJ", "Xc6miAmzcu08Y", "37gtSV6CsPxBYDJYgwQ03wIm04Bn1UoS", "vc4nNQQkh46pzBlyEmkoOi4CgZODKTHg", "arJKEayC0J1tSfFqlaoS22WOKdh4xl60", "Efttk19GyNCXlxxyYR0mavkkkhSaw2Qp", "IGlWio493rL8eTjetjpBhFYcUhZqKyAr", ""};

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (C0548Jt.A02(this)) {
                    return;
                }
                try {
                    A0L.A1I();
                    if (Build.VERSION.SDK_INT >= 16 && IK.A1s(context)) {
                        linearLayout.performAccessibilityAction(128, null);
                    }
                } catch (Throwable th) {
                    if (A04[5].charAt(5) == 'z') {
                        throw new RuntimeException();
                    }
                    A04[6] = "upfEaDqgYzKFHRA83M0GBorRIFZJY191";
                    C0548Jt.A00(th, this);
                }
            }
        });
        EnumC0567Kp.A04(this.A02, EnumC0567Kp.A0B);
    }

    public YM(Context context, NativeAdBase nativeAdBase, @Nullable NativeAdLayout nativeAdLayout, AdOptionsView adOptionsView) {
        this(context, nativeAdBase, nativeAdLayout, AdOptionsView.Orientation.HORIZONTAL, 23, adOptionsView);
    }

    private ImageView A00(LT lt) {
        ImageView imageView = new ImageView(this.A02.getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int i = A05;
        imageView.setPadding(i, i, i, i);
        imageView.setImageBitmap(LU.A01(lt));
        return imageView;
    }

    public final void A03(LT lt) {
        this.A01.setImageBitmap(LU.A01(lt));
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final AdComponentViewApi getAdComponentViewApi() {
        return this;
    }

    @Override // com.facebook.ads.internal.api.AdOptionsViewApi
    public final void setIconColor(int i) {
        this.A01.setColorFilter(i);
        this.A00.setColorFilter(i);
    }

    @Override // com.facebook.ads.internal.api.AdOptionsViewApi
    public final void setIconSizeDp(int i) {
        int iconSize = Math.max(A04, (int) (Kk.A02 * i));
        LinearLayout.LayoutParams iconParams = new LinearLayout.LayoutParams(iconSize, iconSize);
        this.A01.setLayoutParams(iconParams);
        this.A00.setLayoutParams(iconParams);
    }

    @Override // com.facebook.ads.redexgen.X.C5K, com.facebook.ads.internal.api.AdComponentView
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = -2;
        layoutParams.height = -2;
        super.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.internal.api.AdOptionsViewApi
    public final void setSingleIcon(boolean z) {
        LL.A0N(this.A01, z ? 8 : 0);
    }
}
