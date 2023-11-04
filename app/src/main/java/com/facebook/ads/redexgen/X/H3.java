package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: assets/audience_network.dex */
public final class H3 {
    public static String[] A00 = {"QVkvGuTrNYCOXAoNAePTggpZ9p9y8rjH", "Ru98bprrD7b3UUfLrlKs", "", "dJgVNsDePsDRNqW", "8CeCwhAARX5BeZctdCHITAez339E1kKv", "TdcchyCe9I3Btqth6iKX4VQ7acLjRTHE", "dxVA2OdEqxN0v6bZFx4Cf7LzvY6ZoBAr", "aJerxmZYtdmBHI5cIDnwKt2ezc6XXR2j"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x009e: INVOKE  (r3 I:com.facebook.ads.redexgen.X.GX) type: STATIC call: com.facebook.ads.redexgen.X.Hs.A0W(com.facebook.ads.redexgen.X.GX):void, block:B:87:0x009e */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00ae: INVOKE  (r3 I:com.facebook.ads.redexgen.X.GX) type: STATIC call: com.facebook.ads.redexgen.X.Hs.A0W(com.facebook.ads.redexgen.X.GX):void, block:B:93:0x00ae */
    public static long A00(C0458Gb c0458Gb, long j, long j2, GX gx, byte[] bArr, @Nullable C0487Hg c0487Hg, int i, H2 h2) throws IOException, InterruptedException {
        GX gx2;
        while (true) {
            if (c0487Hg != null) {
                c0487Hg.A01(i);
            }
            try {
                break;
            } catch (C0486Hf unused) {
            } finally {
                C0499Hs.A0W(gx2);
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        C0458Gb c0458Gb2 = new C0458Gb(c0458Gb.A04, c0458Gb.A06, j, (c0458Gb.A03 + j) - c0458Gb.A01, -1L, c0458Gb.A05, c0458Gb.A00 | 2);
        long ADF = gx2.ADF(c0458Gb2);
        if (h2.A01 == -1 && ADF != -1) {
            h2.A01 = c0458Gb2.A01 + ADF;
        }
        long j3 = 0;
        while (true) {
            if (j3 == j2) {
                break;
            } else if (Thread.interrupted()) {
                throw new InterruptedException();
            } else {
                int read = gx2.read(bArr, 0, j2 != -1 ? (int) Math.min(bArr.length, j2 - j3) : bArr.length);
                if (A00[3].length() != 15) {
                    throw new RuntimeException();
                }
                A00[1] = "Mr4dmhY4u";
                if (read != -1) {
                    j3 += read;
                    h2.A02 += read;
                } else if (h2.A01 == -1) {
                    h2.A01 = c0458Gb2.A01 + j3;
                }
            }
        }
        return j3;
    }

    public static String A01(Uri uri) {
        return uri.toString();
    }

    public static String A02(C0458Gb c0458Gb) {
        if (c0458Gb.A05 != null) {
            return c0458Gb.A05;
        }
        Uri uri = c0458Gb.A04;
        if (A00[0].charAt(11) != 'O') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[5] = "cu8QQJDviMrw4mI2sOy5Vu7yKrvbPHoQ";
        strArr[7] = "0ihZqD29ZbZOvC3sCo5KdBScvHoXIGQ7";
        return A01(uri);
    }

    public static void A03(C0458Gb c0458Gb, InterfaceC0478Gx interfaceC0478Gx, UU uu, byte[] bArr, @Nullable C0487Hg c0487Hg, int i, @Nullable H2 h2, @Nullable AtomicBoolean atomicBoolean, boolean z) throws IOException, InterruptedException {
        long start;
        H2 h22 = h2;
        HD.A01(uu);
        HD.A01(bArr);
        if (h22 != null) {
            A04(c0458Gb, interfaceC0478Gx, h22);
        } else {
            h22 = new H2();
        }
        String A02 = A02(c0458Gb);
        long j = c0458Gb.A01;
        long start2 = c0458Gb.A02;
        if (start2 != -1) {
            start = c0458Gb.A02;
        } else {
            start = interfaceC0478Gx.A6E(A02);
        }
        while (true) {
            long j2 = 0;
            if (start != 0) {
                if (atomicBoolean == null || !atomicBoolean.get()) {
                    long A5z = interfaceC0478Gx.A5z(A02, j, start != -1 ? start : LongCompanionObject.MAX_VALUE);
                    if (A5z <= 0) {
                        long j3 = -A5z;
                        A5z = j3;
                        if (A00(c0458Gb, j, j3, uu, bArr, c0487Hg, i, h22) < A5z) {
                            if (!z || start == -1) {
                                return;
                            }
                            throw new EOFException();
                        }
                    }
                    j += A5z;
                    if (start != -1) {
                        j2 = A5z;
                    }
                    start -= j2;
                } else {
                    throw new InterruptedException();
                }
            } else {
                return;
            }
        }
    }

    public static void A04(C0458Gb c0458Gb, InterfaceC0478Gx interfaceC0478Gx, H2 h2) {
        long left;
        String A02 = A02(c0458Gb);
        long j = c0458Gb.A01;
        if (c0458Gb.A02 != -1) {
            left = c0458Gb.A02;
        } else {
            left = interfaceC0478Gx.A6E(A02);
        }
        h2.A01 = left;
        h2.A00 = 0L;
        h2.A02 = 0L;
        while (left != 0) {
            long A5z = interfaceC0478Gx.A5z(A02, j, left != -1 ? left : Long.MAX_VALUE);
            if (A5z > 0) {
                h2.A00 += A5z;
            } else {
                A5z = -A5z;
                if (A5z == LongCompanionObject.MAX_VALUE) {
                    return;
                }
            }
            j += A5z;
            if (left == -1) {
                A5z = 0;
            }
            left -= A5z;
        }
    }

    public static void A05(InterfaceC0478Gx interfaceC0478Gx, String str) {
        for (H1 h1 : interfaceC0478Gx.A60(str)) {
            try {
                interfaceC0478Gx.AEF(h1);
            } catch (C0476Gv unused) {
            }
        }
    }
}
