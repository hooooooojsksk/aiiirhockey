package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzpc extends AudioTrack.StreamEventCallback {
    final /* synthetic */ zzpf zza;
    final /* synthetic */ zzpd zzb;

    public zzpc(zzpd zzpdVar, zzpf zzpfVar) {
        this.zzb = zzpdVar;
        this.zza = zzpfVar;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i) {
        AudioTrack audioTrack2;
        zzof zzofVar;
        boolean z;
        zzof zzofVar2;
        audioTrack2 = this.zzb.zza.zzu;
        if (audioTrack.equals(audioTrack2)) {
            zzpf zzpfVar = this.zzb.zza;
            zzofVar = zzpfVar.zzq;
            if (zzofVar != null) {
                z = zzpfVar.zzP;
                if (z) {
                    zzofVar2 = zzpfVar.zzq;
                    zzofVar2.zzb();
                }
            }
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        AudioTrack audioTrack2;
        zzof zzofVar;
        boolean z;
        zzof zzofVar2;
        audioTrack2 = this.zzb.zza.zzu;
        if (audioTrack.equals(audioTrack2)) {
            zzpf zzpfVar = this.zzb.zza;
            zzofVar = zzpfVar.zzq;
            if (zzofVar != null) {
                z = zzpfVar.zzP;
                if (z) {
                    zzofVar2 = zzpfVar.zzq;
                    zzofVar2.zzb();
                }
            }
        }
    }
}
