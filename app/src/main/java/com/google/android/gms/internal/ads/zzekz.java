package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzekz implements zzepn {
    private final zzfuu zza;
    private final Context zzb;

    public zzekz(zzfuu zzfuuVar, Context context) {
        this.zza = zzfuuVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 13;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeky
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzekz.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzela zzc() throws Exception {
        int i;
        AudioManager audioManager = (AudioManager) this.zzb.getSystemService("audio");
        int mode = audioManager.getMode();
        boolean isMusicActive = audioManager.isMusicActive();
        boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        int i2 = -1;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjm)).booleanValue()) {
            i = com.google.android.gms.ads.internal.zzt.zzq().zzj(audioManager);
            i2 = audioManager.getStreamMaxVolume(3);
        } else {
            i = -1;
        }
        return new zzela(mode, isMusicActive, isSpeakerphoneOn, streamVolume, i, i2, audioManager.getRingerMode(), audioManager.getStreamVolume(2), com.google.android.gms.ads.internal.zzt.zzr().zza(), com.google.android.gms.ads.internal.zzt.zzr().zze());
    }
}
