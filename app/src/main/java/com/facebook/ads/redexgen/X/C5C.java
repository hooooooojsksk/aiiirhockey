package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.5C */
/* loaded from: assets/audience_network.dex */
public class C5C {
    public static byte[] A04;
    public static String[] A05 = {"3Lm1xoiqmVz", "7", "e", "S", "b9tO4", "WiIyJoqu6MmGONLqJ4ol82uO906afJVw", "5gKa3hz9VQf", "ZFmxpCIwvmg"};
    public final Intent A00;
    public final C5F A01;
    public final C0887Xc A02;
    public final InterfaceC0505Ia A03;

    public static String A0S(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A0T() {
        A04 = new byte[]{51, 54, 13, 54, 51, 38, 51, 13, 48, 39, 60, 54, 62, 55, 31, 20, 29, 21, 18, 25, 24, 61, 24, 56, 29, 8, 29, 62, 9, 18, 24, 16, 25, 85, 90, 79, 82, 77, 94, airhockey.J_PURCHASE, 95, ByteCompanionObject.MAX_VALUE, 90, 79, 90, airhockey.J_WAIT, 78, 85, 95, 87, 94, 65, 86, airhockey.P_GAME_SELECTMAP, 82, 65, 87, 86, 87, airhockey.J_GAME_STANDBY, 90, 87, 86, 92, airhockey.J_SAVEDGAME_RELOAD, 87, 119, 82, airhockey.P_GAME_MYWIN, 82, airhockey.J_BACK, airhockey.P_GAME_BREAKBALLCOUNT, 93, 87, 95, 86, 16, 15, 2, 3, 9, 57, 18, 15, 11, 3, 57, 22, 9, 10, 10, 15, 8, 1, 57, 15, 8, 18, 3, 20, 16, 7, 10};
    }

    static {
        A0T();
    }

    public C5C(C5F c5f, Intent intent, InterfaceC0505Ia interfaceC0505Ia, C0887Xc c0887Xc) {
        this.A01 = c5f;
        this.A00 = intent;
        this.A03 = interfaceC0505Ia;
        this.A02 = c0887Xc;
    }

    private F1 A00() {
        return (F1) this.A00.getSerializableExtra(A0S(0, 14, 29));
    }

    public InterfaceC0588Lk A02() {
        C5F c5f = this.A01;
        return new TH(c5f, this.A02, this.A03, new YL(c5f));
    }

    public InterfaceC0588Lk A03() {
        return new C0749Rq(this.A02, new C0781Sw(), this.A03, (C0950Zq) this.A00.getSerializableExtra(A0S(14, 19, 51)), new C6M(this.A02), new E7(this.A01));
    }

    public InterfaceC0588Lk A04() {
        return new C02918w(this.A02, this.A03, new YL(this.A01), A00(), new C0782Sx(), 1);
    }

    public InterfaceC0588Lk A05() {
        return new C02918w(this.A02, this.A03, new YL(this.A01), (C0427Eu) this.A00.getSerializableExtra(A0S(51, 25, 124)), new C0781Sw(), 0);
    }

    public InterfaceC0588Lk A06() {
        AbstractC0952Zs abstractC0952Zs = (AbstractC0952Zs) this.A00.getSerializableExtra(A0S(33, 18, 116));
        if (abstractC0952Zs == null) {
            return null;
        }
        String A0L = abstractC0952Zs.A0L();
        String[] strArr = A05;
        if (strArr[2].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[4] = "1M84Q";
        strArr2[6] = "leaDHdAWfWg";
        OM A02 = ON.A02(A0L);
        if (A02 == null) {
            return null;
        }
        return new S5(this.A02, new YL(this.A01), A02, abstractC0952Zs.A0m());
    }

    public InterfaceC0588Lk A07() {
        if (IK.A2A(this.A02)) {
            C0887Xc c0887Xc = this.A02;
            return new C7G(c0887Xc, this.A03, new C6M(c0887Xc), new YL(this.A01), A00());
        }
        C0887Xc c0887Xc2 = this.A02;
        return new C7E(c0887Xc2, this.A03, new C6M(c0887Xc2), new YL(this.A01), A00());
    }

    public InterfaceC0588Lk A08() {
        return new AnonymousClass87(this.A02, new C0782Sx(), this.A03, A00(), new C6M(this.A02), new YL(this.A01));
    }

    public InterfaceC0588Lk A09() {
        return new T0(this.A02, this.A03, new YL(this.A01), A00(), null, new C0782Sx());
    }

    public InterfaceC0588Lk A0A() {
        return new C7J(this.A02, new C0782Sx(), this.A03, A00(), new C6M(this.A02), new YL(this.A01));
    }

    public InterfaceC0588Lk A0B() {
        return new C7J(this.A02, new C0781Sw(), this.A03, (C0427Eu) this.A00.getSerializableExtra(A0S(51, 25, 124)), new C6M(this.A02), new E7(this.A01));
    }

    public InterfaceC0588Lk A0C() {
        C0887Xc c0887Xc = this.A02;
        return new C7E(c0887Xc, this.A03, new C6M(c0887Xc), new YL(this.A01), (C0427Eu) this.A00.getSerializableExtra(A0S(51, 25, 124)));
    }

    public InterfaceC0588Lk A0D() {
        C0427Eu c0427Eu = (C0427Eu) this.A00.getSerializableExtra(A0S(51, 25, 124));
        return new T0(this.A02, this.A03, new E7(this.A01), c0427Eu, c0427Eu.A0M(), new C0781Sw());
    }

    public InterfaceC0588Lk A0E(RelativeLayout relativeLayout) {
        C0783Sy c0783Sy = new C0783Sy(this.A02, new YK(this), this.A03, new YL(this.A01));
        c0783Sy.A05(relativeLayout);
        c0783Sy.A04(this.A00.getIntExtra(A0S(76, 27, 41), 200));
        LL.A0M(relativeLayout, ViewCompat.MEASURED_STATE_MASK);
        return c0783Sy;
    }
}
