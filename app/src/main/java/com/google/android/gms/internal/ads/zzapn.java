package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzapn implements zzfjk {
    final /* synthetic */ zzfhk zza;

    public zzapn(zzapp zzappVar, zzfhk zzfhkVar) {
        this.zza = zzfhkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfjk
    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
