package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes.dex */
public final class d {
    public static final Class<?> a;
    public static final boolean b;

    public static boolean a() {
        return (a == null || b) ? false : true;
    }

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        b = cls2 != null;
    }
}
