package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.facebook.ads.internal.exoplayer2.thirdparty.extractor.ts.TsPayloadReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Va */
/* loaded from: assets/audience_network.dex */
public class C0836Va implements InterfaceC0370Cj {
    public static String[] A05 = {"ZoOhGYHP8SNfCMTpI8hB8esJvCxQNk4a", "iCY0vtQk2BMTn8YKksXnllwhxYcEMWPa", "FRJmrfeKqiG8dvU06WzW6", "wyGcQq4l", "", "l2", "ODNaIWitniiqKmZchEPotBtPtmPon6SS", "r1S7VBlY5d2QYAsiLWImTDUS2fBhu4wR"};
    public final int A00;
    public final /* synthetic */ VZ A04;
    public final C0482Hb A03 = new C0482Hb(new byte[5]);
    public final SparseArray<InterfaceC0376Cq> A01 = new SparseArray<>();
    public final SparseIntArray A02 = new SparseIntArray();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:147:0x015c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x009d  */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0370Cj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A4B(com.facebook.ads.redexgen.X.C0483Hc r14) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0836Va.A4B(com.facebook.ads.redexgen.X.Hc):void");
    }

    public C0836Va(VZ vz, int i) {
        this.A04 = vz;
        this.A00 = i;
    }

    private C0373Cn A00(C0483Hc c0483Hc, int i) {
        long j;
        long j2;
        long j3;
        int A06 = c0483Hc.A06();
        int i2 = A06 + i;
        int descriptorLength = -1;
        String str = null;
        List<TsPayloadReader.DvbSubtitleInfo> dvbSubtitleInfos = null;
        while (c0483Hc.A06() < i2) {
            int descriptorsStartPosition = c0483Hc.A0E();
            int A062 = c0483Hc.A06() + c0483Hc.A0E();
            if (descriptorsStartPosition == 5) {
                long A0M = c0483Hc.A0M();
                j = VZ.A0F;
                if (A0M != j) {
                    j2 = VZ.A0G;
                    if (A05[0].charAt(13) == 108) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A05;
                    strArr[5] = "OX";
                    strArr[4] = "";
                    if (A0M != j2) {
                        j3 = VZ.A0H;
                        if (A0M == j3) {
                            descriptorLength = 36;
                        }
                    } else {
                        descriptorLength = 135;
                    }
                } else {
                    descriptorLength = 129;
                }
            } else if (descriptorsStartPosition == 106) {
                descriptorLength = 129;
            } else if (descriptorsStartPosition == 122) {
                descriptorLength = 135;
            } else if (descriptorsStartPosition == 123) {
                descriptorLength = 138;
            } else if (descriptorsStartPosition == 10) {
                str = c0483Hc.A0S(3).trim();
            } else if (descriptorsStartPosition == 89) {
                descriptorLength = 89;
                dvbSubtitleInfos = new ArrayList<>();
                while (c0483Hc.A06() < A062) {
                    String language = c0483Hc.A0S(3).trim();
                    int streamType = c0483Hc.A0E();
                    byte[] bArr = new byte[4];
                    c0483Hc.A0c(bArr, 0, 4);
                    dvbSubtitleInfos.add(new C0372Cm(language, streamType, bArr));
                }
            }
            c0483Hc.A0Z(A062 - c0483Hc.A06());
        }
        c0483Hc.A0Y(i2);
        return new C0373Cn(descriptorLength, str, dvbSubtitleInfos, Arrays.copyOfRange(c0483Hc.A00, A06, i2));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0370Cj
    public final void A8X(C0495Ho c0495Ho, BX bx, C0375Cp c0375Cp) {
    }
}
