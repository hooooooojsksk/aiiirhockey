package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes.dex */
public class q implements com.fyber.inneractive.sdk.network.u<com.fyber.inneractive.sdk.config.global.l> {
    public final /* synthetic */ IAConfigManager a;

    public q(IAConfigManager iAConfigManager) {
        this.a = iAConfigManager;
    }

    @Override // com.fyber.inneractive.sdk.network.u
    public void a(com.fyber.inneractive.sdk.config.global.l lVar, Exception exc, boolean z) {
        com.fyber.inneractive.sdk.config.global.l lVar2 = lVar;
        if (lVar2 != null) {
            IAlog.a("calling mergeRemoteFeaturesConfig fromCache: %b", Boolean.valueOf(z));
            IAConfigManager iAConfigManager = this.a;
            iAConfigManager.z.a = lVar2;
            if (z) {
                return;
            }
            iAConfigManager.L.a("", true);
            IAConfigManager.M.E.a(iAConfigManager.L);
        } else if (exc != null) {
            if (exc instanceof com.fyber.inneractive.sdk.network.f) {
                IAlog.a("remote features config not modified", new Object[0]);
                IAConfigManager iAConfigManager2 = this.a;
                iAConfigManager2.L.a("", true);
                IAConfigManager.M.E.a(iAConfigManager2.L);
                return;
            }
            IAlog.a("Config manager: Error getting or parsing remote config. Resetting configurable features", new Object[0]);
            IAConfigManager iAConfigManager3 = this.a;
            IAConfigManager iAConfigManager4 = IAConfigManager.M;
            iAConfigManager3.getClass();
            new q.a(com.fyber.inneractive.sdk.network.o.FATAL_FEATURES_CONFIG_ERROR).a("exception", exc.getClass().getName(), "message", exc.getLocalizedMessage()).a((String) null);
        }
    }
}
