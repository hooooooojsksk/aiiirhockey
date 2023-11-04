package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: assets/audience_network.dex */
public interface AE {
    public static final ByteBuffer A00 = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    boolean A4A(int i, int i2, int i3) throws AD;

    ByteBuffer A7D();

    int A7E();

    int A7F();

    int A7G();

    boolean A8c();

    boolean A8h();

    void ADm();

    void ADn(ByteBuffer byteBuffer);

    void flush();

    void reset();
}
