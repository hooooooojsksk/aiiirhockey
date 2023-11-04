package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: classes2.dex */
public final class zzat implements Iterable, zzap {
    private final String zza;

    public zzat(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzat) {
            return this.zza.equals(((zzat) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzas(this);
    }

    public final String toString() {
        String str = this.zza;
        return "\"" + str + "\"";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:307:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x063e  */
    @Override // com.google.android.gms.internal.measurement.zzap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.zzap zzbN(java.lang.String r22, com.google.android.gms.internal.measurement.zzg r23, java.util.List r24) {
        /*
            Method dump skipped, instructions count: 1780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzat.zzbN(java.lang.String, com.google.android.gms.internal.measurement.zzg, java.util.List):com.google.android.gms.internal.measurement.zzap");
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return new zzat(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        if (this.zza.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.zza);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return new zzar(this);
    }
}
