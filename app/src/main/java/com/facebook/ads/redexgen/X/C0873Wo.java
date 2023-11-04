package com.facebook.ads.redexgen.X;

import android.os.SystemClock;
import android.util.Log;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.Wo */
/* loaded from: assets/audience_network.dex */
public final class C0873Wo implements AV {
    public static byte[] A01;
    public static String[] A02 = {"uFnK", "23brwyJGPu3ZknDoMNdw3hVXVLFEULQy", "FtMR8ROvDO4Zz8SuhvbrIDHAZ1hbcqSx", "4tDbtxEkY45WyXaQwFKWRvOHK17MthWz", "P3L0", "jQPyzSgXTRUrKPul", "L4bq6z2eevSU7Qg95t0o6YCr4fHdh5", "Io3idew6HPzrUVEIzO8xEfp6xkmYSMtW"};
    public final /* synthetic */ C0872Wn A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[5].length() == 27) {
                throw new RuntimeException();
            }
            A02[5] = "3SKjhf7gYf6c2NzhB";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 109);
            i4++;
        }
    }

    public static void A01() {
        A01 = new byte[]{109, airhockey.J_SDKVER, 92, airhockey.J_ENEMYLOSE, airhockey.J_WAIT, airhockey.J_DISCONNECT, airhockey.J_SAVEDGAME_RELOAD, airhockey.P_GAME_REMATCH, 111, 124, 126, airhockey.J_REWARD, 18, 60, 53, 52, 41, 50, 53, 60, 123, 50, 54, 43, 52, 40, 40, 50, 57, 55, 34, 123, 55, 58, 41, 60, 62, 123, 58, 46, 63, 50, 52, 123, 55, 58, 47, 62, 53, 56, 34, airhockey.J_SDKVER, 123, 35, 0, 5, 2, 25, 31, 5, 3, 80, 17, 5, 20, 25, 31, 80, 4, 25, 29, 21, 3, 4, 17, 29, 0, 80, 88, 22, 2, 17, 29, 21, 80, 0, 31, 3, 25, 4, 25, 31, 30, 80, 29, 25, 3, 29, 17, 4, 19, 24, 89, airhockey.P_GAME_EXIT, 80, 79, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_REMATCH, airhockey.J_INVITE, airhockey.J_ERROR, airhockey.J_SAVEDGAME_SAVE, airhockey.J_GAME_REMATCH, 111, 60, 125, airhockey.J_GAME_REMATCH, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_ERROR, airhockey.J_SAVEDGAME_SAVE, 60, airhockey.J_ENEMYLOSE, airhockey.J_ERROR, airhockey.J_BACK, airhockey.J_WAIT, 111, airhockey.J_ENEMYLOSE, 125, airhockey.J_BACK, airhockey.J_GAME_DISCONNECT, 60, 52, 111, airhockey.J_GAME_STANDBY, 111, airhockey.J_ENEMYLOSE, airhockey.J_WAIT, airhockey.J_BACK, 60, ByteCompanionObject.MAX_VALUE, airhockey.J_GOO, airhockey.J_SAVEDGAME_SAVE, ByteCompanionObject.MAX_VALUE, 119, 60, airhockey.J_BACK, airhockey.J_ERROR, 111, airhockey.J_BACK, 125, airhockey.J_ENEMYLOSE, ByteCompanionObject.MAX_VALUE, airhockey.J_DISCONNECT, 53, 38, 60};
    }

    static {
        A01();
    }

    public C0873Wo(C0872Wn c0872Wn) {
        this.A00 = c0872Wn;
    }

    public /* synthetic */ C0873Wo(C0872Wn c0872Wn, AY ay) {
        this(c0872Wn);
    }

    @Override // com.facebook.ads.redexgen.X.AV
    public final void ABO(long j) {
        Log.w(A00(2, 10, 112), A00(12, 41, 54) + j);
    }

    @Override // com.facebook.ads.redexgen.X.AV
    public final void AC8(long j, long j2, long j3, long j4) {
        long A03;
        long A04;
        StringBuilder sb = new StringBuilder();
        sb.append(A00(53, 52, 29));
        sb.append(j);
        String A00 = A00(0, 2, 44);
        sb.append(A00);
        sb.append(j2);
        sb.append(A00);
        sb.append(j3);
        sb.append(A00);
        sb.append(j4);
        sb.append(A00);
        A03 = this.A00.A03();
        sb.append(A03);
        sb.append(A00);
        A04 = this.A00.A04();
        sb.append(A04);
        String sb2 = sb.toString();
        if (!C0872Wn.A0q) {
            String message = A00(2, 10, 112);
            Log.w(message, sb2);
            return;
        }
        throw new C0321Ab(sb2, null);
    }

    @Override // com.facebook.ads.redexgen.X.AV
    public final void ACj(long j, long j2, long j3, long j4) {
        long A03;
        long A04;
        StringBuilder sb = new StringBuilder();
        sb.append(A00(105, 50, 113));
        sb.append(j);
        String A00 = A00(0, 2, 44);
        sb.append(A00);
        sb.append(j2);
        sb.append(A00);
        sb.append(j3);
        sb.append(A00);
        sb.append(j4);
        sb.append(A00);
        A03 = this.A00.A03();
        sb.append(A03);
        sb.append(A00);
        A04 = this.A00.A04();
        sb.append(A04);
        String sb2 = sb.toString();
        if (C0872Wn.A0q) {
            throw new C0321Ab(sb2, null);
        }
        String[] strArr = A02;
        String str = strArr[4];
        String message = strArr[0];
        if (str.length() != message.length()) {
            throw new RuntimeException();
        }
        A02[3] = "q4b4TTgkvPPQBYTsQFxk23ASltXkXf65";
        String message2 = A00(2, 10, 112);
        Log.w(message2, sb2);
    }

    @Override // com.facebook.ads.redexgen.X.AV
    public final void ACr(int i, long j) {
        AP ap;
        long j2;
        AP ap2;
        ap = this.A00.A0R;
        if (ap != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            j2 = this.A00.A0E;
            long j3 = elapsedRealtime - j2;
            ap2 = this.A00.A0R;
            ap2.ACs(i, j, j3);
        }
    }
}
