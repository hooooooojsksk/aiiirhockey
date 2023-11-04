package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzop {
    public static void zza(AudioTrack audioTrack, zzor zzorVar) {
        audioTrack.setPreferredDevice(zzorVar == null ? null : zzorVar.zza);
    }
}
