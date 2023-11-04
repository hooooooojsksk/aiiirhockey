package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.Qa */
/* loaded from: assets/audience_network.dex */
public final class AsyncTaskC0707Qa extends AsyncTask<String, Void, C0708Qb> {
    public static byte[] A05;
    public static String[] A06 = {"iMGBqiSHm2uYyOurEO", "JHkNge3qKUrOixxb", "Efd0ZU7p6XsOViiGEn9FTnCEMV0phXsZ", "Qqux8MYyckh5CceEy", "ksejtLtP", "6qwv67", "yXEFufBpuo", "JuPO8KFa"};
    public static final String A07;
    public static final Set<String> A08;
    public C7N A00;
    public QF A01;
    public QZ A02;
    public Map<String, String> A03;
    public Map<String, String> A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final C0708Qb A00(String... strArr) {
        if (C0548Jt.A02(this)) {
            return null;
        }
        try {
            String str = strArr[0];
            if (!TextUtils.isEmpty(str) && !A08.contains(str)) {
                String A02 = A02(str);
                if (this.A03 != null && !this.A03.isEmpty()) {
                    for (Map.Entry<String, String> entry : this.A03.entrySet()) {
                        A02 = A03(A02, entry.getKey(), entry.getValue());
                    }
                }
                int i = 1;
                while (true) {
                    int i2 = i + 1;
                    if (i > 2) {
                        return null;
                    }
                    if (A06(A02)) {
                        return new C0708Qb(this.A01);
                    }
                    i = i2;
                }
            }
            return null;
        } catch (Throwable th) {
            if (A06[6].length() != 31) {
                A06[6] = "dO3qGWbyMuVAZQTwO1X30zVxIjEEo";
                C0548Jt.A00(th, this);
                return null;
            }
            throw new RuntimeException();
        }
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 90);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{48, 0, 3, 57, 33, 22, 22, 11, 22, airhockey.P_GAME_SELECTMAP, 11, 20, 1, 10, 13, 10, 3, airhockey.P_GAME_SELECTMAP, 17, 22, 8, 94, airhockey.P_GAME_SELECTMAP, airhockey.J_PURCHASE, airhockey.J_ERROR, airhockey.J_PURCHASE, 119, airhockey.J_DISCONNECT, 124, 44, 55, 46, 46};
    }

    static {
        A04();
        A07 = AsyncTaskC0707Qa.class.getSimpleName();
        A08 = new HashSet();
        A08.add(A01(0, 1, 73));
        A08.add(A01(29, 4, 24));
    }

    public AsyncTaskC0707Qa(C7N c7n) {
        this(c7n, null, null);
    }

    public AsyncTaskC0707Qa(C7N c7n, Map<String, String> extraData) {
        this(c7n, extraData, null);
    }

    public AsyncTaskC0707Qa(C7N c7n, @Nullable Map<String, String> extraData, @Nullable Map<String, String> postData) {
        this.A00 = c7n;
        this.A03 = extraData != null ? new HashMap(extraData) : null;
        this.A04 = postData != null ? new HashMap(postData) : null;
    }

    private String A02(String str) {
        try {
            return A03(str, A01(23, 6, 65), C0568Kq.A01(this.A00.A03().A5k()));
        } catch (Exception unused) {
            return str;
        }
    }

    private String A03(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return str;
        }
        String A01 = A01(3, 1, 92);
        if (str.contains(A01)) {
            A01 = A01(1, 1, 124);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(A01);
        sb.append(str2);
        String prepend = A01(2, 1, 100);
        sb.append(prepend);
        String prepend2 = URLEncoder.encode(str3);
        sb.append(prepend2);
        String prepend3 = sb.toString();
        return prepend3;
    }

    private final void A05(C0708Qb response) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            if (this.A02 != null) {
                this.A02.ADg(response);
            }
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    private boolean A06(String str) {
        QF ADS;
        QG A00 = QY.A00(this.A00);
        try {
            if (this.A04 == null || this.A04.size() == 0) {
                ADS = A00.ADS(str, new QU());
            } else {
                QU params = new QU();
                params.A05(this.A04);
                ADS = A00.ADT(str, params.A08());
            }
            this.A01 = ADS;
        } catch (Exception e) {
            String str2 = A07;
            Log.e(str2, A01(4, 19, 62) + str, e);
        }
        QF qf = this.A01;
        return qf != null && qf.A7m() == 200;
    }

    public final void A07(QZ qz) {
        this.A02 = qz;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ C0708Qb doInBackground(String[] strArr) {
        if (C0548Jt.A02(this)) {
            return null;
        }
        try {
            return A00(strArr);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        QZ qz = this.A02;
        if (qz != null) {
            qz.ADe();
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(C0708Qb c0708Qb) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A05(c0708Qb);
        } catch (Throwable th) {
            if (A06[3].length() != 17) {
                throw new RuntimeException();
            }
            A06[2] = "KahWFkeddZk466vYoInqTxrEqXEaISmf";
            C0548Jt.A00(th, this);
        }
    }
}
