package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfoe implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzfoh zzb;

    public zzfoe(zzfoh zzfohVar, CharSequence charSequence) {
        this.zzb = zzfohVar;
        this.zza = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator zzg;
        zzg = this.zzb.zzg(this.zza);
        return zzg;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        zzfnk.zzb(sb, this, ", ");
        sb.append(']');
        return sb.toString();
    }
}
