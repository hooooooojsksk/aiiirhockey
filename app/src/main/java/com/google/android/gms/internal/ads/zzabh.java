package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzabh {
    public static int zza(int i) {
        int i2 = 0;
        while (i > 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    public static zzbq zzb(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String[] zzai = zzew.zzai(str, "=");
            if (zzai.length != 2) {
                zzee.zze("VorbisUtil", "Failed to parse Vorbis comment: ".concat(String.valueOf(str)));
            } else if (zzai[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzacu.zzb(new zzen(Base64.decode(zzai[1], 0))));
                } catch (RuntimeException e) {
                    zzee.zzf("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new zzaek(zzai[0], zzai[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzbq(arrayList);
    }

    public static zzabe zzc(zzen zzenVar, boolean z, boolean z2) throws zzbu {
        if (z) {
            zzd(3, zzenVar, false);
        }
        String zzx = zzenVar.zzx((int) zzenVar.zzq(), zzfnh.zzc);
        int length = zzx.length();
        long zzq = zzenVar.zzq();
        String[] strArr = new String[(int) zzq];
        int i = length + 15;
        for (int i2 = 0; i2 < zzq; i2++) {
            String zzx2 = zzenVar.zzx((int) zzenVar.zzq(), zzfnh.zzc);
            strArr[i2] = zzx2;
            i = i + 4 + zzx2.length();
        }
        if (z2 && (zzenVar.zzk() & 1) == 0) {
            throw zzbu.zza("framing bit expected to be set", null);
        }
        return new zzabe(zzx, strArr, i + 1);
    }

    public static boolean zzd(int i, zzen zzenVar, boolean z) throws zzbu {
        if (zzenVar.zza() < 7) {
            if (z) {
                return false;
            }
            int zza = zzenVar.zza();
            throw zzbu.zza("too short header: " + zza, null);
        } else if (zzenVar.zzk() != i) {
            if (z) {
                return false;
            }
            throw zzbu.zza("expected header type ".concat(String.valueOf(Integer.toHexString(i))), null);
        } else if (zzenVar.zzk() == 118 && zzenVar.zzk() == 111 && zzenVar.zzk() == 114 && zzenVar.zzk() == 98 && zzenVar.zzk() == 105 && zzenVar.zzk() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw zzbu.zza("expected characters 'vorbis'", null);
        }
    }
}
