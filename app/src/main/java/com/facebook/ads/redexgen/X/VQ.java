package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class VQ implements D9 {
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.D9
    public final Metadata A4k(C0381Cx c0381Cx) {
        ByteBuffer byteBuffer = c0381Cx.A01;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        C0483Hc c0483Hc = new C0483Hc(array, limit);
        String A0Q = c0483Hc.A0Q();
        String A0Q2 = c0483Hc.A0Q();
        long A0M = c0483Hc.A0M();
        return new Metadata(new EventMessage(A0Q, A0Q2, C0499Hs.A0F(c0483Hc.A0M(), 1000L, A0M), c0483Hc.A0M(), Arrays.copyOfRange(array, c0483Hc.A06(), limit), C0499Hs.A0F(c0483Hc.A0M(), 1000000L, A0M)));
    }
}
