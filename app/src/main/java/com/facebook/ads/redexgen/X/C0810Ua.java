package com.facebook.ads.redexgen.X;

import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.facebook.ads.redexgen.X.Ua */
/* loaded from: assets/audience_network.dex */
public final class C0810Ua implements InterfaceC0471Gq {
    public HandlerC0465Gk<? extends InterfaceC0466Gl> A00;
    public IOException A01;
    public final ExecutorService A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final <T extends InterfaceC0466Gl> long A04(T t, InterfaceC0464Gj<T> interfaceC0464Gj, int i) {
        Looper myLooper = Looper.myLooper();
        HD.A04(myLooper != null);
        this.A01 = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new HandlerC0465Gk(this, myLooper, t, interfaceC0464Gj, i, elapsedRealtime).A06(0L);
        return elapsedRealtime;
    }

    public C0810Ua(String str) {
        this.A02 = C0499Hs.A0T(str);
    }

    public final void A05() {
        this.A00.A07(false);
    }

    public final void A06(int i) throws IOException {
        IOException iOException = this.A01;
        if (iOException == null) {
            HandlerC0465Gk<? extends InterfaceC0466Gl> handlerC0465Gk = this.A00;
            if (handlerC0465Gk != null) {
                if (i == Integer.MIN_VALUE) {
                    i = handlerC0465Gk.A03;
                }
                handlerC0465Gk.A05(i);
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void A07(@Nullable InterfaceC0467Gm interfaceC0467Gm) {
        HandlerC0465Gk<? extends InterfaceC0466Gl> handlerC0465Gk = this.A00;
        if (handlerC0465Gk != null) {
            handlerC0465Gk.A07(true);
        }
        if (interfaceC0467Gm != null) {
            this.A02.execute(new RunnableC0468Gn(interfaceC0467Gm));
        }
        this.A02.shutdown();
    }

    public final boolean A08() {
        return this.A00 != null;
    }
}
