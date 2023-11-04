package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Handler;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class VE implements InterfaceC0466Gl {
    public static String[] A0C = {"G7jWD6ulf4YNSZyKFTHtDKYEexnehBFD", "eAcypqsPfTTSG9tYkNPVa4Ur1OSgM6nM", "x", "tNQG44GENbPBCr6MlCIr3t4n4NF0MmxZ", "OwErIGDXAeY1H11Nt9UmuNZTMubue4sT", InneractiveMediationDefs.GENDER_FEMALE, "eBkibdjxFKT4WmP6H51EPZ9055c0bCkp", "0Ce9TygyYiJS1KV85oyrWWiGz76nCu"};
    public long A00;
    public long A02;
    public C0458Gb A03;
    public final Uri A05;
    public final EN A07;
    public final GX A08;
    public final HJ A09;
    public volatile boolean A0A;
    public final /* synthetic */ BR A0B;
    public final C0346Bc A06 = new C0346Bc();
    public boolean A04 = true;
    public long A01 = -1;

    public VE(BR br, Uri uri, GX gx, EN en, HJ hj) {
        this.A0B = br;
        this.A05 = (Uri) HD.A01(uri);
        this.A08 = (GX) HD.A01(gx);
        this.A07 = (EN) HD.A01(en);
        this.A09 = hj;
    }

    public final void A04(long j, long j2) {
        this.A06.A00 = j;
        this.A02 = j2;
        this.A04 = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0466Gl
    public final void A3z() {
        this.A0A = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0466Gl
    public final void A91() throws IOException, InterruptedException {
        String str;
        long j;
        Handler handler;
        Runnable runnable;
        int result = 0;
        while (result == 0 && !this.A0A) {
            BW bw = null;
            try {
                long j2 = this.A06.A00;
                Uri uri = this.A05;
                str = this.A0B.A0b;
                this.A03 = new C0458Gb(uri, j2, -1L, str);
                this.A01 = this.A08.ADF(this.A03);
                int i = (this.A01 > (-1L) ? 1 : (this.A01 == (-1L) ? 0 : -1));
                String[] strArr = A0C;
                if (strArr[1].charAt(0) != strArr[6].charAt(0)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0C;
                strArr2[5] = "h";
                strArr2[2] = "J";
                if (i != 0) {
                    this.A01 += j2;
                }
                WY wy = new WY(this.A08, j2, this.A01);
                BV extractor = this.A07.A02(wy, this.A08.A7w());
                if (this.A04) {
                    extractor.AEc(j2, this.A02);
                    this.A04 = false;
                }
                while (result == 0 && !this.A0A) {
                    this.A09.A00();
                    result = extractor.ADp(wy, this.A06);
                    long A7P = wy.A7P();
                    j = this.A0B.A0P;
                    if (A7P > j + j2) {
                        j2 = wy.A7P();
                        this.A09.A01();
                        handler = this.A0B.A0R;
                        runnable = this.A0B.A0a;
                        handler.post(runnable);
                    }
                }
                if (result == 1) {
                    result = 0;
                } else {
                    this.A06.A00 = wy.A7P();
                    this.A00 = this.A06.A00 - this.A03.A01;
                }
                GX gx = this.A08;
                String[] strArr3 = A0C;
                if (strArr3[1].charAt(0) != strArr3[6].charAt(0)) {
                    throw new RuntimeException();
                }
                A0C[4] = "dpmYGlMxTR21UmyqYUd4zG3B6RCRzQ7P";
                C0499Hs.A0W(gx);
            } catch (Throwable th) {
                if (result != 1 && 0 != 0) {
                    this.A06.A00 = bw.A7P();
                    this.A00 = this.A06.A00 - this.A03.A01;
                }
                C0499Hs.A0W(this.A08);
                throw th;
            }
        }
    }
}
