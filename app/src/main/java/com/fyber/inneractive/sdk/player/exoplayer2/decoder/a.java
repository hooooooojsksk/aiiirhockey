package com.fyber.inneractive.sdk.player.exoplayer2.decoder;

import android.media.MediaCodec;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;

/* loaded from: classes.dex */
public final class a {
    public byte[] a;
    public byte[] b;
    public int c;
    public int[] d;
    public int[] e;
    public int f;
    public final MediaCodec.CryptoInfo g;
    public final b h;

    /* loaded from: classes.dex */
    public static final class b {
        public final MediaCodec.CryptoInfo a;
        public final MediaCodec.CryptoInfo.Pattern b;

        public b(MediaCodec.CryptoInfo cryptoInfo) {
            this.a = cryptoInfo;
            this.b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    public a() {
        int i = u.a;
        MediaCodec.CryptoInfo a = i >= 16 ? a() : null;
        this.g = a;
        this.h = i >= 24 ? new b(a) : null;
    }

    public final MediaCodec.CryptoInfo a() {
        return new MediaCodec.CryptoInfo();
    }
}
