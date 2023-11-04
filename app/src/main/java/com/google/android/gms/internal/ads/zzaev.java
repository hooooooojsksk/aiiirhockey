package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzaev {
    private final zzen zza = new zzen(8);
    private int zzb;

    private final long zzb(zzzv zzzvVar) throws IOException {
        zzzk zzzkVar = (zzzk) zzzvVar;
        int i = 0;
        zzzkVar.zzm(this.zza.zzH(), 0, 1, false);
        int i2 = this.zza.zzH()[0] & UByte.MAX_VALUE;
        if (i2 != 0) {
            int i3 = 128;
            int i4 = 0;
            while ((i2 & i3) == 0) {
                i3 >>= 1;
                i4++;
            }
            int i5 = i2 & (i3 ^ (-1));
            zzzkVar.zzm(this.zza.zzH(), 1, i4, false);
            while (i < i4) {
                i++;
                i5 = (this.zza.zzH()[i] & UByte.MAX_VALUE) + (i5 << 8);
            }
            this.zzb += i4 + 1;
            return i5;
        }
        return Long.MIN_VALUE;
    }

    public final boolean zza(zzzv zzzvVar) throws IOException {
        long zzd = zzzvVar.zzd();
        long j = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        if (zzd != -1 && zzd <= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            j = zzd;
        }
        zzzk zzzkVar = (zzzk) zzzvVar;
        zzzkVar.zzm(this.zza.zzH(), 0, 4, false);
        long zzs = this.zza.zzs();
        this.zzb = 4;
        while (zzs != 440786851) {
            int i = (int) j;
            int i2 = this.zzb + 1;
            this.zzb = i2;
            if (i2 == i) {
                return false;
            }
            zzzkVar.zzm(this.zza.zzH(), 0, 1, false);
            zzs = ((zzs << 8) & (-256)) | (this.zza.zzH()[0] & UByte.MAX_VALUE);
        }
        long zzb = zzb(zzzvVar);
        long j2 = this.zzb;
        if (zzb != Long.MIN_VALUE && (zzd == -1 || j2 + zzb < zzd)) {
            while (true) {
                long j3 = this.zzb;
                long j4 = j2 + zzb;
                if (j3 < j4) {
                    if (zzb(zzzvVar) == Long.MIN_VALUE) {
                        return false;
                    }
                    long zzb2 = zzb(zzzvVar);
                    if (zzb2 < 0) {
                        return false;
                    }
                    if (zzb2 != 0) {
                        int i3 = (int) zzb2;
                        zzzkVar.zzl(i3, false);
                        this.zzb += i3;
                    }
                } else if (j3 == j4) {
                    return true;
                }
            }
        }
        return false;
    }
}
