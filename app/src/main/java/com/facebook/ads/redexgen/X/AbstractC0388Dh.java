package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import java.io.IOException;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.Dh */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0388Dh implements InterfaceC0879Wu, InterfaceC03089n {
    public int A00;
    public int A01;
    public long A02;
    public C03099o A03;
    public InterfaceC0421Eo A04;
    public boolean A05 = true;
    public boolean A06;
    public Format[] A07;
    public final int A08;

    public AbstractC0388Dh(int i) {
        this.A08 = i;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BF != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<?> */
    public static boolean A0x(@Nullable BF<?> bf, @Nullable DrmInitData drmInitData) {
        if (drmInitData == null) {
            return true;
        }
        if (bf == null) {
            return false;
        }
        return bf.A3y(drmInitData);
    }

    public final int A0y() {
        return this.A00;
    }

    public final int A0z(long j) {
        return this.A04.AFI(j - this.A02);
    }

    public final int A10(C9S c9s, C0865Wg c0865Wg, boolean z) {
        int ADs = this.A04.ADs(c9s, c0865Wg, z);
        if (ADs == -4) {
            if (c0865Wg.A04()) {
                this.A05 = true;
                return this.A06 ? -4 : -3;
            }
            c0865Wg.A00 += this.A02;
        } else if (ADs == -5) {
            Format format = c9s.A00;
            int result = (format.A0G > LongCompanionObject.MAX_VALUE ? 1 : (format.A0G == LongCompanionObject.MAX_VALUE ? 0 : -1));
            if (result != 0) {
                c9s.A00 = format.A0H(format.A0G + this.A02);
            }
        }
        return ADs;
    }

    public final C03099o A11() {
        return this.A03;
    }

    public void A12() {
    }

    public void A13() throws C9F {
    }

    public void A14() throws C9F {
    }

    public void A15(long j, boolean z) throws C9F {
    }

    public void A16(boolean z) throws C9F {
    }

    public void A17(Format[] formatArr, long j) throws C9F {
    }

    public final boolean A18() {
        return this.A05 ? this.A06 : this.A04.A8r();
    }

    public final Format[] A19() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Wu
    public final void A4q() {
        HD.A04(this.A01 == 1);
        this.A01 = 0;
        this.A04 = null;
        this.A07 = null;
        this.A06 = false;
        A12();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Wu
    public final void A5D(C03099o c03099o, Format[] formatArr, InterfaceC0421Eo interfaceC0421Eo, long j, boolean z, long j2) throws C9F {
        HD.A04(this.A01 == 0);
        this.A03 = c03099o;
        this.A01 = 1;
        A16(z);
        AEJ(formatArr, interfaceC0421Eo, j2);
        A15(j, z);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Wu
    public final InterfaceC03089n A61() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Wu
    public HT A74() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Wu
    public final int A7i() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Wu
    public final InterfaceC0421Eo A7n() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Wu, com.facebook.ads.redexgen.X.InterfaceC03089n
    public final int A7u() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03059k
    public void A8C(int i, Object obj) throws C9F {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Wu
    public final boolean A8H() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Wu
    public final boolean A8e() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Wu
    public final void A9m() throws IOException {
        this.A04.A9j();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Wu
    public final void AEJ(Format[] formatArr, InterfaceC0421Eo interfaceC0421Eo, long j) throws C9F {
        HD.A04(!this.A06);
        this.A04 = interfaceC0421Eo;
        this.A05 = false;
        this.A07 = formatArr;
        this.A02 = j;
        A17(formatArr, j);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Wu
    public final void AET(long j) throws C9F {
        this.A06 = false;
        this.A05 = false;
        A15(j, false);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Wu
    public final void AEt() {
        this.A06 = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Wu
    public final void AEw(int i) {
        this.A00 = i;
    }

    public int AFa() throws C9F {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Wu
    public final void start() throws C9F {
        HD.A04(this.A01 == 1);
        this.A01 = 2;
        A13();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Wu
    public final void stop() throws C9F {
        HD.A04(this.A01 == 2);
        this.A01 = 1;
        A14();
    }
}
