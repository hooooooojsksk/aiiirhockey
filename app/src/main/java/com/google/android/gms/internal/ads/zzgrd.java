package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgrd extends zzgoo implements RandomAccess, zzgre {
    @Deprecated
    public static final zzgre zza;
    private static final zzgrd zzb;
    private final List zzc;

    static {
        zzgrd zzgrdVar = new zzgrd(10);
        zzb = zzgrdVar;
        zzgrdVar.zzb();
        zza = zzgrdVar;
    }

    public zzgrd() {
        this(10);
    }

    private static String zzj(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzgpe) {
            return ((zzgpe) obj).zzA(zzgqw.zzb);
        }
        return zzgqw.zzg((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgoo, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        zzbH();
        this.zzc.add(i, (String) obj);
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgoo, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        zzbH();
        if (collection instanceof zzgre) {
            collection = ((zzgre) collection).zzh();
        }
        boolean addAll = this.zzc.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.ads.zzgoo, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzbH();
        this.zzc.clear();
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgoo, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzbH();
        Object remove = this.zzc.remove(i);
        this.modCount++;
        return zzj(remove);
    }

    @Override // com.google.android.gms.internal.ads.zzgoo, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        zzbH();
        return zzj(this.zzc.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgqv
    public final /* bridge */ /* synthetic */ zzgqv zzd(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.zzc);
        return new zzgrd(arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    public final zzgre zze() {
        return zzc() ? new zzgtl(this) : this;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    public final Object zzf(int i) {
        return this.zzc.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: zzg */
    public final String get(int i) {
        Object obj = this.zzc.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzgpe) {
            zzgpe zzgpeVar = (zzgpe) obj;
            String zzA = zzgpeVar.zzA(zzgqw.zzb);
            if (zzgpeVar.zzp()) {
                this.zzc.set(i, zzA);
            }
            return zzA;
        }
        byte[] bArr = (byte[]) obj;
        String zzg = zzgqw.zzg(bArr);
        if (zzgqw.zzh(bArr)) {
            this.zzc.set(i, zzg);
        }
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    public final void zzi(zzgpe zzgpeVar) {
        zzbH();
        this.zzc.add(zzgpeVar);
        this.modCount++;
    }

    public zzgrd(int i) {
        this.zzc = new ArrayList(i);
    }

    private zzgrd(ArrayList arrayList) {
        this.zzc = arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzgoo, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
