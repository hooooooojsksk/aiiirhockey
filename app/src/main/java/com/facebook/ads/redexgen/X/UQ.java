package com.facebook.ads.redexgen.X;

import android.os.ConditionVariable;
import android.util.Log;
import androidx.annotation.NonNull;
import com.mobirix.airhockey.airhockey;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

/* loaded from: assets/audience_network.dex */
public final class UQ implements InterfaceC0478Gx {
    public static boolean A06;
    public static byte[] A07;
    public static String[] A08 = {"PZs3vIZtp1syVhF", "iN5G7Jyo65HiG11v5U3JAI3rcjEJu9Fh", "jWadhCo9gqYR1xuZ5eOebDdRLwIuwzoe", "5aVgPmkb9WO9SFxkSTOlcah0CKuDVehn", "Qok3N", "7mg38N8lomez8u4EtBpwlNJo", "Crj8XVI7aaG6XCZYe", "vguL8XPuWTEOQDWRTomV5"};
    public static final HashSet<File> A09;
    public long A00;
    public boolean A01;
    public final US A02;
    public final H5 A03;
    public final File A04;
    public final HashMap<String, ArrayList<InterfaceC0477Gw>> A05;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 90);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        String[] strArr = A08;
        if (strArr[1].charAt(16) != strArr[2].charAt(16)) {
            throw new RuntimeException();
        }
        A08[3] = "N0vjWbyGqBS98Run3kOI6tTmnpu8bGoB";
        A07 = new byte[]{airhockey.P_GAME_MYSCORE, airhockey.J_GAME_DISCONNECT, 109, airhockey.J_REWARD, airhockey.J_GAME_EXIT, airhockey.J_ENEMYWIN, airhockey.J_GOO, 34, 81, airhockey.J_GAME_ENEMYEXIT, 111, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_INVITE, airhockey.J_ENEMYWIN, 65, 99, airhockey.J_SDKVER, airhockey.J_GAME_EXIT, airhockey.J_ENEMYWIN, 34, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_DISCONNECT, airhockey.J_BACK, airhockey.J_REWARD, 99, airhockey.J_GAME_DISCONNECT, airhockey.J_SDKVER, airhockey.J_ENEMYWIN, 34, 119, airhockey.J_BACK, airhockey.J_ENEMYWIN, airhockey.J_BACK, 34, airhockey.J_REWARD, airhockey.J_GAME_EXIT, airhockey.J_ENEMYWIN, 34, airhockey.J_ONREWARDED, 109, airhockey.J_INVITE, 102, airhockey.J_ENEMYWIN, airhockey.J_GOO, 56, 34, 48, 10, 14, 19, 15, 6, 32, 2, 0, 11, 6, airhockey.J_WAIT, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_MYWIN, 90, airhockey.P_GAME_BREAKBALLCOUNT, 79, airhockey.J_GAME_REMATCH, 75, airhockey.P_GAME_REMATCH, airhockey.P_NATION, 79, 4, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_MYSCORE, 94, airhockey.P_GAME_MYSCORE, 75, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_MYSCORE, 80, 79, 2, 3, 96, airhockey.P_GAME_MYWIN, 92, 65, 90, 93, 84, 19, 90, 93, 87, 86, 75, 19, 85, 90, 95, 86, 19, 85, 82, 90, 95, 86, 87, 20, 22, 20, 31, 18, 19, 40, 20, 24, 25, 3, 18, 25, 3, 40, 30, 25, 19, 18, 15, 89, 18, 15, 30};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0478Gx
    public final synchronized void A47(File file) throws C0476Gv {
        HD.A04(!this.A01);
        UP A00 = UP.A00(file, this.A03);
        HD.A04(A00 != null);
        H4 A092 = this.A03.A09(A00.A04);
        HD.A01(A092);
        HD.A04(A092.A0D());
        if (file.exists()) {
            if (file.length() == 0) {
                file.delete();
                return;
            }
            long A002 = H8.A00(A092.A05());
            if (A002 != -1) {
                HD.A04(A00.A02 + A00.A01 <= A002);
            }
            A0A(A00);
            this.A03.A0G();
            notifyAll();
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0478Gx
    @NonNull
    public final synchronized NavigableSet<H1> A60(String str) {
        H4 A092;
        HD.A04(!this.A01);
        A092 = this.A03.A09(str);
        return (A092 == null || A092.A0C()) ? new TreeSet() : new TreeSet((Collection) A092.A08());
    }

    static {
        A06();
        A09 = new HashSet<>();
    }

    public UQ(File file, US us) {
        this(file, us, null, false);
    }

    public UQ(File file, US us, H5 h5) {
        if (A0D(file)) {
            this.A04 = file;
            this.A02 = us;
            this.A03 = h5;
            this.A05 = new HashMap<>();
            ConditionVariable conditionVariable = new ConditionVariable();
            new HA(this, A03(57, 24, 112), conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException(A03(0, 46, 88) + file);
    }

    public UQ(File file, US us, byte[] bArr, boolean z) {
        this(file, us, new H5(file, bArr, z));
    }

    private UP A00(String str, long j) throws C0476Gv {
        UP span;
        H4 A092 = this.A03.A09(str);
        if (A092 == null) {
            UP A02 = UP.A02(str, j);
            if (A08[7].length() != 15) {
                A08[3] = "R7TEvDOiyk4OKBf9PsOT39P5pIR22NMD";
                return A02;
            }
            throw new RuntimeException();
        }
        while (true) {
            span = A092.A06(j);
            if (!span.A05 || span.A03.exists()) {
                break;
            }
            A05();
        }
        return span;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0478Gx
    /* renamed from: A01 */
    public final synchronized UP AFP(String str, long j) throws InterruptedException, C0476Gv {
        UP span;
        while (true) {
            span = AFQ(str, j);
            if (span == null) {
                wait();
            }
        }
        return span;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0478Gx
    /* renamed from: A02 */
    public final synchronized UP AFQ(String str, long j) throws C0476Gv {
        HD.A04(!this.A01);
        UP A00 = A00(str, j);
        if (A00.A05) {
            UP cacheSpan = this.A03.A09(str).A07(A00);
            A0C(A00, cacheSpan);
            return cacheSpan;
        }
        H4 A0A = this.A03.A0A(str);
        if (!A0A.A0D()) {
            A0A.A0B(true);
            return A00;
        }
        return null;
    }

    public void A04() {
        if (!this.A04.exists()) {
            this.A04.mkdirs();
            return;
        }
        this.A03.A0E();
        File[] listFiles = this.A04.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            if (!file.getName().equals(A03(106, 24, 45))) {
                UP A00 = file.length() > 0 ? UP.A00(file, this.A03) : null;
                if (A00 != null) {
                    A0A(A00);
                } else {
                    file.delete();
                }
            }
        }
        this.A03.A0F();
        try {
            this.A03.A0G();
        } catch (C0476Gv e) {
            Log.e(A03(46, 11, 57), A03(81, 25, 105), e);
        }
    }

    private void A05() throws C0476Gv {
        ArrayList arrayList = new ArrayList();
        for (H4 h4 : this.A03.A0D()) {
            Iterator<UP> it = h4.A08().iterator();
            while (it.hasNext()) {
                UP next = it.next();
                if (!next.A03.exists()) {
                    arrayList.add(next);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            A08((H1) arrayList.get(i), false);
        }
        this.A03.A0F();
        this.A03.A0G();
    }

    private void A07(H1 h1) {
        ArrayList<InterfaceC0477Gw> arrayList = this.A05.get(h1.A04);
        if (arrayList != null) {
            for (int i = arrayList.size() - 1; i >= 0; i--) {
                arrayList.get(i).ACd(this, h1);
            }
        }
        this.A02.ACd(this, h1);
    }

    private void A08(H1 h1, boolean z) throws C0476Gv {
        H4 A092 = this.A03.A09(h1.A04);
        if (A092 == null || !A092.A0E(h1)) {
            return;
        }
        this.A00 -= h1.A01;
        if (z) {
            try {
                this.A03.A0H(A092.A03);
                this.A03.A0G();
            } finally {
                A07(h1);
            }
        }
    }

    private void A0A(UP up) {
        this.A03.A0A(up.A04).A09(up);
        this.A00 += up.A01;
        A0B(up);
    }

    private void A0B(UP up) {
        ArrayList<InterfaceC0477Gw> arrayList = this.A05.get(up.A04);
        if (arrayList != null) {
            for (int i = arrayList.size() - 1; i >= 0; i--) {
                arrayList.get(i).ACc(this, up);
            }
        }
        this.A02.ACc(this, up);
    }

    private void A0C(UP up, H1 h1) {
        ArrayList<InterfaceC0477Gw> arrayList = this.A05.get(up.A04);
        if (arrayList != null) {
            int size = arrayList.size();
            String[] strArr = A08;
            if (strArr[1].charAt(16) != strArr[2].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[0] = "YjLi8Ea68WiaTq3";
            strArr2[4] = "ACi8R";
            for (int i = size - 1; i >= 0; i--) {
                arrayList.get(i).ACe(this, up, h1);
            }
        }
        this.A02.ACe(this, up, h1);
    }

    public static synchronized boolean A0D(File file) {
        synchronized (UQ.class) {
            if (A06) {
                return true;
            }
            return A09.add(file.getAbsoluteFile());
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0478Gx
    public final synchronized void A3Q(String str, H9 h9) throws C0476Gv {
        HD.A04(!this.A01);
        this.A03.A0I(str, h9);
        this.A03.A0G();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0478Gx
    public final synchronized long A5y() {
        HD.A04(!this.A01);
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0478Gx
    public final synchronized long A5z(String str, long j, long j2) {
        H4 cachedContent;
        HD.A04(!this.A01);
        cachedContent = this.A03.A09(str);
        return cachedContent != null ? cachedContent.A04(j, j2) : -j2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0478Gx
    public final synchronized long A6E(String str) {
        return H8.A00(A6F(str));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0478Gx
    public final synchronized H7 A6F(String str) {
        HD.A04(!this.A01);
        return this.A03.A0B(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0478Gx
    public final synchronized void AE8(H1 h1) {
        HD.A04(!this.A01);
        H4 A092 = this.A03.A09(h1.A04);
        HD.A01(A092);
        HD.A04(A092.A0D());
        A092.A0B(false);
        this.A03.A0H(A092.A03);
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0478Gx
    public final synchronized void AEF(H1 h1) throws C0476Gv {
        HD.A04(!this.A01);
        A08(h1, true);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0478Gx
    public final synchronized void AEs(String str, long j) throws C0476Gv {
        H9 mutations = new H9();
        H8.A05(mutations, j);
        A3Q(str, mutations);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0478Gx
    public final synchronized File AFN(String str, long j, long j2) throws C0476Gv {
        H4 A092;
        HD.A04(!this.A01);
        A092 = this.A03.A09(str);
        HD.A01(A092);
        HD.A04(A092.A0D());
        if (!this.A04.exists()) {
            this.A04.mkdirs();
            A05();
        }
        this.A02.ACf(this, str, j, j2);
        return UP.A04(this.A04, A092.A02, j, System.currentTimeMillis());
    }
}
