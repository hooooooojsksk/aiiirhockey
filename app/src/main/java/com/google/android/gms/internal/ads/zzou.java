package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzou {
    public final zzaf zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final zzdb zzi;

    public zzou(zzaf zzafVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, zzdb zzdbVar) {
        this.zza = zzafVar;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = i5;
        this.zzg = i6;
        this.zzh = i7;
        this.zzi = zzdbVar;
    }

    public final long zza(long j) {
        return (j * 1000000) / this.zze;
    }

    public final AudioTrack zzb(boolean z, zzk zzkVar, int i) throws zzoe {
        AudioTrack audioTrack;
        AudioFormat build;
        AudioFormat build2;
        try {
            if (zzew.zza >= 29) {
                build2 = new AudioFormat.Builder().setSampleRate(this.zze).setChannelMask(this.zzf).setEncoding(this.zzg).build();
                audioTrack = new AudioTrack.Builder().setAudioAttributes(zzkVar.zza().zza).setAudioFormat(build2).setTransferMode(1).setBufferSizeInBytes(this.zzh).setSessionId(i).setOffloadedPlayback(this.zzc == 1).build();
            } else if (zzew.zza < 21) {
                int i2 = zzkVar.zzc;
                if (i == 0) {
                    audioTrack = new AudioTrack(3, this.zze, this.zzf, this.zzg, this.zzh, 1);
                } else {
                    audioTrack = new AudioTrack(3, this.zze, this.zzf, this.zzg, this.zzh, 1, i);
                }
            } else {
                AudioAttributes audioAttributes = zzkVar.zza().zza;
                build = new AudioFormat.Builder().setSampleRate(this.zze).setChannelMask(this.zzf).setEncoding(this.zzg).build();
                audioTrack = new AudioTrack(audioAttributes, build, this.zzh, 1, i);
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new zzoe(state, this.zze, this.zzf, this.zzh, this.zza, zzc(), null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new zzoe(0, this.zze, this.zzf, this.zzh, this.zza, zzc(), e);
        }
    }

    public final boolean zzc() {
        return this.zzc == 1;
    }
}
