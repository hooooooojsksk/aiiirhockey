package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.adapters.datamodels.AdInfo;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
import com.facebook.proguard.annotations.DoNotStrip;
import com.mobirix.airhockey.airhockey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.7E */
/* loaded from: assets/audience_network.dex */
public final class C7E extends T9 {
    public static byte[] A0F;
    public static String[] A0G = {"hEO5MspmmQwWZDjfO9hYkGtE8t8ljCUN", "895GOd6GqHS2SDNwtQvAqIE", "zBXblOu1CdgXx49mdyV8flA", "GxqIbNjcrUQMSJiuMkyJv1mwkudVYaGP", "be3ZgXhlaup3yXbKLr41yKjcTusIQNjx", "HLi8FTj59ZkYUe8FmXrpO0CEflvtIm0o", "7bereGXxKpIS6kk2UNHV0kt11i4QSfeP", "LRvrjmvhZNKPrr4qRukG9JYrfPQqD7wd"};
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public static final int A0L;
    public int A00;
    public int A01;
    @Nullable
    public LinearLayout A02;
    public AbstractC0952Zs A03;
    public C6M A04;
    @Nullable
    public C2M A05;
    @Nullable
    public NT A06;
    public C0736Rd A07;
    @DoNotStrip
    public Q9 A08;
    public QA A09;
    public String A0A;
    public List<C0668On> A0B;
    public boolean A0C;
    public final C0887Xc A0D;
    public final LD A0E;

    public static String A08(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0G;
            if (strArr[0].charAt(22) != strArr[6].charAt(22)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[5] = "I427OJiZERIl1pgFYs7VIJxgJMuHqTWY";
            strArr2[4] = "m1VK8a3APoHjuOOKlTc7gi9yCeUy6Tbh";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 74);
            i4++;
        }
    }

    public static void A0A() {
        A0F = new byte[]{airhockey.J_REWARD, airhockey.J_SAVEDGAME_SAVE, airhockey.P_GAME_MYLOSE, airhockey.J_SAVEDGAME_SAVE, airhockey.J_REWARD, 99, airhockey.J_REWARD, airhockey.P_GAME_MYLOSE, airhockey.J_ERROR, airhockey.J_NATION, airhockey.J_WAIT, airhockey.J_SAVEDGAME_SAVE, 123, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_ERROR, airhockey.J_NATION, airhockey.J_GOO, 102, airhockey.J_ERROR, 99, airhockey.J_NATION, 99, 81, airhockey.J_INVITE, 99, airhockey.J_NATION, airhockey.J_ENEMYLOSE, airhockey.P_GAME_BREAKBALLCOUNT, 99, airhockey.P_GAME_MYSCORE, 102, airhockey.J_SAVEDGAME_SAVE, 102, airhockey.P_GAME_STANDBY, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_GAME_REMATCH, 99, airhockey.J_GAME_ENEMYEXIT, airhockey.J_NATION};
    }

    static {
        A0A();
        A0H = (int) (Kk.A02 * 48.0f);
        A0I = (int) (Kk.A02 * 8.0f);
        A0J = (int) (Kk.A02 * 8.0f);
        A0L = (int) (Kk.A02 * 56.0f);
        A0K = (int) (Kk.A02 * 12.0f);
    }

    public C7E(C0887Xc c0887Xc, InterfaceC0505Ia interfaceC0505Ia, C6M c6m, InterfaceC0587Lj interfaceC0587Lj, C0427Eu c0427Eu) {
        super(c0887Xc, interfaceC0505Ia, interfaceC0587Lj, c0427Eu);
        this.A0E = new LD();
        this.A0C = false;
        super.A07 = true;
        super.A06 = new P5(c0887Xc, new C0781Sw(), super.A0A.A0M(), interfaceC0587Lj);
        this.A04 = c6m;
        this.A0D = c0887Xc;
    }

    public C7E(C0887Xc c0887Xc, InterfaceC0505Ia interfaceC0505Ia, C6M c6m, InterfaceC0587Lj interfaceC0587Lj, F1 f1) {
        super(c0887Xc, interfaceC0505Ia, interfaceC0587Lj, f1);
        this.A0E = new LD();
        this.A0C = false;
        this.A04 = c6m;
        this.A0D = c0887Xc;
    }

    private AbstractC0952Zs A00(Intent intent) {
        if (super.A07) {
            return (AbstractC0952Zs) intent.getSerializableExtra(A08(14, 25, 77));
        }
        return (AbstractC0952Zs) intent.getSerializableExtra(A08(0, 14, 93));
    }

    private final void A0B() {
        LinearLayout linearLayout = this.A02;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            this.A02 = null;
        }
        C2M c2m = this.A05;
        if (c2m != null) {
            c2m.removeAllViews();
            this.A05.A1R();
            this.A05 = null;
        }
        NT nt = this.A06;
        if (nt != null) {
            nt.removeAllViews();
            this.A06 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0134, code lost:
        if (r6 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0136, code lost:
        r24.A0D.A0A().AFp(r24.A05, r24.A0A.A0m(), false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0147, code lost:
        A0U(r24.A02, false, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0154, code lost:
        if (r6 != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A0C(int r25, @androidx.annotation.Nullable android.os.Bundle r26) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C7E.A0C(int, android.os.Bundle):void");
    }

    private void A0D(AbstractC0952Zs abstractC0952Zs) {
        this.A03 = abstractC0952Zs;
        this.A0A = this.A03.A0m();
        this.A00 = this.A03.A0A();
        this.A01 = this.A03.A0B();
        List<C1C> A0o = this.A03.A0o();
        List<AdInfo> adInfoList = new ArrayList<>(A0o.size());
        this.A0B = adInfoList;
        int i = 0;
        while (true) {
            int size = A0o.size();
            String[] strArr = A0G;
            String str = strArr[5];
            String str2 = strArr[4];
            int i2 = str.charAt(16);
            if (i2 == str2.charAt(16)) {
                throw new RuntimeException();
            }
            A0G[3] = "1AHb04hcylshFNuVFPVd0IA840Fx90m0";
            if (i < size) {
                List<C0668On> list = this.A0B;
                int i3 = A0o.size();
                list.add(new C0668On(i, i3, A0o.get(i)));
                i++;
            } else {
                return;
            }
        }
    }

    private void A0E(C0736Rd c0736Rd) {
        new EA().A0G(this.A05);
        c0736Rd.A0Z(new RR(this));
        this.A06 = new NT(this.A0D, super.A05.A01(), this.A0B.size());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, A0J);
        layoutParams.setMargins(0, A0K, 0, 0);
        this.A06.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.T9
    public final boolean A0a() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public final void A92(Intent intent, Bundle bundle, C5F c5f) {
        AbstractC0952Zs dataBundle = A00(intent);
        A0V(c5f);
        A0D(dataBundle);
        A0C(c5f.A0H().getResources().getConfiguration().orientation, bundle);
        c5f.A0K(new RQ(this, c5f));
        AbstractC0952Zs dataBundle2 = super.A0A;
        int A03 = dataBundle2.A0h().A0D().A03();
        if (A03 > 0) {
            A0T(A03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.T9, com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public final void ABw(boolean z) {
        super.ABw(z);
        C0736Rd c0736Rd = this.A07;
        if (c0736Rd != null) {
            c0736Rd.A0Q();
        }
    }

    @Override // com.facebook.ads.redexgen.X.T9, com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public final void ACM(boolean z) {
        super.ACM(z);
        this.A07.A0R();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public final void AEZ(Bundle bundle) {
        C0736Rd c0736Rd = this.A07;
        if (c0736Rd != null) {
            c0736Rd.A0X(bundle);
        }
    }

    @Override // com.facebook.ads.redexgen.X.T9
    @ToolbarActionView$ToolbarActionMode
    public int getCloseButtonStyle() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        Bundle bundle = new Bundle();
        AEZ(bundle);
        A0B();
        A0C(configuration.orientation, bundle);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.facebook.ads.redexgen.X.T9, com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public final void onDestroy() {
        super.onDestroy();
        if (IK.A1Q(this.A0D)) {
            this.A0D.A0A().AFe(this.A05);
        }
        if (!TextUtils.isEmpty(this.A0A)) {
            super.A0C.A99(this.A0A, new NA().A03(this.A09).A02(this.A0E).A05());
        }
        A0B();
        this.A09.A0V();
        this.A09 = null;
        this.A08 = null;
        this.A0B = null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A0E.A06(this.A0D, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
