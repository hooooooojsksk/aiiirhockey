package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class UY implements GX {
    public static byte[] A07;
    public static String[] A08 = {"CpiOlZ", "ukFexlYSIMwQqH0UvFPWGqG0YthdqpHq", "2yw2Gs2GC2jxZI0Hgcr1UjVZgWf7BNvx", "7SwPVGS0jIrCQlvIcpAA6U9bhm4jPR5r", "7pQ8HXcSNS6Xqd33VYljkiTEbCcLAkDq", "kKrkJSZnynA87WgMdnYScFfJH7qszUrQ", "lo5", "kH5jcAc5XMYXCXQVRoC"};
    public long A00;
    public AssetFileDescriptor A01;
    public Uri A02;
    public InputStream A03;
    public boolean A04;
    public final Resources A05;
    @Nullable
    public final InterfaceC0474Gt<? super UY> A06;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 71);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{-9, 10, 24, 20, 26, 23, 8, 10, -59, 14, 9, 10, 19, 25, 14, 11, 14, 10, 23, -59, 18, 26, 24, 25, -59, 7, 10, -59, 6, 19, -59, 14, 19, 25, 10, 12, 10, 23, -45, 5, 2, -7, -48, 29, 37, 35, 36, -48, 37, 35, 21, -48, 35, 19, 24, 21, 29, 21, -48, 34, 17, 39, 34, 21, 35, 31, 37, 34, 19, 21, 36, 19, 41, 36, 23, 37, 33, 39, 36, 21, 23};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.GX
    public final long ADF(C0458Gb c0458Gb) throws C0473Gs {
        try {
            this.A02 = c0458Gb.A04;
            if (TextUtils.equals(A00(70, 11, 107), this.A02.getScheme())) {
                try {
                    this.A01 = this.A05.openRawResourceFd(Integer.parseInt(this.A02.getLastPathSegment()));
                    this.A03 = new FileInputStream(this.A01.getFileDescriptor());
                    this.A03.skip(this.A01.getStartOffset());
                    if (this.A03.skip(c0458Gb.A03) >= c0458Gb.A03) {
                        if (c0458Gb.A02 != -1) {
                            this.A00 = c0458Gb.A02;
                        } else {
                            long length = this.A01.getLength();
                            this.A00 = length != -1 ? length - c0458Gb.A03 : -1L;
                        }
                        this.A04 = true;
                        InterfaceC0474Gt<? super UY> interfaceC0474Gt = this.A06;
                        if (interfaceC0474Gt != null) {
                            interfaceC0474Gt.ACq(this, c0458Gb);
                        }
                        return this.A00;
                    }
                    throw new EOFException();
                } catch (NumberFormatException unused) {
                    throw new C0473Gs(A00(0, 39, 94));
                }
            }
            throw new C0473Gs(A00(39, 31, 105));
        } catch (IOException e) {
            throw new C0473Gs(e);
        }
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gt != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.RawResourceDataSource> */
    public UY(Context context, @Nullable InterfaceC0474Gt<? super UY> interfaceC0474Gt) {
        this.A05 = context.getResources();
        this.A06 = interfaceC0474Gt;
    }

    @Override // com.facebook.ads.redexgen.X.GX
    public final Uri A7w() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.GX
    public final void close() throws C0473Gs {
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
                    } finally {
                        this.A01 = null;
                        if (this.A04) {
                            this.A04 = false;
                            InterfaceC0474Gt<? super UY> interfaceC0474Gt = this.A06;
                            if (interfaceC0474Gt != null) {
                                interfaceC0474Gt.ACp(this);
                            }
                        }
                    }
                } catch (IOException e) {
                    throw new C0473Gs(e);
                }
            } catch (IOException e2) {
                throw new C0473Gs(e2);
            }
        } catch (Throwable th) {
            this.A03 = null;
            try {
                try {
                    if (this.A01 != null) {
                        this.A01.close();
                    }
                    this.A01 = null;
                    if (this.A04) {
                        this.A04 = false;
                        InterfaceC0474Gt<? super UY> interfaceC0474Gt2 = this.A06;
                        if (interfaceC0474Gt2 != null) {
                            interfaceC0474Gt2.ACp(this);
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    this.A01 = null;
                    if (this.A04) {
                        this.A04 = false;
                        if (A08[2].charAt(29) == 'a') {
                            throw new RuntimeException();
                        }
                        A08[2] = "1dLzNM8YJghYPUE3el087nYOwU1DEDce";
                        InterfaceC0474Gt<? super UY> interfaceC0474Gt3 = this.A06;
                        if (interfaceC0474Gt3 != null) {
                            interfaceC0474Gt3.ACp(this);
                        }
                    }
                    throw th2;
                }
            } catch (IOException e3) {
                throw new C0473Gs(e3);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.GX
    public final int read(byte[] bArr, int i, int i2) throws C0473Gs {
        if (i2 == 0) {
            return 0;
        }
        long j = this.A00;
        if (A08[3].charAt(24) != 'w') {
            A08[0] = "oumASG";
            if (j == 0) {
                return -1;
            }
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new C0473Gs(e);
                }
            }
            int read = this.A03.read(bArr, i, i2);
            if (read == -1) {
                int bytesRead = (this.A00 > (-1L) ? 1 : (this.A00 == (-1L) ? 0 : -1));
                if (bytesRead == 0) {
                    return -1;
                }
                throw new C0473Gs(new EOFException());
            }
            long j2 = this.A00;
            int bytesRead2 = (j2 > (-1L) ? 1 : (j2 == (-1L) ? 0 : -1));
            if (bytesRead2 != 0) {
                this.A00 = j2 - read;
            }
            InterfaceC0474Gt<? super UY> interfaceC0474Gt = this.A06;
            if (interfaceC0474Gt != null) {
                interfaceC0474Gt.AAS(this, read);
            }
            return read;
        }
        throw new RuntimeException();
    }
}
