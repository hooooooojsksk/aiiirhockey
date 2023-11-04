package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzalz extends zzgwj implements Closeable {
    private static final zzgwq zza = zzgwq.zzb(zzalz.class);

    public zzalz(zzgwk zzgwkVar, zzaly zzalyVar) throws IOException {
        zzf(zzgwkVar, zzgwkVar.zzc(), zzalyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final String toString() {
        String obj = this.zzd.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
