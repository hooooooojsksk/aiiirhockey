package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.work.WorkRequest;
import com.google.android.gms.common.util.Predicate;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbku implements zzbkm, zzbkk {
    private final zzcei zza;

    public zzbku(Context context, zzbzg zzbzgVar, zzapw zzapwVar, com.google.android.gms.ads.internal.zza zzaVar) throws zzcet {
        com.google.android.gms.ads.internal.zzt.zzz();
        zzcei zza = zzceu.zza(context, zzcfx.zza(), "", false, false, null, null, zzbzgVar, null, null, null, zzawe.zza(), null, null);
        this.zza = zza;
        ((View) zza).setWillNotDraw(true);
    }

    private static final void zzs(Runnable runnable) {
        com.google.android.gms.ads.internal.client.zzay.zzb();
        if (zzbyt.zzv()) {
            runnable.run();
        } else {
            com.google.android.gms.ads.internal.util.zzs.zza.post(runnable);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbkv
    public final void zza(final String str) {
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbkp
            @Override // java.lang.Runnable
            public final void run() {
                zzbku.this.zzm(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbkv
    public final /* synthetic */ void zzb(String str, String str2) {
        zzbkj.zzc(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbkm
    public final void zzc() {
        this.zza.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzbki
    public final /* synthetic */ void zzd(String str, Map map) {
        zzbkj.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbki
    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzbkj.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbkm
    public final void zzf(final String str) {
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbkq
            @Override // java.lang.Runnable
            public final void run() {
                zzbku.this.zzn(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbkm
    public final void zzg(final String str) {
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbks
            @Override // java.lang.Runnable
            public final void run() {
                zzbku.this.zzo(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbkm
    public final void zzh(String str) {
        final String format = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbkr
            @Override // java.lang.Runnable
            public final void run() {
                zzbku.this.zzp(format);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbkm
    public final boolean zzi() {
        return this.zza.zzaz();
    }

    @Override // com.google.android.gms.internal.ads.zzbkm
    public final zzblt zzj() {
        return new zzblt(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbkm
    public final void zzk(zzbla zzblaVar) {
        this.zza.zzN().zzG(new zzcfu(null) { // from class: com.google.android.gms.internal.ads.zzbkn
            @Override // com.google.android.gms.internal.ads.zzcfu
            public final void zza() {
                zzbla zzblaVar2 = zzbla.this;
                final zzblr zzblrVar = zzblaVar2.zza;
                final zzblq zzblqVar = zzblaVar2.zzb;
                final zzbkm zzbkmVar = zzblaVar2.zzc;
                com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbkz
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzblr.this.zzi(zzblqVar, zzbkmVar);
                    }
                }, WorkRequest.MIN_BACKOFF_MILLIS);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbkv
    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzbkj.zzd(this, str, jSONObject);
    }

    public final /* synthetic */ void zzm(String str) {
        this.zza.zza(str);
    }

    public final /* synthetic */ void zzn(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    public final /* synthetic */ void zzo(String str) {
        this.zza.loadUrl(str);
    }

    public final /* synthetic */ void zzp(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void zzq(String str, zzbhp zzbhpVar) {
        this.zza.zzad(str, new zzbkt(this, zzbhpVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void zzr(String str, final zzbhp zzbhpVar) {
        this.zza.zzav(str, new Predicate() { // from class: com.google.android.gms.internal.ads.zzbko
            @Override // com.google.android.gms.common.util.Predicate
            public final boolean apply(Object obj) {
                zzbhp zzbhpVar2;
                zzbhp zzbhpVar3 = zzbhp.this;
                zzbhp zzbhpVar4 = (zzbhp) obj;
                if (zzbhpVar4 instanceof zzbkt) {
                    zzbhpVar2 = ((zzbkt) zzbhpVar4).zzb;
                    return zzbhpVar2.equals(zzbhpVar3);
                }
                return false;
            }
        });
    }
}
