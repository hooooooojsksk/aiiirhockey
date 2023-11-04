package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzajw;
import com.google.android.gms.internal.ads.zzaks;
import com.google.android.gms.internal.ads.zzakt;
import com.google.android.gms.internal.ads.zzalt;
import com.google.android.gms.internal.ads.zzbyz;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzbi extends zzalt {
    final /* synthetic */ byte[] zza;
    final /* synthetic */ Map zzb;
    final /* synthetic */ zzbyz zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbi(zzbo zzboVar, int i, String str, zzakt zzaktVar, zzaks zzaksVar, byte[] bArr, Map map, zzbyz zzbyzVar) {
        super(i, str, zzaktVar, zzaksVar);
        this.zza = bArr;
        this.zzb = map;
        this.zzc = zzbyzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzako
    public final Map zzl() throws zzajw {
        Map map = this.zzb;
        return map == null ? Collections.emptyMap() : map;
    }

    @Override // com.google.android.gms.internal.ads.zzalt, com.google.android.gms.internal.ads.zzako
    public final /* bridge */ /* synthetic */ void zzo(Object obj) {
        zzo((String) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzako
    public final byte[] zzx() throws zzajw {
        byte[] bArr = this.zza;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    public final void zzz(String str) {
        this.zzc.zzg(str);
        super.zzo(str);
    }
}
