package com.facebook.ads.redexgen.X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import com.mobirix.airhockey.airhockey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.2Z */
/* loaded from: assets/audience_network.dex */
public final class C2Z {
    public static C2Z A05;
    public static byte[] A06;
    public static final Object A07;
    public final Context A00;
    public final Handler A01;
    public final HashMap<BroadcastReceiver, ArrayList<C2Y>> A04 = new HashMap<>();
    public final HashMap<String, ArrayList<C2Y>> A03 = new HashMap<>();
    public final ArrayList<C2X> A02 = new ArrayList<>();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 80);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{-116, -116, -78, -43, -40, -32, -47, -34, -116, -48, -43, -48, -116, -38, -37, -32, -116, -39, -51, -32, -49, -44, -90, -116, -111, -111, -73, -38, -35, -27, -42, -29, -111, -34, -46, -27, -44, -39, -42, -43, -110, -111, -111, -34, -46, -27, -44, -39, -82, -95, -23, -102, -23, -32, -102, -29, -24, -18, -33, -24, -18, -102, 126, -47, -63, -58, -61, -53, -61, 126, -88, -54, -37, -48, -42, -43, -121, -45, -48, -38, -37, -95, -121, 27, 62, 50, 48, 59, 17, 65, 62, 48, 51, 50, 48, airhockey.P_NATION, airhockey.P_GAME_MYSCORE, 28, 48, 61, 48, 54, 52, 65, -51, -31, -12, -29, -24, -23, -18, -25, -96, -31, -25, -31, -23, -18, -13, -12, -96, -26, -23, -20, -12, -27, -14, -96, -80, -61, -47, -51, -54, -44, -57, -52, -59, 126, -46, -41, -50, -61, 126, -19, -17, 0, -11, -5, -6, -3, -5, 14, -1, 1, 9, 12, 19, 9, 6, 25, 6, 29, 34, 25, 14, -53, -60, -63, -60, -59, -51, -60, airhockey.J_REWARD, -56, -69, -73, -55, -59, -60};
    }

    static {
        A03();
        A07 = new Object();
    }

    public C2Z(Context context) {
        this.A00 = context;
        this.A01 = new Handler(context.getMainLooper()) { // from class: com.facebook.ads.redexgen.X.2W
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (message.what != 1) {
                    super.handleMessage(message);
                } else {
                    C2Z.this.A02();
                }
            }
        };
    }

    public static C2Z A00(Context context) {
        C2Z c2z;
        synchronized (A07) {
            if (A05 == null) {
                A05 = new C2Z(context.getApplicationContext());
            }
            c2z = A05;
        }
        return c2z;
    }

    /* JADX WARN: Incorrect condition in loop: B:43:0x001c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A02() {
        /*
            r8 = this;
        L0:
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<com.facebook.ads.redexgen.X.2Y>> r1 = r8.A04
            monitor-enter(r1)
            java.util.ArrayList<com.facebook.ads.redexgen.X.2X> r0 = r8.A02     // Catch: java.lang.Throwable -> L45
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L45
            if (r0 > 0) goto Ld
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L45
            goto L44
        Ld:
            com.facebook.ads.redexgen.X.2X[] r7 = new com.facebook.ads.redexgen.X.C2X[r0]     // Catch: java.lang.Throwable -> L45
            java.util.ArrayList<com.facebook.ads.redexgen.X.2X> r0 = r8.A02     // Catch: java.lang.Throwable -> L45
            r0.toArray(r7)     // Catch: java.lang.Throwable -> L45
            java.util.ArrayList<com.facebook.ads.redexgen.X.2X> r0 = r8.A02     // Catch: java.lang.Throwable -> L45
            r0.clear()     // Catch: java.lang.Throwable -> L45
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L45
            r6 = 0
        L1b:
            int r0 = r7.length
            if (r6 >= r0) goto L0
            r5 = r7[r6]
            java.util.ArrayList<com.facebook.ads.redexgen.X.2Y> r0 = r5.A01
            int r4 = r0.size()
            r3 = 0
        L27:
            if (r3 >= r4) goto L41
            java.util.ArrayList<com.facebook.ads.redexgen.X.2Y> r0 = r5.A01
            java.lang.Object r1 = r0.get(r3)
            com.facebook.ads.redexgen.X.2Y r1 = (com.facebook.ads.redexgen.X.C2Y) r1
            boolean r0 = r1.A01
            if (r0 != 0) goto L3e
            android.content.BroadcastReceiver r2 = r1.A02
            android.content.Context r1 = r8.A00
            android.content.Intent r0 = r5.A00
            r2.onReceive(r1, r0)
        L3e:
            int r3 = r3 + 1
            goto L27
        L41:
            int r6 = r6 + 1
            goto L1b
        L44:
            return
        L45:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L45
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C2Z.A02():void");
    }

    public final void A05(BroadcastReceiver broadcastReceiver) {
        synchronized (this.A04) {
            ArrayList<C2Y> remove = this.A04.remove(broadcastReceiver);
            if (remove == null) {
                return;
            }
            for (int size = remove.size() - 1; size >= 0; size--) {
                C2Y c2y = remove.get(size);
                c2y.A01 = true;
                for (int j = 0; j < c2y.A03.countActions(); j++) {
                    String action = c2y.A03.getAction(j);
                    ArrayList<C2Y> arrayList = this.A03.get(action);
                    if (arrayList != null) {
                        int i = arrayList.size();
                        for (int i2 = i - 1; i2 >= 0; i2--) {
                            C2Y c2y2 = arrayList.get(i2);
                            if (c2y2.A02 == broadcastReceiver) {
                                c2y2.A01 = true;
                                arrayList.remove(i2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.A03.remove(action);
                        }
                    }
                }
            }
        }
    }

    public final void A06(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.A04) {
            C2Y c2y = new C2Y(intentFilter, broadcastReceiver);
            ArrayList<C2Y> arrayList = this.A04.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.A04.put(broadcastReceiver, arrayList);
            }
            arrayList.add(c2y);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList<C2Y> arrayList2 = this.A03.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.A03.put(action, arrayList2);
                }
                arrayList2.add(c2y);
            }
        }
    }

    public final boolean A07(Intent intent) {
        String str;
        String scheme;
        synchronized (this.A04) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.A00.getContentResolver());
            Uri data = intent.getData();
            String scheme2 = intent.getScheme();
            Set<String> categories = intent.getCategories();
            int i = 0;
            boolean z = (intent.getFlags() & 8) != 0;
            if (z) {
                StringBuilder sb = new StringBuilder();
                String type = A01(128, 15, 14);
                sb.append(type);
                sb.append(resolveTypeIfNeeded);
                String type2 = A01(62, 8, 14);
                sb.append(type2);
                sb.append(scheme2);
                String type3 = A01(51, 11, 42);
                sb.append(type3);
                sb.append(intent);
                sb.toString();
            }
            HashMap<String, ArrayList<C2Y>> hashMap = this.A03;
            String type4 = intent.getAction();
            ArrayList<C2Y> arrayList = hashMap.get(type4);
            if (arrayList != null) {
                if (z) {
                    StringBuilder sb2 = new StringBuilder();
                    String type5 = A01(70, 13, 23);
                    sb2.append(type5);
                    sb2.append(arrayList);
                    sb2.toString();
                }
                ArrayList arrayList2 = null;
                while (i < arrayList.size()) {
                    C2Y c2y = arrayList.get(i);
                    if (z) {
                        StringBuilder sb3 = new StringBuilder();
                        String type6 = A01(104, 24, 48);
                        sb3.append(type6);
                        sb3.append(c2y.A03);
                        sb3.toString();
                    }
                    if (!c2y.A00) {
                        str = resolveTypeIfNeeded;
                        String type7 = resolveTypeIfNeeded;
                        int match = c2y.A03.match(action, type7, scheme2, data, categories, A01(83, 21, 127));
                        if (match >= 0) {
                            if (z) {
                                String str2 = A01(24, 27, 33) + Integer.toHexString(match);
                            }
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(c2y);
                            c2y.A00 = true;
                        } else if (z) {
                            if (match == -4) {
                                scheme = A01(149, 8, 74);
                            } else if (match == -3) {
                                scheme = A01(143, 6, 60);
                            } else if (match == -2) {
                                scheme = A01(157, 4, 85);
                            } else if (match != -1) {
                                scheme = A01(165, 14, 6);
                            } else {
                                scheme = A01(161, 4, 89);
                            }
                            String str3 = A01(0, 24, 28) + scheme;
                        }
                    } else if (z) {
                        str = resolveTypeIfNeeded;
                    } else {
                        str = resolveTypeIfNeeded;
                    }
                    i++;
                    resolveTypeIfNeeded = str;
                }
                if (arrayList2 != null) {
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        ((C2Y) arrayList2.get(i2)).A00 = false;
                    }
                    this.A02.add(new C2X(intent, arrayList2));
                    if (!this.A01.hasMessages(1)) {
                        this.A01.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }
}
