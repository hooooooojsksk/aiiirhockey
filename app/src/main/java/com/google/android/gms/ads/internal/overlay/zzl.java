package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzawe;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbgi;
import com.google.android.gms.internal.ads.zzbgk;
import com.google.android.gms.internal.ads.zzbqf;
import com.google.android.gms.internal.ads.zzbrb;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzbzg;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzceu;
import com.google.android.gms.internal.ads.zzcft;
import com.google.android.gms.internal.ads.zzcfv;
import com.google.android.gms.internal.ads.zzcfx;
import com.google.android.gms.internal.ads.zzean;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public class zzl extends zzbrb implements zzad {
    static final int zza = Color.argb(0, 0, 0, 0);
    protected final Activity zzb;
    AdOverlayInfoParcel zzc;
    zzcei zzd;
    zzh zze;
    zzr zzf;
    FrameLayout zzh;
    WebChromeClient.CustomViewCallback zzi;
    zzg zzl;
    private Runnable zzp;
    private boolean zzq;
    private boolean zzr;
    boolean zzg = false;
    boolean zzj = false;
    boolean zzk = false;
    boolean zzm = false;
    int zzn = 1;
    private final Object zzo = new Object();
    private boolean zzs = false;
    private boolean zzt = false;
    private boolean zzu = true;

    public zzl(Activity activity) {
        this.zzb = activity;
    }

    private final void zzG(Configuration configuration) {
        com.google.android.gms.ads.internal.zzj zzjVar;
        com.google.android.gms.ads.internal.zzj zzjVar2;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = (adOverlayInfoParcel == null || (zzjVar2 = adOverlayInfoParcel.zzo) == null || !zzjVar2.zzb) ? false : true;
        boolean zze = com.google.android.gms.ads.internal.zzt.zzq().zze(this.zzb, configuration);
        if ((!this.zzk || z3) && !zze) {
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
            if (adOverlayInfoParcel2 != null && (zzjVar = adOverlayInfoParcel2.zzo) != null && zzjVar.zzg) {
                z2 = true;
            }
        } else {
            z = false;
        }
        Window window = this.zzb.getWindow();
        if (((Boolean) zzba.zzc().zzb(zzbar.zzaY)).booleanValue()) {
            window.getDecorView().setSystemUiVisibility(z ? z2 ? 5894 : 5380 : 256);
        } else if (z) {
            window.addFlags(1024);
            window.clearFlags(2048);
            if (z2) {
                window.getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
            }
        } else {
            window.addFlags(2048);
            window.clearFlags(1024);
        }
    }

    private static final void zzH(IObjectWrapper iObjectWrapper, View view) {
        if (iObjectWrapper == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzA().zzc(iObjectWrapper, view);
    }

    public final void zzA(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.zzb);
        this.zzh = frameLayout;
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.zzh.addView(view, -1, -1);
        this.zzb.setContentView(this.zzh);
        this.zzr = true;
        this.zzi = customViewCallback;
        this.zzg = true;
    }

    protected final void zzB(boolean z) throws zzf {
        if (!this.zzr) {
            this.zzb.requestWindowFeature(1);
        }
        Window window = this.zzb.getWindow();
        if (window == null) {
            throw new zzf("Invalid activity, no window available.");
        }
        zzcei zzceiVar = this.zzc.zzd;
        zzcfv zzN = zzceiVar != null ? zzceiVar.zzN() : null;
        boolean z2 = zzN != null && zzN.zzK();
        this.zzm = false;
        if (z2) {
            int i = this.zzc.zzj;
            if (i == 6) {
                r4 = this.zzb.getResources().getConfiguration().orientation == 1;
                this.zzm = r4;
            } else if (i == 7) {
                r4 = this.zzb.getResources().getConfiguration().orientation == 2;
                this.zzm = r4;
            }
        }
        zzbza.zze("Delay onShow to next orientation change: " + r4);
        zzy(this.zzc.zzj);
        window.setFlags(16777216, 16777216);
        zzbza.zze("Hardware acceleration on the AdActivity window enabled.");
        if (!this.zzk) {
            this.zzl.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        } else {
            this.zzl.setBackgroundColor(zza);
        }
        this.zzb.setContentView(this.zzl);
        this.zzr = true;
        if (z) {
            try {
                com.google.android.gms.ads.internal.zzt.zzz();
                Activity activity = this.zzb;
                zzcei zzceiVar2 = this.zzc.zzd;
                zzcfx zzO = zzceiVar2 != null ? zzceiVar2.zzO() : null;
                zzcei zzceiVar3 = this.zzc.zzd;
                String zzS = zzceiVar3 != null ? zzceiVar3.zzS() : null;
                AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
                zzbzg zzbzgVar = adOverlayInfoParcel.zzm;
                zzcei zzceiVar4 = adOverlayInfoParcel.zzd;
                zzcei zza2 = zzceu.zza(activity, zzO, zzS, true, z2, null, null, zzbzgVar, null, null, zzceiVar4 != null ? zzceiVar4.zzj() : null, zzawe.zza(), null, null);
                this.zzd = zza2;
                zzcfv zzN2 = zza2.zzN();
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                zzbgi zzbgiVar = adOverlayInfoParcel2.zzp;
                zzbgk zzbgkVar = adOverlayInfoParcel2.zze;
                zzz zzzVar = adOverlayInfoParcel2.zzi;
                zzcei zzceiVar5 = adOverlayInfoParcel2.zzd;
                zzN2.zzM(null, zzbgiVar, null, zzbgkVar, zzzVar, true, null, zzceiVar5 != null ? zzceiVar5.zzN().zzd() : null, null, null, null, null, null, null, null, null, null, null);
                this.zzd.zzN().zzA(new zzcft() { // from class: com.google.android.gms.ads.internal.overlay.zzd
                    @Override // com.google.android.gms.internal.ads.zzcft
                    public final void zza(boolean z3) {
                        zzcei zzceiVar6 = zzl.this.zzd;
                        if (zzceiVar6 != null) {
                            zzceiVar6.zzX();
                        }
                    }
                });
                AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
                String str = adOverlayInfoParcel3.zzl;
                if (str != null) {
                    this.zzd.loadUrl(str);
                } else {
                    String str2 = adOverlayInfoParcel3.zzh;
                    if (str2 != null) {
                        this.zzd.loadDataWithBaseURL(adOverlayInfoParcel3.zzf, str2, "text/html", "UTF-8", null);
                    } else {
                        throw new zzf("No URL or HTML to display in ad overlay.");
                    }
                }
                zzcei zzceiVar6 = this.zzc.zzd;
                if (zzceiVar6 != null) {
                    zzceiVar6.zzar(this);
                }
            } catch (Exception e) {
                zzbza.zzh("Error obtaining webview.", e);
                throw new zzf("Could not obtain webview for the overlay.", e);
            }
        } else {
            zzcei zzceiVar7 = this.zzc.zzd;
            this.zzd = zzceiVar7;
            zzceiVar7.zzak(this.zzb);
        }
        this.zzd.zzaf(this);
        zzcei zzceiVar8 = this.zzc.zzd;
        if (zzceiVar8 != null) {
            zzH(zzceiVar8.zzQ(), this.zzl);
        }
        if (this.zzc.zzk != 5) {
            ViewParent parent = this.zzd.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.zzd.zzF());
            }
            if (this.zzk) {
                this.zzd.zzaj();
            }
            this.zzl.addView(this.zzd.zzF(), -1, -1);
        }
        if (!z && !this.zzm) {
            zze();
        }
        AdOverlayInfoParcel adOverlayInfoParcel4 = this.zzc;
        if (adOverlayInfoParcel4.zzk != 5) {
            zzu(z2);
            if (this.zzd.zzaw()) {
                zzw(z2, true);
                return;
            }
            return;
        }
        zzean.zzh(this.zzb, this, adOverlayInfoParcel4.zzu, adOverlayInfoParcel4.zzr, adOverlayInfoParcel4.zzs, adOverlayInfoParcel4.zzt, adOverlayInfoParcel4.zzq, adOverlayInfoParcel4.zzv);
    }

    public final void zzC() {
        synchronized (this.zzo) {
            this.zzq = true;
            if (this.zzp != null) {
                com.google.android.gms.ads.internal.util.zzs.zza.removeCallbacks(this.zzp);
                com.google.android.gms.ads.internal.util.zzs.zza.post(this.zzp);
            }
        }
    }

    protected final void zzD() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzo zzoVar;
        if (!this.zzb.isFinishing() || this.zzs) {
            return;
        }
        this.zzs = true;
        zzcei zzceiVar = this.zzd;
        if (zzceiVar != null) {
            zzceiVar.zzW(this.zzn - 1);
            synchronized (this.zzo) {
                if (!this.zzq && this.zzd.zzax()) {
                    if (((Boolean) zzba.zzc().zzb(zzbar.zzer)).booleanValue() && !this.zzt && (adOverlayInfoParcel = this.zzc) != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
                        zzoVar.zzby();
                    }
                    this.zzp = new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zze
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzl.this.zzc();
                        }
                    };
                    com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(this.zzp, ((Long) zzba.zzc().zzb(zzbar.zzaR)).longValue());
                    return;
                }
            }
        }
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final boolean zzE() {
        this.zzn = 1;
        if (this.zzd == null) {
            return true;
        }
        if (!((Boolean) zzba.zzc().zzb(zzbar.zzif)).booleanValue() || !this.zzd.canGoBack()) {
            boolean zzaC = this.zzd.zzaC();
            if (!zzaC) {
                this.zzd.zzd("onbackblocked", Collections.emptyMap());
            }
            return zzaC;
        }
        this.zzd.goBack();
        return false;
    }

    public final void zzb() {
        this.zzn = 3;
        this.zzb.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.zzk != 5) {
            return;
        }
        this.zzb.overridePendingTransition(0, 0);
    }

    public final void zzc() {
        zzcei zzceiVar;
        zzo zzoVar;
        if (this.zzt) {
            return;
        }
        this.zzt = true;
        zzcei zzceiVar2 = this.zzd;
        if (zzceiVar2 != null) {
            this.zzl.removeView(zzceiVar2.zzF());
            zzh zzhVar = this.zze;
            if (zzhVar != null) {
                this.zzd.zzak(zzhVar.zzd);
                this.zzd.zzan(false);
                ViewGroup viewGroup = this.zze.zzc;
                View zzF = this.zzd.zzF();
                zzh zzhVar2 = this.zze;
                viewGroup.addView(zzF, zzhVar2.zza, zzhVar2.zzb);
                this.zze = null;
            } else if (this.zzb.getApplicationContext() != null) {
                this.zzd.zzak(this.zzb.getApplicationContext());
            }
            this.zzd = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzf(this.zzn);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
        if (adOverlayInfoParcel2 == null || (zzceiVar = adOverlayInfoParcel2.zzd) == null) {
            return;
        }
        zzH(zzceiVar.zzQ(), this.zzc.zzd.zzF());
    }

    public final void zzd() {
        this.zzl.zzb = true;
    }

    protected final void zze() {
        this.zzd.zzX();
    }

    public final void zzf() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && this.zzg) {
            zzy(adOverlayInfoParcel.zzj);
        }
        if (this.zzh != null) {
            this.zzb.setContentView(this.zzl);
            this.zzr = true;
            this.zzh.removeAllViews();
            this.zzh = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.zzi;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.zzi = null;
        }
        this.zzg = false;
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void zzg(int i, int i2, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void zzh() {
        this.zzn = 1;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzad
    public final void zzi() {
        this.zzn = 2;
        this.zzb.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void zzj(IObjectWrapper iObjectWrapper) {
        zzG((Configuration) ObjectWrapper.unwrap(iObjectWrapper));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0071 A[Catch: zzf -> 0x00f5, TryCatch #0 {zzf -> 0x00f5, blocks: (B:80:0x0017, B:82:0x0025, B:84:0x002e, B:85:0x0030, B:87:0x0038, B:88:0x0046, B:90:0x004d, B:96:0x005a, B:98:0x005e, B:100:0x0063, B:103:0x0071, B:105:0x0075, B:107:0x007b, B:108:0x007e, B:110:0x0084, B:111:0x0087, B:113:0x008d, B:115:0x0091, B:116:0x0094, B:118:0x009a, B:119:0x009d, B:126:0x00cc, B:128:0x00d0, B:129:0x00d7, B:130:0x00d8, B:132:0x00dc, B:134:0x00e9, B:93:0x0054, B:95:0x0058, B:101:0x006d, B:136:0x00ed, B:137:0x00f4), top: B:141:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00e9 A[Catch: zzf -> 0x00f5, TryCatch #0 {zzf -> 0x00f5, blocks: (B:80:0x0017, B:82:0x0025, B:84:0x002e, B:85:0x0030, B:87:0x0038, B:88:0x0046, B:90:0x004d, B:96:0x005a, B:98:0x005e, B:100:0x0063, B:103:0x0071, B:105:0x0075, B:107:0x007b, B:108:0x007e, B:110:0x0084, B:111:0x0087, B:113:0x008d, B:115:0x0091, B:116:0x0094, B:118:0x009a, B:119:0x009d, B:126:0x00cc, B:128:0x00d0, B:129:0x00d7, B:130:0x00d8, B:132:0x00dc, B:134:0x00e9, B:93:0x0054, B:95:0x0058, B:101:0x006d, B:136:0x00ed, B:137:0x00f4), top: B:141:0x0017 }] */
    @Override // com.google.android.gms.internal.ads.zzbrc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void zzk(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzl.zzk(android.os.Bundle):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void zzl() {
        zzcei zzceiVar = this.zzd;
        if (zzceiVar != null) {
            try {
                this.zzl.removeView(zzceiVar.zzF());
            } catch (NullPointerException unused) {
            }
        }
        zzD();
    }

    public final void zzm() {
        if (this.zzm) {
            this.zzm = false;
            zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void zzn() {
        zzo zzoVar;
        zzf();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzbo();
        }
        if (!((Boolean) zzba.zzc().zzb(zzbar.zzet)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void zzo() {
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void zzp() {
        zzo zzoVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzbF();
        }
        zzG(this.zzb.getResources().getConfiguration());
        if (((Boolean) zzba.zzc().zzb(zzbar.zzet)).booleanValue()) {
            return;
        }
        zzcei zzceiVar = this.zzd;
        if (zzceiVar == null || zzceiVar.zzaz()) {
            zzbza.zzj("The webview does not exist. Ignoring action.");
        } else {
            this.zzd.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void zzq(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void zzr() {
        if (((Boolean) zzba.zzc().zzb(zzbar.zzet)).booleanValue()) {
            zzcei zzceiVar = this.zzd;
            if (zzceiVar == null || zzceiVar.zzaz()) {
                zzbza.zzj("The webview does not exist. Ignoring action.");
            } else {
                this.zzd.onResume();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void zzs() {
        if (((Boolean) zzba.zzc().zzb(zzbar.zzet)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void zzt() {
        zzo zzoVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzoVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzoVar.zze();
    }

    public final void zzu(boolean z) {
        int intValue = ((Integer) zzba.zzc().zzb(zzbar.zzev)).intValue();
        boolean z2 = ((Boolean) zzba.zzc().zzb(zzbar.zzaU)).booleanValue() || z;
        zzq zzqVar = new zzq();
        zzqVar.zzd = 50;
        zzqVar.zza = true != z2 ? 0 : intValue;
        zzqVar.zzb = true != z2 ? intValue : 0;
        zzqVar.zzc = intValue;
        this.zzf = new zzr(this.zzb, zzqVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z2 ? 9 : 11);
        zzw(z, this.zzc.zzg);
        this.zzl.addView(this.zzf, layoutParams);
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void zzv() {
        this.zzr = true;
    }

    public final void zzw(boolean z, boolean z2) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzj zzjVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzj zzjVar2;
        boolean z3 = true;
        boolean z4 = ((Boolean) zzba.zzc().zzb(zzbar.zzaS)).booleanValue() && (adOverlayInfoParcel2 = this.zzc) != null && (zzjVar2 = adOverlayInfoParcel2.zzo) != null && zzjVar2.zzh;
        boolean z5 = ((Boolean) zzba.zzc().zzb(zzbar.zzaT)).booleanValue() && (adOverlayInfoParcel = this.zzc) != null && (zzjVar = adOverlayInfoParcel.zzo) != null && zzjVar.zzi;
        if (z && z2 && z4 && !z5) {
            new zzbqf(this.zzd, "useCustomClose").zzg("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzr zzrVar = this.zzf;
        if (zzrVar != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            zzrVar.zzb(z3);
        }
    }

    public final void zzx() {
        this.zzl.removeView(this.zzf);
        zzu(true);
    }

    public final void zzy(int i) {
        if (this.zzb.getApplicationInfo().targetSdkVersion >= ((Integer) zzba.zzc().zzb(zzbar.zzfA)).intValue()) {
            if (this.zzb.getApplicationInfo().targetSdkVersion <= ((Integer) zzba.zzc().zzb(zzbar.zzfB)).intValue()) {
                if (Build.VERSION.SDK_INT >= ((Integer) zzba.zzc().zzb(zzbar.zzfC)).intValue()) {
                    if (Build.VERSION.SDK_INT <= ((Integer) zzba.zzc().zzb(zzbar.zzfD)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.zzb.setRequestedOrientation(i);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zzz(boolean z) {
        if (z) {
            this.zzl.setBackgroundColor(0);
        } else {
            this.zzl.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
    }
}
