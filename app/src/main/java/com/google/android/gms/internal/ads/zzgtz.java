package com.google.android.gms.internal.ads;

import org.cocos2dx.lib.GameControllerDelegate;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzgtz implements zzgqq {
    static final zzgqq zza = new zzgtz();

    private zzgtz() {
    }

    @Override // com.google.android.gms.internal.ads.zzgqq
    public final boolean zza(int i) {
        if (i != 0 && i != 1 && i != 2 && i != 1999) {
            switch (i) {
                case 1000:
                case 1001:
                case 1002:
                case 1003:
                case 1004:
                case GameControllerDelegate.BUTTON_B /* 1005 */:
                case 1006:
                case 1007:
                case 1008:
                case 1009:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
