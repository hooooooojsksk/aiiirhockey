package com.fyber.inneractive.sdk.util;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.Reference;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class q {
    public static StringBuffer a(InputStream inputStream, boolean z) throws IOException {
        ByteBuffer b = d.b.b();
        StringBuffer stringBuffer = new StringBuffer();
        byte[] a = d.b.a(b);
        int i = 0;
        while (i != -1) {
            stringBuffer.append(new String(a, 0, i));
            i = inputStream.read(a);
        }
        if (z) {
            try {
                inputStream.close();
            } catch (Throwable unused) {
            }
        }
        d.b.a.offer(b);
        return stringBuffer;
    }

    public static void b(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static String b(Throwable th) {
        try {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            return "------\r\n" + stringWriter.toString() + "------\r\n";
        } catch (Exception unused) {
            return "bad stackToString";
        }
    }

    public static String a(InputStream inputStream) throws IOException {
        ByteBuffer b = d.b.b();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] a = d.b.a(b);
        while (true) {
            int read = inputStream.read(a, 0, a.length);
            if (read != -1) {
                byteArrayOutputStream.write(a, 0, read);
            } else {
                byteArrayOutputStream.flush();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                d.b.a.offer(b);
                return new String(byteArray, "UTF-8");
            }
        }
    }

    public static boolean a(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (inputStream != null) {
            byte[] bArr = new byte[65536];
            int i = 0;
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                i += read;
                outputStream.write(bArr, 0, read);
            }
            IAlog.a("Copied stream content length = %d", Integer.valueOf(i));
            return i > 0;
        }
        throw new IOException("Unable to copy from or to a null stream.");
    }

    public static void a(View view) {
        if (view != null && view.getParent() != null) {
            try {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return;
                }
                ((ViewGroup) view.getParent()).removeView(view);
            } catch (Exception unused) {
            }
        }
    }

    public static RelativeLayout.LayoutParams a(int i, int i2, int... iArr) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i2);
        if (iArr != null && iArr.length > 0) {
            for (int i3 : iArr) {
                layoutParams.addRule(i3);
            }
        }
        return layoutParams;
    }

    public static String a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.getBuffer().toString();
    }

    public static <T> T a(Reference<T> reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    public static int a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }
}
