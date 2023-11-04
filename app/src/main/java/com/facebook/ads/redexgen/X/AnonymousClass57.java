package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import java.lang.reflect.Proxy;

/* renamed from: com.facebook.ads.redexgen.X.57 */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass57 {
    @SuppressLint({"CatchGeneralException"})
    public static <T> T A00(T impl, Class<T> clazz) {
        ClassLoader classLoader = impl.getClass().getClassLoader();
        return clazz.cast(Proxy.newProxyInstance(classLoader, new Class[]{clazz}, new AnonymousClass56(impl, classLoader)));
    }
}
