package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzajh implements zzzu {
    public static final zzaab zza = new zzaab() { // from class: com.google.android.gms.internal.ads.zzajd
        @Override // com.google.android.gms.internal.ads.zzaab
        public final zzzu[] zza() {
            zzaab zzaabVar = zzajh.zza;
            return new zzzu[]{new zzajh()};
        }

        @Override // com.google.android.gms.internal.ads.zzaab
        public final /* synthetic */ zzzu[] zzb(Uri uri, Map map) {
            return zzaaa.zza(this, uri, map);
        }
    };
    private zzzx zzb;
    private zzabb zzc;
    private zzajf zzf;
    private int zzd = 0;
    private long zze = -1;
    private int zzg = -1;
    private long zzh = -1;

    /* JADX WARN: Code restructure failed: missing block: B:116:0x00e9, code lost:
        if (r1 != 65534) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x010e  */
    @Override // com.google.android.gms.internal.ads.zzzu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(com.google.android.gms.internal.ads.zzzv r19, com.google.android.gms.internal.ads.zzaau r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajh.zza(com.google.android.gms.internal.ads.zzzv, com.google.android.gms.internal.ads.zzaau):int");
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzb(zzzx zzzxVar) {
        this.zzb = zzzxVar;
        this.zzc = zzzxVar.zzv(0, 1);
        zzzxVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzc(long j, long j2) {
        this.zzd = j == 0 ? 0 : 4;
        zzajf zzajfVar = this.zzf;
        if (zzajfVar != null) {
            zzajfVar.zzb(j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzd(zzzv zzzvVar) throws IOException {
        return zzajk.zzc(zzzvVar);
    }
}
