package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import com.facebook.ads.redexgen.X.BG;
import com.mobirix.airhockey.airhockey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@TargetApi(18)
/* renamed from: com.facebook.ads.redexgen.X.Wc */
/* loaded from: assets/audience_network.dex */
public final class C0861Wc<T extends BG> implements BF<T>, InterfaceC0342Aw<T> {
    public static byte[] A0D;
    public static String[] A0E = {"ANYLgz", "oJggquXjFajkvVakw", "NhfBTMehdsUwmjJG25", "fCdIhqwNOTcaInr5tUyGNlroBtV", "OEWoY1V4f4faBwRg332bHxVOSHWwx21M", "QEXYlj0kmMt4ztT6jdLWJjem", "2UI8DlmhQXrJ84vyuAUmahlNAt", "mJ2nqf9sK7no"};
    public int A00;
    public Looper A01;
    public byte[] A02;
    public final int A03;
    public final B2 A04;
    public final BM<T> A05;
    public final BQ A06;
    public final HashMap<String, String> A07;
    public final List<C0862Wd<T>> A08;
    public final List<C0862Wd<T>> A09;
    public final UUID A0A;
    public final boolean A0B;
    public volatile B5 A0C;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] ^ i3;
            String[] strArr = A0E;
            if (strArr[1].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A0E[4] = "NBGjCtubpQRAXyW4McbyIV8QsblEY4y1";
            copyOfRange[i4] = (byte) (i5 ^ 105);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0D = new byte[]{airhockey.J_GAME_REMATCH, airhockey.P_GAME_MYLOSE, 75, 76, 88, 65, 89, airhockey.J_GAME_REMATCH, 95, 64, 126, airhockey.P_GAME_MYLOSE, 94, 94, airhockey.P_GAME_SELECTMAP, airhockey.P_NATION, airhockey.P_GAME_MYSCORE, 96, airhockey.P_GAME_EXIT, 95, 53, 3, 28, 56, 31, 24, 5, 53, 16, 5, 16, 81, 30, 31, 29, 8, 81, 18, 30, 31, 5, 16, 24, 31, 2, 81, 18, 30, 28, 28, 30, 31, 81, 33, 34, 34, 57, 81, 34, 18, 25, 20, 28, 20, 53, 16, 5, 16, 95, 81, 48, 2, 2, 4, 28, 24, 31, 22, 81, 2, 4, 1, 1, 30, 3, 5, 81, 23, 30, 3, 75, 81, 31, 30, 31, 77, 119, airhockey.J_REWARD, 119, airhockey.J_ENEMYWIN, 48, 54, 61, 48, airhockey.J_NATION, airhockey.J_ONREWARDED, 111, airhockey.J_SAVEDGAME_RELOAD};
    }

    static {
        A03();
    }

    public static DrmInitData.SchemeData A00(DrmInitData drmInitData, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(drmInitData.A01);
        int i = 0;
        while (true) {
            boolean z2 = false;
            if (i >= drmInitData.A01) {
                break;
            }
            DrmInitData.SchemeData A01 = drmInitData.A01(i);
            if (A01.A02(uuid) || (AnonymousClass99.A01.equals(uuid) && A01.A02(AnonymousClass99.A02))) {
                z2 = true;
            }
            if (z2 && (A01.A04 != null || z)) {
                arrayList.add(A01);
            }
            i++;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (AnonymousClass99.A05.equals(uuid)) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                DrmInitData.SchemeData schemeData = (DrmInitData.SchemeData) arrayList.get(i2);
                int A00 = schemeData.A01() ? CE.A00(schemeData.A04) : -1;
                if (C0499Hs.A02 < 23 && A00 == 0) {
                    return schemeData;
                }
                if (C0499Hs.A02 >= 23 && A00 == 1) {
                    return schemeData;
                }
            }
        }
        return (DrmInitData.SchemeData) arrayList.get(0);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wc != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.BG> */
    public final void A04(Handler handler, B3 b3) {
        this.A04.A03(handler, b3);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wc != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.BG> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wd != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.BG> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.ads.redexgen.X.BF
    public final BE<T> A2Q(Looper looper, DrmInitData drmInitData) {
        C0862Wd<T> c0862Wd;
        Looper looper2 = this.A01;
        HD.A04(looper2 == null || looper2 == looper);
        if (this.A09.isEmpty()) {
            this.A01 = looper;
            if (this.A0C == null) {
                this.A0C = new B5(this, looper);
            }
        }
        DrmInitData.SchemeData schemeData = null;
        C0862Wd<T> c0862Wd2 = (C0862Wd<T>) false;
        if (this.A02 == null && (schemeData = A00(drmInitData, this.A0A, false)) == null) {
            B6 b6 = new B6(this.A0A);
            this.A04.A04(b6);
            return new C0860Wb(new BC(b6));
        }
        if (!this.A0B) {
            c0862Wd = c0862Wd2;
            if (!this.A09.isEmpty()) {
                c0862Wd = this.A09.get(0);
            }
        } else {
            byte[] bArr = c0862Wd2;
            if (schemeData != null) {
                bArr = (C0862Wd<T>) schemeData.A04;
            }
            if (A0E[7].length() == 0) {
                throw new RuntimeException();
            }
            A0E[7] = "zebyso9QALf6mFi2tznux8P";
            Iterator<C0862Wd<T>> it = this.A09.iterator();
            while (true) {
                if (it.hasNext()) {
                    C0862Wd<T> next = it.next();
                    if (next.A0M(bArr)) {
                        c0862Wd = next;
                        break;
                    }
                } else {
                    c0862Wd = null;
                    break;
                }
            }
        }
        if (c0862Wd == null) {
            c0862Wd = new C0862Wd<>(this.A0A, this.A05, this, schemeData, this.A00, this.A02, this.A07, this.A06, looper, this.A04, this.A03);
            this.A09.add(c0862Wd);
        }
        c0862Wd.A0G();
        return c0862Wd;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b6, code lost:
        if (r4.equals(r5) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00c5, code lost:
        if (r4.equals(r5) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00c8, code lost:
        return true;
     */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wc != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.BG> */
    @Override // com.facebook.ads.redexgen.X.BF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A3y(@androidx.annotation.NonNull com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData r7) {
        /*
            r6 = this;
            byte[] r0 = r6.A02
            r3 = 1
            if (r0 == 0) goto L6
            return r3
        L6:
            java.util.UUID r0 = r6.A0A
            com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData$SchemeData r0 = A00(r7, r0, r3)
            r4 = 0
            if (r0 != 0) goto L5e
            int r5 = r7.A01
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C0861Wc.A0E
            r0 = 7
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 0
            if (r1 == r0) goto Lca
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0861Wc.A0E
            java.lang.String r1 = "Gq1nb8ZpgvmUzJpUyLgmbdlX"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "zEBygY"
            r0 = 0
            r2[r0] = r1
            if (r5 != r3) goto Lc9
            com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData$SchemeData r1 = r7.A01(r4)
            java.util.UUID r0 = com.facebook.ads.redexgen.X.AnonymousClass99.A02
            boolean r0 = r1.A02(r0)
            if (r0 == 0) goto Lc9
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r2 = 20
            r1 = 72
            r0 = 24
            java.lang.String r0 = A01(r2, r1, r0)
            r4.append(r0)
            java.util.UUID r0 = r6.A0A
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r2 = 0
            r1 = 20
            r0 = 68
            java.lang.String r0 = A01(r2, r1, r0)
            android.util.Log.w(r0, r4)
        L5e:
            java.lang.String r5 = r7.A02
            if (r5 == 0) goto L71
            r2 = 100
            r1 = 4
            r0 = 58
            java.lang.String r0 = A01(r2, r1, r0)
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L72
        L71:
            return r3
        L72:
            r2 = 92
            r1 = 4
            r0 = 21
            java.lang.String r0 = A01(r2, r1, r0)
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto Lb8
            r2 = 96
            r1 = 4
            r0 = 125(0x7d, float:1.75E-43)
            java.lang.String r0 = A01(r2, r1, r0)
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto Lb8
            r2 = 104(0x68, float:1.46E-43)
            r1 = 4
            r0 = 104(0x68, float:1.46E-43)
            java.lang.String r4 = A01(r2, r1, r0)
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0861Wc.A0E
            r0 = 6
            r1 = r2[r0]
            r0 = 2
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto Lc1
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0861Wc.A0E
            java.lang.String r1 = "bzvSTEO2NGjBPpa5noKORqr6ZpHh1m8T"
            r0 = 4
            r2[r0] = r1
            boolean r0 = r4.equals(r5)
            if (r0 == 0) goto Lc8
        Lb8:
            int r1 = com.facebook.ads.redexgen.X.C0499Hs.A02
            r0 = 25
            if (r1 < r0) goto Lbf
        Lbe:
            return r3
        Lbf:
            r3 = 0
            goto Lbe
        Lc1:
            boolean r0 = r4.equals(r5)
            if (r0 == 0) goto Lc8
            goto Lb8
        Lc8:
            return r3
        Lc9:
            return r4
        Lca:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0861Wc.A3y(com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData):boolean");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wc != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.BG> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wd != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.BG> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0342Aw
    public final void ACE() {
        for (C0862Wd<T> c0862Wd : this.A08) {
            String[] strArr = A0E;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            A0E[4] = "E3b0MKGlV7Qlh8NFsi3ziriRt4u9XqXm";
            c0862Wd.A0H();
        }
        this.A08.clear();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wc != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.BG> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wd != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.BG> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0342Aw
    public final void ACF(Exception exc) {
        for (C0862Wd<T> c0862Wd : this.A08) {
            c0862Wd.A0K(exc);
        }
        this.A08.clear();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wc != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.BG> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wd != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.BG> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0342Aw
    public final void ADi(C0862Wd<T> c0862Wd) {
        this.A08.add(c0862Wd);
        if (this.A08.size() == 1) {
            c0862Wd.A0I();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BE != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSession<T extends com.facebook.ads.redexgen.X.BG> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wc != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.BG> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wd != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.BG> */
    @Override // com.facebook.ads.redexgen.X.BF
    public final void AEA(BE<T> be) {
        if (be instanceof C0860Wb) {
            return;
        }
        C0862Wd<T> c0862Wd = (C0862Wd) be;
        if (c0862Wd.A0L()) {
            this.A09.remove(c0862Wd);
            if (this.A08.size() > 1 && this.A08.get(0) == c0862Wd) {
                List<C0862Wd<T>> list = this.A08;
                if (A0E[7].length() == 0) {
                    throw new RuntimeException();
                }
                String[] strArr = A0E;
                strArr[1] = "8HEKS9j6P5APhESSR";
                strArr[3] = "SFo7ZRHt72jFDiQQTk8v57UjUPr";
                list.get(1).A0I();
            }
            this.A08.remove(c0862Wd);
        }
    }
}
