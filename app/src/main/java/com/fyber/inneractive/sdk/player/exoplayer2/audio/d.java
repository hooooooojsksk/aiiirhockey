package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.fyber.inneractive.sdk.player.exoplayer2.audio.b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d implements b {
    public int b;
    public int c;
    public int[] d;
    public boolean e;
    public int[] f;
    public ByteBuffer g;
    public ByteBuffer h;
    public boolean i;

    public d() {
        ByteBuffer byteBuffer = b.a;
        this.g = byteBuffer;
        this.h = byteBuffer;
        this.b = -1;
        this.c = -1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public boolean a(int i, int i2, int i3) throws b.a {
        boolean z = !Arrays.equals(this.d, this.f);
        int[] iArr = this.d;
        this.f = iArr;
        if (iArr == null) {
            this.e = false;
            return z;
        } else if (i3 == 2) {
            if (!z && this.c == i && this.b == i2) {
                return false;
            }
            this.c = i;
            this.b = i2;
            this.e = i2 != iArr.length;
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.f;
                if (i4 >= iArr2.length) {
                    return true;
                }
                int i5 = iArr2[i4];
                if (i5 < i2) {
                    this.e = (i5 != i4) | this.e;
                    i4++;
                } else {
                    throw new b.a(i, i2, i3);
                }
            }
        } else {
            throw new b.a(i, i2, i3);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public boolean b() {
        return this.i && this.h == b.a;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public void c() {
        this.i = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public boolean d() {
        return this.e;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public int e() {
        return 2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public int f() {
        int[] iArr = this.f;
        return iArr == null ? this.b : iArr.length;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public void flush() {
        this.h = b.a;
        this.i = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public void g() {
        flush();
        this.g = b.a;
        this.b = -1;
        this.c = -1;
        this.f = null;
        this.e = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = ((limit - position) / (this.b * 2)) * this.f.length * 2;
        if (this.g.capacity() < length) {
            this.g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.g.clear();
        }
        while (position < limit) {
            for (int i : this.f) {
                this.g.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.b * 2;
        }
        byteBuffer.position(limit);
        this.g.flip();
        this.h = this.g;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.h;
        this.h = b.a;
        return byteBuffer;
    }
}
