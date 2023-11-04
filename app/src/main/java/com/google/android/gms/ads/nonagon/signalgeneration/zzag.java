package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzawo;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzag {
    private final String zza;

    public /* synthetic */ zzag(zzae zzaeVar, zzaf zzafVar) {
        String str;
        str = zzaeVar.zza;
        this.zza = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final zzawo zza() {
        char c;
        String str = this.zza;
        switch (str.hashCode()) {
            case -1999289321:
                if (str.equals("NATIVE")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1372958932:
                if (str.equals("INTERSTITIAL")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 543046670:
                if (str.equals("REWARDED")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1951953708:
                if (str.equals("BANNER")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c == 3) {
                        return zzawo.REWARD_BASED_VIDEO_AD;
                    }
                    return zzawo.AD_INITIATER_UNSPECIFIED;
                }
                return zzawo.AD_LOADER;
            }
            return zzawo.INTERSTITIAL;
        }
        return zzawo.BANNER;
    }

    public final String zzb() {
        return this.zza.toLowerCase(Locale.ROOT);
    }

    public final Set zzc() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.zza.toLowerCase(Locale.ROOT));
        return hashSet;
    }
}
