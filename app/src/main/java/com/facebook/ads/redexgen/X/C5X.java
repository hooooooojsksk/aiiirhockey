package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5X */
/* loaded from: assets/audience_network.dex */
public class C5X extends AsyncTask<C5Z, Void, Drawable> {
    public static byte[] A03;
    public static String[] A04 = {"1BJo9noXfKND6AuvSNdcB1V3GCwIAiOG", "Zj7TA2K", "dGMOiNue98uIHvh7voSV0LAZFWXYzfEv", "CcnxrNYo5kyWzKS3XGCDqe4PQiCtH", "knheqnusZFI0swerek9wKwEDBcdWqhKt", "XjDOSOe9Ixcmw73z7hfuGI1aFjWKj", "M2ugdIZCKbhB2vBaVocVLhBvD0BsDTY5", "metH7Y2aXkNKgtpuuGKiPWqQd6SU"};
    public final C5Y A00;
    public final C0887Xc A01;
    public final boolean A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @SuppressLint({"CatchGeneralException"})
    private final Drawable A00(C5Z... c5zArr) {
        if (!C0548Jt.A02(this) && c5zArr != null) {
            try {
                if (c5zArr.length >= 1) {
                    String str = c5zArr[0].A01;
                    String str2 = c5zArr[0].A00;
                    Bitmap A0N = new C6M(this.A01).A0N(str, -1, -1);
                    if (A0N != null) {
                        return C0799Tp.A05(this.A01, A0N, this.A02, str2);
                    }
                    return null;
                }
            } catch (Throwable th) {
                C0548Jt.A00(th, this);
                return null;
            }
        }
        return null;
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 118);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{59, 57, 50, 57, 46, 53, 63};
    }

    static {
        A02();
    }

    public C5X(C0887Xc c0887Xc, C5Y c5y, boolean z) {
        this.A01 = c0887Xc;
        this.A00 = c5y;
        this.A02 = z;
    }

    public /* synthetic */ C5X(C0887Xc c0887Xc, C5Y c5y, boolean z, C0909Xy c0909Xy) {
        this(c0887Xc, c5y, z);
    }

    private final void A03(Drawable drawable) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            this.A00.ABB(drawable);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // android.os.AsyncTask
    @SuppressLint({"CatchGeneralException"})
    public final /* bridge */ /* synthetic */ Drawable doInBackground(C5Z[] c5zArr) {
        if (C0548Jt.A02(this)) {
            return null;
        }
        try {
            return A00(c5zArr);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Drawable drawable) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A03(drawable);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
            String[] strArr = A04;
            if (strArr[0].charAt(5) != strArr[4].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[1] = "H4qVqfS";
            strArr2[7] = "3NPSPTmKkS9byZNXvPXu57LevjUG";
        }
    }
}
