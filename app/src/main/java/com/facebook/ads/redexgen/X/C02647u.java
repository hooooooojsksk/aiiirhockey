package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.mobirix.airhockey.airhockey;
import cz.msebera.android.httpclient.HttpStatus;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.ByteCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.7u */
/* loaded from: assets/audience_network.dex */
public final class C02647u {
    public static AtomicInteger A00;
    public static byte[] A01;
    public static String[] A02 = {"TEIgz1GSUxi0w6HxI", "WqDufwBE7AlvD41n6qdN4YbCXU2LtDad", "95AkSvnB6didgYS0", "q9Pm9O4XheyxpjJIaV85netzFUNpUTJ1", "laKi0sQOm1cRNFPmXQKezZzTFfBBOlTJ", "R9By8R7rHrFXxi8d0eZrOpOQKJFwFXXr", "DNKj97yZe49oXEmfRz7aINNiwqbkjDQZ", "HsAQREGxpVIGFVt11mTJ2r8ajNtMZb1h"};
    public static final Object A03;
    public static final String A04;
    public static final Map<String, Integer> A05;
    public static final Set<String> A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C02667w A01(String str, C7N c7n, Map<String, String> map) {
        C02667w c02667w = null;
        try {
            c02667w = new C02667w(c7n.A08().A01(), c7n.A08().A02(), new C02517g(str, map, true).A02());
            A0C(c02667w, c7n);
            return c02667w;
        } catch (Exception unused) {
            return c02667w;
        }
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 124);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static JSONArray A04(C7N c7n, int i) {
        InterfaceC02617r A07;
        JSONArray jSONArray = new JSONArray();
        synchronized (A03) {
            FileInputStream fileInputStream = null;
            InputStreamReader inputStreamReader = null;
            BufferedReader bufferedReader = null;
            try {
                if (new File(c7n.getFilesDir(), ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c7n)).exists()) {
                    fileInputStream = c7n.openFileInput(ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c7n));
                    inputStreamReader = new InputStreamReader(fileInputStream);
                    bufferedReader = new BufferedReader(inputStreamReader);
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null || i == 0) {
                            break;
                        }
                        JSONObject jSONObject = new JSONObject(readLine);
                        if (!jSONObject.has(A02(260, 7, 27))) {
                            jSONObject.put(A02(260, 7, 27), String.valueOf(0));
                        }
                        String string = jSONObject.getString(A02(343, 2, 126));
                        if (!A06.contains(string)) {
                            int i2 = jSONObject.getInt(A02(260, 7, 27));
                            if (A05.containsKey(string)) {
                                jSONObject.put(A02(260, 7, 27), String.valueOf(A05.get(string)));
                            } else {
                                A0E(string, i2);
                            }
                            jSONArray.put(jSONObject);
                            if (i > 0) {
                                i--;
                            }
                        }
                    }
                }
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e) {
                        e = e;
                        A07 = c7n.A07();
                        A07.A3S(e);
                        return jSONArray;
                    }
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException | JSONException e2) {
                c7n.A07().A3S(e2);
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e3) {
                        e = e3;
                        A07 = c7n.A07();
                        A07.A3S(e);
                        return jSONArray;
                    }
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            }
        }
        return jSONArray;
    }

    public static void A06() {
        A01 = new byte[]{7, 95, 83, 55, 1, 28, 3, 48, 28, 6, 29, 7, 22, 1, airhockey.P_GAME_REMATCH, 83, 63, 29, 18, 91, 8, 92, 24, 25, 16, 25, 8, 25, 92, 24, 25, 30, 9, 27, 92, 25, 10, 25, 18, 8, 15, 92, 26, 21, 16, 25, 82, 14, 44, 35, airhockey.J_GAME_EXIT, 57, 109, 41, 40, 33, 40, 57, 40, 109, 43, 36, 33, 40, airhockey.J_GAME_DISCONNECT, 119, airhockey.J_REWARD, airhockey.J_BACK, 102, airhockey.J_DISCONNECT, airhockey.J_GAME_DISCONNECT, 99, airhockey.J_SDKVER, airhockey.J_REWARD, airhockey.J_ERROR, 42, 25, 10, 1, 27, 44, 0, 26, 1, 27, 41, 45, 46, 26, 11, 6, 10, 1, 12, 10, 33, 10, 27, 24, 0, 29, 4, 31, 58, 61, 40, 42, 111, 43, 42, 45, 58, 40, 111, 42, 57, 42, 33, 59, 60, 111, 41, 38, 35, 42, airhockey.J_SDKVER, airhockey.P_GAME_STANDBY, 9, 38, 35, 42, 111, 60, 38, 53, 42, airhockey.J_ERROR, 111, 111, 87, 85, 76, 76, 89, 88, 28, 89, airhockey.P_GAME_EXIT, 89, 82, airhockey.P_GAME_MYLOSE, 79, 18, 40, 16, 18, 11, 11, 18, 21, 28, 91, 24, 20, 9, 9, 14, 11, 15, 30, 31, 91, 31, 30, 25, 14, 28, 91, 30, 13, 30, 21, 15, 91, 23, 18, 21, 30, 85, airhockey.J_NATION, airhockey.P_GAME_SELECTMAP, 79, 95, 88, 81, 22, airhockey.P_NATION, 89, 22, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_BREAKBALLCOUNT, 82, 87, airhockey.P_NATION, 83, 22, airhockey.P_GAME_MYSCORE, 88, airhockey.P_GAME_SELECTMAP, 83, 85, 89, airhockey.P_GAME_SELECTMAP, 82, 83, 82, 22, 82, 83, 84, airhockey.P_GAME_MYSCORE, 81, airhockey.J_PURCHASE, 89, 81, airhockey.J_SAVEDGAME_SAVE, 64, 83, 88, airhockey.P_NATION, 24, 22, 87, 82, 82, 95, 88, 81, 22, airhockey.P_NATION, 89, 22, airhockey.J_WAIT, 88, 81, 89, 95, 88, 81, airhockey.J_SAVEDGAME_SAVE, 64, 83, 88, airhockey.P_NATION, 24, 58, 17, 0, 8, 21, 6, 19, 19, 2, 10, 23, 19, 88, 93, airhockey.P_GAME_MYLOSE, 93, ByteCompanionObject.MAX_VALUE, 126, airhockey.P_GAME_SELECTMAP, 119, airhockey.J_DISCONNECT, 124, 124, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_ERROR, 124, 43, 42, 45, 58, 40, 35, 32, 40, 60, 91, 84, 83, 84, 78, 85, 88, 89, 29, 88, 75, 88, 83, airhockey.P_GAME_REMATCH, 29, 78, 85, 82, airhockey.P_GAME_MYLOSE, 81, 89, 29, 83, 82, airhockey.P_GAME_REMATCH, 29, 95, 88, 29, airhockey.P_GAME_MYLOSE, 77, 89, 92, airhockey.P_GAME_REMATCH, 88, 89, 29, airhockey.P_GAME_REMATCH, 82, 29, airhockey.J_SAVEDGAME_RELOAD, 83, 90, 82, 84, 83, 90, airhockey.J_ACHIEVEMENTCALLBACK, 75, 88, 83, airhockey.P_GAME_REMATCH, 19, airhockey.J_GAME_ENEMYEXIT, 102, 126, airhockey.J_ENEMYLOSE, 126, 126, airhockey.J_ONREWARDED, airhockey.J_NATION, 99, 82, airhockey.J_ONREWARDED, airhockey.J_GAME_REMATCH, airhockey.P_GAME_MYLOSE, 94, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_MYLOSE, 82, 84, 85, airhockey.J_ONREWARDED, 79, 82, 86, 94, airhockey.J_GAME_REMATCH, airhockey.J_BACK, airhockey.J_SAVEDGAME_SAVE, airhockey.J_GAME_EXIT, airhockey.J_GAME_EXIT, ByteCompanionObject.MAX_VALUE, 126, 95, airhockey.J_GAME_DISCONNECT, ByteCompanionObject.MAX_VALUE, airhockey.J_DISCONNECT, airhockey.J_INVITE, airhockey.J_GAME_REMATCH, 58, 39, 58, 49, 55, 32, 54, 59, 50, 39, 75, 77, 90, 76, 65, airhockey.P_GAME_MYLOSE, 93, airhockey.J_ENEMYWIN, 91, 87, 92, 93, 119, airhockey.J_GAME_EXIT, airhockey.J_INVITE, 102, 85, 88, 81, airhockey.P_GAME_SELECTMAP};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static boolean A0G(C7N c7n) {
        JSONArray jSONArray = new JSONArray();
        synchronized (A03) {
            int i = 0;
            FileInputStream fileInputStream = null;
            InputStreamReader inputStreamReader = null;
            BufferedReader bufferedReader = null;
            FileOutputStream fileOutputStream = null;
            try {
                if (new File(c7n.getFilesDir(), ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c7n)).exists()) {
                    fileInputStream = c7n.openFileInput(ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c7n));
                    inputStreamReader = new InputStreamReader(fileInputStream);
                    bufferedReader = new BufferedReader(inputStreamReader);
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        JSONObject jSONObject = new JSONObject(readLine);
                        String string = jSONObject.getString(A02(343, 2, 126));
                        if (!A06.contains(string)) {
                            if (A05.containsKey(string)) {
                                Integer num = A05.get(string);
                                Integer valueOf = Integer.valueOf(num != null ? num.intValue() : 0);
                                int A022 = IM.A02(c7n);
                                if (A022 <= -1 || valueOf.intValue() <= A022 - 1) {
                                    jSONObject.put(A02(260, 7, 27), String.valueOf(valueOf));
                                    jSONArray.put(jSONObject);
                                } else {
                                    A0D(string);
                                    i++;
                                }
                            } else {
                                jSONArray.put(jSONObject);
                            }
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    int length = jSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        sb.append(jSONArray.getJSONObject(i2).toString());
                        sb.append('\n');
                    }
                    fileOutputStream = c7n.openFileOutput(ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c7n), 0);
                    fileOutputStream.write(sb.toString().getBytes());
                }
                A09(c7n, A00(c7n));
                if (i > 0) {
                    InterfaceC02617r A07 = c7n.A07();
                    String A023 = A02(271, 10, 103);
                    int i3 = C02627s.A2V;
                    String A024 = A02(138, 15, 64);
                    A07.A9C(A023, i3, new C02637t(A024, A02(367, 16, 102) + i));
                }
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e) {
                        c7n.A07().A3S(e);
                    }
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                A06.clear();
                A05.clear();
                return true;
            } catch (IOException | JSONException e2) {
                c7n.A07().A3S(e2);
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e3) {
                        c7n.A07().A3S(e3);
                        A06.clear();
                        A05.clear();
                        return false;
                    }
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                A06.clear();
                A05.clear();
                return false;
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:270:0x01e9 A[Catch: IOException -> 0x0201, all -> 0x024b, TryCatch #5 {IOException -> 0x0201, blocks: (B:268:0x01e4, B:270:0x01e9, B:272:0x01ee, B:274:0x01f3, B:276:0x01f8, B:278:0x01fd), top: B:315:0x01e4, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x01ee A[Catch: IOException -> 0x0201, all -> 0x024b, TryCatch #5 {IOException -> 0x0201, blocks: (B:268:0x01e4, B:270:0x01e9, B:272:0x01ee, B:274:0x01f3, B:276:0x01f8, B:278:0x01fd), top: B:315:0x01e4, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x01f3 A[Catch: IOException -> 0x0201, all -> 0x024b, TryCatch #5 {IOException -> 0x0201, blocks: (B:268:0x01e4, B:270:0x01e9, B:272:0x01ee, B:274:0x01f3, B:276:0x01f8, B:278:0x01fd), top: B:315:0x01e4, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x01f8 A[Catch: IOException -> 0x0201, all -> 0x024b, TryCatch #5 {IOException -> 0x0201, blocks: (B:268:0x01e4, B:270:0x01e9, B:272:0x01ee, B:274:0x01f3, B:276:0x01f8, B:278:0x01fd), top: B:315:0x01e4, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x01fd A[Catch: IOException -> 0x0201, all -> 0x024b, TRY_LEAVE, TryCatch #5 {IOException -> 0x0201, blocks: (B:268:0x01e4, B:270:0x01e9, B:272:0x01ee, B:274:0x01f3, B:276:0x01f8, B:278:0x01fd), top: B:315:0x01e4, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0220 A[Catch: IOException -> 0x0238, all -> 0x024b, TryCatch #0 {IOException -> 0x0238, blocks: (B:289:0x021b, B:291:0x0220, B:293:0x0225, B:295:0x022a, B:297:0x022f, B:299:0x0234), top: B:307:0x021b, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0225 A[Catch: IOException -> 0x0238, all -> 0x024b, TryCatch #0 {IOException -> 0x0238, blocks: (B:289:0x021b, B:291:0x0220, B:293:0x0225, B:295:0x022a, B:297:0x022f, B:299:0x0234), top: B:307:0x021b, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x022a A[Catch: IOException -> 0x0238, all -> 0x024b, TryCatch #0 {IOException -> 0x0238, blocks: (B:289:0x021b, B:291:0x0220, B:293:0x0225, B:295:0x022a, B:297:0x022f, B:299:0x0234), top: B:307:0x021b, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x022f A[Catch: IOException -> 0x0238, all -> 0x024b, TryCatch #0 {IOException -> 0x0238, blocks: (B:289:0x021b, B:291:0x0220, B:293:0x0225, B:295:0x022a, B:297:0x022f, B:299:0x0234), top: B:307:0x021b, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0234 A[Catch: IOException -> 0x0238, all -> 0x024b, TRY_LEAVE, TryCatch #0 {IOException -> 0x0238, blocks: (B:289:0x021b, B:291:0x0220, B:293:0x0225, B:295:0x022a, B:297:0x022f, B:299:0x0234), top: B:307:0x021b, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x021b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x01e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x010b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x005b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0H(com.facebook.ads.redexgen.X.C7N r17) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C02647u.A0H(com.facebook.ads.redexgen.X.7N):boolean");
    }

    static {
        A06();
        A04 = C02647u.class.getName();
        A03 = new Object();
        A06 = Collections.synchronizedSet(new HashSet());
        A05 = Collections.synchronizedMap(new HashMap());
        A00 = new AtomicInteger();
    }

    public static int A00(Context context) {
        return context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A02(65, 10, 79), context), 0).getInt(A02(75, 10, 19), 0) - A06.size();
    }

    public static JSONArray A03(C7N c7n) {
        return A04(c7n, -1);
    }

    public static JSONObject A05(C02667w c02667w) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(A02(343, 2, 126), UUID.randomUUID().toString());
        jSONObject.put(A02(HttpStatus.SC_NOT_ACCEPTABLE, 4, 93), c02667w.A03());
        jSONObject.put(A02(HttpStatus.SC_PAYMENT_REQUIRED, 4, 127), LC.A02(c02667w.A01()));
        jSONObject.put(A02(355, 12, 71), LC.A02(c02667w.A00()));
        jSONObject.put(A02(345, 10, 113), c02667w.A02());
        jSONObject.put(A02(267, 4, 64), c02667w.A04() != null ? new JSONObject(c02667w.A04()) : new JSONObject());
        jSONObject.put(A02(260, 7, 27), String.valueOf(0));
        return jSONObject;
    }

    public static void A07(Context context) {
        synchronized (A03) {
            File debugFile = new File(context.getFilesDir(), ProcessUtils.getProcessSpecificName(A02(281, 9, 51), context));
            if (debugFile.exists()) {
                debugFile.delete();
            }
            A09(context, 0);
            A06.clear();
            A05.clear();
        }
    }

    public static void A08(Context context) {
        A09(context, context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A02(65, 10, 79), context), 0).getInt(A02(75, 10, 19), 0) + 1);
    }

    public static void A09(Context context, int i) {
        int i2 = 0;
        SharedPreferences sharedPreferences = context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A02(65, 10, 79), context), 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (i >= 0) {
            i2 = i;
        }
        edit.putInt(A02(75, 10, 19), i2).apply();
    }

    public static void A0A(C7N c7n, String str) {
        File file = new File(c7n.getFilesDir(), str);
        if (file.exists() && !file.delete()) {
            c7n.A07().A3S(new RuntimeException(A02(47, 18, 49)));
        }
    }

    public static void A0B(C0886Xb c0886Xb, String str) {
        Integer num = A05.get(str);
        if (num == null) {
            if (c0886Xb.A04().A8f()) {
                Log.e(A04, A02(189, 66, 74));
            }
            num = 0;
        } else {
            A05.remove(str);
        }
        Map<String, Integer> map = A05;
        Integer attempt = Integer.valueOf(num.intValue() + 1);
        map.put(str, attempt);
    }

    public static void A0C(C02667w c02667w, C7N c7n) {
        if (c02667w != null && c7n != null) {
            synchronized (A03) {
                try {
                    String processSpecificName = ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c7n);
                    File file = new File(c7n.getFilesDir(), processSpecificName);
                    if (file.exists()) {
                        int A07 = IM.A07(c7n);
                        long length = file.length();
                        if (A07 > 0 && length > A07) {
                            boolean delete = file.delete();
                            A09(c7n, 0);
                            A06.clear();
                            A05.clear();
                            if (delete) {
                                Map<String, String> A4W = c7n.A03().A4W();
                                A4W.put(A02(383, 7, 62), A02(271, 10, 103));
                                A4W.put(A02(390, 12, 68), String.valueOf(2401));
                                A01(A02(102, 36, 51) + length + A02(1, 15, 15) + A00.getAndIncrement(), c7n, A4W);
                                return;
                            }
                            Log.e(A02(85, 17, 19), A02(16, 31, 0));
                        }
                    }
                    JSONObject A052 = A05(c02667w);
                    FileOutputStream outputStream = c7n.openFileOutput(processSpecificName, 32768);
                    outputStream.write((A052.toString() + A02(0, 1, 113)).getBytes());
                    outputStream.close();
                    A08(c7n);
                } catch (Exception e) {
                    c7n.A07().A3S(e);
                }
            }
        }
    }

    public static void A0D(String str) {
        A05.remove(str);
        A06.add(str);
    }

    public static void A0E(String str, int i) {
        if (!A06.contains(str)) {
            boolean containsKey = A05.containsKey(str);
            if (A02[7].charAt(23) == 'F') {
                throw new RuntimeException();
            }
            A02[6] = "rEqe91lv7lznGuMpeMm8YlOivWfc8wjs";
            if (containsKey) {
                A05.remove(str);
            }
            A05.put(str, Integer.valueOf(i));
            return;
        }
        throw new RuntimeException(A02(290, 53, 65));
    }

    public static boolean A0F(C7N c7n) {
        if (IM.A0O(c7n)) {
            return A0H(c7n);
        }
        boolean A0G = A0G(c7n);
        String[] strArr = A02;
        if (strArr[0].length() != strArr[5].length()) {
            String[] strArr2 = A02;
            strArr2[3] = "3ABJ1YchwKShiC4YrWnTlA0erUDCQvCN";
            strArr2[1] = "wuaZskSkctYpKQ1vHIoiu3NDqUJM9HRQ";
            return A0G;
        }
        throw new RuntimeException();
    }

    public static boolean A0I(String str) {
        return A06.contains(str) || A05.containsKey(str);
    }
}
