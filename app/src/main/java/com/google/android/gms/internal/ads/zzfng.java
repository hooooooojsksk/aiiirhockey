package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public abstract class zzfng implements zzfnv {
    public static zzfng zzc(char c) {
        return new zzfnd(c);
    }

    @Override // com.google.android.gms.internal.ads.zzfnv
    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return zzb(((Character) obj).charValue());
    }

    public abstract boolean zzb(char c);
}
