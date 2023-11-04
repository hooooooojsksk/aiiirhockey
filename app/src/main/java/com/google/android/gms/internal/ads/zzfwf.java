package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfwf {
    private static final Logger zza = Logger.getLogger(zzfwf.class.getName());
    private final ConcurrentMap zzb;

    public zzfwf() {
        this.zzb = new ConcurrentHashMap();
    }

    private final synchronized zzfwe zzg(String str) throws GeneralSecurityException {
        if (!this.zzb.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (zzfwe) this.zzb.get(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
        r6.zzb.putIfAbsent(r0, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0063, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized void zzh(com.google.android.gms.internal.ads.zzfwe r7, boolean r8) throws java.security.GeneralSecurityException {
        /*
            r6 = this;
            monitor-enter(r6)
            com.google.android.gms.internal.ads.zzfvy r0 = r7.zzb()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = r0.zzf()     // Catch: java.lang.Throwable -> L6b
            java.util.concurrent.ConcurrentMap r1 = r6.zzb     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.zzfwe r1 = (com.google.android.gms.internal.ads.zzfwe) r1     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L5b
            java.lang.Class r2 = r1.zzc()     // Catch: java.lang.Throwable -> L6b
            java.lang.Class r3 = r7.zzc()     // Catch: java.lang.Throwable -> L6b
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L6b
            if (r2 == 0) goto L22
            goto L5b
        L22:
            java.lang.String r8 = "Attempted overwrite of a registered key manager for key type "
            java.lang.String r8 = r8.concat(r0)     // Catch: java.lang.Throwable -> L6b
            java.util.logging.Logger r2 = com.google.android.gms.internal.ads.zzfwf.zza     // Catch: java.lang.Throwable -> L6b
            java.util.logging.Level r3 = java.util.logging.Level.WARNING     // Catch: java.lang.Throwable -> L6b
            java.lang.String r4 = "com.google.crypto.tink.KeyManagerRegistry"
            java.lang.String r5 = "registerKeyManagerContainer"
            r2.logp(r3, r4, r5, r8)     // Catch: java.lang.Throwable -> L6b
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L6b
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L6b
            r3 = 0
            r2[r3] = r0     // Catch: java.lang.Throwable -> L6b
            r0 = 1
            java.lang.Class r1 = r1.zzc()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L6b
            r2[r0] = r1     // Catch: java.lang.Throwable -> L6b
            r0 = 2
            java.lang.Class r7 = r7.zzc()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r7 = r7.getName()     // Catch: java.lang.Throwable -> L6b
            r2[r0] = r7     // Catch: java.lang.Throwable -> L6b
            java.lang.String r7 = "typeUrl (%s) is already registered with %s, cannot be re-registered with %s"
            java.lang.String r7 = java.lang.String.format(r7, r2)     // Catch: java.lang.Throwable -> L6b
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L6b
            throw r8     // Catch: java.lang.Throwable -> L6b
        L5b:
            if (r8 != 0) goto L64
            java.util.concurrent.ConcurrentMap r8 = r6.zzb     // Catch: java.lang.Throwable -> L6b
            r8.putIfAbsent(r0, r7)     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r6)
            return
        L64:
            java.util.concurrent.ConcurrentMap r8 = r6.zzb     // Catch: java.lang.Throwable -> L6b
            r8.put(r0, r7)     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r6)
            return
        L6b:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfwf.zzh(com.google.android.gms.internal.ads.zzfwe, boolean):void");
    }

    public final zzfvy zza(String str, Class cls) throws GeneralSecurityException {
        zzfwe zzg = zzg(str);
        if (zzg.zze().contains(cls)) {
            return zzg.zza(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(zzg.zzc());
        Set<Class> zze = zzg.zze();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class cls2 : zze) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        String sb2 = sb.toString();
        throw new GeneralSecurityException("Primitive type " + name + " not supported by key manager of type " + valueOf + ", supported primitives: " + sb2);
    }

    public final zzfvy zzb(String str) throws GeneralSecurityException {
        return zzg(str).zzb();
    }

    public final synchronized void zzc(zzgdy zzgdyVar, zzgcu zzgcuVar) throws GeneralSecurityException {
        Class zzd;
        if (!zzgas.zza(1)) {
            String valueOf = String.valueOf(zzgdyVar.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
        } else if (zzgas.zza(zzgcuVar.zzf())) {
            String zzd2 = zzgdyVar.zzd();
            String zzd3 = zzgcuVar.zzd();
            if (this.zzb.containsKey(zzd2) && ((zzfwe) this.zzb.get(zzd2)).zzd() != null && (zzd = ((zzfwe) this.zzb.get(zzd2)).zzd()) != null && !zzd.getName().equals(zzgcuVar.getClass().getName())) {
                Logger logger = zza;
                Level level = Level.WARNING;
                logger.logp(level, "com.google.crypto.tink.KeyManagerRegistry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type " + zzd2 + " with inconsistent public key type " + zzd3);
                throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", zzgdyVar.getClass().getName(), zzd.getName(), zzgcuVar.getClass().getName()));
            }
            zzh(new zzfwd(zzgdyVar, zzgcuVar), true);
            zzh(new zzfwc(zzgcuVar), false);
        } else {
            String valueOf2 = String.valueOf(zzgcuVar.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf2 + " as it is not FIPS compatible.");
        }
    }

    public final synchronized void zzd(zzfvy zzfvyVar) throws GeneralSecurityException {
        if (zzgas.zza(1)) {
            zzh(new zzfwb(zzfvyVar), false);
        } else {
            throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
        }
    }

    public final synchronized void zze(zzgcu zzgcuVar) throws GeneralSecurityException {
        if (zzgas.zza(zzgcuVar.zzf())) {
            zzh(new zzfwc(zzgcuVar), false);
        } else {
            String valueOf = String.valueOf(zzgcuVar.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
        }
    }

    public final boolean zzf(String str) {
        return this.zzb.containsKey(str);
    }

    public zzfwf(zzfwf zzfwfVar) {
        this.zzb = new ConcurrentHashMap(zzfwfVar.zzb);
    }
}
