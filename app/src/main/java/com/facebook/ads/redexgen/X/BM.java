package com.facebook.ads.redexgen.X;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import com.facebook.ads.redexgen.X.BG;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public interface BM<T extends BG> {
    void closeSession(byte[] bArr);

    T createMediaCrypto(byte[] bArr) throws MediaCryptoException;

    BH getKeyRequest(byte[] bArr, byte[] bArr2, String str, int i, HashMap<String, String> hashMap) throws NotProvisionedException;

    BL getProvisionRequest();

    byte[] openSession() throws MediaDrmException;

    byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException;

    void provideProvisionResponse(byte[] bArr) throws DeniedByServerException;

    Map<String, String> queryKeyStatus(byte[] bArr);

    void restoreKeys(byte[] bArr, byte[] bArr2);
}
