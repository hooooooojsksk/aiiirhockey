package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzfww {
    private final Class zza;
    private zzfwx zzc;
    private ConcurrentMap zzb = new ConcurrentHashMap();
    private zzggl zzd = zzggl.zza;

    public /* synthetic */ zzfww(Class cls, zzfwv zzfwvVar) {
        this.zza = cls;
    }

    private final zzfww zze(@Nullable Object obj, @Nullable Object obj2, zzglk zzglkVar, boolean z) throws GeneralSecurityException {
        byte[] array;
        if (this.zzb != null) {
            if (obj != null || obj2 != null) {
                if (zzglkVar.zzk() == 3) {
                    ConcurrentMap concurrentMap = this.zzb;
                    Integer valueOf = Integer.valueOf(zzglkVar.zza());
                    if (zzglkVar.zzf() == zzgme.RAW) {
                        valueOf = null;
                    }
                    zzfvx zza = zzgdf.zzb().zza(zzgdz.zza(zzglkVar.zzc().zzg(), zzglkVar.zzc().zzf(), zzglkVar.zzc().zzc(), zzglkVar.zzf(), valueOf), zzfxg.zza());
                    int ordinal = zzglkVar.zzf().ordinal();
                    if (ordinal == 1) {
                        array = ByteBuffer.allocate(5).put((byte) 1).putInt(zzglkVar.zza()).array();
                    } else {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                array = zzfvt.zza;
                            } else if (ordinal != 4) {
                                throw new GeneralSecurityException("unknown output prefix type");
                            }
                        }
                        array = ByteBuffer.allocate(5).put((byte) 0).putInt(zzglkVar.zza()).array();
                    }
                    zzfwx zzfwxVar = new zzfwx(obj, obj2, array, zzglkVar.zzk(), zzglkVar.zzf(), zzglkVar.zza(), zzglkVar.zzc().zzg(), zza);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(zzfwxVar);
                    zzfwz zzfwzVar = new zzfwz(zzfwxVar.zzg(), null);
                    List list = (List) concurrentMap.put(zzfwzVar, Collections.unmodifiableList(arrayList));
                    if (list != null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.addAll(list);
                        arrayList2.add(zzfwxVar);
                        concurrentMap.put(zzfwzVar, Collections.unmodifiableList(arrayList2));
                    }
                    if (z) {
                        if (this.zzc == null) {
                            this.zzc = zzfwxVar;
                        } else {
                            throw new IllegalStateException("you cannot set two primary primitives");
                        }
                    }
                    return this;
                }
                throw new GeneralSecurityException("only ENABLED key is allowed");
            }
            throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
        }
        throw new IllegalStateException("addPrimitive cannot be called after build");
    }

    public final zzfww zza(@Nullable Object obj, @Nullable Object obj2, zzglk zzglkVar) throws GeneralSecurityException {
        zze(obj, obj2, zzglkVar, false);
        return this;
    }

    public final zzfww zzb(@Nullable Object obj, @Nullable Object obj2, zzglk zzglkVar) throws GeneralSecurityException {
        zze(obj, obj2, zzglkVar, true);
        return this;
    }

    public final zzfww zzc(zzggl zzgglVar) {
        if (this.zzb != null) {
            this.zzd = zzgglVar;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build");
    }

    public final zzfxb zzd() throws GeneralSecurityException {
        ConcurrentMap concurrentMap = this.zzb;
        if (concurrentMap != null) {
            zzfxb zzfxbVar = new zzfxb(concurrentMap, this.zzc, this.zzd, this.zza, null);
            this.zzb = null;
            return zzfxbVar;
        }
        throw new IllegalStateException("build cannot be called twice");
    }
}
