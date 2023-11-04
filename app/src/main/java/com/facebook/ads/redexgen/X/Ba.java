package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class Ba {
    public final C0483Hc A00 = new C0483Hc(10);

    @Nullable
    public final Metadata A00(BW bw, @Nullable DL dl) throws IOException, InterruptedException {
        int tagLength = 0;
        Metadata metadata = null;
        while (true) {
            try {
                bw.ADP(this.A00.A00, 0, 10);
                this.A00.A0Y(0);
                int A0G = this.A00.A0G();
                int peekedId3Bytes = VO.A03;
                if (A0G != peekedId3Bytes) {
                    break;
                }
                this.A00.A0Z(3);
                int A0D = this.A00.A0D();
                int framesLength = A0D + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[framesLength];
                    System.arraycopy(this.A00.A00, 0, bArr, 0, 10);
                    bw.ADP(bArr, 10, A0D);
                    metadata = new VO(dl).A0O(bArr, framesLength);
                } else {
                    bw.A3L(A0D);
                }
                tagLength += framesLength;
            } catch (EOFException unused) {
            }
        }
        bw.AES();
        bw.A3L(tagLength);
        return metadata;
    }
}
