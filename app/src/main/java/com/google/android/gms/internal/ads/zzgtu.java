package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgtu extends IllegalArgumentException {
    public zzgtu(int i, int i2) {
        super("Unpaired surrogate at index " + i + " of " + i2);
    }
}
