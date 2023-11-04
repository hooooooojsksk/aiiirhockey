package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.games.GamesStatusCodes;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zznk implements zzle, zznl {
    private final Context zza;
    private final zznm zzb;
    private final PlaybackSession zzc;
    private String zzi;
    private PlaybackMetrics.Builder zzj;
    private int zzk;
    private zzbw zzn;
    private zznj zzo;
    private zznj zzp;
    private zznj zzq;
    private zzaf zzr;
    private zzaf zzs;
    private zzaf zzt;
    private boolean zzu;
    private boolean zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private boolean zzz;
    private final zzcm zze = new zzcm();
    private final zzck zzf = new zzck();
    private final HashMap zzh = new HashMap();
    private final HashMap zzg = new HashMap();
    private final long zzd = SystemClock.elapsedRealtime();
    private int zzl = 0;
    private int zzm = 0;

    private zznk(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzc = playbackSession;
        zzni zzniVar = new zzni(zzni.zza);
        this.zzb = zzniVar;
        zzniVar.zzg(this);
    }

    public static zznk zzb(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new zznk(context, mediaMetricsManager.createPlaybackSession());
    }

    private static int zzr(int i) {
        switch (zzew.zzl(i)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case GamesStatusCodes.STATUS_MULTIPLAYER_ERROR_INVALID_OPERATION /* 6004 */:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private final void zzs() {
        PlaybackMetrics.Builder builder = this.zzj;
        if (builder != null && this.zzz) {
            builder.setAudioUnderrunCount(this.zzy);
            this.zzj.setVideoFramesDropped(this.zzw);
            this.zzj.setVideoFramesPlayed(this.zzx);
            Long l = (Long) this.zzg.get(this.zzi);
            this.zzj.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.zzh.get(this.zzi);
            this.zzj.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.zzj.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.zzc.reportPlaybackMetrics(this.zzj.build());
        }
        this.zzj = null;
        this.zzi = null;
        this.zzy = 0;
        this.zzw = 0;
        this.zzx = 0;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzz = false;
    }

    private final void zzt(long j, zzaf zzafVar, int i) {
        if (zzew.zzU(this.zzs, zzafVar)) {
            return;
        }
        int i2 = this.zzs == null ? 1 : 0;
        this.zzs = zzafVar;
        zzx(0, j, zzafVar, i2);
    }

    private final void zzu(long j, zzaf zzafVar, int i) {
        if (zzew.zzU(this.zzt, zzafVar)) {
            return;
        }
        int i2 = this.zzt == null ? 1 : 0;
        this.zzt = zzafVar;
        zzx(2, j, zzafVar, i2);
    }

    @RequiresNonNull({"metricsBuilder"})
    private final void zzv(zzcn zzcnVar, zzss zzssVar) {
        int zza;
        PlaybackMetrics.Builder builder = this.zzj;
        if (zzssVar == null || (zza = zzcnVar.zza(zzssVar.zza)) == -1) {
            return;
        }
        int i = 0;
        zzcnVar.zzd(zza, this.zzf, false);
        zzcnVar.zze(this.zzf.zzd, this.zze, 0L);
        zzay zzayVar = this.zze.zzd.zzd;
        if (zzayVar != null) {
            int zzp = zzew.zzp(zzayVar.zza);
            i = zzp != 0 ? zzp != 1 ? zzp != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        zzcm zzcmVar = this.zze;
        if (zzcmVar.zzn != -9223372036854775807L && !zzcmVar.zzl && !zzcmVar.zzi && !zzcmVar.zzb()) {
            builder.setMediaDurationMillis(zzew.zzz(this.zze.zzn));
        }
        builder.setPlaybackType(true != this.zze.zzb() ? 1 : 2);
        this.zzz = true;
    }

    private final void zzw(long j, zzaf zzafVar, int i) {
        if (zzew.zzU(this.zzr, zzafVar)) {
            return;
        }
        int i2 = this.zzr == null ? 1 : 0;
        this.zzr = zzafVar;
        zzx(1, j, zzafVar, i2);
    }

    private final void zzx(int i, long j, zzaf zzafVar, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.zzd);
        if (zzafVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i2 != 1 ? 1 : 2);
            String str = zzafVar.zzl;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = zzafVar.zzm;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = zzafVar.zzj;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = zzafVar.zzi;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = zzafVar.zzr;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = zzafVar.zzs;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = zzafVar.zzz;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = zzafVar.zzA;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = zzafVar.zzd;
            if (str4 != null) {
                String[] zzah = zzew.zzah(str4, "-");
                Pair create = Pair.create(zzah[0], zzah.length >= 2 ? zzah[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                if (create.second != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) create.second);
                }
            }
            float f = zzafVar.zzt;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzz = true;
        this.zzc.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    private final boolean zzy(zznj zznjVar) {
        return zznjVar != null && zznjVar.zzc.equals(this.zzb.zzd());
    }

    public final LogSessionId zza() {
        return this.zzc.getSessionId();
    }

    @Override // com.google.android.gms.internal.ads.zznl
    public final void zzc(zzlc zzlcVar, String str) {
        zzss zzssVar = zzlcVar.zzd;
        if (zzssVar == null || !zzssVar.zzb()) {
            zzs();
            this.zzi = str;
            this.zzj = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.0.0-beta03");
            zzv(zzlcVar.zzb, zzlcVar.zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zznl
    public final void zzd(zzlc zzlcVar, String str, boolean z) {
        zzss zzssVar = zzlcVar.zzd;
        if ((zzssVar == null || !zzssVar.zzb()) && str.equals(this.zzi)) {
            zzs();
        }
        this.zzg.remove(str);
        this.zzh.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final /* synthetic */ void zze(zzlc zzlcVar, zzaf zzafVar, zzhc zzhcVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzf(zzlc zzlcVar, int i, long j, long j2) {
        zzss zzssVar = zzlcVar.zzd;
        if (zzssVar != null) {
            String zze = this.zzb.zze(zzlcVar.zzb, zzssVar);
            Long l = (Long) this.zzh.get(zze);
            Long l2 = (Long) this.zzg.get(zze);
            this.zzh.put(zze, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            this.zzg.put(zze, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzg(zzlc zzlcVar, zzso zzsoVar) {
        zzss zzssVar = zzlcVar.zzd;
        if (zzssVar == null) {
            return;
        }
        zzaf zzafVar = zzsoVar.zzb;
        Objects.requireNonNull(zzafVar);
        zznj zznjVar = new zznj(zzafVar, 0, this.zzb.zze(zzlcVar.zzb, zzssVar));
        int i = zzsoVar.zza;
        if (i != 0) {
            if (i == 1) {
                this.zzp = zznjVar;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.zzq = zznjVar;
                return;
            }
        }
        this.zzo = zznjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final /* synthetic */ void zzh(zzlc zzlcVar, int i, long j) {
    }

    /* JADX WARN: Removed duplicated region for block: B:466:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:551:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(com.google.android.gms.internal.ads.zzcg r21, com.google.android.gms.internal.ads.zzld r22) {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zznk.zzi(com.google.android.gms.internal.ads.zzcg, com.google.android.gms.internal.ads.zzld):void");
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzj(zzlc zzlcVar, zzsj zzsjVar, zzso zzsoVar, IOException iOException, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final /* synthetic */ void zzk(zzlc zzlcVar, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzl(zzlc zzlcVar, zzbw zzbwVar) {
        this.zzn = zzbwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzm(zzlc zzlcVar, zzcf zzcfVar, zzcf zzcfVar2, int i) {
        if (i == 1) {
            this.zzu = true;
            i = 1;
        }
        this.zzk = i;
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final /* synthetic */ void zzn(zzlc zzlcVar, Object obj, long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzo(zzlc zzlcVar, zzhb zzhbVar) {
        this.zzw += zzhbVar.zzg;
        this.zzx += zzhbVar.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final /* synthetic */ void zzp(zzlc zzlcVar, zzaf zzafVar, zzhc zzhcVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzq(zzlc zzlcVar, zzda zzdaVar) {
        zznj zznjVar = this.zzo;
        if (zznjVar != null) {
            zzaf zzafVar = zznjVar.zza;
            if (zzafVar.zzs == -1) {
                zzad zzb = zzafVar.zzb();
                zzb.zzX(zzdaVar.zzc);
                zzb.zzF(zzdaVar.zzd);
                this.zzo = new zznj(zzb.zzY(), 0, zznjVar.zzc);
            }
        }
    }
}
