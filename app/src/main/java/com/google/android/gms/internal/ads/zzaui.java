package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzaui {
    ByteArrayOutputStream zza = new ByteArrayOutputStream(4096);
    Base64OutputStream zzb = new Base64OutputStream(this.zza, 10);

    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.ByteArrayOutputStream, android.util.Base64OutputStream] */
    public final String toString() {
        try {
            this.zzb.close();
        } catch (IOException e) {
            zzbza.zzh("HashManager: Unable to convert to Base64.", e);
        }
        try {
            this.zza.close();
            return this.zza.toString();
        } catch (IOException e2) {
            zzbza.zzh("HashManager: Unable to convert to Base64.", e2);
            return "";
        } finally {
            this.zza = null;
            this.zzb = null;
        }
    }
}
