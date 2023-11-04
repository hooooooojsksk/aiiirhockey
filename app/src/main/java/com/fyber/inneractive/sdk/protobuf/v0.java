package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes.dex */
public final class v0 {
    public static final t0 a;
    public static final t0 b;

    static {
        t0 t0Var;
        try {
            t0Var = (t0) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            t0Var = null;
        }
        a = t0Var;
        b = new u0();
    }
}
