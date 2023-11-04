package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzarm extends zzasm {
    private static final zzasn zzi = new zzasn();
    private final Context zzj;

    public zzarm(zzaqx zzaqxVar, String str, String str2, zzamv zzamvVar, int i, int i2, Context context, zzamo zzamoVar) {
        super(zzaqxVar, "zOES1C/X3KjGUl735PWTCIIeaiX8ogaBw1coqgLpdTjY6Symxbx5mbEMtlABs9zo", "hsHYBstzTMhc90xao/PTJuPT724yCZ6q03cV54fb+14=", zzamvVar, i, 27);
        this.zzj = context;
    }

    private final String zzc() {
        try {
            if (this.zzb.zzl() != null) {
                this.zzb.zzl().get();
            }
            zzans zzc = this.zzb.zzc();
            if (zzc == null || !zzc.zzaj()) {
                return null;
            }
            return zzc.zzh();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        Boolean bool;
        int i;
        zzaoi zzaoiVar;
        AtomicReference zza = zzi.zza(this.zzj.getPackageName());
        synchronized (zza) {
            zzaoi zzaoiVar2 = (zzaoi) zza.get();
            if (zzaoiVar2 == null || zzarb.zzg(zzaoiVar2.zza) || zzaoiVar2.zza.equals("E") || zzaoiVar2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (zzarb.zzg(null)) {
                    if (zzarb.zzg(null)) {
                        bool = false;
                    } else {
                        bool = false;
                    }
                    bool.booleanValue();
                    i = 3;
                } else {
                    i = 5;
                }
                Boolean valueOf = Boolean.valueOf(i == 3);
                Boolean bool2 = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzca);
                String zzb = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbZ)).booleanValue() ? zzb() : null;
                if (bool2.booleanValue() && this.zzb.zzp() && zzarb.zzg(zzb)) {
                    zzb = zzc();
                }
                zzaoi zzaoiVar3 = new zzaoi((String) this.zzf.invoke(null, this.zzj, valueOf, zzb));
                if (zzarb.zzg(zzaoiVar3.zza) || zzaoiVar3.zza.equals("E")) {
                    int i2 = i - 1;
                    if (i2 == 3) {
                        String zzc = zzc();
                        if (!zzarb.zzg(zzc)) {
                            zzaoiVar3.zza = zzc;
                        }
                    } else if (i2 == 4) {
                        throw null;
                    }
                }
                zza.set(zzaoiVar3);
            }
            zzaoiVar = (zzaoi) zza.get();
        }
        synchronized (this.zze) {
            if (zzaoiVar != null) {
                this.zze.zzx(zzaoiVar.zza);
                this.zze.zzX(zzaoiVar.zzb);
                this.zze.zzZ(zzaoiVar.zzc);
                this.zze.zzi(zzaoiVar.zzd);
                this.zze.zzw(zzaoiVar.zze);
            }
        }
    }

    protected final String zzb() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] zzi2 = zzarb.zzi((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcb));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzi2)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzarb.zzi((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcc)))));
            }
            Context context = this.zzj;
            String packageName = context.getPackageName();
            this.zzb.zzk();
            if (Build.VERSION.SDK_INT > 30 || Build.VERSION.CODENAME.equals("S")) {
                final zzfvc zzf = zzfvc.zzf();
                context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager.OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzaso
                    @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
                    public final void onChecksumsReady(List list) {
                        zzfvc zzfvcVar = zzfvc.this;
                        if (list == null) {
                            zzfvcVar.zzd(null);
                            return;
                        }
                        try {
                            int size = list.size();
                            for (int i = 0; i < size; i++) {
                                ApkChecksum apkChecksum = (ApkChecksum) list.get(i);
                                if (apkChecksum.getType() == 8) {
                                    zzfvcVar.zzd(zzarb.zzc(apkChecksum.getValue()));
                                    return;
                                }
                            }
                            zzfvcVar.zzd(null);
                        } catch (Throwable unused) {
                            zzfvcVar.zzd(null);
                        }
                    }
                });
                return (String) zzf.get();
            }
            return null;
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
