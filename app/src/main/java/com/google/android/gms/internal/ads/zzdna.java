package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzdna {
    private final Map zza = new HashMap();

    @Nullable
    public final synchronized zzdmz zza(String str) {
        return (zzdmz) this.zza.get(str);
    }

    @Nullable
    public final zzdmz zzb(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzdmz zza = zza((String) it.next());
            if (zza != null) {
                return zza;
            }
        }
        return null;
    }

    public final String zzc(String str) {
        zzbpq zzbpqVar;
        zzdmz zza = zza(str);
        return (zza == null || (zzbpqVar = zza.zzb) == null) ? "" : zzbpqVar.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0019 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzd(java.lang.String r7, @javax.annotation.Nullable com.google.android.gms.internal.ads.zzezs r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.Map r0 = r6.zza     // Catch: java.lang.Throwable -> L44
            boolean r0 = r0.containsKey(r7)     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto Lb
            monitor-exit(r6)
            return
        Lb:
            com.google.android.gms.internal.ads.zzdmz r0 = new com.google.android.gms.internal.ads.zzdmz     // Catch: java.lang.Throwable -> L44
            r1 = 0
            if (r8 != 0) goto L12
        L10:
            r2 = r1
            goto L16
        L12:
            com.google.android.gms.internal.ads.zzbpq r2 = r8.zze()     // Catch: com.google.android.gms.internal.ads.zzezc -> L10 java.lang.Throwable -> L44
        L16:
            if (r8 != 0) goto L19
            goto L1d
        L19:
            com.google.android.gms.internal.ads.zzbpq r1 = r8.zzf()     // Catch: com.google.android.gms.internal.ads.zzezc -> L1d java.lang.Throwable -> L44
        L1d:
            com.google.android.gms.internal.ads.zzbaj r3 = com.google.android.gms.internal.ads.zzbar.zziA     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.internal.ads.zzbap r4 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L44
            java.lang.Object r3 = r4.zzb(r3)     // Catch: java.lang.Throwable -> L44
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L44
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L44
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L33
        L31:
            r4 = 1
            goto L3a
        L33:
            if (r8 != 0) goto L36
            goto L3a
        L36:
            r8.zzC()     // Catch: com.google.android.gms.internal.ads.zzezc -> L3a java.lang.Throwable -> L44
            goto L31
        L3a:
            r0.<init>(r7, r2, r1, r4)     // Catch: java.lang.Throwable -> L44
            java.util.Map r8 = r6.zza     // Catch: java.lang.Throwable -> L44
            r8.put(r7, r0)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r6)
            return
        L44:
            r7 = move-exception
            monitor-exit(r6)
            goto L48
        L47:
            throw r7
        L48:
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdna.zzd(java.lang.String, com.google.android.gms.internal.ads.zzezs):void");
    }

    public final synchronized void zze(String str, zzbpc zzbpcVar) {
        if (this.zza.containsKey(str)) {
            return;
        }
        try {
            this.zza.put(str, new zzdmz(str, zzbpcVar.zzf(), zzbpcVar.zzg(), true));
        } catch (Throwable unused) {
        }
    }
}
