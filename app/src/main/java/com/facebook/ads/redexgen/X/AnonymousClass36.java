package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;

/* renamed from: com.facebook.ads.redexgen.X.36 */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass36 extends BK implements Comparable<AnonymousClass36> {
    public static String[] A01 = {"vLCiYmslEIO8pJY4aanHdZ7QImU9IQkS", "qKFqw4ir5U7ZeqBFISN4Zo", "jSoy0i9dh5CIlqD3dL3njwneSWVMxCrT", "BKJrnveI01f5DMln9XIqip", "hfsDVMr2hJ3AGnbNzVU4gQALPe", "leKVUsav6grkPqjsrOtcGAgCR95imu9O", "O7i9KhUKrr", "K8BeTV5Og7G1zujvrlQB8lJ7v8"};
    public long A00;

    public AnonymousClass36() {
    }

    @Override // java.lang.Comparable
    /* renamed from: A00 */
    public final int compareTo(@NonNull AnonymousClass36 anonymousClass36) {
        if (A04() != anonymousClass36.A04()) {
            return A04() ? 1 : -1;
        }
        long j = ((C0865Wg) this).A00 - ((C0865Wg) anonymousClass36).A00;
        if (j == 0) {
            long j2 = this.A00;
            long j3 = anonymousClass36.A00;
            if (A01[0].charAt(21) != 'Z') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[5] = "YA5mbgM7zSdIgspcc6jY8TfuEeXD2Ehe";
            strArr[2] = "tQeim9pVy3EkTEWbzOifosISYdgikQjr";
            j = j2 - j3;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
