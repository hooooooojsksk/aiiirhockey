package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: assets/audience_network.dex */
public final class XV implements InterfaceC02507e {
    public static byte[] A04;
    public static String[] A05 = {"D3PJ2GNcgNGI4MtKfCaHjqEOfdHoPcVQ", "EJL0aGmI3i0Imoz4UWgpTxwTxGm9WRxT", "tfWCUNw0WGkvc5ldnWfg2BDK3aY0ceq2", "VYnzwe", "FWw4Dif8pFGferaZg4Cc6MDYh6zRU5", "BYQArfMrHiqwTG3fAjpcYjBOCFZN2nO4", "ZJiZak5asVL", "k4pPkd4ODWsyAa7ylPFb6IMORyuDH4"};
    public Context A00;
    public final InterfaceC02497d A02;
    public final AtomicBoolean A03 = new AtomicBoolean(false);
    @Nullable
    public C02477b A01 = A00();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{airhockey.J_GAME_ENEMYEXIT, ByteCompanionObject.MAX_VALUE, 96, airhockey.J_GOO, 124, airhockey.J_GAME_EXIT, 123, 123, 102, airhockey.J_SDKVER, airhockey.J_ENEMYLOSE, 124, airhockey.J_GOO, airhockey.J_ONREWARDED, airhockey.J_GAME_EXIT, airhockey.J_REWARD};
    }

    static {
        A03();
    }

    public XV(Context context, InterfaceC02497d interfaceC02497d) {
        this.A00 = context;
        this.A02 = interfaceC02497d;
    }

    @Nullable
    private C02477b A00() {
        return C02477b.A00(C0541Jm.A00(this.A00).getString(A01(0, 16, 81), null));
    }

    private void A02() {
        this.A02.A9n(new XW(this));
    }

    public final void A04(@Nullable String[] strArr, @Nullable Integer num, @Nullable Integer num2) {
        C02477b c02477b = new C02477b(strArr, num, num2);
        C02477b newSettings = this.A01;
        if (c02477b.equals(newSettings)) {
            return;
        }
        this.A01 = c02477b;
        this.A03.set(true);
        SharedPreferences A00 = C0541Jm.A00(this.A00);
        if (A05[2].charAt(16) != 'n') {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[7] = "txsFPtaRD11LyA3dzoyK5U0Vbdrctz";
        strArr2[4] = "NLpqiEYsaOJ6LGl2A1qehjxsg53G43";
        SharedPreferences.Editor edit = A00.edit();
        C02477b newSettings2 = this.A01;
        edit.putString(A01(0, 16, 81), newSettings2.A07()).apply();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02507e
    @Nullable
    public final C02477b A6Q() {
        A02();
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02507e
    public final boolean A8s() {
        A02();
        if (this.A01 == null) {
            return false;
        }
        Set<String> A0Y = IK.A0Y(this.A00);
        String identifier = this.A01.A07();
        for (String str : A0Y) {
            if (identifier.contains(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02507e
    public final boolean AFD() {
        A02();
        return this.A03.getAndSet(false);
    }
}
