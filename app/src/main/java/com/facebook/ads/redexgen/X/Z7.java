package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.os.Parcelable;
import com.mobirix.airhockey.airhockey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class Z7 implements L4<Bundle> {
    public static byte[] A03;
    public final C2C A00;
    public final PI A01;
    public final List<Z6> A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 49);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{126, airhockey.J_WAIT, airhockey.J_GAME_DISCONNECT, airhockey.J_WAIT, airhockey.J_ONREWARDED, 126, airhockey.J_WAIT, airhockey.J_ONREWARDED, airhockey.J_INVITE, 126, airhockey.J_GAME_EXIT, 123, 109, airhockey.J_GAME_EXIT, 109};
    }

    public Z7(List<C2A> list, Bundle bundle, PI pi) {
        this.A02 = new ArrayList(list.size());
        this.A01 = pi;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(A00(10, 5, 15));
        for (int i = 0; i < list.size(); i++) {
            this.A02.add(new Z6(list.get(i), (Bundle) parcelableArrayList.get(i)));
        }
        this.A00 = (C2C) C0576Ky.A00(bundle.getByteArray(A00(0, 10, 28)));
    }

    public Z7(List<C2A> list, PI pi) {
        this.A02 = new ArrayList(list.size());
        this.A01 = pi;
        for (C2A c2a : list) {
            this.A02.add(new Z6(c2a));
        }
        this.A00 = new C2C();
    }

    public final Bundle A02() {
        Bundle bundle = new Bundle();
        bundle.putByteArray(A00(0, 10, 28), C0576Ky.A01(this.A00));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.A02.size());
        for (Z6 z6 : this.A02) {
            Bundle bundle2 = z6.A05();
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList(A00(10, 5, 15), arrayList);
        return bundle;
    }

    public final C2C A03() {
        return this.A00;
    }

    public final void A04() {
        this.A00.A03();
        for (Z6 z6 : this.A02) {
            z6.A06();
        }
    }

    public final void A05() {
        this.A00.A02();
    }

    public final void A06(double d, double d2) {
        if (d2 >= 0.0d) {
            this.A00.A05(d, d2);
        }
        double A82 = this.A01.A82();
        this.A00.A04(d, A82);
        for (Z6 z6 : this.A02) {
            z6.A07(d, A82);
        }
    }
}
