package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class Z4 implements C2J {
    public final SharedPreferences A00;

    public Z4(SharedPreferences sharedPreferences) {
        this.A00 = sharedPreferences;
    }

    @Override // com.facebook.ads.redexgen.X.C2J
    public final C2I A5A() {
        return new Z5(this.A00.edit());
    }

    @Override // com.facebook.ads.redexgen.X.C2J
    public final long A71(String str, long j) {
        return this.A00.getLong(str, j);
    }

    @Override // com.facebook.ads.redexgen.X.C2J
    @Nullable
    public final String A7o(String str, String str2) {
        return this.A00.getString(str, str2);
    }
}
