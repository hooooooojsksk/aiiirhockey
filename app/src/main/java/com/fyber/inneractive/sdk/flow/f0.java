package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.IAConfigManager;

/* loaded from: classes.dex */
public abstract class f0 {
    public boolean a = true;
    public String b;

    public boolean getAllowFullscreen() {
        return this.a;
    }

    public String getMediationName() {
        return IAConfigManager.M.m;
    }

    public String getMediationVersion() {
        return IAConfigManager.M.o;
    }
}
