package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.j;

/* loaded from: classes.dex */
public class m implements j.b {
    public final /* synthetic */ IAConfigManager a;

    public m(IAConfigManager iAConfigManager) {
        this.a = iAConfigManager;
    }

    @Override // com.fyber.inneractive.sdk.config.j.b
    public void onGlobalConfigChanged(j jVar, i iVar) {
        int a = iVar.a("dv_enabled_v2", 0, 0);
        boolean z = true;
        if (a == 1) {
            this.a.F.a();
        }
        this.a.G.a();
        com.fyber.inneractive.sdk.network.c cVar = this.a.H;
        cVar.getClass();
        int a2 = IAConfigManager.M.u.b.a("send_events_batch_interval", 30, -1);
        int i = a2 >= 0 ? a2 : 30;
        String property = System.getProperty("fyber.marketplace.use_batch_interval");
        if (property != null && !Boolean.getBoolean(property)) {
            z = false;
        }
        cVar.a(z ? i : 0);
    }
}
