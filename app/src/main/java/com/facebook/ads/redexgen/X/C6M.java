package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.net.TrafficStats;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.6M */
/* loaded from: assets/audience_network.dex */
public final class C6M {
    public static AnonymousClass00 A0A;
    public static List<String> A0B;
    public static byte[] A0C;
    public static String[] A0D = {"8gkZjHnxCvZyg7TzwjjGeSdvls9L7Gam", "fcbSC3ja3K2jNylkxCBC51G6bXitMdQ0", "2foOCT", "ocB0m3", "KfMQJM794wt5IuG", "feDb68pnVWWOEqV45c", "KnEa0S3Tnigt4irEXno07XBXpnYxFsFq", "aK1UKkDbG3zR1xh0x3umKxUvmkPLseuR"};
    public static final String A0E;
    public static final Map<String, AnonymousClass06> A0F;
    public static final Map<String, C6O> A0G;
    public long A00;
    public C0513Ii A01;
    public final C6N A03;
    public final C7N A04;
    public final boolean A08;
    public final boolean A09;
    public final Map<String, Bitmap> A07 = Collections.synchronizedMap(new HashMap());
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public final List<Callable<Boolean>> A05 = new ArrayList();
    public final List<Callable<Boolean>> A06 = new ArrayList();

    public static String A08(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 10);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static AtomicBoolean A0D(ArrayList<Callable<Boolean>> arrayList) {
        ArrayList<Future> arrayList2 = new ArrayList(arrayList.size());
        Iterator<Callable<Boolean>> it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A0D;
            if (strArr[3].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            A0D[5] = "";
            if (!hasNext) {
                AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                try {
                    for (Future future : arrayList2) {
                        Boolean bool = (Boolean) future.get();
                        atomicBoolean.set(atomicBoolean.get() && bool != null && bool.booleanValue());
                    }
                } catch (InterruptedException | ExecutionException e) {
                    Log.e(A0E, A08(78, 42, 23), e);
                    atomicBoolean.set(false);
                }
                return atomicBoolean;
            }
            arrayList2.add(LQ.A02().submit(it.next()));
        }
    }

    public static void A0F() {
        A0C = new byte[]{124, -127, -126, -82, ByteCompanionObject.MAX_VALUE, -84, 124, ByteCompanionObject.MAX_VALUE, airhockey.J_GAME_EXIT, airhockey.J_INVITE, -105, -101, airhockey.J_ENEMYWIN, -105, airhockey.J_GAME_REMATCH, -104, 96, 126, ByteCompanionObject.MIN_VALUE, -123, -126, 61, -112, -111, 126, -113, -111, -126, -127, 75, -119, -89, -87, -82, -81, -76, -83, 102, -87, -75, -77, -74, -78, -85, -70, -85, -113, -83, -81, -76, -75, -70, -77, airhockey.J_GAME_DISCONNECT, -78, -83, -75, -72, -79, -80, ByteCompanionObject.MAX_VALUE, -99, -97, -92, -91, -86, -93, 92, -81, -80, -99, -82, -80, -95, -96, airhockey.J_GAME_EXIT, airhockey.J_GAME_EXIT, airhockey.J_GAME_EXIT, 102, -103, -124, -122, -111, -107, -118, -112, -113, 65, -104, -119, -118, -115, -122, 65, -122, -103, -122, -124, -106, -107, -118, -113, -120, 65, -124, -126, -124, -119, -122, 65, -123, -112, -104, -113, -115, -112, -126, -123, -108, 79, -88, 125, 124, airhockey.J_PURCHASE, -84, 126, 123, -79, -81, -79, -74, -77, -111, -67, -69, -66, -70, -77, -62, -73, -67, -68, -106, -67, -67, -71, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_REWARD, airhockey.J_ACHIEVEMENTCALLBACK, 125, airhockey.J_PURCHASE, 91, airhockey.J_REWARD, 126, -127, -118, -121, airhockey.J_PURCHASE, 93, -124, -124, ByteCompanionObject.MIN_VALUE, -120, -101, -120, -122, -104, -105, -120, -24, -21, -35, -32, -27, -24, -38, -35, -40, -19, -30, -26, -34, -40, -26, -20, -96, -107, -100, -92};
    }

    static {
        A0F();
        A0E = C6M.class.getSimpleName();
        A0F = Collections.synchronizedMap(new HashMap());
        A0G = Collections.synchronizedMap(new HashMap());
    }

    public C6M(C7N c7n) {
        this.A04 = c7n;
        this.A03 = C6N.A06(c7n.A01());
        this.A08 = IK.A27(c7n);
        this.A09 = IK.A2F(c7n, C0701Pu.A03());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.07] */
    public static synchronized AnonymousClass00 A03(C0886Xb c0886Xb) {
        AnonymousClass00 anonymousClass00;
        synchronized (C6M.class) {
            if (A0A == null) {
                A0A = AnonymousClass01.A00(c0886Xb, new Object() { // from class: com.facebook.ads.redexgen.X.07
                    public int A00;
                    public int A01;
                    public boolean A02;
                    public boolean A03;
                    public boolean A04;

                    public final AnonymousClass07 A00(int i) {
                        this.A00 = i;
                        return this;
                    }

                    public final AnonymousClass07 A01(int i) {
                        this.A01 = i;
                        return this;
                    }

                    public final AnonymousClass07 A02(boolean z) {
                        this.A02 = z;
                        return this;
                    }

                    public final AnonymousClass07 A03(boolean z) {
                        this.A03 = z;
                        return this;
                    }

                    public final AnonymousClass07 A04(boolean z) {
                        this.A04 = z;
                        return this;
                    }

                    public final AnonymousClass08 A05() {
                        return new AnonymousClass08(this.A00, this.A02, this.A01, this.A03, this.A04);
                    }
                }.A00(IK.A05(c0886Xb)).A02(c0886Xb.A04().A8f()).A01(-1).A03(IK.A0l(c0886Xb)).A04(IK.A2E(c0886Xb)).A05(), A05(c0886Xb));
            }
            anonymousClass00 = A0A;
        }
        return anonymousClass00;
    }

    public static AnonymousClass06 A04(C7N c7n, String str) {
        AnonymousClass06 anonymousClass06 = A0F.get(str);
        if (C6P.A06(c7n) && anonymousClass06 != null) {
            AnonymousClass06 storedCacheData = new AnonymousClass06(anonymousClass06);
            return storedCacheData;
        }
        AnonymousClass06 storedCacheData2 = new AnonymousClass06(str);
        return storedCacheData2;
    }

    public static C0L A05(C0886Xb c0886Xb) {
        return new C0891Xg(c0886Xb);
    }

    public static synchronized List<String> A09(C7N c7n) {
        List<String> list;
        synchronized (C6M.class) {
            if (A0B == null) {
                A0B = new ArrayList();
                A0J(A0B, c7n);
            }
            list = A0B;
        }
        return list;
    }

    public static void A0H(C7N c7n, String str) {
        C6O c6o;
        if (C6P.A06(c7n) && !TextUtils.isEmpty(str) && (c6o = A0G.get(str)) != null) {
            c6o.A00 = A08(185, 4, 35);
            C0886Xb A01 = c7n.A01();
            C0705Py A05 = C0705Py.A05(A01);
            String A08 = C0705Py.A08(A01, KT.A00(str));
            if (A08 == null) {
                A08 = str;
            }
            C6P.A04(c7n, c6o, A05.A0H(A08));
        }
    }

    public void A0I(EnumC0512Ih enumC0512Ih) {
        if (this.A01 == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(A08(173, 12, 111), LC.A04(this.A00));
        this.A01.A04(enumC0512Ih, hashMap);
    }

    public static void A0J(List<String> cacheDirs, C7N c7n) {
        A0K(cacheDirs, C0996aa.A01(c7n));
        A0K(cacheDirs, C6N.A07(c7n));
    }

    public static void A0K(List<String> list, File file) {
        String path;
        if (file == null || (path = file.getPath()) == null) {
            return;
        }
        String[] strArr = A0D;
        String str = strArr[3];
        String path2 = strArr[2];
        if (str.length() != path2.length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0D;
        strArr2[3] = "Vghlgc";
        strArr2[2] = "qwUey9";
        String path3 = A08(0, 0, 127);
        if (path != path3) {
            String path4 = path.toLowerCase(Locale.getDefault());
            list.add(path4);
        }
    }

    @Nullable
    public final Bitmap A0M(String str) {
        return this.A07.get(str);
    }

    @Nullable
    public final Bitmap A0N(String str, int i, int i2) {
        if (this.A08) {
            AnonymousClass06 A04 = A04(this.A04, str);
            A04.A03 = A08(185, 4, 35);
            A04.A01 = i2;
            A04.A00 = i;
            return A03(this.A04.A01()).AEN(A04, true).A00();
        }
        return this.A03.A0E(this.A04, str, i, i2, A08(169, 4, 114));
    }

    @Nullable
    public final File A0O(String str) {
        AnonymousClass06 A04 = A04(this.A04, str);
        A04.A03 = A08(185, 4, 35);
        return A03(this.A04.A01()).AEO(A04);
    }

    @Nullable
    public final File A0P(String str) {
        if (this.A08) {
            return A0O(str);
        }
        return this.A03.A0F(str);
    }

    public final String A0Q(String str) {
        if (this.A08) {
            return A0R(str);
        }
        return this.A03.A0G(str);
    }

    public final String A0R(String str) {
        AnonymousClass06 A04 = A04(this.A04, str);
        A04.A03 = A08(185, 4, 35);
        String AEQ = A03(this.A04.A01()).AEQ(A04);
        return AEQ != null ? AEQ : str;
    }

    public final String A0S(String str) {
        if (this.A09) {
            A0H(this.A04, str);
            return str;
        }
        return A0R(str);
    }

    public final void A0T() {
        JO.A05(A08(127, 19, 68), A08(30, 16, 60), A08(0, 8, 64));
    }

    public final void A0U() {
        JO.A05(A08(146, 16, 11), A08(46, 14, 66), A08(120, 7, 61));
    }

    public final void A0V() {
        this.A07.clear();
    }

    public final void A0W(@Nullable C6E c6e, C6F c6f) {
        JO.A05(A08(162, 7, 25), A08(60, 18, 50), A08(8, 8, 44));
        this.A00 = System.currentTimeMillis();
        C6P.A02(this.A04, c6f, C6P.A07, A08(16, 14, 19), -1L);
        LQ.A03().execute(new C0892Xh(this, new ArrayList(this.A05), c6e, c6f, new ArrayList(this.A06)));
        this.A05.clear();
        this.A06.clear();
    }

    public final void A0X(C6I c6i) {
        this.A05.add(new C6J(this, c6i));
    }

    public final void A0Y(C6I c6i) {
        c6i.A05 = true;
        this.A06.add(new C6J(this, c6i));
    }

    public final void A0Z(C6I c6i) {
        c6i.A05 = true;
        if (this.A09) {
            this.A06.add(new C6H(this, c6i));
        } else {
            this.A06.add(new C6J(this, c6i));
        }
    }

    public final void A0a(C6I c6i) {
        if (this.A09) {
            this.A05.add(new C6H(this, c6i));
        } else {
            this.A05.add(new C6J(this, c6i));
        }
    }

    public final void A0b(C6K c6k) {
        Callable<Boolean> callable = new Callable<Boolean>(c6k) { // from class: com.facebook.ads.redexgen.X.6L
            public static byte[] A02;
            public static String[] A03 = {"jwTNBF52XqMGgcVEiQTwvXvSBsl43Bcu", "zl9XISU", "9LwyCiCzMXmNgkxTRjX8XUqiNT4UlidW", "Jar4Zz8ck96tLH67JFbLbWmYESMeU49V", "Yd8bjyjazIom6Oxe2tnjIAJyfdSlHwWG", "VgUZ5KaBAYbzt3oMIew8EQ4BA2c", "hXTgBapwd4emagenALPcDOSBW5zmdf3H", "17k"};
            public final C6K A00;

            public static String A01(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
                int i4 = 0;
                while (true) {
                    int length = copyOfRange.length;
                    if (A03[1].length() == 32) {
                        throw new RuntimeException();
                    }
                    A03[3] = "";
                    if (i4 >= length) {
                        return new String(copyOfRange);
                    }
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 48);
                    i4++;
                }
            }

            public static void A02() {
                A02 = new byte[]{-20, -16, -28, -22, -24};
            }

            static {
                A02();
            }

            {
                this.A00 = c6k;
            }

            private final Boolean A00() {
                C7N c7n;
                boolean z;
                C7N c7n2;
                AnonymousClass00 A032;
                boolean z2;
                boolean z3;
                C6N c6n;
                Map map;
                if (C0548Jt.A02(this)) {
                    return null;
                }
                try {
                    TrafficStats.setThreadStatsTag(61453);
                    AnonymousClass06 anonymousClass06 = new AnonymousClass06(this.A00.A07, this.A00.A06, this.A00.A05, A01(0, 5, 83), this.A00.A01, this.A00.A02);
                    anonymousClass06.A01 = this.A00.A04;
                    anonymousClass06.A00 = this.A00.A03;
                    c7n = C6M.this.A04;
                    if (C6P.A06(c7n)) {
                        map = C6M.A0F;
                        map.put(this.A00.A07, anonymousClass06);
                    }
                    z = C6M.this.A08;
                    boolean precacheResult = false;
                    if (A03[3].length() != 5) {
                        A03[4] = "CZcPy1KhLDdCOlGcBT5xxsnRB32IUDMD";
                        if (!z) {
                            c6n = C6M.this.A03;
                            if (c6n.A0D(this.A00) != null) {
                                precacheResult = true;
                            }
                        } else {
                            c7n2 = C6M.this.A04;
                            A032 = C6M.A03(c7n2.A01());
                            precacheResult = A032.AEN(anonymousClass06, false).A01();
                        }
                        C6S c6s = this.A00.A00;
                        if (c6s != null && c6s.A02()) {
                            int A00 = c6s.A00();
                            int A01 = c6s.A01();
                            if (A00 <= 0 || A01 <= 0) {
                                z2 = C6M.this.A08;
                                if (z2) {
                                    A04(this.A00.A07, anonymousClass06);
                                } else {
                                    A03(this.A00.A03, this.A00.A04);
                                }
                            } else {
                                z3 = C6M.this.A08;
                                if (z3) {
                                    anonymousClass06.A00 = A00;
                                    anonymousClass06.A01 = A01;
                                    A04(this.A00.A07, anonymousClass06);
                                } else {
                                    A03(A00, A01);
                                }
                            }
                        }
                        return Boolean.valueOf(precacheResult);
                    }
                    throw new RuntimeException();
                } catch (Throwable th) {
                    C0548Jt.A00(th, this);
                    return null;
                }
            }

            private void A03(int i, int i2) {
                C6N c6n;
                C7N c7n;
                Map map;
                c6n = C6M.this.A03;
                c7n = C6M.this.A04;
                Bitmap A0E2 = c6n.A0E(c7n, this.A00.A07, i, i2, this.A00.A01);
                if (A0E2 == null) {
                    return;
                }
                map = C6M.this.A07;
                map.put(this.A00.A07, A0E2);
            }

            private void A04(String str, AnonymousClass06 anonymousClass06) {
                C7N c7n;
                AnonymousClass00 A032;
                Map map;
                c7n = C6M.this.A04;
                A032 = C6M.A03(c7n.A01());
                Bitmap A00 = A032.AEN(anonymousClass06, true).A00();
                if (A00 == null) {
                    return;
                }
                map = C6M.this.A07;
                map.put(str, A00);
            }

            @Override // java.util.concurrent.Callable
            public final /* bridge */ /* synthetic */ Boolean call() throws Exception {
                if (C0548Jt.A02(this)) {
                    return null;
                }
                try {
                    return A00();
                } catch (Throwable th) {
                    C0548Jt.A00(th, this);
                    return null;
                }
            }
        };
        if (!c6k.A02) {
            this.A05.add(callable);
        } else {
            this.A06.add(callable);
        }
    }

    public final void A0c(C6K c6k) {
        c6k.A02 = true;
        A0b(c6k);
    }

    public final void A0d(C0513Ii c0513Ii) {
        this.A01 = c0513Ii;
    }
}
