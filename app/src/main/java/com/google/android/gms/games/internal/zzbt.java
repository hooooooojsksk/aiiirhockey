package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.Contents;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzbt extends zzbr {
    public zzbt(BaseImplementation.ResultHolder resultHolder) {
        super(resultHolder);
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzcb
    public final void zzq(DataHolder dataHolder, String str, Contents contents, Contents contents2, Contents contents3) {
        zzw(new zzbl(dataHolder, str, contents, contents2, contents3));
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzcb
    public final void zzs(DataHolder dataHolder, Contents contents) {
        zzw(new zzbl(dataHolder, null, contents, null, null));
    }
}
