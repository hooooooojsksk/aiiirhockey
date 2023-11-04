package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzahk implements zzaiy {
    private final List zza;

    public zzahk() {
        this(0);
    }

    public zzahk(int i, List list) {
        this.zza = list;
    }

    private final zzaio zzb(zzaix zzaixVar) {
        return new zzaio(zzd(zzaixVar));
    }

    private final zzajc zzc(zzaix zzaixVar) {
        return new zzajc(zzd(zzaixVar));
    }

    private final List zzd(zzaix zzaixVar) {
        String str;
        int i;
        List list;
        zzen zzenVar = new zzen(zzaixVar.zzd);
        List list2 = this.zza;
        while (zzenVar.zza() > 0) {
            int zzk = zzenVar.zzk();
            int zzc = zzenVar.zzc() + zzenVar.zzk();
            if (zzk == 134) {
                list2 = new ArrayList();
                int zzk2 = zzenVar.zzk() & 31;
                for (int i2 = 0; i2 < zzk2; i2++) {
                    String zzx = zzenVar.zzx(3, zzfnh.zzc);
                    int zzk3 = zzenVar.zzk();
                    boolean z = (zzk3 & 128) != 0;
                    if (z) {
                        i = zzk3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte zzk4 = (byte) zzenVar.zzk();
                    zzenVar.zzG(1);
                    if (z) {
                        int i3 = zzk4 & 64;
                        int i4 = zzdn.zza;
                        list = Collections.singletonList(i3 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    zzad zzadVar = new zzad();
                    zzadVar.zzS(str);
                    zzadVar.zzK(zzx);
                    zzadVar.zzu(i);
                    zzadVar.zzI(list);
                    list2.add(zzadVar.zzY());
                }
            }
            zzenVar.zzF(zzc);
        }
        return list2;
    }

    @Override // com.google.android.gms.internal.ads.zzaiy
    public final zzaja zza(int i, zzaix zzaixVar) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new zzaie(new zzaib(zzaixVar.zzb));
            }
            if (i == 21) {
                return new zzaie(new zzahz());
            }
            if (i == 27) {
                return new zzaie(new zzahw(zzb(zzaixVar), false, false));
            }
            if (i == 36) {
                return new zzaie(new zzahy(zzb(zzaixVar)));
            }
            if (i == 89) {
                return new zzaie(new zzahm(zzaixVar.zzc));
            }
            if (i == 138) {
                return new zzaie(new zzahl(zzaixVar.zzb));
            }
            if (i == 172) {
                return new zzaie(new zzahg(zzaixVar.zzb));
            }
            if (i == 257) {
                return new zzain(new zzaid("application/vnd.dvb.ait"));
            }
            if (i != 128) {
                if (i != 129) {
                    if (i == 134) {
                        return new zzain(new zzaid("application/x-scte35"));
                    }
                    if (i != 135) {
                        switch (i) {
                            case 15:
                                return new zzaie(new zzahj(false, zzaixVar.zzb));
                            case 16:
                                return new zzaie(new zzahs(zzc(zzaixVar)));
                            case 17:
                                return new zzaie(new zzaia(zzaixVar.zzb));
                            default:
                                return null;
                        }
                    }
                }
                return new zzaie(new zzahd(zzaixVar.zzb));
            }
        }
        return new zzaie(new zzahp(zzc(zzaixVar)));
    }

    public zzahk(int i) {
        this.zza = zzfqk.zzo();
    }
}
