package com.fyber.inneractive.sdk.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class p1 {
    public static final Unsafe a;
    public static final Class<?> b;
    public static final boolean c;
    public static final boolean d;
    public static final d e;
    public static final boolean f;
    public static final boolean g;
    public static final long h;
    public static final long i;
    public static final boolean j;

    /* loaded from: classes.dex */
    public static abstract class d {
        public Unsafe a;

        public d(Unsafe unsafe) {
            this.a = unsafe;
        }

        public abstract byte a(long j);

        public abstract void a(long j, byte[] bArr, long j2, long j3);

        public abstract void a(Object obj, long j, byte b);

        public abstract void a(Object obj, long j, double d);

        public abstract void a(Object obj, long j, float f);

        public abstract void a(Object obj, long j, boolean z);

        public boolean a() {
            Unsafe unsafe = this.a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                p1.a(th);
                return false;
            }
        }

        public abstract boolean a(Object obj, long j);

        public abstract byte b(Object obj, long j);

        public abstract boolean b();

        public abstract double c(Object obj, long j);

        public abstract float d(Object obj, long j);
    }

    static {
        Unsafe unsafe;
        d dVar = null;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new o1());
        } catch (Throwable unused) {
            unsafe = null;
        }
        a = unsafe;
        b = com.fyber.inneractive.sdk.protobuf.d.a;
        boolean c2 = c(Long.TYPE);
        c = c2;
        boolean c3 = c(Integer.TYPE);
        d = c3;
        if (unsafe != null) {
            if (!com.fyber.inneractive.sdk.protobuf.d.a()) {
                dVar = new c(unsafe);
            } else if (c2) {
                dVar = new b(unsafe);
            } else if (c3) {
                dVar = new a(unsafe);
            }
        }
        e = dVar;
        f = dVar == null ? false : dVar.b();
        g = dVar == null ? false : dVar.a();
        h = a(byte[].class);
        a(boolean[].class);
        b(boolean[].class);
        a(int[].class);
        b(int[].class);
        a(long[].class);
        b(long[].class);
        a(float[].class);
        b(float[].class);
        a(double[].class);
        b(double[].class);
        a(Object[].class);
        b(Object[].class);
        Field a2 = a();
        i = (a2 == null || dVar == null) ? -1L : dVar.a.objectFieldOffset(a2);
        j = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static int a(Class<?> cls) {
        if (g) {
            return e.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static int b(Class<?> cls) {
        if (g) {
            return e.a.arrayIndexScale(cls);
        }
        return -1;
    }

    public static boolean c(Class<?> cls) {
        if (com.fyber.inneractive.sdk.protobuf.d.a()) {
            try {
                Class<?> cls2 = b;
                Class<?> cls3 = Boolean.TYPE;
                cls2.getMethod("peekLong", cls, cls3);
                cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
                Class<?> cls4 = Integer.TYPE;
                cls2.getMethod("pokeInt", cls, cls4, cls3);
                cls2.getMethod("peekInt", cls, cls3);
                cls2.getMethod("pokeByte", cls, Byte.TYPE);
                cls2.getMethod("peekByte", cls);
                cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
                cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    public static byte d(Object obj, long j2) {
        return (byte) ((e(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255);
    }

    public static int e(Object obj, long j2) {
        return e.a.getInt(obj, j2);
    }

    public static long f(Object obj, long j2) {
        return e.a.getLong(obj, j2);
    }

    public static Object g(Object obj, long j2) {
        return e.a.getObject(obj, j2);
    }

    /* loaded from: classes.dex */
    public static final class a extends d {
        public a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public void a(Object obj, long j, byte b) {
            if (p1.j) {
                p1.a(obj, j, b);
            } else {
                p1.b(obj, j, b);
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public byte b(Object obj, long j) {
            if (p1.j) {
                return p1.c(obj, j);
            }
            return p1.d(obj, j);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public boolean b() {
            return false;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public double c(Object obj, long j) {
            return Double.longBitsToDouble(this.a.getLong(obj, j));
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public float d(Object obj, long j) {
            return Float.intBitsToFloat(this.a.getInt(obj, j));
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public boolean a(Object obj, long j) {
            if (p1.j) {
                return p1.a(obj, j);
            }
            return p1.b(obj, j);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public void a(Object obj, long j, boolean z) {
            if (p1.j) {
                p1.a(obj, j, z ? (byte) 1 : (byte) 0);
            } else {
                p1.b(obj, j, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public void a(Object obj, long j, float f) {
            this.a.putInt(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public void a(Object obj, long j, double d) {
            this.a.putLong(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public byte a(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public void a(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends d {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public void a(Object obj, long j, byte b) {
            if (p1.j) {
                p1.a(obj, j, b);
            } else {
                p1.b(obj, j, b);
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public byte b(Object obj, long j) {
            if (p1.j) {
                return p1.c(obj, j);
            }
            return p1.d(obj, j);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public boolean b() {
            return false;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public double c(Object obj, long j) {
            return Double.longBitsToDouble(this.a.getLong(obj, j));
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public float d(Object obj, long j) {
            return Float.intBitsToFloat(this.a.getInt(obj, j));
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public boolean a(Object obj, long j) {
            if (p1.j) {
                return p1.a(obj, j);
            }
            return p1.b(obj, j);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public void a(Object obj, long j, boolean z) {
            if (p1.j) {
                p1.a(obj, j, z ? (byte) 1 : (byte) 0);
            } else {
                p1.b(obj, j, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public void a(Object obj, long j, float f) {
            this.a.putInt(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public void a(Object obj, long j, double d) {
            this.a.putLong(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public byte a(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public void a(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }
    }

    public static void a(Object obj, long j2, int i2) {
        e.a.putInt(obj, j2, i2);
    }

    public static void b(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        a(obj, j3, ((255 & b2) << i2) | (e(obj, j3) & ((255 << i2) ^ (-1))));
    }

    public static void a(Object obj, long j2, long j3) {
        e.a.putLong(obj, j2, j3);
    }

    public static void a(Object obj, long j2, boolean z) {
        e.a(obj, j2, z);
    }

    public static boolean b(Object obj, long j2) {
        return d(obj, j2) != 0;
    }

    public static void a(Object obj, long j2, float f2) {
        e.a(obj, j2, f2);
    }

    public static void a(Object obj, long j2, double d2) {
        e.a(obj, j2, d2);
    }

    public static void a(Object obj, long j2, Object obj2) {
        e.a.putObject(obj, j2, obj2);
    }

    public static byte a(byte[] bArr, long j2) {
        return e.b(bArr, h + j2);
    }

    public static void a(byte[] bArr, long j2, byte b2) {
        e.a((Object) bArr, h + j2, b2);
    }

    public static long a(ByteBuffer byteBuffer) {
        d dVar = e;
        return dVar.a.getLong(byteBuffer, i);
    }

    public static byte c(Object obj, long j2) {
        return (byte) ((e(obj, (-4) & j2) >>> ((int) (((j2 ^ (-1)) & 3) << 3))) & 255);
    }

    public static Field a() {
        Field field;
        Field field2;
        if (com.fyber.inneractive.sdk.protobuf.d.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    /* loaded from: classes.dex */
    public static final class c extends d {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public boolean a() {
            if (super.a()) {
                try {
                    Class<?> cls = this.a.getClass();
                    Class<?> cls2 = Long.TYPE;
                    cls.getMethod("getByte", Object.class, cls2);
                    cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                    cls.getMethod("getBoolean", Object.class, cls2);
                    cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                    cls.getMethod("getFloat", Object.class, cls2);
                    cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                    cls.getMethod("getDouble", Object.class, cls2);
                    cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                    return true;
                } catch (Throwable th) {
                    p1.a(th);
                    return false;
                }
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0039 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean b() {
            /*
                r10 = this;
                java.lang.String r0 = "copyMemory"
                sun.misc.Unsafe r1 = r10.a
                java.lang.String r2 = "getLong"
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 != 0) goto Lc
                goto L2e
            Lc:
                java.lang.Class r1 = r1.getClass()     // Catch: java.lang.Throwable -> L32
                java.lang.String r6 = "objectFieldOffset"
                java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L32
                java.lang.Class<java.lang.reflect.Field> r8 = java.lang.reflect.Field.class
                r7[r5] = r8     // Catch: java.lang.Throwable -> L32
                r1.getMethod(r6, r7)     // Catch: java.lang.Throwable -> L32
                java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L32
                java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
                r6[r5] = r7     // Catch: java.lang.Throwable -> L32
                java.lang.Class r7 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L32
                r6[r4] = r7     // Catch: java.lang.Throwable -> L32
                r1.getMethod(r2, r6)     // Catch: java.lang.Throwable -> L32
                java.lang.reflect.Field r1 = com.fyber.inneractive.sdk.protobuf.p1.a()     // Catch: java.lang.Throwable -> L32
                if (r1 != 0) goto L30
            L2e:
                r1 = 0
                goto L37
            L30:
                r1 = 1
                goto L37
            L32:
                r1 = move-exception
                com.fyber.inneractive.sdk.protobuf.p1.a(r1)
                goto L2e
            L37:
                if (r1 != 0) goto L3a
                return r5
            L3a:
                sun.misc.Unsafe r1 = r10.a     // Catch: java.lang.Throwable -> La2
                java.lang.Class r1 = r1.getClass()     // Catch: java.lang.Throwable -> La2
                java.lang.String r6 = "getByte"
                java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> La2
                java.lang.Class r8 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> La2
                r7[r5] = r8     // Catch: java.lang.Throwable -> La2
                r1.getMethod(r6, r7)     // Catch: java.lang.Throwable -> La2
                java.lang.String r6 = "putByte"
                java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> La2
                r7[r5] = r8     // Catch: java.lang.Throwable -> La2
                java.lang.Class r9 = java.lang.Byte.TYPE     // Catch: java.lang.Throwable -> La2
                r7[r4] = r9     // Catch: java.lang.Throwable -> La2
                r1.getMethod(r6, r7)     // Catch: java.lang.Throwable -> La2
                java.lang.String r6 = "getInt"
                java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> La2
                r7[r5] = r8     // Catch: java.lang.Throwable -> La2
                r1.getMethod(r6, r7)     // Catch: java.lang.Throwable -> La2
                java.lang.String r6 = "putInt"
                java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> La2
                r7[r5] = r8     // Catch: java.lang.Throwable -> La2
                java.lang.Class r9 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> La2
                r7[r4] = r9     // Catch: java.lang.Throwable -> La2
                r1.getMethod(r6, r7)     // Catch: java.lang.Throwable -> La2
                java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> La2
                r6[r5] = r8     // Catch: java.lang.Throwable -> La2
                r1.getMethod(r2, r6)     // Catch: java.lang.Throwable -> La2
                java.lang.String r2 = "putLong"
                java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> La2
                r6[r5] = r8     // Catch: java.lang.Throwable -> La2
                r6[r4] = r8     // Catch: java.lang.Throwable -> La2
                r1.getMethod(r2, r6)     // Catch: java.lang.Throwable -> La2
                r2 = 3
                java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> La2
                r6[r5] = r8     // Catch: java.lang.Throwable -> La2
                r6[r4] = r8     // Catch: java.lang.Throwable -> La2
                r6[r3] = r8     // Catch: java.lang.Throwable -> La2
                r1.getMethod(r0, r6)     // Catch: java.lang.Throwable -> La2
                r6 = 5
                java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> La2
                java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
                r6[r5] = r7     // Catch: java.lang.Throwable -> La2
                r6[r4] = r8     // Catch: java.lang.Throwable -> La2
                java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
                r6[r3] = r7     // Catch: java.lang.Throwable -> La2
                r6[r2] = r8     // Catch: java.lang.Throwable -> La2
                r2 = 4
                r6[r2] = r8     // Catch: java.lang.Throwable -> La2
                r1.getMethod(r0, r6)     // Catch: java.lang.Throwable -> La2
                return r4
            La2:
                r0 = move-exception
                com.fyber.inneractive.sdk.protobuf.p1.a(r0)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.p1.c.b():boolean");
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public double c(Object obj, long j) {
            return this.a.getDouble(obj, j);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public float d(Object obj, long j) {
            return this.a.getFloat(obj, j);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public void a(Object obj, long j, byte b) {
            this.a.putByte(obj, j, b);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public boolean a(Object obj, long j) {
            return this.a.getBoolean(obj, j);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public void a(Object obj, long j, boolean z) {
            this.a.putBoolean(obj, j, z);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public void a(Object obj, long j, float f) {
            this.a.putFloat(obj, j, f);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public void a(Object obj, long j, double d) {
            this.a.putDouble(obj, j, d);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public byte a(long j) {
            return this.a.getByte(j);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public byte b(Object obj, long j) {
            return this.a.getByte(obj, j);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public void a(long j, byte[] bArr, long j2, long j3) {
            this.a.copyMemory((Object) null, j, bArr, p1.h + j2, j3);
        }
    }

    public static void a(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = ((((int) j2) ^ (-1)) & 3) << 3;
        a(obj, j3, ((255 & b2) << i2) | (e(obj, j3) & ((255 << i2) ^ (-1))));
    }

    public static boolean a(Object obj, long j2) {
        return c(obj, j2) != 0;
    }

    public static void a(Throwable th) {
        Logger logger = Logger.getLogger(p1.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
    }
}
