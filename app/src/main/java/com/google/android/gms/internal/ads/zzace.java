package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzace extends zzacg {
    private long zzb;
    private long[] zzc;
    private long[] zzd;

    public zzace() {
        super(new zzzt());
        this.zzb = -9223372036854775807L;
        this.zzc = new long[0];
        this.zzd = new long[0];
    }

    private static Double zzg(zzen zzenVar) {
        return Double.valueOf(Double.longBitsToDouble(zzenVar.zzr()));
    }

    private static String zzi(zzen zzenVar) {
        int zzo = zzenVar.zzo();
        int zzc = zzenVar.zzc();
        zzenVar.zzG(zzo);
        return new String(zzenVar.zzH(), zzc, zzo);
    }

    private static HashMap zzj(zzen zzenVar) {
        int zzn = zzenVar.zzn();
        HashMap hashMap = new HashMap(zzn);
        for (int i = 0; i < zzn; i++) {
            String zzi = zzi(zzenVar);
            Object zzh = zzh(zzenVar, zzenVar.zzk());
            if (zzh != null) {
                hashMap.put(zzi, zzh);
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzacg
    protected final boolean zza(zzen zzenVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzacg
    protected final boolean zzb(zzen zzenVar, long j) {
        if (zzenVar.zzk() == 2 && "onMetaData".equals(zzi(zzenVar)) && zzenVar.zza() != 0 && zzenVar.zzk() == 8) {
            HashMap zzj = zzj(zzenVar);
            Object obj = zzj.get("duration");
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue > 0.0d) {
                    this.zzb = (long) (doubleValue * 1000000.0d);
                }
            }
            Object obj2 = zzj.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.zzc = new long[size];
                    this.zzd = new long[size];
                    for (int i = 0; i < size; i++) {
                        Object obj5 = list.get(i);
                        Object obj6 = list2.get(i);
                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                            this.zzc = new long[0];
                            this.zzd = new long[0];
                            break;
                        }
                        this.zzc[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.zzd[i] = ((Double) obj5).longValue();
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final long zzc() {
        return this.zzb;
    }

    public final long[] zzd() {
        return this.zzd;
    }

    public final long[] zze() {
        return this.zzc;
    }

    private static Object zzh(zzen zzenVar, int i) {
        if (i == 0) {
            return zzg(zzenVar);
        }
        if (i == 1) {
            return Boolean.valueOf(zzenVar.zzk() == 1);
        } else if (i != 2) {
            if (i != 3) {
                if (i != 8) {
                    if (i != 10) {
                        if (i != 11) {
                            return null;
                        }
                        Date date = new Date((long) zzg(zzenVar).doubleValue());
                        zzenVar.zzG(2);
                        return date;
                    }
                    int zzn = zzenVar.zzn();
                    ArrayList arrayList = new ArrayList(zzn);
                    for (int i2 = 0; i2 < zzn; i2++) {
                        Object zzh = zzh(zzenVar, zzenVar.zzk());
                        if (zzh != null) {
                            arrayList.add(zzh);
                        }
                    }
                    return arrayList;
                }
                return zzj(zzenVar);
            }
            HashMap hashMap = new HashMap();
            while (true) {
                String zzi = zzi(zzenVar);
                int zzk = zzenVar.zzk();
                if (zzk == 9) {
                    return hashMap;
                }
                Object zzh2 = zzh(zzenVar, zzk);
                if (zzh2 != null) {
                    hashMap.put(zzi, zzh2);
                }
            }
        } else {
            return zzi(zzenVar);
        }
    }
}
