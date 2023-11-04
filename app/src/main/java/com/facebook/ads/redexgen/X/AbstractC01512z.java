package com.facebook.ads.redexgen.X;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.2z */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC01512z {
    public static byte[] A02;
    public DataSetObserver A00;
    public final DataSetObservable A01 = new DataSetObservable();

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 20);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{airhockey.J_INVITE, 89, 77, airhockey.P_GAME_REMATCH, 85, 78, 89, 88, 28, 81, 89, airhockey.P_GAME_MYLOSE, 84, 83, 88, 28, 88, 89, 79, airhockey.P_GAME_MYLOSE, 78, 83, airhockey.P_GAME_STANDBY, airhockey.J_ERROR, airhockey.P_GAME_MYLOSE, 89, 81, 28, 75, 93, 79, 28, 82, 83, airhockey.P_GAME_MYLOSE, 28, 83, airhockey.P_GAME_EXIT, 89, 78, 78, 85, 88, 88, 89, 82, 125, airhockey.P_GAME_EXIT, 94, 90, airhockey.P_GAME_BREAKBALLCOUNT, 93, airhockey.P_GAME_EXIT, 75, 15, airhockey.P_NATION, airhockey.P_GAME_EXIT, 91, airhockey.P_GAME_MYWIN, 64, 75, 15, airhockey.P_GAME_BREAKBALLCOUNT, 65, 92, 91, 78, 65, 91, airhockey.P_GAME_BREAKBALLCOUNT, 78, 91, airhockey.P_GAME_EXIT, 102, 91, airhockey.P_GAME_EXIT, airhockey.P_NATION, 15, 88, 78, 92, 15, 65, 64, 91, 15, 64, 89, airhockey.P_GAME_EXIT, 93, 93, airhockey.P_GAME_BREAKBALLCOUNT, 75, 75, airhockey.P_GAME_EXIT, 65};
    }

    public abstract int A05();

    public abstract boolean A0C(View view, Object obj);

    @Deprecated
    private final Object A00(View view, int i) {
        throw new UnsupportedOperationException(A01(46, 50, 59));
    }

    @Deprecated
    private final void A03(View view, int i, Object obj) {
        throw new UnsupportedOperationException(A01(0, 46, 40));
    }

    public final float A04(int i) {
        return 1.0f;
    }

    public int A06(Object obj) {
        return -1;
    }

    public final Parcelable A07() {
        return null;
    }

    public Object A08(ViewGroup viewGroup, int i) {
        return A00(viewGroup, i);
    }

    public final void A09() {
        synchronized (this) {
            if (this.A00 != null) {
                this.A00.onChanged();
            }
        }
        this.A01.notifyChanged();
    }

    public final void A0A(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.A00 = dataSetObserver;
        }
    }

    public void A0B(ViewGroup viewGroup, int i, Object obj) {
        A03(viewGroup, i, obj);
    }
}
