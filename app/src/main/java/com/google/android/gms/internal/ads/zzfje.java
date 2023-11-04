package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import java.io.File;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfje {
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final int zzd;

    public zzfje(Context context, int i) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfjf.zza(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfjf.zza(dir2, true);
        this.zza = dir2;
        this.zzd = i;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(this.zzd - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        StringBuilder sb = new StringBuilder();
        sb.append("FBAMTD");
        sb.append(this.zzd - 1);
        return sb.toString();
    }

    private final String zzf() {
        StringBuilder sb = new StringBuilder();
        sb.append("LATMTD");
        sb.append(this.zzd - 1);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zza(com.google.android.gms.internal.ads.zzasr r8, com.google.android.gms.internal.ads.zzfjk r9) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfje.zza(com.google.android.gms.internal.ads.zzasr, com.google.android.gms.internal.ads.zzfjk):boolean");
    }

    final zzasu zzb(int i) {
        String string;
        if (i == 1) {
            string = this.zzc.getString(zzf(), null);
        } else {
            string = this.zzc.getString(zze(), null);
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            zzasu zzh = zzasu.zzh(zzgpe.zzv(Hex.stringToBytes(string)));
            String zzk = zzh.zzk();
            File zzb = zzfjf.zzb(zzk, "pcam.jar", zzd());
            if (!zzb.exists()) {
                zzb = zzfjf.zzb(zzk, "pcam", zzd());
            }
            File zzb2 = zzfjf.zzb(zzk, "pcbc", zzd());
            if (zzb.exists()) {
                if (zzb2.exists()) {
                    return zzh;
                }
            }
        } catch (zzgqy unused) {
        }
        return null;
    }

    public final zzfjd zzc(int i) {
        zzasu zzb = zzb(1);
        if (zzb == null) {
            return null;
        }
        String zzk = zzb.zzk();
        File zzb2 = zzfjf.zzb(zzk, "pcam.jar", zzd());
        if (!zzb2.exists()) {
            zzb2 = zzfjf.zzb(zzk, "pcam", zzd());
        }
        return new zzfjd(zzb, zzb2, zzfjf.zzb(zzk, "pcbc", zzd()), zzfjf.zzb(zzk, "pcopt", zzd()));
    }
}
