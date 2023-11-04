package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbnc;
import com.google.android.gms.internal.ads.zzbnf;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes.dex */
public class LiteSdkInfo extends zzck {
    public LiteSdkInfo(Context context) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public zzbnf getAdapterCreator() {
        return new zzbnc();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public zzen getLiteSdkVersion() {
        return new zzen(ModuleDescriptor.MODULE_VERSION, ModuleDescriptor.MODULE_VERSION, "22.0.0");
    }
}
