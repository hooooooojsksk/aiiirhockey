package com.google.android.gms.internal.ads;

import com.google.android.gms.games.GamesStatusCodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfoh {
    private final zzfng zza;
    private final zzfog zzb;

    private zzfoh(zzfog zzfogVar) {
        zzfnf zzfnfVar = zzfnf.zza;
        this.zzb = zzfogVar;
        this.zza = zzfnfVar;
    }

    public static zzfoh zzb(int i) {
        return new zzfoh(new zzfod(GamesStatusCodes.STATUS_SNAPSHOT_NOT_FOUND));
    }

    public static zzfoh zzc(zzfng zzfngVar) {
        return new zzfoh(new zzfob(zzfngVar));
    }

    public final Iterator zzg(CharSequence charSequence) {
        return this.zzb.zza(this, charSequence);
    }

    public final Iterable zzd(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        return new zzfoe(this, charSequence);
    }

    public final List zzf(CharSequence charSequence) {
        Iterator zzg = zzg(charSequence);
        ArrayList arrayList = new ArrayList();
        while (zzg.hasNext()) {
            arrayList.add((String) zzg.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
