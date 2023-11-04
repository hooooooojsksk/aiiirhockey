package com.fyber.inneractive.sdk.ignite;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.ignite.g;
import com.fyber.inneractive.sdk.network.p0;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c implements ServiceConnection {
    public Context a;
    public IIgniteServiceAPI b;
    public String c;
    public String d;
    public String e;
    public String f;
    public g h;
    public long p;
    public Runnable q;
    public h s;
    public s t;
    public final Bundle g = new Bundle();
    public final List<n> i = new CopyOnWriteArrayList();
    public boolean j = false;
    public boolean k = false;
    public boolean l = false;
    public long m = 0;
    public final Object n = new Object();
    public boolean o = false;
    public boolean r = false;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ ServiceConnection a;

        public a(ServiceConnection serviceConnection) {
            c.this = r1;
            this.a = serviceConnection;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (c.this.n) {
                Intent intent = new Intent();
                intent.setClassName(c.this.c, "com.digitalturbine.ignite.cl.IgniteRemoteService");
                Context context = c.this.a;
                if (context != null) {
                    context.bindService(intent, this.a, 1);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements g.a {
        public final /* synthetic */ d a;

        public b(d dVar) {
            c.this = r1;
            this.a = dVar;
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public final String a;
        public final com.fyber.inneractive.sdk.flow.n<?> b;
        public final k c;

        public d(String str, k kVar, com.fyber.inneractive.sdk.flow.n<?> nVar) {
            this.a = str;
            this.c = kVar;
            this.b = nVar;
        }
    }

    public c() {
        h();
    }

    public void c() {
        h hVar;
        if (g() == null && (hVar = this.s) != null) {
            hVar.a();
            this.s = null;
        } else if (TextUtils.isEmpty(this.c) || e()) {
        } else {
            com.fyber.inneractive.sdk.util.m.a(new a(this));
        }
    }

    public boolean d() {
        return e() && this.l;
    }

    public boolean e() {
        IIgniteServiceAPI iIgniteServiceAPI;
        return this.k && (iIgniteServiceAPI = this.b) != null && iIgniteServiceAPI.asBinder().isBinderAlive();
    }

    public final boolean f() {
        return this.m > 0 && TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) > this.m;
    }

    public final String g() {
        List<ResolveInfo> queryIntentServices;
        Intent intent = new Intent("com.digitalturbine.ignite.cl.IgniteRemoteService");
        Context context = this.a;
        if (context == null || (queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0)) == null || queryIntentServices.size() <= 0) {
            return null;
        }
        return queryIntentServices.get(0).serviceInfo.packageName;
    }

    public final void h() {
        this.h = new g(new C0018c());
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    @Override // android.content.ServiceConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onServiceConnected(android.content.ComponentName r5, android.os.IBinder r6) {
        /*
            r4 = this;
            r5 = 0
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r1 = "onServiceConnected"
            com.fyber.inneractive.sdk.util.IAlog.a(r1, r0)
            com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI r6 = com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI.Stub.asInterface(r6)
            r4.b = r6
            r6 = 1
            r4.k = r6
            boolean r0 = r4.e()
            java.lang.String r1 = "Failed to resolve ignite version"
            r2 = 0
            if (r0 == 0) goto L37
            com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI r0 = r4.b     // Catch: java.lang.Exception -> L32
            java.lang.String r0 = r0.version()     // Catch: java.lang.Exception -> L32
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L32
            r3.<init>(r0)     // Catch: java.lang.Exception -> L32
            java.lang.String r0 = "data"
            org.json.JSONObject r0 = r3.getJSONObject(r0)     // Catch: java.lang.Exception -> L32
            java.lang.String r3 = "igniteVersion"
            java.lang.String r0 = r0.getString(r3)     // Catch: java.lang.Exception -> L32
            goto L38
        L32:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            com.fyber.inneractive.sdk.util.IAlog.e(r1, r0)
        L37:
            r0 = r2
        L38:
            r4.d = r0
            boolean r0 = r4.o
            if (r0 == 0) goto L43
            r4.a()
            goto Lf0
        L43:
            r4.o = r6
            com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest$a r6 = com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest.newBuilder()     // Catch: java.lang.Throwable -> Lc5
            com.fyber.inneractive.sdk.config.IAConfigManager r0 = com.fyber.inneractive.sdk.config.IAConfigManager.M     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r0 = r0.c     // Catch: java.lang.Throwable -> Lc5
            r6.c()     // Catch: java.lang.Throwable -> Lc5
            MessageType extends com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite<MessageType, BuilderType> r3 = r6.b     // Catch: java.lang.Throwable -> Lc5
            com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest r3 = (com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest) r3     // Catch: java.lang.Throwable -> Lc5
            com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest.access$100(r3, r0)     // Catch: java.lang.Throwable -> Lc5
            android.app.Application r0 = com.fyber.inneractive.sdk.util.l.a     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Throwable -> Lc5
            r6.c()     // Catch: java.lang.Throwable -> Lc5
            MessageType extends com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite<MessageType, BuilderType> r3 = r6.b     // Catch: java.lang.Throwable -> Lc5
            com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest r3 = (com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest) r3     // Catch: java.lang.Throwable -> Lc5
            com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest.access$400(r3, r0)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r0 = com.fyber.inneractive.sdk.external.InneractiveAdManager.getVersion()     // Catch: java.lang.Throwable -> Lc5
            r6.c()     // Catch: java.lang.Throwable -> Lc5
            MessageType extends com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite<MessageType, BuilderType> r3 = r6.b     // Catch: java.lang.Throwable -> Lc5
            com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest r3 = (com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest) r3     // Catch: java.lang.Throwable -> Lc5
            com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest.access$1600(r3, r0)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r0 = r4.c     // Catch: java.lang.Throwable -> Lc5
            r6.c()     // Catch: java.lang.Throwable -> Lc5
            MessageType extends com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite<MessageType, BuilderType> r3 = r6.b     // Catch: java.lang.Throwable -> Lc5
            com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest r3 = (com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest) r3     // Catch: java.lang.Throwable -> Lc5
            com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest.access$1000(r3, r0)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r0 = r4.c     // Catch: java.lang.Throwable -> Lc5
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lc5
            if (r0 != 0) goto L9f
            android.content.Context r0 = r4.a     // Catch: java.lang.Throwable -> Lc5
            if (r0 == 0) goto L9f
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Exception -> L9a java.lang.Throwable -> Lc5
            java.lang.String r3 = r4.c     // Catch: java.lang.Exception -> L9a java.lang.Throwable -> Lc5
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r3, r5)     // Catch: java.lang.Exception -> L9a java.lang.Throwable -> Lc5
            java.lang.String r0 = r0.versionName     // Catch: java.lang.Exception -> L9a java.lang.Throwable -> Lc5
            goto La0
        L9a:
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> Lc5
            com.fyber.inneractive.sdk.util.IAlog.a(r1, r0)     // Catch: java.lang.Throwable -> Lc5
        L9f:
            r0 = r2
        La0:
            r6.c()     // Catch: java.lang.Throwable -> Lc5
            MessageType extends com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite<MessageType, BuilderType> r1 = r6.b     // Catch: java.lang.Throwable -> Lc5
            com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest r1 = (com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest) r1     // Catch: java.lang.Throwable -> Lc5
            com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest.access$1300(r1, r0)     // Catch: java.lang.Throwable -> Lc5
            android.content.Context r0 = r4.a     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r0 = com.fyber.inneractive.sdk.util.l.b(r0)     // Catch: java.lang.Throwable -> Lc5
            r6.c()     // Catch: java.lang.Throwable -> Lc5
            MessageType extends com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite<MessageType, BuilderType> r1 = r6.b     // Catch: java.lang.Throwable -> Lc5
            com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest r1 = (com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest) r1     // Catch: java.lang.Throwable -> Lc5
            com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest.access$700(r1, r0)     // Catch: java.lang.Throwable -> Lc5
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite r6 = r6.a()     // Catch: java.lang.Throwable -> Lc5
            com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest r6 = (com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest) r6     // Catch: java.lang.Throwable -> Lc5
            byte[] r2 = r6.toByteArray()     // Catch: java.lang.Throwable -> Lc5
            goto Lcc
        Lc5:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "Failed to build ignite request"
            com.fyber.inneractive.sdk.util.IAlog.a(r6, r5)
        Lcc:
            if (r2 == 0) goto Lf0
            com.fyber.inneractive.sdk.network.h0 r5 = new com.fyber.inneractive.sdk.network.h0
            com.fyber.inneractive.sdk.ignite.d r6 = new com.fyber.inneractive.sdk.ignite.d
            r6.<init>(r4)
            com.fyber.inneractive.sdk.config.global.s r0 = r4.t
            com.fyber.inneractive.sdk.network.v r1 = com.fyber.inneractive.sdk.network.v.a()
            com.fyber.inneractive.sdk.network.g r1 = r1.c()
            r5.<init>(r6, r2, r1, r0)
            com.fyber.inneractive.sdk.config.IAConfigManager r6 = com.fyber.inneractive.sdk.config.IAConfigManager.M
            com.fyber.inneractive.sdk.network.w r6 = r6.s
            java.util.concurrent.BlockingQueue<com.fyber.inneractive.sdk.network.a0<?>> r6 = r6.a
            r6.offer(r5)
            com.fyber.inneractive.sdk.network.n0 r6 = com.fyber.inneractive.sdk.network.n0.QUEUED
            r5.a(r6)
        Lf0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.ignite.c.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        IAlog.a("onServiceDisconnected", new Object[0]);
        this.k = false;
        this.m = 0L;
        h hVar = this.s;
        if (hVar != null) {
            hVar.a();
            this.s = null;
        }
    }

    public void a(s sVar) {
        this.t = sVar;
        if (((com.fyber.inneractive.sdk.config.global.features.j) sVar.a(com.fyber.inneractive.sdk.config.global.features.j.class)).a("enable", false)) {
            String g = g();
            this.c = g;
            if (!TextUtils.isEmpty(g)) {
                c();
            }
            this.p = TimeUnit.SECONDS.toMillis(IAConfigManager.M.w.a.b.a("igniteInstallTimeOutInSeconds", 15, 1));
        }
    }

    public void b() {
        Runnable runnable = this.q;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.m.b.removeCallbacks(runnable);
            this.q = null;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.ignite.c$c */
    /* loaded from: classes.dex */
    public class C0018c implements n {
        public C0018c() {
            c.this = r1;
        }

        @Override // com.fyber.inneractive.sdk.ignite.n
        public void a(String str, String str2) {
            for (n nVar : c.this.i) {
                if (nVar != null) {
                    nVar.a(str, str2);
                }
            }
        }

        @Override // com.fyber.inneractive.sdk.ignite.n
        public void b(String str) {
            c.this.a(i.FAILED_TO_AUTHENTICATE, str);
            c.this.r = false;
            h hVar = c.this.s;
            if (hVar != null) {
                hVar.a();
                c.this.s = null;
            }
        }

        @Override // com.fyber.inneractive.sdk.ignite.n
        public void c(String str) {
            for (n nVar : c.this.i) {
                if (nVar != null) {
                    nVar.c(str);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:49:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
        @Override // com.fyber.inneractive.sdk.ignite.n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void d(java.lang.String r8) {
            /*
                r7 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r8)
                if (r0 != 0) goto L9b
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                java.lang.String r2 = "ignite authenticated successfully"
                com.fyber.inneractive.sdk.util.IAlog.a(r2, r1)
                com.fyber.inneractive.sdk.ignite.c r1 = com.fyber.inneractive.sdk.ignite.c.this
                android.os.Bundle r1 = r1.g
                java.lang.String r2 = "clientToken"
                r1.putString(r2, r8)
                com.fyber.inneractive.sdk.ignite.c r1 = com.fyber.inneractive.sdk.ignite.c.this
                r2 = 1
                com.fyber.inneractive.sdk.ignite.c.a(r1, r2)
                com.fyber.inneractive.sdk.ignite.c r1 = com.fyber.inneractive.sdk.ignite.c.this
                r1.getClass()
                boolean r3 = android.text.TextUtils.isEmpty(r8)
                java.lang.String r4 = ""
                if (r3 != 0) goto L47
                java.lang.String r3 = "\\."
                java.lang.String[] r8 = r8.split(r3)     // Catch: java.lang.Exception -> L40
                java.lang.String r3 = new java.lang.String     // Catch: java.lang.Exception -> L40
                r8 = r8[r2]     // Catch: java.lang.Exception -> L40
                r5 = 8
                byte[] r8 = android.util.Base64.decode(r8, r5)     // Catch: java.lang.Exception -> L40
                java.lang.String r5 = "UTF-8"
                r3.<init>(r8, r5)     // Catch: java.lang.Exception -> L40
                goto L48
            L40:
                java.lang.Object[] r8 = new java.lang.Object[r0]
                java.lang.String r3 = "Failed to decode str"
                com.fyber.inneractive.sdk.util.IAlog.a(r3, r8)
            L47:
                r3 = r4
            L48:
                boolean r8 = r3.isEmpty()
                if (r8 != 0) goto L88
                org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Exception -> L81
                r8.<init>(r3)     // Catch: java.lang.Exception -> L81
                java.lang.String r3 = "exp"
                long r5 = r8.optLong(r3)     // Catch: java.lang.Exception -> L81
                r1.m = r5     // Catch: java.lang.Exception -> L81
                java.lang.String r8 = "Ignite session will exp in: %s"
                java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L81
                java.lang.String r2 = "dd/MM/yyyy HH:mm:ss"
                java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Exception -> L81
                long r5 = r3.toMillis(r5)     // Catch: java.lang.Exception -> L81
                java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat     // Catch: java.lang.Exception -> L7b
                r3.<init>(r2)     // Catch: java.lang.Exception -> L7b
                java.util.Calendar r2 = java.util.Calendar.getInstance()     // Catch: java.lang.Exception -> L7b
                r2.setTimeInMillis(r5)     // Catch: java.lang.Exception -> L7b
                java.util.Date r2 = r2.getTime()     // Catch: java.lang.Exception -> L7b
                java.lang.String r4 = r3.format(r2)     // Catch: java.lang.Exception -> L7b
            L7b:
                r1[r0] = r4     // Catch: java.lang.Exception -> L81
                com.fyber.inneractive.sdk.util.IAlog.a(r8, r1)     // Catch: java.lang.Exception -> L81
                goto L88
            L81:
                java.lang.Object[] r8 = new java.lang.Object[r0]
                java.lang.String r1 = "Failed to resolve expiration time"
                com.fyber.inneractive.sdk.util.IAlog.a(r1, r8)
            L88:
                com.fyber.inneractive.sdk.ignite.c r8 = com.fyber.inneractive.sdk.ignite.c.this
                com.fyber.inneractive.sdk.ignite.c.b(r8, r0)
                com.fyber.inneractive.sdk.ignite.c r8 = com.fyber.inneractive.sdk.ignite.c.this
                com.fyber.inneractive.sdk.ignite.h r8 = r8.s
                if (r8 == 0) goto L9b
                r8.b()
                com.fyber.inneractive.sdk.ignite.c r8 = com.fyber.inneractive.sdk.ignite.c.this
                r0 = 0
                r8.s = r0
            L9b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.ignite.c.C0018c.d(java.lang.String):void");
        }

        @Override // com.fyber.inneractive.sdk.ignite.n
        public void a(String str, int i, double d) {
            for (n nVar : c.this.i) {
                if (nVar != null) {
                    nVar.a(str, i, d);
                }
            }
        }

        @Override // com.fyber.inneractive.sdk.ignite.n
        public void a(String str) {
            for (n nVar : c.this.i) {
                if (nVar != null) {
                    nVar.a(str);
                }
            }
        }

        @Override // com.fyber.inneractive.sdk.ignite.n
        public void b(String str, String str2, String str3) {
            for (n nVar : c.this.i) {
                if (nVar != null) {
                    nVar.b(str, str2, str3);
                }
            }
        }

        @Override // com.fyber.inneractive.sdk.ignite.n
        public void a(String str, String str2, String str3) {
            for (n nVar : c.this.i) {
                if (nVar != null) {
                    nVar.a(str, str2, str3);
                }
            }
        }
    }

    public final boolean a(Exception exc) {
        return ((exc instanceof p0) && ((p0) exc).a == 204) ? false : true;
    }

    public void a(i iVar, String str) {
        if (this.j) {
            return;
        }
        this.j = true;
        q.a aVar = new q.a(com.fyber.inneractive.sdk.network.o.IGNITE_FLOW_FAILED_TO_START, (InneractiveAdRequest) null, (com.fyber.inneractive.sdk.response.e) null, (JSONArray) null);
        JSONObject jSONObject = new JSONObject();
        String e = iVar.e();
        try {
            jSONObject.put("error_code", e);
        } catch (Exception unused) {
            IAlog.e("Got exception adding param to json object: %s, %s", "error_code", e);
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject.put("message", str);
            } catch (Exception unused2) {
                IAlog.e("Got exception adding param to json object: %s, %s", "message", str);
            }
        }
        aVar.f.put(jSONObject);
        aVar.a((String) null);
    }

    public void a() {
        if (!e() || TextUtils.isEmpty(this.e) || TextUtils.isEmpty(this.f) || this.r) {
            return;
        }
        try {
            this.r = true;
            this.g.putInt("sdkFlowTypeKey", 1);
            this.b.authenticate(this.e, this.f, this.g, this.h.b);
        } catch (RemoteException unused) {
            this.r = false;
            IAlog.a("Failed to authenticate ignite", new Object[0]);
        }
    }

    public void a(h hVar) {
        this.s = hVar;
        if (!e()) {
            c();
        } else if (!this.l || f()) {
            a();
        }
    }

    public void a(String str, d dVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        IAlog.a("Starting install timeout with %d", Long.valueOf(this.p));
        e eVar = new e(this);
        this.q = eVar;
        com.fyber.inneractive.sdk.util.m.b.postDelayed(eVar, this.p);
        if (d() && !f()) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("packageName", str);
                jSONObject.put("data", jSONObject2);
                IIgniteServiceAPI iIgniteServiceAPI = this.b;
                String jSONObject3 = jSONObject.toString();
                Bundle bundle = this.g;
                Bundle bundle2 = new Bundle();
                g gVar = this.h;
                b bVar = new b(dVar);
                gVar.getClass();
                iIgniteServiceAPI.install(jSONObject3, bundle, bundle2, new o(gVar.a, bVar));
                return;
            } catch (Exception unused) {
                IAlog.a("Failed to install app", new Object[0]);
                return;
            }
        }
        for (n nVar : this.i) {
            if (nVar != null) {
                nVar.b(null, (f() ? i.SESSION_EXPIRED : i.NOT_CONNECTED).e(), null);
            }
        }
    }

    public void a(n nVar) {
        this.i.add(nVar);
    }
}
