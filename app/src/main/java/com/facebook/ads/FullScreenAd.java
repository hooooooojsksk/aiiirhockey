package com.facebook.ads;

import com.facebook.ads.Ad;

/* loaded from: classes.dex */
public interface FullScreenAd extends Ad {

    /* loaded from: classes.dex */
    public interface ShowAdConfig {
    }

    /* loaded from: classes.dex */
    public interface ShowConfigBuilder {
        ShowAdConfig build();
    }

    Ad.LoadConfigBuilder buildLoadAdConfig();

    ShowConfigBuilder buildShowAdConfig();

    boolean show();
}
