package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.drive.DriveFile;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.aM */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0982aM extends AbstractC00810f {
    public static String A03;
    public static String A04;
    public static String A05;
    public static byte[] A06;
    public static String[] A07 = {"1", "OJ2IOsbUnCKybSqk53zM3JXcifahO", "e4RldewFXKwYCBzcZ5CwWZ5XjhlRHNiJ", "729G42gqUNiz5ZAUAxRhvFZ2YWMhTd0L", "J1Ql0tv9onNfDvsMKNTgjNyaDa6Pnzub", "9fBm", "mbPUpspz4Nj5AFGqwEe2w9x9WWs", "2uSYGuFAJgr"};
    public final boolean A00;
    @Nullable
    public final C00870m A01;
    public final boolean A02;

    public static String A0A(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 30);
            if (A07[3].charAt(0) != '7') {
                throw new RuntimeException();
            }
            A07[5] = "PWjD";
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A06 = new byte[]{93, airhockey.J_SAVEDGAME_RELOAD, 119, 125, airhockey.J_ERROR, 62, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_BACK, airhockey.J_WAIT, airhockey.J_WAIT, 123, airhockey.J_PURCHASE, airhockey.P_GAME_SELECTMAP, 75, 65, 87, airhockey.P_GAME_EXIT, 76, 65, 11, 76, 75, 81, 64, 75, 81, 11, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_BREAKBALLCOUNT, 81, 76, airhockey.P_GAME_EXIT, 75, 11, airhockey.J_SAVEDGAME_SAVE, airhockey.J_GAME_DISCONNECT, 96, airhockey.J_SAVEDGAME_RELOAD, 24, 27, 25, 17, 37, 14, 19, 23, 31, 46, 39, 35, 52, 39, 29, 54, 43, 47, 39, 11, 17, 16, 7, 11, 9, 1, 37, 35, 53, 53, 51, 37, 37, 76, 87, 80, 79, 92, 75, airhockey.P_GAME_EXIT, 88, 85, 102, 85, 80, 87, 82, 89, 95, airhockey.P_GAME_REMATCH, 94, airhockey.J_SAVEDGAME_SAVE, 88, 94, 77, 79, airhockey.P_GAME_MYWIN, airhockey.P_GAME_REMATCH, 94, airhockey.J_SAVEDGAME_SAVE, airhockey.P_GAME_STANDBY, 95, airhockey.J_SAVEDGAME_SAVE, airhockey.P_NATION, airhockey.P_GAME_MYSCORE, 88, airhockey.J_SAVEDGAME_SAVE, airhockey.P_NATION, 89, 64, 64, 75, 93, airhockey.P_GAME_MYLOSE, 95, 84, 99, 93, 82, 88, 99, 94, 78, 83, 75, 79, 89};
    }

    public abstract void A0D();

    static {
        A0B();
        A03 = A0A(64, 7, 72);
        A04 = A0A(85, 24, 50);
        A05 = A0A(109, 16, 34);
    }

    public AbstractC0982aM(C0887Xc c0887Xc, InterfaceC0505Ia interfaceC0505Ia, String str, @Nullable C00870m c00870m, boolean z) {
        this(c0887Xc, interfaceC0505Ia, str, c00870m, z, false);
    }

    public AbstractC0982aM(C0887Xc c0887Xc, InterfaceC0505Ia interfaceC0505Ia, String str, @Nullable C00870m c00870m, boolean z, boolean z2) {
        super(c0887Xc, interfaceC0505Ia, str);
        this.A01 = c00870m;
        this.A02 = z;
        this.A00 = z2;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00810f
    public final void A0C() {
        C00870m c00870m = this.A01;
        if (c00870m != null) {
            c00870m.A07(super.A02);
        }
        A0D();
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x007e, code lost:
        if (r4 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0080, code lost:
        r3 = r7.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x008d, code lost:
        if (com.facebook.ads.redexgen.X.AbstractC0982aM.A07[6].length() == 8) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x008f, code lost:
        r2 = com.facebook.ads.redexgen.X.AbstractC0982aM.A07;
        r2[2] = "42brCgECckKxVuTsLxKp6fXlInYi7mUj";
        r2[4] = "SJ7s8Rg0tKhfkKPQamVQVBa2w2xrx0QV";
        r3.A05();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ac, code lost:
        r3.A05();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b7, code lost:
        if (r4 != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0E(java.util.Map<java.lang.String, java.lang.String> r8, @androidx.annotation.Nullable com.facebook.ads.redexgen.X.EnumC00800e r9) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC0982aM.A0E(java.util.Map, com.facebook.ads.redexgen.X.0e):void");
    }

    public final boolean A0F(Uri uri) {
        try {
            String queryParameter = uri.getQueryParameter(A0A(71, 14, 39));
            if (TextUtils.isEmpty(queryParameter)) {
                return false;
            }
            String universalLink = A0A(12, 26, 59);
            Intent launchIntent = new Intent(universalLink, KT.A00(queryParameter));
            launchIntent.addFlags(DriveFile.MODE_READ_ONLY);
            if (Build.VERSION.SDK_INT >= 30) {
                launchIntent.addFlags(1024);
            }
            boolean redirectedToApp = KG.A0B(super.A00, launchIntent);
            return redirectedToApp;
        } catch (KE unused) {
            return false;
        }
    }
}
