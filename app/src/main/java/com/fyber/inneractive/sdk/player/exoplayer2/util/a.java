package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class a {
    public static void a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static int a(int i, int i2, int i3) {
        if (i < i2 || i >= i3) {
            throw new IndexOutOfBoundsException();
        }
        return i;
    }

    public static <T> T a(T t) {
        t.getClass();
        return t;
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }
}
