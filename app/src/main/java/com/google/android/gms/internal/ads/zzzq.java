package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzzq {
    public final String zza;

    private zzzq(int i, int i2, String str) {
        this.zza = str;
    }

    public static zzzq zza(zzen zzenVar) {
        String str;
        zzenVar.zzG(2);
        int zzk = zzenVar.zzk();
        int i = zzk >> 1;
        int i2 = zzk & 1;
        int zzk2 = zzenVar.zzk() >> 3;
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        int i3 = zzk2 | (i2 << 5);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(i3 >= 10 ? "." : ".0");
        sb.append(i3);
        return new zzzq(i, i3, sb.toString());
    }
}
