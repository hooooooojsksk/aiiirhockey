package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzeoc implements zzepm {
    private zzfks zza;
    private zzfks zzb;
    private boolean zzc;
    private boolean zzd;
    private final boolean zze = false;
    private final boolean zzf;

    public zzeoc(zzfks zzfksVar, zzfks zzfksVar2, boolean z, boolean z2, boolean z3) {
        this.zza = zzfksVar;
        this.zzb = zzfksVar2;
        this.zzc = z;
        this.zzd = z2;
        this.zzf = z3;
    }

    public zzeoc(boolean z) {
        this.zzf = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0022, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbar.zzcy)).booleanValue() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0038, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbar.zzcA)).booleanValue() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0040, code lost:
        if (r5.zza.zzc() == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0042, code lost:
        r1.putString("paidv1_id_android", r5.zza.zzb());
        r1.putLong("paidv1_creation_time_android", r5.zza.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x006c, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbar.zzcz)).booleanValue() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0082, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbar.zzcB)).booleanValue() != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x008a, code lost:
        if (r5.zzb.zzc() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x008c, code lost:
        r1.putString("paidv2_id_android", r5.zzb.zzb());
        r1.putLong("paidv2_creation_time_android", r5.zzb.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a2, code lost:
        r1.putBoolean("paidv2_pub_option_android", r5.zzc);
        r1.putBoolean("paidv2_user_option_android", r5.zzd);
     */
    @Override // com.google.android.gms.internal.ads.zzepm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ void zzh(java.lang.Object r6) {
        /*
            r5 = this;
            android.os.Bundle r6 = (android.os.Bundle) r6
            boolean r0 = r5.zze
            if (r0 == 0) goto L8
            goto Lb9
        L8:
            java.lang.String r0 = "pii"
            android.os.Bundle r1 = com.google.android.gms.internal.ads.zzezi.zza(r6, r0)
            boolean r2 = r5.zzf
            if (r2 != 0) goto L24
            com.google.android.gms.internal.ads.zzbaj r2 = com.google.android.gms.internal.ads.zzbar.zzcy
            com.google.android.gms.internal.ads.zzbap r3 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r2 = r3.zzb(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L3a
        L24:
            boolean r2 = r5.zzf
            if (r2 == 0) goto L58
            com.google.android.gms.internal.ads.zzbaj r2 = com.google.android.gms.internal.ads.zzbar.zzcA
            com.google.android.gms.internal.ads.zzbap r3 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r2 = r3.zzb(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L58
        L3a:
            com.google.android.gms.internal.ads.zzfks r2 = r5.zza
            boolean r2 = r2.zzc()
            if (r2 == 0) goto L58
            com.google.android.gms.internal.ads.zzfks r2 = r5.zza
            java.lang.String r2 = r2.zzb()
            java.lang.String r3 = "paidv1_id_android"
            r1.putString(r3, r2)
            com.google.android.gms.internal.ads.zzfks r2 = r5.zza
            long r2 = r2.zza()
            java.lang.String r4 = "paidv1_creation_time_android"
            r1.putLong(r4, r2)
        L58:
            boolean r2 = r5.zzf
            if (r2 != 0) goto L6e
            com.google.android.gms.internal.ads.zzbaj r2 = com.google.android.gms.internal.ads.zzbar.zzcz
            com.google.android.gms.internal.ads.zzbap r3 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r2 = r3.zzb(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L84
        L6e:
            boolean r2 = r5.zzf
            if (r2 == 0) goto Lb0
            com.google.android.gms.internal.ads.zzbaj r2 = com.google.android.gms.internal.ads.zzbar.zzcB
            com.google.android.gms.internal.ads.zzbap r3 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r2 = r3.zzb(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto Lb0
        L84:
            com.google.android.gms.internal.ads.zzfks r2 = r5.zzb
            boolean r2 = r2.zzc()
            if (r2 == 0) goto La2
            com.google.android.gms.internal.ads.zzfks r2 = r5.zzb
            java.lang.String r2 = r2.zzb()
            java.lang.String r3 = "paidv2_id_android"
            r1.putString(r3, r2)
            com.google.android.gms.internal.ads.zzfks r2 = r5.zzb
            long r2 = r2.zza()
            java.lang.String r4 = "paidv2_creation_time_android"
            r1.putLong(r4, r2)
        La2:
            boolean r2 = r5.zzc
            java.lang.String r3 = "paidv2_pub_option_android"
            r1.putBoolean(r3, r2)
            boolean r2 = r5.zzd
            java.lang.String r3 = "paidv2_user_option_android"
            r1.putBoolean(r3, r2)
        Lb0:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto Lb9
            r6.putBundle(r0, r1)
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeoc.zzh(java.lang.Object):void");
    }
}
