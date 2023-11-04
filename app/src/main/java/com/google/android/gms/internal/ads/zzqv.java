package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public class zzqv extends zzgp {
    public final zzqx zza;
    public final String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzqv(Throwable th, zzqx zzqxVar) {
        super("Decoder failed: ".concat(String.valueOf(zzqxVar == null ? null : zzqxVar.zza)), th);
        String str = null;
        this.zza = zzqxVar;
        if (zzew.zza >= 21 && (th instanceof MediaCodec.CodecException)) {
            str = ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.zzb = str;
    }
}
