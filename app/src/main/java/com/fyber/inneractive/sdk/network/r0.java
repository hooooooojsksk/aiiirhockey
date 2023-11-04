package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.gms.common.internal.ImagesContract;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class r0 {
    public final WeakReference<Thread> a;
    public final WeakReference<a0> b;
    public final int c;
    public final Runnable d = new a();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            r0.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            r0 r0Var = r0.this;
            a0 a0Var = (a0) com.fyber.inneractive.sdk.util.q.a(r0Var.b);
            Thread thread = (Thread) com.fyber.inneractive.sdk.util.q.a(r0.this.a);
            r0Var.getClass();
            if ((a0Var == null || a0Var.m() == n0.DONE || a0Var.m() == n0.RESOLVED) ? false : true) {
                if (thread != null) {
                    StackTraceElement[] stackTrace = thread.getStackTrace();
                    Exception exc = new Exception();
                    exc.setStackTrace(stackTrace);
                    str = com.fyber.inneractive.sdk.util.q.a(exc);
                } else {
                    str = "";
                }
                String a = a0Var != null ? a0Var.a() : "";
                q.a aVar = new q.a(p.NETWORK_REQUEST_PASSED_ALLOWED_TIME, a0Var instanceof b0 ? ((b0) a0Var).i : null, a0Var instanceof k0 ? ((k0) a0Var).m : null, (JSONArray) null);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(ImagesContract.URL, a);
                } catch (Exception unused) {
                    IAlog.e("Got exception adding param to json object: %s, %s", ImagesContract.URL, a);
                }
                try {
                    jSONObject.put("stack_trace", str);
                } catch (Exception unused2) {
                    IAlog.e("Got exception adding param to json object: %s, %s", "stack_trace", str);
                }
                Integer valueOf = Integer.valueOf(r0Var.c);
                try {
                    jSONObject.put("total_time", valueOf);
                } catch (Exception unused3) {
                    IAlog.e("Got exception adding param to json object: %s, %s", "total_time", valueOf);
                }
                aVar.f.put(jSONObject);
                aVar.a((String) null);
            }
        }
    }

    public r0(a0 a0Var, Thread thread, int i) {
        this.b = new WeakReference<>(a0Var);
        this.a = new WeakReference<>(thread);
        this.c = i;
    }
}
