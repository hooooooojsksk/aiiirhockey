package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.facebook.ads.redexgen.X.Ee */
/* loaded from: assets/audience_network.dex */
public final class C0411Ee {
    public static String[] A04 = {"XHo", "ubtbrXFiKU0aMD9WZdFFXMvL5SNCKhBD", "k9cdhOGQS1oEdCdR21VeueSE4nGT", "BZNadIlHUT8LbNbZ8qdMYncW4fXCJJFh", "22DNreJXUwzG5I9t9ymbmjKefjfUTWMr", "OkM0GcBH5aVjMNZagw1JqhxPR8ijdnHI", "ik3Hzc9el9B7KCBCFVHKN4tCPL2D2JGF", "0FgMGgJ2UsG2ZcXwt2m5OtQLezKmVI44"};
    public final int A00;
    @Nullable
    public final ER A01;
    public final long A02;
    public final CopyOnWriteArrayList<C0410Ed> A03;

    public C0411Ee() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public C0411Ee(CopyOnWriteArrayList<C0410Ed> copyOnWriteArrayList, int i, @Nullable ER er, long j) {
        this.A03 = copyOnWriteArrayList;
        this.A00 = i;
        this.A01 = er;
        this.A02 = j;
    }

    private long A00(long j) {
        long A01 = AnonymousClass99.A01(j);
        if (A01 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long mediaTimeMs = this.A02;
        return mediaTimeMs + A01;
    }

    private void A01(Handler handler, Runnable runnable) {
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    @CheckResult
    public final C0411Ee A02(int i, @Nullable ER er, long j) {
        return new C0411Ee(this.A03, i, er, j);
    }

    public final void A03() {
        HD.A04(this.A01 != null);
        Iterator<C0410Ed> it = this.A03.iterator();
        while (it.hasNext()) {
            C0410Ed next = it.next();
            InterfaceC0414Eh listener = next.A01;
            A01(next.A00, new EU(this, listener));
        }
    }

    public final void A04() {
        HD.A04(this.A01 != null);
        String[] strArr = A04;
        if (strArr[4].charAt(4) != strArr[1].charAt(4)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[4] = "rYA4ryMG3XFm73cnSWA4HWNW3HUxv7KC";
        strArr2[1] = "1YJ2rSWw51hvYcz1kikUBhJeKIWd76IZ";
        Iterator<C0410Ed> it = this.A03.iterator();
        while (it.hasNext()) {
            C0410Ed next = it.next();
            InterfaceC0414Eh listener = next.A01;
            A01(next.A00, new EV(this, listener));
        }
    }

    public final void A05() {
        HD.A04(this.A01 != null);
        Iterator<C0410Ed> it = this.A03.iterator();
        while (it.hasNext()) {
            C0410Ed next = it.next();
            InterfaceC0414Eh listener = next.A01;
            A01(next.A00, new RunnableC0407Ea(this, listener));
        }
    }

    public final void A06(int i, @Nullable Format format, int i2, @Nullable Object obj, long j) {
        A0C(new C0413Eg(1, i, format, i2, obj, A00(j), -9223372036854775807L));
    }

    public final void A07(Handler handler, InterfaceC0414Eh interfaceC0414Eh) {
        HD.A03((handler == null || interfaceC0414Eh == null) ? false : true);
        this.A03.add(new C0410Ed(handler, interfaceC0414Eh));
    }

    public final void A08(C0412Ef c0412Ef, C0413Eg c0413Eg) {
        Iterator<C0410Ed> it = this.A03.iterator();
        while (it.hasNext()) {
            C0410Ed next = it.next();
            InterfaceC0414Eh listener = next.A01;
            A01(next.A00, new EY(this, listener, c0412Ef, c0413Eg));
        }
    }

    public final void A09(C0412Ef c0412Ef, C0413Eg c0413Eg) {
        Iterator<C0410Ed> it = this.A03.iterator();
        while (it.hasNext()) {
            C0410Ed next = it.next();
            InterfaceC0414Eh listener = next.A01;
            A01(next.A00, new EX(this, listener, c0412Ef, c0413Eg));
        }
    }

    public final void A0A(C0412Ef c0412Ef, C0413Eg c0413Eg) {
        Iterator<C0410Ed> it = this.A03.iterator();
        while (it.hasNext()) {
            C0410Ed next = it.next();
            InterfaceC0414Eh listener = next.A01;
            A01(next.A00, new EW(this, listener, c0412Ef, c0413Eg));
        }
    }

    public final void A0B(C0412Ef c0412Ef, C0413Eg c0413Eg, IOException iOException, boolean z) {
        Iterator<C0410Ed> it = this.A03.iterator();
        while (it.hasNext()) {
            C0410Ed next = it.next();
            A01(next.A00, new EZ(this, next.A01, c0412Ef, c0413Eg, iOException, z));
        }
    }

    public final void A0C(C0413Eg c0413Eg) {
        Iterator<C0410Ed> it = this.A03.iterator();
        while (it.hasNext()) {
            C0410Ed next = it.next();
            InterfaceC0414Eh listener = next.A01;
            A01(next.A00, new RunnableC0409Ec(this, listener, c0413Eg));
        }
    }

    public final void A0D(InterfaceC0414Eh interfaceC0414Eh) {
        Iterator<C0410Ed> it = this.A03.iterator();
        while (it.hasNext()) {
            C0410Ed listenerAndHandler = it.next();
            if (listenerAndHandler.A01 == interfaceC0414Eh) {
                this.A03.remove(listenerAndHandler);
            }
        }
    }

    public final void A0E(C0458Gb c0458Gb, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2, long j3) {
        A0A(new C0412Ef(c0458Gb, j3, 0L, 0L), new C0413Eg(i, i2, format, i3, obj, A00(j), A00(j2)));
    }

    public final void A0F(C0458Gb c0458Gb, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2, long j3, long j4, long j5) {
        A08(new C0412Ef(c0458Gb, j3, j4, j5), new C0413Eg(i, i2, format, i3, obj, A00(j), A00(j2)));
    }

    public final void A0G(C0458Gb c0458Gb, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2, long j3, long j4, long j5) {
        A09(new C0412Ef(c0458Gb, j3, j4, j5), new C0413Eg(i, i2, format, i3, obj, A00(j), A00(j2)));
    }

    public final void A0H(C0458Gb c0458Gb, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
        A0B(new C0412Ef(c0458Gb, j3, j4, j5), new C0413Eg(i, i2, format, i3, obj, A00(j), A00(j2)), iOException, z);
    }
}
