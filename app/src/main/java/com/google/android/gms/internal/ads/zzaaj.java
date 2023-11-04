package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzaaj {
    private static final Pattern zzc = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int zza = -1;
    public int zzb = -1;

    private final boolean zzc(String str) {
        Matcher matcher = zzc.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                int i = zzew.zza;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.zza = parseInt;
                    this.zzb = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final boolean zza() {
        return (this.zza == -1 || this.zzb == -1) ? false : true;
    }

    public final boolean zzb(zzbq zzbqVar) {
        for (int i = 0; i < zzbqVar.zza(); i++) {
            zzbp zzb = zzbqVar.zzb(i);
            if (zzb instanceof zzadi) {
                zzadi zzadiVar = (zzadi) zzb;
                if ("iTunSMPB".equals(zzadiVar.zzb) && zzc(zzadiVar.zzc)) {
                    return true;
                }
            } else if (zzb instanceof zzadr) {
                zzadr zzadrVar = (zzadr) zzb;
                if ("com.apple.iTunes".equals(zzadrVar.zza) && "iTunSMPB".equals(zzadrVar.zzb) && zzc(zzadrVar.zzc)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
