package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdgi {
    private int zza;
    private com.google.android.gms.ads.internal.client.zzdq zzb;
    private zzbdp zzc;
    private View zzd;
    private List zze;
    private com.google.android.gms.ads.internal.client.zzel zzg;
    private Bundle zzh;
    private zzcei zzi;
    private zzcei zzj;
    private zzcei zzk;
    private IObjectWrapper zzl;
    private View zzm;
    private zzfut zzn;
    private View zzo;
    private IObjectWrapper zzp;
    private double zzq;
    private zzbdx zzr;
    private zzbdx zzs;
    private String zzt;
    private float zzw;
    private String zzx;
    private final SimpleArrayMap zzu = new SimpleArrayMap();
    private final SimpleArrayMap zzv = new SimpleArrayMap();
    private List zzf = Collections.emptyList();

    public static zzdgi zzad(zzbnq zzbnqVar) {
        try {
            zzdgh zzah = zzah(zzbnqVar.zzg(), null);
            zzbdp zzh = zzbnqVar.zzh();
            String zzo = zzbnqVar.zzo();
            List zzr = zzbnqVar.zzr();
            String zzm = zzbnqVar.zzm();
            Bundle zzf = zzbnqVar.zzf();
            String zzn = zzbnqVar.zzn();
            IObjectWrapper zzl = zzbnqVar.zzl();
            String zzq = zzbnqVar.zzq();
            String zzp = zzbnqVar.zzp();
            double zze = zzbnqVar.zze();
            zzbdx zzi = zzbnqVar.zzi();
            zzdgi zzdgiVar = new zzdgi();
            zzdgiVar.zza = 2;
            zzdgiVar.zzb = zzah;
            zzdgiVar.zzc = zzh;
            zzdgiVar.zzd = (View) zzaj(zzbnqVar.zzj());
            zzdgiVar.zzW("headline", zzo);
            zzdgiVar.zze = zzr;
            zzdgiVar.zzW("body", zzm);
            zzdgiVar.zzh = zzf;
            zzdgiVar.zzW("call_to_action", zzn);
            zzdgiVar.zzm = (View) zzaj(zzbnqVar.zzk());
            zzdgiVar.zzp = zzl;
            zzdgiVar.zzW("store", zzq);
            zzdgiVar.zzW(FirebaseAnalytics.Param.PRICE, zzp);
            zzdgiVar.zzq = zze;
            zzdgiVar.zzr = zzi;
            return zzdgiVar;
        } catch (RemoteException e) {
            zzbza.zzk("Failed to get native ad from app install ad mapper", e);
            return null;
        }
    }

    public static zzdgi zzae(zzbnr zzbnrVar) {
        try {
            zzdgh zzah = zzah(zzbnrVar.zzf(), null);
            zzbdp zzg = zzbnrVar.zzg();
            String zzo = zzbnrVar.zzo();
            List zzp = zzbnrVar.zzp();
            String zzm = zzbnrVar.zzm();
            Bundle zze = zzbnrVar.zze();
            String zzn = zzbnrVar.zzn();
            IObjectWrapper zzk = zzbnrVar.zzk();
            String zzl = zzbnrVar.zzl();
            zzbdx zzh = zzbnrVar.zzh();
            zzdgi zzdgiVar = new zzdgi();
            zzdgiVar.zza = 1;
            zzdgiVar.zzb = zzah;
            zzdgiVar.zzc = zzg;
            zzdgiVar.zzd = (View) zzaj(zzbnrVar.zzi());
            zzdgiVar.zzW("headline", zzo);
            zzdgiVar.zze = zzp;
            zzdgiVar.zzW("body", zzm);
            zzdgiVar.zzh = zze;
            zzdgiVar.zzW("call_to_action", zzn);
            zzdgiVar.zzm = (View) zzaj(zzbnrVar.zzj());
            zzdgiVar.zzp = zzk;
            zzdgiVar.zzW("advertiser", zzl);
            zzdgiVar.zzs = zzh;
            return zzdgiVar;
        } catch (RemoteException e) {
            zzbza.zzk("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    public static zzdgi zzaf(zzbnq zzbnqVar) {
        try {
            return zzai(zzah(zzbnqVar.zzg(), null), zzbnqVar.zzh(), (View) zzaj(zzbnqVar.zzj()), zzbnqVar.zzo(), zzbnqVar.zzr(), zzbnqVar.zzm(), zzbnqVar.zzf(), zzbnqVar.zzn(), (View) zzaj(zzbnqVar.zzk()), zzbnqVar.zzl(), zzbnqVar.zzq(), zzbnqVar.zzp(), zzbnqVar.zze(), zzbnqVar.zzi(), null, 0.0f);
        } catch (RemoteException e) {
            zzbza.zzk("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    public static zzdgi zzag(zzbnr zzbnrVar) {
        try {
            return zzai(zzah(zzbnrVar.zzf(), null), zzbnrVar.zzg(), (View) zzaj(zzbnrVar.zzi()), zzbnrVar.zzo(), zzbnrVar.zzp(), zzbnrVar.zzm(), zzbnrVar.zze(), zzbnrVar.zzn(), (View) zzaj(zzbnrVar.zzj()), zzbnrVar.zzk(), null, null, -1.0d, zzbnrVar.zzh(), zzbnrVar.zzl(), 0.0f);
        } catch (RemoteException e) {
            zzbza.zzk("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    private static zzdgh zzah(com.google.android.gms.ads.internal.client.zzdq zzdqVar, zzbnu zzbnuVar) {
        if (zzdqVar == null) {
            return null;
        }
        return new zzdgh(zzdqVar, zzbnuVar);
    }

    private static zzdgi zzai(com.google.android.gms.ads.internal.client.zzdq zzdqVar, zzbdp zzbdpVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d, zzbdx zzbdxVar, String str6, float f) {
        zzdgi zzdgiVar = new zzdgi();
        zzdgiVar.zza = 6;
        zzdgiVar.zzb = zzdqVar;
        zzdgiVar.zzc = zzbdpVar;
        zzdgiVar.zzd = view;
        zzdgiVar.zzW("headline", str);
        zzdgiVar.zze = list;
        zzdgiVar.zzW("body", str2);
        zzdgiVar.zzh = bundle;
        zzdgiVar.zzW("call_to_action", str3);
        zzdgiVar.zzm = view2;
        zzdgiVar.zzp = iObjectWrapper;
        zzdgiVar.zzW("store", str4);
        zzdgiVar.zzW(FirebaseAnalytics.Param.PRICE, str5);
        zzdgiVar.zzq = d;
        zzdgiVar.zzr = zzbdxVar;
        zzdgiVar.zzW("advertiser", str6);
        zzdgiVar.zzQ(f);
        return zzdgiVar;
    }

    private static Object zzaj(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.unwrap(iObjectWrapper);
    }

    public static zzdgi zzs(zzbnu zzbnuVar) {
        try {
            return zzai(zzah(zzbnuVar.zzj(), zzbnuVar), zzbnuVar.zzk(), (View) zzaj(zzbnuVar.zzm()), zzbnuVar.zzs(), zzbnuVar.zzv(), zzbnuVar.zzq(), zzbnuVar.zzi(), zzbnuVar.zzr(), (View) zzaj(zzbnuVar.zzn()), zzbnuVar.zzo(), zzbnuVar.zzu(), zzbnuVar.zzt(), zzbnuVar.zze(), zzbnuVar.zzl(), zzbnuVar.zzp(), zzbnuVar.zzf());
        } catch (RemoteException e) {
            zzbza.zzk("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    public final synchronized String zzA() {
        return zzE("headline");
    }

    public final synchronized String zzB() {
        return this.zzx;
    }

    public final synchronized String zzC() {
        return zzE(FirebaseAnalytics.Param.PRICE);
    }

    public final synchronized String zzD() {
        return zzE("store");
    }

    public final synchronized String zzE(String str) {
        return (String) this.zzv.get(str);
    }

    public final synchronized List zzF() {
        return this.zze;
    }

    public final synchronized List zzG() {
        return this.zzf;
    }

    public final synchronized void zzH() {
        zzcei zzceiVar = this.zzi;
        if (zzceiVar != null) {
            zzceiVar.destroy();
            this.zzi = null;
        }
        zzcei zzceiVar2 = this.zzj;
        if (zzceiVar2 != null) {
            zzceiVar2.destroy();
            this.zzj = null;
        }
        zzcei zzceiVar3 = this.zzk;
        if (zzceiVar3 != null) {
            zzceiVar3.destroy();
            this.zzk = null;
        }
        this.zzl = null;
        this.zzu.clear();
        this.zzv.clear();
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzh = null;
        this.zzm = null;
        this.zzo = null;
        this.zzp = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
    }

    public final synchronized void zzI(zzbdp zzbdpVar) {
        this.zzc = zzbdpVar;
    }

    public final synchronized void zzJ(String str) {
        this.zzt = str;
    }

    public final synchronized void zzK(com.google.android.gms.ads.internal.client.zzel zzelVar) {
        this.zzg = zzelVar;
    }

    public final synchronized void zzL(zzbdx zzbdxVar) {
        this.zzr = zzbdxVar;
    }

    public final synchronized void zzM(String str, zzbdj zzbdjVar) {
        if (zzbdjVar == null) {
            this.zzu.remove(str);
        } else {
            this.zzu.put(str, zzbdjVar);
        }
    }

    public final synchronized void zzN(zzcei zzceiVar) {
        this.zzj = zzceiVar;
    }

    public final synchronized void zzO(List list) {
        this.zze = list;
    }

    public final synchronized void zzP(zzbdx zzbdxVar) {
        this.zzs = zzbdxVar;
    }

    public final synchronized void zzQ(float f) {
        this.zzw = f;
    }

    public final synchronized void zzR(List list) {
        this.zzf = list;
    }

    public final synchronized void zzS(zzcei zzceiVar) {
        this.zzk = zzceiVar;
    }

    public final synchronized void zzT(zzfut zzfutVar) {
        this.zzn = zzfutVar;
    }

    public final synchronized void zzU(String str) {
        this.zzx = str;
    }

    public final synchronized void zzV(double d) {
        this.zzq = d;
    }

    public final synchronized void zzW(String str, String str2) {
        if (str2 == null) {
            this.zzv.remove(str);
        } else {
            this.zzv.put(str, str2);
        }
    }

    public final synchronized void zzX(int i) {
        this.zza = i;
    }

    public final synchronized void zzY(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.zzb = zzdqVar;
    }

    public final synchronized void zzZ(View view) {
        this.zzm = view;
    }

    public final synchronized double zza() {
        return this.zzq;
    }

    public final synchronized void zzaa(zzcei zzceiVar) {
        this.zzi = zzceiVar;
    }

    public final synchronized void zzab(View view) {
        this.zzo = view;
    }

    public final synchronized void zzac(IObjectWrapper iObjectWrapper) {
        this.zzl = iObjectWrapper;
    }

    public final synchronized float zzb() {
        return this.zzw;
    }

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized Bundle zzd() {
        if (this.zzh == null) {
            this.zzh = new Bundle();
        }
        return this.zzh;
    }

    public final synchronized View zze() {
        return this.zzd;
    }

    public final synchronized View zzf() {
        return this.zzm;
    }

    public final synchronized View zzg() {
        return this.zzo;
    }

    public final synchronized SimpleArrayMap zzh() {
        return this.zzu;
    }

    public final synchronized SimpleArrayMap zzi() {
        return this.zzv;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzdq zzj() {
        return this.zzb;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzel zzk() {
        return this.zzg;
    }

    public final synchronized zzbdp zzl() {
        return this.zzc;
    }

    public final zzbdx zzm() {
        List list = this.zze;
        if (list != null && !list.isEmpty()) {
            Object obj = this.zze.get(0);
            if (obj instanceof IBinder) {
                return zzbdw.zzg((IBinder) obj);
            }
        }
        return null;
    }

    public final synchronized zzbdx zzn() {
        return this.zzr;
    }

    public final synchronized zzbdx zzo() {
        return this.zzs;
    }

    public final synchronized zzcei zzp() {
        return this.zzj;
    }

    public final synchronized zzcei zzq() {
        return this.zzk;
    }

    public final synchronized zzcei zzr() {
        return this.zzi;
    }

    public final synchronized IObjectWrapper zzt() {
        return this.zzp;
    }

    public final synchronized IObjectWrapper zzu() {
        return this.zzl;
    }

    public final synchronized zzfut zzv() {
        return this.zzn;
    }

    public final synchronized String zzw() {
        return zzE("advertiser");
    }

    public final synchronized String zzx() {
        return zzE("body");
    }

    public final synchronized String zzy() {
        return zzE("call_to_action");
    }

    public final synchronized String zzz() {
        return this.zzt;
    }
}
