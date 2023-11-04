package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzqx {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    private final boolean zzh;

    public static zzqx zzc(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        if (codecCapabilities != null) {
            int i = zzew.zza;
            if (codecCapabilities.isFeatureSupported("adaptive-playback") && (zzew.zza > 22 || ((!"ODROID-XU3".equals(zzew.zzd) && !"Nexus 10".equals(zzew.zzd)) || (!"OMX.Exynos.AVC.Decoder".equals(str) && !"OMX.Exynos.AVC.Decoder.secure".equals(str))))) {
                z6 = true;
                return new zzqx(str, str2, str3, codecCapabilities, z, z2, z3, z6, codecCapabilities == null && zzew.zza >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback"), !z5 || (codecCapabilities != null && zzew.zza >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
            }
        }
        z6 = false;
        return new zzqx(str, str2, str3, codecCapabilities, z, z2, z3, z6, codecCapabilities == null && zzew.zza >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback"), !z5 || (codecCapabilities != null && zzew.zza >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
    }

    private static Point zzi(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(zzew.zze(i, widthAlignment) * widthAlignment, zzew.zze(i2, heightAlignment) * heightAlignment);
    }

    private final void zzj(String str) {
        String str2 = this.zza;
        String str3 = this.zzb;
        String str4 = zzew.zze;
        zzee.zza("MediaCodecInfo", "NoSupport [" + str + "] [" + str2 + ", " + str3 + "] [" + str4 + "]");
    }

    private static boolean zzk(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point zzi = zzi(videoCapabilities, i, i2);
        int i3 = zzi.x;
        int i4 = zzi.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    private final boolean zzl(zzaf zzafVar, boolean z) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair zzb = zzrp.zzb(zzafVar);
        if (zzb == null) {
            return true;
        }
        int intValue = ((Integer) zzb.first).intValue();
        int intValue2 = ((Integer) zzb.second).intValue();
        int i = 8;
        if ("video/dolby-vision".equals(zzafVar.zzm)) {
            if ("video/avc".equals(this.zzb)) {
                intValue2 = 0;
                intValue = 8;
            } else if ("video/hevc".equals(this.zzb)) {
                intValue2 = 0;
                intValue = 2;
            }
        }
        if (this.zzh || intValue == 42) {
            MediaCodecInfo.CodecProfileLevel[] zzh = zzh();
            if (zzew.zza <= 23 && "video/x-vnd.on2.vp9".equals(this.zzb) && zzh.length == 0) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
                int intValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
                if (intValue3 >= 180000000) {
                    i = 1024;
                } else if (intValue3 >= 120000000) {
                    i = 512;
                } else if (intValue3 >= 60000000) {
                    i = 256;
                } else if (intValue3 >= 30000000) {
                    i = 128;
                } else if (intValue3 >= 18000000) {
                    i = 64;
                } else if (intValue3 >= 12000000) {
                    i = 32;
                } else if (intValue3 >= 7200000) {
                    i = 16;
                } else if (intValue3 < 3600000) {
                    i = intValue3 >= 1800000 ? 4 : intValue3 >= 800000 ? 2 : 1;
                }
                MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                codecProfileLevel.profile = 1;
                codecProfileLevel.level = i;
                zzh = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : zzh) {
                if (codecProfileLevel2.profile == intValue && ((codecProfileLevel2.level >= intValue2 || !z) && (!"video/hevc".equals(this.zzb) || intValue != 2 || (!"sailfish".equals(zzew.zzb) && !"marlin".equals(zzew.zzb))))) {
                    return true;
                }
            }
            zzj("codec.profileLevel, " + zzafVar.zzj + ", " + this.zzc);
            return false;
        }
        return true;
    }

    private final boolean zzm(zzaf zzafVar) {
        return this.zzb.equals(zzafVar.zzm) || this.zzb.equals(zzrp.zze(zzafVar));
    }

    public final String toString() {
        return this.zza;
    }

    public final Point zza(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzi(videoCapabilities, i, i2);
    }

    public final zzhc zzb(zzaf zzafVar, zzaf zzafVar2) {
        int i = true != zzew.zzU(zzafVar.zzm, zzafVar2.zzm) ? 8 : 0;
        if (this.zzh) {
            if (zzafVar.zzu != zzafVar2.zzu) {
                i |= 1024;
            }
            if (!this.zze && (zzafVar.zzr != zzafVar2.zzr || zzafVar.zzs != zzafVar2.zzs)) {
                i |= 512;
            }
            if (!zzew.zzU(zzafVar.zzy, zzafVar2.zzy)) {
                i |= 2048;
            }
            String str = this.zza;
            if (zzew.zzd.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !zzafVar.zze(zzafVar2)) {
                i |= 2;
            }
            if (i == 0) {
                return new zzhc(this.zza, zzafVar, zzafVar2, true != zzafVar.zze(zzafVar2) ? 2 : 3, 0);
            }
        } else {
            if (zzafVar.zzz != zzafVar2.zzz) {
                i |= 4096;
            }
            if (zzafVar.zzA != zzafVar2.zzA) {
                i |= 8192;
            }
            if (zzafVar.zzB != zzafVar2.zzB) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.zzb)) {
                Pair zzb = zzrp.zzb(zzafVar);
                Pair zzb2 = zzrp.zzb(zzafVar2);
                if (zzb != null && zzb2 != null) {
                    int intValue = ((Integer) zzb.first).intValue();
                    int intValue2 = ((Integer) zzb2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new zzhc(this.zza, zzafVar, zzafVar2, 3, 0);
                    }
                }
            }
            if (!zzafVar.zze(zzafVar2)) {
                i |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i |= 2;
            }
            if (i == 0) {
                return new zzhc(this.zza, zzafVar, zzafVar2, 1, 0);
            }
        }
        return new zzhc(this.zza, zzafVar, zzafVar2, 0, i);
    }

    public final boolean zzd(zzaf zzafVar) {
        return zzm(zzafVar) && zzl(zzafVar, false);
    }

    public final boolean zze(zzaf zzafVar) throws zzrj {
        int i;
        if (zzm(zzafVar) && zzl(zzafVar, true)) {
            if (this.zzh) {
                if (zzafVar.zzr <= 0 || zzafVar.zzs <= 0) {
                    return true;
                }
                if (zzew.zza >= 21) {
                    return zzg(zzafVar.zzr, zzafVar.zzs, zzafVar.zzt);
                }
                boolean z = zzafVar.zzr * zzafVar.zzs <= zzrp.zza();
                if (!z) {
                    int i2 = zzafVar.zzr;
                    int i3 = zzafVar.zzs;
                    zzj("legacyFrameSize, " + i2 + "x" + i3);
                }
                return z;
            }
            if (zzew.zza >= 21) {
                int i4 = zzafVar.zzA;
                if (i4 != -1) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
                    if (codecCapabilities == null) {
                        zzj("sampleRate.caps");
                        return false;
                    }
                    MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities == null) {
                        zzj("sampleRate.aCaps");
                        return false;
                    } else if (!audioCapabilities.isSampleRateSupported(i4)) {
                        zzj("sampleRate.support, " + i4);
                        return false;
                    }
                }
                int i5 = zzafVar.zzz;
                if (i5 != -1) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
                    if (codecCapabilities2 == null) {
                        zzj("channelCount.caps");
                    } else {
                        MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
                        if (audioCapabilities2 == null) {
                            zzj("channelCount.aCaps");
                        } else {
                            String str = this.zza;
                            String str2 = this.zzb;
                            int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                            if (maxInputChannelCount <= 1 && ((zzew.zza < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                                if ("audio/ac3".equals(str2)) {
                                    i = 6;
                                } else {
                                    i = "audio/eac3".equals(str2) ? 16 : 30;
                                }
                                zzee.zze("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i + "]");
                                maxInputChannelCount = i;
                            }
                            if (maxInputChannelCount < i5) {
                                zzj("channelCount.support, " + i5);
                            }
                        }
                    }
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean zzf(zzaf zzafVar) {
        if (this.zzh) {
            return this.zze;
        }
        Pair zzb = zzrp.zzb(zzafVar);
        return zzb != null && ((Integer) zzb.first).intValue() == 42;
    }

    public final boolean zzg(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null) {
            zzj("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzj("sizeAndRate.vCaps");
            return false;
        }
        if (zzew.zza >= 29) {
            int zza = zzqw.zza(videoCapabilities, i, i2, d);
            if (zza == 2) {
                return true;
            }
            if (zza == 1) {
                zzj("sizeAndRate.cover, " + i + "x" + i2 + "@" + d);
                return false;
            }
        }
        if (!zzk(videoCapabilities, i, i2, d)) {
            if (i < i2 && ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(this.zza) || !"mcv5a".equals(zzew.zzb)) && zzk(videoCapabilities, i2, i, d))) {
                zzee.zza("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i + "x" + i2 + "@" + d) + "] [" + this.zza + ", " + this.zzb + "] [" + zzew.zze + "]");
            } else {
                zzj("sizeAndRate.support, " + i + "x" + i2 + "@" + d);
                return false;
            }
        }
        return true;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzh() {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || codecCapabilities.profileLevels == null) ? new MediaCodecInfo.CodecProfileLevel[0] : this.zzd.profileLevels;
    }

    zzqx(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Objects.requireNonNull(str);
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z;
        this.zze = z4;
        this.zzf = z6;
        this.zzh = zzbt.zzh(str2);
    }
}
