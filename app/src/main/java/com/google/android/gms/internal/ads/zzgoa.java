package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgoa extends ThreadLocal {
    final /* synthetic */ zzgob zza;

    public zzgoa(zzgob zzgobVar) {
        this.zza = zzgobVar;
    }

    @Override // java.lang.ThreadLocal
    /* renamed from: zza */
    public final Mac initialValue() {
        String str;
        Key key;
        try {
            zzgnn zzgnnVar = zzgnn.zzb;
            str = this.zza.zzb;
            Mac mac = (Mac) zzgnnVar.zza(str);
            key = this.zza.zzc;
            mac.init(key);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
