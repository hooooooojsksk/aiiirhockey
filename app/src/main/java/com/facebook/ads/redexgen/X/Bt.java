package com.facebook.ads.redexgen.X;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import kotlin.UByte;

/* loaded from: assets/audience_network.dex */
public final class Bt {
    public static String[] A02 = {"ESBDEf5TGpIlPNlaK", "CFy8tTB", "6qe0qu0ibVEcKGfh7EvVwRhtqHBuEa1w", "V1Y5IBnxryXU9mIwJ4bJ5ToLD3C0Yk13", "4NTFTO6GqkeHPDwUARd0ySppWOd6l1dR", "CrEf7MIuMgaulYPqfRythdBqg4S56GJr", "vnXboZq45YJMaiP9ml0KXw1b9fE53h1M", "mdidS6i6KL2UNszMr3NEyBGV7VKvKKkC"};
    public int A00;
    public final C0483Hc A01 = new C0483Hc(8);

    /* JADX WARN: Incorrect condition in loop: B:25:0x001b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private long A00(com.facebook.ads.redexgen.X.BW r6) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.Hc r0 = r5.A01
            byte[] r0 = r0.A00
            r1 = 0
            r2 = 1
            r6.ADP(r0, r1, r2)
            com.facebook.ads.redexgen.X.Hc r0 = r5.A01
            byte[] r0 = r0.A00
            r0 = r0[r1]
            r4 = r0 & 255(0xff, float:3.57E-43)
            if (r4 != 0) goto L16
            r0 = -9223372036854775808
            return r0
        L16:
            r1 = 128(0x80, float:1.8E-43)
            r3 = 0
        L19:
            r0 = r4 & r1
            if (r0 != 0) goto L22
            int r1 = r1 >> 1
            int r3 = r3 + 1
            goto L19
        L22:
            r0 = r1 ^ (-1)
            r4 = r4 & r0
            com.facebook.ads.redexgen.X.Hc r0 = r5.A01
            byte[] r0 = r0.A00
            r6.ADP(r0, r2, r3)
            r2 = 0
        L2d:
            if (r2 >= r3) goto L3f
            int r4 = r4 << 8
            com.facebook.ads.redexgen.X.Hc r0 = r5.A01
            byte[] r1 = r0.A00
            int r0 = r2 + 1
            r0 = r1[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r4 = r4 + r0
            int r2 = r2 + 1
            goto L2d
        L3f:
            int r1 = r5.A00
            int r0 = r3 + 1
            int r1 = r1 + r0
            r5.A00 = r1
            long r0 = (long) r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.Bt.A00(com.facebook.ads.redexgen.X.BW):long");
    }

    public final boolean A01(BW bw) throws IOException, InterruptedException {
        long A70 = bw.A70();
        long j = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        if (A70 != -1 && A70 <= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            j = A70;
        }
        int i = (int) j;
        boolean z = false;
        bw.ADP(this.A01.A00, 0, 4);
        long A0M = this.A01.A0M();
        this.A00 = 4;
        while (true) {
            if (A0M != 440786851) {
                int bytesToSearch = this.A00 + 1;
                this.A00 = bytesToSearch;
                String[] strArr = A02;
                if (strArr[0].length() == strArr[1].length()) {
                    break;
                }
                String[] strArr2 = A02;
                strArr2[3] = "l1PkIDTfiQThV6hLB2tjOKdQnzuVnbjV";
                strArr2[7] = "5y1xvAdDSVehJ56urXHmNFO2pNzfP9GT";
                if (bytesToSearch == i) {
                    return false;
                }
                bw.ADP(this.A01.A00, 0, 1);
                A0M = ((A0M << 8) & (-256)) | (this.A01.A00[0] & UByte.MAX_VALUE);
            } else {
                long A00 = A00(bw);
                long j2 = this.A00;
                if (A00 == Long.MIN_VALUE) {
                    return false;
                }
                if (A70 != -1 && j2 + A00 >= A70) {
                    return false;
                }
                while (true) {
                    int bytesToSearch2 = this.A00;
                    if (bytesToSearch2 >= j2 + A00) {
                        return ((long) bytesToSearch2) == j2 + A00;
                    }
                    int i2 = (A00(bw) > Long.MIN_VALUE ? 1 : (A00(bw) == Long.MIN_VALUE ? 0 : -1));
                    if (A02[2].charAt(30) == 'F') {
                        throw new RuntimeException();
                    }
                    A02[4] = "KE3nQOOCyGcxuS2VNFQSv9Xwlad9oCTx";
                    if (i2 == 0) {
                        return z;
                    }
                    long A002 = A00(bw);
                    if (A002 < 0) {
                        return false;
                    }
                    if (A02[5].charAt(8) != 'M') {
                        break;
                    }
                    A02[4] = "oAhGCMJduqwag2F3qzvWFprzvodLwUMc";
                    if (A002 > 2147483647L) {
                        return false;
                    }
                    if (A002 != 0) {
                        int i3 = (int) A002;
                        String[] strArr3 = A02;
                        if (strArr3[0].length() != strArr3[1].length()) {
                            String[] strArr4 = A02;
                            strArr4[3] = "DpgTASio69ZqWxB525eChTWXhoKF6GpR";
                            strArr4[7] = "IdVdUYmR5RRrY4br74pFew5qFgYpPWK6";
                            bw.A3L(i3);
                            this.A00 += i3;
                        } else {
                            A02[4] = "dJss32nVjAcsiV2OBHnTjFQq6mdmK3qb";
                            bw.A3L(i3);
                            this.A00 += i3;
                        }
                    }
                    z = false;
                }
            }
        }
        throw new RuntimeException();
    }
}
