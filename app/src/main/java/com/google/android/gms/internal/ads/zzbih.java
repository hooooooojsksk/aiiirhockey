package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import cz.msebera.android.httpclient.cookie.ClientCookie;
import java.util.Map;
import kotlin.jvm.internal.LongCompanionObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbih implements zzbhp {
    private final zzdsf zza;

    public zzbih(zzdsf zzdsfVar) {
        Preconditions.checkNotNull(zzdsfVar, "The Inspector Manager must not be null");
        this.zza = zzdsfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final void zza(Object obj, Map map) {
        if (map == null || !map.containsKey("extras")) {
            return;
        }
        boolean containsKey = map.containsKey(ClientCookie.EXPIRES_ATTR);
        long j = LongCompanionObject.MAX_VALUE;
        if (containsKey) {
            try {
                j = Long.parseLong((String) map.get(ClientCookie.EXPIRES_ATTR));
            } catch (NumberFormatException unused) {
            }
        }
        this.zza.zzi((String) map.get("extras"), j);
    }
}
