package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.app.AlertDialog;
import android.widget.EditText;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: assets/audience_network.dex */
public class TL implements InterfaceC0578La {
    public static byte[] A04;
    public static String[] A05 = {"ZQ30B3g1EnWzQxn3crjjGmBLF8czgnrz", "nRJ0geoMgiM0DOpSqitarteTb49iW4bu", "zkGhqanHWGORl0FJV2wFc9MBhnbxSqBt", "Ydk0P72aTQrHa0LOhdAcfW", "R4envBHR3aj", "p22B9bEQtnR9xLSz", "XdKDLLdRQiXAjT4HFpZKaT6yuzMG741E", "BfaY"};
    public C0886Xb A00;
    public C8A A01;
    public QG A02;
    public final Executor A03;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 127);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A04 = new byte[]{airhockey.J_GAME_ENEMYEXIT, airhockey.J_INVITE, airhockey.J_INVITE, airhockey.J_ENEMYLOSE, 109, 96, airhockey.J_ENEMYLOSE, airhockey.J_GAME_EXIT, 111, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_EXIT, airhockey.J_GAME_REMATCH, airhockey.J_INVITE, airhockey.J_ENEMYLOSE, airhockey.J_GAME_ENEMYEXIT, 64, 75, airhockey.P_GAME_STANDBY, airhockey.P_NATION, 65, airhockey.P_GAME_MYWIN, airhockey.P_GAME_BREAKBALLCOUNT, 64, airhockey.P_NATION, airhockey.P_GAME_EXIT, airhockey.P_GAME_EXIT, airhockey.P_GAME_MYWIN, airhockey.P_GAME_BREAKBALLCOUNT, 65, airhockey.P_GAME_BREAKBALLCOUNT, 64, 79, airhockey.P_GAME_STANDBY, 79, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_STANDBY, 79, airhockey.P_NATION, airhockey.P_GAME_BREAKBALLCOUNT, 79, 79, 65, 79, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_MYWIN, 10, 79, 20, 16, airhockey.P_GAME_SELECTMAP, 79, 23, airhockey.P_GAME_MYWIN, 16, airhockey.P_GAME_SELECTMAP, 65, airhockey.P_NATION, airhockey.P_GAME_MYSCORE, 65, airhockey.P_NATION, 64, 23, 64, 21, 64, airhockey.P_GAME_BREAKBALLCOUNT, 18, 65, airhockey.P_GAME_BREAKBALLCOUNT, 65, 16, airhockey.P_GAME_MYSCORE, 20, 21, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_STANDBY, 21, airhockey.P_GAME_SELECTMAP, airhockey.J_DISCONNECT, 86, 89, 84, 82, 91, 30, 50, 42, airhockey.J_SAVEDGAME_SAVE, 60, 39, 59, 54, 33, 32, airhockey.J_SAVEDGAME_SAVE, 63, 60, 52, 58, 61, airhockey.J_SAVEDGAME_SAVE, 50, 32, airhockey.J_SAVEDGAME_SAVE, 42, 60, 38, airhockey.J_SAVEDGAME_SAVE, 39, 60, airhockey.J_SAVEDGAME_SAVE, 55, 54, 49, 38, 52, airhockey.J_GAME_DISCONNECT, airhockey.J_SAVEDGAME_SAVE, 27, 60, 36, airhockey.J_SAVEDGAME_SAVE, 55, 60, airhockey.J_SAVEDGAME_SAVE, 42, 60, 38, airhockey.J_SAVEDGAME_SAVE, 33, 54, 35, 33, 60, 55, 38, 48, 54, airhockey.J_SAVEDGAME_SAVE, 39, 59, 54, airhockey.J_SAVEDGAME_SAVE, 58, 32, 32, 38, 54, airhockey.J_GAME_DISCONNECT, 83, airhockey.J_GAME_STANDBY, airhockey.J_INVITE, airhockey.J_ONREWARDED, 32, 82, airhockey.J_GAME_STANDBY, airhockey.J_GOO, 111, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_DISCONNECT, 52, 11, 2, 23, airhockey.P_GAME_MYSCORE, 43, 2, 19, 19, 6, 13, 6, 7, 92, 27, 25, 25, 31, 9, 9, 37, 14, 21, 17, 31, 20, 14, 12, 25, 8, 10, 2, 31, 20, 50, 4, 9, 42, 37, 32, 44, 39, 61, 22, 61, 32, 36, 44, 90, 85, 80, 92, 87, 77, 102, 77, 86, 82, 92, 87, airhockey.J_GAME_DISCONNECT, 96, airhockey.J_SDKVER, airhockey.J_GAME_REMATCH, 102, airhockey.J_ENEMYLOSE, 80, 102, airhockey.J_GAME_ENEMYEXIT, 32, 33, 55, 39, 54, 45, 52, 48, 45, 43, 42, 61, 53, 36, 49, 52, 49, 36, 49, airhockey.J_DISCONNECT, airhockey.J_GOO, airhockey.J_GAME_EXIT, airhockey.J_PURCHASE, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.J_GOO, 119, ByteCompanionObject.MAX_VALUE, airhockey.J_REWARD, airhockey.J_GAME_EXIT, airhockey.J_GAME_DISCONNECT, airhockey.J_PURCHASE, 109, 64, airhockey.J_REWARD, 123, airhockey.J_PURCHASE, airhockey.J_BACK, airhockey.J_GAME_ENEMYEXIT, airhockey.J_REWARD, airhockey.J_WAIT, airhockey.J_REWARD, airhockey.J_PURCHASE, 109};
    }

    static {
        A06();
    }

    public TL(Executor executor, C8A c8a, C0887Xc c0887Xc) {
        this.A00 = c0887Xc.A01();
        this.A02 = QY.A01(this.A00);
        this.A03 = executor;
        this.A01 = c8a;
    }

    public Map<String, String> A04(String str) {
        QU qu = new QU();
        QU qu2 = new QU();
        QU qu3 = new QU();
        qu.put(A02(257, 15, 96), C02265y.A00().A03());
        qu.put(A02(220, 9, 112), A02(15, 15, 13));
        qu.put(A02(186, 11, 18), A02(0, 15, 38));
        qu.put(A02(174, 12, 5), A02(30, 48, 9));
        qu.put(A02(197, 11, 54), (System.currentTimeMillis() / 1000) + A02(0, 0, 125));
        String A07 = this.A01.A07();
        if (A07 != null) {
            qu3.put(A02(208, 12, 70), A07);
        }
        if (A05[2].charAt(28) != 'S') {
            throw new RuntimeException();
        }
        A05[1] = "6c1y5rO2F72616lTK87Vm3xCzjJjlGKf";
        qu2.put(A02(229, 11, 59), str);
        String clientToken = C0568Kq.A01(qu3);
        qu2.put(A02(248, 9, 102), clientToken);
        String clientToken2 = C0568Kq.A01(qu2);
        qu.A04(A02(240, 8, 47), clientToken2);
        return qu;
    }

    public void A07(C8A c8a) {
        this.A01 = c8a;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0578La
    public final void ACY() {
        Activity A00 = ActivityUtils.A00();
        if (A00 == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(A00);
        builder.setTitle(A02(160, 14, 28));
        EditText editText = new EditText(A00);
        editText.setSingleLine(false);
        editText.setImeOptions(1073741824);
        editText.setHint(A02(84, 65, 44));
        editText.setMaxLines(2);
        editText.setMinLines(2);
        builder.setView(editText);
        builder.setNegativeButton(A02(78, 6, 72), new LX(this));
        builder.setPositiveButton(A02(149, 11, 127), new LY(this, editText));
        builder.create().show();
    }
}
