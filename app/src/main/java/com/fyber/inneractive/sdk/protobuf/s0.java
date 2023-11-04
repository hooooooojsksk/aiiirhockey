package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import com.fyber.inneractive.sdk.protobuf.a0;
import com.fyber.inneractive.sdk.protobuf.r1;
import com.fyber.inneractive.sdk.protobuf.u;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class s0<T> implements d1<T> {
    public final o0 a;
    public final k1<?, ?> b;
    public final boolean c;
    public final r<?> d;

    public s0(k1<?, ?> k1Var, r<?> rVar, o0 o0Var) {
        this.b = k1Var;
        this.c = rVar.a(o0Var);
        this.d = rVar;
        this.a = o0Var;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d1
    public T a() {
        return (T) ((GeneratedMessageLite.b) this.a.newBuilderForType()).b();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d1
    public boolean b(T t, T t2) {
        if (this.b.b(t).equals(this.b.b(t2))) {
            if (this.c) {
                return this.d.a(t).equals(this.d.a(t2));
            }
            return true;
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d1
    public void c(T t) {
        this.b.e(t);
        this.d.c(t);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d1
    public int d(T t) {
        int hashCode = this.b.b(t).hashCode();
        return this.c ? (hashCode * 53) + this.d.a(t).a.hashCode() : hashCode;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d1
    public void a(T t, T t2) {
        k1<?, ?> k1Var = this.b;
        Class<?> cls = f1.a;
        k1Var.c(t, k1Var.a(k1Var.b(t), k1Var.b(t2)));
        if (this.c) {
            r<?> rVar = this.d;
            u<?> a = rVar.a(t2);
            if (a.a.isEmpty()) {
                return;
            }
            rVar.b(t).a(a);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d1
    public int b(T t) {
        k1<?, ?> k1Var = this.b;
        int d = k1Var.d(k1Var.b(t)) + 0;
        return this.c ? d + this.d.a(t).c() : d;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d1
    public void a(T t, s1 s1Var) throws IOException {
        Iterator<Map.Entry<?, Object>> f = this.d.a(t).f();
        while (f.hasNext()) {
            Map.Entry<?, Object> next = f.next();
            u.b bVar = (u.b) next.getKey();
            if (bVar.d() == r1.c.MESSAGE && !bVar.b() && !bVar.isPacked()) {
                if (next instanceof a0.a) {
                    ((m) s1Var).a(bVar.a(), ((a0.a) next).a.getValue().a());
                } else {
                    ((m) s1Var).a(bVar.a(), next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        k1<?, ?> k1Var = this.b;
        k1Var.a((k1<?, ?>) k1Var.b(t), s1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00b9 A[EDGE_INSN: B:125:0x00b9->B:101:0x00b9 ?: BREAK  , SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.protobuf.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(T r11, byte[] r12, int r13, int r14, com.fyber.inneractive.sdk.protobuf.e.b r15) throws java.io.IOException {
        /*
            r10 = this;
            r0 = r11
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite r0 = (com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite) r0
            com.fyber.inneractive.sdk.protobuf.l1 r1 = r0.unknownFields
            com.fyber.inneractive.sdk.protobuf.l1 r2 = com.fyber.inneractive.sdk.protobuf.l1.f
            if (r1 != r2) goto Lf
            com.fyber.inneractive.sdk.protobuf.l1 r1 = com.fyber.inneractive.sdk.protobuf.l1.c()
            r0.unknownFields = r1
        Lf:
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage r11 = (com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.ExtendableMessage) r11
            com.fyber.inneractive.sdk.protobuf.u r11 = r11.ensureExtensionsAreMutable()
            r0 = 0
            r2 = r0
        L17:
            if (r13 >= r14) goto Lc5
            int r4 = com.fyber.inneractive.sdk.protobuf.e.d(r12, r13, r15)
            int r13 = r15.a
            int r3 = com.fyber.inneractive.sdk.protobuf.r1.a
            r5 = 2
            if (r13 == r3) goto L61
            r3 = r13 & 7
            if (r3 != r5) goto L5c
            com.fyber.inneractive.sdk.protobuf.r<?> r2 = r10.d
            com.fyber.inneractive.sdk.protobuf.q r3 = r15.d
            com.fyber.inneractive.sdk.protobuf.o0 r5 = r10.a
            int r6 = r13 >>> 3
            java.lang.Object r2 = r2.a(r3, r5, r6)
            r8 = r2
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$e r8 = (com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.e) r8
            if (r8 == 0) goto L51
            com.fyber.inneractive.sdk.protobuf.z0 r13 = com.fyber.inneractive.sdk.protobuf.z0.c
            com.fyber.inneractive.sdk.protobuf.o0 r2 = r8.c
            java.lang.Class r2 = r2.getClass()
            com.fyber.inneractive.sdk.protobuf.d1 r13 = r13.a(r2)
            int r13 = com.fyber.inneractive.sdk.protobuf.e.a(r13, r12, r4, r14, r15)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$d r2 = r8.d
            java.lang.Object r3 = r15.c
            r11.c(r2, r3)
            goto L5a
        L51:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = com.fyber.inneractive.sdk.protobuf.e.a(r2, r3, r4, r5, r6, r7)
        L5a:
            r2 = r8
            goto L17
        L5c:
            int r13 = com.fyber.inneractive.sdk.protobuf.e.a(r13, r12, r4, r14, r15)
            goto L17
        L61:
            r13 = 0
            r3 = r0
        L63:
            if (r4 >= r14) goto Lb9
            int r4 = com.fyber.inneractive.sdk.protobuf.e.d(r12, r4, r15)
            int r6 = r15.a
            int r7 = r6 >>> 3
            r8 = r6 & 7
            if (r7 == r5) goto L9a
            r9 = 3
            if (r7 == r9) goto L75
            goto Laf
        L75:
            if (r2 == 0) goto L8f
            com.fyber.inneractive.sdk.protobuf.z0 r6 = com.fyber.inneractive.sdk.protobuf.z0.c
            com.fyber.inneractive.sdk.protobuf.o0 r7 = r2.c
            java.lang.Class r7 = r7.getClass()
            com.fyber.inneractive.sdk.protobuf.d1 r6 = r6.a(r7)
            int r4 = com.fyber.inneractive.sdk.protobuf.e.a(r6, r12, r4, r14, r15)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$d r6 = r2.d
            java.lang.Object r7 = r15.c
            r11.c(r6, r7)
            goto L63
        L8f:
            if (r8 != r5) goto Laf
            int r4 = com.fyber.inneractive.sdk.protobuf.e.a(r12, r4, r15)
            java.lang.Object r3 = r15.c
            com.fyber.inneractive.sdk.protobuf.i r3 = (com.fyber.inneractive.sdk.protobuf.i) r3
            goto L63
        L9a:
            if (r8 != 0) goto Laf
            int r4 = com.fyber.inneractive.sdk.protobuf.e.d(r12, r4, r15)
            int r13 = r15.a
            com.fyber.inneractive.sdk.protobuf.r<?> r2 = r10.d
            com.fyber.inneractive.sdk.protobuf.q r6 = r15.d
            com.fyber.inneractive.sdk.protobuf.o0 r7 = r10.a
            java.lang.Object r2 = r2.a(r6, r7, r13)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$e r2 = (com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.e) r2
            goto L63
        Laf:
            int r7 = com.fyber.inneractive.sdk.protobuf.r1.b
            if (r6 != r7) goto Lb4
            goto Lb9
        Lb4:
            int r4 = com.fyber.inneractive.sdk.protobuf.e.a(r6, r12, r4, r14, r15)
            goto L63
        Lb9:
            if (r3 == 0) goto Lc2
            int r13 = com.fyber.inneractive.sdk.protobuf.r1.a(r13, r5)
            r1.a(r13, r3)
        Lc2:
            r13 = r4
            goto L17
        Lc5:
            if (r13 != r14) goto Lc8
            return
        Lc8:
            com.fyber.inneractive.sdk.protobuf.z r11 = com.fyber.inneractive.sdk.protobuf.z.g()
            goto Lce
        Lcd:
            throw r11
        Lce:
            goto Lcd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.s0.a(java.lang.Object, byte[], int, int, com.fyber.inneractive.sdk.protobuf.e$b):void");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d1
    public void a(T t, c1 c1Var, q qVar) throws IOException {
        k1 k1Var = this.b;
        r rVar = this.d;
        Object a = k1Var.a(t);
        u<ET> b = rVar.b(t);
        do {
            try {
                if (c1Var.s() == Integer.MAX_VALUE) {
                    break;
                }
            } finally {
                k1Var.b((Object) t, (T) a);
            }
        } while (a(c1Var, qVar, rVar, b, k1Var, a));
    }

    public final <UT, UB, ET extends u.b<ET>> boolean a(c1 c1Var, q qVar, r<ET> rVar, u<ET> uVar, k1<UT, UB> k1Var, UB ub) throws IOException {
        int e = c1Var.e();
        if (e != r1.a) {
            if ((e & 7) == 2) {
                Object a = rVar.a(qVar, this.a, e >>> 3);
                if (a != null) {
                    rVar.a(c1Var, a, qVar, uVar);
                    return true;
                }
                return k1Var.a((k1<UT, UB>) ub, c1Var);
            }
            return c1Var.i();
        }
        int i = 0;
        Object obj = null;
        i iVar = null;
        while (c1Var.s() != Integer.MAX_VALUE) {
            int e2 = c1Var.e();
            if (e2 == r1.c) {
                i = c1Var.c();
                obj = rVar.a(qVar, this.a, i);
            } else if (e2 == r1.d) {
                if (obj != null) {
                    rVar.a(c1Var, obj, qVar, uVar);
                } else {
                    iVar = c1Var.a();
                }
            } else if (!c1Var.i()) {
                break;
            }
        }
        if (c1Var.e() == r1.b) {
            if (iVar != null) {
                if (obj != null) {
                    rVar.a(iVar, obj, qVar, uVar);
                } else {
                    k1Var.a((k1<UT, UB>) ub, i, iVar);
                }
            }
            return true;
        }
        throw z.a();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d1
    public final boolean a(T t) {
        return this.d.a(t).e();
    }
}
