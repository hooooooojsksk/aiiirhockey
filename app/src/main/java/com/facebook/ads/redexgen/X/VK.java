package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import java.io.DataInputStream;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public class VK extends DownloadAction.Deserializer {
    public VK(String str, int i) {
        super(str, i);
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction.Deserializer
    /* renamed from: A00 */
    public final VJ A01(int i, DataInputStream dataInputStream) throws IOException {
        Uri parse = Uri.parse(dataInputStream.readUTF());
        boolean readBoolean = dataInputStream.readBoolean();
        byte[] bArr = new byte[dataInputStream.readInt()];
        dataInputStream.readFully(bArr);
        return new VJ(parse, readBoolean, bArr, dataInputStream.readBoolean() ? dataInputStream.readUTF() : null);
    }
}
