package com.facebook.ads.redexgen.X;

import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ApicFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.BinaryFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ChapterFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ChapterTocFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.CommentFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.GeobFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.PrivFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.TextInformationFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.UrlLinkFrame;
import com.mobirix.airhockey.airhockey;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: assets/audience_network.dex */
public final class VO implements D9 {
    public static byte[] A01;
    public static String[] A02 = {"mDpfQ0Mg1qMGU0sRUyB4w0yHI9AflFxL", "HrWFAZbBmLlJHBGWXoy88PVYdiXTIEfW", "ZQEIpFlmPj9dChjEJf3cuXBCToBvQGIn", "RQPpjxLwn1F2LqLyPS6YhTLdMSPVP9VK", "XPMzSAYF2Koz19PEH34p5", "swwfqTWHhic8XQtgs9vSQ", "6JbQXNgGm6Rlu9UTMBxnLLi5Rd7F6qFb", "jePmV9Iz"};
    public static final int A03;
    public static final DL A04;
    @Nullable
    public final DL A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static ChapterFrame A06(C0483Hc c0483Hc, int i, int i2, boolean z, int i3, @Nullable DL dl) throws UnsupportedEncodingException {
        int A06 = c0483Hc.A06();
        int A022 = A02(c0483Hc.A00, A06);
        String str = new String(c0483Hc.A00, A06, A022 - A06, A0I(169, 10, 32));
        c0483Hc.A0Y(A022 + 1);
        int A08 = c0483Hc.A08();
        int A082 = c0483Hc.A08();
        long A0M = c0483Hc.A0M();
        if (A0M == 4294967295L) {
            A0M = -1;
        }
        long A0M2 = c0483Hc.A0M();
        if (A0M2 == 4294967295L) {
            A0M2 = -1;
        }
        ArrayList arrayList = new ArrayList();
        int i4 = A06 + i;
        while (c0483Hc.A06() < i4) {
            Id3Frame A0B = A0B(i2, c0483Hc, z, i3, dl);
            if (A0B != null) {
                arrayList.add(A0B);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterFrame(str, A08, A082, A0M, A0M2, id3FrameArr);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static GeobFrame A09(C0483Hc c0483Hc, int i) throws UnsupportedEncodingException {
        int A0E = c0483Hc.A0E();
        String A0H = A0H(A0E);
        byte[] bArr = new byte[i - 1];
        c0483Hc.A0c(bArr, 0, i - 1);
        int A022 = A02(bArr, 0);
        String str = new String(bArr, 0, A022, A0I(169, 10, 32));
        int i2 = A022 + 1;
        int A032 = A03(bArr, i2, A0E);
        String A0K = A0K(bArr, i2, A032, A0H);
        int A00 = A00(A0E) + A032;
        int A033 = A03(bArr, A00, A0E);
        return new GeobFrame(str, A0K, A0K(bArr, A00, A033, A0H), A0N(bArr, A00(A0E) + A033, bArr.length));
    }

    public static String A0I(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 2);
        }
        return new String(copyOfRange);
    }

    public static void A0L() {
        A01 = new byte[]{78, 8, 78, 8, 78, 8, 44, airhockey.J_GAME_EXIT, 44, airhockey.J_GAME_EXIT, 44, airhockey.J_GAME_EXIT, 44, airhockey.J_GAME_EXIT, 89, 85, 19, 7, 20, 24, 16, 38, 28, 15, 16, airhockey.P_GAME_MYLOSE, 91, 126, airhockey.J_GAME_ENEMYEXIT, 126, 63, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GOO, airhockey.J_GOO, 63, airhockey.J_GAME_DISCONNECT, 119, airhockey.J_GOO, 109, airhockey.J_GAME_ENEMYEXIT, 63, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GOO, 63, 125, airhockey.J_PURCHASE, 63, 126, airhockey.J_BACK, 63, 86, 91, 44, 63, airhockey.J_GAME_ENEMYEXIT, 126, airhockey.J_ACHIEVEMENTCALLBACK, 22, 49, 57, 60, 53, 52, airhockey.J_GOO, 36, 63, airhockey.J_GOO, 52, 53, 51, 63, 52, 53, airhockey.J_GOO, 54, 34, 49, 61, 53, airhockey.J_GAME_EXIT, airhockey.J_GOO, 57, 52, 109, 119, 80, 88, 93, 84, 85, 17, airhockey.P_GAME_STANDBY, 94, 17, airhockey.P_GAME_MYWIN, 80, 93, 88, 85, 80, airhockey.P_GAME_STANDBY, 84, 17, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_ERROR, 2, 17, airhockey.P_GAME_STANDBY, 80, 86, 17, airhockey.P_GAME_BREAKBALLCOUNT, 88, airhockey.P_GAME_STANDBY, 89, 17, 92, 80, 91, 94, airhockey.P_GAME_MYSCORE, airhockey.J_ENEMYWIN, 84, airhockey.P_GAME_MYSCORE, airhockey.P_NATION, 88, 94, 95, 12, 4, 48, 35, 47, 39, airhockey.J_NATION, 49, 43, 56, 39, airhockey.J_NATION, 39, 58, 33, 39, 39, 38, 49, airhockey.J_NATION, 48, 39, 47, 35, 43, 44, 43, 44, 37, airhockey.J_NATION, 54, 35, 37, airhockey.J_NATION, 38, 35, 54, 35, airhockey.P_GAME_MYWIN, airhockey.P_GAME_EXIT, 61, airhockey.J_GAME_ENEMYEXIT, airhockey.J_BACK, 109, 15, 26, 26, 23, 27, 15, 19, 88, airhockey.J_ERROR, 34, 85, airhockey.J_DISCONNECT, airhockey.J_SAVEDGAME_RELOAD, 126, airhockey.J_ERROR, airhockey.J_DISCONNECT, 99, airhockey.J_SDKVER, 89, 91, airhockey.P_NATION, airhockey.P_NATION, 87, 86, 18, 123, airhockey.J_REWARD, 1, 18, airhockey.P_GAME_BREAKBALLCOUNT, 83, 85, 18, airhockey.P_GAME_STANDBY, 91, airhockey.P_GAME_BREAKBALLCOUNT, 90, 18, 95, 83, 88, 93, 64, airhockey.J_ONREWARDED, 87, 64, 65, 91, 93, 92, 15, 0, 18, 83, 92, 86, 18, airhockey.P_GAME_MYWIN, 92, 86, 87, 84, 91, 92, 87, 86, 18, 81, 93, 95, airhockey.P_NATION, 64, 87, 65, 65, 91, 93, 92, 18, 65, 81, 90, 87, 95, 87, airhockey.J_DISCONNECT, 76, 78, 87, 87, airhockey.P_NATION, airhockey.P_GAME_MYSCORE, 7, airhockey.J_INVITE, 99, 20, 7, 83, airhockey.P_GAME_BREAKBALLCOUNT, 64, 7, 80, 78, 83, 79, 7, 82, airhockey.P_GAME_REMATCH, 84, 82, 87, 87, airhockey.P_GAME_MYLOSE, 85, 83, airhockey.P_NATION, airhockey.P_GAME_MYSCORE, 7, airhockey.P_GAME_EXIT, airhockey.P_GAME_BREAKBALLCOUNT, 77, airhockey.P_GAME_MYLOSE, 85, airhockey.J_BACK, airhockey.P_NATION, 85, 84, 78, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_REMATCH, 26, 28, 36, 38, 63, 63, 38, 33, 40, 111, 58, 33, 60, 58, 63, 63, 32, 61, 59, 42, 43, 111, 44, 32, 34, 63, 61, 42, 60, 60, 42, 43, 111, 32, 61, 111, 42, 33, 44, 61, 54, 63, 59, 42, 43, 111, 41, 61, 46, 34, 42, 62, 50, 50, 50, 31, 30, 12, airhockey.J_ENEMYWIN, 123, 124, 62, 63, 45, airhockey.P_GAME_BREAKBALLCOUNT, 90, 93, 41, 46, 54, 55, 37, 78, 91, airhockey.P_GAME_SELECTMAP, ByteCompanionObject.MAX_VALUE, airhockey.J_DISCONNECT, airhockey.J_GAME_REMATCH, airhockey.J_SDKVER, airhockey.J_DISCONNECT, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_GAME_STANDBY, airhockey.J_DISCONNECT, airhockey.J_ERROR, 49, 119, airhockey.J_ACHIEVEMENTCALLBACK, 99, airhockey.J_NATION, airhockey.J_GAME_STANDBY, 49, airhockey.J_GAME_STANDBY, airhockey.J_WAIT, 99, airhockey.J_DISCONNECT, airhockey.J_DISCONNECT, 49, airhockey.J_SAVEDGAME_SAVE, airhockey.J_ENEMYLOSE, airhockey.J_GAME_STANDBY, airhockey.J_DISCONNECT, airhockey.J_NATION, 49, 126, 119, 49, 88, 85, 34, 49, airhockey.J_GAME_STANDBY, airhockey.J_GOO, airhockey.J_REWARD, 49, airhockey.J_WAIT, airhockey.J_DISCONNECT, airhockey.J_GOO, airhockey.J_ERROR, airhockey.J_DISCONNECT, 99, 43, 49, 19, 40, 53, 51, 54, 54, 41, 52, 50, 35, 34, 102, 37, 46, 39, 52, 39, 37, 50, 35, 52, 102, 35, 40, 37, 41, 34, 47, 40, 33, airhockey.J_SDKVER, airhockey.J_INVITE, airhockey.J_INVITE, airhockey.J_INVITE, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_NATION, 78, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_EXIT, 0, 21, 17, 29, 27, 25, 83, 22, 12, 25, 27, 81, 85, 89, 95, 93, 23, 82, airhockey.P_GAME_MYLOSE, 95};
    }

    static {
        A0L();
        A04 = new VP();
        A03 = C0499Hs.A08(A0I(166, 3, 12));
    }

    public VO() {
        this(null);
    }

    public VO(@Nullable DL dl) {
        this.A00 = dl;
    }

    public static int A00(int i) {
        if (i == 0 || i == 3) {
            return 1;
        }
        return 2;
    }

    public static int A01(C0483Hc c0483Hc, int i) {
        byte[] bArr = c0483Hc.A00;
        for (int A06 = c0483Hc.A06(); A06 + 1 < i; A06++) {
            int i2 = bArr[A06];
            if ((i2 & 255) == 255 && bArr[A06 + 1] == 0) {
                int i3 = A06 + 2;
                int i4 = A06 + 1;
                int i5 = (i - A06) - 2;
                String[] strArr = A02;
                String str = strArr[0];
                String str2 = strArr[6];
                int i6 = str.charAt(4);
                if (i6 == str2.charAt(4)) {
                    throw new RuntimeException();
                }
                A02[1] = "GmDFLtMXmPbGQOJzrAUGcq8JFdShu0kr";
                System.arraycopy(bArr, i3, bArr, i4, i5);
                i--;
            }
        }
        return i;
    }

    /* JADX WARN: Incorrect condition in loop: B:15:0x0001 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A02(byte[] r1, int r2) {
        /*
        L0:
            int r0 = r1.length
            if (r2 >= r0) goto Lb
            r0 = r1[r2]
            if (r0 != 0) goto L8
            return r2
        L8:
            int r2 = r2 + 1
            goto L0
        Lb:
            int r0 = r1.length
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.VO.A02(byte[], int):int");
    }

    /* JADX WARN: Incorrect condition in loop: B:29:0x000d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A03(byte[] r2, int r3, int r4) {
        /*
            int r1 = A02(r2, r3)
            if (r4 == 0) goto L9
            r0 = 3
            if (r4 != r0) goto La
        L9:
            return r1
        La:
            int r0 = r2.length
            int r0 = r0 + (-1)
            if (r1 >= r0) goto L21
            int r0 = r1 % 2
            if (r0 != 0) goto L1a
            int r0 = r1 + 1
            r0 = r2[r0]
            if (r0 != 0) goto L1a
            return r1
        L1a:
            int r0 = r1 + 1
            int r1 = A02(r2, r0)
            goto La
        L21:
            int r0 = r2.length
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.VO.A03(byte[], int, int):int");
    }

    public static ApicFrame A04(C0483Hc c0483Hc, int i, int i2) throws UnsupportedEncodingException {
        int A022;
        String A0M;
        int descriptionEndIndex = c0483Hc.A0E();
        String A0H = A0H(descriptionEndIndex);
        int encoding = i - 1;
        byte[] bArr = new byte[encoding];
        int encoding2 = i - 1;
        c0483Hc.A0c(bArr, 0, encoding2);
        String description = A0I(458, 6, 45);
        String A0I = A0I(169, 10, 32);
        if (i2 == 2) {
            A022 = 2;
            A0M = description + C0499Hs.A0M(new String(bArr, 0, 3, A0I));
            if (A0I(474, 9, 58).equals(A0M)) {
                A0M = A0I(464, 10, 126);
            }
        } else {
            A022 = A02(bArr, 0);
            A0M = C0499Hs.A0M(new String(bArr, 0, A022, A0I));
            if (A0M.indexOf(47) == -1) {
                A0M = description + A0M;
            }
        }
        int encoding3 = A022 + 1;
        int i3 = bArr[encoding3] & 255;
        int i4 = A022 + 2;
        int pictureType = A03(bArr, i4, descriptionEndIndex);
        int encoding4 = pictureType - i4;
        String mimeType = new String(bArr, i4, encoding4, A0H);
        int encoding5 = bArr.length;
        return new ApicFrame(A0M, mimeType, i3, A0N(bArr, A00(descriptionEndIndex) + pictureType, encoding5));
    }

    public static BinaryFrame A05(C0483Hc c0483Hc, int i, String str) {
        byte[] bArr = new byte[i];
        c0483Hc.A0c(bArr, 0, i);
        return new BinaryFrame(str, bArr);
    }

    public static ChapterTocFrame A07(C0483Hc c0483Hc, int i, int i2, boolean z, int framePosition, @Nullable DL dl) throws UnsupportedEncodingException {
        int A06 = c0483Hc.A06();
        int A022 = A02(c0483Hc.A00, A06);
        String A0I = A0I(169, 10, 32);
        String str = new String(c0483Hc.A00, A06, A022 - A06, A0I);
        c0483Hc.A0Y(A022 + 1);
        int framePosition2 = c0483Hc.A0E();
        boolean z2 = (framePosition2 & 2) != 0;
        boolean z3 = (framePosition2 & 1) != 0;
        int A0E = c0483Hc.A0E();
        String[] strArr = new String[A0E];
        for (int i3 = 0; i3 < A0E; i3++) {
            int startIndex = c0483Hc.A06();
            int i4 = A02(c0483Hc.A00, startIndex);
            int framePosition3 = i4 - startIndex;
            strArr[i3] = new String(c0483Hc.A00, startIndex, framePosition3, A0I);
            c0483Hc.A0Y(i4 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = A06 + i;
        while (c0483Hc.A06() < i5) {
            String[] strArr2 = A02;
            String str2 = strArr2[4];
            String str3 = strArr2[5];
            int framePosition4 = str2.length();
            if (framePosition4 != str3.length()) {
                throw new RuntimeException();
            }
            String[] strArr3 = A02;
            strArr3[4] = "YQsr0udxa6AlS4ZOrNFlw";
            strArr3[5] = "dBU8ocTiI6WLc8wZTOIXb";
            Id3Frame A0B = A0B(i2, c0483Hc, z, framePosition, dl);
            if (A0B != null) {
                arrayList.add(A0B);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterTocFrame(str, z2, z3, strArr, id3FrameArr);
    }

    public static CommentFrame A08(C0483Hc c0483Hc, int i) throws UnsupportedEncodingException {
        if (i < 4) {
            return null;
        }
        int textStartIndex = c0483Hc.A0E();
        String A0H = A0H(textStartIndex);
        byte[] bArr = new byte[3];
        c0483Hc.A0c(bArr, 0, 3);
        String description = new String(bArr, 0, 3);
        int encoding = i - 4;
        byte[] data = new byte[encoding];
        int encoding2 = i - 4;
        c0483Hc.A0c(data, 0, encoding2);
        int encoding3 = A03(data, 0, textStartIndex);
        String language = new String(data, 0, encoding3, A0H);
        int A00 = A00(textStartIndex) + encoding3;
        int encoding4 = A03(data, A00, textStartIndex);
        String charset = A0K(data, A00, encoding4, A0H);
        return new CommentFrame(description, language, charset);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0089, code lost:
        if (r0 != 0) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.X.DM A0A(com.facebook.ads.redexgen.X.C0483Hc r9) {
        /*
            int r3 = r9.A04()
            r8 = 0
            r2 = 179(0xb3, float:2.51E-43)
            r1 = 10
            r0 = 19
            java.lang.String r7 = A0I(r2, r1, r0)
            r0 = 10
            if (r3 >= r0) goto L21
            r2 = 26
            r1 = 31
            r0 = 29
            java.lang.String r0 = A0I(r2, r1, r0)
            android.util.Log.w(r7, r0)
            return r8
        L21:
            int r4 = r9.A0G()
            int r0 = com.facebook.ads.redexgen.X.VO.A03
            if (r4 == r0) goto L46
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 376(0x178, float:5.27E-43)
            r1 = 48
            r0 = 19
            java.lang.String r0 = A0I(r2, r1, r0)
            r3.append(r0)
            r3.append(r4)
            java.lang.String r0 = r3.toString()
            android.util.Log.w(r7, r0)
            return r8
        L46:
            int r4 = r9.A0E()
            r3 = 1
            r9.A0Z(r3)
            int r6 = r9.A0E()
            int r2 = r9.A0D()
            r0 = 2
            r5 = 4
            if (r4 != r0) goto L71
            r0 = r6 & 64
            if (r0 == 0) goto L6f
            r0 = 1
        L5f:
            if (r0 == 0) goto L85
            r2 = 189(0xbd, float:2.65E-43)
            r1 = 68
            r0 = 48
            java.lang.String r0 = A0I(r2, r1, r0)
            android.util.Log.w(r7, r0)
            return r8
        L6f:
            r0 = 0
            goto L5f
        L71:
            r0 = 3
            if (r4 != r0) goto L95
            r0 = r6 & 64
            if (r0 == 0) goto L93
            r0 = 1
        L79:
            if (r0 == 0) goto L85
            int r0 = r9.A08()
            r9.A0Z(r0)
            int r0 = r0 + 4
            int r2 = r2 - r0
        L85:
            if (r4 >= r5) goto L91
            r0 = r6 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L91
        L8b:
            com.facebook.ads.redexgen.X.DM r0 = new com.facebook.ads.redexgen.X.DM
            r0.<init>(r4, r3, r2)
            return r0
        L91:
            r3 = 0
            goto L8b
        L93:
            r0 = 0
            goto L79
        L95:
            if (r4 != r5) goto Lb6
            r0 = r6 & 64
            if (r0 == 0) goto Lb4
            r0 = 1
        L9c:
            if (r0 == 0) goto La8
            int r1 = r9.A0D()
            int r0 = r1 + (-4)
            r9.A0Z(r0)
            int r2 = r2 - r1
        La8:
            r0 = r6 & 16
            if (r0 == 0) goto Lb2
            r0 = 1
        Lad:
            if (r0 == 0) goto L85
            int r2 = r2 + (-10)
            goto L85
        Lb2:
            r0 = 0
            goto Lad
        Lb4:
            r0 = 0
            goto L9c
        Lb6:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 257(0x101, float:3.6E-43)
            r1 = 46
            r0 = 37
            java.lang.String r0 = A0I(r2, r1, r0)
            r3.append(r0)
            r3.append(r4)
            java.lang.String r0 = r3.toString()
            android.util.Log.w(r7, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.VO.A0A(com.facebook.ads.redexgen.X.Hc):com.facebook.ads.redexgen.X.DM");
    }

    /* JADX WARN: Code restructure failed: missing block: B:321:0x01eb, code lost:
        if (r8 == 67) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x024f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame A0B(int r23, com.facebook.ads.redexgen.X.C0483Hc r24, boolean r25, int r26, @androidx.annotation.Nullable com.facebook.ads.redexgen.X.DL r27) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.VO.A0B(int, com.facebook.ads.redexgen.X.Hc, boolean, int, com.facebook.ads.redexgen.X.DL):com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame");
    }

    public static PrivFrame A0C(C0483Hc c0483Hc, int i) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        c0483Hc.A0c(bArr, 0, i);
        int A022 = A02(bArr, 0);
        return new PrivFrame(new String(bArr, 0, A022, A0I(169, 10, 32)), A0N(bArr, A022 + 1, bArr.length));
    }

    public static TextInformationFrame A0D(C0483Hc c0483Hc, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int valueStartIndex = c0483Hc.A0E();
        String A0H = A0H(valueStartIndex);
        int encoding = i - 1;
        byte[] data = new byte[encoding];
        int encoding2 = i - 1;
        c0483Hc.A0c(data, 0, encoding2);
        int encoding3 = A03(data, 0, valueStartIndex);
        String description = new String(data, 0, encoding3, A0H);
        int A00 = A00(valueStartIndex) + encoding3;
        int encoding4 = A03(data, A00, valueStartIndex);
        String A0K = A0K(data, A00, encoding4, A0H);
        String charset = A0I(353, 4, 104);
        return new TextInformationFrame(charset, description, A0K);
    }

    public static TextInformationFrame A0E(C0483Hc c0483Hc, int i, String str) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int encoding = c0483Hc.A0E();
        String A0H = A0H(encoding);
        byte[] data = new byte[i - 1];
        c0483Hc.A0c(data, 0, i - 1);
        return new TextInformationFrame(str, null, new String(data, 0, A03(data, 0, encoding), A0H));
    }

    public static UrlLinkFrame A0F(C0483Hc c0483Hc, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int descriptionEndIndex = c0483Hc.A0E();
        String A0H = A0H(descriptionEndIndex);
        int encoding = i - 1;
        byte[] bArr = new byte[encoding];
        int encoding2 = i - 1;
        c0483Hc.A0c(bArr, 0, encoding2);
        int encoding3 = A03(bArr, 0, descriptionEndIndex);
        String str = new String(bArr, 0, encoding3, A0H);
        int A00 = A00(descriptionEndIndex) + encoding3;
        String A0K = A0K(bArr, A00, A02(bArr, A00), A0I(169, 10, 32));
        String charset = A0I(454, 4, 52);
        return new UrlLinkFrame(charset, str, A0K);
    }

    public static UrlLinkFrame A0G(C0483Hc c0483Hc, int i, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        c0483Hc.A0c(bArr, 0, i);
        return new UrlLinkFrame(str, null, new String(bArr, 0, A02(bArr, 0), A0I(169, 10, 32)));
    }

    public static String A0H(int i) {
        String A0I = A0I(169, 10, 32);
        if (i != 0) {
            String[] strArr = A02;
            if (strArr[0].charAt(4) != strArr[6].charAt(4)) {
                String[] strArr2 = A02;
                strArr2[0] = "UCWBICnCAN9SKv4K838ju49qC0q78ZKM";
                strArr2[6] = "3COoRrioJ7cuwfF8fyFL8X2a6WS2sOUX";
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return A0I;
                        }
                        return A0I(371, 5, 97);
                    }
                    return A0I(363, 8, 105);
                }
                return A0I(357, 6, 72);
            }
            throw new RuntimeException();
        }
        return A0I;
    }

    public static String A0J(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, A0I(0, 6, 105), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, A0I(6, 8, 11), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static String A0K(byte[] bArr, int i, int i2, String str) throws UnsupportedEncodingException {
        if (i2 <= i || i2 > bArr.length) {
            String[] strArr = A02;
            if (strArr[4].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[0] = "r4Qi0WBzOYfLLA4UC9s9DAK76ksjAQPp";
            strArr2[6] = "c5jPrSHyFK7RFs6Pjjym9ojkSMFCl1O5";
            return A0I(0, 0, 121);
        }
        return new String(bArr, i, i2 - i, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x00af, code lost:
        if (r8 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x00b1, code lost:
        r7 = 0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x00b3, code lost:
        if (r9 == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x00b5, code lost:
        r7 = r7 + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00b7, code lost:
        r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x00ba, code lost:
        if (r0 >= 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x00bc, code lost:
        r16.A0Y(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00bf, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00cc, code lost:
        if (r8 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x00e7, code lost:
        r0 = r16.A04();
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x00ee, code lost:
        if (r0 >= r3) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x00f7, code lost:
        r16.A0Y(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x00fa, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0M(com.facebook.ads.redexgen.X.C0483Hc r16, int r17, int r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.VO.A0M(com.facebook.ads.redexgen.X.Hc, int, int, boolean):boolean");
    }

    public static byte[] A0N(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return new byte[0];
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }

    public final Metadata A0O(byte[] bArr, int i) {
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        ArrayList arrayList = new ArrayList();
        C0483Hc c0483Hc = new C0483Hc(bArr, i);
        DM A0A = A0A(c0483Hc);
        if (A0A == null) {
            return null;
        }
        int startPosition = c0483Hc.A06();
        i2 = A0A.A01;
        int frameHeaderSize = i2 == 2 ? 6 : 10;
        i3 = A0A.A00;
        z = A0A.A02;
        if (z) {
            i8 = A0A.A00;
            i3 = A01(c0483Hc, i8);
        }
        c0483Hc.A0X(startPosition + i3);
        boolean z2 = false;
        i4 = A0A.A01;
        if (!A0M(c0483Hc, i4, frameHeaderSize, false)) {
            i6 = A0A.A01;
            if (i6 == 4 && A0M(c0483Hc, 4, frameHeaderSize, true)) {
                z2 = true;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(A0I(84, 45, 51));
                i7 = A0A.A01;
                sb.append(i7);
                Log.w(A0I(179, 10, 19), sb.toString());
                return null;
            }
        }
        while (c0483Hc.A04() >= frameHeaderSize) {
            i5 = A0A.A01;
            Id3Frame A0B = A0B(i5, c0483Hc, z2, frameHeaderSize, this.A00);
            if (A0B != null) {
                arrayList.add(A0B);
            }
        }
        return new Metadata(arrayList);
    }

    @Override // com.facebook.ads.redexgen.X.D9
    public final Metadata A4k(C0381Cx c0381Cx) {
        ByteBuffer buffer = c0381Cx.A01;
        return A0O(buffer.array(), buffer.limit());
    }
}
