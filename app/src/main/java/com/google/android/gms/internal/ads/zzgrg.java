package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzgrg extends zzgrk {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzgrg() {
        super(null);
    }

    public /* synthetic */ zzgrg(zzgrf zzgrfVar) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List zzf(Object obj, long j, int i) {
        zzgrd zzgrdVar;
        List arrayList;
        List list = (List) zzgtq.zzh(obj, j);
        if (list.isEmpty()) {
            if (list instanceof zzgre) {
                arrayList = new zzgrd(i);
            } else if (!(list instanceof zzgsd) || !(list instanceof zzgqv)) {
                arrayList = new ArrayList(i);
            } else {
                arrayList = ((zzgqv) list).zzd(i);
            }
            zzgtq.zzv(obj, j, arrayList);
            return arrayList;
        }
        if (zza.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i);
            arrayList2.addAll(list);
            zzgtq.zzv(obj, j, arrayList2);
            zzgrdVar = arrayList2;
        } else if (list instanceof zzgtl) {
            zzgrd zzgrdVar2 = new zzgrd(list.size() + i);
            zzgrdVar2.addAll(zzgrdVar2.size(), (zzgtl) list);
            zzgtq.zzv(obj, j, zzgrdVar2);
            zzgrdVar = zzgrdVar2;
        } else if ((list instanceof zzgsd) && (list instanceof zzgqv)) {
            zzgqv zzgqvVar = (zzgqv) list;
            if (zzgqvVar.zzc()) {
                return list;
            }
            zzgqv zzd = zzgqvVar.zzd(list.size() + i);
            zzgtq.zzv(obj, j, zzd);
            return zzd;
        } else {
            return list;
        }
        return zzgrdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgrk
    public final List zza(Object obj, long j) {
        return zzf(obj, j, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzgrk
    public final void zzb(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zzgtq.zzh(obj, j);
        if (list instanceof zzgre) {
            unmodifiableList = ((zzgre) list).zze();
        } else if (zza.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if (!(list instanceof zzgsd) || !(list instanceof zzgqv)) {
                unmodifiableList = Collections.unmodifiableList(list);
            } else {
                zzgqv zzgqvVar = (zzgqv) list;
                if (zzgqvVar.zzc()) {
                    zzgqvVar.zzb();
                    return;
                }
                return;
            }
        }
        zzgtq.zzv(obj, j, unmodifiableList);
    }

    @Override // com.google.android.gms.internal.ads.zzgrk
    public final void zzc(Object obj, Object obj2, long j) {
        List list = (List) zzgtq.zzh(obj2, j);
        List zzf = zzf(obj, j, list.size());
        int size = zzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            zzf.addAll(list);
        }
        if (size > 0) {
            list = zzf;
        }
        zzgtq.zzv(obj, j, list);
    }
}
