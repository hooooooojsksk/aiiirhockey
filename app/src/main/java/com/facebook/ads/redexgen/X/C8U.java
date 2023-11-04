package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.redexgen.X.C8T;
import com.facebook.ads.redexgen.X.C8V;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* renamed from: com.facebook.ads.redexgen.X.8U */
/* loaded from: assets/audience_network.dex */
public final class C8U<T extends C8V, E extends C8T> {
    public static String[] A02 = {"WBmgDKUAJnOjRPVdo459bnYJXDnRSoZA", "OZ5TpfWbSmXE", "sC9WLlq1dd0W0qrWeGI0su3O22TcCAEW", "0Ub2X", "5m4s5CvbohnvtMuC", "JEGJTDHJWZGaFE0Bjwe", "ELtjylBnyGpGsAAS3nfDjHYeujv6lcAm", "LzmA2INjpudrbI3uXcOOEdZHAsdjx9ZW"};
    public final Map<Class<E>, List<WeakReference<T>>> A00 = new HashMap();
    public final Queue<E> A01 = new ArrayDeque();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private void A00(E e) {
        List<WeakReference<T>> list;
        Map<Class<E>, List<WeakReference<T>>> map = this.A00;
        if (map == null || (list = map.get(e.getClass())) == null) {
            return;
        }
        A01(list);
        if (list.isEmpty()) {
            return;
        }
        for (WeakReference weakReference : new ArrayList(list)) {
            C8V c8v = (C8V) weakReference.get();
            if (c8v != null && c8v.A00(e)) {
                c8v.A03(e);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final synchronized void A02(E e) {
        if (this.A01.isEmpty()) {
            this.A01.add(e);
            while (!this.A01.isEmpty()) {
                A00(this.A01.peek());
                this.A01.remove();
            }
        } else {
            this.A01.add(e);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final synchronized boolean A05(T t) {
        if (t == null) {
            return false;
        }
        Class<E> A01 = t.A01();
        if (this.A00.get(A01) == null) {
            this.A00.put(A01, new ArrayList());
        }
        List<WeakReference<T>> list = this.A00.get(A01);
        A01(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).get() == t) {
                return false;
            }
        }
        return list.add(new WeakReference<>(t));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8U != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.8V, E extends com.facebook.ads.redexgen.X.8T> */
    /* JADX WARN: Incorrect condition in loop: B:29:0x0008 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A01(java.util.List<java.lang.ref.WeakReference<T>> r8) {
        /*
            r7 = this;
            if (r8 == 0) goto L4c
            r4 = 0
            r6 = 0
        L4:
            int r0 = r8.size()
            if (r6 >= r0) goto L3e
            java.lang.Object r5 = r8.get(r6)
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5
            java.lang.Object r3 = r5.get()
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C8U.A02
            r0 = 1
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 12
            if (r1 == r0) goto L27
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L27:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C8U.A02
            java.lang.String r1 = "MDutMibHR0xfS0kHpIX6qzWASaThPw85"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "nvT9JaP2TDwXv3h3yDNvutMp299h55Zc"
            r0 = 0
            r2[r0] = r1
            if (r3 == 0) goto L3b
            int r0 = r4 + 1
            r8.set(r4, r5)
            r4 = r0
        L3b:
            int r6 = r6 + 1
            goto L4
        L3e:
            int r0 = r8.size()
            int r0 = r0 + (-1)
        L44:
            if (r0 < r4) goto L4c
            r8.remove(r0)
            int r0 = r0 + (-1)
            goto L44
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C8U.A01(java.util.List):void");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8U != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.8V, E extends com.facebook.ads.redexgen.X.8T> */
    public final synchronized void A03(T... subscribers) {
        if (subscribers == null) {
            return;
        }
        for (T t : subscribers) {
            A05(t);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8U != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.8V, E extends com.facebook.ads.redexgen.X.8T> */
    public final synchronized void A04(T... subscribers) {
        if (subscribers == null) {
            return;
        }
        for (T t : subscribers) {
            A06(t);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8U != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.8V, E extends com.facebook.ads.redexgen.X.8T> */
    public final synchronized boolean A06(@Nullable T subscriber) {
        if (subscriber == null) {
            return false;
        }
        List<WeakReference<T>> list = this.A00.get(subscriber.A01());
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).get() == subscriber) {
                list.get(i).clear();
                return true;
            }
        }
        return false;
    }
}
