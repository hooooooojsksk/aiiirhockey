package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzggo {
    @Nullable
    private ArrayList zza = new ArrayList();
    private zzggl zzb = zzggl.zza;
    @Nullable
    private Integer zzc = null;

    public final zzggo zza(zzfwg zzfwgVar, int i, String str, String str2) {
        ArrayList arrayList = this.zza;
        if (arrayList == null) {
            throw new IllegalStateException("addEntry cannot be called after build()");
        }
        arrayList.add(new zzggq(zzfwgVar, i, str, str2, null));
        return this;
    }

    public final zzggo zzb(zzggl zzgglVar) {
        if (this.zza != null) {
            this.zzb = zzgglVar;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build()");
    }

    public final zzggo zzc(int i) {
        if (this.zza == null) {
            throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
        }
        this.zzc = Integer.valueOf(i);
        return this;
    }

    public final zzggs zzd() throws GeneralSecurityException {
        if (this.zza != null) {
            Integer num = this.zzc;
            if (num != null) {
                int intValue = num.intValue();
                ArrayList arrayList = this.zza;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    int zza = ((zzggq) arrayList.get(i)).zza();
                    i++;
                    if (zza == intValue) {
                        zzggs zzggsVar = new zzggs(this.zzb, Collections.unmodifiableList(this.zza), this.zzc, null);
                        this.zza = null;
                        return zzggsVar;
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            zzggs zzggsVar2 = new zzggs(this.zzb, Collections.unmodifiableList(this.zza), this.zzc, null);
            this.zza = null;
            return zzggsVar2;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
