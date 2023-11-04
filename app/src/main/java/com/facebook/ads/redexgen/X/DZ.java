package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: assets/audience_network.dex */
public final class DZ {
    public static byte[] A02;
    public final HF A00;
    public final File A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 44);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-101, -76, -71, -69, -74, -74, -75, -72, -70, -85, -86, 102, -89, -87, -70, -81, -75, -76, 102, -84, -81, -78, -85, 102, -68, -85, -72, -71, -81, -75, -76, ByteCompanionObject.MIN_VALUE, 102};
    }

    public DZ(File file) {
        this.A01 = file;
        this.A00 = new HF(file);
    }

    public final void A02(DownloadAction... downloadActionArr) throws IOException {
        DataOutputStream dataOutputStream = null;
        try {
            dataOutputStream = new DataOutputStream(this.A00.A04());
            dataOutputStream.writeInt(0);
            dataOutputStream.writeInt(downloadActionArr.length);
            for (DownloadAction downloadAction : downloadActionArr) {
                DownloadAction.A03(downloadAction, dataOutputStream);
            }
            this.A00.A06(dataOutputStream);
            C0499Hs.A0X(null);
        } catch (Throwable th) {
            C0499Hs.A0X(dataOutputStream);
            throw th;
        }
    }

    public final DownloadAction[] A03(DownloadAction.Deserializer... deserializerArr) throws IOException {
        if (!this.A01.exists()) {
            return new DownloadAction[0];
        }
        try {
            InputStream A03 = this.A00.A03();
            DataInputStream dataInputStream = new DataInputStream(A03);
            int readInt = dataInputStream.readInt();
            if (readInt <= 0) {
                int actionCount = dataInputStream.readInt();
                DownloadAction[] downloadActionArr = new DownloadAction[actionCount];
                for (int i = 0; i < actionCount; i++) {
                    downloadActionArr[i] = DownloadAction.A00(deserializerArr, dataInputStream);
                }
                C0499Hs.A0X(A03);
                return downloadActionArr;
            }
            throw new IOException(A00(0, 33, 26) + readInt);
        } catch (Throwable th) {
            C0499Hs.A0X(null);
            throw th;
        }
    }
}
