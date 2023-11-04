package com.facebook.ads;

/* loaded from: classes.dex */
public interface Ad {

    /* loaded from: classes.dex */
    public interface LoadAdConfig {
    }

    /* loaded from: classes.dex */
    public interface LoadConfigBuilder {
        LoadAdConfig build();

        LoadConfigBuilder withBid(String str);
    }

    void destroy();

    String getPlacementId();

    boolean isAdInvalidated();

    void loadAd();

    @Deprecated
    void setExtraHints(ExtraHints extraHints);
}
