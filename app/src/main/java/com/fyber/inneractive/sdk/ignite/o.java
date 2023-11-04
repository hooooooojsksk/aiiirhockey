package com.fyber.inneractive.sdk.ignite;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.flow.n;
import com.fyber.inneractive.sdk.ignite.c;
import com.fyber.inneractive.sdk.ignite.g;
import com.fyber.inneractive.sdk.network.g0;
import com.fyber.inneractive.sdk.network.n0;
import com.fyber.inneractive.sdk.network.p;
import com.fyber.inneractive.sdk.network.v;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class o extends IIgniteServiceCallback.Stub {
    public final n a;
    public final g.a b;

    public o(n nVar, g.a aVar) {
        this.a = nVar;
        this.b = aVar;
    }

    public final String a(String str) {
        try {
            return new JSONObject(str).optString("taskId");
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:3|4|5|(6:7|8|9|(1:11)|13|14)|18|8|9|(0)|13|14) */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0034 A[Catch: Exception -> 0x003a, TRY_LEAVE, TryCatch #0 {Exception -> 0x003a, blocks: (B:32:0x0029, B:34:0x0034), top: B:39:0x0029 }] */
    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onError(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "data"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r6
            java.lang.String r2 = "InstallCallback onError %s"
            com.fyber.inneractive.sdk.util.IAlog.a(r2, r1)
            com.fyber.inneractive.sdk.ignite.n r1 = r5.a
            if (r1 == 0) goto L3f
            java.lang.String r1 = r5.a(r6)
            r2 = 0
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L28
            r3.<init>(r6)     // Catch: java.lang.Exception -> L28
            org.json.JSONObject r3 = r3.optJSONObject(r0)     // Catch: java.lang.Exception -> L28
            if (r3 == 0) goto L28
            java.lang.String r4 = "message"
            java.lang.String r3 = r3.optString(r4)     // Catch: java.lang.Exception -> L28
            goto L29
        L28:
            r3 = r2
        L29:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> L3a
            r4.<init>(r6)     // Catch: java.lang.Exception -> L3a
            org.json.JSONObject r6 = r4.optJSONObject(r0)     // Catch: java.lang.Exception -> L3a
            if (r6 == 0) goto L3a
            java.lang.String r0 = "code"
            java.lang.String r2 = r6.optString(r0)     // Catch: java.lang.Exception -> L3a
        L3a:
            com.fyber.inneractive.sdk.ignite.n r6 = r5.a
            r6.b(r1, r3, r2)
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.ignite.o.onError(java.lang.String):void");
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public void onProgress(String str) {
        JSONObject optJSONObject;
        IAlog.a("InstallCallback onProgress %s", str);
        try {
            String a = a(str);
            JSONObject optJSONObject2 = new JSONObject(str).optJSONObject("data");
            if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject(NotificationCompat.CATEGORY_PROGRESS)) == null) {
                return;
            }
            int optInt = optJSONObject.optInt("action");
            double optDouble = optJSONObject.optDouble("value");
            n nVar = this.a;
            if (nVar != null) {
                nVar.a(a, optInt, optDouble);
            }
        } catch (Exception unused) {
            IAlog.a("Failed to resolve progress data", new Object[0]);
        }
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public void onScheduled(String str) {
        String str2;
        IAlog.a("InstallCallback onScheduled %s", str);
        try {
            String a = a(str);
            try {
                str2 = new JSONObject(str).getJSONObject("application").optString("packageName");
            } catch (Exception unused) {
                str2 = null;
            }
            n nVar = this.a;
            if (nVar != null) {
                nVar.a(a, str2);
            }
        } catch (Exception unused2) {
            IAlog.a("Failed to resolve taskId", new Object[0]);
        }
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public void onStart(String str) {
        IAlog.a("InstallCallback onStart %s", str);
        if (this.a != null) {
            this.a.a(a(str));
        }
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public void onSuccess(String str) {
        IAlog.a("InstallCallback onSuccess %s", str);
        if (this.a != null) {
            this.a.c(a(str));
            g.a aVar = this.b;
            if (aVar != null) {
                c.b bVar = (c.b) aVar;
                c cVar = c.this;
                String str2 = bVar.a.a;
                cVar.getClass();
                if (!TextUtils.isEmpty(str2)) {
                    g0 g0Var = new g0(new f(cVar, str2), str2, v.a().c());
                    IAConfigManager.M.s.a.offer(g0Var);
                    g0Var.a(n0.QUEUED);
                }
                c.d dVar = bVar.a;
                com.fyber.inneractive.sdk.flow.n<?> nVar = dVar.b;
                k kVar = dVar.c;
                j jVar = nVar.h;
                p pVar = p.IGNITE_FLOW_INSTALL_DONE;
                if (kVar == null) {
                    kVar = k.SINGLE_TAP;
                }
                ((n.a) jVar).a(pVar, kVar);
            }
        }
    }
}
