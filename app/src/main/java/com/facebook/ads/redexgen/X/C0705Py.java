package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import com.mobirix.airhockey.airhockey;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Py */
/* loaded from: assets/audience_network.dex */
public final class C0705Py {
    public static C0705Py A09;
    public static byte[] A0A;
    public static final DownloadAction.Deserializer[] A0B;
    public C0400Dt A00;
    @Nullable
    public InterfaceC0478Gx A01;
    public File A02;
    public boolean A03;
    public final C0886Xb A06;
    public final Handler A04 = new Handler(Looper.getMainLooper());
    public final SparseArray<C0703Pw> A05 = new SparseArray<>();
    public final Runnable A08 = new RunnableC0702Pv(this);
    public final InterfaceC0393Dm A07 = new JL(this);

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 103);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A0A = new byte[]{-103, -69, -14, -19, -34, -20, -77, -103, -69, -3, 20, 15, 0, 14, -69, -24, 19, 27, 18, 16, 19, 5, 8, 9, 8, -46, -60, -9, 24, 5, 24, 9, -34, -60, 27, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_STANDBY, airhockey.P_GAME_MYLOSE, 4, -10, 41, airhockey.P_GAME_EXIT, 55, airhockey.P_GAME_EXIT, 59, 16, -10, -44, -31, -13, -21, 33, 36, 46, 55, -19, 33, 35, 52, 41, 47, 46, 51, -40, -37, -27, -18, -92, -37, -26, -18, -27, -29, -26, -40, -37, -22, 33, 36, 51, -40, -42, -40, -35, -38};
    }

    static {
        A0C();
        A0B = new DownloadAction.Deserializer[]{VJ.A03};
    }

    @VisibleForTesting
    public C0705Py(C0886Xb c0886Xb, @Nullable C0400Dt c0400Dt) {
        this.A06 = c0886Xb;
        if (c0400Dt != null) {
            this.A00 = c0400Dt;
            c0400Dt.A0Q(this.A07);
        }
        A01().A0P();
    }

    private synchronized C0400Dt A01() {
        if (this.A00 == null) {
            this.A00 = new C0400Dt(new C0405Dy(A03(), A02()), 10, 5, new File(A06(), A07(52, 12, 89)), A0B);
            this.A00.A0Q(this.A07);
        }
        return this.A00;
    }

    private InterfaceC0814Ue A02() {
        return new C2N(A07(78, 3, 89), null);
    }

    private final synchronized InterfaceC0478Gx A03() {
        if (this.A01 == null) {
            this.A01 = new UQ(new File(A06(), A07(64, 14, 16)), new C0328Ai(IK.A0O(this.A06)));
        }
        return this.A01;
    }

    public static UT A04(C0820Uk c0820Uk, InterfaceC0478Gx interfaceC0478Gx) {
        return new UT(interfaceC0478Gx, c0820Uk, new C0816Ug(), null, 2, null);
    }

    public static synchronized C0705Py A05(C0886Xb c0886Xb) {
        C0705Py c0705Py;
        synchronized (C0705Py.class) {
            if (A09 == null) {
                A09 = new C0705Py(c0886Xb, null);
            }
            c0705Py = A09;
        }
        return c0705Py;
    }

    private File A06() {
        if (this.A02 == null) {
            this.A02 = this.A06.getCacheDir();
        }
        return this.A02;
    }

    @Nullable
    public static String A08(C0886Xb c0886Xb, Uri uri) {
        try {
            if (!IK.A1N(c0886Xb)) {
                return null;
            }
            return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, uri.getFragment()).toString();
        } catch (URISyntaxException e) {
            c0886Xb.A07().A9C(A07(81, 5, 14), C02627s.A0u, new C02637t(e));
            return null;
        }
    }

    public void A09() {
        C0399Ds[] A0S;
        for (C0399Ds c0399Ds : A01().A0S()) {
            int taskId = c0399Ds.A02;
            C0703Pw c0703Pw = this.A05.get(taskId);
            if (c0703Pw != null) {
                int i = c0399Ds.A01;
                if (i == 2 || c0399Ds.A03 > c0703Pw.A00) {
                    String str = A07(15, 19, 61) + i + A07(0, 8, 18) + c0399Ds.A03;
                    c0703Pw.A01.AAl(c0703Pw.A02);
                    this.A05.remove(taskId);
                } else if (i == 4 || i == 3) {
                    String str2 = A07(34, 14, 111) + i;
                    c0703Pw.A01.AAx(c0399Ds.A05);
                    this.A05.remove(taskId);
                }
            }
            String str3 = A07(48, 4, 25) + taskId + A07(8, 7, 52) + c0399Ds.A03;
        }
    }

    private void A0A() {
        if (!this.A03) {
            this.A03 = true;
            this.A04.post(this.A08);
        }
    }

    public void A0B() {
        this.A04.removeCallbacks(this.A08);
        this.A03 = false;
    }

    public final GW A0F(Context context) {
        return A04(new C0820Uk(context, (InterfaceC0474Gt<? super GX>) null, A02()), A03());
    }

    public final void A0G(Uri uri, InterfaceC0704Px interfaceC0704Px, long j) {
        String A08 = A08(this.A06, uri);
        if (A08 == null) {
            A08 = uri.toString();
        }
        boolean A0H = A0H(A08);
        this.A05.put(A01().A0O(new VJ(uri, false, null, A08)), new C0703Pw(interfaceC0704Px, j, A0H, null));
        A0A();
    }

    public final boolean A0H(String str) {
        return A03().A5z(str, 0L, 1L) > 0;
    }
}
