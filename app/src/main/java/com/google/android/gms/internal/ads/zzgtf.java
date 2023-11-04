package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgtf extends RuntimeException {
    public zzgtf(zzgrw zzgrwVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzgqy zza() {
        return new zzgqy(getMessage());
    }
}
