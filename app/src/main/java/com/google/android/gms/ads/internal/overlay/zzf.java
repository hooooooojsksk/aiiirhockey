package com.google.android.gms.ads.internal.overlay;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzf extends Exception {
    public zzf(String str) {
        super(str);
    }

    public zzf(String str, Throwable th) {
        super("Could not obtain webview for the overlay.", th);
    }
}
