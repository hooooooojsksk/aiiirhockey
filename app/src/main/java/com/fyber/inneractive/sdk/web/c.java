package com.fyber.inneractive.sdk.web;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.measurement.a;
import com.fyber.inneractive.sdk.web.d;
import com.fyber.inneractive.sdk.web.d0;
import com.fyber.inneractive.sdk.web.i;

/* loaded from: classes.dex */
public class c<T extends d0> extends c0<T> {
    public final b Q;

    public c(Context context, b bVar, boolean z, boolean z2) {
        super(context, z, z2, i.g.INTERSTITIAL);
        this.Q = bVar;
    }

    @Override // com.fyber.inneractive.sdk.web.g.a
    public void a() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0065, code lost:
        if (r6.equals(com.google.firebase.analytics.FirebaseAnalytics.Param.SUCCESS) == false) goto L15;
     */
    @Override // com.fyber.inneractive.sdk.web.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(java.lang.String r10, com.fyber.inneractive.sdk.util.k0 r11) {
        /*
            r9 = this;
            r0 = 0
            if (r10 == 0) goto Lb4
            java.lang.String r1 = r10.toLowerCase()
            java.lang.String r2 = "fmpendcard://"
            java.lang.String r2 = r2.toLowerCase()
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto Lb4
            com.fyber.inneractive.sdk.web.b r1 = r9.Q
            r2 = 1
            if (r1 == 0) goto Lb3
            com.fyber.inneractive.sdk.web.d$e r3 = r9.f
            L extends com.fyber.inneractive.sdk.web.d0 r4 = r9.g
            r1.getClass()
            android.net.Uri r10 = android.net.Uri.parse(r10)
            r5 = 0
            if (r10 == 0) goto L2b
            java.lang.String r6 = r10.getAuthority()
            goto L2c
        L2b:
            r6 = r5
        L2c:
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 == 0) goto L39
            java.lang.String r10 = "empty type"
            r1.a(r3, r9, r10)
            goto Lb3
        L39:
            r6.getClass()
            r6.hashCode()
            r7 = -1
            int r8 = r6.hashCode()
            switch(r8) {
                case -1867169789: goto L5f;
                case -1086574198: goto L54;
                case 94750088: goto L49;
                default: goto L47;
            }
        L47:
            r0 = -1
            goto L68
        L49:
            java.lang.String r0 = "click"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L52
            goto L47
        L52:
            r0 = 2
            goto L68
        L54:
            java.lang.String r0 = "failure"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L5d
            goto L47
        L5d:
            r0 = 1
            goto L68
        L5f:
            java.lang.String r8 = "success"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L68
            goto L47
        L68:
            java.lang.String r6 = "version"
            switch(r0) {
                case 0: goto La4;
                case 1: goto L8e;
                case 2: goto L6e;
                default: goto L6d;
            }
        L6d:
            goto Lb3
        L6e:
            if (r4 == 0) goto Lb3
            com.fyber.inneractive.sdk.flow.vast.e r10 = r1.c
            if (r10 == 0) goto Lb3
            com.fyber.inneractive.sdk.web.b$a r0 = new com.fyber.inneractive.sdk.web.b$a
            java.lang.String r3 = r1.b
            int r10 = r10.d
            r0.<init>(r3, r10)
            com.fyber.inneractive.sdk.model.vast.b r10 = r1.a
            com.fyber.inneractive.sdk.model.vast.c r1 = r10.h
            if (r1 == 0) goto L85
            java.lang.String r5 = r1.g
        L85:
            if (r5 == 0) goto L88
            goto L8a
        L88:
            java.lang.String r5 = r10.b
        L8a:
            r4.a(r5, r11, r0)
            goto Lb3
        L8e:
            java.lang.String r11 = r10.getQueryParameter(r6)
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L9a
            r1.b = r11
        L9a:
            java.lang.String r11 = "error"
            java.lang.String r10 = r10.getQueryParameter(r11)
            r1.a(r3, r9, r10)
            goto Lb3
        La4:
            java.lang.String r10 = r10.getQueryParameter(r6)
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto Lb0
            r1.b = r10
        Lb0:
            r9.g()
        Lb3:
            return r2
        Lb4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.web.c.a(java.lang.String, com.fyber.inneractive.sdk.util.k0):boolean");
    }

    @Override // com.fyber.inneractive.sdk.web.g.a
    public void b() {
    }

    @Override // com.fyber.inneractive.sdk.web.d
    public a.InterfaceC0020a d() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0098  */
    @Override // com.fyber.inneractive.sdk.web.d, com.fyber.inneractive.sdk.web.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.webkit.WebView r8) {
        /*
            r7 = this;
            if (r8 == 0) goto La5
            com.fyber.inneractive.sdk.web.b r0 = r7.Q
            if (r0 == 0) goto La5
            r0 = 0
            r8.setLongClickable(r0)
            com.fyber.inneractive.sdk.util.a0 r1 = new com.fyber.inneractive.sdk.util.a0
            r1.<init>()
            r8.setOnLongClickListener(r1)
            com.fyber.inneractive.sdk.web.b r1 = r7.Q
            com.fyber.inneractive.sdk.model.vast.b r2 = r1.a
            com.fyber.inneractive.sdk.model.vast.k r2 = r2.f
            if (r2 == 0) goto L7d
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L7d
            r3.<init>()     // Catch: java.lang.Exception -> L7d
            java.lang.String r4 = "name"
            java.lang.String r5 = r2.a     // Catch: java.lang.Exception -> L7d
            com.fyber.inneractive.sdk.util.h0.a(r3, r4, r5)     // Catch: java.lang.Exception -> L7d
            java.lang.String r4 = "description"
            java.lang.String r5 = r2.b     // Catch: java.lang.Exception -> L7d
            com.fyber.inneractive.sdk.util.h0.a(r3, r4, r5)     // Catch: java.lang.Exception -> L7d
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Exception -> L7d
            r4.<init>()     // Catch: java.lang.Exception -> L7d
            java.util.List<java.lang.String> r5 = r2.c     // Catch: java.lang.Exception -> L7d
            if (r5 == 0) goto L4a
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Exception -> L7d
        L3a:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Exception -> L7d
            if (r6 == 0) goto L4a
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Exception -> L7d
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L7d
            r4.put(r6)     // Catch: java.lang.Exception -> L7d
            goto L3a
        L4a:
            java.lang.String r5 = "icons"
            com.fyber.inneractive.sdk.util.h0.a(r3, r5, r4)     // Catch: java.lang.Exception -> L7d
            java.lang.String r4 = "rating"
            float r5 = r2.d     // Catch: java.lang.Exception -> L7d
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch: java.lang.Exception -> L7d
            com.fyber.inneractive.sdk.util.h0.a(r3, r4, r5)     // Catch: java.lang.Exception -> L7d
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Exception -> L7d
            r4.<init>()     // Catch: java.lang.Exception -> L7d
            java.util.List<java.lang.String> r2 = r2.e     // Catch: java.lang.Exception -> L7d
            if (r2 == 0) goto L77
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> L7d
        L67:
            boolean r5 = r2.hasNext()     // Catch: java.lang.Exception -> L7d
            if (r5 == 0) goto L77
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Exception -> L7d
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L7d
            r4.put(r5)     // Catch: java.lang.Exception -> L7d
            goto L67
        L77:
            java.lang.String r2 = "screenshots"
            com.fyber.inneractive.sdk.util.h0.a(r3, r2, r4)     // Catch: java.lang.Exception -> L7d
            goto L7e
        L7d:
            r3 = 0
        L7e:
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 19
            r5 = 1
            if (r2 < r4) goto L98
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r0] = r3
            java.lang.String r0 = "loadAssets(%s);"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            com.fyber.inneractive.sdk.web.a r2 = new com.fyber.inneractive.sdk.web.a
            r2.<init>(r1)
            r8.evaluateJavascript(r0, r2)
            goto La5
        L98:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r0] = r3
            java.lang.String r0 = "javascript:loadAssets('%s');"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r8.loadUrl(r0)
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.web.c.a(android.webkit.WebView):void");
    }

    @Override // com.fyber.inneractive.sdk.web.d, com.fyber.inneractive.sdk.web.f
    public void a(int i) {
        d.e eVar;
        if (this.Q == null || (eVar = this.f) == null) {
            return;
        }
        eVar.a(this, new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.f.WEBVIEW_FMP_ENDCARD_ERROR));
    }
}
