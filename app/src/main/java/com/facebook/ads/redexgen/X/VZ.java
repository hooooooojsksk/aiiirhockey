package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.mobirix.airhockey.airhockey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class VZ implements BV {
    public static byte[] A0C;
    public static String[] A0D = {"1uxTk9uu8NGqb4bRD7SiE7", "Ssi3SEW4IwUGp9bqpG4lGM81x4BmU482", "xmiG4gye91jMk16VeYAf2JsNYB9ZLAXn", "P3M63oXZ4RlItM7d6tCP0FhU4UJB0VVm", "pvrI0I2hPgkxZ7mKqcVNCE", "IViSy7bNMMRqTObQqgQHZJ03ioQVAxI3", "AKSfxMAYbymYkKmkIHXjHayRWnu0Srjs", "XaZNcJans0E3GSdApjoK7oUba6xaED3H"};
    public static final BY A0E;
    public static final long A0F;
    public static final long A0G;
    public static final long A0H;
    public int A00;
    public int A01;
    public BX A02;
    public InterfaceC0376Cq A03;
    public boolean A04;
    public final int A05;
    public final SparseArray<InterfaceC0376Cq> A06;
    public final SparseBooleanArray A07;
    public final SparseIntArray A08;
    public final InterfaceC0374Co A09;
    public final C0483Hc A0A;
    public final List<C0495Ho> A0B;

    public static String A0D(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 25);
        }
        return new String(copyOfRange);
    }

    public static void A0G() {
        A0C = new byte[]{-64, -62, -84, -78, -106, -76, -63, -63, -62, -57, airhockey.J_SAVEDGAME_SAVE, -71, -68, -63, -73, airhockey.J_SAVEDGAME_SAVE, -58, -52, -63, -74, airhockey.J_SAVEDGAME_SAVE, -75, -52, -57, -72, -127, airhockey.J_SAVEDGAME_SAVE, -96, -62, -58, -57, airhockey.J_SAVEDGAME_SAVE, -65, -68, -66, -72, -65, -52, airhockey.J_SAVEDGAME_SAVE, -63, -62, -57, airhockey.J_SAVEDGAME_SAVE, -76, airhockey.J_SAVEDGAME_SAVE, -89, -59, -76, -63, -58, -61, -62, -59, -57, airhockey.J_SAVEDGAME_SAVE, -90, -57, -59, -72, -76, -64, -127, airhockey.J_SAVEDGAME_SAVE, 111, airhockey.J_BACK, airhockey.J_SDKVER, -53, -56, -39, -58};
    }

    static {
        A0G();
        A0E = new C0838Vc();
        A0F = C0499Hs.A08(A0D(0, 4, 102));
        A0G = C0499Hs.A08(A0D(62, 4, 21));
        A0H = C0499Hs.A08(A0D(66, 4, 106));
    }

    public VZ() {
        this(0);
    }

    public VZ(int i) {
        this(1, i);
    }

    public VZ(int i, int i2) {
        this(i, new C0495Ho(0L), new C0850Vq(i2));
    }

    public VZ(int i, C0495Ho c0495Ho, InterfaceC0374Co interfaceC0374Co) {
        this.A09 = (InterfaceC0374Co) HD.A01(interfaceC0374Co);
        this.A05 = i;
        if (i == 1 || i == 2) {
            this.A0B = Collections.singletonList(c0495Ho);
        } else {
            this.A0B = new ArrayList();
            this.A0B.add(c0495Ho);
        }
        this.A0A = new C0483Hc(new byte[9400], 0);
        this.A07 = new SparseBooleanArray();
        this.A06 = new SparseArray<>();
        this.A08 = new SparseIntArray();
        A0F();
    }

    public static /* synthetic */ int A01(VZ vz) {
        int i = vz.A01;
        vz.A01 = i + 1;
        return i;
    }

    private void A0F() {
        this.A07.clear();
        this.A06.clear();
        SparseArray<InterfaceC0376Cq> A4N = this.A09.A4N();
        int size = A4N.size();
        for (int i = 0; i < size; i++) {
            SparseArray<InterfaceC0376Cq> sparseArray = this.A06;
            int initialPayloadReadersSize = A4N.keyAt(i);
            sparseArray.put(initialPayloadReadersSize, A4N.valueAt(i));
        }
        this.A06.put(0, new C0840Ve(new C0837Vb(this)));
        this.A03 = null;
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final void A8V(BX bx) {
        this.A02 = bx;
        bx.AEd(new WU(-9223372036854775807L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0094, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x013c, code lost:
        if ((r12 & 32) != 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x013e, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0169, code lost:
        if ((r12 & 32) != 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x016c, code lost:
        r10 = false;
     */
    @Override // com.facebook.ads.redexgen.X.BV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int ADp(com.facebook.ads.redexgen.X.BW r14, com.facebook.ads.redexgen.X.C0346Bc r15) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.VZ.ADp(com.facebook.ads.redexgen.X.BW, com.facebook.ads.redexgen.X.Bc):int");
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final void AEc(long j, long j2) {
        int size = this.A0B.size();
        for (int i = 0; i < size; i++) {
            this.A0B.get(i).A08();
        }
        this.A0A.A0V();
        this.A08.clear();
        A0F();
        this.A00 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0021, code lost:
        r3 = r3 + 1;
     */
    @Override // com.facebook.ads.redexgen.X.BV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean AFL(com.facebook.ads.redexgen.X.BW r7) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r6 = this;
            com.facebook.ads.redexgen.X.Hc r0 = r6.A0A
            byte[] r5 = r0.A00
            r4 = 0
            r0 = 940(0x3ac, float:1.317E-42)
            r7.ADP(r5, r4, r0)
            r3 = 0
        Lb:
            r0 = 188(0xbc, float:2.63E-43)
            if (r3 >= r0) goto L27
            r2 = 0
        L10:
            r0 = 5
            if (r2 != r0) goto L18
            r7.AFJ(r3)
            r0 = 1
            return r0
        L18:
            int r0 = r2 * 188
            int r0 = r0 + r3
            r1 = r5[r0]
            r0 = 71
            if (r1 == r0) goto L24
            int r3 = r3 + 1
            goto Lb
        L24:
            int r2 = r2 + 1
            goto L10
        L27:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.VZ.AFL(com.facebook.ads.redexgen.X.BW):boolean");
    }
}
