package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.9s */
/* loaded from: assets/audience_network.dex */
public final class C03129s {
    public static String[] A06 = {"WwB4b7", "9U9mb9jKte7kllJhP3clLvI5b73", "TDqEL0AoY", "4IvfGYKFDovhkqqhRuF", "llxeZdB1AGHDFzy1eOGJjj7vjbGoDyRo", "wyDFlV", "VELYNO0Lyu3d7b6TF4mD3ooMbXgWeIiM", "iuggwru9v4rPlYsWAIf5ZcemLGs"};
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public long A04;
    public F2 A05;

    public final int A00() {
        return this.A05.A00;
    }

    public final int A01(int i) {
        return this.A05.A04[i].A00;
    }

    public final int A02(int i) {
        return this.A05.A04[i].A00();
    }

    public final int A03(int i, int i2) {
        return this.A05.A04[i].A01(i2);
    }

    public final int A04(long j) {
        return this.A05.A00(j);
    }

    public final int A05(long j) {
        return this.A05.A01(j);
    }

    public final long A06() {
        return this.A05.A01;
    }

    public final long A07() {
        return this.A01;
    }

    public final long A08() {
        return AnonymousClass99.A01(this.A04);
    }

    public final long A09(int i) {
        return this.A05.A03[i];
    }

    public final long A0A(int i, int i2) {
        F0 f0 = this.A05.A04[i];
        if (f0.A00 != -1) {
            long[] jArr = f0.A02;
            if (A06[2].length() != 9) {
                throw new RuntimeException();
            }
            A06[2] = "IGBMGqW3m";
            return jArr[i2];
        }
        return -9223372036854775807L;
    }

    public final C03129s A0B(Object obj, Object obj2, int i, long j, long j2) {
        return A0C(obj, obj2, i, j, j2, F2.A06);
    }

    public final C03129s A0C(Object obj, Object obj2, int i, long j, long j2, F2 f2) {
        this.A02 = obj;
        this.A03 = obj2;
        this.A00 = i;
        this.A01 = j;
        this.A04 = j2;
        this.A05 = f2;
        return this;
    }

    public final boolean A0D(int i) {
        return !this.A05.A04[i].A02();
    }

    public final boolean A0E(int i, int i2) {
        F0 f0 = this.A05.A04[i];
        return (f0.A00 == -1 || f0.A01[i2] == 0) ? false : true;
    }
}
