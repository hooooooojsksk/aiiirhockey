package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzek extends BroadcastReceiver {
    final /* synthetic */ zzel zza;

    public /* synthetic */ zzek(zzel zzelVar, zzej zzejVar) {
        this.zza = zzelVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i = 2;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    int type = activeNetworkInfo.getType();
                    if (type != 0) {
                        if (type != 1) {
                            if (type != 4 && type != 5) {
                                if (type != 6) {
                                    i = type != 9 ? 8 : 7;
                                }
                                i = 5;
                            }
                        }
                    }
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                            i = 3;
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 14:
                        case 15:
                        case 17:
                            i = 4;
                            break;
                        case 13:
                            i = 5;
                            break;
                        case 16:
                        case 19:
                        default:
                            i = 6;
                            break;
                        case 18:
                            break;
                        case 20:
                            if (zzew.zza >= 29) {
                                i = 9;
                                break;
                            }
                            break;
                    }
                } else {
                    i = 1;
                }
            } catch (SecurityException unused) {
            }
            if (zzew.zza >= 31 || i != 5) {
                zzel.zzc(this.zza, i);
            }
            zzel zzelVar = this.zza;
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                Objects.requireNonNull(telephonyManager);
                zzei zzeiVar = new zzei(zzelVar);
                telephonyManager.registerTelephonyCallback(context.getMainExecutor(), zzeiVar);
                telephonyManager.unregisterTelephonyCallback(zzeiVar);
                return;
            } catch (RuntimeException unused2) {
                zzel.zzc(zzelVar, 5);
                return;
            }
        }
        i = 0;
        if (zzew.zza >= 31) {
        }
        zzel.zzc(this.zza, i);
    }
}
