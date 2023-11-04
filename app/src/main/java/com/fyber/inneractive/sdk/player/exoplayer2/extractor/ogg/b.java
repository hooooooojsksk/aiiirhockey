package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes.dex */
public final class b extends h {
    public com.fyber.inneractive.sdk.player.exoplayer2.util.e n;
    public a o;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public void a(boolean z) {
        super.a(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }

    /* loaded from: classes.dex */
    public class a implements f, m {
        public long[] a;
        public long[] b;
        public long c = -1;
        public long d = -1;

        public a() {
            b.this = r3;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.f
        public long a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar) throws IOException, InterruptedException {
            long j = this.d;
            if (j >= 0) {
                long j2 = -(j + 2);
                this.d = -1L;
                return j2;
            }
            return -1L;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
        public boolean a() {
            return true;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.f
        public m b() {
            return this;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.f
        public long c(long j) {
            long j2 = (b.this.i * j) / 1000000;
            this.d = this.a[u.b(this.a, j2, true, true)];
            return j2;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
        public long a(long j) {
            return this.c + this.b[u.b(this.a, (b.this.i * j) / 1000000, true, true)];
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
        public long c() {
            com.fyber.inneractive.sdk.player.exoplayer2.util.e eVar = b.this.n;
            return (eVar.d * 1000000) / eVar.a;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public long a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar) {
        int i;
        int i2;
        int i3;
        byte b;
        int i4;
        byte[] bArr = kVar.a;
        int i5 = -1;
        if (bArr[0] == -1) {
            int i6 = (bArr[2] & UByte.MAX_VALUE) >> 4;
            switch (i6) {
                case 1:
                    i5 = 192;
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                    i = i6 - 2;
                    i2 = 576;
                    i5 = i2 << i;
                    break;
                case 6:
                case 7:
                    kVar.f(4);
                    long j = kVar.a[kVar.b];
                    int i7 = 7;
                    while (true) {
                        if (i7 >= 0) {
                            if (((1 << i7) & j) != 0) {
                                i7--;
                            } else if (i7 < 6) {
                                j &= i4 - 1;
                                i3 = 7 - i7;
                            } else if (i7 == 7) {
                                i3 = 1;
                            }
                        }
                    }
                    i3 = 0;
                    if (i3 != 0) {
                        for (int i8 = 1; i8 < i3; i8++) {
                            if ((kVar.a[kVar.b + i8] & 192) != 128) {
                                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
                            }
                            j = (j << 6) | (b & 63);
                        }
                        kVar.b += i3;
                        int l = i6 == 6 ? kVar.l() : kVar.q();
                        kVar.e(0);
                        i5 = l + 1;
                        break;
                    } else {
                        throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
                    }
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    i = i6 - 8;
                    i2 = 256;
                    i5 = i2 << i;
                    break;
            }
            return i5;
        }
        return -1L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, long j, h.a aVar) throws IOException, InterruptedException {
        byte[] bArr = kVar.a;
        if (this.n == null) {
            this.n = new com.fyber.inneractive.sdk.player.exoplayer2.util.e(bArr, 17);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 9, kVar.c);
            copyOfRange[4] = ByteCompanionObject.MIN_VALUE;
            List singletonList = Collections.singletonList(copyOfRange);
            com.fyber.inneractive.sdk.player.exoplayer2.util.e eVar = this.n;
            int i = eVar.c;
            int i2 = eVar.a;
            aVar.a = com.fyber.inneractive.sdk.player.exoplayer2.i.a((String) null, "audio/flac", (String) null, -1, i * i2, eVar.b, i2, -1, singletonList, (com.fyber.inneractive.sdk.player.exoplayer2.drm.a) null, 0, (String) null);
        } else {
            if ((bArr[0] & ByteCompanionObject.MAX_VALUE) == 3) {
                a aVar2 = new a();
                this.o = aVar2;
                kVar.f(1);
                int n = kVar.n() / 18;
                aVar2.a = new long[n];
                aVar2.b = new long[n];
                for (int i3 = 0; i3 < n; i3++) {
                    aVar2.a[i3] = kVar.i();
                    aVar2.b[i3] = kVar.i();
                    kVar.f(2);
                }
            } else if (bArr[0] == -1) {
                a aVar3 = this.o;
                if (aVar3 != null) {
                    aVar3.c = j;
                    aVar.b = aVar3;
                }
                return false;
            }
        }
        return true;
    }
}
