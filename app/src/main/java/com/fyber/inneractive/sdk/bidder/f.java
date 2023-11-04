package com.fyber.inneractive.sdk.bidder;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;

/* loaded from: classes.dex */
public class f {

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[UnitDisplayType.values().length];
            a = iArr;
            try {
                iArr[UnitDisplayType.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[UnitDisplayType.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[UnitDisplayType.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[UnitDisplayType.MRECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static TokenParametersOuterClass$TokenParameters.NullableBool a(Boolean bool) {
        TokenParametersOuterClass$TokenParameters.NullableBool.a newBuilder = TokenParametersOuterClass$TokenParameters.NullableBool.newBuilder();
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            newBuilder.c();
            ((TokenParametersOuterClass$TokenParameters.NullableBool) newBuilder.b).setData(booleanValue);
        }
        return newBuilder.a();
    }

    public static TokenParametersOuterClass$TokenParameters.NullableUInt32 b(String str) {
        TokenParametersOuterClass$TokenParameters.NullableUInt32.a newBuilder = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
        if (!TextUtils.isEmpty(str)) {
            int parseInt = Integer.parseInt(str);
            newBuilder.c();
            ((TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder.b).setData(parseInt);
        }
        return newBuilder.a();
    }

    public static TokenParametersOuterClass$TokenParameters.NullableString c(String str) {
        TokenParametersOuterClass$TokenParameters.NullableString.a newBuilder = TokenParametersOuterClass$TokenParameters.NullableString.newBuilder();
        if (!TextUtils.isEmpty(str)) {
            newBuilder.c();
            ((TokenParametersOuterClass$TokenParameters.NullableString) newBuilder.b).setData(str);
        }
        return newBuilder.a();
    }

    public static TokenParametersOuterClass$TokenParameters.NullableUInt32 a(int i) {
        TokenParametersOuterClass$TokenParameters.NullableUInt32.a newBuilder = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
        if (i > 0) {
            newBuilder.c();
            ((TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder.b).setData(i);
        }
        return newBuilder.a();
    }

    public static TokenParametersOuterClass$TokenParameters.k a(UnitDisplayType unitDisplayType) {
        int i = a.a[unitDisplayType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return TokenParametersOuterClass$TokenParameters.k.UNITDISPLAYTYPEUNKNOWN;
                    }
                    return TokenParametersOuterClass$TokenParameters.k.MRECT;
                }
                return TokenParametersOuterClass$TokenParameters.k.REWARDED;
            }
            return TokenParametersOuterClass$TokenParameters.k.INTERSTITIAL;
        }
        return TokenParametersOuterClass$TokenParameters.k.BANNER;
    }

    public static TokenParametersOuterClass$TokenParameters.d a(String str) {
        if (str.equals("native")) {
            return TokenParametersOuterClass$TokenParameters.d.NATIVE;
        }
        if (!str.equals("unity3d")) {
            return TokenParametersOuterClass$TokenParameters.d.UNRECOGNIZED;
        }
        return TokenParametersOuterClass$TokenParameters.d.UNITY3D;
    }
}
