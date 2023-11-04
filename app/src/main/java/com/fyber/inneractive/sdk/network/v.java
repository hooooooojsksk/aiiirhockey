package com.fyber.inneractive.sdk.network;

/* loaded from: classes.dex */
public class v {
    public static final v c = new v();
    public final g a = new i();
    public g b;

    public static v a() {
        return c;
    }

    public g b() {
        boolean z;
        if (this.b == null) {
            try {
                Class.forName("okhttp3.OkHttpClient");
                z = true;
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            if (z) {
                this.b = new s0();
            }
        }
        g gVar = this.b;
        return gVar != null ? gVar : this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0018, code lost:
        if (r2 == false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fyber.inneractive.sdk.network.g c() {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            java.lang.String r2 = "fyber.marketplace.http_executor_stack_name"
            java.lang.String r2 = java.lang.System.getProperty(r2)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r3 = "okhttp"
            boolean r2 = android.text.TextUtils.equals(r3, r2)     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1b
            java.lang.String r2 = "okhttp3.OkHttpClient"
            java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L17 java.lang.Throwable -> L1b
            r2 = 1
            goto L18
        L17:
            r2 = 0
        L18:
            if (r2 == 0) goto L1b
            goto L1c
        L1b:
            r0 = 0
        L1c:
            if (r0 == 0) goto L23
            com.fyber.inneractive.sdk.network.g r0 = r4.b()
            return r0
        L23:
            com.fyber.inneractive.sdk.network.g r0 = r4.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.v.c():com.fyber.inneractive.sdk.network.g");
    }
}
