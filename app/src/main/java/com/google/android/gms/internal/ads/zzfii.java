package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfii {
    private final Context zza;
    private final Executor zzb;
    private final zzfhp zzc;
    private final zzfhr zzd;
    private final zzfih zze;
    private final zzfih zzf;
    private Task zzg;
    private Task zzh;

    zzfii(Context context, Executor executor, zzfhp zzfhpVar, zzfhr zzfhrVar, zzfif zzfifVar, zzfig zzfigVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzfhpVar;
        this.zzd = zzfhrVar;
        this.zze = zzfifVar;
        this.zzf = zzfigVar;
    }

    public static zzfii zze(Context context, Executor executor, zzfhp zzfhpVar, zzfhr zzfhrVar) {
        zzfii zzfiiVar = new zzfii(context, executor, zzfhpVar, zzfhrVar, new zzfif(), new zzfig());
        if (zzfiiVar.zzd.zzd()) {
            zzfiiVar.zzg = zzfiiVar.zzh(new Callable() { // from class: com.google.android.gms.internal.ads.zzfic
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzfii.this.zzc();
                }
            });
        } else {
            zzfiiVar.zzg = Tasks.forResult(zzfiiVar.zze.zza());
        }
        zzfiiVar.zzh = zzfiiVar.zzh(new Callable() { // from class: com.google.android.gms.internal.ads.zzfid
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzfii.this.zzd();
            }
        });
        return zzfiiVar;
    }

    private static zzans zzg(Task task, zzans zzansVar) {
        return !task.isSuccessful() ? zzansVar : (zzans) task.getResult();
    }

    private final Task zzh(Callable callable) {
        return Tasks.call(this.zzb, callable).addOnFailureListener(this.zzb, new OnFailureListener() { // from class: com.google.android.gms.internal.ads.zzfie
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzfii.this.zzf(exc);
            }
        });
    }

    public final zzans zza() {
        return zzg(this.zzg, this.zze.zza());
    }

    public final zzans zzb() {
        return zzg(this.zzh, this.zzf.zza());
    }

    public final /* synthetic */ zzans zzc() throws Exception {
        Context context = this.zza;
        zzamv zza = zzans.zza();
        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
        String id = advertisingIdInfo.getId();
        if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID fromString = UUID.fromString(id);
            byte[] bArr = new byte[16];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.putLong(fromString.getMostSignificantBits());
            wrap.putLong(fromString.getLeastSignificantBits());
            id = Base64.encodeToString(bArr, 11);
        }
        if (id != null) {
            zza.zzs(id);
            zza.zzr(advertisingIdInfo.isLimitAdTrackingEnabled());
            zza.zzab(6);
        }
        return (zzans) zza.zzal();
    }

    public final /* synthetic */ zzans zzd() throws Exception {
        Context context = this.zza;
        return zzfhx.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    public final /* synthetic */ void zzf(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.zzc.zzc(2025, -1L, exc);
    }
}
