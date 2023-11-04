package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.protocol.AdErrorType;

/* loaded from: assets/audience_network.dex */
public final class JA {
    public final AdErrorType A00;
    public final String A01;

    public JA(int i, String str) {
        this(AdErrorType.adErrorTypeFromCode(i), str);
    }

    public JA(AdErrorType adErrorType, @Nullable String str) {
        str = TextUtils.isEmpty(str) ? adErrorType.getDefaultErrorMessage() : str;
        this.A00 = adErrorType;
        this.A01 = str;
    }

    public static JA A00(AdErrorType adErrorType) {
        return new JA(adErrorType, (String) null);
    }

    public static JA A01(AdErrorType adErrorType, @Nullable String str) {
        return new JA(adErrorType, str);
    }

    public static JA A02(JB jb) {
        return new JA(jb.A00(), jb.A01());
    }

    public final AdErrorType A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }
}
