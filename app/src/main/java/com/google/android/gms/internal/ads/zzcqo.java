package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzcqo implements zzcqp {
    private final Map zza;

    public zzcqo(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcqp
    public final zzeat zza(int i, String str) {
        return (zzeat) this.zza.get(str);
    }
}
