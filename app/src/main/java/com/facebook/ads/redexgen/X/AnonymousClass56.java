package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.56 */
/* loaded from: assets/audience_network.dex */
public class AnonymousClass56<T> implements InvocationHandler {
    public static byte[] A02;
    public static String[] A03 = {"HJBbstbFgkhP2Es2YC6tj0WPrL", "4IOUVAMDExjQBHSpAfoXSYCtPyIaCI88", "z5PEOWpVsYBM96D6", "SPmK69spxohqfCa0SsQ", "2TZuMIK", "01EkjjI8QhZqdiHuXsMGI", "efeA7FnPjHODjVcAjRmk7", "pSZyNCg"};
    public ClassLoader A00;
    public T A01;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[2].length() != 16) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[6] = "7LVLxstLm7VGVuwpoPddR";
            strArr[5] = "O4Ajby3FQpCfAUdim7NmB";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 40);
            i4++;
        }
    }

    public static void A03() {
        A02 = new byte[]{-20, -5, -12};
    }

    static {
        A03();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.56 != com.facebook.ads.internal.apiimp.AdApiProxy$ProxyInvocationHandler<T> */
    public AnonymousClass56(T impl, ClassLoader classLoader) {
        this.A01 = impl;
        this.A00 = classLoader;
    }

    @Nullable
    public static Object A00(final ClassLoader classLoader, Method method) {
        Class<?> returnType = method.getReturnType();
        Object result = Void.TYPE;
        if (returnType.equals(result)) {
            return null;
        }
        if (returnType.isPrimitive()) {
            Object result2 = Array.newInstance(method.getReturnType(), 1);
            return Array.get(result2, 0);
        } else if (returnType.equals(String.class)) {
            return A02(0, 0, 23);
        } else {
            if (!returnType.isInterface()) {
                return null;
            }
            return Proxy.newProxyInstance(classLoader, new Class[]{returnType}, new InvocationHandler() { // from class: com.facebook.ads.redexgen.X.55
                @Override // java.lang.reflect.InvocationHandler
                @Nullable
                public final Object invoke(Object obj, Method method2, Object[] objArr) {
                    Object A00;
                    A00 = AnonymousClass56.A00(classLoader, method2);
                    return A00;
                }
            });
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.56 != com.facebook.ads.internal.apiimp.AdApiProxy$ProxyInvocationHandler<T> */
    public final T A04() {
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.56 != com.facebook.ads.internal.apiimp.AdApiProxy$ProxyInvocationHandler<T> */
    @Override // java.lang.reflect.InvocationHandler
    @SuppressLint({"CatchGeneralException"})
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        try {
            return method.invoke(this.A01, objArr);
        } catch (Throwable t) {
            if (t instanceof InvocationTargetException) {
                Throwable targetException = ((InvocationTargetException) t).getTargetException();
                if (targetException instanceof C01231w) {
                    throw new IllegalStateException(targetException.getMessage());
                }
            }
            Object A00 = A00(this.A00, method);
            C0886Xb A002 = C7M.A00();
            if (A002 != null) {
                A002.A07().A9C(A02(0, 3, 99), C02627s.A0O, new C02637t(t));
                return A00;
            }
            return A00;
        }
    }
}
