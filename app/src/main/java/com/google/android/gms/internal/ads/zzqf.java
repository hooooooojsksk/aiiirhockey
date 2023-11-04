package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Trace;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzqf implements zzqt {
    private final zzfok zzb;
    private final zzfok zzc;

    public zzqf(int i, boolean z) {
        zzqd zzqdVar = new zzqd(i);
        zzqe zzqeVar = new zzqe(i);
        this.zzb = zzqdVar;
        this.zzc = zzqeVar;
    }

    public static /* synthetic */ HandlerThread zza(int i) {
        String zzs;
        zzs = zzqh.zzs(i, "ExoPlayer:MediaCodecAsyncAdapter:");
        return new HandlerThread(zzs);
    }

    public static /* synthetic */ HandlerThread zzb(int i) {
        String zzs;
        zzs = zzqh.zzs(i, "ExoPlayer:MediaCodecQueueingThread:");
        return new HandlerThread(zzs);
    }

    public final zzqh zzc(zzqs zzqsVar) throws IOException {
        MediaCodec mediaCodec;
        String str = zzqsVar.zza.zza;
        zzqh zzqhVar = null;
        try {
            int i = zzew.zza;
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                zzqh zzqhVar2 = new zzqh(mediaCodec, zza(((zzqd) this.zzb).zza), zzb(((zzqe) this.zzc).zza), false, null);
                try {
                    Trace.endSection();
                    zzqh.zzh(zzqhVar2, zzqsVar.zzb, zzqsVar.zzd, null, 0);
                    return zzqhVar2;
                } catch (Exception e) {
                    e = e;
                    zzqhVar = zzqhVar2;
                    if (zzqhVar != null) {
                        zzqhVar.zzl();
                    } else if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            mediaCodec = null;
        }
    }
}
