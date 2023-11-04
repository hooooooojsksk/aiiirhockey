package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.C0483Hc;
import com.facebook.ads.redexgen.X.C0495Ho;
import com.facebook.ads.redexgen.X.DS;
import com.facebook.ads.redexgen.X.DT;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static String[] A0D = {"rwcuqOJ6EdQ67q2Mv0J2HHeiL", "WP4j4wUrwc9dHeO22M7i1JH5Vq97obJg", "mJZdPTUXLZu74", "VLU2rxkJGeQdQarAjhhUo7gMPCvQOQS9", "TorhhvAEpNk7fEbKtUMeNjy7yeYkErzW", "2cgHesvtXq3tKj0PCMbQTWS3l1m9KzOv", "jB5ZWs0uqsLPN", "ipEqGNR1nINtqeP5fHPEDulQW"};
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new DS();
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final List<DT> A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public SpliceInsertCommand(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<DT> list, boolean z5, long j4, int i, int i2, int i3) {
        this.A06 = j;
        this.A0B = z;
        this.A09 = z2;
        this.A0A = z3;
        this.A0C = z4;
        this.A05 = j2;
        this.A04 = j3;
        this.A07 = Collections.unmodifiableList(list);
        this.A08 = z5;
        this.A03 = j4;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.A06 = parcel.readLong();
        this.A0B = parcel.readByte() == 1;
        this.A09 = parcel.readByte() == 1;
        this.A0A = parcel.readByte() == 1;
        this.A0C = parcel.readByte() == 1;
        this.A05 = parcel.readLong();
        this.A04 = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(DT.A00(parcel));
        }
        this.A07 = Collections.unmodifiableList(arrayList);
        int componentSpliceListSize = parcel.readByte();
        this.A08 = componentSpliceListSize == 1;
        this.A03 = parcel.readLong();
        int componentSpliceListSize2 = parcel.readInt();
        this.A02 = componentSpliceListSize2;
        int componentSpliceListSize3 = parcel.readInt();
        this.A00 = componentSpliceListSize3;
        int componentSpliceListSize4 = parcel.readInt();
        this.A01 = componentSpliceListSize4;
    }

    public /* synthetic */ SpliceInsertCommand(Parcel parcel, DS ds) {
        this(parcel);
    }

    public static SpliceInsertCommand A00(C0483Hc c0483Hc, long j, C0495Ho c0495Ho) {
        long A0M = c0483Hc.A0M();
        boolean z = (c0483Hc.A0E() & 128) != 0;
        boolean z2 = false;
        boolean outOfNetworkIndicator = false;
        boolean z3 = false;
        long j2 = -9223372036854775807L;
        List emptyList = Collections.emptyList();
        int availNum = 0;
        int availsExpected = 0;
        int i = 0;
        boolean z4 = false;
        long j3 = -9223372036854775807L;
        if (!z) {
            int A0E = c0483Hc.A0E();
            if (A0D[1].charAt(24) != '7') {
                A0D[4] = "wCIdN9eSc7apWAr1IiSVHk4IDh7dTuFq";
                z2 = (A0E & 128) != 0;
                outOfNetworkIndicator = (A0E & 64) != 0;
                boolean autoReturn = (A0E & 32) != 0;
                z3 = (A0E & 16) != 0;
                if (outOfNetworkIndicator && !z3) {
                    j2 = TimeSignalCommand.A00(c0483Hc, j);
                }
                if (!outOfNetworkIndicator) {
                    int componentCount = c0483Hc.A0E();
                    emptyList = new ArrayList(componentCount);
                    for (int i2 = 0; i2 < componentCount; i2++) {
                        int componentTag = c0483Hc.A0E();
                        long j4 = -9223372036854775807L;
                        if (!z3) {
                            j4 = TimeSignalCommand.A00(c0483Hc, j);
                        }
                        emptyList.add(new DT(componentTag, j4, c0495Ho.A07(j4), null));
                    }
                }
                if (autoReturn) {
                    long A0E2 = c0483Hc.A0E();
                    z4 = (A0E2 & 128) != 0;
                    j3 = (1000 * (((A0E2 & 1) << 32) | c0483Hc.A0M())) / 90;
                }
                availNum = c0483Hc.A0I();
                availsExpected = c0483Hc.A0E();
                i = c0483Hc.A0E();
            } else {
                throw new RuntimeException();
            }
        }
        return new SpliceInsertCommand(A0M, z, z2, outOfNetworkIndicator, z3, j2, c0495Ho.A07(j2), emptyList, z4, j3, availNum, availsExpected, i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A06);
        parcel.writeByte(this.A0B ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0C ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A05);
        parcel.writeLong(this.A04);
        int size = this.A07.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            List<DT> list = this.A07;
            int i3 = A0D[3].length();
            if (i3 != 32) {
                throw new RuntimeException();
            }
            String[] strArr = A0D;
            strArr[6] = "cIZczz40pT0Gu";
            strArr[2] = "8BKfMUSS1QcQc";
            list.get(i2).A01(parcel);
        }
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A03);
        int componentSpliceListSize = this.A02;
        parcel.writeInt(componentSpliceListSize);
        int componentSpliceListSize2 = this.A00;
        parcel.writeInt(componentSpliceListSize2);
        int componentSpliceListSize3 = this.A01;
        parcel.writeInt(componentSpliceListSize3);
    }
}
