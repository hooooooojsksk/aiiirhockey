package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes.dex */
public final class zzfnx implements Serializable, zzfnv {
    private final List zza;

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof zzfnx) {
            return this.zza.equals(((zzfnx) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 306654252;
    }

    public final String toString() {
        List list = this.zza;
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append("and(");
        boolean z = true;
        for (Object obj : list) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfnv
    public final boolean zza(Object obj) {
        for (int i = 0; i < this.zza.size(); i++) {
            if (!((zzfnv) this.zza.get(i)).zza(obj)) {
                return false;
            }
        }
        return true;
    }
}
