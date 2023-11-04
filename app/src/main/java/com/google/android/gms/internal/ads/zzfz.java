package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public class zzfz extends zzfh {
    public final zzfl zzb;
    public final int zzc;

    public zzfz(zzfl zzflVar, int i, int i2) {
        super(zzb(AdError.REMOTE_ADS_SERVICE_ERROR, 1));
        this.zzb = zzflVar;
        this.zzc = 1;
    }

    public static zzfz zza(IOException iOException, zzfl zzflVar, int i) {
        String message = iOException.getMessage();
        int i2 = 2001;
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else if (message != null && zzfnb.zza(message).matches("cleartext.*not permitted.*")) {
            i2 = 2007;
        }
        if (i2 == 2007) {
            return new zzfy(iOException, zzflVar);
        }
        return new zzfz(iOException, zzflVar, i2, i);
    }

    private static int zzb(int i, int i2) {
        return i == 2000 ? i2 != 1 ? 2000 : 2001 : i;
    }

    public zzfz(IOException iOException, zzfl zzflVar, int i, int i2) {
        super(iOException, zzb(i, i2));
        this.zzb = zzflVar;
        this.zzc = i2;
    }

    public zzfz(String str, zzfl zzflVar, int i, int i2) {
        super(str, zzb(i, i2));
        this.zzb = zzflVar;
        this.zzc = i2;
    }

    public zzfz(String str, IOException iOException, zzfl zzflVar, int i, int i2) {
        super(str, iOException, zzb(i, i2));
        this.zzb = zzflVar;
        this.zzc = i2;
    }
}
