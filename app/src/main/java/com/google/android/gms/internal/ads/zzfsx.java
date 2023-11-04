package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public abstract class zzfsx<V> extends zzfvm implements zzfut<V> {
    private static final Logger zzaZ;
    private static final zza zzba;
    private static final Object zzbd;
    static final boolean zzd;
    @CheckForNull
    private volatile zzd listeners;
    @CheckForNull
    private volatile Object value;
    @CheckForNull
    private volatile zzk waiters;

    /* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
    /* loaded from: classes.dex */
    public abstract class zza {
        /* synthetic */ zza(zzfsw zzfswVar) {
        }

        abstract zzd zza(zzfsx zzfsxVar, zzd zzdVar);

        abstract zzk zzb(zzfsx zzfsxVar, zzk zzkVar);

        abstract void zzc(zzk zzkVar, @CheckForNull zzk zzkVar2);

        abstract void zzd(zzk zzkVar, Thread thread);

        abstract boolean zze(zzfsx zzfsxVar, @CheckForNull zzd zzdVar, zzd zzdVar2);

        abstract boolean zzf(zzfsx zzfsxVar, @CheckForNull Object obj, Object obj2);

        abstract boolean zzg(zzfsx zzfsxVar, @CheckForNull zzk zzkVar, @CheckForNull zzk zzkVar2);
    }

    /* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
    /* loaded from: classes.dex */
    public final class zzb {
        @CheckForNull
        static final zzb zza;
        @CheckForNull
        static final zzb zzb;
        final boolean zzc;
        @CheckForNull
        final Throwable zzd;

        static {
            if (zzfsx.zzd) {
                zzb = null;
                zza = null;
                return;
            }
            zzb = new zzb(false, null);
            zza = new zzb(true, null);
        }

        zzb(boolean z, @CheckForNull Throwable th) {
            this.zzc = z;
            this.zzd = th;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
    /* loaded from: classes2.dex */
    public final class zzc {
        static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.ads.zzfsx.zzc.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable zzb;

        zzc(Throwable th) {
            Objects.requireNonNull(th);
            this.zzb = th;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
    /* loaded from: classes.dex */
    public final class zzd {
        static final zzd zza = new zzd();
        @CheckForNull
        zzd next;
        @CheckForNull
        final Runnable zzb;
        @CheckForNull
        final Executor zzc;

        zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
    /* loaded from: classes.dex */
    final class zze extends zza {
        final AtomicReferenceFieldUpdater<zzk, Thread> zza;
        final AtomicReferenceFieldUpdater<zzk, zzk> zzb;
        final AtomicReferenceFieldUpdater<zzfsx, zzk> zzc;
        final AtomicReferenceFieldUpdater<zzfsx, zzd> zzd;
        final AtomicReferenceFieldUpdater<zzfsx, Object> zze;

        zze(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super(null);
            this.zza = atomicReferenceFieldUpdater;
            this.zzb = atomicReferenceFieldUpdater2;
            this.zzc = atomicReferenceFieldUpdater3;
            this.zzd = atomicReferenceFieldUpdater4;
            this.zze = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.android.gms.internal.ads.zzfsx.zza
        final zzd zza(zzfsx zzfsxVar, zzd zzdVar) {
            return this.zzd.getAndSet(zzfsxVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.ads.zzfsx.zza
        final zzk zzb(zzfsx zzfsxVar, zzk zzkVar) {
            return this.zzc.getAndSet(zzfsxVar, zzkVar);
        }

        @Override // com.google.android.gms.internal.ads.zzfsx.zza
        final void zzc(zzk zzkVar, @CheckForNull zzk zzkVar2) {
            this.zzb.lazySet(zzkVar, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfsx.zza
        final void zzd(zzk zzkVar, Thread thread) {
            this.zza.lazySet(zzkVar, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzfsx.zza
        final boolean zze(zzfsx zzfsxVar, @CheckForNull zzd zzdVar, zzd zzdVar2) {
            return zzfsy.zza(this.zzd, zzfsxVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfsx.zza
        final boolean zzf(zzfsx zzfsxVar, @CheckForNull Object obj, Object obj2) {
            return zzfsy.zza(this.zze, zzfsxVar, obj, obj2);
        }

        @Override // com.google.android.gms.internal.ads.zzfsx.zza
        final boolean zzg(zzfsx zzfsxVar, @CheckForNull zzk zzkVar, @CheckForNull zzk zzkVar2) {
            return zzfsy.zza(this.zzc, zzfsxVar, zzkVar, zzkVar2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
    /* loaded from: classes2.dex */
    public final class zzf<V> implements Runnable {
        final zzfsx<V> zza;
        final zzfut<? extends V> zzb;

        zzf(zzfsx zzfsxVar, zzfut zzfutVar) {
            this.zza = zzfsxVar;
            this.zzb = zzfutVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (((zzfsx) this.zza).value != this) {
                return;
            }
            if (zzfsx.zzba.zzf(this.zza, this, zzfsx.zzf(this.zzb))) {
                zzfsx.zzy(this.zza, false);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
    /* loaded from: classes.dex */
    final class zzg extends zza {
        private zzg() {
            super(null);
        }

        /* synthetic */ zzg(zzfsz zzfszVar) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzfsx.zza
        final zzd zza(zzfsx zzfsxVar, zzd zzdVar) {
            zzd zzdVar2;
            synchronized (zzfsxVar) {
                zzdVar2 = zzfsxVar.listeners;
                if (zzdVar2 != zzdVar) {
                    zzfsxVar.listeners = zzdVar;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzfsx.zza
        final zzk zzb(zzfsx zzfsxVar, zzk zzkVar) {
            zzk zzkVar2;
            synchronized (zzfsxVar) {
                zzkVar2 = zzfsxVar.waiters;
                if (zzkVar2 != zzkVar) {
                    zzfsxVar.waiters = zzkVar;
                }
            }
            return zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzfsx.zza
        final void zzc(zzk zzkVar, @CheckForNull zzk zzkVar2) {
            zzkVar.next = zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzfsx.zza
        final void zzd(zzk zzkVar, Thread thread) {
            zzkVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.ads.zzfsx.zza
        final boolean zze(zzfsx zzfsxVar, @CheckForNull zzd zzdVar, zzd zzdVar2) {
            synchronized (zzfsxVar) {
                if (zzfsxVar.listeners == zzdVar) {
                    zzfsxVar.listeners = zzdVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzfsx.zza
        final boolean zzf(zzfsx zzfsxVar, @CheckForNull Object obj, Object obj2) {
            synchronized (zzfsxVar) {
                if (zzfsxVar.value == obj) {
                    zzfsxVar.value = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzfsx.zza
        final boolean zzg(zzfsx zzfsxVar, @CheckForNull zzk zzkVar, @CheckForNull zzk zzkVar2) {
            synchronized (zzfsxVar) {
                if (zzfsxVar.waiters == zzkVar) {
                    zzfsxVar.waiters = zzkVar2;
                    return true;
                }
                return false;
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
    /* loaded from: classes2.dex */
    public interface zzh<V> extends zzfut<V> {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
    /* loaded from: classes2.dex */
    public abstract class zzi<V> extends zzfsx<V> implements zzh<V> {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
    /* loaded from: classes.dex */
    final class zzj extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.android.gms.internal.ads.zzfsx.zzj.1
                        @Override // java.security.PrivilegedExceptionAction
                        public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
                            Field[] declaredFields;
                            for (Field field : Unsafe.class.getDeclaredFields()) {
                                field.setAccessible(true);
                                Object obj = field.get(null);
                                if (Unsafe.class.isInstance(obj)) {
                                    return (Unsafe) Unsafe.class.cast(obj);
                                }
                            }
                            throw new NoSuchFieldError("the Unsafe");
                        }
                    });
                }
                try {
                    zzc = unsafe.objectFieldOffset(zzfsx.class.getDeclaredField("waiters"));
                    zzb = unsafe.objectFieldOffset(zzfsx.class.getDeclaredField("listeners"));
                    zzd = unsafe.objectFieldOffset(zzfsx.class.getDeclaredField("value"));
                    zze = unsafe.objectFieldOffset(zzk.class.getDeclaredField("thread"));
                    zzf = unsafe.objectFieldOffset(zzk.class.getDeclaredField("next"));
                    zza = unsafe;
                } catch (NoSuchFieldException e) {
                    throw new RuntimeException(e);
                } catch (RuntimeException e2) {
                    throw e2;
                }
            } catch (PrivilegedActionException e3) {
                throw new RuntimeException("Could not initialize intrinsics", e3.getCause());
            }
        }

        private zzj() {
            super(null);
        }

        /* synthetic */ zzj(zzftb zzftbVar) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzfsx.zza
        final zzd zza(zzfsx zzfsxVar, zzd zzdVar) {
            zzd zzdVar2;
            do {
                zzdVar2 = zzfsxVar.listeners;
                if (zzdVar == zzdVar2) {
                    return zzdVar2;
                }
            } while (!zze(zzfsxVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzfsx.zza
        final zzk zzb(zzfsx zzfsxVar, zzk zzkVar) {
            zzk zzkVar2;
            do {
                zzkVar2 = zzfsxVar.waiters;
                if (zzkVar == zzkVar2) {
                    return zzkVar2;
                }
            } while (!zzg(zzfsxVar, zzkVar2, zzkVar));
            return zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzfsx.zza
        final void zzc(zzk zzkVar, @CheckForNull zzk zzkVar2) {
            zza.putObject(zzkVar, zzf, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfsx.zza
        final void zzd(zzk zzkVar, Thread thread) {
            zza.putObject(zzkVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzfsx.zza
        final boolean zze(zzfsx zzfsxVar, @CheckForNull zzd zzdVar, zzd zzdVar2) {
            return zzfta.zza(zza, zzfsxVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfsx.zza
        final boolean zzf(zzfsx zzfsxVar, @CheckForNull Object obj, Object obj2) {
            return zzfta.zza(zza, zzfsxVar, zzd, obj, obj2);
        }

        @Override // com.google.android.gms.internal.ads.zzfsx.zza
        final boolean zzg(zzfsx zzfsxVar, @CheckForNull zzk zzkVar, @CheckForNull zzk zzkVar2) {
            return zzfta.zza(zza, zzfsxVar, zzc, zzkVar, zzkVar2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
    /* loaded from: classes.dex */
    public final class zzk {
        static final zzk zza = new zzk(false);
        @CheckForNull
        volatile zzk next;
        @CheckForNull
        volatile Thread thread;

        zzk() {
            zzfsx.zzba.zzd(this, Thread.currentThread());
        }

        zzk(boolean z) {
        }
    }

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        zza zzgVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        zzd = z;
        zzaZ = Logger.getLogger(zzfsx.class.getName());
        try {
            zzgVar = new zzj(null);
            th2 = null;
            th = null;
        } catch (Error | RuntimeException e) {
            try {
                th2 = e;
                zzgVar = new zze(AtomicReferenceFieldUpdater.newUpdater(zzk.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(zzk.class, zzk.class, "next"), AtomicReferenceFieldUpdater.newUpdater(zzfsx.class, zzk.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(zzfsx.class, zzd.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(zzfsx.class, Object.class, "value"));
                th = null;
            } catch (Error | RuntimeException e2) {
                th = e2;
                th2 = e;
                zzgVar = new zzg(null);
            }
        }
        zzba = zzgVar;
        if (th != null) {
            Logger logger = zzaZ;
            logger.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        zzbd = new Object();
    }

    private final void zzA(zzk zzkVar) {
        zzkVar.thread = null;
        while (true) {
            zzk zzkVar2 = this.waiters;
            if (zzkVar2 != zzk.zza) {
                zzk zzkVar3 = null;
                while (zzkVar2 != null) {
                    zzk zzkVar4 = zzkVar2.next;
                    if (zzkVar2.thread != null) {
                        zzkVar3 = zzkVar2;
                    } else if (zzkVar3 != null) {
                        zzkVar3.next = zzkVar4;
                        if (zzkVar3.thread == null) {
                            break;
                        }
                    } else if (!zzba.zzg(this, zzkVar2, zzkVar4)) {
                        break;
                    }
                    zzkVar2 = zzkVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object zzB(Object obj) throws ExecutionException {
        if (obj instanceof zzb) {
            Throwable th = ((zzb) obj).zzd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof zzc) {
            throw new ExecutionException(((zzc) obj).zzb);
        } else {
            if (obj == zzbd) {
                return null;
            }
            return obj;
        }
    }

    public static Object zzf(zzfut zzfutVar) {
        Throwable zzm;
        if (zzfutVar instanceof zzh) {
            Object obj = ((zzfsx) zzfutVar).value;
            if (obj instanceof zzb) {
                zzb zzbVar = (zzb) obj;
                if (zzbVar.zzc) {
                    Throwable th = zzbVar.zzd;
                    obj = th != null ? new zzb(false, th) : zzb.zzb;
                }
            }
            obj.getClass();
            return obj;
        } else if (!(zzfutVar instanceof zzfvm) || (zzm = ((zzfvm) zzfutVar).zzm()) == null) {
            boolean isCancelled = zzfutVar.isCancelled();
            if ((!zzd) & isCancelled) {
                zzb zzbVar2 = zzb.zzb;
                zzbVar2.getClass();
                return zzbVar2;
            }
            try {
                Object zzg2 = zzg(zzfutVar);
                if (!isCancelled) {
                    return zzg2 == null ? zzbd : zzg2;
                }
                String valueOf = String.valueOf(zzfutVar);
                return new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + valueOf));
            } catch (Error e) {
                e = e;
                return new zzc(e);
            } catch (CancellationException e2) {
                if (!isCancelled) {
                    return new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(String.valueOf(zzfutVar))), e2));
                }
                return new zzb(false, e2);
            } catch (RuntimeException e3) {
                e = e3;
                return new zzc(e);
            } catch (ExecutionException e4) {
                if (isCancelled) {
                    return new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(String.valueOf(zzfutVar))), e4));
                }
                return new zzc(e4.getCause());
            }
        } else {
            return new zzc(zzm);
        }
    }

    private static Object zzg(Future future) throws ExecutionException {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private final void zzv(StringBuilder sb) {
        try {
            Object zzg2 = zzg(this);
            sb.append("SUCCESS, result=[");
            if (zzg2 == null) {
                sb.append("null");
            } else if (zzg2 == this) {
                sb.append("this future");
            } else {
                sb.append(zzg2.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(zzg2)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    private final void zzw(StringBuilder sb) {
        String concat;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.value;
        if (obj instanceof zzf) {
            sb.append(", setFuture=[");
            zzx(sb, ((zzf) obj).zzb);
            sb.append("]");
        } else {
            try {
                concat = zzfoj.zza(zza());
            } catch (RuntimeException | StackOverflowError e) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(String.valueOf(e.getClass())));
            }
            if (concat != null) {
                sb.append(", info=[");
                sb.append(concat);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            zzv(sb);
        }
    }

    private final void zzx(StringBuilder sb, @CheckForNull Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (RuntimeException | StackOverflowError e) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    public static void zzy(zzfsx zzfsxVar, boolean z) {
        zzd zzdVar = null;
        while (true) {
            for (zzk zzb2 = zzba.zzb(zzfsxVar, zzk.zza); zzb2 != null; zzb2 = zzb2.next) {
                Thread thread = zzb2.thread;
                if (thread != null) {
                    zzb2.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                zzfsxVar.zzr();
            }
            zzfsxVar.zzb();
            zzd zzdVar2 = zzdVar;
            zzd zza2 = zzba.zza(zzfsxVar, zzd.zza);
            zzd zzdVar3 = zzdVar2;
            while (zza2 != null) {
                zzd zzdVar4 = zza2.next;
                zza2.next = zzdVar3;
                zzdVar3 = zza2;
                zza2 = zzdVar4;
            }
            while (zzdVar3 != null) {
                zzdVar = zzdVar3.next;
                Runnable runnable = zzdVar3.zzb;
                runnable.getClass();
                if (runnable instanceof zzf) {
                    zzf zzfVar = (zzf) runnable;
                    zzfsxVar = zzfVar.zza;
                    if (zzfsxVar.value == zzfVar) {
                        if (zzba.zzf(zzfsxVar, zzfVar, zzf(zzfVar.zzb))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = zzdVar3.zzc;
                    executor.getClass();
                    zzz(runnable, executor);
                }
                zzdVar3 = zzdVar;
            }
            return;
            z = false;
        }
    }

    private static void zzz(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = zzaZ;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + valueOf + " with executor " + valueOf2, (Throwable) e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0056, code lost:
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.value
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzfsx.zzf
            r2 = 0
            r3 = 1
            if (r0 != 0) goto La
            r4 = 1
            goto Lb
        La:
            r4 = 0
        Lb:
            r1 = r1 | r4
            if (r1 == 0) goto L5f
            boolean r1 = com.google.android.gms.internal.ads.zzfsx.zzd
            if (r1 == 0) goto L1f
            com.google.android.gms.internal.ads.zzfsx$zzb r1 = new com.google.android.gms.internal.ads.zzfsx$zzb
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r8, r4)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            com.google.android.gms.internal.ads.zzfsx$zzb r1 = com.google.android.gms.internal.ads.zzfsx.zzb.zza
            goto L26
        L24:
            com.google.android.gms.internal.ads.zzfsx$zzb r1 = com.google.android.gms.internal.ads.zzfsx.zzb.zzb
        L26:
            r1.getClass()
        L29:
            r5 = 0
            r4 = r7
        L2b:
            com.google.android.gms.internal.ads.zzfsx$zza r6 = com.google.android.gms.internal.ads.zzfsx.zzba
            boolean r6 = r6.zzf(r4, r0, r1)
            if (r6 == 0) goto L58
            zzy(r4, r8)
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzfsx.zzf
            if (r4 == 0) goto L56
            com.google.android.gms.internal.ads.zzfsx$zzf r0 = (com.google.android.gms.internal.ads.zzfsx.zzf) r0
            com.google.android.gms.internal.ads.zzfut<? extends V> r0 = r0.zzb
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzfsx.zzh
            if (r4 == 0) goto L53
            r4 = r0
            com.google.android.gms.internal.ads.zzfsx r4 = (com.google.android.gms.internal.ads.zzfsx) r4
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L4b
            r5 = 1
            goto L4c
        L4b:
            r5 = 0
        L4c:
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.zzfsx.zzf
            r5 = r5 | r6
            if (r5 == 0) goto L56
            r5 = 1
            goto L2b
        L53:
            r0.cancel(r8)
        L56:
            r2 = 1
            goto L5f
        L58:
            java.lang.Object r0 = r4.value
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.zzfsx.zzf
            if (r6 != 0) goto L2b
            r2 = r5
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfsx.cancel(boolean):boolean");
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) && (!(obj2 instanceof zzf))) {
                return zzB(obj2);
            }
            zzk zzkVar = this.waiters;
            if (zzkVar != zzk.zza) {
                zzk zzkVar2 = new zzk();
                do {
                    zza zzaVar = zzba;
                    zzaVar.zzc(zzkVar2, zzkVar);
                    if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
                        do {
                            LockSupport.park(this);
                            if (Thread.interrupted()) {
                                zzA(zzkVar2);
                                throw new InterruptedException();
                            }
                            obj = this.value;
                        } while (!((obj != null) & (!(obj instanceof zzf))));
                        return zzB(obj);
                    }
                    zzkVar = this.waiters;
                } while (zzkVar != zzk.zza);
                Object obj3 = this.value;
                obj3.getClass();
                return zzB(obj3);
            }
            Object obj32 = this.value;
            obj32.getClass();
            return zzB(obj32);
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.value instanceof zzb;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.value;
        return (obj != null) & (!(obj instanceof zzf));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            zzv(sb);
        } else {
            zzw(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    @CheckForNull
    public String zza() {
        if (this instanceof ScheduledFuture) {
            long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
            return "remaining delay=[" + delay + " ms]";
        }
        return null;
    }

    protected void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzfut
    public void zzc(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzfnu.zzc(runnable, "Runnable was null.");
        zzfnu.zzc(executor, "Executor was null.");
        if (isDone() || (zzdVar = this.listeners) == zzd.zza) {
            zzz(runnable, executor);
        }
        zzd zzdVar2 = new zzd(runnable, executor);
        do {
            zzdVar2.next = zzdVar;
            if (zzba.zze(this, zzdVar, zzdVar2)) {
                return;
            }
            zzdVar = this.listeners;
        } while (zzdVar != zzd.zza);
        zzz(runnable, executor);
    }

    public boolean zzd(Object obj) {
        if (obj == null) {
            obj = zzbd;
        }
        if (zzba.zzf(this, null, obj)) {
            zzy(this, false);
            return true;
        }
        return false;
    }

    public boolean zze(Throwable th) {
        Objects.requireNonNull(th);
        if (zzba.zzf(this, null, new zzc(th))) {
            zzy(this, false);
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfvm
    @CheckForNull
    public final Throwable zzm() {
        if (this instanceof zzh) {
            Object obj = this.value;
            if (obj instanceof zzc) {
                return ((zzc) obj).zzb;
            }
            return null;
        }
        return null;
    }

    protected void zzr() {
    }

    public final void zzs(@CheckForNull Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(zzu());
        }
    }

    public final boolean zzu() {
        Object obj = this.value;
        return (obj instanceof zzb) && ((zzb) obj).zzc;
    }

    public final boolean zzt(zzfut zzfutVar) {
        zzc zzcVar;
        Objects.requireNonNull(zzfutVar);
        Object obj = this.value;
        if (obj == null) {
            if (zzfutVar.isDone()) {
                if (zzba.zzf(this, null, zzf(zzfutVar))) {
                    zzy(this, false);
                    return true;
                }
                return false;
            }
            zzf zzfVar = new zzf(this, zzfutVar);
            if (zzba.zzf(this, null, zzfVar)) {
                try {
                    zzfutVar.zzc(zzfVar, zzftx.INSTANCE);
                } catch (Error | RuntimeException e) {
                    try {
                        zzcVar = new zzc(e);
                    } catch (Error | RuntimeException unused) {
                        zzcVar = zzc.zza;
                    }
                    zzba.zzf(this, zzfVar, zzcVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof zzb) {
            zzfutVar.cancel(((zzb) obj).zzc);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z = true;
            if ((obj != null) & (!(obj instanceof zzf))) {
                return zzB(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                zzk zzkVar = this.waiters;
                if (zzkVar != zzk.zza) {
                    zzk zzkVar2 = new zzk();
                    do {
                        zza zzaVar = zzba;
                        zzaVar.zzc(zzkVar2, zzkVar);
                        if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (Thread.interrupted()) {
                                    zzA(zzkVar2);
                                    throw new InterruptedException();
                                }
                                Object obj2 = this.value;
                                if (!((obj2 != null) & (!(obj2 instanceof zzf)))) {
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    return zzB(obj2);
                                }
                            } while (nanos >= 1000);
                            zzA(zzkVar2);
                        } else {
                            zzkVar = this.waiters;
                        }
                    } while (zzkVar != zzk.zza);
                    Object obj3 = this.value;
                    obj3.getClass();
                    return zzB(obj3);
                }
                Object obj32 = this.value;
                obj32.getClass();
                return zzB(obj32);
            }
            while (nanos > 0) {
                Object obj4 = this.value;
                if (!((obj4 != null) & (!(obj4 instanceof zzf)))) {
                    if (!Thread.interrupted()) {
                        nanos = nanoTime - System.nanoTime();
                    } else {
                        throw new InterruptedException();
                    }
                } else {
                    return zzB(obj4);
                }
            }
            String zzfsxVar = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(Locale.ROOT);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j2 = -nanos;
                long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
                long nanos2 = j2 - timeUnit.toNanos(convert);
                if (convert != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (convert > 0) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(" ");
                }
                if (z) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(str + " for " + zzfsxVar);
        }
        throw new InterruptedException();
    }
}
