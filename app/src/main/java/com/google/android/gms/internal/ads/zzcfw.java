package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import com.google.android.gms.drive.DriveFile;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzcfw extends MutableContextWrapper {
    private Activity zza;
    private Context zzb;
    private Context zzc;

    public zzcfw(Context context) {
        super(context);
        setBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.zzc.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.zzb = applicationContext;
        this.zza = context instanceof Activity ? (Activity) context : null;
        this.zzc = context;
        super.setBaseContext(applicationContext);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.zza;
        if (activity != null) {
            activity.startActivity(intent);
            return;
        }
        intent.setFlags(DriveFile.MODE_READ_ONLY);
        this.zzb.startActivity(intent);
    }

    public final Activity zza() {
        return this.zza;
    }

    public final Context zzb() {
        return this.zzc;
    }
}
