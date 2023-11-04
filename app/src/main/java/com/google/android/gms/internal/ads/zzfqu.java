package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzfqu {
    @CheckForNull
    public static Object zza(Iterator it) {
        if (it.hasNext()) {
            Object next = it.next();
            it.remove();
            return next;
        }
        return null;
    }

    public static boolean zzc(Collection collection, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    public static void zzb(Iterator it) {
        Objects.requireNonNull(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}
