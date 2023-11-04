package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.p1;
import com.mobirix.airhockey.airhockey;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class q1 {
    public static final b a;

    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract int a(int i, byte[] bArr, int i2, int i3);

        public abstract int a(CharSequence charSequence, byte[] bArr, int i, int i2);

        public final String a(ByteBuffer byteBuffer, int i, int i2) throws z {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (i < i3) {
                    byte b = byteBuffer.get(i);
                    if (!a.a(b)) {
                        break;
                    }
                    i++;
                    cArr[i4] = (char) b;
                    i4++;
                }
                int i5 = i4;
                while (i < i3) {
                    int i6 = i + 1;
                    byte b2 = byteBuffer.get(i);
                    if (a.a(b2)) {
                        int i7 = i5 + 1;
                        cArr[i5] = (char) b2;
                        i = i6;
                        while (true) {
                            i5 = i7;
                            if (i < i3) {
                                byte b3 = byteBuffer.get(i);
                                if (!a.a(b3)) {
                                    break;
                                }
                                i++;
                                i7 = i5 + 1;
                                cArr[i5] = (char) b3;
                            }
                        }
                    } else if (a.b(b2)) {
                        if (i6 < i3) {
                            a.a(b2, byteBuffer.get(i6), cArr, i5);
                            i = i6 + 1;
                            i5++;
                        } else {
                            throw z.c();
                        }
                    } else if (a.c(b2)) {
                        if (i6 < i3 - 1) {
                            int i8 = i6 + 1;
                            a.a(b2, byteBuffer.get(i6), byteBuffer.get(i8), cArr, i5);
                            i = i8 + 1;
                            i5++;
                        } else {
                            throw z.c();
                        }
                    } else if (i6 < i3 - 2) {
                        int i9 = i6 + 1;
                        byte b4 = byteBuffer.get(i6);
                        int i10 = i9 + 1;
                        a.a(b2, b4, byteBuffer.get(i9), byteBuffer.get(i10), cArr, i5);
                        i5 = i5 + 1 + 1;
                        i = i10 + 1;
                    } else {
                        throw z.c();
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }

        public abstract String a(byte[] bArr, int i, int i2) throws z;

        public abstract String b(ByteBuffer byteBuffer, int i, int i2) throws z;
    }

    /* loaded from: classes.dex */
    public static class d extends IllegalArgumentException {
        public d(int i, int i2) {
            super("Unpaired surrogate at index " + i + " of " + i2);
        }
    }

    static {
        b cVar;
        if ((p1.g && p1.f) && !com.fyber.inneractive.sdk.protobuf.d.a()) {
            cVar = new e();
        } else {
            cVar = new c();
        }
        a = cVar;
    }

    public static int a(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    public static int a(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int a(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    public static boolean a(byte[] bArr) {
        return a.a(0, bArr, 0, bArr.length) == 0;
    }

    public static boolean b(byte[] bArr, int i, int i2) {
        return a.a(0, bArr, i, i2) == 0;
    }

    public static int a(byte[] bArr, int i, int i2) {
        byte b2 = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    return a(b2, bArr[i], bArr[i + 1]);
                }
                throw new AssertionError();
            }
            return a(b2, bArr[i]);
        }
        return a(b2);
    }

    /* loaded from: classes.dex */
    public static class a {
        public static void a(byte b, byte b2, char[] cArr, int i) throws z {
            if (b >= -62 && !d(b2)) {
                cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
                return;
            }
            throw z.c();
        }

        public static boolean a(byte b) {
            return b >= 0;
        }

        public static boolean b(byte b) {
            return b < -32;
        }

        public static boolean c(byte b) {
            return b < -16;
        }

        public static boolean d(byte b) {
            return b > -65;
        }

        public static void a(byte b, byte b2, byte b3, char[] cArr, int i) throws z {
            if (!d(b2) && ((b != -32 || b2 >= -96) && ((b != -19 || b2 < -96) && !d(b3)))) {
                cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
            throw z.c();
        }

        public static void a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws z {
            if (!d(b2) && (((b << 28) + (b2 + airhockey.J_GOO)) >> 30) == 0 && !d(b3) && !d(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
            throw z.c();
        }
    }

    public static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                throw new d(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i3 + 4294967296L));
    }

    /* loaded from: classes.dex */
    public static final class c extends b {
        /* JADX WARN: Code restructure failed: missing block: B:138:0x001c, code lost:
            if (r13[r14] > (-65)) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:156:0x0047, code lost:
            if (r13[r14] > (-65)) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:177:0x0082, code lost:
            if (r13[r14] > (-65)) goto L48;
         */
        @Override // com.fyber.inneractive.sdk.protobuf.q1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int a(int r12, byte[] r13, int r14, int r15) {
            /*
                Method dump skipped, instructions count: 242
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.q1.c.a(int, byte[], int, int):int");
        }

        @Override // com.fyber.inneractive.sdk.protobuf.q1.b
        public String b(ByteBuffer byteBuffer, int i, int i2) throws z {
            return a(byteBuffer, i, i2);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.q1.b
        public String a(byte[] bArr, int i, int i2) throws z {
            if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (i < i3) {
                    byte b = bArr[i];
                    if (!a.a(b)) {
                        break;
                    }
                    i++;
                    cArr[i4] = (char) b;
                    i4++;
                }
                int i5 = i4;
                while (i < i3) {
                    int i6 = i + 1;
                    byte b2 = bArr[i];
                    if (a.a(b2)) {
                        int i7 = i5 + 1;
                        cArr[i5] = (char) b2;
                        i = i6;
                        while (true) {
                            i5 = i7;
                            if (i < i3) {
                                byte b3 = bArr[i];
                                if (!a.a(b3)) {
                                    break;
                                }
                                i++;
                                i7 = i5 + 1;
                                cArr[i5] = (char) b3;
                            }
                        }
                    } else if (a.b(b2)) {
                        if (i6 < i3) {
                            a.a(b2, bArr[i6], cArr, i5);
                            i = i6 + 1;
                            i5++;
                        } else {
                            throw z.c();
                        }
                    } else if (a.c(b2)) {
                        if (i6 < i3 - 1) {
                            int i8 = i6 + 1;
                            a.a(b2, bArr[i6], bArr[i8], cArr, i5);
                            i = i8 + 1;
                            i5++;
                        } else {
                            throw z.c();
                        }
                    } else if (i6 < i3 - 2) {
                        int i9 = i6 + 1;
                        byte b4 = bArr[i6];
                        int i10 = i9 + 1;
                        a.a(b2, b4, bArr[i9], bArr[i10], cArr, i5);
                        i5 = i5 + 1 + 1;
                        i = i10 + 1;
                    } else {
                        throw z.c();
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }

        /* JADX WARN: Code restructure failed: missing block: B:75:0x001d, code lost:
            return r10 + r0;
         */
        @Override // com.fyber.inneractive.sdk.protobuf.q1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int a(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
            /*
                Method dump skipped, instructions count: 254
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.q1.c.a(java.lang.CharSequence, byte[], int, int):int");
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends b {
        /* JADX WARN: Code restructure failed: missing block: B:153:0x0035, code lost:
            if (com.fyber.inneractive.sdk.protobuf.p1.a(r23, r8) > (-65)) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:171:0x0066, code lost:
            if (com.fyber.inneractive.sdk.protobuf.p1.a(r23, r8) > (-65)) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:192:0x00ab, code lost:
            if (com.fyber.inneractive.sdk.protobuf.p1.a(r23, r8) > (-65)) goto L51;
         */
        @Override // com.fyber.inneractive.sdk.protobuf.q1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int a(int r22, byte[] r23, int r24, int r25) {
            /*
                Method dump skipped, instructions count: 372
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.q1.e.a(int, byte[], int, int):int");
        }

        @Override // com.fyber.inneractive.sdk.protobuf.q1.b
        public String b(ByteBuffer byteBuffer, int i, int i2) throws z {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
                long a = p1.a(byteBuffer) + i;
                long j = i2 + a;
                char[] cArr = new char[i2];
                int i3 = 0;
                while (a < j) {
                    byte a2 = p1.e.a(a);
                    if (!a.a(a2)) {
                        break;
                    }
                    a++;
                    cArr[i3] = (char) a2;
                    i3++;
                }
                int i4 = i3;
                while (a < j) {
                    long j2 = a + 1;
                    p1.d dVar = p1.e;
                    byte a3 = dVar.a(a);
                    if (a.a(a3)) {
                        cArr[i4] = (char) a3;
                        i4++;
                        a = j2;
                        while (a < j) {
                            byte a4 = p1.e.a(a);
                            if (!a.a(a4)) {
                                break;
                            }
                            a++;
                            cArr[i4] = (char) a4;
                            i4++;
                        }
                    } else if (a.b(a3)) {
                        if (j2 < j) {
                            a.a(a3, dVar.a(j2), cArr, i4);
                            i4++;
                            a = j2 + 1;
                        } else {
                            throw z.c();
                        }
                    } else if (a.c(a3)) {
                        if (j2 < j - 1) {
                            long j3 = j2 + 1;
                            a.a(a3, dVar.a(j2), dVar.a(j3), cArr, i4);
                            i4++;
                            a = j3 + 1;
                        } else {
                            throw z.c();
                        }
                    } else if (j2 < j - 2) {
                        long j4 = j2 + 1;
                        long j5 = j4 + 1;
                        a.a(a3, dVar.a(j2), dVar.a(j4), dVar.a(j5), cArr, i4);
                        i4 = i4 + 1 + 1;
                        a = j5 + 1;
                    } else {
                        throw z.c();
                    }
                }
                return new String(cArr, 0, i4);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }

        @Override // com.fyber.inneractive.sdk.protobuf.q1.b
        public String a(byte[] bArr, int i, int i2) throws z {
            if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (i < i3) {
                    byte a = p1.a(bArr, i);
                    if (!a.a(a)) {
                        break;
                    }
                    i++;
                    cArr[i4] = (char) a;
                    i4++;
                }
                int i5 = i4;
                while (i < i3) {
                    int i6 = i + 1;
                    byte a2 = p1.a(bArr, i);
                    if (a.a(a2)) {
                        int i7 = i5 + 1;
                        cArr[i5] = (char) a2;
                        i = i6;
                        while (true) {
                            i5 = i7;
                            if (i < i3) {
                                byte a3 = p1.a(bArr, i);
                                if (!a.a(a3)) {
                                    break;
                                }
                                i++;
                                i7 = i5 + 1;
                                cArr[i5] = (char) a3;
                            }
                        }
                    } else if (a.b(a2)) {
                        if (i6 < i3) {
                            a.a(a2, p1.a(bArr, i6), cArr, i5);
                            i = i6 + 1;
                            i5++;
                        } else {
                            throw z.c();
                        }
                    } else if (a.c(a2)) {
                        if (i6 < i3 - 1) {
                            int i8 = i6 + 1;
                            a.a(a2, p1.a(bArr, i6), p1.a(bArr, i8), cArr, i5);
                            i = i8 + 1;
                            i5++;
                        } else {
                            throw z.c();
                        }
                    } else if (i6 < i3 - 2) {
                        int i9 = i6 + 1;
                        int i10 = i9 + 1;
                        a.a(a2, p1.a(bArr, i6), p1.a(bArr, i9), p1.a(bArr, i10), cArr, i5);
                        i5 = i5 + 1 + 1;
                        i = i10 + 1;
                    } else {
                        throw z.c();
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }

        @Override // com.fyber.inneractive.sdk.protobuf.q1.b
        public int a(CharSequence charSequence, byte[] bArr, int i, int i2) {
            char c;
            long j;
            long j2;
            long j3;
            int i3;
            char charAt;
            long j4 = i;
            long j5 = i2 + j4;
            int length = charSequence.length();
            if (length > i2 || bArr.length - i2 < i) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i + i2));
            }
            int i4 = 0;
            while (true) {
                c = 128;
                j = 1;
                if (i4 >= length || (charAt = charSequence.charAt(i4)) >= 128) {
                    break;
                }
                p1.a(bArr, j4, (byte) charAt);
                i4++;
                j4 = 1 + j4;
            }
            if (i4 == length) {
                return (int) j4;
            }
            while (i4 < length) {
                char charAt2 = charSequence.charAt(i4);
                if (charAt2 >= c || j4 >= j5) {
                    if (charAt2 < 2048 && j4 <= j5 - 2) {
                        long j6 = j4 + j;
                        p1.a(bArr, j4, (byte) ((charAt2 >>> 6) | 960));
                        p1.a(bArr, j6, (byte) ((charAt2 & '?') | 128));
                        j2 = j6 + j;
                        j3 = j;
                    } else if ((charAt2 >= 55296 && 57343 >= charAt2) || j4 > j5 - 3) {
                        if (j4 <= j5 - 4) {
                            int i5 = i4 + 1;
                            if (i5 != length) {
                                char charAt3 = charSequence.charAt(i5);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    long j7 = j4 + 1;
                                    p1.a(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                                    long j8 = j7 + 1;
                                    p1.a(bArr, j7, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j9 = j8 + 1;
                                    p1.a(bArr, j8, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j3 = 1;
                                    j2 = j9 + 1;
                                    p1.a(bArr, j9, (byte) ((codePoint & 63) | 128));
                                    i4 = i5;
                                } else {
                                    i4 = i5;
                                }
                            }
                            throw new d(i4 - 1, length);
                        } else if (55296 <= charAt2 && charAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                            throw new d(i4, length);
                        } else {
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + j4);
                        }
                    } else {
                        long j10 = j4 + j;
                        p1.a(bArr, j4, (byte) ((charAt2 >>> '\f') | 480));
                        long j11 = j10 + j;
                        p1.a(bArr, j10, (byte) (((charAt2 >>> 6) & 63) | 128));
                        p1.a(bArr, j11, (byte) ((charAt2 & '?') | 128));
                        j2 = j11 + 1;
                        j3 = 1;
                    }
                    i4++;
                    c = 128;
                    long j12 = j3;
                    j4 = j2;
                    j = j12;
                } else {
                    long j13 = j4 + j;
                    p1.a(bArr, j4, (byte) charAt2);
                    j3 = j;
                    j2 = j13;
                }
                i4++;
                c = 128;
                long j122 = j3;
                j4 = j2;
                j = j122;
            }
            return (int) j4;
        }

        public static int a(byte[] bArr, int i, long j, int i2) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        return q1.a(i, p1.a(bArr, j), p1.a(bArr, j + 1));
                    }
                    throw new AssertionError();
                }
                return q1.a(i, p1.a(bArr, j));
            }
            return q1.a(i);
        }
    }
}
