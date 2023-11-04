package com.facebook.ads.redexgen.X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Up */
/* loaded from: assets/audience_network.dex */
public final class C0825Up implements GX {
    public static byte[] A07;
    public static String[] A08 = {"LByWpbEPJA", "7zBd1gTQe", "KuygTrv8nulqhNSWOngA1uKtSEuZHgRN", "Njgdt1gsnhQwK4o", "BeNPg2roj36bAWsP0", "RQRmVWofVgKwOSOG8v2k1lAFTXU782LE", "P3wGsXlJvJ2cmEHDxz1oaqJg", "cQN91p4HTGgxD32"};
    public long A00;
    public AssetFileDescriptor A01;
    public Uri A02;
    public FileInputStream A03;
    public boolean A04;
    public final ContentResolver A05;
    @Nullable
    public final InterfaceC0474Gt<? super C0825Up> A06;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 104);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{77, airhockey.J_SDKVER, 123, airhockey.J_NATION, airhockey.J_GAME_EXIT, 46, 96, airhockey.J_SDKVER, airhockey.J_PURCHASE, 46, airhockey.J_SDKVER, 126, airhockey.J_GAME_ENEMYEXIT, 96, 46, airhockey.J_ENEMYLOSE, airhockey.J_ENEMYWIN, airhockey.J_NATION, airhockey.J_GAME_ENEMYEXIT, 46, airhockey.J_GAME_EXIT, airhockey.J_GAME_ENEMYEXIT, 125, 109, 124, airhockey.J_ENEMYWIN, 126, airhockey.J_PURCHASE, airhockey.J_SDKVER, 124, 46, airhockey.J_ENEMYLOSE, airhockey.J_SDKVER, 124, 52, 46, 88};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.GX
    public final long ADF(C0458Gb c0458Gb) throws GT {
        try {
            this.A02 = c0458Gb.A04;
            this.A01 = this.A05.openAssetFileDescriptor(this.A02, A00(36, 1, 66));
            if (this.A01 == null) {
                throw new FileNotFoundException(A00(0, 36, 102) + this.A02);
            }
            this.A03 = new FileInputStream(this.A01.getFileDescriptor());
            long startOffset = this.A01.getStartOffset();
            long skip = this.A03.skip(c0458Gb.A03 + startOffset) - startOffset;
            if (skip == c0458Gb.A03) {
                if (c0458Gb.A02 != -1) {
                    this.A00 = c0458Gb.A02;
                } else {
                    long length = this.A01.getLength();
                    if (length == -1) {
                        FileChannel channel = this.A03.getChannel();
                        long size = channel.size();
                        int i = (size > 0L ? 1 : (size == 0L ? 0 : -1));
                        String[] strArr = A08;
                        if (strArr[1].length() == strArr[6].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A08;
                        strArr2[2] = "ZOfHAmAWJX5pJEi0XoTa1dVVgOd6YLFw";
                        strArr2[5] = "BNJV7CO85XsTSUaaCroG1RkXqOi2MRrB";
                        this.A00 = i != 0 ? size - channel.position() : -1L;
                    } else {
                        this.A00 = length - skip;
                    }
                }
                this.A04 = true;
                InterfaceC0474Gt<? super C0825Up> interfaceC0474Gt = this.A06;
                if (interfaceC0474Gt != null) {
                    interfaceC0474Gt.ACq(this, c0458Gb);
                }
                long j = this.A00;
                if (A08[0].length() != 5) {
                    String[] strArr3 = A08;
                    strArr3[3] = "IKalqeLjsOflQFE";
                    strArr3[7] = "C5G7QeDxBPO4Ary";
                    return j;
                }
                String[] strArr4 = A08;
                strArr4[2] = "A9FAyXx7k0lAX5DuMe4j1tS27D7mdYx1";
                strArr4[5] = "pxFzzQ5AhelwxeRCwadh1867RUZAq25p";
                return j;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new GT(e);
        }
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gt != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.ContentDataSource> */
    public C0825Up(Context context, @Nullable InterfaceC0474Gt<? super C0825Up> interfaceC0474Gt) {
        this.A05 = context.getContentResolver();
        this.A06 = interfaceC0474Gt;
    }

    @Override // com.facebook.ads.redexgen.X.GX
    public final Uri A7w() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.GX
    public final void close() throws GT {
        this.A02 = null;
        try {
            try {
                if (this.A03 != null) {
                    this.A03.close();
                }
                this.A03 = null;
                try {
                    try {
                        if (this.A01 != null) {
                            this.A01.close();
                        }
                    } catch (Throwable th) {
                        this.A01 = null;
                        if (this.A04) {
                            this.A04 = false;
                            String[] strArr = A08;
                            if (strArr[1].length() == strArr[6].length()) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A08;
                            strArr2[3] = "xSjl0idHJGlCsN8";
                            strArr2[7] = "4SXmw99RUzO7uRO";
                            InterfaceC0474Gt<? super C0825Up> interfaceC0474Gt = this.A06;
                            if (interfaceC0474Gt != null) {
                                interfaceC0474Gt.ACp(this);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    throw new GT(e);
                }
            } catch (IOException e2) {
                throw new GT(e2);
            }
        } catch (Throwable th2) {
            this.A03 = null;
            try {
                try {
                    if (this.A01 != null) {
                        this.A01.close();
                    }
                    this.A01 = null;
                    if (this.A04) {
                        this.A04 = false;
                        InterfaceC0474Gt<? super C0825Up> interfaceC0474Gt2 = this.A06;
                        if (interfaceC0474Gt2 != null) {
                            interfaceC0474Gt2.ACp(this);
                        }
                    }
                    throw th2;
                } finally {
                    this.A01 = null;
                    if (this.A04) {
                        this.A04 = false;
                        InterfaceC0474Gt<? super C0825Up> interfaceC0474Gt3 = this.A06;
                        if (interfaceC0474Gt3 != null) {
                            interfaceC0474Gt3.ACp(this);
                        }
                    }
                }
            } catch (IOException e3) {
                throw new GT(e3);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x006b, code lost:
        if (r0 != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x006d, code lost:
        r8.A00 = r4 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0071, code lost:
        r4 = r8.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x007e, code lost:
        if (com.facebook.ads.redexgen.X.C0825Up.A08[4].length() == 17) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0080, code lost:
        com.facebook.ads.redexgen.X.C0825Up.A08[0] = "Oz3XLfSc2A979xkKdF0NMgeVRm8";
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0087, code lost:
        if (r4 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0089, code lost:
        r4.AAS(r8, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x008c, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x008d, code lost:
        r2 = com.facebook.ads.redexgen.X.C0825Up.A08;
        r2[1] = "uqZ1tM2xm";
        r2[6] = "4bkl7P4p23vj4jNsoeIfag2n";
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0099, code lost:
        if (r4 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x009e, code lost:
        if (r0 != 0) goto L30;
     */
    @Override // com.facebook.ads.redexgen.X.GX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int read(byte[] r9, int r10, int r11) throws com.facebook.ads.redexgen.X.GT {
        /*
            r8 = this;
            if (r11 != 0) goto L4
            r0 = 0
            return r0
        L4:
            long r0 = r8.A00
            r3 = 0
            r5 = -1
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto Le
            return r5
        Le:
            r6 = -1
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 != 0) goto L15
            goto L1b
        L15:
            long r2 = (long) r11
            long r0 = java.lang.Math.min(r0, r2)     // Catch: java.io.IOException -> La1
            int r11 = (int) r0     // Catch: java.io.IOException -> La1
        L1b:
            java.io.FileInputStream r0 = r8.A03     // Catch: java.io.IOException -> La1
            int r3 = r0.read(r9, r10, r11)     // Catch: java.io.IOException -> La1
            if (r3 != r5) goto L54
            long r3 = r8.A00
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0825Up.A08
            r0 = 3
            r1 = r2[r0]
            r0 = 7
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L3d
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L3d:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0825Up.A08
            java.lang.String r1 = "iixlGiSV2y9Sj4FhSzJ8n8KndyylS"
            r0 = 0
            r2[r0] = r1
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 != 0) goto L49
            return r5
        L49:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            com.facebook.ads.redexgen.X.GT r0 = new com.facebook.ads.redexgen.X.GT
            r0.<init>(r1)
            throw r0
        L54:
            long r4 = r8.A00
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C0825Up.A08
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 5
            if (r1 == r0) goto L9c
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0825Up.A08
            java.lang.String r1 = "YPxf1aEs9O2Lc7g4LGclNCu"
            r0 = 0
            r2[r0] = r1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L71
        L6d:
            long r0 = (long) r3
            long r4 = r4 - r0
            r8.A00 = r4
        L71:
            com.facebook.ads.redexgen.X.Gt<? super com.facebook.ads.redexgen.X.Up> r4 = r8.A06
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C0825Up.A08
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 17
            if (r1 == r0) goto L8d
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0825Up.A08
            java.lang.String r1 = "Oz3XLfSc2A979xkKdF0NMgeVRm8"
            r0 = 0
            r2[r0] = r1
            if (r4 == 0) goto L8c
        L89:
            r4.AAS(r8, r3)
        L8c:
            return r3
        L8d:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0825Up.A08
            java.lang.String r1 = "uqZ1tM2xm"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "4bkl7P4p23vj4jNsoeIfag2n"
            r0 = 6
            r2[r0] = r1
            if (r4 == 0) goto L8c
            goto L89
        L9c:
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L71
            goto L6d
        La1:
            r1 = move-exception
            com.facebook.ads.redexgen.X.GT r0 = new com.facebook.ads.redexgen.X.GT
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0825Up.read(byte[], int, int):int");
    }
}
