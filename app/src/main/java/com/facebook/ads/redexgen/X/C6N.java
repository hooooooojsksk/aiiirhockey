package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.6N */
/* loaded from: assets/audience_network.dex */
public final class C6N {
    public static byte[] A02;
    public static String[] A03 = {"xEW9LSpkxtcMkiVkCjWXuTu5CJHPJiyq", "tTP", "A", "dhAFlm3SiPB0s9864OvgcmZEVzRtwwmX", "mnE9bSEHBlleLkXo6La2W5bpkmZqSUyN", "0jwmHWkFqK", "xBcWrb6s57BN1yke0uYkFqIHC7aAgPEb", "dL0KwaEpZdlIbw3ka3MpOkzONR5qkJY2"};
    public static final String A04;
    public static volatile C6N A05;
    public final C0886Xb A00;
    public final Map<String, C6K> A01 = Collections.synchronizedMap(new HashMap());

    public static String A08(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 89);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A02 = new byte[]{airhockey.J_SDKVER, 102, 34, 124, airhockey.J_NATION, airhockey.J_GAME_ENEMYEXIT, airhockey.P_GAME_SELECTMAP, airhockey.J_ENEMYWIN, airhockey.J_NATION, 38, airhockey.J_GAME_REMATCH, airhockey.J_SAVEDGAME_SAVE, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_REWARD, airhockey.J_SAVEDGAME_SAVE, airhockey.J_SAVEDGAME_RELOAD, 38, airhockey.J_NATION, 99, airhockey.J_ERROR, airhockey.J_SAVEDGAME_RELOAD, 111, airhockey.J_ENEMYLOSE, airhockey.J_ENEMYWIN, airhockey.J_SAVEDGAME_RELOAD, 111, airhockey.J_GAME_REMATCH, airhockey.J_ENEMYLOSE, 38, 46, 96, 111, airhockey.J_GAME_EXIT, 99, 59, 26, 49, 44, 53, 57, 40, airhockey.J_ACHIEVEMENTCALLBACK, 43, 49, 34, 61, airhockey.J_ACHIEVEMENTCALLBACK, 61, 32, 59, 61, 61, 60, 43, airhockey.J_ACHIEVEMENTCALLBACK, 53, 57, 32, airhockey.J_ACHIEVEMENTCALLBACK, 43, 49, 34, 61, airhockey.J_ACHIEVEMENTCALLBACK, 62, 55, 42, airhockey.J_ACHIEVEMENTCALLBACK, 43, 44, 55, 42, 57, 63, 61, airhockey.J_NATION, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_ENEMYWIN, airhockey.P_GAME_STANDBY, airhockey.P_GAME_MYWIN, 76, 65, 4, 65, 86, 86, 75, 86, 10, 4, 102, 77, 80, airhockey.P_GAME_REMATCH, airhockey.P_GAME_STANDBY, 84, 4, 77, 87, 4, airhockey.P_GAME_EXIT, 81, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_MYLOSE, 10, 57, 30, 22, 19, 26, 27, 95, 11, 16, 95, 28, 16, 15, 6, 95, 19, 16, 28, 30, 19, 95, 22, 18, 30, 24, 26, 95, 22, 17, 11, 16, 95, 28, 30, 28, 23, 26, 95, 87, 10, 13, 19, airhockey.P_NATION, 53, 14, 1, 2, 12, 5, 64, 20, 15, 64, 23, 18, 9, 20, 5, 64, 2, 9, 20, 13, 1, 16, 64, 20, 15, 64, 6, 9, 12, 5, 64, airhockey.P_GAME_MYLOSE, 21, 18, 12, 93, 80, airhockey.J_GAME_ENEMYEXIT, airhockey.J_ONREWARDED, airhockey.J_ENEMYWIN, airhockey.J_GAME_REMATCH, 96, 37, airhockey.J_BACK, airhockey.J_GAME_EXIT, 37, airhockey.J_SAVEDGAME_RELOAD, 119, airhockey.J_GAME_DISCONNECT, airhockey.J_BACK, 96, 37, airhockey.J_ENEMYWIN, airhockey.J_GAME_DISCONNECT, airhockey.J_BACK, airhockey.J_ENEMYLOSE, airhockey.J_ONREWARDED, airhockey.J_ERROR, 37, airhockey.J_BACK, airhockey.J_GAME_EXIT, 37, airhockey.J_GAME_EXIT, airhockey.J_GOO, airhockey.J_BACK, airhockey.J_ERROR, airhockey.J_GOO, airhockey.J_BACK, 37, airhockey.J_REWARD, airhockey.J_BACK, 119, 96, airhockey.J_ONREWARDED, airhockey.J_ENEMYLOSE, 126, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_DISCONNECT, airhockey.J_PURCHASE, airhockey.J_GAME_ENEMYEXIT, 37, 48, 48, 48, 63, 48, 53, 60, 99, airhockey.J_REWARD, airhockey.J_REWARD, airhockey.P_GAME_SELECTMAP, 75, 78, airhockey.P_GAME_MYWIN, 24, 13, 13, 13, airhockey.P_GAME_MYSCORE, 76, airhockey.P_GAME_BREAKBALLCOUNT, 80, 77, 75, airhockey.P_GAME_BREAKBALLCOUNT, 125, airhockey.P_GAME_MYSCORE, 81, 81, airhockey.P_GAME_MYWIN, 86, 13, 27, 31, 19, 21, 23, 0, 3, 13, 8, 77, 86, 83, 86, 87, 79, 86};
    }

    static {
        A09();
        A04 = C6N.class.getSimpleName();
    }

    public C6N(C0886Xb c0886Xb) {
        this.A00 = c0886Xb;
    }

    private int A00(String str, @Nullable Bitmap bitmap) {
        String A08 = A08(0, 2, 17);
        if (bitmap == null) {
            A0B(null);
            return 0;
        }
        File A07 = A07(this.A00);
        File file = new File(A07, str.hashCode() + A08(2, 4, 85));
        try {
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                    int size = byteArrayOutputStream.size();
                    if (size >= IK.A0E(this.A00)) {
                        A0B(new Throwable(A08(35, 42, 1) + size));
                        A0A(byteArrayOutputStream);
                        A0A(null);
                        return 0;
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    byteArrayOutputStream.writeTo(fileOutputStream);
                    fileOutputStream.flush();
                    A0A(byteArrayOutputStream);
                    A0A(fileOutputStream);
                    return size;
                } catch (IOException ioe) {
                    A0B(ioe);
                    String str2 = A04;
                    Log.e(str2, A08(148, 36, 57) + str + A08, ioe);
                    A0A(null);
                    A0A(null);
                    return 0;
                } catch (OutOfMemoryError e) {
                    A0B(e);
                    Log.e(A04, A08(184, 39, 92), e);
                    A0A(null);
                    A0A(null);
                    if (A03[2].length() != 5) {
                        A03[5] = "QxsbBUkJdqjFKv7NMRisOUwCFhjpKYpW";
                        return 0;
                    }
                    throw new RuntimeException();
                }
            } catch (FileNotFoundException fnfe) {
                String str3 = A04;
                Log.e(str3, A08(6, 29, 95) + file.getPath() + A08, fnfe);
                A0B(fnfe);
                A0A(null);
                A0A(null);
                return 0;
            }
        } catch (Throwable th) {
            A0A(null);
            A0A(null);
            throw th;
        }
    }

    @Nullable
    private final Bitmap A01(C7N c7n, C6K c6k, int i, int i2, String str) {
        if (C6P.A06(c7n) && A08(266, 4, 53).equals(str)) {
            Map<String, C6K> map = this.A01;
            if (A03[4].charAt(4) != 'b') {
                throw new RuntimeException();
            }
            A03[1] = "FHlvPh";
            map.put(c6k.A07, c6k);
        }
        String str2 = c6k.A07;
        C6O c6o = new C6O(c6k.A05, c6k.A06, A08(261, 5, 43), str, str2);
        File A07 = A07(this.A00);
        StringBuilder sb = new StringBuilder();
        sb.append(str2.hashCode());
        String url = A08(2, 4, 85);
        sb.append(url);
        String url2 = sb.toString();
        File file = new File(A07, url2);
        if (!file.exists()) {
            C6P.A04(c7n, c6o, false);
            String url3 = A08(232, 7, 0);
            if (str2.startsWith(url3)) {
                String url4 = A08(239, 22, 123);
                if (!str2.startsWith(url4)) {
                    return A04(str2, i2, i);
                }
            }
            return A02(c7n, c6k, str);
        }
        C6P.A04(c7n, c6o, true);
        try {
            if (A0C(i2, i)) {
                return C6R.A02(file.getCanonicalPath(), i2, i, this.A00);
            }
            String url5 = file.getCanonicalPath();
            return BitmapFactory.decodeFile(url5);
        } catch (IOException e) {
            A0B(e);
            return null;
        }
    }

    @Nullable
    private Bitmap A02(C7N c7n, C6K c6k, String url) {
        String path;
        Bitmap A01;
        String str = c6k.A07;
        int i = c6k.A03;
        int i2 = c6k.A04;
        long currentTimeMillis = System.currentTimeMillis();
        IOException e = null;
        String A08 = A08(223, 9, 70);
        boolean startsWith = str.startsWith(A08);
        String A082 = A08(239, 22, 123);
        if (startsWith || str.startsWith(A082)) {
            if (str.startsWith(A08)) {
                path = str.substring(A08.length());
            } else {
                path = str.substring(A082.length());
            }
            InputStream inputStream = null;
            try {
                try {
                    inputStream = this.A00.getAssets().open(path);
                    if (A0C(i, i2)) {
                        try {
                            A01 = C6R.A01(inputStream, i, i2);
                        } catch (IOException e2) {
                            e = e2;
                            A0B(e);
                            if (inputStream != null) {
                                A0A(inputStream);
                            }
                            return null;
                        } catch (OutOfMemoryError e3) {
                            e = e3;
                            A0B(e);
                            if (inputStream != null) {
                                A0A(inputStream);
                            }
                            return null;
                        } catch (Throwable th) {
                            e = th;
                            if (inputStream != null) {
                                A0A(inputStream);
                            }
                            throw e;
                        }
                    } else {
                        A01 = BitmapFactory.decodeStream(inputStream);
                    }
                    if (inputStream != null) {
                        A0A(inputStream);
                    }
                } catch (IOException e4) {
                    e = e4;
                } catch (OutOfMemoryError e5) {
                    e = e5;
                } catch (Throwable th2) {
                    e = th2;
                }
            } catch (Throwable th3) {
                e = th3;
            }
        } else {
            boolean A0C = A0C(i, i2);
            if (A03[2].length() == 5) {
                Throwable storedThrowable = new RuntimeException();
                throw storedThrowable;
            }
            A03[3] = "EtuvklQgZLPMp8CYh3QQVMKsyyqrprqR";
            if (A0C) {
                try {
                    A01 = A05(str, i, i2);
                } catch (IOException e6) {
                    e = e6;
                    A0B(e);
                    A01 = A03(str);
                }
            } else {
                A01 = A03(str);
            }
        }
        String th4 = e != null ? e.toString() : null;
        if (A01 == null) {
            C6P.A03(c7n, c6k, url, C6P.A03, th4, null, null);
            return null;
        }
        long A00 = A00(str, A01);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (A00 <= 0) {
            C6P.A03(c7n, c6k, url, C6P.A01, th4, null, null);
            if (IK.A0t(c7n)) {
                return null;
            }
            return A01;
        }
        C6P.A03(c7n, c6k, url, C6P.A02, th4, Long.valueOf(A00), Long.valueOf(currentTimeMillis2));
        return A01;
    }

    @Nullable
    private Bitmap A03(String str) {
        byte[] bytes;
        QF ADS = QY.A00(this.A00).ADS(str, new QU());
        if (ADS != null && (bytes = ADS.A5r()) != null) {
            return BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
        }
        return null;
    }

    @Nullable
    private Bitmap A04(String str, int i, int i2) {
        Bitmap A022;
        int A00;
        try {
            boolean A0C = A0C(i, i2);
            String A08 = A08(232, 7, 0);
            if (!A0C) {
                A022 = BitmapFactory.decodeStream(new FileInputStream(str.substring(A08.length())), null, null);
            } else {
                A022 = C6R.A02(str.substring(A08.length()), i, i2, this.A00);
            }
            A00 = A00(str, A022);
        } catch (IOException e) {
            String str2 = A04;
            Log.e(str2, A08(105, 43, 38) + str + A08(0, 2, 17), e);
        }
        if (IK.A0t(this.A00)) {
            if (A00 <= 0) {
                return null;
            }
            return A022;
        }
        return A022;
    }

    @Nullable
    private Bitmap A05(String str, int i, int i2) throws IOException {
        URL urlObj = new URL(str);
        HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();
        connection.setDoInput(true);
        connection.connect();
        InputStream inputStream = connection.getInputStream();
        Bitmap A01 = C6R.A01(inputStream, i, i2);
        A0A(inputStream);
        return A01;
    }

    public static C6N A06(C0886Xb c0886Xb) {
        if (A05 == null) {
            synchronized (C6N.class) {
                if (A05 == null) {
                    A05 = new C6N(c0886Xb);
                }
            }
        }
        return A05;
    }

    public static File A07(C7N c7n) {
        return c7n.getCacheDir();
    }

    public static void A0A(@Nullable Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    private void A0B(@Nullable Throwable th) {
        String A08 = A08(261, 5, 43);
        if (th != null) {
            this.A00.A07().A9C(A08, C02627s.A1e, new C02637t(th));
        } else {
            this.A00.A07().A9C(A08, C02627s.A1e, new C02637t(A08(77, 28, 125)));
        }
    }

    private boolean A0C(int i, int i2) {
        return i > 0 && i2 > 0 && IK.A15(this.A00);
    }

    @Nullable
    public final Bitmap A0D(C6K c6k) {
        return A01(this.A00, c6k, c6k.A04, c6k.A03, c6k.A01);
    }

    @Nullable
    public final Bitmap A0E(C7N c7n, String str, int i, int i2, String str2) {
        C6K c6k = this.A01.get(str);
        return (!C6P.A06(c7n) || c6k == null) ? A01(c7n, new C6K(str, i, i2, A08(270, 7, 97), A08(270, 7, 97)), i2, i, str2) : A01(c7n, c6k, i2, i, str2);
    }

    @Nullable
    public final File A0F(String str) {
        File A07 = A07(this.A00);
        File file = new File(A07, str.hashCode() + A08(2, 4, 85));
        if (file.exists()) {
            return file;
        }
        return null;
    }

    public final String A0G(String str) {
        File A07 = A07(this.A00);
        File file = new File(A07, str.hashCode() + A08(2, 4, 85));
        return file.exists() ? file.getPath() : str;
    }
}
