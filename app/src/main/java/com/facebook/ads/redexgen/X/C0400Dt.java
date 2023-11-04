package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import com.mobirix.airhockey.airhockey;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.Dt */
/* loaded from: assets/audience_network.dex */
public final class C0400Dt {
    public static byte[] A0F;
    public static String[] A0G = {"68X6mTnOwXdfZzYVO84LiBNlITu89iQX", "mcCM", "SB1U", "GkXNtRrGsWIfNkCQn88aLdXmD8Z6vhvm", "Qey5CsRmzWj382X", "n9", "Qz1jsOzCfP5BXHleCyslZPCOD1Jlt2Hf", "OEfF4KTHhKUz1ci9ksApPyeCZN0rEDYT"};
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final Handler A06;
    public final Handler A07;
    public final HandlerThread A08;
    public final DZ A09;
    public final C0405Dy A0A;
    public final ArrayList<RunnableC0397Dq> A0B;
    public final ArrayList<RunnableC0397Dq> A0C;
    public final CopyOnWriteArraySet<InterfaceC0393Dm> A0D;
    public final DownloadAction.Deserializer[] A0E;

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 37);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A0F = new byte[]{6, airhockey.P_GAME_STANDBY, airhockey.P_GAME_EXIT, airhockey.P_GAME_MYWIN, 85, 78, airhockey.P_GAME_MYSCORE, 85, 6, 81, 79, 82, 78, 6, 62, 36, 64, airhockey.J_ERROR, 33, 109, airhockey.J_ONREWARDED, 96, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_ERROR, 33, airhockey.J_INVITE, 111, airhockey.J_ONREWARDED, 33, airhockey.P_GAME_STANDBY, airhockey.J_ONREWARDED, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_ONREWARDED, airhockey.J_SAVEDGAME_SAVE, airhockey.J_ENEMYLOSE, 96, 109, airhockey.J_ENEMYLOSE, 123, airhockey.J_ONREWARDED, airhockey.J_SAVEDGAME_SAVE, 33, airhockey.J_ENEMYLOSE, airhockey.J_SAVEDGAME_RELOAD, 33, airhockey.J_SAVEDGAME_SAVE, airhockey.J_ONREWARDED, airhockey.J_GOO, airhockey.J_DISCONNECT, airhockey.J_ENEMYLOSE, airhockey.J_SAVEDGAME_SAVE, airhockey.J_ONREWARDED, airhockey.J_GAME_STANDBY, 47, 82, airhockey.J_WAIT, airhockey.J_SDKVER, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_PURCHASE, airhockey.J_WAIT, 119, airhockey.J_SAVEDGAME_RELOAD, 91, 119, airhockey.J_ACHIEVEMENTCALLBACK, 119, airhockey.J_BACK, airhockey.J_SAVEDGAME_SAVE, airhockey.J_ONREWARDED, 54, airhockey.J_GOO, ByteCompanionObject.MAX_VALUE, airhockey.J_PURCHASE, airhockey.J_SAVEDGAME_SAVE, 54, ByteCompanionObject.MAX_VALUE, 57, airhockey.J_WAIT, 42, 31, 13, 21, 94, 23, 13, 94, 31, 26, 26, 27, 26, 9, 60, 46, 54, 125, 46, 41, 60, 41, 56, 125, 52, 46, 125, 62, 53, 60, 51, 58, 56, 57};
    }

    static {
        A0C();
    }

    public C0400Dt(C0405Dy c0405Dy, int i, int i2, File file, DownloadAction.Deserializer... deserializerArr) {
        HD.A05(deserializerArr.length > 0, A05(16, 38, 36));
        this.A0A = c0405Dy;
        this.A04 = i;
        this.A05 = i2;
        this.A09 = new DZ(file);
        this.A0E = deserializerArr;
        this.A01 = true;
        this.A0C = new ArrayList<>();
        this.A0B = new ArrayList<>();
        Looper myLooper = Looper.myLooper();
        this.A07 = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper);
        this.A08 = new HandlerThread(A05(54, 24, 51));
        this.A08.start();
        this.A06 = new Handler(this.A08.getLooper());
        this.A0D = new CopyOnWriteArraySet<>();
        A08();
    }

    public RunnableC0397Dq A02(DownloadAction downloadAction) {
        int i = this.A00;
        this.A00 = i + 1;
        RunnableC0397Dq runnableC0397Dq = new RunnableC0397Dq(i, this, downloadAction, this.A05, null);
        this.A0C.add(runnableC0397Dq);
        A0J(A05(78, 13, 91), runnableC0397Dq);
        return runnableC0397Dq;
    }

    private void A08() {
        this.A06.post(new RunnableC0391Dk(this));
    }

    private void A09() {
        if (!A0R()) {
            return;
        }
        Iterator<InterfaceC0393Dm> it = this.A0D.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A0G[3].charAt(7) == 'd') {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[5] = "Uj";
            strArr[4] = "M47RheKcpZxFkBs";
            if (hasNext) {
                it.next().AB9(this);
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x004c, code lost:
        r9 = r8.A04;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0A() {
        /*
            r12 = this;
            boolean r0 = r12.A02
            if (r0 == 0) goto L8
            boolean r0 = r12.A03
            if (r0 == 0) goto L9
        L8:
            return
        L9:
            boolean r0 = r12.A01
            if (r0 != 0) goto L17
            java.util.ArrayList<com.facebook.ads.redexgen.X.Dq> r0 = r12.A0B
            int r1 = r0.size()
            int r0 = r12.A04
            if (r1 != r0) goto Lb3
        L17:
            r0 = 1
        L18:
            r5 = 0
        L19:
            java.util.ArrayList<com.facebook.ads.redexgen.X.Dq> r1 = r12.A0C
            int r1 = r1.size()
            if (r5 >= r1) goto Lbc
            java.util.ArrayList<com.facebook.ads.redexgen.X.Dq> r1 = r12.A0C
            java.lang.Object r8 = r1.get(r5)
            com.facebook.ads.redexgen.X.Dq r8 = (com.facebook.ads.redexgen.X.RunnableC0397Dq) r8
            boolean r4 = com.facebook.ads.redexgen.X.RunnableC0397Dq.A0H(r8)
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0400Dt.A0G
            r1 = 0
            r2 = r2[r1]
            r1 = 7
            char r2 = r2.charAt(r1)
            r1 = 90
            if (r2 == r1) goto Lb6
            java.lang.String[] r3 = com.facebook.ads.redexgen.X.C0400Dt.A0G
            java.lang.String r2 = "ZZ"
            r1 = 5
            r3[r1] = r2
            java.lang.String r2 = "k3SOhcJE6F5rWIN"
            r1 = 4
            r3[r1] = r2
            if (r4 != 0) goto L4c
        L49:
            int r5 = r5 + 1
            goto L19
        L4c:
            com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction r9 = com.facebook.ads.redexgen.X.RunnableC0397Dq.A06(r8)
            boolean r7 = r9.A03
            if (r7 != 0) goto L57
            if (r0 == 0) goto L57
            goto L49
        L57:
            r11 = 1
            r6 = 0
        L59:
            if (r6 >= r5) goto L99
            java.util.ArrayList<com.facebook.ads.redexgen.X.Dq> r1 = r12.A0C
            java.lang.Object r10 = r1.get(r6)
            com.facebook.ads.redexgen.X.Dq r10 = (com.facebook.ads.redexgen.X.RunnableC0397Dq) r10
            com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction r1 = com.facebook.ads.redexgen.X.RunnableC0397Dq.A06(r10)
            boolean r1 = r1.A09(r9)
            if (r1 == 0) goto L8c
            if (r7 == 0) goto L8f
            r11 = 0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r8)
            r3 = 0
            r2 = 14
            r1 = 3
            java.lang.String r1 = A05(r3, r2, r1)
            r4.append(r1)
            r4.append(r10)
            r4.toString()
            com.facebook.ads.redexgen.X.RunnableC0397Dq.A0C(r10)
        L8c:
            int r6 = r6 + 1
            goto L59
        L8f:
            com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction r1 = com.facebook.ads.redexgen.X.RunnableC0397Dq.A06(r10)
            boolean r1 = r1.A03
            if (r1 == 0) goto L8c
            r11 = 0
            r0 = 1
        L99:
            if (r11 == 0) goto L49
            com.facebook.ads.redexgen.X.RunnableC0397Dq.A0D(r8)
            if (r7 != 0) goto L49
            java.util.ArrayList<com.facebook.ads.redexgen.X.Dq> r0 = r12.A0B
            r0.add(r8)
            java.util.ArrayList<com.facebook.ads.redexgen.X.Dq> r0 = r12.A0B
            int r1 = r0.size()
            int r0 = r12.A04
            if (r1 != r0) goto Lb1
            r0 = 1
            goto L49
        Lb1:
            r0 = 0
            goto L49
        Lb3:
            r0 = 0
            goto L18
        Lb6:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0400Dt.A0A():void");
    }

    public void A0B() {
        DownloadAction downloadAction;
        if (this.A03) {
            return;
        }
        DownloadAction[] downloadActionArr = new DownloadAction[this.A0C.size()];
        for (int i = 0; i < this.A0C.size(); i++) {
            downloadAction = this.A0C.get(i).A04;
            downloadActionArr[i] = downloadAction;
        }
        this.A06.post(new RunnableC0392Dl(this, downloadActionArr));
    }

    public void A0D(RunnableC0397Dq runnableC0397Dq) {
        A0J(A05(91, 21, 120), runnableC0397Dq);
        C0399Ds A0K = runnableC0397Dq.A0K();
        Iterator<InterfaceC0393Dm> it = this.A0D.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A0G[0].charAt(7) == 'Z') {
                throw new RuntimeException();
            }
            A0G[0] = "TUrgn6We5nsrVkZlQG2KUeV0nEHaGaai";
            if (hasNext) {
                it.next().ACk(this, A0K);
            } else {
                return;
            }
        }
    }

    public void A0E(RunnableC0397Dq runnableC0397Dq) {
        if (this.A03) {
            return;
        }
        boolean z = !runnableC0397Dq.A0L();
        if (z) {
            this.A0B.remove(runnableC0397Dq);
        }
        A0D(runnableC0397Dq);
        if (A0G[3].charAt(7) == 'd') {
            throw new RuntimeException();
        }
        A0G[6] = "xCRZPuTuqF5VhljpIGNZbvIN3H6gjFvE";
        boolean stopped = runnableC0397Dq.A0M();
        if (stopped) {
            this.A0C.remove(runnableC0397Dq);
            A0B();
        }
        if (z) {
            A0A();
            A09();
        }
    }

    public static void A0J(String str, RunnableC0397Dq runnableC0397Dq) {
        String str2 = str + A05(14, 2, 33) + runnableC0397Dq;
    }

    public final int A0O(DownloadAction downloadAction) {
        int i;
        int i2;
        HD.A04(!this.A03);
        RunnableC0397Dq A02 = A02(downloadAction);
        if (this.A02) {
            A0B();
            A0A();
            i2 = A02.A06;
            if (i2 == 0) {
                A0D(A02);
            }
        }
        i = A02.A02;
        return i;
    }

    public final void A0P() {
        HD.A04(!this.A03);
        if (this.A01) {
            this.A01 = false;
            A0A();
        }
    }

    public final void A0Q(InterfaceC0393Dm interfaceC0393Dm) {
        this.A0D.add(interfaceC0393Dm);
    }

    /* JADX WARN: Incorrect condition in loop: B:22:0x0014 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0R() {
        /*
            r4 = this;
            boolean r0 = r4.A03
            r3 = 1
            r0 = r0 ^ r3
            com.facebook.ads.redexgen.X.HD.A04(r0)
            boolean r0 = r4.A02
            r2 = 0
            if (r0 != 0) goto Ld
            return r2
        Ld:
            r1 = 0
        Le:
            java.util.ArrayList<com.facebook.ads.redexgen.X.Dq> r0 = r4.A0C
            int r0 = r0.size()
            if (r1 >= r0) goto L28
            java.util.ArrayList<com.facebook.ads.redexgen.X.Dq> r0 = r4.A0C
            java.lang.Object r0 = r0.get(r1)
            com.facebook.ads.redexgen.X.Dq r0 = (com.facebook.ads.redexgen.X.RunnableC0397Dq) r0
            boolean r0 = r0.A0L()
            if (r0 == 0) goto L25
            return r2
        L25:
            int r1 = r1 + 1
            goto Le
        L28:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0400Dt.A0R():boolean");
    }

    public final C0399Ds[] A0S() {
        HD.A04(!this.A03);
        C0399Ds[] c0399DsArr = new C0399Ds[this.A0C.size()];
        for (int i = 0; i < c0399DsArr.length; i++) {
            c0399DsArr[i] = this.A0C.get(i).A0K();
        }
        return c0399DsArr;
    }
}
