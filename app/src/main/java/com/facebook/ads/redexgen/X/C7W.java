package com.facebook.ads.redexgen.X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.AsyncTask;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.7W */
/* loaded from: assets/audience_network.dex */
public final class C7W {
    public static byte[] A04;
    public static String[] A05 = {"qJOvsPrm5BQkhL6wLJahauzjA45r7dQz", "hfx8x2hkXgxq19RSFkkqiaOe1zMy03Qo", "bV5o7GaQth4ZZOPd4LFtWwXjKNVB8lua", "1EyYFmGpmEhL9EWyl0I1ptwRPtnJxpez", "F", "i", "plO80lk7YnGQvaXazMopbLIwOg8MB0TR", "EzLFA06L6a2SQhX4934tm7serJXXg4XA"};
    public static final String A06;
    public static final Lock A07;
    public static final Lock A08;
    public static final ReentrantReadWriteLock A09;
    public SQLiteOpenHelper A00;
    public final C0886Xb A01;
    public final XZ A03 = new XZ(this);
    public final C0885Xa A02 = new C0885Xa(this);

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A05[3].charAt(0) != '1') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[0] = "6YOEgEHO6bjbd5au9bSAefu6W5tI3Dak";
            strArr[6] = "kgOgsYcmlOEy6T8oxoaixHiO6WRSp1D2";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 115);
            i4++;
        }
    }

    public static void A07() {
        A04 = new byte[]{-31, -2, -31, -81, -51, -81, -50, -11, 22, 40, 24, -67, -29, -17, -20, -22, -67, -44, -2, 3, -3, 2, -44, -108, -64, -67, -63, -67, -56, -108, -106, -59, -60, -106, -35, 12, 15, 1, 2, 15, -35, -1, 22, -35, -42, 9, -5, 10, -42, -98, -43, -58, -61, -48, -61, -98, -49, -43, -46, -58, 11, 3, -54, -52, 22, 52, 65, 65, airhockey.P_NATION, airhockey.P_GAME_MYWIN, -13, 54, 52, 63, 63, -13, 58, 56, airhockey.P_GAME_MYWIN, 23, 52, airhockey.P_GAME_MYWIN, 52, 53, 52, airhockey.P_GAME_BREAKBALLCOUNT, 56, -13, 57, airhockey.P_GAME_STANDBY, airhockey.P_NATION, 64, -13, airhockey.P_GAME_MYWIN, 59, 56, -13, 40, 28, -13, airhockey.P_GAME_MYWIN, 59, airhockey.P_GAME_STANDBY, 56, 52, 55, -12, 33, 19, 26, 19, 17, 34, -18, airhockey.P_NATION, 61, 57, 51, 60, 65, -4, 39, 34, 22, 19, 38, 23, -14, 43, 40, 59, 40, 41, 40, 58, 44, airhockey.P_GAME_MYWIN, 88, airhockey.P_GAME_MYWIN, 80, 86, 85, -9, -14, -18, -24, -15, -10};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0J() {
        for (int i = 0; i < A0M().length; i++) {
        }
        if (this.A00 != null) {
            this.A00.close();
            this.A00 = null;
        }
    }

    static {
        A07();
        StringBuilder sb = new StringBuilder();
        sb.append(A05(107, 14, 91));
        sb.append(XZ.A02.A01);
        String A052 = A05(58, 2, 51);
        sb.append(A052);
        String A053 = A05(142, 6, 16);
        sb.append(A053);
        String A054 = A05(60, 1, 106);
        sb.append(A054);
        sb.append(XZ.A01.A01);
        sb.append(A052);
        String A055 = A05(136, 6, 111);
        sb.append(A055);
        sb.append(A054);
        sb.append(C0885Xa.A04.A01);
        sb.append(A052);
        sb.append(A055);
        sb.append(A054);
        sb.append(C0885Xa.A05.A01);
        sb.append(A052);
        sb.append(A055);
        sb.append(A054);
        sb.append(C0885Xa.A0A.A01);
        sb.append(A052);
        sb.append(A055);
        sb.append(A054);
        sb.append(C0885Xa.A08.A01);
        sb.append(A052);
        sb.append(A055);
        sb.append(A054);
        sb.append(C0885Xa.A07.A01);
        sb.append(A052);
        sb.append(A055);
        sb.append(A054);
        sb.append(C0885Xa.A06.A01);
        sb.append(A052);
        sb.append(A055);
        sb.append(A054);
        sb.append(C0885Xa.A03.A01);
        sb.append(A052);
        sb.append(A055);
        sb.append(A054);
        sb.append(C0885Xa.A02.A01);
        sb.append(A05(11, 6, 42));
        sb.append(A055);
        sb.append(A05(17, 6, 65));
        sb.append(A053);
        sb.append(A05(30, 4, 3));
        sb.append(A055);
        sb.append(A054);
        sb.append(C0885Xa.A09.A01);
        sb.append(A05(0, 3, 78));
        sb.append(A053);
        sb.append(A054);
        sb.append(XZ.A02.A01);
        sb.append(A05(34, 10, 74));
        sb.append(A055);
        sb.append(A054);
        sb.append(C0885Xa.A08.A01);
        sb.append(A05(7, 4, 98));
        A06 = sb.toString();
        A09 = new ReentrantReadWriteLock();
        A07 = A09.readLock();
        A08 = A09.writeLock();
    }

    public C7W(C0886Xb c0886Xb) {
        this.A01 = c0886Xb;
    }

    private synchronized SQLiteDatabase A00() {
        if (this.A00 == null) {
            this.A00 = new SQLiteOpenHelper(this.A01, this) { // from class: com.facebook.ads.redexgen.X.7X
                public static byte[] A01;
                public static String[] A02 = {"JShIJu3JRfHt43ypO9GqFaXtQU", "Uet3LTw8rLJmru1DFWkYPrIPq9yjzQ4", "LBYTyoU1fD8w8O4ue", "ZxNu1nQjo2XkCjw5ERk40jWGoeLjYM9V", "VhJY3C97J7J84q76u4hEYHgB0g", "Ro8Wdk2EPx5GRn22XYsr1QjtSyjSX", "SdOPztDY16h0BPmxgfN82QFEWJhjV", "9YM807W9r6X84VXv6l9L7RtBJQk8UQ"};
                public static final String A03;
                public final C7W A00;

                public static String A00(int i, int i2, int i3) {
                    byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                    for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                        copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 76);
                    }
                    return new String(copyOfRange);
                }

                public static void A02() {
                    A01 = new byte[]{17, 1, airhockey.J_GAME_STANDBY, airhockey.J_ONREWARDED, airhockey.J_ENEMYWIN, 96, airhockey.J_DISCONNECT, 109, airhockey.J_ERROR, 1, 17, 48, 61, 37, 52, 35, 81, 37, 48, 51, 61, 52, 81, 20, 7, 20, 31, 5, 2, 81, 48, 53, 53, 81, 50, 62, 61, 36, 60, 63, 81, 90, ByteCompanionObject.MAX_VALUE, 95, airhockey.J_PURCHASE, 111, airhockey.J_PURCHASE, airhockey.J_WAIT, airhockey.J_PURCHASE, airhockey.J_ENEMYLOSE, 126, 83, 126, 119, airhockey.J_GAME_ENEMYEXIT, 126, airhockey.J_GAME_REMATCH, 59, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_PURCHASE, airhockey.J_ERROR, 59, airhockey.J_ERROR, airhockey.J_DISCONNECT, 111, 59, airhockey.J_WAIT, 126, 59, airhockey.J_ERROR, airhockey.J_INVITE, 119, 119, 33, 55, 42, 53, airhockey.P_GAME_STANDBY, 49, 36, 39, 41, 32, airhockey.P_GAME_STANDBY, 44, 35, airhockey.P_GAME_STANDBY, 32, 61, 44, 54, 49, 54, airhockey.P_GAME_STANDBY, 6, 23, 4, 22, 13, 0, 22, 88, 90, airhockey.P_GAME_REMATCH, 79, airhockey.P_GAME_STANDBY, airhockey.P_GAME_REMATCH, 40, airhockey.J_INVITE, airhockey.J_ENEMYWIN, airhockey.J_PURCHASE, 109, airhockey.J_SDKVER, 111, 102, 87, 99, 109, airhockey.J_BACK, 123, 40, 53, 40, airhockey.P_GAME_MYWIN, airhockey.P_GAME_BREAKBALLCOUNT, 51, 124, airhockey.J_WAIT, airhockey.J_INVITE, 56, airhockey.J_INVITE, 51, airhockey.J_WAIT, ByteCompanionObject.MAX_VALUE};
                }

                static {
                    A02();
                    A03 = C7X.class.getSimpleName();
                }

                {
                    super(c0886Xb, A01(c0886Xb), (SQLiteDatabase.CursorFactory) null, 4);
                    if (this != null) {
                        this.A00 = this;
                        return;
                    }
                    throw new IllegalArgumentException(A00(41, 32, 87));
                }

                public static String A01(C0886Xb c0886Xb2) {
                    Locale locale = Locale.US;
                    Object[] objArr = {A00(0, 0, 95)};
                    String processName = A00(126, 8, 81);
                    String format = String.format(locale, processName, objArr);
                    if (!IK.A21(c0886Xb2)) {
                        return format;
                    }
                    String defaultDbName = c0886Xb2.getPackageName();
                    String processName2 = ProcessUtils.getProcessName(c0886Xb2);
                    if (!defaultDbName.equals(processName2) && !TextUtils.isEmpty(processName2)) {
                        String defaultDbName2 = '_' + processName2;
                        return String.format(Locale.US, processName, defaultDbName2);
                    }
                    return format;
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onCreate(SQLiteDatabase sQLiteDatabase) {
                    for (C7a c7a : this.A00.A0M()) {
                        c7a.A07(sQLiteDatabase);
                    }
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
                    C7a[] A0M;
                    for (C7a c7a : this.A00.A0M()) {
                        c7a.A08(sQLiteDatabase);
                        c7a.A07(sQLiteDatabase);
                    }
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onOpen(SQLiteDatabase sQLiteDatabase) {
                    super.onOpen(sQLiteDatabase);
                    if (!sQLiteDatabase.isReadOnly()) {
                        sQLiteDatabase.execSQL(A00(101, 25, 68));
                    }
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
                    if (i == 2 && i2 >= 3) {
                        String A00 = A00(73, 28, 41);
                        if (A02[7].length() != 30) {
                            throw new RuntimeException();
                        }
                        A02[3] = "Uy0CZyDaBZXeJSQ63Y80hAJR5wsAelR7";
                        sQLiteDatabase.execSQL(A00);
                    }
                    if (i <= 3 && i2 >= 4) {
                        C7U c7u = C0885Xa.A02;
                        sQLiteDatabase.execSQL(A00(11, 30, 61) + c7u.A01 + A00(0, 1, 125) + c7u.A02 + A00(1, 10, 109));
                    }
                }
            };
        }
        return this.A00.getWritableDatabase();
    }

    private synchronized SQLiteDatabase A01() {
        SQLiteException e = null;
        for (int i = 0; i < 10; i++) {
            try {
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException unused) {
                }
            }
        }
        this.A01.A07().A9C(A05(128, 8, 84), C02627s.A0v, new C02637t(e));
        throw e;
        return A00();
    }

    public final int A08(int i) {
        A08.lock();
        try {
            SQLiteDatabase A0E = A0E();
            String A052 = A05(136, 6, 111);
            return A0E.delete(A052, C0885Xa.A02.A01 + A05(3, 4, 28), new String[]{String.valueOf(i - 1)});
        } finally {
            A08.unlock();
        }
    }

    public final Cursor A09() {
        A07.lock();
        try {
            return this.A02.A0B();
        } finally {
            A07.unlock();
        }
    }

    public final Cursor A0A() {
        A07.lock();
        try {
            return this.A02.A0C();
        } finally {
            A07.unlock();
        }
    }

    public final Cursor A0B() {
        A07.lock();
        try {
            return this.A03.A0B();
        } finally {
            A07.unlock();
        }
    }

    public final Cursor A0C(int i) {
        A07.lock();
        try {
            SQLiteDatabase A0E = A0E();
            return A0E.rawQuery(A06 + A05(23, 7, 1) + String.valueOf(i), null);
        } finally {
            A07.unlock();
        }
    }

    public final Cursor A0D(String str) {
        A07.lock();
        try {
            return this.A02.A0D(str);
        } finally {
            A07.unlock();
        }
    }

    public final SQLiteDatabase A0E() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return A01();
        }
        throw new IllegalStateException(A05(64, 43, 96));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7Z != com.facebook.ads.internal.database.AdDatabaseQuery<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8W != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<T> */
    public final <T> AsyncTask A0F(C7Z<T> c7z, C8W<T> c8w) {
        return LN.A00(LQ.A07, new AsyncTask<Void, Void, T>(this.A01, c7z, c8w) { // from class: com.facebook.ads.redexgen.X.7V
            public static byte[] A04;
            public static String[] A05 = {"65r9CRdv0GoLRVNVjbjXzJK5P2ycj7FG", "0CWnyuhck9HOQgwCfxzQ09GVkx", "IEC2mc7xTTQi8lqWDODmms9jEFByhoZx", "6exEWFSZK9oTcnxcvUurXohDGqhdlb0H", "22QzghXqrFZ4DBGtDF", "dbvBYMdgslkBJuEWD9uCPJqFmtTt8cU5", "jZC4Ivj", "4jv2LQemXeCXPfpssPDUuPD2TleIiZzb"};
            public C7Y A00;
            public final C0886Xb A01;
            public final C7Z<T> A02;
            public final C8W<T> A03;

            public static String A01(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    int i5 = (copyOfRange[i4] - i3) - 116;
                    if (A05[7].charAt(12) != 'P') {
                        throw new RuntimeException();
                    }
                    A05[6] = "VTML";
                    copyOfRange[i4] = (byte) i5;
                }
                return new String(copyOfRange);
            }

            public static void A02() {
                A04 = new byte[]{31, 28, 47, 28, 29, 28, 46, 32};
            }

            static {
                A02();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7V != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7Z != com.facebook.ads.internal.database.AdDatabaseQuery<T> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8W != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<T> */
            {
                this.A02 = c7z;
                this.A03 = c8w;
                this.A01 = c0886Xb;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7V != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
            private final T A00(Void... voidArr) {
                if (C0548Jt.A02(this)) {
                    return null;
                }
                if (A05[6].length() != 11) {
                    A05[2] = "4eGiZ19xQ4OxGjIavdFldPBRBlbWR0DL";
                    T t = null;
                    try {
                        try {
                            t = this.A02.A03();
                            this.A00 = this.A02.A00();
                            return t;
                        } catch (Exception e) {
                            this.A01.A07().A9C(A01(0, 8, 71), C02627s.A0w, new C02637t(e));
                            this.A00 = C7Y.A09;
                            return t;
                        }
                    } catch (Throwable th) {
                        C0548Jt.A00(th, this);
                        return null;
                    }
                }
                throw new RuntimeException();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7V != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
            @Override // android.os.AsyncTask
            public final /* bridge */ /* synthetic */ Object doInBackground(Void[] voidArr) {
                if (C0548Jt.A02(this)) {
                    return null;
                }
                try {
                    return A00(voidArr);
                } catch (Throwable th) {
                    C0548Jt.A00(th, this);
                    return null;
                }
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7V != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
            @Override // android.os.AsyncTask
            public final void onPostExecute(T result) {
                if (C0548Jt.A02(this)) {
                    return;
                }
                try {
                    if (this.A00 == null) {
                        this.A03.A02(result);
                    } else {
                        this.A03.A01(this.A00.A02(), this.A00.A03());
                    }
                } catch (Throwable th) {
                    C0548Jt.A00(th, this);
                }
            }
        }, new Void[0]);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8W != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
    public final AsyncTask A0G(String str, int i, String str2, double d, double d2, String str3, Map<String, String> data, C8W<String> c8w) {
        return A0F(new C0401Du(this, str2, str, i, d, d2, str3, data), c8w);
    }

    public final void A0H() {
        A08.lock();
        try {
            this.A02.A09();
            this.A03.A09();
        } finally {
            A08.unlock();
        }
    }

    public final void A0I() {
        A08.lock();
        try {
            this.A03.A0D(this.A01);
        } finally {
            A08.unlock();
        }
    }

    public final boolean A0K(String str) {
        A08.lock();
        try {
            boolean A0F = this.A02.A0F(str);
            Lock lock = A08;
            String[] strArr = A05;
            if (strArr[7].charAt(23) != strArr[1].charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[4] = "8";
            strArr2[5] = "N";
            lock.unlock();
            return A0F;
        } catch (Throwable th) {
            A08.unlock();
            throw th;
        }
    }

    public final boolean A0L(String str) {
        boolean z;
        A08.lock();
        try {
            A0E().execSQL(A05(121, 7, 95) + A05(136, 6, 111) + A05(44, 5, 67) + C0885Xa.A02.A01 + A05(61, 1, 83) + C0885Xa.A02.A01 + A05(56, 2, 49) + A05(49, 7, 11) + C0885Xa.A04.A01 + A05(62, 2, 26), new String[]{str});
            z = true;
        } catch (SQLiteException unused) {
            z = false;
        }
        A08.unlock();
        String[] strArr = A05;
        if (strArr[0].charAt(2) != strArr[6].charAt(2)) {
            throw new RuntimeException();
        }
        A05[2] = "LEhHmvsdsEQXOsQ0B1AVwqczGhJrofDk";
        return z;
    }

    public final C7a[] A0M() {
        return new C7a[]{this.A03, this.A02};
    }
}
