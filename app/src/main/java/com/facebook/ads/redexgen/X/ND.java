package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: assets/audience_network.dex */
public abstract class ND extends LinearLayout {
    public static byte[] A06;
    public static String[] A07 = {"cmzsI0MqV", "rmZj6bXGr2Mc3k6GGfUNTI8ab", "Oqa2BQOYUIgPEQnUKqUaSgjmS1hAy2aw", "VbR8t651F3u5xAC0yd", "KwIIB1PdAD0xOvkamO3Meu", "6KEr", "QBka00Gf2XeExLF7IYa6e3", ""};
    public static final LinearLayout.LayoutParams A08;
    public final int A00;
    public final View.OnClickListener A01;
    public final RelativeLayout A02;
    public final C0887Xc A03;
    public final View$OnClickListenerC0759Sa A04;
    public final NU A05;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 49);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {9, 12, 12, 13, 28, 9, 17, 20, 27};
        if (A07[1].length() != 25) {
            throw new RuntimeException();
        }
        A07[2] = "W8PIFEgMaUlhByfzvyeLgAFdtcDk8ZOz";
        A06 = bArr;
    }

    public abstract void A0C(int i);

    static {
        A01();
        A08 = new LinearLayout.LayoutParams(-2, -2);
    }

    public ND(C0887Xc c0887Xc, int i, C1L c1l, boolean z, String str, InterfaceC0505Ia interfaceC0505Ia, InterfaceC0587Lj interfaceC0587Lj, QA qa, LD ld) {
        super(c0887Xc);
        LL.A0K(this);
        this.A03 = c0887Xc;
        this.A00 = i;
        this.A05 = new NU(c0887Xc);
        LL.A0M(this.A05, 0);
        LL.A0K(this.A05);
        this.A04 = new View$OnClickListenerC0759Sa(c0887Xc, str, c1l, z, interfaceC0505Ia, interfaceC0587Lj, qa, ld);
        LL.A0G(1001, this.A04);
        this.A01 = C0636Ng.A03(this.A04, A00(0, 9, 119));
        this.A02 = new RelativeLayout(c0887Xc);
        this.A02.setLayoutParams(A08);
        LL.A0K(this.A02);
    }

    public void A09() {
    }

    public void A0A() {
    }

    public void A0B() {
        this.A05.setOnClickListener(this.A01);
    }

    public final View$OnClickListenerC0759Sa getCTAButton() {
        return this.A04;
    }

    public View getExpandableLayout() {
        return null;
    }

    @VisibleForTesting
    public final ImageView getIconView() {
        return this.A05;
    }

    public void setInfo(C1J c1j, C1M c1m, String str, String str2, @Nullable NH nh) {
        this.A04.setCta(c1m, str, new HashMap(), nh);
        AsyncTaskC0764Sf asyncTaskC0764Sf = new AsyncTaskC0764Sf(this.A05, this.A03);
        int i = this.A00;
        asyncTaskC0764Sf.A05(i, i).A07(str2);
    }

    public void setTitleMaxLines(int i) {
    }
}
