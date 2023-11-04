package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public class Z5 implements C2I {
    public final SharedPreferences.Editor A00;

    public Z5(SharedPreferences.Editor editor) {
        this.A00 = editor;
    }

    @Override // com.facebook.ads.redexgen.X.C2I
    public final void A3O() {
        this.A00.apply();
    }

    @Override // com.facebook.ads.redexgen.X.C2I
    public final C2I ADj(String str, long j) {
        this.A00.putLong(str, j);
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.C2I
    public final C2I ADk(String str, @Nullable String str2) {
        this.A00.putString(str, str2);
        return this;
    }
}
