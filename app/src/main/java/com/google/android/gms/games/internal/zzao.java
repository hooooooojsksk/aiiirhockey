package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.DataHolderResult;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.GamesStatusCodes;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public class zzao extends DataHolderResult {
    public zzao(DataHolder dataHolder) {
        super(dataHolder, GamesStatusCodes.zza(dataHolder.getStatusCode()));
    }
}
