package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfsx;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
abstract class zzfto extends zzfsx.zzi {
    private static final zzftk zzbb;
    private static final Logger zzbc = Logger.getLogger(zzfto.class.getName());
    private volatile int remaining;
    @CheckForNull
    private volatile Set<Throwable> seenExceptions = null;

    static {
        zzftk zzftnVar;
        Throwable th;
        try {
            zzftnVar = new zzftl(AtomicReferenceFieldUpdater.newUpdater(zzfto.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(zzfto.class, "remaining"));
            th = null;
        } catch (Error | RuntimeException e) {
            zzftnVar = new zzftn(null);
            th = e;
        }
        zzbb = zzftnVar;
        if (th != null) {
            zzbc.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    public zzfto(int i) {
        this.remaining = i;
    }

    public final int zzB() {
        return zzbb.zza(this);
    }

    public final Set zzD() {
        Set<Throwable> set = this.seenExceptions;
        if (set == null) {
            Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            zzf(newSetFromMap);
            zzbb.zzb(this, null, newSetFromMap);
            Set<Throwable> set2 = this.seenExceptions;
            set2.getClass();
            return set2;
        }
        return set;
    }

    public final void zzG() {
        this.seenExceptions = null;
    }

    abstract void zzf(Set set);
}
