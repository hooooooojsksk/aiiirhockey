package com.facebook.ads.redexgen.X;

import android.graphics.Point;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters;
import com.mobirix.airhockey.airhockey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network.dex */
public final class B7 extends AbstractC0827Ur {
    public static byte[] A02;
    public static String[] A03 = {"x6AsNgj7kZHrnoNYywGy3amTsD0l", "S34B6ywREx44pNmlWPMRcx17PIA7Fyf2", "1XorlyLpztZAXiZGzmiFCBwFfMWU", "T5Z409y2ECpb8uf8T6KWShvwgb", "8Qiq8HU85lCoFhvN1dBY3zigvCratExc", "EyxqnSMNDXwhS4zpORn6ov", "S8xh7faol6xkg145s9aDIWkyvYFJ4njt", "Q6jD8cwEOZ"};
    public static final int[] A04;
    @Nullable
    public final GI A00;
    public final AtomicReference<DefaultTrackSelector$Parameters> A01;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A03(TrackGroup trackGroup, int[] iArr, int i, @Nullable String str, int i2, int i3, int i4, List<Integer> list) {
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            int intValue = list.get(i6).intValue();
            if (A0L(trackGroup.A01(intValue), str, iArr[intValue], i, i2, i3, i4)) {
                i5++;
            }
        }
        return i5;
    }

    public static String A0C(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 116);
        }
        return new String(copyOfRange);
    }

    public static void A0E() {
        A02 = new byte[]{96, 123, airhockey.J_BACK};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0F(TrackGroup trackGroup, int[] iArr, int i, @Nullable String str, int i2, int i3, int i4, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = list.get(size).intValue();
            if (!A0L(trackGroup.A01(intValue), str, iArr[intValue], i, i2, i3, i4)) {
                list.remove(size);
            }
        }
    }

    static {
        A0E();
        A04 = new int[0];
    }

    public B7() {
        this(null);
    }

    public B7(@Nullable GI gi) {
        this.A00 = gi;
        this.A01 = new AtomicReference<>(DefaultTrackSelector$Parameters.A0J);
    }

    public static int A00(int i, int i2) {
        if (i == -1) {
            return i2 == -1 ? 0 : -1;
        } else if (i2 == -1) {
            return 1;
        } else {
            return i - i2;
        }
    }

    public static int A01(int i, int i2) {
        if (i > i2) {
            return 1;
        }
        return i2 > i ? -1 : 0;
    }

    /* JADX WARN: Incorrect condition in loop: B:17:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A04(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup r4, int[] r5, com.facebook.ads.redexgen.X.G9 r6) {
        /*
            r3 = 0
            r2 = 0
        L2:
            int r0 = r4.A01
            if (r2 >= r0) goto L17
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r1 = r4.A01(r2)
            r0 = r5[r2]
            boolean r0 = A0J(r1, r0, r6)
            if (r0 == 0) goto L14
            int r3 = r3 + 1
        L14:
            int r2 = r2 + 1
            goto L2
        L17:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.B7.A04(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup, int[], com.facebook.ads.redexgen.X.G9):int");
    }

    public static Point A05(boolean z, int tempViewportWidth, int i, int i2, int i3) {
        if (z) {
            if ((i2 > i3) != (tempViewportWidth > i)) {
                tempViewportWidth = i;
                i = tempViewportWidth;
            }
        }
        if (i2 * i >= i3 * tempViewportWidth) {
            return new Point(tempViewportWidth, C0499Hs.A04(tempViewportWidth * i3, i2));
        }
        return new Point(C0499Hs.A04(i * i2, i3), i);
    }

    @Nullable
    private final GJ A06(int i, TrackGroupArray trackGroupArray, int[][] iArr, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) throws C9F {
        TrackGroup trackGroup = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int selectedTrackScore = trackGroupArray.A01;
            String[] strArr = A03;
            if (strArr[2].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A03[6] = "SAKR2CqoaYLk1divdPOMyt7jgjpsUw2M";
            if (i4 < selectedTrackScore) {
                TrackGroup A01 = trackGroupArray.A01(i4);
                int[] iArr2 = iArr[i4];
                for (int selectedTrackScore2 = 0; selectedTrackScore2 < A01.A01; selectedTrackScore2++) {
                    if (A0H(iArr2[selectedTrackScore2], defaultTrackSelector$Parameters.A0B)) {
                        int selectedTrackIndex = (A01.A01(selectedTrackScore2).A0D & 1) != 0 ? 2 : 1;
                        if (A0H(iArr2[selectedTrackScore2], false)) {
                            selectedTrackIndex += 1000;
                        }
                        if (selectedTrackIndex > i3) {
                            trackGroup = A01;
                            i2 = selectedTrackScore2;
                            i3 = selectedTrackIndex;
                        }
                    }
                }
                i4++;
            } else if (trackGroup == null) {
                return null;
            } else {
                return new C0339At(trackGroup, i2);
            }
        }
    }

    @Nullable
    public static GJ A07(TrackGroupArray trackGroupArray, int[][] iArr, int i, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, GI gi) throws C9F {
        int i2;
        if (defaultTrackSelector$Parameters.A0A) {
            i2 = 24;
        } else {
            i2 = 16;
        }
        boolean z = defaultTrackSelector$Parameters.A09 && (i & i2) != 0;
        for (int i3 = 0; i3 < trackGroupArray.A01; i3++) {
            TrackGroup A01 = trackGroupArray.A01(i3);
            int[] A0O = A0O(A01, iArr[i3], z, i2, defaultTrackSelector$Parameters.A03, defaultTrackSelector$Parameters.A02, defaultTrackSelector$Parameters.A01, defaultTrackSelector$Parameters.A06, defaultTrackSelector$Parameters.A05, defaultTrackSelector$Parameters.A0F);
            if (A0O.length > 0) {
                return ((GI) HD.A01(gi)).A4X(A01, A0O);
            }
        }
        return null;
    }

    /* JADX WARN: Incorrect condition in loop: B:39:0x0006 */
    /* JADX WARN: Incorrect condition in loop: B:42:0x0011 */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.facebook.ads.redexgen.X.GJ A08(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray r11, int[][] r12, int r13, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters r14, @androidx.annotation.Nullable com.facebook.ads.redexgen.X.GI r15) throws com.facebook.ads.redexgen.X.C9F {
        /*
            r10 = this;
            r3 = -1
            r5 = -1
            r8 = 0
            r7 = 0
        L4:
            int r0 = r11.A01
            if (r7 >= r0) goto L39
            com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup r6 = r11.A01(r7)
            r9 = r12[r7]
            r4 = 0
        Lf:
            int r0 = r6.A01
            if (r4 >= r0) goto L36
            r1 = r9[r4]
            boolean r0 = r14.A0B
            boolean r0 = A0H(r1, r0)
            if (r0 == 0) goto L33
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r2 = r6.A01(r4)
            com.facebook.ads.redexgen.X.GA r1 = new com.facebook.ads.redexgen.X.GA
            r0 = r9[r4]
            r1.<init>(r2, r14, r0)
            if (r8 == 0) goto L30
            int r0 = r1.compareTo(r8)
            if (r0 <= 0) goto L33
        L30:
            r5 = r7
            r3 = r4
            r8 = r1
        L33:
            int r4 = r4 + 1
            goto Lf
        L36:
            int r7 = r7 + 1
            goto L4
        L39:
            r0 = -1
            if (r5 != r0) goto L3e
            r0 = 0
            return r0
        L3e:
            com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup r2 = r11.A01(r5)
            boolean r0 = r14.A0D
            if (r0 != 0) goto L58
            if (r15 == 0) goto L58
            r1 = r12[r5]
            boolean r0 = r14.A09
            int[] r1 = A0N(r2, r1, r0)
            int r0 = r1.length
            if (r0 <= 0) goto L58
            com.facebook.ads.redexgen.X.GJ r0 = r15.A4X(r2, r1)
            return r0
        L58:
            com.facebook.ads.redexgen.X.At r0 = new com.facebook.ads.redexgen.X.At
            r0.<init>(r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.B7.A08(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray, int[][], int, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters, com.facebook.ads.redexgen.X.GI):com.facebook.ads.redexgen.X.GJ");
    }

    @Nullable
    private final GJ A09(TrackGroupArray trackGroupArray, int[][] iArr, int i, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, @Nullable GI gi) throws C9F {
        GJ gj = null;
        if (!defaultTrackSelector$Parameters.A0D && gi != null) {
            gj = A07(trackGroupArray, iArr, i, defaultTrackSelector$Parameters, gi);
        }
        if (gj == null) {
            return A0A(trackGroupArray, iArr, defaultTrackSelector$Parameters);
        }
        return gj;
    }

    @Nullable
    public static GJ A0A(TrackGroupArray trackGroupArray, int[][] iArr, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) {
        int formatPixelCount;
        TrackGroup trackGroup = null;
        int selectedPixelCount = 0;
        int i = 0;
        int selectedBitrate = -1;
        int selectedTrackScore = -1;
        int selectedTrackIndex = 0;
        while (selectedTrackIndex < trackGroupArray.A01) {
            TrackGroup A01 = trackGroupArray.A01(selectedTrackIndex);
            List<Integer> A0D = A0D(A01, defaultTrackSelector$Parameters.A06, defaultTrackSelector$Parameters.A05, defaultTrackSelector$Parameters.A0F);
            int[] iArr2 = iArr[selectedTrackIndex];
            for (int i2 = 0; i2 < A01.A01; i2++) {
                if (A0H(iArr2[i2], defaultTrackSelector$Parameters.A0B)) {
                    Format A012 = A01.A01(i2);
                    int trackScore = (!A0D.contains(Integer.valueOf(i2)) || (A012.A0F != -1 && A012.A0F > defaultTrackSelector$Parameters.A03) || ((A012.A08 != -1 && A012.A08 > defaultTrackSelector$Parameters.A02) || (A012.A04 != -1 && A012.A04 > defaultTrackSelector$Parameters.A01))) ? 0 : 1;
                    if (trackScore != 0 || defaultTrackSelector$Parameters.A0C) {
                        int i3 = trackScore != 0 ? 2 : 1;
                        boolean A0H = A0H(iArr2[i2], false);
                        if (A0H) {
                            i3 += 1000;
                        }
                        int comparisonResult = i3 > i ? 1 : 0;
                        if (i3 == i) {
                            if (defaultTrackSelector$Parameters.A0D) {
                                comparisonResult = A00(A012.A04, selectedBitrate) < 0 ? 1 : 0;
                            } else {
                                int formatPixelCount2 = A012.A0E();
                                if (formatPixelCount2 != selectedTrackScore) {
                                    formatPixelCount = A00(formatPixelCount2, selectedTrackScore);
                                } else {
                                    int comparisonResult2 = A012.A04;
                                    formatPixelCount = A00(comparisonResult2, selectedBitrate);
                                }
                                if (A0H && trackScore != 0) {
                                    comparisonResult = formatPixelCount > 0 ? 1 : 0;
                                } else {
                                    comparisonResult = formatPixelCount < 0 ? 1 : 0;
                                }
                            }
                        }
                        if (comparisonResult != 0) {
                            trackGroup = A01;
                            selectedPixelCount = i2;
                            i = i3;
                            selectedBitrate = A012.A04;
                            selectedTrackScore = A012.A0E();
                        }
                    }
                }
            }
            selectedTrackIndex++;
            if (A03[0].length() == 12) {
                throw new RuntimeException();
            }
            A03[4] = "bCwtkc2wOedKECeOVuhxXwTg9CG4Se5g";
        }
        if (trackGroup == null) {
            return null;
        }
        return new C0339At(trackGroup, selectedPixelCount);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0093, code lost:
        r5 = r5 + 1;
     */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.facebook.ads.redexgen.X.GJ A0B(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray r15, int[][] r16, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters r17) throws com.facebook.ads.redexgen.X.C9F {
        /*
            r14 = this;
            r7 = 0
            r6 = 0
            r8 = 0
            r5 = 0
        L4:
            int r0 = r15.A01
            if (r5 >= r0) goto L9d
            com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup r4 = r15.A01(r5)
            r13 = r16[r5]
            r3 = 0
        Lf:
            int r9 = r4.A01
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.B7.A03
            r0 = 2
            r1 = r2[r0]
            r0 = 5
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L97
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.B7.A03
            java.lang.String r1 = "g6y39jHfRyWLL92XZpLOvUojVqW51SGk"
            r0 = 4
            r2[r0] = r1
            if (r3 >= r9) goto L93
            r1 = r13[r3]
            r10 = r17
            boolean r0 = r10.A0B
            boolean r0 = A0H(r1, r0)
            if (r0 == 0) goto L74
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r1 = r4.A01(r3)
            int r2 = r1.A0D
            int r0 = r10.A00
            r0 = r0 ^ (-1)
            r2 = r2 & r0
            r0 = r2 & 1
            r9 = 0
            r12 = 1
            if (r0 == 0) goto L91
            r11 = 1
        L4a:
            r0 = r2 & 2
            if (r0 == 0) goto L8f
        L4e:
            java.lang.String r0 = r10.A08
            boolean r2 = A0K(r1, r0)
            if (r2 != 0) goto L60
            boolean r0 = r10.A0E
            if (r0 == 0) goto L7d
            boolean r0 = A0I(r1)
            if (r0 == 0) goto L7d
        L60:
            if (r11 == 0) goto L77
            r1 = 8
        L64:
            int r1 = r1 + r2
        L65:
            r0 = r13[r3]
            boolean r0 = A0H(r0, r9)
            if (r0 == 0) goto L6f
            int r1 = r1 + 1000
        L6f:
            if (r1 <= r8) goto L74
            r7 = r4
            r6 = r3
            r8 = r1
        L74:
            int r3 = r3 + 1
            goto Lf
        L77:
            if (r12 != 0) goto L7b
            r1 = 6
            goto L64
        L7b:
            r1 = 4
            goto L64
        L7d:
            if (r11 == 0) goto L81
            r1 = 3
            goto L65
        L81:
            if (r12 == 0) goto L74
            java.lang.String r0 = r10.A07
            boolean r0 = A0K(r1, r0)
            if (r0 == 0) goto L8d
            r1 = 2
            goto L65
        L8d:
            r1 = 1
            goto L65
        L8f:
            r12 = 0
            goto L4e
        L91:
            r11 = 0
            goto L4a
        L93:
            int r5 = r5 + 1
            goto L4
        L97:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L9d:
            if (r7 != 0) goto La1
            r0 = 0
        La0:
            return r0
        La1:
            com.facebook.ads.redexgen.X.At r0 = new com.facebook.ads.redexgen.X.At
            r0.<init>(r7, r6)
            goto La0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.B7.A0B(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray, int[][], com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters):com.facebook.ads.redexgen.X.GJ");
    }

    public static List<Integer> A0D(TrackGroup trackGroup, int i, int i2, boolean z) {
        ArrayList arrayList = new ArrayList(trackGroup.A01);
        for (int i3 = 0; i3 < trackGroup.A01; i3++) {
            arrayList.add(Integer.valueOf(i3));
        }
        if (i == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE) {
            return arrayList;
        }
        int i4 = Integer.MAX_VALUE;
        for (int videoPixels = 0; videoPixels < trackGroup.A01; videoPixels++) {
            Format A01 = trackGroup.A01(videoPixels);
            if (A01.A0F > 0 && A01.A08 > 0) {
                Point A05 = A05(z, i, i2, A01.A0F, A01.A08);
                int i5 = A01.A0F * A01.A08;
                if (A01.A0F >= ((int) (A05.x * 0.98f)) && A01.A08 >= ((int) (A05.y * 0.98f)) && i5 < i4) {
                    i4 = i5;
                }
            }
        }
        if (i4 != Integer.MAX_VALUE) {
            for (int maxVideoPixelsToRetain = arrayList.size() - 1; maxVideoPixelsToRetain >= 0; maxVideoPixelsToRetain--) {
                int i6 = trackGroup.A01(((Integer) arrayList.get(maxVideoPixelsToRetain)).intValue()).A0E();
                if (i6 == -1 || i6 > i4) {
                    arrayList.remove(maxVideoPixelsToRetain);
                }
            }
        }
        return arrayList;
    }

    public static void A0G(GH gh, int[][][] iArr, C03099o[] c03099oArr, GJ[] gjArr, int i) {
        if (i == 0) {
            return;
        }
        int i2 = -1;
        int i3 = -1;
        boolean z = true;
        int i4 = 0;
        while (true) {
            int tunnelingAudioRendererIndex = gh.A00();
            boolean z2 = true;
            if (i4 >= tunnelingAudioRendererIndex) {
                break;
            }
            int i5 = gh.A01(i4);
            GJ gj = gjArr[i4];
            if ((i5 == 1 || i5 == 2) && gj != null && A0M(iArr[i4], gh.A02(i4), gj)) {
                if (i5 == 1) {
                    if (i2 != -1) {
                        z = false;
                        break;
                    }
                    i2 = i4;
                } else if (i3 != -1) {
                    z = false;
                    break;
                } else {
                    i3 = i4;
                }
            }
            i4++;
        }
        if (z & ((i2 == -1 || i3 == -1) ? false : false)) {
            C03099o c03099o = new C03099o(i);
            c03099oArr[i2] = c03099o;
            c03099oArr[i3] = c03099o;
        }
    }

    public static boolean A0H(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    public static boolean A0I(Format format) {
        return TextUtils.isEmpty(format.A0N) || A0K(format, A0C(0, 3, 97));
    }

    public static boolean A0J(Format format, int i, G9 g9) {
        if (A0H(i, false) && format.A05 == g9.A00 && format.A0C == g9.A01) {
            String str = g9.A02;
            String[] strArr = A03;
            if (strArr[3].length() != strArr[7].length()) {
                A03[4] = "Z4TnxuroRrU42RhZWOmYjmwLcPTU1MVO";
                return str == null || TextUtils.equals(g9.A02, format.A0O);
            }
            throw new RuntimeException();
        }
        return false;
    }

    public static boolean A0K(Format format, @Nullable String str) {
        if (str != null) {
            boolean equals = TextUtils.equals(str, C0499Hs.A0L(format.A0N));
            if (A03[1].charAt(28) != 'F') {
                throw new RuntimeException();
            }
            A03[6] = "X09dGmvImKzkjml92Go2OBGPrO7s8ElS";
            if (equals) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0L(Format format, @Nullable String str, int i, int i2, int i3, int i4, int i5) {
        if (!A0H(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str == null || C0499Hs.A0g(format.A0O, str)) {
            if (format.A0F == -1 || format.A0F <= i3) {
                int i6 = format.A08;
                String[] strArr = A03;
                if (strArr[2].length() != strArr[5].length()) {
                    A03[4] = "SWfcLm8XXzRqeXuobK6MjvAJ3gvDaDv7";
                    if (i6 == -1 || format.A08 <= i4) {
                        return format.A04 == -1 || format.A04 <= i5;
                    }
                    return false;
                }
                throw new RuntimeException();
            }
            return false;
        }
        return false;
    }

    public static boolean A0M(int[][] iArr, TrackGroupArray trackGroupArray, GJ gj) {
        if (gj == null) {
            return false;
        }
        int A00 = trackGroupArray.A00(gj.A7s());
        for (int i = 0; i < gj.length(); i++) {
            int trackGroupIndex = iArr[A00][gj.A6u(i)] & 32;
            if (trackGroupIndex != 32) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Incorrect condition in loop: B:80:0x0088 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] A0N(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup r10, int[] r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.B7.A0N(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup, int[], boolean):int[]");
    }

    public static int[] A0O(TrackGroup trackGroup, int[] iArr, boolean z, int trackIndex, int i, int selectedMimeTypeTrackCount, int trackIndex2, int i2, int i3, boolean z2) {
        int countForMimeType;
        if (trackGroup.A01 >= 2) {
            List<Integer> A0D = A0D(trackGroup, i2, i3, z2);
            if (A0D.size() < 2) {
                return A04;
            }
            String str = null;
            if (!z) {
                HashSet hashSet = new HashSet();
                int selectedMimeTypeTrackCount2 = 0;
                for (int selectedMimeTypeTrackCount3 = 0; selectedMimeTypeTrackCount3 < A0D.size(); selectedMimeTypeTrackCount3++) {
                    String str2 = trackGroup.A01(A0D.get(selectedMimeTypeTrackCount3).intValue()).A0O;
                    if (hashSet.add(str2) && (countForMimeType = A03(trackGroup, iArr, trackIndex, str2, i, selectedMimeTypeTrackCount, trackIndex2, A0D)) > selectedMimeTypeTrackCount2) {
                        str = str2;
                        selectedMimeTypeTrackCount2 = countForMimeType;
                    }
                }
            }
            A0F(trackGroup, iArr, trackIndex, str, i, selectedMimeTypeTrackCount, trackIndex2, A0D);
            return A0D.size() < 2 ? A04 : C0499Hs.A0j(A0D);
        }
        return A04;
    }

    private final GJ[] A0P(GH gh, int[][][] iArr, int[] iArr2, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) throws C9F {
        boolean z;
        int A00 = gh.A00();
        GJ[] gjArr = new GJ[A00];
        boolean seenVideoRendererWithMappedTracks = false;
        boolean z2 = false;
        for (int i = 0; i < A00; i++) {
            if (2 == gh.A01(i)) {
                if (!z2) {
                    z = true;
                    gjArr[i] = A09(gh.A02(i), iArr[i], iArr2[i], defaultTrackSelector$Parameters, this.A00);
                    z2 = gjArr[i] != null;
                } else {
                    z = true;
                }
                if (gh.A02(i).A01 <= 0) {
                    z = false;
                }
                seenVideoRendererWithMappedTracks |= z;
            }
        }
        boolean selectedVideoTracks = false;
        int i2 = 0;
        for (int i3 = 0; i3 < A00; i3++) {
            int A01 = gh.A01(i3);
            if (A01 != 1) {
                if (A01 == 2) {
                    continue;
                } else if (A01 != 3) {
                    gjArr[i3] = A06(A01, gh.A02(i3), iArr[i3], defaultTrackSelector$Parameters);
                } else if (i2 == 0) {
                    TrackGroupArray A022 = gh.A02(i3);
                    int rendererCount = A03[1].charAt(28);
                    if (rendererCount != 70) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A03;
                    strArr[2] = "QJl7DztNVPNycYqDWlGKy9194VAG";
                    strArr[5] = "9kW2zRUIc2UhcVCPTVcu4Y";
                    gjArr[i3] = A0B(A022, iArr[i3], defaultTrackSelector$Parameters);
                    i2 = gjArr[i3] != null ? 1 : 0;
                } else {
                    continue;
                }
            } else if (!selectedVideoTracks) {
                gjArr[i3] = A08(gh.A02(i3), iArr[i3], iArr2[i3], defaultTrackSelector$Parameters, seenVideoRendererWithMappedTracks ? null : this.A00);
                selectedVideoTracks = gjArr[i3] != null;
            }
        }
        return gjArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0081  */
    @Override // com.facebook.ads.redexgen.X.AbstractC0827Ur
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair<com.facebook.ads.redexgen.X.C03099o[], com.facebook.ads.redexgen.X.GJ[]> A0V(com.facebook.ads.redexgen.X.GH r11, int[][][] r12, int[] r13) throws com.facebook.ads.redexgen.X.C9F {
        /*
            r10 = this;
            java.util.concurrent.atomic.AtomicReference<com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters> r0 = r10.A01
            java.lang.Object r6 = r0.get()
            com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters r6 = (com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters) r6
            int r5 = r11.A00()
            com.facebook.ads.redexgen.X.GJ[] r4 = r10.A0P(r11, r12, r13, r6)
            r3 = 0
        L11:
            r9 = 0
            r8 = 0
            r2 = 1
            if (r3 >= r5) goto L61
            boolean r0 = r6.A06(r3)
            if (r0 == 0) goto L21
            r4[r3] = r8
        L1e:
            int r3 = r3 + 1
            goto L11
        L21:
            com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray r1 = r11.A02(r3)
            boolean r0 = r6.A07(r3, r1)
            if (r0 == 0) goto L1e
            com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$SelectionOverride r7 = r6.A05(r3, r1)
            if (r7 != 0) goto L34
            r4[r3] = r8
            goto L1e
        L34:
            int r0 = r7.A01
            if (r0 != r2) goto L4a
            int r0 = r7.A00
            com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup r2 = r1.A01(r0)
            int[] r0 = r7.A02
            r1 = r0[r9]
            com.facebook.ads.redexgen.X.At r0 = new com.facebook.ads.redexgen.X.At
            r0.<init>(r2, r1)
            r4[r3] = r0
            goto L1e
        L4a:
            com.facebook.ads.redexgen.X.GI r0 = r10.A00
            java.lang.Object r2 = com.facebook.ads.redexgen.X.HD.A01(r0)
            com.facebook.ads.redexgen.X.GI r2 = (com.facebook.ads.redexgen.X.GI) r2
            int r0 = r7.A00
            com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup r1 = r1.A01(r0)
            int[] r0 = r7.A02
            com.facebook.ads.redexgen.X.GJ r0 = r2.A4X(r1, r0)
            r4[r3] = r0
            goto L1e
        L61:
            com.facebook.ads.redexgen.X.9o[] r3 = new com.facebook.ads.redexgen.X.C03099o[r5]
            r2 = 0
        L64:
            if (r2 >= r5) goto L85
            boolean r0 = r6.A06(r2)
            if (r0 != 0) goto L83
            int r1 = r11.A01(r2)
            r0 = 5
            if (r1 == r0) goto L77
            r0 = r4[r2]
            if (r0 == 0) goto L83
        L77:
            r0 = 1
        L78:
            if (r0 == 0) goto L81
            com.facebook.ads.redexgen.X.9o r0 = com.facebook.ads.redexgen.X.C03099o.A01
        L7c:
            r3[r2] = r0
            int r2 = r2 + 1
            goto L64
        L81:
            r0 = r8
            goto L7c
        L83:
            r0 = 0
            goto L78
        L85:
            int r0 = r6.A04
            A0G(r11, r12, r3, r4, r0)
            android.util.Pair r0 = android.util.Pair.create(r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.B7.A0V(com.facebook.ads.redexgen.X.GH, int[][][], int[]):android.util.Pair");
    }
}
