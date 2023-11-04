package com.facebook.ads;

import java.util.EnumSet;

/* loaded from: classes.dex */
public enum CacheFlag {
    NONE,
    ICON,
    IMAGE,
    VIDEO;
    
    public static final EnumSet<CacheFlag> ALL = EnumSet.allOf(CacheFlag.class);
}
