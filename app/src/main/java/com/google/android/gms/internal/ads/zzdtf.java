package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public class zzdtf extends Exception {
    private final int zza;

    public zzdtf(int i) {
        this.zza = i;
    }

    public final int zza() {
        return this.zza;
    }

    public zzdtf(int i, String str) {
        super(str);
        this.zza = i;
    }

    public zzdtf(int i, String str, Throwable th) {
        super(str, th);
        this.zza = 1;
    }
}
