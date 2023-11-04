package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfjl {
    private static final Object zza = new Object();
    private final Context zzb;
    private final SharedPreferences zzc;
    private final String zzd;
    private final zzfis zze;
    private boolean zzf;

    public zzfjl(Context context, int i, zzfis zzfisVar, boolean z) {
        this.zzf = false;
        this.zzb = context;
        this.zzd = Integer.toString(i - 1);
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        this.zze = zzfisVar;
        this.zzf = z;
    }

    private final File zze(String str) {
        return new File(new File(this.zzb.getDir("pccache", 0), this.zzd), str);
    }

    private static String zzf(zzasr zzasrVar) {
        zzast zze = zzasu.zze();
        zze.zze(zzasrVar.zzd().zzk());
        zze.zza(zzasrVar.zzd().zzj());
        zze.zzb(zzasrVar.zzd().zza());
        zze.zzd(zzasrVar.zzd().zzd());
        zze.zzc(zzasrVar.zzd().zzc());
        return Hex.bytesToStringLowercase(((zzasu) zze.zzal()).zzax());
    }

    private final String zzg() {
        return "FBAMTD".concat(String.valueOf(this.zzd));
    }

    private final String zzh() {
        return "LATMTD".concat(String.valueOf(this.zzd));
    }

    private final void zzi(int i, long j) {
        zzfis zzfisVar = this.zze;
        if (zzfisVar != null) {
            zzfisVar.zza(i, j);
        }
    }

    private final void zzj(int i, long j, String str) {
        zzfis zzfisVar = this.zze;
        if (zzfisVar != null) {
            zzfisVar.zzb(i, j, str);
        }
    }

    private final zzasu zzk(int i) {
        String string;
        zzgpy zzb;
        if (i == 1) {
            string = this.zzc.getString(zzh(), null);
        } else {
            string = this.zzc.getString(zzg(), null);
        }
        if (string == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            zzgpe zzv = zzgpe.zzv(Hex.stringToBytes(string));
            if (this.zzf) {
                zzb = zzgpy.zza();
            } else {
                zzb = zzgpy.zzb();
            }
            return zzasu.zzi(zzv, zzb);
        } catch (zzgqy unused) {
            return null;
        } catch (NullPointerException unused2) {
            zzi(2029, currentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            zzi(2032, currentTimeMillis);
            return null;
        }
    }

    public final boolean zza(zzasr zzasrVar) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            if (!zzfjf.zze(new File(zze(zzasrVar.zzd().zzk()), "pcbc"), zzasrVar.zze().zzE())) {
                zzi(4020, currentTimeMillis);
                return false;
            }
            String zzf = zzf(zzasrVar);
            SharedPreferences.Editor edit = this.zzc.edit();
            edit.putString(zzh(), zzf);
            boolean commit = edit.commit();
            if (commit) {
                zzi(5015, currentTimeMillis);
            } else {
                zzi(4021, currentTimeMillis);
            }
            return commit;
        }
    }

    public final boolean zzb(zzasr zzasrVar, zzfjk zzfjkVar) {
        File[] listFiles;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            zzasu zzk = zzk(1);
            String zzk2 = zzasrVar.zzd().zzk();
            if (zzk == null || !zzk.zzk().equals(zzk2)) {
                long currentTimeMillis2 = System.currentTimeMillis();
                File zze = zze(zzk2);
                if (zze.exists()) {
                    zzj(4023, currentTimeMillis2, "d:" + (true != zze.isDirectory() ? "0" : "1") + ",f:" + (true != zze.isFile() ? "0" : "1"));
                    zzi(4015, currentTimeMillis2);
                } else if (!zze.mkdirs()) {
                    zzj(4024, currentTimeMillis2, "cw:".concat(true != zze.canWrite() ? "0" : "1"));
                    zzi(4015, currentTimeMillis2);
                    return false;
                }
                File zze2 = zze(zzk2);
                File file = new File(zze2, "pcam.jar");
                File file2 = new File(zze2, "pcbc");
                if (!zzfjf.zze(file, zzasrVar.zzf().zzE())) {
                    zzi(4016, currentTimeMillis);
                    return false;
                } else if (!zzfjf.zze(file2, zzasrVar.zze().zzE())) {
                    zzi(4017, currentTimeMillis);
                    return false;
                } else if (zzfjkVar == null || zzfjkVar.zza(file)) {
                    String zzf = zzf(zzasrVar);
                    long currentTimeMillis3 = System.currentTimeMillis();
                    String string = this.zzc.getString(zzh(), null);
                    SharedPreferences.Editor edit = this.zzc.edit();
                    edit.putString(zzh(), zzf);
                    if (string != null) {
                        edit.putString(zzg(), string);
                    }
                    if (edit.commit()) {
                        HashSet hashSet = new HashSet();
                        zzasu zzk3 = zzk(1);
                        if (zzk3 != null) {
                            hashSet.add(zzk3.zzk());
                        }
                        zzasu zzk4 = zzk(2);
                        if (zzk4 != null) {
                            hashSet.add(zzk4.zzk());
                        }
                        for (File file3 : new File(this.zzb.getDir("pccache", 0), this.zzd).listFiles()) {
                            if (!hashSet.contains(file3.getName())) {
                                zzfjf.zzd(file3);
                            }
                        }
                        zzi(5014, currentTimeMillis);
                        return true;
                    }
                    zzi(4019, currentTimeMillis3);
                    return false;
                } else {
                    zzi(4018, currentTimeMillis);
                    zzfjf.zzd(zze2);
                    return false;
                }
            }
            zzi(4014, currentTimeMillis);
            return false;
        }
    }

    public final zzfjd zzc(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            zzasu zzk = zzk(1);
            if (zzk == null) {
                zzi(4022, currentTimeMillis);
                return null;
            }
            File zze = zze(zzk.zzk());
            File file = new File(zze, "pcam.jar");
            if (!file.exists()) {
                file = new File(zze, "pcam");
            }
            File file2 = new File(zze, "pcbc");
            File file3 = new File(zze, "pcopt");
            zzi(5016, currentTimeMillis);
            return new zzfjd(zzk, file, file2, file3);
        }
    }

    public final boolean zzd(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            zzasu zzk = zzk(1);
            if (zzk == null) {
                zzi(4025, currentTimeMillis);
                return false;
            }
            File zze = zze(zzk.zzk());
            if (!new File(zze, "pcam.jar").exists()) {
                zzi(4026, currentTimeMillis);
                return false;
            } else if (!new File(zze, "pcbc").exists()) {
                zzi(4027, currentTimeMillis);
                return false;
            } else {
                zzi(5019, currentTimeMillis);
                return true;
            }
        }
    }
}
