package com.google.android.gms.internal.drive;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzla {
    private static final zzla zztm = new zzlc();
    private static final zzla zztn = new zzld();

    /* JADX INFO: Access modifiers changed from: private */
    public zzla() {
    }

    public abstract void zza(Object obj, long j);

    public abstract <L> void zza(Object obj, Object obj2, long j);

    public static zzla zzdt() {
        return zztm;
    }

    public static zzla zzdu() {
        return zztn;
    }
}
