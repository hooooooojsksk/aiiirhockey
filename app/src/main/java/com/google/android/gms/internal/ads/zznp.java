package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zznp {
    private static final AudioAttributes zza = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    public static int zza(int i, int i2) {
        for (int i3 = 8; i3 > 0; i3--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(zzew.zzj(i3)).build(), zza)) {
                return i3;
            }
        }
        return 0;
    }

    public static int[] zzb() {
        zzfqn zzfqnVar;
        zzfqh zzi = zzfqk.zzi();
        zzfqnVar = zznq.zzc;
        zzfsj it = zzfqnVar.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), zza)) {
                zzi.zzf(Integer.valueOf(intValue));
            }
        }
        zzi.zzf((Object) 2);
        Object[] array = zzi.zzi().toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            Objects.requireNonNull(obj);
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
