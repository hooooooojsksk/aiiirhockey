package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import cz.msebera.android.httpclient.HttpStatus;

/* loaded from: classes.dex */
public final class a {
    public static final int[] a = {1, 2, 3, 6};
    public static final int[] b = {48000, 44100, 32000};
    public static final int[] c = {24000, 22050, 16000};
    public static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, HttpStatus.SC_EXPECTATION_FAILED, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int a(int i, int i2) {
        int i3 = i2 / 2;
        if (i >= 0) {
            int[] iArr = b;
            if (i >= iArr.length || i2 < 0) {
                return -1;
            }
            int[] iArr2 = f;
            if (i3 >= iArr2.length) {
                return -1;
            }
            int i4 = iArr[i];
            if (i4 == 44100) {
                return (iArr2[i3] + (i2 % 2)) * 2;
            }
            int i5 = e[i3];
            return i4 == 32000 ? i5 * 6 : i5 * 4;
        }
        return -1;
    }
}
