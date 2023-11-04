package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.collection.ArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdgd extends zzcqm {
    public static final zzfqk zzc = zzfqk.zzt("3010", "3008", "1005", "1009", "2011", "2007");
    private final zzath zzA;
    private zzfvc zzB;
    private final Executor zzd;
    private final zzdgi zze;
    private final zzdgq zzf;
    private final zzdhi zzg;
    private final zzdgn zzh;
    private final zzdgt zzi;
    private final zzgws zzj;
    private final zzgws zzk;
    private final zzgws zzl;
    private final zzgws zzm;
    private final zzgws zzn;
    private zzdie zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private final zzbwn zzs;
    private final zzapw zzt;
    private final zzbzg zzu;
    private final Context zzv;
    private final zzdgf zzw;
    private final zzeie zzx;
    private final Map zzy;
    private final List zzz;

    public zzdgd(zzcql zzcqlVar, Executor executor, zzdgi zzdgiVar, zzdgq zzdgqVar, zzdhi zzdhiVar, zzdgn zzdgnVar, zzdgt zzdgtVar, zzgws zzgwsVar, zzgws zzgwsVar2, zzgws zzgwsVar3, zzgws zzgwsVar4, zzgws zzgwsVar5, zzbwn zzbwnVar, zzapw zzapwVar, zzbzg zzbzgVar, Context context, zzdgf zzdgfVar, zzeie zzeieVar, zzath zzathVar) {
        super(zzcqlVar);
        this.zzd = executor;
        this.zze = zzdgiVar;
        this.zzf = zzdgqVar;
        this.zzg = zzdhiVar;
        this.zzh = zzdgnVar;
        this.zzi = zzdgtVar;
        this.zzj = zzgwsVar;
        this.zzk = zzgwsVar2;
        this.zzl = zzgwsVar3;
        this.zzm = zzgwsVar4;
        this.zzn = zzgwsVar5;
        this.zzs = zzbwnVar;
        this.zzt = zzapwVar;
        this.zzu = zzbzgVar;
        this.zzv = context;
        this.zzw = zzdgfVar;
        this.zzx = zzeieVar;
        this.zzy = new HashMap();
        this.zzz = new ArrayList();
        this.zzA = zzathVar;
    }

    public static boolean zzW(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziX)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        long zzs = com.google.android.gms.ads.internal.util.zzs.zzs(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), null)) {
            if (zzs >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziY)).intValue()) {
                return true;
            }
        }
        return false;
    }

    private final synchronized View zzY(Map map) {
        if (map == null) {
            return null;
        }
        zzfqk zzfqkVar = zzc;
        int size = zzfqkVar.size();
        int i = 0;
        while (i < size) {
            WeakReference weakReference = (WeakReference) map.get((String) zzfqkVar.get(i));
            i++;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
        }
        return null;
    }

    private final synchronized ImageView.ScaleType zzZ() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhp)).booleanValue()) {
            zzdie zzdieVar = this.zzo;
            if (zzdieVar == null) {
                zzbza.zze("Ad should be associated with an ad view before calling getMediaviewScaleType()");
                return null;
            }
            IObjectWrapper zzj = zzdieVar.zzj();
            if (zzj != null) {
                return (ImageView.ScaleType) ObjectWrapper.unwrap(zzj);
            }
            return zzdhi.zza;
        }
        return null;
    }

    private final void zzaa(String str, boolean z) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeI)).booleanValue()) {
            zzt("Google", true);
            return;
        }
        zzfut zzv = this.zze.zzv();
        if (zzv == null) {
            return;
        }
        this.zzB = zzfvc.zzf();
        zzfuj.zzq(zzv, new zzdgc(this, "Google", true), this.zzd);
    }

    private final synchronized void zzab(View view, Map map, Map map2) {
        this.zzg.zzd(this.zzo);
        this.zzf.zzq(view, map, map2, zzZ());
        this.zzq = true;
    }

    private final void zzac(View view, IObjectWrapper iObjectWrapper) {
        zzcei zzq = this.zze.zzq();
        if (!this.zzh.zzd() || iObjectWrapper == null || zzq == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzA().zzc(iObjectWrapper, view);
    }

    /* renamed from: zzad */
    public final synchronized void zzy(zzdie zzdieVar) {
        Iterator<String> keys;
        View view;
        zzaps zzc2;
        if (this.zzp) {
            return;
        }
        this.zzo = zzdieVar;
        this.zzg.zze(zzdieVar);
        this.zzf.zzy(zzdieVar.zzf(), zzdieVar.zzm(), zzdieVar.zzn(), zzdieVar, zzdieVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcj)).booleanValue() && (zzc2 = this.zzt.zzc()) != null) {
            zzc2.zzo(zzdieVar.zzf());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbB)).booleanValue()) {
            zzeyc zzeycVar = this.zzb;
            if (zzeycVar.zzal && (keys = zzeycVar.zzak.keys()) != null) {
                while (keys.hasNext()) {
                    String next = keys.next();
                    WeakReference weakReference = (WeakReference) this.zzo.zzl().get(next);
                    this.zzy.put(next, false);
                    if (weakReference != null && (view = (View) weakReference.get()) != null) {
                        zzatg zzatgVar = new zzatg(this.zzv, view);
                        this.zzz.add(zzatgVar);
                        zzatgVar.zzc(new zzdgb(this, next));
                    }
                }
            }
        }
        if (zzdieVar.zzi() != null) {
            zzdieVar.zzi().zzc(this.zzs);
        }
    }

    /* renamed from: zzae */
    public final void zzz(zzdie zzdieVar) {
        this.zzf.zzz(zzdieVar.zzf(), zzdieVar.zzl());
        if (zzdieVar.zzh() != null) {
            zzdieVar.zzh().setClickable(false);
            zzdieVar.zzh().removeAllViews();
        }
        if (zzdieVar.zzi() != null) {
            zzdieVar.zzi().zze(this.zzs);
        }
        this.zzo = null;
    }

    public final synchronized void zzA(View view, Map map, Map map2, boolean z) {
        if (this.zzq) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbB)).booleanValue() && this.zzb.zzal) {
            for (String str : this.zzy.keySet()) {
                if (!((Boolean) this.zzy.get(str)).booleanValue()) {
                    return;
                }
            }
        }
        if (!z) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdu)).booleanValue() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    View view2 = (View) ((WeakReference) entry.getValue()).get();
                    if (view2 != null && zzW(view2)) {
                        zzab(view, map, map2);
                        return;
                    }
                }
            }
            return;
        }
        View zzY = zzY(map);
        if (zzY == null) {
            zzab(view, map, map2);
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdv)).booleanValue()) {
            if (zzW(zzY)) {
                zzab(view, map, map2);
                return;
            }
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdw)).booleanValue()) {
            Rect rect = new Rect();
            if (zzY.getGlobalVisibleRect(rect, null) && zzY.getHeight() == rect.height() && zzY.getWidth() == rect.width()) {
                zzab(view, map, map2);
                return;
            }
            return;
        }
        zzab(view, map, map2);
    }

    public final synchronized void zzB(com.google.android.gms.ads.internal.client.zzcw zzcwVar) {
        this.zzf.zzj(zzcwVar);
    }

    public final synchronized void zzC(View view, View view2, Map map, Map map2, boolean z) {
        this.zzg.zzc(this.zzo);
        this.zzf.zzk(view, view2, map, map2, z, zzZ());
        if (this.zzr) {
            zzdgi zzdgiVar = this.zze;
            if (zzdgiVar.zzr() != null) {
                zzdgiVar.zzr().zzd("onSdkAdUserInteractionClick", new ArrayMap());
            }
        }
    }

    public final synchronized void zzD(final View view, final int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjF)).booleanValue()) {
            zzdie zzdieVar = this.zzo;
            if (zzdieVar == null) {
                zzbza.zze("Ad should be associated with an ad view before calling performClickForCustomGesture()");
                return;
            }
            final boolean z = zzdieVar instanceof zzdhc;
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdft
                @Override // java.lang.Runnable
                public final void run() {
                    zzdgd.this.zzv(view, z, i);
                }
            });
        }
    }

    public final synchronized void zzE(String str) {
        this.zzf.zzl(str);
    }

    public final synchronized void zzF(Bundle bundle) {
        this.zzf.zzm(bundle);
    }

    public final synchronized void zzG() {
        zzdie zzdieVar = this.zzo;
        if (zzdieVar == null) {
            zzbza.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
            return;
        }
        final boolean z = zzdieVar instanceof zzdhc;
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdfy
            @Override // java.lang.Runnable
            public final void run() {
                zzdgd.this.zzw(z);
            }
        });
    }

    public final synchronized void zzH() {
        if (this.zzq) {
            return;
        }
        this.zzf.zzr();
    }

    public final void zzI(final View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeI)).booleanValue()) {
            zzac(view, this.zze.zzu());
            return;
        }
        zzfvc zzfvcVar = this.zzB;
        if (zzfvcVar == null) {
            return;
        }
        zzfvcVar.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdfu
            @Override // java.lang.Runnable
            public final void run() {
                zzdgd.this.zzx(view);
            }
        }, this.zzd);
    }

    public final synchronized void zzJ(View view, MotionEvent motionEvent, View view2) {
        this.zzf.zzs(view, motionEvent, view2);
    }

    public final synchronized void zzK(Bundle bundle) {
        this.zzf.zzt(bundle);
    }

    public final synchronized void zzL(View view) {
        this.zzf.zzu(view);
    }

    public final synchronized void zzM() {
        this.zzf.zzv();
    }

    public final synchronized void zzN(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        this.zzf.zzw(zzcsVar);
    }

    public final synchronized void zzO(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zzx.zza(zzdgVar);
    }

    public final synchronized void zzP(zzbfr zzbfrVar) {
        this.zzf.zzx(zzbfrVar);
    }

    public final synchronized void zzQ(final zzdie zzdieVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbz)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdfz
                @Override // java.lang.Runnable
                public final void run() {
                    zzdgd.this.zzy(zzdieVar);
                }
            });
        } else {
            zzy(zzdieVar);
        }
    }

    public final synchronized void zzR(final zzdie zzdieVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbz)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdfv
                @Override // java.lang.Runnable
                public final void run() {
                    zzdgd.this.zzz(zzdieVar);
                }
            });
        } else {
            zzz(zzdieVar);
        }
    }

    public final boolean zzS() {
        return this.zzh.zze();
    }

    public final synchronized boolean zzT() {
        return this.zzf.zzA();
    }

    public final synchronized boolean zzU() {
        return this.zzf.zzB();
    }

    public final boolean zzV() {
        return this.zzh.zzd();
    }

    public final synchronized boolean zzX(Bundle bundle) {
        if (this.zzq) {
            return true;
        }
        boolean zzC = this.zzf.zzC(bundle);
        this.zzq = zzC;
        return zzC;
    }

    public final synchronized int zza() {
        return this.zzf.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcqm
    public final synchronized void zzb() {
        this.zzp = true;
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdga
            @Override // java.lang.Runnable
            public final void run() {
                zzdgd.this.zzu();
            }
        });
        super.zzb();
    }

    public final zzdgf zzc() {
        return this.zzw;
    }

    public final String zzg() {
        return this.zzh.zzb();
    }

    public final synchronized JSONObject zzi(View view, Map map, Map map2) {
        return this.zzf.zze(view, map, map2, zzZ());
    }

    @Override // com.google.android.gms.internal.ads.zzcqm
    public final void zzj() {
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdfw
            @Override // java.lang.Runnable
            public final void run() {
                zzdgd.zzq(zzdgd.this);
            }
        });
        if (this.zze.zzc() != 7) {
            Executor executor = this.zzd;
            final zzdgq zzdgqVar = this.zzf;
            zzdgqVar.getClass();
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdfx
                @Override // java.lang.Runnable
                public final void run() {
                    zzdgq.this.zzp();
                }
            });
        }
        super.zzj();
    }

    public final synchronized JSONObject zzk(View view, Map map, Map map2) {
        return this.zzf.zzf(view, map, map2, zzZ());
    }

    public final void zzr(View view) {
        IObjectWrapper zzu = this.zze.zzu();
        if (!this.zzh.zzd() || zzu == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzA();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeC)).booleanValue() && zzffi.zzb()) {
            Object unwrap = ObjectWrapper.unwrap(zzu);
            if (unwrap instanceof zzffk) {
                ((zzffk) unwrap).zzb(view, zzffq.NOT_VISIBLE, "Ad overlay");
            }
        }
    }

    public final synchronized void zzs() {
        this.zzf.zzh();
    }

    public final void zzt(String str, boolean z) {
        String str2;
        zzear zzearVar;
        zzeas zzeasVar;
        if (!this.zzh.zzd() || TextUtils.isEmpty(str)) {
            return;
        }
        zzdgi zzdgiVar = this.zze;
        zzcei zzq = zzdgiVar.zzq();
        zzcei zzr = zzdgiVar.zzr();
        if (zzq != null || zzr != null) {
            boolean z2 = false;
            boolean z3 = zzq != null;
            boolean z4 = zzr != null;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeG)).booleanValue()) {
                this.zzh.zza();
                int zzb = this.zzh.zza().zzb();
                int i = zzb - 1;
                if (i != 0) {
                    if (i != 1) {
                        zzbza.zzj("Unknown omid media type: " + (zzb != 1 ? zzb != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO") + ". Not initializing Omid.");
                        return;
                    } else if (zzq == null) {
                        zzbza.zzj("Omid media type was display but there was no display webview.");
                        return;
                    } else {
                        z2 = true;
                        z4 = false;
                    }
                } else if (zzr == null) {
                    zzbza.zzj("Omid media type was video but there was no video webview.");
                    return;
                } else {
                    z4 = true;
                }
            } else {
                z2 = z3;
            }
            if (z2) {
                str2 = null;
            } else {
                str2 = "javascript";
                zzq = zzr;
            }
            String str3 = str2;
            zzq.zzG();
            if (!com.google.android.gms.ads.internal.zzt.zzA().zze(this.zzv)) {
                zzbza.zzj("Failed to initialize omid in InternalNativeAd");
                return;
            }
            zzbzg zzbzgVar = this.zzu;
            String str4 = zzbzgVar.zzb + "." + zzbzgVar.zzc;
            if (z4) {
                zzearVar = zzear.VIDEO;
                zzeasVar = zzeas.DEFINED_BY_JAVASCRIPT;
            } else {
                zzearVar = zzear.NATIVE_DISPLAY;
                if (this.zze.zzc() == 3) {
                    zzeasVar = zzeas.UNSPECIFIED;
                } else {
                    zzeasVar = zzeas.ONE_PIXEL;
                }
            }
            IObjectWrapper zzb2 = com.google.android.gms.ads.internal.zzt.zzA().zzb(str4, zzq.zzG(), "", "javascript", str3, str, zzeasVar, zzearVar, this.zzb.zzam);
            if (zzb2 == null) {
                zzbza.zzj("Failed to create omid session in InternalNativeAd");
                return;
            }
            this.zze.zzac(zzb2);
            zzq.zzap(zzb2);
            if (z4) {
                com.google.android.gms.ads.internal.zzt.zzA().zzc(zzb2, zzr.zzF());
                this.zzr = true;
            }
            if (z) {
                com.google.android.gms.ads.internal.zzt.zzA().zzd(zzb2);
                zzq.zzd("onSdkLoaded", new ArrayMap());
                return;
            }
            return;
        }
        zzbza.zzj("Omid display and video webview are null. Skipping initialization.");
    }

    public final /* synthetic */ void zzu() {
        this.zzf.zzi();
        this.zze.zzH();
    }

    public final /* synthetic */ void zzv(View view, boolean z, int i) {
        this.zzf.zzo(view, this.zzo.zzf(), this.zzo.zzl(), this.zzo.zzm(), z, zzZ(), i);
    }

    public final /* synthetic */ void zzw(boolean z) {
        this.zzf.zzo(null, this.zzo.zzf(), this.zzo.zzl(), this.zzo.zzm(), z, zzZ(), 0);
    }

    public final /* synthetic */ void zzx(View view) {
        zzac(view, this.zze.zzu());
    }

    public static /* synthetic */ void zzq(zzdgd zzdgdVar) {
        try {
            zzdgi zzdgiVar = zzdgdVar.zze;
            int zzc2 = zzdgiVar.zzc();
            if (zzc2 == 1) {
                if (zzdgdVar.zzi.zzb() != null) {
                    zzdgdVar.zzaa("Google", true);
                    zzdgdVar.zzi.zzb().zze((zzbeo) zzdgdVar.zzj.zzb());
                }
            } else if (zzc2 == 2) {
                if (zzdgdVar.zzi.zza() != null) {
                    zzdgdVar.zzaa("Google", true);
                    zzdgdVar.zzi.zza().zze((zzbem) zzdgdVar.zzk.zzb());
                }
            } else if (zzc2 == 3) {
                if (zzdgdVar.zzi.zzd(zzdgiVar.zzz()) != null) {
                    if (zzdgdVar.zze.zzr() != null) {
                        zzdgdVar.zzt("Google", true);
                    }
                    zzdgdVar.zzi.zzd(zzdgdVar.zze.zzz()).zze((zzber) zzdgdVar.zzn.zzb());
                }
            } else if (zzc2 == 6) {
                if (zzdgdVar.zzi.zzf() != null) {
                    zzdgdVar.zzaa("Google", true);
                    zzdgdVar.zzi.zzf().zze((zzbfu) zzdgdVar.zzl.zzb());
                }
            } else if (zzc2 != 7) {
                zzbza.zzg("Wrong native template id!");
            } else {
                zzdgt zzdgtVar = zzdgdVar.zzi;
                if (zzdgtVar.zzg() != null) {
                    zzdgtVar.zzg().zzg((zzbka) zzdgdVar.zzm.zzb());
                }
            }
        } catch (RemoteException e) {
            zzbza.zzh("RemoteException when notifyAdLoad is called", e);
        }
    }
}
