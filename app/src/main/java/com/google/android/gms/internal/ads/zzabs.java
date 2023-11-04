package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzabs implements zzabk {
    public final zzfqk zza;
    private final int zzb;

    private zzabs(int i, zzfqk zzfqkVar) {
        this.zzb = i;
        this.zza = zzfqkVar;
    }

    public static zzabs zzc(int i, zzen zzenVar) {
        String str;
        zzfqh zzfqhVar = new zzfqh();
        int zzd = zzenVar.zzd();
        int i2 = -2;
        while (zzenVar.zza() > 8) {
            int zzg = zzenVar.zzg();
            int zzc = zzenVar.zzc() + zzenVar.zzg();
            zzenVar.zzE(zzc);
            zzabk zzabkVar = null;
            if (zzg != 1414744396) {
                switch (zzg) {
                    case 1718776947:
                        if (i2 != 2) {
                            if (i2 == 1) {
                                int zzi = zzenVar.zzi();
                                String str2 = zzi != 1 ? zzi != 85 ? zzi != 255 ? zzi != 8192 ? zzi != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str2 == null) {
                                    zzee.zze("StreamFormatChunk", "Ignoring track with unsupported format tag " + zzi);
                                    break;
                                } else {
                                    int zzi2 = zzenVar.zzi();
                                    int zzg2 = zzenVar.zzg();
                                    zzenVar.zzG(6);
                                    int zzn = zzew.zzn(zzenVar.zzo());
                                    int zzi3 = zzenVar.zzi();
                                    byte[] bArr = new byte[zzi3];
                                    zzenVar.zzB(bArr, 0, zzi3);
                                    zzad zzadVar = new zzad();
                                    zzadVar.zzS(str2);
                                    zzadVar.zzw(zzi2);
                                    zzadVar.zzT(zzg2);
                                    if ("audio/raw".equals(str2) && zzn != 0) {
                                        zzadVar.zzN(zzn);
                                    }
                                    if ("audio/mp4a-latm".equals(str2) && zzi3 > 0) {
                                        zzadVar.zzI(zzfqk.zzp(bArr));
                                    }
                                    zzabkVar = new zzabt(zzadVar.zzY());
                                    break;
                                }
                            } else {
                                zzee.zze("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(zzew.zzO(i2)));
                                break;
                            }
                        } else {
                            zzenVar.zzG(4);
                            int zzg3 = zzenVar.zzg();
                            int zzg4 = zzenVar.zzg();
                            zzenVar.zzG(4);
                            int zzg5 = zzenVar.zzg();
                            switch (zzg5) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str == null) {
                                zzee.zze("StreamFormatChunk", "Ignoring track with unsupported compression " + zzg5);
                                break;
                            } else {
                                zzad zzadVar2 = new zzad();
                                zzadVar2.zzX(zzg3);
                                zzadVar2.zzF(zzg4);
                                zzadVar2.zzS(str);
                                zzabkVar = new zzabt(zzadVar2.zzY());
                                break;
                            }
                        }
                    case 1751742049:
                        zzabkVar = zzabp.zzb(zzenVar);
                        break;
                    case 1752331379:
                        zzabkVar = zzabq.zzb(zzenVar);
                        break;
                    case 1852994675:
                        zzabkVar = zzabu.zzb(zzenVar);
                        break;
                }
            } else {
                zzabkVar = zzc(zzenVar.zzg(), zzenVar);
            }
            if (zzabkVar != null) {
                if (zzabkVar.zza() == 1752331379) {
                    int i3 = ((zzabq) zzabkVar).zza;
                    if (i3 == 1935960438) {
                        i2 = 2;
                    } else if (i3 == 1935963489) {
                        i2 = 1;
                    } else if (i3 != 1937012852) {
                        zzee.zze("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i3))));
                        i2 = -1;
                    } else {
                        i2 = 3;
                    }
                }
                zzfqhVar.zzf(zzabkVar);
            }
            zzenVar.zzF(zzc);
            zzenVar.zzE(zzd);
        }
        return new zzabs(i, zzfqhVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzabk
    public final int zza() {
        return this.zzb;
    }

    public final zzabk zzb(Class cls) {
        zzfqk zzfqkVar = this.zza;
        int size = zzfqkVar.size();
        int i = 0;
        while (i < size) {
            zzabk zzabkVar = (zzabk) zzfqkVar.get(i);
            i++;
            if (zzabkVar.getClass() == cls) {
                return zzabkVar;
            }
        }
        return null;
    }
}
