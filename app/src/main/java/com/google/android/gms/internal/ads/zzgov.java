package com.google.android.gms.internal.ads;

import java.util.Comparator;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzgov implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzgpe zzgpeVar = (zzgpe) obj;
        zzgpe zzgpeVar2 = (zzgpe) obj2;
        zzgoy it = zzgpeVar.iterator();
        zzgoy it2 = zzgpeVar2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int compareTo = Integer.valueOf(it.zza() & UByte.MAX_VALUE).compareTo(Integer.valueOf(it2.zza() & UByte.MAX_VALUE));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzgpeVar.zzd()).compareTo(Integer.valueOf(zzgpeVar2.zzd()));
    }
}
