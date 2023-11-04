package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzfxf {
    private static final Logger zza = Logger.getLogger(zzfxf.class.getName());
    private static final AtomicReference zzb = new AtomicReference(new zzfwf());
    private static final ConcurrentMap zzc = new ConcurrentHashMap();
    private static final ConcurrentMap zzd = new ConcurrentHashMap();
    private static final ConcurrentMap zze = new ConcurrentHashMap();
    private static final ConcurrentMap zzf = new ConcurrentHashMap();

    private zzfxf() {
    }

    @Deprecated
    public static zzfvr zza(String str) throws GeneralSecurityException {
        if (str == null) {
            throw new IllegalArgumentException("catalogueName must be non-null.");
        }
        zzfvr zzfvrVar = (zzfvr) zze.get(str.toLowerCase(Locale.US));
        if (zzfvrVar == null) {
            String format = String.format("no catalogue found for %s. ", str);
            if (str.toLowerCase(Locale.US).startsWith("tinkaead")) {
                format = String.valueOf(format).concat("Maybe call AeadConfig.register().");
            }
            if (str.toLowerCase(Locale.US).startsWith("tinkdeterministicaead")) {
                format = String.valueOf(format).concat("Maybe call DeterministicAeadConfig.register().");
            } else if (str.toLowerCase(Locale.US).startsWith("tinkstreamingaead")) {
                format = String.valueOf(format).concat("Maybe call StreamingAeadConfig.register().");
            } else if (str.toLowerCase(Locale.US).startsWith("tinkhybriddecrypt") || str.toLowerCase(Locale.US).startsWith("tinkhybridencrypt")) {
                format = String.valueOf(format).concat("Maybe call HybridConfig.register().");
            } else if (str.toLowerCase(Locale.US).startsWith("tinkmac")) {
                format = String.valueOf(format).concat("Maybe call MacConfig.register().");
            } else if (str.toLowerCase(Locale.US).startsWith("tinkpublickeysign") || str.toLowerCase(Locale.US).startsWith("tinkpublickeyverify")) {
                format = String.valueOf(format).concat("Maybe call SignatureConfig.register().");
            } else if (str.toLowerCase(Locale.US).startsWith("tink")) {
                format = String.valueOf(format).concat("Maybe call TinkConfig.register().");
            }
            throw new GeneralSecurityException(format);
        }
        return zzfvrVar;
    }

    public static zzfvy zzb(String str) throws GeneralSecurityException {
        return ((zzfwf) zzb.get()).zzb(str);
    }

    public static synchronized zzgky zzc(zzgld zzgldVar) throws GeneralSecurityException {
        zzgky zza2;
        synchronized (zzfxf.class) {
            zzfvy zzb2 = zzb(zzgldVar.zzg());
            if (((Boolean) zzd.get(zzgldVar.zzg())).booleanValue()) {
                zza2 = zzb2.zza(zzgldVar.zzf());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(zzgldVar.zzg())));
            }
        }
        return zza2;
    }

    public static synchronized zzgrw zzd(zzgld zzgldVar) throws GeneralSecurityException {
        zzgrw zzb2;
        synchronized (zzfxf.class) {
            zzfvy zzb3 = zzb(zzgldVar.zzg());
            if (((Boolean) zzd.get(zzgldVar.zzg())).booleanValue()) {
                zzb2 = zzb3.zzb(zzgldVar.zzf());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(zzgldVar.zzg())));
            }
        }
        return zzb2;
    }

    @Nullable
    public static Class zze(Class cls) {
        try {
            return zzgde.zza().zzb(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static Object zzf(zzfvx zzfvxVar, Class cls) throws GeneralSecurityException {
        return zzgde.zza().zzc(zzfvxVar, cls);
    }

    public static Object zzg(zzgky zzgkyVar, Class cls) throws GeneralSecurityException {
        return zzh(zzgkyVar.zzg(), zzgkyVar.zzf(), cls);
    }

    public static Object zzh(String str, zzgpe zzgpeVar, Class cls) throws GeneralSecurityException {
        return ((zzfwf) zzb.get()).zza(str, cls).zzd(zzgpeVar);
    }

    public static Object zzi(String str, zzgrw zzgrwVar, Class cls) throws GeneralSecurityException {
        return ((zzfwf) zzb.get()).zza(str, cls).zze(zzgrwVar);
    }

    public static Object zzj(String str, byte[] bArr, Class cls) throws GeneralSecurityException {
        return zzh(str, zzgpe.zzv(bArr), cls);
    }

    public static Object zzk(zzfxb zzfxbVar, Class cls) throws GeneralSecurityException {
        return zzgde.zza().zzd(zzfxbVar, cls);
    }

    public static synchronized Map zzl() {
        Map unmodifiableMap;
        synchronized (zzfxf.class) {
            unmodifiableMap = Collections.unmodifiableMap(zzf);
        }
        return unmodifiableMap;
    }

    public static synchronized void zzm(zzgdy zzgdyVar, zzgcu zzgcuVar, boolean z) throws GeneralSecurityException {
        synchronized (zzfxf.class) {
            AtomicReference atomicReference = zzb;
            zzfwf zzfwfVar = new zzfwf((zzfwf) atomicReference.get());
            zzfwfVar.zzc(zzgdyVar, zzgcuVar);
            Map zzc2 = zzgdyVar.zza().zzc();
            String zzd2 = zzgdyVar.zzd();
            zzq(zzd2, zzc2, true);
            String zzd3 = zzgcuVar.zzd();
            zzq(zzd3, Collections.emptyMap(), false);
            if (!((zzfwf) atomicReference.get()).zzf(zzd2)) {
                zzc.put(zzd2, new zzfxe(zzgdyVar));
                zzr(zzgdyVar.zzd(), zzgdyVar.zza().zzc());
            }
            ConcurrentMap concurrentMap = zzd;
            concurrentMap.put(zzd2, true);
            concurrentMap.put(zzd3, false);
            atomicReference.set(zzfwfVar);
        }
    }

    public static synchronized void zzo(zzgcu zzgcuVar, boolean z) throws GeneralSecurityException {
        synchronized (zzfxf.class) {
            AtomicReference atomicReference = zzb;
            zzfwf zzfwfVar = new zzfwf((zzfwf) atomicReference.get());
            zzfwfVar.zze(zzgcuVar);
            Map zzc2 = zzgcuVar.zza().zzc();
            String zzd2 = zzgcuVar.zzd();
            zzq(zzd2, zzc2, true);
            if (!((zzfwf) atomicReference.get()).zzf(zzd2)) {
                zzc.put(zzd2, new zzfxe(zzgcuVar));
                zzr(zzd2, zzgcuVar.zza().zzc());
            }
            zzd.put(zzd2, true);
            atomicReference.set(zzfwfVar);
        }
    }

    public static synchronized void zzp(zzfxc zzfxcVar) throws GeneralSecurityException {
        synchronized (zzfxf.class) {
            zzgde.zza().zzf(zzfxcVar);
        }
    }

    private static synchronized void zzq(String str, Map map, boolean z) throws GeneralSecurityException {
        synchronized (zzfxf.class) {
            if (z) {
                ConcurrentMap concurrentMap = zzd;
                if (concurrentMap.containsKey(str) && !((Boolean) concurrentMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                }
                if (((zzfwf) zzb.get()).zzf(str)) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!zzf.containsKey(entry.getKey())) {
                            throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                        }
                    }
                } else {
                    for (Map.Entry entry2 : map.entrySet()) {
                        if (zzf.containsKey(entry2.getKey())) {
                            throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf((String) entry2.getKey())));
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, com.google.android.gms.internal.ads.zzgrw] */
    private static void zzr(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            zzf.put((String) entry.getKey(), zzfwh.zze(str, ((zzgcs) entry.getValue()).zza.zzax(), ((zzgcs) entry.getValue()).zzb));
        }
    }

    public static synchronized void zzn(zzfvy zzfvyVar, boolean z) throws GeneralSecurityException {
        synchronized (zzfxf.class) {
            try {
                if (zzfvyVar == null) {
                    throw new IllegalArgumentException("key manager must be non-null.");
                }
                AtomicReference atomicReference = zzb;
                zzfwf zzfwfVar = new zzfwf((zzfwf) atomicReference.get());
                zzfwfVar.zzd(zzfvyVar);
                if (zzgas.zza(1)) {
                    String zzf2 = zzfvyVar.zzf();
                    zzq(zzf2, Collections.emptyMap(), z);
                    zzd.put(zzf2, Boolean.valueOf(z));
                    atomicReference.set(zzfwfVar);
                } else {
                    throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
