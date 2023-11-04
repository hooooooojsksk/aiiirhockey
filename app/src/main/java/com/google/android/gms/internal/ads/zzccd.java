package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzccd implements zzfg {
    private final Context zza;
    private final zzfg zzb;
    private final String zzc;
    private final int zzd;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzavq zzi;
    private zzfl zzm;
    private boolean zzj = false;
    private boolean zzk = false;
    private final AtomicLong zzl = new AtomicLong(-1);
    private final boolean zze = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbG)).booleanValue();

    public zzccd(Context context, zzfg zzfgVar, String str, int i, zzgi zzgiVar, zzccc zzcccVar) {
        this.zza = context;
        this.zzb = zzfgVar;
        this.zzc = str;
        this.zzd = i;
    }

    private final boolean zzg() {
        if (this.zze) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdT)).booleanValue() || this.zzj) {
                return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdU)).booleanValue() && !this.zzk;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzr
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        if (this.zzg) {
            InputStream inputStream = this.zzf;
            if (inputStream != null) {
                return inputStream.read(bArr, i, i2);
            }
            return this.zzb.zza(bArr, i, i2);
        }
        throw new IOException("Attempt to read closed CacheDataSource.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v13 */
    @Override // com.google.android.gms.internal.ads.zzfg
    public final long zzb(zzfl zzflVar) throws IOException {
        Long l;
        if (this.zzg) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.zzg = true;
        this.zzh = zzflVar.zza;
        this.zzm = zzflVar;
        this.zzi = zzavq.zza(zzflVar.zza);
        zzavn zzavnVar = 0;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdQ)).booleanValue()) {
            if (this.zzi != null) {
                this.zzi.zzh = zzflVar.zzf;
                this.zzi.zzi = zzfoj.zzc(this.zzc);
                this.zzi.zzj = this.zzd;
                zzavnVar = com.google.android.gms.ads.internal.zzt.zzc().zzb(this.zzi);
            }
            if (zzavnVar != 0 && zzavnVar.zze()) {
                this.zzj = zzavnVar.zzg();
                this.zzk = zzavnVar.zzf();
                if (!zzg()) {
                    this.zzf = zzavnVar.zzc();
                    return -1L;
                }
            }
        } else if (this.zzi != null) {
            this.zzi.zzh = zzflVar.zzf;
            this.zzi.zzi = zzfoj.zzc(this.zzc);
            this.zzi.zzj = this.zzd;
            if (this.zzi.zzg) {
                l = (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdS);
            } else {
                l = (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdR);
            }
            long longValue = l.longValue();
            com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
            com.google.android.gms.ads.internal.zzt.zzd();
            Future zza = zzawb.zza(this.zza, this.zzi);
            try {
                zzawc zzawcVar = (zzawc) zza.get(longValue, TimeUnit.MILLISECONDS);
                zzawcVar.zzd();
                this.zzj = zzawcVar.zzf();
                this.zzk = zzawcVar.zze();
                zzawcVar.zza();
                if (zzg()) {
                    com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                    throw null;
                }
                this.zzf = zzawcVar.zzc();
                com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                throw null;
            } catch (InterruptedException unused) {
                zza.cancel(false);
                Thread.currentThread().interrupt();
                com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                throw null;
            } catch (ExecutionException | TimeoutException unused2) {
                zza.cancel(false);
                com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                throw null;
            }
        }
        if (this.zzi != null) {
            Uri parse = Uri.parse(this.zzi.zza);
            byte[] bArr = zzflVar.zzc;
            long j = zzflVar.zze;
            long j2 = zzflVar.zzf;
            long j3 = zzflVar.zzg;
            String str = zzflVar.zzh;
            this.zzm = new zzfl(parse, null, j, j2, j3, null, zzflVar.zzi);
        }
        return this.zzb.zzb(this.zzm);
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    public final void zzd() throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.zzg = false;
        this.zzh = null;
        InputStream inputStream = this.zzf;
        if (inputStream != null) {
            IOUtils.closeQuietly(inputStream);
            this.zzf = null;
            return;
        }
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    public final /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    public final void zzf(zzgi zzgiVar) {
    }
}
