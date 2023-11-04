package com.facebook.ads.redexgen.X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.UUID;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: assets/audience_network.dex */
public final class XZ extends C7a {
    public static byte[] A00;
    public static final C7U A01;
    public static final C7U A02;
    public static final C7U[] A03;
    public static final String A04;
    public static final String A05;
    public static final String A06;
    public static final String A07;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 36);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{19, 14, 19, 91, 63, 44, 45, 36, 45, 60, 45, airhockey.P_GAME_MYLOSE, 46, 58, 39, 37, airhockey.P_GAME_MYLOSE, 28, 7, 3, 13, 6, 27, airhockey.P_GAME_MYLOSE, 63, 32, 45, 58, 45, airhockey.P_GAME_MYLOSE, 38, 39, 60, airhockey.P_GAME_MYLOSE, 45, 48, 33, 59, 60, 59, airhockey.P_GAME_MYLOSE, 64, 59, 45, 36, 45, 43, 60, airhockey.P_GAME_MYLOSE, 89, airhockey.P_GAME_MYLOSE, 46, 58, 39, 37, airhockey.P_GAME_MYLOSE, 13, 30, 13, 6, 28, 27, airhockey.P_GAME_MYLOSE, 63, 32, 45, 58, 45, airhockey.P_GAME_MYLOSE, 28, 7, 3, 13, 6, 27, airhockey.P_GAME_BREAKBALLCOUNT, 8, 53, 46, 40, 61, 57, 36, 34, 35, 109, 58, 37, 40, 35, 109, 57, 63, 52, 36, 35, 42, 109, 57, 34, 109, 41, 40, 33, 40, 57, 40, 109, 46, 37, 36, 33, 41, 33, 40, 62, 62, 109, 57, 34, 38, 40, 35, 62, 99, 22, 49, 41, 62, 51, 54, 59, ByteCompanionObject.MAX_VALUE, 43, 48, 52, 58, 49, airhockey.J_BACK, 92, 77, 80, 92, airhockey.P_GAME_EXIT, 91, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_EXIT, 62, 78, 76, 87, 83, 95, 76, airhockey.P_GAME_MYWIN, 62, 85, 91, airhockey.P_GAME_MYWIN, 36, 55, 36, 47, 53, 50, 2, 25, 29, 19, 24, 25, 2, 6, 8, 3, 50, 4, 9, 80, 75, 79, 65, airhockey.P_GAME_EXIT, 87};
    }

    static {
        A04();
        A02 = new C7U(0, A00(170, 8, 73), A00(143, 16, 58));
        A01 = new C7U(1, A00(165, 5, 82), A00(139, 4, 44));
        A03 = new C7U[]{A02, A01};
        A07 = XZ.class.getSimpleName();
        C7U[] c7uArr = A03;
        String A002 = A00(178, 6, 0);
        A05 = C7a.A02(A002, c7uArr);
        A06 = C7a.A03(A002, A03, A01);
        A04 = A00(5, 71, 76) + A02.A01 + A00(0, 3, 23) + A00(159, 6, 101) + A00(4, 1, 53) + C0885Xa.A09.A01 + A00(3, 1, 86);
    }

    public XZ(C7W c7w) {
        super(c7w);
    }

    @Override // com.facebook.ads.redexgen.X.C7a
    public final String A06() {
        return A00(178, 6, 0);
    }

    @Override // com.facebook.ads.redexgen.X.C7a
    public final C7U[] A0A() {
        return A03;
    }

    public final Cursor A0B() {
        return A05().rawQuery(A05, null);
    }

    public final String A0C(String str) throws IllegalArgumentException, SQLiteException {
        if (!TextUtils.isEmpty(str)) {
            Cursor cursor = null;
            try {
                cursor = A05().rawQuery(A06, new String[]{str});
                String string = cursor.moveToNext() ? cursor.getString(A02.A00) : null;
                if (!TextUtils.isEmpty(string)) {
                    cursor.close();
                    return string;
                }
                String uuid = UUID.randomUUID().toString();
                ContentValues contentValues = new ContentValues(2);
                contentValues.put(A02.A01, uuid);
                contentValues.put(A01.A01, str);
                A05().insertOrThrow(A00(178, 6, 0), null, contentValues);
                cursor.close();
                return uuid;
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
        throw new IllegalArgumentException(A00(125, 14, 123));
    }

    public final void A0D(C0886Xb c0886Xb) {
        try {
            A05().execSQL(A04);
        } catch (SQLException e) {
            if (c0886Xb.A04().A8f()) {
                Log.e(A07, A00(76, 49, 105), e);
            }
        }
    }
}
