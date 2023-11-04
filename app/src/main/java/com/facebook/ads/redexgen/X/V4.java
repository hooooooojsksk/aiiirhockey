package com.facebook.ads.redexgen.X;

import android.text.Layout;
import androidx.annotation.NonNull;

/* loaded from: assets/audience_network.dex */
public final class V4 extends FQ implements Comparable<V4> {
    public final int A00;

    public V4(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
        super(charSequence, alignment, f, i, i2, f2, i3, f3, z, i4);
        this.A00 = i5;
    }

    @Override // java.lang.Comparable
    /* renamed from: A00 */
    public final int compareTo(@NonNull V4 v4) {
        int i = v4.A00;
        int i2 = this.A00;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        return 0;
    }
}
