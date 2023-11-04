package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzcdv extends zzcba implements zzgi, zzle {
    public static final /* synthetic */ int zza = 0;
    private final Context zzb;
    private final zzcdg zzc;
    private final zzwc zzd;
    private final zzcbi zze;
    private final WeakReference zzf;
    private final zzty zzg;
    private zzhu zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private zzcaz zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final String zzo;
    private final int zzp;
    private final ArrayList zzr;
    private volatile zzcdi zzs;
    private final Object zzq = new Object();
    private final Set zzt = new HashSet();

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e3, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbar.zzbG)).booleanValue() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e7, code lost:
        if (r7.zzj == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e9, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00ec, code lost:
        if (r7.zzm == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ee, code lost:
        r8 = new com.google.android.gms.internal.ads.zzcdm();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f6, code lost:
        if (r7.zzi <= 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f8, code lost:
        r8 = new com.google.android.gms.internal.ads.zzcdn();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00fe, code lost:
        r8 = new com.google.android.gms.internal.ads.zzcdo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0105, code lost:
        if (r7.zzj == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0107, code lost:
        r7 = new com.google.android.gms.internal.ads.zzcdp();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x010e, code lost:
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x010f, code lost:
        r6 = r5.zzi;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0111, code lost:
        if (r6 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0117, code lost:
        if (r6.limit() <= 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0119, code lost:
        r6 = new byte[r5.zzi.limit()];
        r5.zzi.get(r6);
        r7 = new com.google.android.gms.internal.ads.zzcdq();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzcdv(android.content.Context r6, com.google.android.gms.internal.ads.zzcbi r7, com.google.android.gms.internal.ads.zzcbj r8) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdv.<init>(android.content.Context, com.google.android.gms.internal.ads.zzcbi, com.google.android.gms.internal.ads.zzcbj):void");
    }

    private final boolean zzab() {
        return this.zzs != null && this.zzs.zzq();
    }

    public final void finalize() {
        zzC().decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final long zzA() {
        if (zzab()) {
            return 0L;
        }
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final long zzB() {
        if (!zzab()) {
            synchronized (this.zzq) {
                while (!this.zzr.isEmpty()) {
                    long j = this.zzn;
                    Map zze = ((zzgd) this.zzr.remove(0)).zze();
                    long j2 = 0;
                    if (zze != null) {
                        Iterator it = zze.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (entry != null) {
                                try {
                                    if (entry.getKey() != null && zzfnb.zzc("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                        j2 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                        break;
                                    }
                                } catch (NumberFormatException unused) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.zzn = j + j2;
                }
            }
            return this.zzn;
        }
        return this.zzs.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzE(Uri[] uriArr, String str) {
        zzF(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzG() {
        zzhu zzhuVar = this.zzh;
        if (zzhuVar != null) {
            zzhuVar.zzD(this);
            this.zzh.zzt();
            this.zzh = null;
            zzD().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzH(long j) {
        zzm zzmVar = (zzm) this.zzh;
        zzmVar.zza(zzmVar.zzg(), j, 5, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzI(int i) {
        this.zzc.zzk(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzJ(int i) {
        this.zzc.zzl(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzK(zzcaz zzcazVar) {
        this.zzk = zzcazVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzL(int i) {
        this.zzc.zzm(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzM(int i) {
        this.zzc.zzn(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzN(boolean z) {
        this.zzh.zzu(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzO(boolean z) {
        if (this.zzh == null) {
            return;
        }
        int i = 0;
        while (true) {
            this.zzh.zzB();
            if (i >= 2) {
                return;
            }
            zzwc zzwcVar = this.zzd;
            zzvo zzc = zzwcVar.zzc().zzc();
            zzc.zzo(i, !z);
            zzwcVar.zzj(zzc);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzP(int i) {
        for (WeakReference weakReference : this.zzt) {
            zzcdf zzcdfVar = (zzcdf) weakReference.get();
            if (zzcdfVar != null) {
                zzcdfVar.zzm(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzQ(Surface surface, boolean z) {
        zzhu zzhuVar = this.zzh;
        if (zzhuVar != null) {
            zzhuVar.zzv(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzR(float f, boolean z) {
        zzhu zzhuVar = this.zzh;
        if (zzhuVar != null) {
            zzhuVar.zzw(f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzS() {
        this.zzh.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final boolean zzT() {
        return this.zzh != null;
    }

    public final /* synthetic */ zzfg zzU(String str, boolean z) {
        zzcbi zzcbiVar = this.zze;
        return new zzcdy(str, true != z ? null : this, zzcbiVar.zzd, zzcbiVar.zzf, zzcbiVar.zzn, zzcbiVar.zzo);
    }

    public final /* synthetic */ zzfg zzV(String str, boolean z) {
        zzcbi zzcbiVar = this.zze;
        zzcdf zzcdfVar = new zzcdf(str, true != z ? null : this, zzcbiVar.zzd, zzcbiVar.zzf, zzcbiVar.zzi);
        this.zzt.add(new WeakReference(zzcdfVar));
        return zzcdfVar;
    }

    public final /* synthetic */ zzfg zzW(String str, boolean z) {
        zzfo zzfoVar = new zzfo();
        zzfoVar.zzf(str);
        zzfoVar.zze(true != z ? null : this);
        zzfoVar.zzc(this.zze.zzd);
        zzfoVar.zzd(this.zze.zzf);
        zzfoVar.zzb(true);
        return zzfoVar.zza();
    }

    public final /* synthetic */ zzfg zzX(zzff zzffVar) {
        return new zzcdi(this.zzb, zzffVar.zza(), this.zzo, this.zzp, this, new zzcdl(this), null);
    }

    final zzsu zzY(Uri uri) {
        zzaj zzajVar = new zzaj();
        zzajVar.zzb(uri);
        zzbg zzc = zzajVar.zzc();
        zzty zztyVar = this.zzg;
        zztyVar.zza(this.zze.zzg);
        return zztyVar.zzb(zzc);
    }

    public final /* synthetic */ void zzZ(boolean z, long j) {
        zzcaz zzcazVar = this.zzk;
        if (zzcazVar != null) {
            zzcazVar.zzi(z, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final void zza(zzfg zzfgVar, zzfl zzflVar, boolean z, int i) {
        this.zzl += i;
    }

    public final /* synthetic */ zzkn[] zzaa(Handler handler, zzyp zzypVar, zzoc zzocVar, zzuu zzuuVar, zzrs zzrsVar) {
        Context context = this.zzb;
        zzrc zzrcVar = zzrc.zzb;
        zznq zznqVar = zznq.zza;
        zzde[] zzdeVarArr = new zzde[0];
        zzot zzotVar = new zzot();
        zznq zznqVar2 = zznq.zza;
        if (zznqVar == null) {
            Objects.requireNonNull(zznqVar2, "Both parameters are null");
            zznqVar = zznqVar2;
        }
        zzotVar.zzb(zznqVar);
        zzotVar.zzc(zzdeVarArr);
        return new zzkn[]{new zzpl(context, zzqt.zza, zzrcVar, false, handler, zzocVar, zzotVar.zzd()), new zzxs(this.zzb, zzqt.zza, zzrc.zzb, 0L, false, handler, zzypVar, -1, 30.0f)};
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final void zzb(zzfg zzfgVar, zzfl zzflVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final void zzc(zzfg zzfgVar, zzfl zzflVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final void zzd(zzfg zzfgVar, zzfl zzflVar, boolean z) {
        if (zzfgVar instanceof zzgd) {
            synchronized (this.zzq) {
                this.zzr.add((zzgd) zzfgVar);
            }
        } else if (zzfgVar instanceof zzcdi) {
            this.zzs = (zzcdi) zzfgVar;
            final zzcbj zzcbjVar = (zzcbj) this.zzf.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbG)).booleanValue() && zzcbjVar != null && this.zzs.zzn()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.zzs.zzp()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.zzs.zzo()));
                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcds
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcbj zzcbjVar2 = zzcbj.this;
                        Map map = hashMap;
                        int i = zzcdv.zza;
                        zzcbjVar2.zzd("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zze(zzlc zzlcVar, zzaf zzafVar, zzhc zzhcVar) {
        zzcbj zzcbjVar = (zzcbj) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbG)).booleanValue() || zzcbjVar == null || zzafVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        String str = zzafVar.zzl;
        if (str != null) {
            hashMap.put("audioMime", str);
        }
        String str2 = zzafVar.zzm;
        if (str2 != null) {
            hashMap.put("audioSampleMime", str2);
        }
        String str3 = zzafVar.zzj;
        if (str3 != null) {
            hashMap.put("audioCodec", str3);
        }
        zzcbjVar.zzd("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final /* synthetic */ void zzf(zzlc zzlcVar, int i, long j, long j2) {
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final /* synthetic */ void zzg(zzlc zzlcVar, zzso zzsoVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzh(zzlc zzlcVar, int i, long j) {
        this.zzm += i;
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final /* synthetic */ void zzi(zzcg zzcgVar, zzld zzldVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzj(zzlc zzlcVar, zzsj zzsjVar, zzso zzsoVar, IOException iOException, boolean z) {
        zzcaz zzcazVar = this.zzk;
        if (zzcazVar != null) {
            if (this.zze.zzk) {
                zzcazVar.zzl("onLoadException", iOException);
            } else {
                zzcazVar.zzk("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzk(zzlc zzlcVar, int i) {
        zzcaz zzcazVar = this.zzk;
        if (zzcazVar != null) {
            zzcazVar.zzm(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzl(zzlc zzlcVar, zzbw zzbwVar) {
        zzcaz zzcazVar = this.zzk;
        if (zzcazVar != null) {
            zzcazVar.zzk("onPlayerError", zzbwVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final /* synthetic */ void zzm(zzlc zzlcVar, zzcf zzcfVar, zzcf zzcfVar2, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzn(zzlc zzlcVar, Object obj, long j) {
        zzcaz zzcazVar = this.zzk;
        if (zzcazVar != null) {
            zzcazVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final /* synthetic */ void zzo(zzlc zzlcVar, zzhb zzhbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzp(zzlc zzlcVar, zzaf zzafVar, zzhc zzhcVar) {
        zzcbj zzcbjVar = (zzcbj) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbG)).booleanValue() || zzcbjVar == null || zzafVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(zzafVar.zzt));
        hashMap.put("bitRate", String.valueOf(zzafVar.zzi));
        int i = zzafVar.zzr;
        int i2 = zzafVar.zzs;
        hashMap.put("resolution", i + "x" + i2);
        String str = zzafVar.zzl;
        if (str != null) {
            hashMap.put("videoMime", str);
        }
        String str2 = zzafVar.zzm;
        if (str2 != null) {
            hashMap.put("videoSampleMime", str2);
        }
        String str3 = zzafVar.zzj;
        if (str3 != null) {
            hashMap.put("videoCodec", str3);
        }
        zzcbjVar.zzd("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzq(zzlc zzlcVar, zzda zzdaVar) {
        zzcaz zzcazVar = this.zzk;
        if (zzcazVar != null) {
            zzcazVar.zzC(zzdaVar.zzc, zzdaVar.zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final int zzr() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final int zzt() {
        return this.zzh.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final long zzv() {
        return this.zzh.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final long zzw() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final long zzx() {
        if (zzab() && this.zzs.zzp()) {
            return Math.min(this.zzl, this.zzs.zzk());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final long zzy() {
        return this.zzh.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final long zzz() {
        return this.zzh.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzF(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzsu zztkVar;
        if (this.zzh != null) {
            this.zzi = byteBuffer;
            this.zzj = z;
            int length = uriArr.length;
            if (length == 1) {
                zztkVar = zzY(uriArr[0]);
            } else {
                zzsu[] zzsuVarArr = new zzsu[length];
                for (int i = 0; i < uriArr.length; i++) {
                    zzsuVarArr[i] = zzY(uriArr[i]);
                }
                zztkVar = new zztk(false, false, zzsuVarArr);
            }
            this.zzh.zzE(zztkVar);
            this.zzh.zzs();
            zzD().incrementAndGet();
        }
    }
}
