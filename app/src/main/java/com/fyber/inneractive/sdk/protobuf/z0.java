package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public final class z0 {
    public static final z0 c = new z0();
    public final ConcurrentMap<Class<?>, d1<?>> b = new ConcurrentHashMap();
    public final e1 a = new g0();

    public <T> d1<T> a(Class<T> cls) {
        d1 a;
        Class<?> cls2;
        Charset charset = y.a;
        Objects.requireNonNull(cls, "messageType");
        d1<T> d1Var = (d1<T>) this.b.get(cls);
        if (d1Var == null) {
            g0 g0Var = (g0) this.a;
            g0Var.getClass();
            Class<?> cls3 = f1.a;
            if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = f1.a) != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
            m0 b = g0Var.a.b(cls);
            if (b.c()) {
                if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                    k1<?, ?> k1Var = f1.d;
                    r<?> rVar = t.a;
                    a = new s0(k1Var, t.a, b.b());
                } else {
                    k1<?, ?> k1Var2 = f1.b;
                    r<?> rVar2 = t.b;
                    if (rVar2 != null) {
                        a = new s0(k1Var2, rVar2, b.b());
                    } else {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                }
            } else {
                if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                    if (b.a() == y0.PROTO2) {
                        t0 t0Var = v0.b;
                        e0 e0Var = e0.b;
                        k1<?, ?> k1Var3 = f1.d;
                        r<?> rVar3 = t.a;
                        a = r0.a(b, t0Var, e0Var, k1Var3, t.a, l0.b);
                    } else {
                        a = r0.a(b, v0.b, e0.b, f1.d, (r) null, l0.b);
                    }
                } else {
                    if (b.a() == y0.PROTO2) {
                        t0 t0Var2 = v0.a;
                        e0 e0Var2 = e0.a;
                        k1<?, ?> k1Var4 = f1.b;
                        r<?> rVar4 = t.b;
                        if (rVar4 != null) {
                            a = r0.a(b, t0Var2, e0Var2, k1Var4, rVar4, l0.a);
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    } else {
                        a = r0.a(b, v0.a, e0.a, f1.c, (r) null, l0.a);
                    }
                }
            }
            d1<T> d1Var2 = (d1<T>) this.b.putIfAbsent(cls, a);
            return d1Var2 != null ? d1Var2 : a;
        }
        return d1Var;
    }
}
