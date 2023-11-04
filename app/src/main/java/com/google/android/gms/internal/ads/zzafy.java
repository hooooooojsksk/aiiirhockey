package com.google.android.gms.internal.ads;

import androidx.core.view.ViewCompat;
import cz.msebera.android.httpclient.HttpHeaders;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzafy {
    static final String[] zza = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", HttpHeaders.TRAILER, "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};
    public static final /* synthetic */ int zzb = 0;

    public static zzbp zza(zzen zzenVar) {
        String str;
        int zzc = zzenVar.zzc() + zzenVar.zze();
        int zze = zzenVar.zze();
        int i = (zze >> 24) & 255;
        zzbp zzbpVar = null;
        try {
            if (i == 169 || i == 253) {
                int i2 = zze & ViewCompat.MEASURED_SIZE_MASK;
                if (i2 == 6516084) {
                    int zze2 = zzenVar.zze();
                    if (zzenVar.zze() == 1684108385) {
                        zzenVar.zzG(8);
                        String zzw = zzenVar.zzw(zze2 - 16);
                        zzbpVar = new zzadi("und", zzw, zzw);
                    } else {
                        zzee.zze("MetadataUtil", "Failed to parse comment attribute: ".concat(zzafj.zzf(zze)));
                    }
                    return zzbpVar;
                } else if (i2 == 7233901 || i2 == 7631467) {
                    return zze(zze, "TIT2", zzenVar);
                } else {
                    if (i2 == 6516589 || i2 == 7828084) {
                        return zze(zze, "TCOM", zzenVar);
                    }
                    if (i2 == 6578553) {
                        return zze(zze, "TDRC", zzenVar);
                    }
                    if (i2 == 4280916) {
                        return zze(zze, "TPE1", zzenVar);
                    }
                    if (i2 == 7630703) {
                        return zze(zze, "TSSE", zzenVar);
                    }
                    if (i2 == 6384738) {
                        return zze(zze, "TALB", zzenVar);
                    }
                    if (i2 == 7108978) {
                        return zze(zze, "USLT", zzenVar);
                    }
                    if (i2 == 6776174) {
                        return zze(zze, "TCON", zzenVar);
                    }
                    if (i2 == 6779504) {
                        return zze(zze, "TIT1", zzenVar);
                    }
                }
            } else if (zze == 1735291493) {
                int zzb2 = zzb(zzenVar);
                String str2 = (zzb2 <= 0 || zzb2 > 192) ? null : zza[zzb2 - 1];
                if (str2 != null) {
                    zzbpVar = new zzadx("TCON", null, zzfqk.zzp(str2));
                } else {
                    zzee.zze("MetadataUtil", "Failed to parse standard genre code");
                }
                return zzbpVar;
            } else if (zze == 1684632427) {
                return zzd(1684632427, "TPOS", zzenVar);
            } else {
                if (zze == 1953655662) {
                    return zzd(1953655662, "TRCK", zzenVar);
                }
                if (zze == 1953329263) {
                    return zzc(1953329263, "TBPM", zzenVar, true, false);
                }
                if (zze == 1668311404) {
                    return zzc(1668311404, "TCMP", zzenVar, true, true);
                }
                if (zze == 1668249202) {
                    int zze3 = zzenVar.zze();
                    if (zzenVar.zze() == 1684108385) {
                        int zze4 = zzenVar.zze() & ViewCompat.MEASURED_SIZE_MASK;
                        if (zze4 == 13) {
                            str = "image/jpeg";
                        } else if (zze4 == 14) {
                            str = "image/png";
                            zze4 = 14;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            zzee.zze("MetadataUtil", "Unrecognized cover art flags: " + zze4);
                        } else {
                            zzenVar.zzG(4);
                            int i3 = zze3 - 16;
                            byte[] bArr = new byte[i3];
                            zzenVar.zzB(bArr, 0, i3);
                            zzbpVar = new zzada(str, null, 3, bArr);
                        }
                    } else {
                        zzee.zze("MetadataUtil", "Failed to parse cover art attribute");
                    }
                    return zzbpVar;
                } else if (zze == 1631670868) {
                    return zze(1631670868, "TPE2", zzenVar);
                } else {
                    if (zze == 1936682605) {
                        return zze(1936682605, "TSOT", zzenVar);
                    }
                    if (zze == 1936679276) {
                        return zze(1936679276, "TSO2", zzenVar);
                    }
                    if (zze == 1936679282) {
                        return zze(1936679282, "TSOA", zzenVar);
                    }
                    if (zze == 1936679265) {
                        return zze(1936679265, "TSOP", zzenVar);
                    }
                    if (zze == 1936679791) {
                        return zze(1936679791, "TSOC", zzenVar);
                    }
                    if (zze == 1920233063) {
                        return zzc(1920233063, "ITUNESADVISORY", zzenVar, false, false);
                    }
                    if (zze == 1885823344) {
                        return zzc(1885823344, "ITUNESGAPLESS", zzenVar, false, true);
                    }
                    if (zze == 1936683886) {
                        return zze(1936683886, "TVSHOWSORT", zzenVar);
                    }
                    if (zze == 1953919848) {
                        return zze(1953919848, "TVSHOW", zzenVar);
                    }
                    if (zze == 757935405) {
                        String str3 = null;
                        String str4 = null;
                        int i4 = -1;
                        int i5 = -1;
                        while (zzenVar.zzc() < zzc) {
                            int zzc2 = zzenVar.zzc();
                            int zze5 = zzenVar.zze();
                            int zze6 = zzenVar.zze();
                            zzenVar.zzG(4);
                            if (zze6 == 1835360622) {
                                str3 = zzenVar.zzw(zze5 - 12);
                            } else if (zze6 == 1851878757) {
                                str4 = zzenVar.zzw(zze5 - 12);
                            } else {
                                if (zze6 == 1684108385) {
                                    i5 = zze5;
                                }
                                if (zze6 == 1684108385) {
                                    i4 = zzc2;
                                }
                                zzenVar.zzG(zze5 - 12);
                            }
                        }
                        if (str3 != null && str4 != null && i4 != -1) {
                            zzenVar.zzF(i4);
                            zzenVar.zzG(16);
                            zzbpVar = new zzadr(str3, str4, zzenVar.zzw(i5 - 16));
                        }
                        return zzbpVar;
                    }
                }
            }
            zzee.zza("MetadataUtil", "Skipped unknown metadata entry: " + zzafj.zzf(zze));
            return null;
        } finally {
            zzenVar.zzF(zzc);
        }
    }

    private static int zzb(zzen zzenVar) {
        zzenVar.zzG(4);
        if (zzenVar.zze() == 1684108385) {
            zzenVar.zzG(8);
            return zzenVar.zzk();
        }
        zzee.zze("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    private static zzadp zzc(int i, String str, zzen zzenVar, boolean z, boolean z2) {
        int zzb2 = zzb(zzenVar);
        if (z2) {
            zzb2 = Math.min(1, zzb2);
        }
        if (zzb2 < 0) {
            zzee.zze("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzafj.zzf(i)));
            return null;
        } else if (z) {
            return new zzadx(str, null, zzfqk.zzp(Integer.toString(zzb2)));
        } else {
            return new zzadi("und", str, Integer.toString(zzb2));
        }
    }

    private static zzadx zzd(int i, String str, zzen zzenVar) {
        int zze = zzenVar.zze();
        if (zzenVar.zze() == 1684108385 && zze >= 22) {
            zzenVar.zzG(10);
            int zzo = zzenVar.zzo();
            if (zzo > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(zzo);
                String sb2 = sb.toString();
                int zzo2 = zzenVar.zzo();
                if (zzo2 > 0) {
                    sb2 = sb2 + "/" + zzo2;
                }
                return new zzadx(str, null, zzfqk.zzp(sb2));
            }
        }
        zzee.zze("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzafj.zzf(i)));
        return null;
    }

    private static zzadx zze(int i, String str, zzen zzenVar) {
        int zze = zzenVar.zze();
        if (zzenVar.zze() == 1684108385) {
            zzenVar.zzG(8);
            return new zzadx(str, null, zzfqk.zzp(zzenVar.zzw(zze - 16)));
        }
        zzee.zze("MetadataUtil", "Failed to parse text attribute: ".concat(zzafj.zzf(i)));
        return null;
    }
}
