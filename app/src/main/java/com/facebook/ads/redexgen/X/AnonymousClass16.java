package com.facebook.ads.redexgen.X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.mobirix.airhockey.airhockey;
import java.io.Serializable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.16 */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass16 extends BroadcastReceiver {
    public static byte[] A03;
    public static String[] A04 = {"X1IVw5mZrPwWgp59pDL9aLZ3Fov3W2Wm", "N1AsLxATz8LfRIPBbwS0prqi9bKFNGwZ", "KvfN8PD7zJtQDsMeVTqT5dRzLvhiPQFs", "CwJ4sBopjGul5sxVyPsrv7O0APgi12j8", "riYYfsMk5nddhbnpPSj9znzkTr5bDpPf", "Be1xHvNUMQ0R9QZ", "t7JwnvsmbbV8km6q46", "oSYhwD14tF3vT8zAS1lFRiV2H2FAfEUD"};
    public Context A00;
    public AB A01;
    public boolean A02 = false;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 97);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{25, 3, 15, 13, 78, 6, 1, 3, 5, 2, 15, 15, 11, 78, 1, 4, 19, 78, 9, 14, 20, 5, 18, 19, 20, 9, 20, 9, 1, 12, 78, 4, 9, 19, 16, 12, 1, 25, 5, 4, 19, 31, 29, 94, 22, 17, 19, 21, 18, 31, 31, 27, 94, 17, 20, 3, 94, 25, 30, 4, 21, 2, 3, 4, 25, 4, 25, 17, 28, 94, 20, 25, 3, 0, 28, 17, 9, 21, 20, airhockey.P_GAME_EXIT, 18, 1, 18, 25, 3, 81, airhockey.P_GAME_SELECTMAP, 83, airhockey.P_GAME_MYWIN, 78, 83, 76, airhockey.J_NATION, 85, 64, airhockey.J_NATION, 77, airhockey.P_GAME_MYLOSE, airhockey.P_NATION, airhockey.P_GAME_EXIT, 83, airhockey.P_GAME_BREAKBALLCOUNT, 81, airhockey.P_GAME_STANDBY, 76, 81, 78, 96, 87, airhockey.P_NATION, 96, 79, airhockey.P_GAME_EXIT, 64, airhockey.P_GAME_MYLOSE, 25, 45, 50, 63, 62, 52, 18, 53, 47, 62, 41, 40, 47, 50, 47, 58, 55, 30, 45, 62, 53, 47, 2, 29, 16, 17, 27, 61, 26, 0, 17, 6, 7, 0, 29, 0, 21, 24, 49, 2, 17, 26, 0, 78};
    }

    static {
        A01();
    }

    public AnonymousClass16(AB ab, Context context) {
        this.A01 = ab;
        this.A00 = context;
    }

    public final void A02() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(A00(40, 40, 17) + this.A01.getUniqueId());
        intentFilter.addAction(A00(137, 22, 21) + this.A01.getUniqueId());
        intentFilter.addAction(A00(100, 16, 66) + this.A01.getUniqueId());
        C2Z.A00(this.A00).A06(this, intentFilter);
    }

    public final void A03() {
        try {
            C2Z.A00(this.A00).A05(this);
        } catch (Exception unused) {
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        String action2 = A00(0, 1, 66);
        String[] split = action.split(action2);
        if (split.length != 2) {
            return;
        }
        String str = split[1];
        String action3 = this.A01.getUniqueId();
        if (!str.equals(action3)) {
            return;
        }
        String str2 = split[0];
        String action4 = A00(1, 39, 1);
        if (str2.equals(action4)) {
            if (this.A01.getListener() != null) {
                this.A01.getListener().AAt();
                this.A01.getListener().ADC();
                return;
            }
            return;
        }
        String str3 = split[0];
        String[] split2 = A04;
        if (split2[2].charAt(17) != 'T') {
            throw new RuntimeException();
        }
        A04[7] = "czH1g8WXqBVBzZgoSLVA20jYFFcQLh15";
        String action5 = A00(116, 21, 58);
        if (str3.equals(action5)) {
            String action6 = A00(80, 5, 22);
            Serializable serializableExtra = intent.getSerializableExtra(action6);
            if (serializableExtra instanceof M0) {
                if (this.A01.getListener() != null) {
                    this.A01.getListener().AAz();
                    this.A01.getListener().ADC();
                }
                if (this.A02) {
                    this.A01.A0Y(1);
                } else {
                    this.A01.A0Y(((M0) serializableExtra).A01());
                }
                this.A01.setVisibility(0);
                this.A01.A0b(PK.A04, 1);
                return;
            } else if (serializableExtra instanceof C0655Nz) {
                if (this.A01.getListener() == null) {
                    return;
                }
                InterfaceC0596Ls listener = this.A01.getListener();
                String[] split3 = A04;
                if (split3[4].charAt(15) != 'p') {
                    throw new RuntimeException();
                }
                A04[0] = "WizhEabCQfIhxCPZxjxQrLo8096TZ2te";
                listener.AB5();
                return;
            } else if (serializableExtra instanceof NZ) {
                if (this.A01.getListener() == null) {
                    return;
                }
                this.A01.getListener().AB7();
                return;
            } else if (serializableExtra instanceof AnonymousClass72) {
                if (this.A01.getListener() != null) {
                    this.A01.getListener().AAY();
                }
                this.A02 = true;
                return;
            } else if (serializableExtra instanceof NC) {
                if (this.A01.getListener() != null) {
                    InterfaceC0596Ls listener2 = this.A01.getListener();
                    String[] split4 = A04;
                    String action7 = split4[5];
                    if (action7.length() != 15) {
                        A04[5] = "OhpiyJuLhpOH2Z5";
                        listener2.ABy();
                    } else {
                        A04[1] = "rjxpcIZarLCWG40Y5u8euDt94bevKfNO";
                        listener2.ABy();
                    }
                }
                this.A02 = false;
                return;
            } else if (!(serializableExtra instanceof C02466z) || this.A01.getListener() == null) {
                return;
            } else {
                this.A01.getListener().onPause();
                return;
            }
        }
        String str4 = split[0];
        String action8 = A00(85, 15, 64);
        if (!str4.equals(action8)) {
            return;
        }
        this.A01.A0m();
    }
}
