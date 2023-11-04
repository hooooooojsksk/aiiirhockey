package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.Gb */
/* loaded from: assets/audience_network.dex */
public final class C0458Gb {
    public static byte[] A07;
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final Uri A04;
    @Nullable
    public final String A05;
    @Nullable
    public final byte[] A06;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 21);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{-125, 119, airhockey.J_GAME_REMATCH, -122, -103, -122, airhockey.J_ACHIEVEMENTCALLBACK, -107, -118, -120, ByteCompanionObject.MIN_VALUE, -50};
    }

    public C0458Gb(Uri uri, long j, long j2, long j3, @Nullable String str, int i) {
        this(uri, null, j, j2, j3, str, i);
    }

    public C0458Gb(Uri uri, long j, long j2, @Nullable String str) {
        this(uri, j, j, j2, str, 0);
    }

    public C0458Gb(Uri uri, long j, long j2, @Nullable String str, int i) {
        this(uri, j, j, j2, str, i);
    }

    public C0458Gb(Uri uri, @Nullable byte[] bArr, long j, long j2, long j3, @Nullable String str, int i) {
        boolean z = true;
        HD.A03(j >= 0);
        HD.A03(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        HD.A03(z);
        this.A04 = uri;
        this.A06 = bArr;
        this.A01 = j;
        this.A03 = j2;
        this.A02 = j3;
        this.A05 = str;
        this.A00 = i;
    }

    public final boolean A02(int i) {
        return (this.A00 & i) == i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(A00(2, 9, 16));
        sb.append(this.A04);
        String A00 = A00(0, 2, 66);
        sb.append(A00);
        sb.append(Arrays.toString(this.A06));
        sb.append(A00);
        sb.append(this.A01);
        sb.append(A00);
        sb.append(this.A03);
        sb.append(A00);
        sb.append(this.A02);
        sb.append(A00);
        sb.append(this.A05);
        sb.append(A00);
        sb.append(this.A00);
        sb.append(A00(11, 1, 92));
        return sb.toString();
    }
}
