package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbyt;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public class zzu extends zzt {
    static final boolean zzf(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final boolean zze(Activity activity, Configuration configuration) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzes)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeu)).booleanValue()) {
                return activity.isInMultiWindowMode();
            }
            com.google.android.gms.ads.internal.client.zzay.zzb();
            int zzy = zzbyt.zzy(activity, configuration.screenHeightDp);
            int zzy2 = zzbyt.zzy(activity, configuration.screenWidthDp);
            com.google.android.gms.ads.internal.zzt.zzp();
            DisplayMetrics zzq = zzs.zzq((WindowManager) activity.getApplicationContext().getSystemService("window"));
            int i = zzq.heightPixels;
            int i2 = zzq.widthPixels;
            int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
            double d = activity.getResources().getDisplayMetrics().density;
            Double.isNaN(d);
            int round = ((int) Math.round(d + 0.5d)) * ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeq)).intValue();
            return (zzf(i, zzy + dimensionPixelSize, round) && zzf(i2, zzy2, round)) ? false : true;
        }
        return false;
    }
}
