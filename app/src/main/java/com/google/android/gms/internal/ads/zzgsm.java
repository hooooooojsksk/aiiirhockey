package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgsm implements Iterator {
    private final ArrayDeque zza;
    private zzgoz zzb;

    public /* synthetic */ zzgsm(zzgpe zzgpeVar, zzgsl zzgslVar) {
        zzgpe zzgpeVar2;
        if (zzgpeVar instanceof zzgso) {
            zzgso zzgsoVar = (zzgso) zzgpeVar;
            ArrayDeque arrayDeque = new ArrayDeque(zzgsoVar.zzf());
            this.zza = arrayDeque;
            arrayDeque.push(zzgsoVar);
            zzgpeVar2 = zzgsoVar.zzd;
            this.zzb = zzb(zzgpeVar2);
            return;
        }
        this.zza = null;
        this.zzb = (zzgoz) zzgpeVar;
    }

    private final zzgoz zzb(zzgpe zzgpeVar) {
        while (zzgpeVar instanceof zzgso) {
            zzgso zzgsoVar = (zzgso) zzgpeVar;
            this.zza.push(zzgsoVar);
            zzgpeVar = zzgsoVar.zzd;
        }
        return (zzgoz) zzgpeVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* renamed from: zza */
    public final zzgoz next() {
        zzgoz zzgozVar;
        zzgpe zzgpeVar;
        zzgoz zzgozVar2 = this.zzb;
        if (zzgozVar2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.zza;
            zzgozVar = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            zzgpeVar = ((zzgso) this.zza.pop()).zze;
            zzgozVar = zzb(zzgpeVar);
        } while (zzgozVar.zzD());
        this.zzb = zzgozVar;
        return zzgozVar2;
    }
}
