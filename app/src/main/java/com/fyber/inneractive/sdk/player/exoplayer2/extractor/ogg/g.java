package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import com.loopj.android.http.AsyncHttpClient;
import com.mobirix.airhockey.airhockey;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class g extends h {
    public static final int o = u.a("Opus");
    public static final byte[] p = {79, airhockey.J_GOO, airhockey.J_ERROR, airhockey.J_SAVEDGAME_SAVE, airhockey.P_GAME_MYLOSE, airhockey.J_GAME_STANDBY, airhockey.J_SDKVER, airhockey.J_ONREWARDED};
    public boolean n;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public void a(boolean z) {
        super.a(z);
        if (z) {
            this.n = false;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public long a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar) {
        byte[] bArr = kVar.a;
        int i = bArr[0] & UByte.MAX_VALUE;
        int i2 = i & 3;
        int i3 = 2;
        if (i2 == 0) {
            i3 = 1;
        } else if (i2 != 1 && i2 != 2) {
            i3 = bArr[1] & 63;
        }
        int i4 = i >> 3;
        int i5 = i4 & 3;
        return a(i3 * (i4 >= 16 ? 2500 << i5 : i4 >= 12 ? AsyncHttpClient.DEFAULT_SOCKET_TIMEOUT << (i5 & 1) : i5 == 3 ? 60000 : AsyncHttpClient.DEFAULT_SOCKET_TIMEOUT << i5));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, long j, h.a aVar) throws IOException, InterruptedException {
        if (!this.n) {
            byte[] copyOf = Arrays.copyOf(kVar.a, kVar.c);
            int i = copyOf[9] & UByte.MAX_VALUE;
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(copyOf);
            a(arrayList, ((copyOf[11] & 255) << 8) | (copyOf[10] & 255));
            a(arrayList, 3840);
            aVar.a = com.fyber.inneractive.sdk.player.exoplayer2.i.a((String) null, "audio/opus", (String) null, -1, -1, i, 48000, -1, arrayList, (com.fyber.inneractive.sdk.player.exoplayer2.drm.a) null, 0, (String) null);
            this.n = true;
            return true;
        }
        boolean z = kVar.c() == o;
        kVar.e(0);
        return z;
    }

    public final void a(List<byte[]> list, int i) {
        list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((i * 1000000000) / 48000).array());
    }
}
