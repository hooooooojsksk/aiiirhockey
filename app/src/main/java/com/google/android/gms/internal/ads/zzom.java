package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import androidx.work.WorkRequest;
import java.lang.reflect.Method;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzom {
    private long zzA;
    private long zzB;
    private long zzC;
    private boolean zzD;
    private long zzE;
    private long zzF;
    private final zzol zza;
    private final long[] zzb;
    private AudioTrack zzc;
    private int zzd;
    private int zze;
    private zzok zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private float zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private Method zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private int zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    public zzom(zzol zzolVar) {
        this.zza = zzolVar;
        int i = zzew.zza;
        try {
            this.zzn = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzb = new long[10];
    }

    private final long zzl(long j) {
        return (j * 1000000) / this.zzg;
    }

    private final long zzm() {
        AudioTrack audioTrack = this.zzc;
        Objects.requireNonNull(audioTrack);
        if (this.zzx != -9223372036854775807L) {
            return Math.min(this.zzA, this.zzz + ((((SystemClock.elapsedRealtime() * 1000) - this.zzx) * this.zzg) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        long j = 0;
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (this.zzh) {
            if (playState == 2) {
                if (playbackHeadPosition == 0) {
                    this.zzu = this.zzs;
                }
                playState = 2;
            }
            playbackHeadPosition += this.zzu;
        }
        if (zzew.zza <= 29) {
            if (playbackHeadPosition != 0) {
                j = playbackHeadPosition;
            } else if (this.zzs > 0 && playState == 3) {
                if (this.zzy == -9223372036854775807L) {
                    this.zzy = SystemClock.elapsedRealtime();
                }
                return this.zzs;
            }
            this.zzy = -9223372036854775807L;
            playbackHeadPosition = j;
        }
        if (this.zzs > playbackHeadPosition) {
            this.zzt++;
        }
        this.zzs = playbackHeadPosition;
        return playbackHeadPosition + (this.zzt << 32);
    }

    private final void zzn() {
        this.zzl = 0L;
        this.zzw = 0;
        this.zzv = 0;
        this.zzm = 0L;
        this.zzC = 0L;
        this.zzF = 0L;
        this.zzk = false;
    }

    public final int zza(long j) {
        return this.zze - ((int) (j - (zzm() * this.zzd)));
    }

    public final long zzb(boolean z) {
        long j;
        zzof zzofVar;
        zzof zzofVar2;
        zzob zzobVar;
        Method method;
        long zzF;
        long zzG;
        long zzF2;
        long zzG2;
        zzom zzomVar = this;
        AudioTrack audioTrack = zzomVar.zzc;
        Objects.requireNonNull(audioTrack);
        if (audioTrack.getPlayState() == 3) {
            long zzl = zzomVar.zzl(zzm());
            if (zzl != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - zzomVar.zzm >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                    long[] jArr = zzomVar.zzb;
                    int i = zzomVar.zzv;
                    jArr[i] = zzl - nanoTime;
                    zzomVar.zzv = (i + 1) % 10;
                    int i2 = zzomVar.zzw;
                    if (i2 < 10) {
                        zzomVar.zzw = i2 + 1;
                    }
                    zzomVar.zzm = nanoTime;
                    zzomVar.zzl = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = zzomVar.zzw;
                        if (i3 >= i4) {
                            break;
                        }
                        zzomVar.zzl += zzomVar.zzb[i3] / i4;
                        i3++;
                    }
                }
                if (!zzomVar.zzh) {
                    zzok zzokVar = zzomVar.zzf;
                    Objects.requireNonNull(zzokVar);
                    if (zzokVar.zzg(nanoTime)) {
                        long zzb = zzokVar.zzb();
                        long zza = zzokVar.zza();
                        if (Math.abs(zzb - nanoTime) > 5000000) {
                            zzpa zzpaVar = (zzpa) zzomVar.zza;
                            zzF2 = zzpaVar.zza.zzF();
                            zzG2 = zzpaVar.zza.zzG();
                            zzee.zze("DefaultAudioSink", "Spurious audio timestamp (system clock mismatch): " + zza + ", " + zzb + ", " + nanoTime + ", " + zzl + ", " + zzF2 + ", " + zzG2);
                            zzokVar.zzd();
                        } else if (Math.abs(zzomVar.zzl(zza) - zzl) > 5000000) {
                            zzpa zzpaVar2 = (zzpa) zzomVar.zza;
                            zzF = zzpaVar2.zza.zzF();
                            zzG = zzpaVar2.zza.zzG();
                            zzee.zze("DefaultAudioSink", "Spurious audio timestamp (frame position mismatch): " + zza + ", " + zzb + ", " + nanoTime + ", " + zzl + ", " + zzF + ", " + zzG);
                            zzokVar.zzd();
                        } else {
                            zzokVar.zzc();
                        }
                        zzomVar = this;
                    }
                    if (zzomVar.zzq && (method = zzomVar.zzn) != null && nanoTime - zzomVar.zzr >= 500000) {
                        try {
                            AudioTrack audioTrack2 = zzomVar.zzc;
                            Objects.requireNonNull(audioTrack2);
                            int i5 = zzew.zza;
                            long intValue = ((Integer) method.invoke(audioTrack2, new Object[0])).intValue();
                            long j2 = zzomVar.zzi;
                            Long.signum(intValue);
                            long j3 = (intValue * 1000) - j2;
                            zzomVar.zzo = j3;
                            long max = Math.max(j3, 0L);
                            zzomVar.zzo = max;
                            if (max > 5000000) {
                                zzee.zze("DefaultAudioSink", "Ignoring impossibly large audio latency: " + max);
                                zzomVar.zzo = 0L;
                            }
                        } catch (Exception unused) {
                            zzomVar.zzn = null;
                        }
                        zzomVar.zzr = nanoTime;
                    }
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        zzok zzokVar2 = zzomVar.zzf;
        Objects.requireNonNull(zzokVar2);
        boolean zzf = zzokVar2.zzf();
        if (zzf) {
            j = zzomVar.zzl(zzokVar2.zza()) + zzew.zzs(nanoTime2 - zzokVar2.zzb(), zzomVar.zzj);
        } else {
            if (zzomVar.zzw == 0) {
                j = zzomVar.zzl(zzm());
            } else {
                j = zzomVar.zzl + nanoTime2;
            }
            if (!z) {
                j = Math.max(0L, j - zzomVar.zzo);
            }
        }
        if (zzomVar.zzD != zzf) {
            zzomVar.zzF = zzomVar.zzC;
            zzomVar.zzE = zzomVar.zzB;
        }
        long j4 = nanoTime2 - zzomVar.zzF;
        if (j4 < 1000000) {
            long j5 = (j4 * 1000) / 1000000;
            j = ((j * j5) + ((1000 - j5) * (zzomVar.zzE + zzew.zzs(j4, zzomVar.zzj)))) / 1000;
        }
        if (!zzomVar.zzk) {
            long j6 = zzomVar.zzB;
            if (j > j6) {
                zzomVar.zzk = true;
                int i6 = zzew.zza;
                long currentTimeMillis = System.currentTimeMillis() - zzew.zzz(zzew.zzu(zzew.zzz(j - j6), zzomVar.zzj));
                zzpf zzpfVar = ((zzpa) zzomVar.zza).zza;
                zzofVar = zzpfVar.zzq;
                if (zzofVar != null) {
                    zzofVar2 = zzpfVar.zzq;
                    zzobVar = ((zzpk) zzofVar2).zza.zzc;
                    zzobVar.zzr(currentTimeMillis);
                }
            }
        }
        zzomVar.zzC = nanoTime2;
        zzomVar.zzB = j;
        zzomVar.zzD = zzf;
        return j;
    }

    public final void zzc(long j) {
        this.zzz = zzm();
        this.zzx = SystemClock.elapsedRealtime() * 1000;
        this.zzA = j;
    }

    public final void zzd() {
        zzn();
        this.zzc = null;
        this.zzf = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zze(android.media.AudioTrack r4, boolean r5, int r6, int r7, int r8) {
        /*
            r3 = this;
            r3.zzc = r4
            r3.zzd = r7
            r3.zze = r8
            com.google.android.gms.internal.ads.zzok r0 = new com.google.android.gms.internal.ads.zzok
            r0.<init>(r4)
            r3.zzf = r0
            int r4 = r4.getSampleRate()
            r3.zzg = r4
            r4 = 6
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L25
            int r5 = com.google.android.gms.internal.ads.zzew.zza
            r2 = 23
            if (r5 >= r2) goto L25
            r5 = 5
            if (r6 == r5) goto L26
            if (r6 != r4) goto L25
            r6 = 6
            goto L26
        L25:
            r0 = 0
        L26:
            r3.zzh = r0
            boolean r4 = com.google.android.gms.internal.ads.zzew.zzW(r6)
            r3.zzq = r4
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L3c
            int r8 = r8 / r7
            long r7 = (long) r8
            long r7 = r3.zzl(r7)
            goto L3d
        L3c:
            r7 = r5
        L3d:
            r3.zzi = r7
            r7 = 0
            r3.zzs = r7
            r3.zzt = r7
            r3.zzu = r7
            r3.zzp = r1
            r3.zzx = r5
            r3.zzy = r5
            r3.zzr = r7
            r3.zzo = r7
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.zzj = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzom.zze(android.media.AudioTrack, boolean, int, int, int):void");
    }

    public final boolean zzg(long j) {
        if (j <= zzm()) {
            if (this.zzh) {
                AudioTrack audioTrack = this.zzc;
                Objects.requireNonNull(audioTrack);
                return audioTrack.getPlayState() == 2 && zzm() == 0;
            }
            return false;
        }
        return true;
    }

    public final boolean zzh() {
        AudioTrack audioTrack = this.zzc;
        Objects.requireNonNull(audioTrack);
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zzi(long j) {
        return this.zzy != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.zzy >= 200;
    }

    public final boolean zzj(long j) {
        zzof zzofVar;
        long j2;
        zzof zzofVar2;
        zzob zzobVar;
        AudioTrack audioTrack = this.zzc;
        Objects.requireNonNull(audioTrack);
        int playState = audioTrack.getPlayState();
        if (this.zzh) {
            if (playState == 2) {
                this.zzp = false;
                return false;
            } else if (playState == 1) {
                if (zzm() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z = this.zzp;
        boolean zzg = zzg(j);
        this.zzp = zzg;
        if (z && !zzg && playState != 1) {
            zzol zzolVar = this.zza;
            int i = this.zze;
            long zzz = zzew.zzz(this.zzi);
            zzpa zzpaVar = (zzpa) zzolVar;
            zzofVar = zzpaVar.zza.zzq;
            if (zzofVar != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                zzpf zzpfVar = zzpaVar.zza;
                j2 = zzpfVar.zzU;
                zzofVar2 = zzpfVar.zzq;
                zzobVar = ((zzpk) zzofVar2).zza.zzc;
                zzobVar.zzt(i, zzz, elapsedRealtime - j2);
            }
        }
        return true;
    }

    public final boolean zzk() {
        zzn();
        if (this.zzx == -9223372036854775807L) {
            zzok zzokVar = this.zzf;
            Objects.requireNonNull(zzokVar);
            zzokVar.zze();
            return true;
        }
        return false;
    }

    public final void zzf() {
        zzok zzokVar = this.zzf;
        Objects.requireNonNull(zzokVar);
        zzokVar.zze();
    }
}
