package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mobirix.airhockey.airhockey;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.Dg */
/* loaded from: assets/audience_network.dex */
public final class C0387Dg implements InterfaceC0880Wv {
    public static byte[] A0M;
    public static String[] A0N = {"m3Tqgcaf5Zwh2KVI4lshI8Y9OWjAyKiW", "grdEJ2UvF2rVdGgR2IFX1R9SZI3Oow9U", "adSXB2DteQqbyu8FZt3lmhGSn0N0giaq", "NRdDTd6ed3Jg0yXdfuAl28VADrUF9IBW", "O75rLRuL5gqpexSF7Nk4cqg8fxEEp65Y", "atjqzip57QIi0KmRPtssGorCsXfOnHh4", "4ftStqMBHRnBf64I9Tdbb6", "F7xqVaNkoKYb3tQw5W1HE7EtQtFRVx9Y"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    @Nullable
    public C9F A05;
    public C9Z A06;
    public C02959a A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final Handler A0C;
    public final Handler A0D;
    public final C0386Df A0E;
    public final C03129s A0F;
    public final C03139t A0G;
    public final GM A0H;
    public final GN A0I;
    public final ArrayDeque<C9J> A0J;
    public final CopyOnWriteArraySet<InterfaceC02989d> A0K;
    public final InterfaceC0879Wu[] A0L;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0M, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 6);
            if (A0N[6].length() == 15) {
                throw new RuntimeException();
            }
            String[] strArr = A0N;
            strArr[0] = "Q2Fud838jOFv6puDYoQ5JAWfmkdvAH2h";
            strArr[3] = "Px66e0ytNEnQno4fNGUkfPLcZSToOlLf";
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0M = new byte[]{airhockey.J_WAIT, -76, -93, -42, -51, -82, -54, -65, -41, -61, -48, -89, -53, -50, -54, airhockey.J_DISCONNECT, -89, -98, ByteCompanionObject.MAX_VALUE, -101, -112, -88, -108, -95, 123, -104, -111, 94, airhockey.J_SDKVER, 93, airhockey.J_ENEMYWIN, 93, 99, -125, -88, -93, -82, 90, -107, -88, -81, -88, -92, -74, -88, 99, -97, -101, 94, -103, -14, -28, -28, -22, -45, -18, -97, -24, -26, -19, -18, -15, -28, -29, -97, -31, -28, -30, -32, -12, -14, -28, -97, -32, -19, -97, -32, -29, -97, -24, -14, -97, -17, -21, -32, -8, -24, -19, -26};
    }

    static {
        A03();
    }

    @SuppressLint({"HandlerLeak"})
    public C0387Dg(InterfaceC0879Wu[] interfaceC0879WuArr, GM gm, C9U c9u, HG hg) {
        Log.i(A02(2, 13, 88), A02(33, 5, 52) + Integer.toHexString(System.identityHashCode(this)) + A02(0, 2, 83) + A02(15, 18, 41) + A02(47, 3, 56) + C0499Hs.A04 + A02(46, 1, 60));
        HD.A04(interfaceC0879WuArr.length > 0);
        this.A0L = (InterfaceC0879Wu[]) HD.A01(interfaceC0879WuArr);
        this.A0H = (GM) HD.A01(gm);
        this.A0A = false;
        this.A03 = 0;
        this.A0B = false;
        this.A0K = new CopyOnWriteArraySet<>();
        this.A0I = new GN(new C03099o[interfaceC0879WuArr.length], new GJ[interfaceC0879WuArr.length], null);
        this.A0G = new C03139t();
        this.A0F = new C03129s();
        this.A07 = C02959a.A04;
        this.A0C = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()) { // from class: com.facebook.ads.redexgen.X.9I
            public static String[] A01 = {"n8jOK4TugbxocxEe6zYdC2apb8QBw5B2", "exJ9q2BbStmAElE6QlD9JR4gSu8htBEk", "BGOnc", "fVxwFvnWrEIXSQGXaFTt487unfsGWTNS", "M8AH3IesIZMXIj5TZDcC18mK6a9vd0E5", "EIDq0z1OpkYiciQBrU8tJkkKsNLFcNAn", "GYYw65loVBDf2akXR1DT72AGTz3TCOWc", "b13Ux"};

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (C0548Jt.A02(this)) {
                    return;
                }
                try {
                    C0387Dg.this.A0A(message);
                } catch (Throwable th) {
                    if (A01[3].charAt(19) != 't') {
                        throw new RuntimeException();
                    }
                    A01[6] = "ke6EFi0zu2eoeRmOo8SEy2Wv36xrwBWP";
                    C0548Jt.A00(th, this);
                }
            }
        };
        this.A06 = new C9Z(AbstractC03149u.A01, 0L, TrackGroupArray.A04, this.A0I);
        this.A0J = new ArrayDeque<>();
        this.A0E = new C0386Df(interfaceC0879WuArr, gm, this.A0I, c9u, this.A0A, this.A03, this.A0B, this.A0C, this, hg);
        this.A0D = new Handler(this.A0E.A0w());
    }

    private long A00(long j) {
        long A01 = AnonymousClass99.A01(j);
        if (!this.A06.A04.A01()) {
            this.A06.A03.A09(this.A06.A04.A02, this.A0F);
            long positionMs = this.A0F.A08();
            return A01 + positionMs;
        }
        return A01;
    }

    private C9Z A01(boolean z, boolean z2, int i) {
        GN gn;
        if (z) {
            this.A01 = 0;
            this.A00 = 0;
            this.A04 = 0L;
        } else {
            this.A01 = A6O();
            this.A00 = A07();
            this.A04 = A6L();
        }
        AbstractC03149u abstractC03149u = z2 ? AbstractC03149u.A01 : this.A06.A03;
        if (A0N[1].charAt(17) != 'a') {
            String[] strArr = A0N;
            strArr[0] = "HCeOoliCNtIhqJVVEoV7ODJTUFyfMCgc";
            strArr[3] = "jOBrxCepwz9IOjYxDZZOtd2HpuVunHZu";
            Object obj = z2 ? null : this.A06.A07;
            ER er = this.A06.A04;
            long j = this.A06.A02;
            long j2 = this.A06.A01;
            TrackGroupArray trackGroupArray = z2 ? TrackGroupArray.A04 : this.A06.A05;
            if (z2) {
                gn = this.A0I;
            } else {
                gn = this.A06.A06;
            }
            return new C9Z(abstractC03149u, obj, er, j, j2, i, false, trackGroupArray, gn);
        }
        throw new RuntimeException();
    }

    private void A04(C9Z c9z, int i, boolean z, int i2) {
        int i3;
        C9Z c9z2 = c9z;
        this.A02 -= i;
        if (this.A02 == 0) {
            if (c9z2.A02 == -9223372036854775807L) {
                c9z2 = c9z2.A04(c9z2.A04, 0L, c9z2.A01);
            }
            if ((!this.A06.A03.A0E() || this.A08) && c9z2.A03.A0E()) {
                this.A00 = 0;
                this.A01 = 0;
                this.A04 = 0L;
            }
            if (this.A08) {
                i3 = 0;
            } else {
                i3 = 2;
            }
            boolean z2 = this.A09;
            this.A08 = false;
            this.A09 = false;
            A05(c9z2, z, i2, i3, z2, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A05(C9Z c9z, boolean z, int i, int i2, boolean z2, boolean z3) {
        boolean isRunningRecursiveListenerNotification = !this.A0J.isEmpty();
        this.A0J.addLast(new Object(c9z, this.A06, this.A0K, this.A0H, z, i, i2, z2, this.A0A, z3) { // from class: com.facebook.ads.redexgen.X.9J
            public static String[] A0C = {"ngVoBp5pr", "xJziJS8oS", "0Acs5KUpAntiIN9SBf", "RdvtHMhhQhD1iGhGKfpT4jwIcRZugl7b", "SwdEOGzegqYmuuXtqS3DnPJA1PQs60Y1", "mjJqNiV5uYYXT5JIaz2mCpImvyi2YwVT", "z", "dC4jFhBSvokHiCeDasSLAsgetwgdiZCj"};
            public final int A00;
            public final int A01;
            public final C9Z A02;
            public final GM A03;
            public final Set<InterfaceC02989d> A04;
            public final boolean A05;
            public final boolean A06;
            public final boolean A07;
            public final boolean A08;
            public final boolean A09;
            public final boolean A0A;
            public final boolean A0B;

            {
                this.A02 = c9z;
                this.A04 = copyOnWriteArraySet;
                this.A03 = gm;
                this.A08 = z;
                this.A00 = i;
                this.A01 = i2;
                this.A09 = z2;
                this.A06 = z4;
                this.A07 = z3 || c9z2.A00 != c9z.A00;
                this.A0A = (c9z2.A03 == c9z.A03 && c9z2.A07 == c9z.A07) ? false : true;
                this.A05 = c9z2.A08 != c9z.A08;
                this.A0B = c9z2.A06 != c9z.A06;
            }

            public final void A00() {
                Iterator<InterfaceC02989d> it;
                if (this.A0A || this.A01 == 0) {
                    for (InterfaceC02989d interfaceC02989d : this.A04) {
                        interfaceC02989d.ACl(this.A02.A03, this.A02.A07, this.A01);
                    }
                }
                if (this.A08) {
                    for (InterfaceC02989d listener : this.A04) {
                        listener.AC7(this.A00);
                    }
                }
                boolean z5 = this.A0B;
                String[] strArr = A0C;
                if (strArr[6].length() != strArr[2].length()) {
                    A0C[4] = "kVA7KUftqEYsKKgit7KobnVmlfmelHtP";
                    if (z5) {
                        this.A03.A0U(this.A02.A06.A02);
                        for (InterfaceC02989d interfaceC02989d2 : this.A04) {
                            C9Z c9z3 = this.A02;
                            String[] strArr2 = A0C;
                            if (strArr2[0].length() == strArr2[1].length()) {
                                String[] strArr3 = A0C;
                                strArr3[6] = InneractiveMediationDefs.GENDER_MALE;
                                strArr3[2] = "KqMQ2zUn9wEBuYOIrT";
                                interfaceC02989d2.ACn(c9z3.A05, this.A02.A06.A01);
                            }
                        }
                    }
                    boolean z6 = this.A05;
                    if (A0C[5].charAt(4) == 'F') {
                        throw new RuntimeException();
                    }
                    A0C[5] = "SUKzwd9m16qKT5RYTkUj9PT0NEqmu9kE";
                    if (z6) {
                        Iterator<InterfaceC02989d> it2 = this.A04.iterator();
                        while (true) {
                            boolean hasNext = it2.hasNext();
                            if (A0C[4].charAt(10) == 'Y') {
                                String[] strArr4 = A0C;
                                strArr4[6] = "I";
                                strArr4[2] = "zdEQR0QEwobMnnP3YQ";
                                if (!hasNext) {
                                    break;
                                }
                                InterfaceC02989d listener22 = it2.next();
                                listener22.ABa(this.A02.A08);
                            } else {
                                String[] strArr5 = A0C;
                                strArr5[0] = "7SswXZjoc";
                                strArr5[1] = "LaiVjvUVk";
                                if (!hasNext) {
                                    break;
                                }
                                InterfaceC02989d listener222 = it2.next();
                                listener222.ABa(this.A02.A08);
                            }
                        }
                    }
                    if (this.A07) {
                        Set<InterfaceC02989d> set = this.A04;
                        String[] strArr6 = A0C;
                        if (strArr6[6].length() != strArr6[2].length()) {
                            A0C[5] = "xdr5mmXrWjbqVTrxDMPiLI1UYtBVMgU7";
                            it = set.iterator();
                        } else {
                            A0C[5] = "vgNSEPQsIWHaSH2OFiWclNn1gpDCsXwE";
                            it = set.iterator();
                        }
                        while (it.hasNext()) {
                            it.next().AC5(this.A06, this.A02.A00);
                        }
                    }
                    if (this.A09) {
                        for (InterfaceC02989d interfaceC02989d3 : this.A04) {
                            interfaceC02989d3.ACW();
                        }
                        return;
                    }
                    return;
                }
                throw new RuntimeException();
            }
        });
        this.A06 = c9z;
        if (isRunningRecursiveListenerNotification) {
            return;
        }
        while (!this.A0J.isEmpty()) {
            this.A0J.peekFirst().A00();
            this.A0J.removeFirst();
        }
    }

    private boolean A06() {
        return this.A06.A03.A0E() || this.A02 > 0;
    }

    public final int A07() {
        if (A06()) {
            return this.A00;
        }
        return this.A06.A04.A02;
    }

    public final void A08(int i) {
        A09(i, -9223372036854775807L);
    }

    public final void A09(int i, long j) {
        long A00;
        AbstractC03149u abstractC03149u = this.A06.A03;
        if (i < 0 || (!abstractC03149u.A0E() && i >= abstractC03149u.A01())) {
            throw new C9T(abstractC03149u, i, j);
        }
        this.A09 = true;
        this.A02++;
        boolean A0B = A0B();
        String[] strArr = A0N;
        if (strArr[7].charAt(11) == strArr[2].charAt(11)) {
            String[] strArr2 = A0N;
            strArr2[0] = "5JrPhprFhX8le0yHjhtYDABd6qn7MJv2";
            strArr2[3] = "AcgEDj7anvk4CRi6YuD76A9KphiljDlH";
            if (A0B) {
                Log.w(A02(2, 13, 88), A02(50, 39, 121));
                this.A0C.obtainMessage(0, 1, -1, this.A06).sendToTarget();
                return;
            }
            this.A01 = i;
            if (abstractC03149u.A0E()) {
                this.A04 = j == -9223372036854775807L ? 0L : j;
                this.A00 = 0;
            } else {
                if (j == -9223372036854775807L) {
                    C03139t c03139t = this.A0G;
                    String[] strArr3 = A0N;
                    if (strArr3[0].charAt(24) != strArr3[3].charAt(24)) {
                        A0N[5] = "nEFnc7B5wfhj7ivnhhzsBLpbkebEETny";
                        A00 = abstractC03149u.A0B(i, c03139t).A01();
                    }
                } else {
                    A00 = AnonymousClass99.A00(j);
                    if (A0N[5].charAt(0) == 'S') {
                        throw new RuntimeException();
                    }
                    String[] strArr4 = A0N;
                    strArr4[0] = "wxFThwrlUUeaJzWEA8zt6g3O6WvT4NEY";
                    strArr4[3] = "Cn8KVFPYAIX7JaaKfRlHGvTkFrF10J5Z";
                }
                Pair<Integer, Long> A07 = abstractC03149u.A07(this.A0G, this.A0F, i, A00);
                this.A04 = AnonymousClass99.A01(A00);
                this.A00 = ((Integer) A07.first).intValue();
            }
            this.A0E.A0y(abstractC03149u, i, AnonymousClass99.A00(j));
            Iterator<InterfaceC02989d> it = this.A0K.iterator();
            while (it.hasNext()) {
                it.next().AC7(1);
            }
            return;
        }
        throw new RuntimeException();
    }

    public final void A0A(Message message) {
        int i = message.what;
        if (i == 0) {
            A04((C9Z) message.obj, message.arg1, message.arg2 != -1, message.arg2);
            return;
        }
        if (i == 1) {
            C02959a c02959a = (C02959a) message.obj;
            C02959a playbackParameters = this.A07;
            if (!playbackParameters.equals(c02959a)) {
                this.A07 = c02959a;
                Iterator<InterfaceC02989d> it = this.A0K.iterator();
                while (it.hasNext()) {
                    InterfaceC02989d next = it.next();
                    if (A0N[5].charAt(0) != 'S') {
                        A0N[6] = "dJbHrg";
                        next.AC1(c02959a);
                    }
                }
                return;
            }
            return;
        }
        String[] strArr = A0N;
        if (strArr[0].charAt(24) != strArr[3].charAt(24)) {
            A0N[6] = "4yvjfA5Kw";
            if (i == 2) {
                Object obj = message.obj;
                if (A0N[6].length() == 15) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0N;
                strArr2[0] = "M6bFWga7XOh4Nv4psw4qaL9KmcGoAikz";
                strArr2[3] = "g5TiVjLanBSgFn2xszzFJfFzrFRrWctq";
                C9F c9f = (C9F) obj;
                this.A05 = c9f;
                Iterator<InterfaceC02989d> it2 = this.A0K.iterator();
                while (it2.hasNext()) {
                    it2.next().AC3(c9f);
                }
                return;
            }
            throw new IllegalStateException();
        }
        throw new RuntimeException();
    }

    public final boolean A0B() {
        return !A06() && this.A06.A04.A01();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03039i
    public final void A3F(InterfaceC02989d interfaceC02989d) {
        this.A0K.add(interfaceC02989d);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0880Wv
    public final C03069l A4O(InterfaceC03059k interfaceC03059k) {
        return new C03069l(this.A0E, interfaceC03059k, this.A06.A03, A6O(), this.A0D);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03039i
    public final int A5u() {
        long A5v = A5v();
        long A6X = A6X();
        if (A5v == -9223372036854775807L || A6X == -9223372036854775807L) {
            return 0;
        }
        if (A6X == 0) {
            return 100;
        }
        return C0499Hs.A06((int) ((100 * A5v) / A6X), 0, 100);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03039i
    public final long A5v() {
        if (A06()) {
            return this.A04;
        }
        return A00(this.A06.A09);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03039i
    public final long A6G() {
        if (A0B()) {
            this.A06.A03.A09(this.A06.A04.A02, this.A0F);
            C03129s c03129s = this.A0F;
            if (A0N[4].charAt(19) != 'z') {
                A0N[4] = "eLr0wKhVkEyrTiyBT4e5CdZ3SmFaaZ0Y";
                return c03129s.A08() + AnonymousClass99.A01(this.A06.A01);
            }
            throw new RuntimeException();
        }
        return A6L();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03039i
    public final int A6I() {
        if (A0B()) {
            return this.A06.A04.A00;
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03039i
    public final int A6J() {
        if (A0B()) {
            return this.A06.A04.A01;
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03039i
    public final long A6L() {
        if (A06()) {
            return this.A04;
        }
        return A00(this.A06.A0A);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03039i
    public final AbstractC03149u A6N() {
        return this.A06.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03039i
    public final int A6O() {
        if (A06()) {
            int i = this.A01;
            if (A0N[4].charAt(19) != 'z') {
                A0N[6] = "IPV6VHeKuNfhgMSHvhaXB";
                return i;
            }
            throw new RuntimeException();
        }
        return this.A06.A03.A09(this.A06.A04.A02, this.A0F).A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03039i
    public final long A6X() {
        AbstractC03149u abstractC03149u = this.A06.A03;
        if (abstractC03149u.A0E()) {
            return -9223372036854775807L;
        }
        if (A0B()) {
            ER er = this.A06.A04;
            abstractC03149u.A09(er.A02, this.A0F);
            return AnonymousClass99.A01(this.A0F.A0A(er.A00, er.A01));
        }
        return abstractC03149u.A0B(A6O(), this.A0G).A02();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03039i
    public final boolean A7N() {
        return this.A0A;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0880Wv
    public final void ADZ(ET et, boolean z, boolean z2) {
        this.A05 = null;
        C9Z A01 = A01(z, z2, 2);
        this.A08 = true;
        this.A02++;
        this.A0E.A0z(et, z, z2);
        A05(A01, false, 4, 1, false, false);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03039i
    public final void AE4() {
        StringBuilder sb = new StringBuilder();
        sb.append(A02(38, 8, 61));
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(A02(0, 2, 83));
        sb.append(A02(15, 18, 41));
        String A02 = A02(47, 3, 56);
        sb.append(A02);
        sb.append(C0499Hs.A04);
        sb.append(A02);
        sb.append(C9P.A00());
        sb.append(A02(46, 1, 60));
        Log.i(A02(2, 13, 88), sb.toString());
        this.A0E.A0x();
        this.A0C.removeCallbacksAndMessages(null);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03039i
    public final void AEe(long j) {
        A09(A6O(), j);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03039i
    public final void AEf() {
        A08(A6O());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03039i
    public final void AF3(boolean z) {
        if (this.A0A != z) {
            this.A0A = z;
            this.A0E.A10(z);
            A05(this.A06, false, 4, 1, false, true);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03039i
    public final void AFU(boolean z) {
        if (z) {
            this.A05 = null;
        }
        C9Z A01 = A01(z, z, 1);
        this.A02++;
        this.A0E.A11(z);
        A05(A01, false, 4, 1, false, false);
    }
}
