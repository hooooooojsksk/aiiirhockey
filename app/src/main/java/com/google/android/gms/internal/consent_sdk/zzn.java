package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentRequestParameters;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes2.dex */
public final class zzn {
    private final Application zza;
    private final zzb zzb;
    private final zzam zzc;

    public zzn(Application application, zzb zzbVar, zzam zzamVar) {
        this.zza = application;
        this.zzb = zzbVar;
        this.zzc = zzamVar;
    }

    public final zzbu zzd(Activity activity, ConsentRequestParameters consentRequestParameters) throws zzj {
        ConsentDebugSettings consentDebugSettings = consentRequestParameters.getConsentDebugSettings();
        if (consentDebugSettings == null) {
            consentDebugSettings = new ConsentDebugSettings.Builder(this.zza).build();
        }
        return zzo.zza(new zzo(this, activity, consentDebugSettings, consentRequestParameters, null));
    }
}
