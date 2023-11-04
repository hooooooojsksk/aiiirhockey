package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzkl extends zzgs {
    public static final /* synthetic */ int zzc = 0;
    private final int zzd;
    private final int zze;
    private final int[] zzf;
    private final int[] zzg;
    private final zzcn[] zzh;
    private final Object[] zzi;
    private final HashMap zzj;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzkl(Collection collection, zzum zzumVar, byte[] bArr) {
        super(false, zzumVar, null);
        int i = 0;
        int size = collection.size();
        this.zzf = new int[size];
        this.zzg = new int[size];
        this.zzh = new zzcn[size];
        this.zzi = new Object[size];
        this.zzj = new HashMap();
        Iterator it = collection.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            zzjv zzjvVar = (zzjv) it.next();
            this.zzh[i3] = zzjvVar.zza();
            this.zzg[i3] = i;
            this.zzf[i3] = i2;
            i += this.zzh[i3].zzc();
            i2 += this.zzh[i3].zzb();
            this.zzi[i3] = zzjvVar.zzb();
            this.zzj.put(this.zzi[i3], Integer.valueOf(i3));
            i3++;
        }
        this.zzd = i;
        this.zze = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgs
    protected final int zzp(Object obj) {
        Integer num = (Integer) this.zzj.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.zzgs
    protected final int zzq(int i) {
        return zzew.zzc(this.zzf, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzgs
    protected final int zzr(int i) {
        return zzew.zzc(this.zzg, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzgs
    protected final int zzs(int i) {
        return this.zzf[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgs
    protected final int zzt(int i) {
        return this.zzg[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgs
    protected final zzcn zzu(int i) {
        return this.zzh[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgs
    protected final Object zzv(int i) {
        return this.zzi[i];
    }

    public final List zzw() {
        return Arrays.asList(this.zzh);
    }
}
