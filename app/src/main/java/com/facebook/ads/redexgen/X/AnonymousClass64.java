package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.mobirix.airhockey.airhockey;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.64 */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass64 {
    public static String A00;
    public static byte[] A01;
    public static String[] A02 = {"o8zuart55Bmx3Pw0EGryupigSLJoPiZx", "bq35BXrVyo2MmN2pvK0AAoIbsBJXmHFn", "Ag4UQwTEuL9TJhKNxG6", "PmxOul6ExA7xevKGmIJ7", "bJjslG0QPgIDYXjJzGe0RXJuWF5PAt6I", "GLZoSVJacutm5kJ9CSmVpuybEaBnhneX", "dIwLXajRtHFv7I4e8IdUhcaSFtkhp8vw", "TtnuuoV6cihzxwpt43jVepBLS"};
    public static final String A03;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 58);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        byte[] bArr = {airhockey.J_GOO, 82, 93, 93, 92, airhockey.P_GAME_MYWIN, 19, 84, 86, airhockey.P_GAME_MYWIN, 19, 82, 87, airhockey.P_GAME_STANDBY, 86, 65, airhockey.P_GAME_MYWIN, 90, 64, 90, 93, 84, 19, 90, 93, 85, 92, 19, 92, 93, 19, 94, 82, 90, 93, 19, airhockey.P_GAME_MYWIN, 91, 65, 86, 82, 87, 29, 91, 87, 85, 22, 95, 87, 87, 95, 84, 93, 22, 89, 86, 92, airhockey.P_GAME_EXIT, 87, 81, 92, 22, 95, 85, 75, 82, 94, 92, 31, 86, 94, 94, 86, 93, 84, 31, 80, 95, 85, airhockey.P_GAME_MYSCORE, 94, 88, 85, 31, 86, 92, airhockey.P_NATION, 31, 80, 85, airhockey.P_NATION, 31, 88, 85, 84, 95, airhockey.P_GAME_STANDBY, 88, 87, 88, 84, airhockey.P_GAME_MYSCORE, 31, airhockey.J_GOO, 85, airhockey.P_GAME_MYWIN, 84, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_STANDBY, 88, airhockey.P_NATION, 88, 95, 86, airhockey.J_ACHIEVEMENTCALLBACK, 85, airhockey.J_SAVEDGAME_RELOAD, 93, 88, 84, 95, airhockey.P_GAME_STANDBY, 109, airhockey.J_SDKVER, 99, 32, airhockey.J_GAME_REMATCH, airhockey.J_SDKVER, airhockey.J_SDKVER, airhockey.J_GAME_REMATCH, airhockey.J_NATION, airhockey.J_GAME_ENEMYEXIT, 32, 111, 96, airhockey.J_GAME_EXIT, 124, airhockey.J_SDKVER, airhockey.J_ENEMYWIN, airhockey.J_GAME_EXIT, 32, airhockey.J_GAME_REMATCH, 99, 125, 32, 111, airhockey.J_GAME_EXIT, 125, 32, airhockey.J_ENEMYWIN, airhockey.J_GAME_EXIT, airhockey.J_GAME_ENEMYEXIT, 96, airhockey.J_PURCHASE, airhockey.J_ENEMYWIN, airhockey.J_ENEMYLOSE, airhockey.J_ENEMYWIN, airhockey.J_GAME_ENEMYEXIT, 124, 32, 125, airhockey.J_GAME_ENEMYEXIT, 124, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_ENEMYWIN, 109, airhockey.J_GAME_ENEMYEXIT, 32, 93, 90, 79, 92, 90, 18, 30, 28, 95, 22, 30, 30, 22, 29, 20, 95, 16, 31, 21, 3, 30, 24, 21, 95, 22, 28, 2, 95, 18, 30, 28, 28, 30, 31, 95, 54, 30, 30, 22, 29, 20, 33, 29, 16, 8, 34, 20, 3, 7, 24, 18, 20, 2, 36, 5, 24, 29, airhockey.P_GAME_MYSCORE, 65, airhockey.P_GAME_EXIT, 65, 86, 77, airhockey.P_GAME_MYWIN, airhockey.J_GAME_EXIT, airhockey.J_ENEMYLOSE, airhockey.J_WAIT, 76, airhockey.J_GAME_REMATCH, 123, airhockey.J_ENEMYLOSE, ByteCompanionObject.MAX_VALUE, airhockey.J_WAIT, airhockey.J_ONREWARDED, 126, airhockey.J_ONREWARDED, 99, airhockey.J_GAME_EXIT, airhockey.P_GAME_SELECTMAP, airhockey.J_GAME_REMATCH, airhockey.P_GAME_SELECTMAP, 99, airhockey.J_GAME_ENEMYEXIT, airhockey.J_NATION, 123, airhockey.J_WAIT, airhockey.J_ENEMYLOSE, 85, airhockey.J_ACHIEVEMENTCALLBACK, 33, 59, 15, 39, 39, 47, 36, 45, 24, 36, 41, 49, 27, 45, 58, 62, 33, 43, 45, 59, 9, 62, 41, 33, 36, 41, 42, 36, 45, 43, 49, 14, 43, 47, 43, 54, 3, 38, 22, 48, 35, 33, 41, 43, 44, 37, 7, 44, 35, 32, 46, 39, 38};
        if (A02[0].charAt(25) != 'L') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[7] = "5c2qL4dH8BvO0Uzn9h0t1hzuT";
        strArr[3] = "iopOujFX2mYmGwDZvEry";
        A01 = bArr;
    }

    static {
        A05();
        A03 = C02245w.class.getSimpleName();
        A00 = A04(173, 52, 75);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0034, code lost:
        if (r3 != false) goto L18;
     */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.X.C02245w A00(com.facebook.ads.redexgen.X.C7N r5) {
        /*
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            if (r1 == r0) goto L4b
            com.facebook.ads.redexgen.X.5w r4 = A01(r5)
            if (r4 == 0) goto L36
            java.lang.String r0 = r4.A03()
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.AnonymousClass64.A02
            r0 = 0
            r1 = r1[r0]
            r0 = 25
            char r1 = r1.charAt(r0)
            r0 = 76
            if (r1 == r0) goto L2d
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L2d:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AnonymousClass64.A02
            java.lang.String r1 = "uy9l7RLQ2P1HyKRuXc5qKTdvpqbxTZwF"
            r0 = 4
            r2[r0] = r1
            if (r3 == 0) goto L3a
        L36:
            com.facebook.ads.redexgen.X.5w r4 = A02(r5)
        L3a:
            if (r4 == 0) goto L46
            java.lang.String r0 = r4.A03()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L4a
        L46:
            com.facebook.ads.redexgen.X.5w r4 = A03(r5)
        L4a:
            return r4
        L4b:
            r2 = 0
            r1 = 43
            r0 = 9
            java.lang.String r1 = A04(r2, r1, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass64.A00(com.facebook.ads.redexgen.X.7N):com.facebook.ads.redexgen.X.5w");
    }

    @Nullable
    @VisibleForTesting
    public static C02245w A01(C7N c7n) {
        C7R adId = c7n.A04().A7W();
        if (adId != null) {
            return new C02245w(adId.getId(), adId.A8n(), EnumC02235v.A03);
        }
        return null;
    }

    @Nullable
    @VisibleForTesting
    public static C02245w A02(C7N c7n) {
        Object A002;
        Method A022;
        Object A003;
        boolean z = true;
        Method A023 = AnonymousClass65.A02(A00, A04(257, 29, 114), Context.class);
        if (A023 == null || (A002 = AnonymousClass65.A00(null, A023, c7n)) == null || ((Integer) A002).intValue() != 0 || (A022 = AnonymousClass65.A02(A04(65, 57, 11), A04(232, 20, 55), Context.class)) == null || (A003 = AnonymousClass65.A00(null, A022, c7n)) == null) {
            return null;
        }
        Method A012 = AnonymousClass65.A01(A003.getClass(), A04(252, 5, 38), new Class[0]);
        Method A013 = AnonymousClass65.A01(A003.getClass(), A04(286, 24, 120), new Class[0]);
        if (A012 == null || A013 == null) {
            return null;
        }
        String str = (String) AnonymousClass65.A00(A003, A012, new Object[0]);
        Boolean bool = (Boolean) AnonymousClass65.A00(A003, A013, new Object[0]);
        if (str != null) {
            return new C02245w(str, (bool == null || !bool.booleanValue()) ? false : false, EnumC02235v.A07);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.facebook.ads.internal.attribution.GmsAttributionProvider$GoogleAdInfo] */
    @Nullable
    @SuppressLint({"CatchGeneralException"})
    @VisibleForTesting
    public static C02245w A03(C7N c7n) {
        AnonymousClass63 anonymousClass63 = new AnonymousClass63();
        Intent intent = new Intent(A04(122, 51, 52));
        intent.setPackage(A04(43, 22, 2));
        if (c7n.bindService(intent, anonymousClass63, 1)) {
            try {
                ?? r0 = new IInterface(anonymousClass63.A02()) { // from class: com.facebook.ads.internal.attribution.GmsAttributionProvider$GoogleAdInfo
                    public static byte[] A01;
                    public static String[] A02 = {"", "dlCQJjSx2v0yIAE7uR5", "YVJONne7N3U8xm", "", "eKTK4BSI8P33PVYq98zfXeBzSnXDY", "", "Oc9p6kWmaRe51UGQv0AehnzsYEIJ", "vamZVSY5oxMc9Fm9XA4FwhL"};
                    public IBinder A00;

                    public static String A00(int i, int i2, int i3) {
                        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                        int i4 = 0;
                        while (true) {
                            int length = copyOfRange.length;
                            String[] strArr = A02;
                            if (strArr[5].length() != strArr[0].length()) {
                                throw new RuntimeException();
                            }
                            A02[3] = "";
                            if (i4 >= length) {
                                return new String(copyOfRange);
                            }
                            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 80);
                            i4++;
                        }
                    }

                    public static void A01() {
                        A01 = new byte[]{42, 54, 52, -11, 46, 54, 54, 46, 51, 44, -11, 40, 53, 43, 57, 54, 48, 43, -11, 46, 52, 58, -11, 40, 43, 58, -11, 48, 43, 44, 53, 59, 48, 45, 48, 44, 57, -11, 48, 53, 59, 44, 57, 53, 40, 51, -11, 16, 8, 43, 61, 44, 57, 59, 48, 58, 48, 53, 46, 16, 43, 26, 44, 57, 61, 48, 42, 44};
                    }

                    static {
                        A01();
                    }

                    {
                        this.A00 = A022;
                    }

                    public final String A02() throws RemoteException {
                        Parcel obtain = Parcel.obtain();
                        Parcel obtain2 = Parcel.obtain();
                        try {
                            obtain.writeInterfaceToken(A00(0, 68, 119));
                            this.A00.transact(1, obtain, obtain2, 0);
                            obtain2.readException();
                            String readString = obtain2.readString();
                            return readString != null ? readString : A00(0, 0, 88);
                        } finally {
                            obtain2.recycle();
                            obtain.recycle();
                        }
                    }

                    public final boolean A03() throws RemoteException {
                        Parcel obtain = Parcel.obtain();
                        Parcel obtain2 = Parcel.obtain();
                        try {
                            obtain.writeInterfaceToken(A00(0, 68, 119));
                            boolean z = true;
                            obtain.writeInt(1);
                            this.A00.transact(2, obtain, obtain2, 0);
                            obtain2.readException();
                            if (obtain2.readInt() == 0) {
                                z = false;
                            }
                            return z;
                        } finally {
                            obtain2.recycle();
                            obtain.recycle();
                        }
                    }

                    @Override // android.os.IInterface
                    public final IBinder asBinder() {
                        return this.A00;
                    }
                };
                return new C02245w(r0.A02(), r0.A03(), EnumC02235v.A08);
            } catch (Throwable th) {
                try {
                    c7n.A07().A9C(A04(225, 7, 30), C02627s.A1Q, new C02637t(th));
                } finally {
                    c7n.unbindService(anonymousClass63);
                }
            }
        }
        return null;
    }
}
