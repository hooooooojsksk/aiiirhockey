package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.2m */
/* loaded from: assets/audience_network.dex */
public class C01392m<K, V> {
    public static int A03;
    public static int A04;
    public static Object[] A05;
    public static Object[] A06;
    public static byte[] A07;
    public static String[] A08 = {"BrVHgBkmBksyBnnjIq0pHnqXAu9AUg3j", "iIth6RrlZFIJsCIcgsKekGbs32ChyRjv", "Uwdt1z4SmD1Mf7UvGeSYdNXOfhFYTYnY", "QITUqyWPG2VnlGrB2a6hYhF3R3KaavLD", "arDW8RiIBmWFNCZvgTvY8WvuJ76u3VTs", "pOGA2rk9V0ZEl", "438Cia9wbNYnLnXWpHR8BTCUnyjltaF2", "slnYcYZFDBEgJMtczrpzy3D6NQdPiCOq"};
    public int[] A01 = C01292c.A00;
    public Object[] A02 = C01292c.A02;
    public int A00 = 0;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 105);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        if (A08[5].length() == 11) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[0] = "Xtbm9MFCOkvOfDux5Me3XhO5K6Bs7EUd";
        strArr[1] = "PZcI0QBOeZ0LYFf6gJzuFWLZdUoY6utj";
        A07 = new byte[]{-69, 7, -5, -4, 6, -77, -32, -12, 3, -68, -62, -74, 3, 5};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final V A0A(int i) {
        int i2;
        Object[] objArr = this.A02;
        V v = (V) objArr[(i << 1) + 1];
        int i3 = this.A00;
        if (i3 <= 1) {
            A06(this.A01, objArr, i3);
            this.A01 = C01292c.A00;
            this.A02 = C01292c.A02;
            i2 = 0;
        } else {
            i2 = i3 - 1;
            int[] iArr = this.A01;
            if (iArr.length <= 8 || this.A00 >= iArr.length / 3) {
                if (i < i2) {
                    int[] iArr2 = this.A01;
                    System.arraycopy(iArr2, i + 1, iArr2, i, i2 - i);
                    Object[] objArr2 = this.A02;
                    System.arraycopy(objArr2, (i + 1) << 1, objArr2, i << 1, (i2 - i) << 1);
                }
                Object[] objArr3 = this.A02;
                objArr3[i2 << 1] = null;
                objArr3[(i2 << 1) + 1] = null;
            } else {
                int i4 = i3 > 8 ? i3 + (i3 >> 1) : 8;
                int[] iArr3 = this.A01;
                Object[] objArr4 = this.A02;
                A05(i4);
                if (i3 != this.A00) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr3, 0, this.A01, 0, i);
                    System.arraycopy(objArr4, 0, this.A02, 0, i << 1);
                }
                if (i < i2) {
                    System.arraycopy(iArr3, i + 1, this.A01, i, i2 - i);
                    System.arraycopy(objArr4, (i + 1) << 1, this.A02, i << 1, (i2 - i) << 1);
                }
            }
        }
        int i5 = this.A00;
        String[] strArr = A08;
        if (strArr[0].charAt(11) != strArr[1].charAt(11)) {
            String[] strArr2 = A08;
            strArr2[0] = "xFHRCOjHDqSI1UlNRZSx5FadcPcGQITj";
            strArr2[1] = "4ZMke5GLOi53P3lo3UgzHK3l5Qzb3367";
            if (i3 == i5) {
                this.A00 = i2;
                return v;
            }
            throw new ConcurrentModificationException();
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C01392m) {
            C01392m c01392m = (C01392m) obj;
            if (size() != c01392m.size()) {
                return false;
            }
            for (int i = 0; i < this.A00; i++) {
                try {
                    K A09 = A09(i);
                    V A0B = A0B(i);
                    Object obj2 = c01392m.get(A09);
                    if (A0B == null) {
                        if (obj2 == null && c01392m.containsKey(A09)) {
                        }
                        return false;
                    } else if (!A0B.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException unused) {
                    return false;
                } catch (NullPointerException unused2) {
                    return false;
                }
            }
            return true;
        } else if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.A00; i2++) {
                try {
                    K A092 = A09(i2);
                    V A0B2 = A0B(i2);
                    Object obj3 = map.get(A092);
                    if (A0B2 == null) {
                        if (obj3 == null && map.containsKey(A092)) {
                        }
                        return false;
                    } else if (!A0B2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException unused3) {
                    return false;
                } catch (NullPointerException unused4) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final int hashCode() {
        int[] iArr = this.A01;
        Object[] objArr = this.A02;
        int i = 0;
        int i2 = 0;
        int i3 = 1;
        int i4 = this.A00;
        while (i2 < i4) {
            Object obj = objArr[i3];
            i += iArr[i2] ^ (obj == null ? 0 : obj.hashCode());
            i2++;
            i3 += 2;
        }
        return i;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final V put(K k, V v) {
        int hashCode;
        int A01;
        int i = this.A00;
        if (k == null) {
            hashCode = 0;
            A01 = A00();
        } else {
            hashCode = k.hashCode();
            A01 = A01(k, hashCode);
        }
        if (A01 >= 0) {
            int i2 = (A01 << 1) + 1;
            Object[] objArr = this.A02;
            V v2 = (V) objArr[i2];
            objArr[i2] = v;
            return v2;
        }
        int i3 = A01 ^ (-1);
        if (i >= this.A01.length) {
            int i4 = 4;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i >= 4) {
                i4 = 8;
            }
            int[] iArr = this.A01;
            Object[] objArr2 = this.A02;
            A05(i4);
            if (i != this.A00) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.A01;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.A02, 0, objArr2.length);
            }
            A06(iArr, objArr2, i);
        }
        if (i3 < i) {
            int[] iArr3 = this.A01;
            System.arraycopy(iArr3, i3, iArr3, i3 + 1, i - i3);
            Object[] objArr3 = this.A02;
            System.arraycopy(objArr3, i3 << 1, objArr3, (i3 + 1) << 1, (this.A00 - i3) << 1);
        }
        int i5 = this.A00;
        if (i == i5) {
            int[] iArr4 = this.A01;
            if (i3 < iArr4.length) {
                iArr4[i3] = hashCode;
                Object[] objArr4 = this.A02;
                objArr4[i3 << 1] = k;
                objArr4[(i3 << 1) + 1] = v;
                this.A00 = i5 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    static {
        A04();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2m != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    private final int A00() {
        int i = this.A00;
        if (i == 0) {
            return -1;
        }
        int A02 = A02(this.A01, i, 0);
        if (A02 < 0) {
            return A02;
        }
        int N = A02 << 1;
        if (this.A02[N] == null) {
            return A02;
        }
        int i2 = A02 + 1;
        while (i2 < i) {
            int N2 = this.A01[i2];
            if (N2 != 0) {
                break;
            }
            Object[] objArr = this.A02;
            String[] strArr = A08;
            String str = strArr[2];
            String str2 = strArr[4];
            int index = str.charAt(15);
            int N3 = str2.charAt(15);
            if (index != N3) {
                throw new RuntimeException();
            }
            A08[5] = "5BliZlAS3QBBz9o";
            int N4 = i2 << 1;
            if (objArr[N4] == null) {
                return i2;
            }
            i2++;
        }
        for (int end = A02 - 1; end >= 0; end--) {
            int N5 = this.A01[end];
            if (N5 != 0) {
                break;
            }
            int N6 = end << 1;
            if (this.A02[N6] == null) {
                return end;
            }
        }
        int N7 = i2 ^ (-1);
        return N7;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2m != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    private final int A01(Object obj, int i) {
        int i2 = this.A00;
        if (i2 == 0) {
            if (A08[7].charAt(6) != 'Z') {
                throw new RuntimeException();
            }
            A08[7] = "y399iLZYsEEz0hzdxnUhzykHYZJwaaUE";
            return -1;
        }
        int end = A02(this.A01, i2, i);
        if (end < 0) {
            return end;
        }
        int N = end << 1;
        if (obj.equals(this.A02[N])) {
            return end;
        }
        int i3 = end + 1;
        while (i3 < i2) {
            int N2 = this.A01[i3];
            if (N2 != i) {
                break;
            }
            int N3 = i3 << 1;
            if (obj.equals(this.A02[N3])) {
                return i3;
            }
            i3++;
        }
        for (int end2 = end - 1; end2 >= 0; end2--) {
            int N4 = this.A01[end2];
            if (N4 != i) {
                break;
            }
            int N5 = end2 << 1;
            if (obj.equals(this.A02[N5])) {
                return end2;
            }
        }
        int N6 = i3 ^ (-1);
        return N6;
    }

    public static int A02(int[] iArr, int i, int i2) {
        try {
            return C01292c.A02(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2m != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    private void A05(int i) {
        if (i == 8) {
            synchronized (C0931Yx.class) {
                if (A06 != null) {
                    Object[] objArr = A06;
                    this.A02 = objArr;
                    A06 = (Object[]) objArr[0];
                    this.A01 = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    A04--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0931Yx.class) {
                if (A05 != null) {
                    Object[] objArr2 = A05;
                    this.A02 = objArr2;
                    A05 = (Object[]) objArr2[0];
                    this.A01 = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    A03--;
                    return;
                }
            }
        }
        this.A01 = new int[i];
        this.A02 = new Object[i << 1];
    }

    public static void A06(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0931Yx.class) {
                if (A04 < 10) {
                    objArr[0] = A06;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    A06 = objArr;
                    A04++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0931Yx.class) {
                if (A03 < 10) {
                    objArr[0] = A05;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    A05 = objArr;
                    A03++;
                }
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2m != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final int A07(Object obj) {
        int i = this.A00 * 2;
        Object[] objArr = this.A02;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    int N = i2 >> 1;
                    return N;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                int N2 = i3 >> 1;
                return N2;
            }
        }
        return -1;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2m != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final int A08(Object obj) {
        return obj == null ? A00() : A01(obj, obj.hashCode());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2m != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final K A09(int i) {
        return (K) this.A02[i << 1];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2m != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final V A0B(int i) {
        return (V) this.A02[(i << 1) + 1];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2m != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final V A0C(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.A02;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2m != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final void A0D(int i) {
        int i2 = this.A00;
        int osize = this.A01.length;
        if (osize < i) {
            int[] iArr = this.A01;
            Object[] objArr = this.A02;
            A05(i);
            int osize2 = this.A00;
            if (osize2 > 0) {
                System.arraycopy(iArr, 0, this.A01, 0, i2);
                int osize3 = i2 << 1;
                System.arraycopy(objArr, 0, this.A02, 0, osize3);
            }
            A06(iArr, objArr, i2);
        }
        int osize4 = this.A00;
        if (osize4 == i2) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2m != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final void clear() {
        if (this.A00 > 0) {
            int[] iArr = this.A01;
            Object[] objArr = this.A02;
            int i = this.A00;
            int[] ohashes = C01292c.A00;
            this.A01 = ohashes;
            this.A02 = C01292c.A02;
            this.A00 = 0;
            A06(iArr, objArr, i);
        }
        if (this.A00 <= 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2m != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final boolean containsKey(Object obj) {
        return A08(obj) >= 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2m != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final boolean containsValue(Object obj) {
        return A07(obj) >= 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2m != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final V get(Object obj) {
        int index = A08(obj);
        if (index >= 0) {
            return (V) this.A02[(index << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2m != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final boolean isEmpty() {
        return this.A00 <= 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2m != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final V remove(Object obj) {
        int index = A08(obj);
        if (index >= 0) {
            return A0A(index);
        }
        String[] strArr = A08;
        if (strArr[2].charAt(15) != strArr[4].charAt(15)) {
            throw new RuntimeException();
        }
        A08[5] = "POG7nMkVNzdGaGlGxNMu0E80q";
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2m != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final int size() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2m != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final String toString() {
        if (isEmpty()) {
            return A03(12, 2, 31);
        }
        StringBuilder sb = new StringBuilder(this.A00 * 28);
        sb.append('{');
        for (int i = 0; i < this.A00; i++) {
            if (i > 0) {
                sb.append(A03(10, 2, 45));
            }
            K A09 = A09(i);
            int i2 = A08[5].length();
            if (i2 == 11) {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[6] = "5MoFeGsxqoTSR8Y6IShdOiE5VevAoRo0";
            strArr[3] = "kGPruxXsJMcA49LPD5OztVvQJS4oto1Y";
            String A032 = A03(0, 10, 42);
            if (A09 != this) {
                sb.append(A09);
            } else {
                sb.append(A032);
            }
            sb.append('=');
            V A0B = A0B(i);
            if (A0B != this) {
                sb.append(A0B);
            } else {
                sb.append(A032);
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
