package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.i;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class b extends d {
    public static final int[] e = new int[0];
    public final e.a c = null;
    public final AtomicReference<C0046b> d = new AtomicReference<>(new C0046b());

    /* loaded from: classes.dex */
    public static final class a {
        public final int a;
        public final int b;
        public final String c;

        public a(int i, int i2, String str) {
            this.a = i;
            this.b = i2;
            this.c = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && TextUtils.equals(this.c, aVar.c);
        }

        public int hashCode() {
            int i = ((this.a * 31) + this.b) * 31;
            String str = this.c;
            return i + (str != null ? str.hashCode() : 0);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b$b */
    /* loaded from: classes.dex */
    public static final class C0046b {
        public final String a;
        public final String b;
        public final boolean c;
        public final boolean d;
        public final int e;
        public final int f;
        public final int g;
        public final boolean h;
        public final boolean i;
        public final int j;
        public final int k;
        public final boolean l;

        public C0046b() {
            this(null, null, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0046b.class != obj.getClass()) {
                return false;
            }
            C0046b c0046b = (C0046b) obj;
            return this.c == c0046b.c && this.d == c0046b.d && this.e == c0046b.e && this.f == c0046b.f && this.h == c0046b.h && this.i == c0046b.i && this.l == c0046b.l && this.j == c0046b.j && this.k == c0046b.k && this.g == c0046b.g && TextUtils.equals(this.a, c0046b.a) && TextUtils.equals(this.b, c0046b.b);
        }

        public int hashCode() {
            return (((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.l ? 1 : 0)) * 31) + this.j) * 31) + this.k;
        }

        public C0046b(String str, String str2, boolean z, boolean z2, int i, int i2, int i3, boolean z3, boolean z4, int i4, int i5, boolean z5) {
            this.a = null;
            this.b = null;
            this.c = z;
            this.d = z2;
            this.e = i;
            this.f = i2;
            this.g = i3;
            this.h = z3;
            this.i = z4;
            this.j = i4;
            this.k = i5;
            this.l = z5;
        }
    }

    public b(e.a aVar) {
    }

    public static int a(int i, int i2) {
        if (i == -1) {
            return i2 == -1 ? 0 : -1;
        } else if (i2 == -1) {
            return 1;
        } else {
            return i - i2;
        }
    }

    public static boolean a(int i, boolean z) {
        int i2 = i & 3;
        return i2 == 3 || (z && i2 == 2);
    }

    public static boolean a(i iVar, String str, int i, int i2, int i3, int i4, int i5) {
        if (!a(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str == null || u.a(iVar.f, str)) {
            int i6 = iVar.j;
            if (i6 == -1 || i6 <= i3) {
                int i7 = iVar.k;
                if (i7 == -1 || i7 <= i4) {
                    int i8 = iVar.b;
                    return i8 == -1 || i8 <= i5;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean a(i iVar, int i, a aVar) {
        if (a(i, false) && iVar.r == aVar.a && iVar.s == aVar.b) {
            String str = aVar.c;
            return str == null || TextUtils.equals(str, iVar.f);
        }
        return false;
    }

    public static boolean a(i iVar, String str) {
        if (str != null) {
            String str2 = iVar.y;
            int i = u.a;
            if (TextUtils.equals(str, str2 == null ? null : new Locale(str2).getLanguage())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<java.lang.Integer> a(com.fyber.inneractive.sdk.player.exoplayer2.source.r r12, int r13, int r14, boolean r15) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r12.a
            r0.<init>(r1)
            r1 = 0
            r2 = 0
        L9:
            int r3 = r12.a
            if (r2 >= r3) goto L17
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.add(r3)
            int r2 = r2 + 1
            goto L9
        L17:
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == r2) goto La6
            if (r14 != r2) goto L20
            goto La6
        L20:
            r3 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
        L24:
            int r5 = r12.a
            r6 = 1
            if (r3 >= r5) goto L80
            com.fyber.inneractive.sdk.player.exoplayer2.i[] r5 = r12.b
            r5 = r5[r3]
            int r7 = r5.j
            if (r7 <= 0) goto L7d
            int r8 = r5.k
            if (r8 <= 0) goto L7d
            if (r15 == 0) goto L45
            if (r7 <= r8) goto L3b
            r9 = 1
            goto L3c
        L3b:
            r9 = 0
        L3c:
            if (r13 <= r14) goto L3f
            goto L40
        L3f:
            r6 = 0
        L40:
            if (r9 == r6) goto L45
            r6 = r13
            r9 = r14
            goto L47
        L45:
            r9 = r13
            r6 = r14
        L47:
            int r10 = r7 * r6
            int r11 = r8 * r9
            if (r10 < r11) goto L57
            android.graphics.Point r6 = new android.graphics.Point
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.util.u.a(r11, r7)
            r6.<init>(r9, r7)
            goto L61
        L57:
            android.graphics.Point r7 = new android.graphics.Point
            int r8 = com.fyber.inneractive.sdk.player.exoplayer2.util.u.a(r10, r8)
            r7.<init>(r8, r6)
            r6 = r7
        L61:
            int r7 = r5.j
            int r5 = r5.k
            int r8 = r7 * r5
            int r9 = r6.x
            float r9 = (float) r9
            r10 = 1065017672(0x3f7ae148, float:0.98)
            float r9 = r9 * r10
            int r9 = (int) r9
            if (r7 < r9) goto L7d
            int r6 = r6.y
            float r6 = (float) r6
            float r6 = r6 * r10
            int r6 = (int) r6
            if (r5 < r6) goto L7d
            if (r8 >= r4) goto L7d
            r4 = r8
        L7d:
            int r3 = r3 + 1
            goto L24
        L80:
            if (r4 == r2) goto La6
            int r13 = r0.size()
            int r13 = r13 - r6
        L87:
            if (r13 < 0) goto La6
            java.lang.Object r14 = r0.get(r13)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            com.fyber.inneractive.sdk.player.exoplayer2.i[] r15 = r12.b
            r14 = r15[r14]
            int r14 = r14.b()
            r15 = -1
            if (r14 == r15) goto La0
            if (r14 <= r4) goto La3
        La0:
            r0.remove(r13)
        La3:
            int r13 = r13 + (-1)
            goto L87
        La6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b.a(com.fyber.inneractive.sdk.player.exoplayer2.source.r, int, int, boolean):java.util.List");
    }
}
