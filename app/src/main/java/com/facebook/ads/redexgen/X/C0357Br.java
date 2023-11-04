package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import com.google.android.gms.games.GamesStatusCodes;
import com.mobirix.airhockey.airhockey;
import cz.msebera.android.httpclient.HttpStatus;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.Br */
/* loaded from: assets/audience_network.dex */
public final class C0357Br {
    public static byte[] A0h;
    public static String[] A0i = {"IyltKROI0dONAvxCzSFxMMbap986o", "mujPYAYhkPmTBtOccd1mpeNR", "0Po3ACznS97z3RfgrsPeIGcIu3WtX", "Uu0n9DuNw1LDS1xbXky22YF4xgkhplY6", "LMa7o3DPVrMB0USQzYMxMUIDtj36p7Zv", "YQocGDdhEprGCVrh1x2f0Ac7ybbPw1BN", "b3mlxzrKdW1g7zcxBPM3qbO1DSwndDSh", "Ser"};
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public long A0S;
    public long A0T;
    public DrmInitData A0U;
    public C0350Bg A0V;
    public InterfaceC0351Bh A0W;
    @Nullable
    public C0358Bs A0X;
    public String A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public byte[] A0d;
    public byte[] A0e;
    public byte[] A0f;
    public String A0g;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<String, List<byte[]>> A00(C0483Hc c0483Hc) throws C9Y {
        try {
            c0483Hc.A0Z(16);
            long A0K = c0483Hc.A0K();
            if (A0K == 1482049860) {
                return new Pair<>(A01(881, 10, 51), null);
            }
            if (A0K != 826496599) {
                Log.w(A01(283, 17, 0), A01(HttpStatus.SC_INSUFFICIENT_SPACE_ON_RESOURCE, 51, 45));
                return new Pair<>(A01(944, 15, 101), null);
            }
            byte[] bArr = c0483Hc.A00;
            for (int A06 = c0483Hc.A06() + 20; A06 < bArr.length - 4; A06++) {
                if (bArr[A06] == 0 && bArr[A06 + 1] == 0 && bArr[A06 + 2] == 1 && bArr[A06 + 3] == 15) {
                    return new Pair<>(A01(934, 10, 127), Collections.singletonList(Arrays.copyOfRange(bArr, A06, bArr.length)));
                }
            }
            throw new C9Y(A01(238, 45, 91));
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new C9Y(A01(137, 33, 14));
        }
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0h, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0i;
            if (strArr[2].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            A0i[5] = "YLAPK4AntFjLAXIjsqe57SorlZ7T8mVd";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 8);
            i4++;
        }
    }

    public static void A04() {
        A0h = new byte[]{40, 38, 85, 99, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_RELOAD, 111, airhockey.J_ENEMYLOSE, airhockey.J_SDKVER, 38, airhockey.J_GAME_ENEMYEXIT, 111, airhockey.J_GAME_ENEMYEXIT, 99, 82, ByteCompanionObject.MAX_VALUE, airhockey.J_REWARD, 99, 38, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_GAME_REMATCH, 38, 17, 15, 17, 17, 19, 64, 94, 64, airhockey.P_NATION, 50, airhockey.J_ENEMYWIN, airhockey.J_WAIT, airhockey.J_NATION, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_ERROR, 82, 76, 87, airhockey.P_GAME_MYWIN, 64, 60, 86, 75, airhockey.P_GAME_MYSCORE, 65, 86, 64, 64, 56, 38, 61, 45, 42, 86, 53, 54, 42, 42, 53, 60, 42, 42, 18, 12, 22, 18, 16, 96, 125, 99, airhockey.J_PURCHASE, airhockey.J_GOO, 125, ByteCompanionObject.MAX_VALUE, 59, 37, 55, 42, 63, 61, 85, 54, airhockey.P_GAME_MYLOSE, 23, 9, 27, 6, 19, 17, airhockey.J_WAIT, 26, airhockey.J_GAME_STANDBY, airhockey.P_GAME_MYSCORE, 93, 79, 81, 45, airhockey.P_GAME_MYSCORE, 65, 79, airhockey.J_GAME_STANDBY, 123, airhockey.J_GAME_ENEMYEXIT, airhockey.J_DISCONNECT, airhockey.J_BACK, 119, 83, 77, airhockey.P_NATION, 81, 95, 61, 91, 92, airhockey.P_GAME_BREAKBALLCOUNT, 61, 94, 91, airhockey.P_GAME_BREAKBALLCOUNT, 75, 85, 94, 88, 95, 79, airhockey.P_NATION, 78, 17, 15, 6, 31, 2, 18, 25, 3, airhockey.P_GAME_MYSCORE, airhockey.J_DISCONNECT, airhockey.J_DISCONNECT, airhockey.J_GAME_REMATCH, airhockey.J_DISCONNECT, 38, airhockey.J_REWARD, airhockey.J_ENEMYWIN, airhockey.J_DISCONNECT, airhockey.J_ERROR, 111, airhockey.J_ENEMYLOSE, airhockey.J_SDKVER, 38, 64, airhockey.J_GAME_REMATCH, airhockey.J_SAVEDGAME_SAVE, airhockey.J_DISCONNECT, airhockey.P_GAME_STANDBY, airhockey.P_GAME_STANDBY, 38, airhockey.J_REWARD, airhockey.J_DISCONNECT, 111, airhockey.J_GOO, airhockey.J_ENEMYWIN, airhockey.J_SAVEDGAME_RELOAD, 99, 38, airhockey.J_NATION, airhockey.J_ENEMYWIN, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_ENEMYWIN, 93, airhockey.J_GAME_EXIT, airhockey.J_GAME_EXIT, 119, airhockey.J_GAME_EXIT, 56, airhockey.J_ENEMYLOSE, airhockey.J_WAIT, airhockey.J_GAME_EXIT, airhockey.J_GAME_ENEMYEXIT, airhockey.J_BACK, airhockey.J_REWARD, ByteCompanionObject.MAX_VALUE, 56, 85, 75, 55, 89, 91, 85, 56, 123, 119, 124, 125, 123, 56, airhockey.J_ENEMYLOSE, airhockey.J_GAME_EXIT, airhockey.J_BACK, airhockey.J_INVITE, airhockey.J_WAIT, airhockey.J_GAME_DISCONNECT, 125, airhockey.J_ERROR, airhockey.P_NATION, airhockey.P_NATION, 95, airhockey.P_NATION, 16, 64, 81, airhockey.P_NATION, airhockey.P_GAME_MYSCORE, 89, 94, 87, 16, airhockey.P_GAME_BREAKBALLCOUNT, 95, airhockey.P_NATION, 82, 89, airhockey.P_GAME_MYSCORE, 16, 83, 95, 84, 85, 83, 16, 64, airhockey.P_NATION, 89, airhockey.P_GAME_BREAKBALLCOUNT, 81, airhockey.P_GAME_SELECTMAP, 85, 21, 50, 58, 63, 54, 55, airhockey.J_SAVEDGAME_SAVE, 39, 60, airhockey.J_SAVEDGAME_SAVE, 53, 58, 61, 55, airhockey.J_SAVEDGAME_SAVE, 21, 60, 38, 33, 16, 16, airhockey.J_SAVEDGAME_SAVE, 5, 16, airhockey.J_NATION, airhockey.J_SAVEDGAME_SAVE, 58, 61, 58, 39, 58, 50, 63, 58, 41, 50, 39, 58, 60, 61, airhockey.J_SAVEDGAME_SAVE, 55, 50, 39, 50, airhockey.P_GAME_STANDBY, airhockey.J_GAME_REMATCH, 124, airhockey.J_PURCHASE, airhockey.J_ENEMYWIN, 123, 99, airhockey.J_GAME_REMATCH, 77, airhockey.J_GOO, 124, airhockey.J_PURCHASE, airhockey.J_GAME_REMATCH, airhockey.J_GAME_ENEMYEXIT, 124, airhockey.J_ENEMYWIN, airhockey.J_PURCHASE, 0, 33, 32, 99, 30, 13, 3, airhockey.J_INVITE, 3, 29, airhockey.J_SDKVER, 15, 13, 3, airhockey.J_INVITE, 39, 61, airhockey.J_INVITE, 59, 32, 61, 59, 62, 62, 33, 60, 58, 43, 42, 96, airhockey.J_INVITE, 29, 43, 58, 58, 39, 32, 41, airhockey.J_INVITE, 35, 39, 35, 43, 26, 55, 62, 43, airhockey.J_INVITE, 58, 33, airhockey.J_INVITE, 126, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_GAME_REMATCH, 123, 111, 126, airhockey.J_ACHIEVEMENTCALLBACK, 111, 46, 34, 53, 57, 48, 43, 82, 45, 58, 46, 82, 94, 85, airhockey.P_GAME_SELECTMAP, 89, 85, 46, 64, 82, 82, 48, 60, 55, 38, 59, 55, 76, 54, 55, 37, 91, 18, 30, 23, 14, 3, 18, 20, 3, 53, 14, 5, 24, 16, 5, 3, 20, 5, 4, 64, 45, 41, 45, 37, 64, 20, 25, 16, 5, 78, airhockey.J_GOO, 75, 78, 75, airhockey.P_GAME_EXIT, 82, 75, 5, 99, airhockey.P_GAME_EXIT, 80, 87, 102, 102, 11, 5, airhockey.J_REWARD, 64, 81, 81, 76, 75, airhockey.P_NATION, 5, airhockey.P_GAME_MYLOSE, 76, airhockey.P_GAME_MYLOSE, 64, airhockey.J_BACK, 92, 85, 64, 5, 81, airhockey.P_GAME_EXIT, 5, 83, 76, 65, 64, airhockey.P_GAME_EXIT, 10, 93, 8, 80, 75, 78, 75, airhockey.P_GAME_EXIT, 82, 75, 19, 40, 52, 35, 37, 41, 33, 40, 47, 60, 35, 34, 102, 37, 41, 34, 35, 37, 102, 47, 34, 35, 40, 50, 47, 32, 47, 35, 52, airhockey.J_ENEMYLOSE, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.P_GAME_MYSCORE, 94, 88, 93, 93, airhockey.P_NATION, 95, 89, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_REMATCH, 13, 125, airhockey.J_INVITE, 96, 13, 79, airhockey.P_GAME_SELECTMAP, 89, 13, airhockey.P_GAME_REMATCH, airhockey.P_GAME_MYLOSE, 93, 89, airhockey.P_GAME_STANDBY, 23, 13, 34, 43, 57, 36, 49, 51, airhockey.P_GAME_BREAKBALLCOUNT, 60, 53, 39, 58, 47, 45, 94, airhockey.P_GAME_STANDBY, 35, 57, 37, airhockey.P_GAME_STANDBY, 43, 58, 47, 38, 52, 41, 60, 62, 77, 86, 48, 42, 54, 86, 56, 42, 41, airhockey.J_DISCONNECT, 125, 111, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_ENEMYWIN, airhockey.J_GAME_STANDBY, 22, 13, airhockey.J_GAME_ENEMYEXIT, airhockey.J_BACK, 109, 13, 99, airhockey.J_DISCONNECT, airhockey.J_SDKVER, 102, 111, 125, 96, airhockey.J_ERROR, 119, 4, 31, airhockey.J_WAIT, 99, ByteCompanionObject.MAX_VALUE, 31, 99, 96, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_STANDBY, 119, airhockey.J_GAME_EXIT, ByteCompanionObject.MAX_VALUE, 125, airhockey.J_SAVEDGAME_RELOAD, 21, airhockey.J_SAVEDGAME_SAVE, airhockey.J_GAME_REMATCH, airhockey.J_ERROR, 21, airhockey.J_SAVEDGAME_RELOAD, ByteCompanionObject.MAX_VALUE, airhockey.J_GAME_DISCONNECT, airhockey.J_WAIT, 123, airhockey.J_SAVEDGAME_RELOAD, 96, 126, 2, 123, airhockey.J_GAME_ENEMYEXIT, airhockey.J_PURCHASE, 2, airhockey.J_GAME_ENEMYEXIT, airhockey.J_NATION, airhockey.J_ACHIEVEMENTCALLBACK, ByteCompanionObject.MAX_VALUE, airhockey.J_INVITE, airhockey.J_INVITE, 94, 87, 92, 64, 77, airhockey.P_GAME_MYWIN, 90, airhockey.P_GAME_REMATCH, 14, 7, 14, 8, 96, 109, airhockey.J_ONREWARDED, 109, airhockey.J_GAME_ENEMYEXIT, 2, 89, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_MYLOSE, 84, 81, 91, 89, 76, 81, 87, 86, 23, 92, 78, 90, 75, 77, 90, 75, 124, 109, 109, airhockey.J_BACK, airhockey.J_DISCONNECT, 126, 124, airhockey.J_GAME_REMATCH, airhockey.J_DISCONNECT, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_SAVE, 50, 109, airhockey.J_PURCHASE, airhockey.J_INVITE, 31, 14, 14, 18, 23, 29, 31, 10, 23, 17, 16, 81, 8, 17, 28, 13, 11, 28, 16, 1, 1, 29, 24, 18, 16, 5, 24, 30, 31, 94, 9, 92, 2, 4, 19, 3, 24, 1, airhockey.J_SAVEDGAME_SAVE, airhockey.J_ENEMYWIN, airhockey.J_REWARD, 123, 125, 61, airhockey.J_SAVEDGAME_SAVE, airhockey.J_BACK, 33, 23, 3, 18, 31, 25, 89, 19, 23, 21, airhockey.P_GAME_STANDBY, 83, airhockey.P_GAME_MYWIN, 86, 91, 93, 29, 84, 94, 83, 81, airhockey.J_REWARD, airhockey.J_NATION, airhockey.J_SAVEDGAME_SAVE, 126, airhockey.J_ACHIEVEMENTCALLBACK, 56, airhockey.J_PURCHASE, airhockey.J_ENEMYWIN, 35, airhockey.J_REWARD, 58, 123, airhockey.J_REWARD, 99, airhockey.J_PURCHASE, 18, 6, 23, 26, 28, 92, 30, 3, 22, 20, airhockey.P_GAME_BREAKBALLCOUNT, 82, airhockey.P_GAME_MYSCORE, 78, airhockey.P_GAME_MYLOSE, 8, airhockey.P_GAME_EXIT, 87, airhockey.P_NATION, 64, 10, airhockey.J_GAME_ENEMYEXIT, 21, airhockey.P_GAME_SELECTMAP, 80, 65, 76, airhockey.P_GAME_EXIT, 10, airhockey.P_GAME_EXIT, 85, 80, 86, 37, 49, 32, 45, 43, airhockey.J_GAME_ENEMYEXIT, 54, 37, 51, 34, 54, 39, 42, 44, airhockey.J_GAME_DISCONNECT, 55, 49, 54, 38, airhockey.J_INVITE, 43, 39, 3, 23, 6, 11, 13, 77, 20, 12, 6, 76, 6, 22, 17, 123, 111, 126, airhockey.J_SAVEDGAME_SAVE, airhockey.J_ERROR, 53, airhockey.J_GAME_DISCONNECT, airhockey.J_DISCONNECT, 126, 52, 126, airhockey.J_INVITE, airhockey.J_GAME_REMATCH, 52, airhockey.J_SAVEDGAME_RELOAD, 126, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_GAME_DISCONNECT, 125, airhockey.J_GOO, airhockey.J_REWARD, 54, 111, airhockey.J_REWARD, airhockey.J_GAME_ENEMYEXIT, 123, airhockey.J_GOO, airhockey.J_GAME_EXIT, airhockey.J_GAME_STANDBY, airhockey.J_BACK, 96, 109, airhockey.J_GAME_ENEMYEXIT, 43, 124, 41, airhockey.J_BACK, airhockey.J_GAME_EXIT, 111, airhockey.J_GAME_EXIT, airhockey.J_GAME_ENEMYEXIT, airhockey.J_SAVEDGAME_SAVE, airhockey.J_GAME_EXIT, 5, 14, 7, 125, airhockey.J_GAME_DISCONNECT, airhockey.J_BACK, 125, 38, airhockey.J_BACK, 36, airhockey.J_PURCHASE, airhockey.J_PURCHASE, airhockey.J_ENEMYLOSE, 77, 82, 95, 94, 84, 20, 8, 92, 75, 75, 22, 9, 4, 5, 15, 79, 1, 22, 3, airhockey.J_WAIT, 102, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_EXIT, 96, 32, airhockey.J_ENEMYWIN, airhockey.J_GAME_EXIT, airhockey.J_WAIT, airhockey.J_GAME_DISCONNECT, airhockey.J_ENEMYLOSE, 119, airhockey.J_PURCHASE, 123, airhockey.J_BACK, 49, airhockey.J_SAVEDGAME_SAVE, airhockey.J_INVITE, 42, airhockey.J_ENEMYLOSE, 51, 123, 109, airhockey.J_ENEMYWIN, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_ERROR, airhockey.J_DISCONNECT, 126, 62, 124, airhockey.J_SDKVER, airhockey.J_DISCONNECT, airhockey.J_REWARD, 35, 1, 30, 19, 18, 24, 88, 0, 1, 20, airhockey.P_GAME_BREAKBALLCOUNT, 27, 4, 9, 8, 2, airhockey.P_NATION, 21, 64, 24, 3, 6, 3, 2, 26, 3, airhockey.P_GAME_STANDBY, 90, 87, 86, 92, 28, 75, 30, airhockey.P_GAME_STANDBY, 93, 87, 29, 92, 93, 1, 29, airhockey.P_GAME_STANDBY, airhockey.P_GAME_MYSCORE, 11, 109, airhockey.J_SAVEDGAME_RELOAD, ByteCompanionObject.MAX_VALUE, 126, airhockey.J_DISCONNECT, 52, 99, 54, 109, airhockey.J_ERROR, ByteCompanionObject.MAX_VALUE, 53, airhockey.J_DISCONNECT, airhockey.J_ERROR, 41, 53, 109, airhockey.J_GAME_ENEMYEXIT, 34};
    }

    static {
        A04();
    }

    public C0357Br() {
        this.A0R = -1;
        this.A0J = -1;
        this.A0I = -1;
        this.A0G = -1;
        this.A0H = 0;
        this.A0e = null;
        this.A0P = -1;
        this.A0b = false;
        this.A0D = -1;
        this.A0E = -1;
        this.A0C = -1;
        this.A0K = 1000;
        this.A0L = 200;
        this.A06 = -1.0f;
        this.A07 = -1.0f;
        this.A04 = -1.0f;
        this.A05 = -1.0f;
        this.A02 = -1.0f;
        this.A03 = -1.0f;
        this.A08 = -1.0f;
        this.A09 = -1.0f;
        this.A00 = -1.0f;
        this.A01 = -1.0f;
        this.A0B = 1;
        this.A0A = -1;
        this.A0O = GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY;
        this.A0S = 0L;
        this.A0T = 0L;
        this.A0Z = true;
        this.A0g = A01(868, 3, 104);
    }

    public /* synthetic */ C0357Br(WK wk) {
        this();
    }

    public static List<byte[]> A03(byte[] bArr) throws C9Y {
        String A01 = A01(HttpStatus.SC_NO_CONTENT, 34, 56);
        try {
            if (bArr[0] == 2) {
                int i = 1;
                int i2 = 0;
                while (bArr[i] == -1) {
                    i2 += 255;
                    i++;
                }
                int i3 = i + 1;
                int i4 = i2 + bArr[i];
                if (A0i[5].charAt(0) != 'Y') {
                    throw new RuntimeException();
                }
                A0i[6] = "t9W1bu55HCX38CTD9AnwpVMfQcluPXu3";
                int i5 = 0;
                while (bArr[i3] == -1) {
                    i5 += 255;
                    i3++;
                }
                int vorbisInfoLength = i3 + 1;
                int i6 = i5 + bArr[i3];
                if (bArr[vorbisInfoLength] == 1) {
                    byte[] bArr2 = new byte[i4];
                    System.arraycopy(bArr, vorbisInfoLength, bArr2, 0, i4);
                    int vorbisInfoLength2 = vorbisInfoLength + i4;
                    if (bArr[vorbisInfoLength2] == 3) {
                        int vorbisInfoLength3 = vorbisInfoLength2 + i6;
                        if (bArr[vorbisInfoLength3] == 5) {
                            byte[] bArr3 = new byte[bArr.length - vorbisInfoLength3];
                            System.arraycopy(bArr, vorbisInfoLength3, bArr3, 0, bArr.length - vorbisInfoLength3);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw new C9Y(A01);
                    }
                    throw new C9Y(A01);
                }
                throw new C9Y(A01);
            }
            throw new C9Y(A01);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new C9Y(A01);
        }
    }

    public static boolean A05(C0483Hc c0483Hc) throws C9Y {
        UUID uuid;
        UUID uuid2;
        try {
            int A0C = c0483Hc.A0C();
            if (A0C == 1) {
                return true;
            }
            if (A0C == 65534) {
                c0483Hc.A0Y(24);
                long A0L = c0483Hc.A0L();
                uuid = WI.A0s;
                int i = (A0L > uuid.getMostSignificantBits() ? 1 : (A0L == uuid.getMostSignificantBits() ? 0 : -1));
                if (A0i[0].length() != 29) {
                    throw new RuntimeException();
                }
                A0i[6] = "mXDtn5ZrlLpOkU84k9DC3Hi3Pcorcpog";
                if (i == 0) {
                    long A0L2 = c0483Hc.A0L();
                    uuid2 = WI.A0s;
                    int formatTag = (A0L2 > uuid2.getLeastSignificantBits() ? 1 : (A0L2 == uuid2.getLeastSignificantBits() ? 0 : -1));
                    if (formatTag == 0) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new C9Y(A01(170, 34, 16));
        }
    }

    private byte[] A06() {
        if (this.A06 != -1.0f) {
            int i = (this.A07 > (-1.0f) ? 1 : (this.A07 == (-1.0f) ? 0 : -1));
            if (A0i[6].charAt(11) != 'b') {
                String[] strArr = A0i;
                strArr[2] = "PBvrZHKgmU2uAVRQDCT9n0bIRHOqM";
                strArr[1] = "guZt3O6voa6ads6nTVRQaZ05";
                if (i == 0 || this.A04 == -1.0f) {
                    return null;
                }
                int i2 = (this.A05 > (-1.0f) ? 1 : (this.A05 == (-1.0f) ? 0 : -1));
                if (A0i[7].length() != 6) {
                    String[] strArr2 = A0i;
                    strArr2[2] = "PayVPjYQSmFvrGG0qfp7CT6HXa6Ad";
                    strArr2[1] = "9Xa9tASZMquPJJBB3AwdoWSz";
                    if (i2 == 0) {
                        return null;
                    }
                } else if (i2 == 0) {
                    return null;
                }
                if (this.A02 == -1.0f || this.A03 == -1.0f || this.A08 == -1.0f || this.A09 == -1.0f || this.A00 == -1.0f || this.A01 == -1.0f) {
                    return null;
                }
                byte[] bArr = new byte[25];
                ByteBuffer hdrStaticInfo = ByteBuffer.wrap(bArr);
                hdrStaticInfo.put((byte) 0);
                hdrStaticInfo.putShort((short) ((this.A06 * 50000.0f) + 0.5f));
                hdrStaticInfo.putShort((short) ((this.A07 * 50000.0f) + 0.5f));
                hdrStaticInfo.putShort((short) ((this.A04 * 50000.0f) + 0.5f));
                hdrStaticInfo.putShort((short) ((this.A05 * 50000.0f) + 0.5f));
                hdrStaticInfo.putShort((short) ((this.A02 * 50000.0f) + 0.5f));
                hdrStaticInfo.putShort((short) ((this.A03 * 50000.0f) + 0.5f));
                hdrStaticInfo.putShort((short) ((this.A08 * 50000.0f) + 0.5f));
                hdrStaticInfo.putShort((short) ((this.A09 * 50000.0f) + 0.5f));
                hdrStaticInfo.putShort((short) (this.A00 + 0.5f));
                hdrStaticInfo.putShort((short) (this.A01 + 0.5f));
                hdrStaticInfo.putShort((short) this.A0K);
                hdrStaticInfo.putShort((short) this.A0L);
                return bArr;
            }
            throw new RuntimeException();
        }
        return null;
    }

    public final void A07() {
        C0358Bs c0358Bs = this.A0X;
        if (c0358Bs != null) {
            c0358Bs.A02(this);
        }
    }

    public final void A08() {
        C0358Bs c0358Bs = this.A0X;
        if (c0358Bs != null) {
            c0358Bs.A00();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:491:0x0152, code lost:
        if (r9.equals(A01(390, 4, 43)) != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0154, code lost:
        r11 = 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x016b, code lost:
        if (r9.equals(A01(390, 8, 73)) != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x028e, code lost:
        if (r9.equals(A01(379, 11, 107)) != false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x0290, code lost:
        r11 = 24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x029e, code lost:
        if (r9.equals(A01(379, 11, 107)) != false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:619:0x0642, code lost:
        if (r8 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:620:0x0644, code lost:
        r3 = 1;
        r14 = java.lang.Integer.toString(r31);
        r7 = r29.A0B;
        r6 = r29.A0O;
        r2 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(r14, r15, null, -1, r18, r7, r6, r21, r1, r29.A0U, r2, r29.A0g);
     */
    /* JADX WARN: Code restructure failed: missing block: B:624:0x067c, code lost:
        if (r8 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:0x0683, code lost:
        if (com.facebook.ads.redexgen.X.HV.A0B(r15) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x0685, code lost:
        r3 = 2;
        r2 = r29.A0H;
     */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x0688, code lost:
        if (r2 != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:630:0x068a, code lost:
        r2 = r29.A0I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:631:0x068c, code lost:
        if (r2 != (-1)) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x068e, code lost:
        r2 = r29.A0R;
     */
    /* JADX WARN: Code restructure failed: missing block: B:633:0x0690, code lost:
        r29.A0I = r2;
        r2 = r29.A0G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x0694, code lost:
        if (r2 != (-1)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:635:0x0696, code lost:
        r2 = r29.A0J;
     */
    /* JADX WARN: Code restructure failed: missing block: B:636:0x0698, code lost:
        r29.A0G = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x069a, code lost:
        r8 = -1.0f;
        r5 = r29.A0I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:638:0x069e, code lost:
        if (r5 == (-1)) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x06a2, code lost:
        if (r29.A0G == (-1)) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x06a4, code lost:
        r2 = r29.A0J;
        r8 = r2 * r5;
        r2 = r29.A0R;
        r8 = r8 / (r2 * r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:642:0x06ad, code lost:
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x06b0, code lost:
        if (r29.A0b == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x06b2, code lost:
        r6 = A06();
        r5 = r29.A0D;
        r4 = r29.A0C;
        r2 = r29.A0E;
        r7 = new com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo(r5, r4, r2, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:645:0x06c1, code lost:
        r14 = java.lang.Integer.toString(r31);
        r9 = r29.A0R;
        r6 = r29.A0J;
        r2 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A04(r14, r15, null, -1, r18, r9, r6, -1.0f, r1, -1, r8, r29.A0e, r29.A0P, r7, r29.A0U);
     */
    /* JADX WARN: Code restructure failed: missing block: B:647:0x06fb, code lost:
        if (A01(693, 20, 121).equals(r15) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:648:0x06fd, code lost:
        r3 = 3;
        r2 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A01(java.lang.Integer.toString(r31), r15, r2, r29.A0g, r29.A0U);
     */
    /* JADX WARN: Code restructure failed: missing block: B:649:0x070c, code lost:
        r7 = A01(871, 10, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:650:0x0721, code lost:
        if (com.facebook.ads.redexgen.X.C0357Br.A0i[4].charAt(3) == '7') goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:652:0x0727, code lost:
        if (r7.equals(r15) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:653:0x0729, code lost:
        r3 = 3;
        r5 = new java.util.ArrayList(2);
        r1 = com.facebook.ads.redexgen.X.WI.A0t;
        r5.add(r1);
        r5.add(r29.A0d);
        r2 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A09(java.lang.Integer.toString(r31), r15, null, -1, r2, r29.A0g, -1, r29.A0U, kotlin.jvm.internal.LongCompanionObject.MAX_VALUE, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x0757, code lost:
        com.facebook.ads.redexgen.X.C0357Br.A0i[3] = "f7sm5I7gZdCZUZkEBQd8yi8YhLy9ImnH";
     */
    /* JADX WARN: Code restructure failed: missing block: B:655:0x0762, code lost:
        if (r7.equals(r15) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:658:0x0773, code lost:
        if (A01(675, 18, 118).equals(r15) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:660:0x0783, code lost:
        if (A01(660, 15, 21).equals(r15) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:662:0x0793, code lost:
        if (A01(641, 19, 48).equals(r15) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:663:0x0795, code lost:
        r3 = 3;
        r2 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0A(java.lang.Integer.toString(r31), r15, null, -1, r2, r1, r29.A0g, r29.A0U);
     */
    /* JADX WARN: Code restructure failed: missing block: B:665:0x07ba, code lost:
        throw new com.facebook.ads.redexgen.X.C9Y(A01(398, 21, 104));
     */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:619:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x0675  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A09(com.facebook.ads.redexgen.X.BX r30, int r31) throws com.facebook.ads.redexgen.X.C9Y {
        /*
            Method dump skipped, instructions count: 2160
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0357Br.A09(com.facebook.ads.redexgen.X.BX, int):void");
    }
}
