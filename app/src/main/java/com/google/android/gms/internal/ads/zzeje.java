package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzeje implements zzepn {
    private final zzfuu zza;
    private final zzfuu zzb;
    private final Context zzc;
    private final zzeyx zzd;
    private final View zze;

    public zzeje(zzfuu zzfuuVar, zzfuu zzfuuVar2, Context context, zzeyx zzeyxVar, ViewGroup viewGroup) {
        this.zza = zzfuuVar;
        this.zzb = zzfuuVar2;
        this.zzc = context;
        this.zzd = zzeyxVar;
        this.zze = viewGroup;
    }

    private final List zze() {
        ArrayList arrayList = new ArrayList();
        View view = this.zze;
        while (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                break;
            }
            int indexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", indexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 3;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        zzbar.zzc(this.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjq)).booleanValue()) {
            return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzejc
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzeje.this.zzc();
                }
            });
        }
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzejd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeje.this.zzd();
            }
        });
    }

    public final /* synthetic */ zzejf zzc() throws Exception {
        return new zzejf(this.zzc, this.zzd.zze, zze());
    }

    public final /* synthetic */ zzejf zzd() throws Exception {
        return new zzejf(this.zzc, this.zzd.zze, zze());
    }
}
