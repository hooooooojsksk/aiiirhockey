package com.facebook.ads.redexgen.X;

import android.os.AsyncTask;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.ads.redexgen.X.Hh */
/* loaded from: assets/audience_network.dex */
public final class AsyncTaskC0488Hh extends AsyncTask<QS, Void, QF> implements QP {
    public static byte[] A04;
    public QH A00;
    public HO A01;
    public Exception A02;
    public Executor A03;

    static {
        A02();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final QF A00(QS... qsArr) {
        if (C0548Jt.A02(this)) {
            return null;
        }
        try {
            if (qsArr != null) {
                try {
                    if (qsArr.length > 0) {
                        QF A0J = this.A01.A0J(qsArr[0]);
                        if (this.A01.A0K().A04() && A0J != null) {
                            String.format(Locale.US, A01(108, 21, 6), Integer.valueOf(A0J.A7m()), A0J.getUrl(), A0J.A5s());
                        }
                        if (A0J != null) {
                            return A0J;
                        }
                        throw new IllegalStateException(A01(87, 21, 119));
                    }
                } catch (Exception e) {
                    this.A02 = e;
                    if (this.A01.A0K().A04()) {
                        String.format(Locale.US, A01(64, 23, 98), e.getMessage());
                    }
                    cancel(true);
                    return null;
                }
            }
            throw new IllegalArgumentException(A01(0, 64, 69));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
            return null;
        }
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 101);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-18, 25, -14, 30, 30, 26, -4, 15, 27, 31, 15, 29, 30, -2, 11, 29, 21, -54, 30, 11, 21, 15, 29, -54, 15, 34, 11, 13, 30, 22, 35, -54, 25, 24, 15, -54, 11, 28, 17, 31, 23, 15, 24, 30, -54, 25, 16, -54, 30, 35, 26, 15, -54, -14, 30, 30, 26, -4, 15, 27, 31, 15, 29, 30, 15, 27, 27, 23, -25, 57, 44, 56, 60, 44, 58, 59, -25, 45, 40, 48, 51, 44, 43, 1, -25, -20, 58, 36, 80, 80, 76, -4, 78, 65, 79, 76, 75, airhockey.P_GAME_EXIT, 79, 65, -4, airhockey.P_GAME_STANDBY, 79, -4, airhockey.P_GAME_EXIT, 81, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_MYLOSE, -67, -48, -34, -37, -38, -39, -34, -48, -91, -117, -112, -49, -117, -109, -112, -34, -108, -91, airhockey.J_ERROR, -112, -34};
    }

    public AsyncTaskC0488Hh(HO ho, QH qh, Executor executor) {
        this.A01 = ho;
        this.A00 = qh;
        this.A03 = executor;
    }

    private final void A03(QF result) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            this.A00.AAZ(result);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.QP
    public final void A5K(QS qs) {
        super.executeOnExecutor(this.A03, qs);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ QF doInBackground(QS[] qsArr) {
        if (C0548Jt.A02(this)) {
            return null;
        }
        try {
            return A00(qsArr);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        this.A00.AAw(this.A02);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(QF qf) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A03(qf);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
