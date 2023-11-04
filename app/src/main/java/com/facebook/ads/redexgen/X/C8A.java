package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.8A */
/* loaded from: assets/audience_network.dex */
public final class C8A {
    public static byte[] A06;
    public C8B A01;
    @Nullable
    public String A02;
    @Nullable
    public String A03;
    @Nullable
    public JSONObject A05;
    public int A00 = 0;
    public List<AnonymousClass88> A04 = new ArrayList();

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 109);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{79, 88};
    }

    public C8A(C8B c8b, @Nullable String str, @Nullable String str2) {
        this.A01 = c8b;
        this.A03 = str;
        this.A02 = str2;
    }

    public final int A02() {
        return this.A04.size();
    }

    public final long A03() {
        C8B c8b = this.A01;
        if (c8b != null) {
            return c8b.A0C() + this.A01.A03();
        }
        return -1L;
    }

    public final AnonymousClass88 A04() {
        if (this.A00 < this.A04.size()) {
            this.A00++;
            return this.A04.get(this.A00 - 1);
        }
        return null;
    }

    public final C8B A05() {
        return this.A01;
    }

    @Nullable
    public final String A06() {
        return this.A02;
    }

    @Nullable
    public final String A07() {
        int i = this.A00;
        if (i > 0 && i <= this.A04.size()) {
            return this.A04.get(this.A00 - 1).A04().optString(A00(0, 2, 65));
        }
        return null;
    }

    @Nullable
    public final String A08() {
        return this.A03;
    }

    @Nullable
    public final JSONObject A09() {
        return this.A05;
    }

    public final void A0A(AnonymousClass88 anonymousClass88) {
        this.A04.add(anonymousClass88);
    }

    public final void A0B(JSONObject jSONObject) {
        this.A05 = jSONObject;
    }

    public final boolean A0C() {
        return this.A01 == null || LC.A00() > this.A01.A0C() + ((long) this.A01.A03());
    }
}
