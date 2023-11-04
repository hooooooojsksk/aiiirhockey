package com.facebook.ads.redexgen.X;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import androidx.core.view.InputDeviceCompat;
import java.io.IOException;
import kotlin.UByte;

/* renamed from: com.facebook.ads.redexgen.X.Vf */
/* loaded from: assets/audience_network.dex */
public final class C0841Vf implements BV {
    public static String[] A08 = {"pV6afMZIVEGTOqSkK4PJAxqV3cRTXe0d", "IAHwWl6p9dkO64XBfZ0QYdoG1FARrH3l", "8O8qDLmpQAmlCV9yXa4a4pqjSYQFT4zH", "zdF1gQZIlZar6BQddk1LhfG9pE3e2nBq", "3CFwU8lFm", "v9T9Lg78nTaSAiVLG9Jw7rJGA2UCfL0z", "6lAaLpwrnWkg", "Pzi"};
    public static final BY A09 = new C0842Vg();
    public long A00;
    public BX A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final SparseArray<C0369Ci> A05;
    public final C0483Hc A06;
    public final C0495Ho A07;

    public C0841Vf() {
        this(new C0495Ho(0L));
    }

    public C0841Vf(C0495Ho c0495Ho) {
        this.A07 = c0495Ho;
        this.A06 = new C0483Hc(4096);
        this.A05 = new SparseArray<>();
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final void A8V(BX bx) {
        this.A01 = bx;
        bx.AEd(new WU(-9223372036854775807L));
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final int ADp(BW bw, C0346Bc c0346Bc) throws IOException, InterruptedException {
        long j;
        if (bw.ADQ(this.A06.A00, 0, 4, true)) {
            this.A06.A0Y(0);
            int systemHeaderLength = this.A06.A08();
            if (systemHeaderLength == 441) {
                return -1;
            }
            if (systemHeaderLength == 442) {
                bw.ADP(this.A06.A00, 0, 10);
                this.A06.A0Y(9);
                int nextStartCode = this.A06.A0E();
                bw.AFJ((nextStartCode & 7) + 14);
                return 0;
            }
            if (systemHeaderLength == 443) {
                bw.ADP(this.A06.A00, 0, 2);
                this.A06.A0Y(0);
                int nextStartCode2 = this.A06.A0I();
                int i = nextStartCode2 + 6;
                if (A08[7].length() != 22) {
                    String[] strArr = A08;
                    strArr[5] = "HKquBkRqV5bg6e7zOk5qC1bF2o25gd0c";
                    strArr[0] = "faW9VDigV6ilhrF8PW3drZ4wwMfODA0N";
                    bw.AFJ(i);
                    return 0;
                }
            } else {
                int nextStartCode3 = systemHeaderLength & InputDeviceCompat.SOURCE_ANY;
                if ((nextStartCode3 >> 8) != 1) {
                    bw.AFJ(1);
                    return 0;
                }
                int i2 = systemHeaderLength & 255;
                C0369Ci c0369Ci = this.A05.get(i2);
                if (!this.A02) {
                    if (c0369Ci == null) {
                        InterfaceC0364Cb elementaryStreamReader = null;
                        if (i2 == 189) {
                            elementaryStreamReader = new C0853Vu();
                            this.A03 = true;
                            this.A00 = bw.A7P();
                        } else if ((i2 & 224) == 192) {
                            elementaryStreamReader = new C0844Vi();
                            this.A03 = true;
                            this.A00 = bw.A7P();
                        } else if ((i2 & 240) == 224) {
                            elementaryStreamReader = new Vn();
                            this.A04 = true;
                            this.A00 = bw.A7P();
                        }
                        if (elementaryStreamReader != null) {
                            elementaryStreamReader.A4Y(this.A01, new C0375Cp(i2, 256));
                            c0369Ci = new C0369Ci(elementaryStreamReader, this.A07);
                            this.A05.put(i2, c0369Ci);
                        }
                    }
                    if (this.A03 && this.A04) {
                        j = this.A00 + PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                    } else {
                        j = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                    }
                    if (bw.A7P() > j) {
                        this.A02 = true;
                        BX bx = this.A01;
                        if (A08[6].length() != 7) {
                            A08[4] = "xdmI1xGjCkbROfx6HlMFi8Q1HtnAUXbK";
                            bx.A5G();
                        }
                    }
                }
                bw.ADP(this.A06.A00, 0, 2);
                this.A06.A0Y(0);
                int nextStartCode4 = this.A06.A0I();
                int payloadLength = nextStartCode4 + 6;
                if (c0369Ci == null) {
                    bw.AFJ(payloadLength);
                } else {
                    this.A06.A0W(payloadLength);
                    bw.readFully(this.A06.A00, 0, payloadLength);
                    this.A06.A0Y(6);
                    c0369Ci.A03(this.A06);
                    C0483Hc c0483Hc = this.A06;
                    int nextStartCode5 = c0483Hc.A05();
                    c0483Hc.A0X(nextStartCode5);
                }
                return 0;
            }
            throw new RuntimeException();
        }
        return -1;
    }

    /* JADX WARN: Incorrect condition in loop: B:12:0x000c */
    @Override // com.facebook.ads.redexgen.X.BV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void AEc(long r3, long r5) {
        /*
            r2 = this;
            com.facebook.ads.redexgen.X.Ho r0 = r2.A07
            r0.A08()
            r1 = 0
        L6:
            android.util.SparseArray<com.facebook.ads.redexgen.X.Ci> r0 = r2.A05
            int r0 = r0.size()
            if (r1 >= r0) goto L1c
            android.util.SparseArray<com.facebook.ads.redexgen.X.Ci> r0 = r2.A05
            java.lang.Object r0 = r0.valueAt(r1)
            com.facebook.ads.redexgen.X.Ci r0 = (com.facebook.ads.redexgen.X.C0369Ci) r0
            r0.A02()
            int r1 = r1 + 1
            goto L6
        L1c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0841Vf.AEc(long, long):void");
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final boolean AFL(BW bw) throws IOException, InterruptedException {
        byte[] bArr = new byte[14];
        bw.ADP(bArr, 0, 14);
        if (442 != (((bArr[0] & UByte.MAX_VALUE) << 24) | ((bArr[1] & UByte.MAX_VALUE) << 16) | ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[3] & UByte.MAX_VALUE)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4) {
            return false;
        }
        int i = bArr[8] & 4;
        if (A08[4].length() != 31) {
            A08[6] = "Yb1F33WkxQfWiaSVh137";
            if (i != 4) {
                return false;
            }
            String[] strArr = A08;
            if (strArr[5].charAt(30) == strArr[0].charAt(30)) {
                String[] strArr2 = A08;
                strArr2[2] = "0jRSG84WTzZndWahG37MGXBabYk0DmjV";
                strArr2[3] = "QaZZpRdUVGXpS1N3yC2DPVE3W204sMee";
                if ((bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
                    return false;
                }
                int packStuffingLength = bArr[13] & 7;
                bw.A3L(packStuffingLength);
                bw.ADP(bArr, 0, 3);
                int packStuffingLength2 = bArr[0];
                int i2 = (packStuffingLength2 & 255) << 16;
                int packStuffingLength3 = bArr[1];
                int i3 = i2 | ((packStuffingLength3 & 255) << 8);
                int packStuffingLength4 = bArr[2];
                return 1 == ((packStuffingLength4 & 255) | i3);
            }
        }
        throw new RuntimeException();
    }
}
