package com.fyber.inneractive.sdk.config;

import android.content.Context;
import com.fyber.inneractive.sdk.network.n0;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class j {
    public final Context a;
    public i b = new i();
    public List<b> c = new CopyOnWriteArrayList();
    public boolean d = false;
    public final com.fyber.inneractive.sdk.cache.c e = new com.fyber.inneractive.sdk.cache.c();

    /* loaded from: classes.dex */
    public class a implements com.fyber.inneractive.sdk.network.u<i> {
        public a() {
            j.this = r1;
        }

        @Override // com.fyber.inneractive.sdk.network.u
        public void a(i iVar, Exception exc, boolean z) {
            i iVar2 = iVar;
            if (iVar2 != null) {
                j jVar = j.this;
                jVar.getClass();
                if (iVar2.equals(jVar.b)) {
                    return;
                }
                jVar.d = true;
                jVar.b = iVar2;
                for (b bVar : jVar.c) {
                    bVar.onGlobalConfigChanged(jVar, jVar.b);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void onGlobalConfigChanged(j jVar, i iVar);
    }

    public j(Context context) {
        this.a = context;
    }

    public i a() {
        return this.b;
    }

    public void b() {
        com.fyber.inneractive.sdk.network.e0 e0Var = new com.fyber.inneractive.sdk.network.e0(new a(), this.a, this.e);
        IAConfigManager.M.s.a.offer(e0Var);
        e0Var.a(n0.QUEUED);
    }
}
