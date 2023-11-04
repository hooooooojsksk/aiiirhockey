package com.facebook.ads.internal.exoplayer2.thirdparty;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo;
import com.facebook.ads.redexgen.X.C0499Hs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: assets/audience_network.dex */
public final class Format implements Parcelable {
    public static byte[] A0R;
    public static String[] A0S = {"GkCJdc4gcEDyhSrmAvmdIhMcpgWdcGAD", "P7wJti8h4DQilFv1", "JfTD4DJXTv4PkONbD5mKaVW4fPbL8TvR", "vxuFoFca8hdNpr1LxNr2zKx53RimwM0h", "bhZpzqqZQOeAHwzqKdvv0PgUhXvz16sV", "CbjUY4sgiKfKafV0T546ZMOdyjpyhZSd", "yWUjvB0PPIH7", "Rw2LdMGLtrNyL7BxoibJQnsrtGr9rdxr"};
    public static final Parcelable.Creator<Format> CREATOR;
    public int A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final long A0G;
    @Nullable
    public final DrmInitData A0H;
    @Nullable
    public final Metadata A0I;
    @Nullable
    public final ColorInfo A0J;
    @Nullable
    public final String A0K;
    @Nullable
    public final String A0L;
    @Nullable
    public final String A0M;
    @Nullable
    public final String A0N;
    @Nullable
    public final String A0O;
    public final List<byte[]> A0P;
    @Nullable
    public final byte[] A0Q;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 42 out of bounds for length 35
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public Format(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, @Nullable byte[] bArr, int i6, @Nullable ColorInfo colorInfo, int i7, int i8, int i9, int i10, int i11, int i12, @Nullable String str5, int i13, long j, @Nullable List<byte[]> list, @Nullable DrmInitData drmInitData, @Nullable Metadata metadata) {
        int i14 = i5;
        float f3 = f2;
        List<byte[]> list2 = list;
        int i15 = i11;
        int i16 = i10;
        this.A0M = str;
        this.A0L = str2;
        this.A0O = str3;
        this.A0K = str4;
        this.A04 = i;
        this.A09 = i2;
        this.A0F = i3;
        this.A08 = i4;
        this.A01 = f;
        this.A0B = i14 == -1 ? 0 : i14;
        this.A02 = f3 == -1.0f ? 1.0f : f3;
        this.A0Q = bArr;
        this.A0E = i6;
        this.A0J = colorInfo;
        this.A05 = i7;
        this.A0C = i8;
        this.A0A = i9;
        this.A06 = i16 == -1 ? 0 : i16;
        this.A07 = i15 == -1 ? 0 : i15;
        this.A0D = i12;
        this.A0N = str5;
        this.A03 = i13;
        this.A0G = j;
        this.A0P = list2 == null ? Collections.emptyList() : list2;
        this.A0H = drmInitData;
        this.A0I = metadata;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static Format A07(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, List<byte[]> list, @Nullable DrmInitData drmInitData, int i5, @Nullable String str4) {
        return A06(str, str2, str3, i, i2, i3, i4, -1, list, drmInitData, i5, str4);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 39 out of bounds for length 39
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static Format A09(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, @Nullable String str4, int i3, @Nullable DrmInitData drmInitData, long j, List<byte[]> list) {
        return new Format(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str4, i3, j, list, drmInitData, null);
    }

    public static String A0C(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0R, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 47);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0R = new byte[]{-64, -76, -91, -103, -44, -70, -29, -26, -31, -43, -24, -100, -4, -56, 7, -42, -54, 5};
    }

    static {
        A0D();
        CREATOR = new Parcelable.Creator<Format>() { // from class: com.facebook.ads.redexgen.X.9Q
            /* JADX INFO: Access modifiers changed from: private */
            @Override // android.os.Parcelable.Creator
            /* renamed from: A00 */
            public final Format createFromParcel(Parcel parcel) {
                return new Format(parcel);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // android.os.Parcelable.Creator
            /* renamed from: A01 */
            public final Format[] newArray(int i) {
                return new Format[i];
            }
        };
    }

    public Format(Parcel parcel) {
        this.A0M = parcel.readString();
        this.A0L = parcel.readString();
        this.A0O = parcel.readString();
        this.A0K = parcel.readString();
        this.A04 = parcel.readInt();
        this.A09 = parcel.readInt();
        this.A0F = parcel.readInt();
        this.A08 = parcel.readInt();
        this.A01 = parcel.readFloat();
        this.A0B = parcel.readInt();
        this.A02 = parcel.readFloat();
        boolean hasProjectionData = C0499Hs.A0f(parcel);
        this.A0Q = hasProjectionData ? parcel.createByteArray() : null;
        this.A0E = parcel.readInt();
        this.A0J = (ColorInfo) parcel.readParcelable(ColorInfo.class.getClassLoader());
        this.A05 = parcel.readInt();
        this.A0C = parcel.readInt();
        this.A0A = parcel.readInt();
        this.A06 = parcel.readInt();
        this.A07 = parcel.readInt();
        this.A0D = parcel.readInt();
        this.A0N = parcel.readString();
        this.A03 = parcel.readInt();
        this.A0G = parcel.readLong();
        int readInt = parcel.readInt();
        this.A0P = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.A0P.add(parcel.createByteArray());
        }
        this.A0H = (DrmInitData) parcel.readParcelable(DrmInitData.class.getClassLoader());
        this.A0I = (Metadata) parcel.readParcelable(Metadata.class.getClassLoader());
    }

    public static Format A00(@Nullable String str, String str2, int i, @Nullable String str3) {
        return A01(str, str2, i, str3, null);
    }

    public static Format A01(@Nullable String str, String str2, int i, @Nullable String str3, @Nullable DrmInitData drmInitData) {
        return A09(str, str2, null, -1, i, str3, -1, drmInitData, LongCompanionObject.MAX_VALUE, Collections.emptyList());
    }

    public static Format A02(@Nullable String str, @Nullable String str2, long j) {
        return new Format(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, j, null, null, null);
    }

    public static Format A03(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, @Nullable DrmInitData drmInitData) {
        return A04(str, str2, str3, i, i2, i3, i4, f, list, i5, f2, null, -1, null, drmInitData);
    }

    public static Format A04(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, byte[] bArr, int i6, @Nullable ColorInfo colorInfo, @Nullable DrmInitData drmInitData) {
        return new Format(str, null, str2, str3, i, i2, i3, i4, f, i5, f2, bArr, i6, colorInfo, -1, -1, -1, -1, -1, 0, null, -1, LongCompanionObject.MAX_VALUE, list, drmInitData, null);
    }

    public static Format A05(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, List<byte[]> list, @Nullable DrmInitData drmInitData, int i8, @Nullable String str4, @Nullable Metadata metadata) {
        return new Format(str, null, str2, str3, i, i2, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i3, i4, i5, i6, i7, i8, str4, -1, LongCompanionObject.MAX_VALUE, list, drmInitData, metadata);
    }

    public static Format A06(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, int i5, List<byte[]> initializationData, @Nullable DrmInitData drmInitData, int i6, @Nullable String str4) {
        return A05(str, str2, str3, i, i2, i3, i4, i5, -1, -1, initializationData, drmInitData, i6, str4, null);
    }

    public static Format A08(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, @Nullable String str4, int i3, @Nullable DrmInitData drmInitData) {
        return A09(str, str2, str3, i, i2, str4, i3, drmInitData, LongCompanionObject.MAX_VALUE, Collections.emptyList());
    }

    public static Format A0A(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, List<byte[]> list, @Nullable String str4, @Nullable DrmInitData drmInitData) {
        return new Format(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str4, -1, LongCompanionObject.MAX_VALUE, list, drmInitData, null);
    }

    public static Format A0B(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, @Nullable DrmInitData drmInitData) {
        return new Format(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, LongCompanionObject.MAX_VALUE, null, drmInitData, null);
    }

    public final int A0E() {
        int i;
        int i2 = this.A0F;
        if (i2 == -1 || (i = this.A08) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final Format A0F(int i) {
        return new Format(this.A0M, this.A0L, this.A0O, this.A0K, this.A04, i, this.A0F, this.A08, this.A01, this.A0B, this.A02, this.A0Q, this.A0E, this.A0J, this.A05, this.A0C, this.A0A, this.A06, this.A07, this.A0D, this.A0N, this.A03, this.A0G, this.A0P, this.A0H, this.A0I);
    }

    public final Format A0G(int i, int i2) {
        return new Format(this.A0M, this.A0L, this.A0O, this.A0K, this.A04, this.A09, this.A0F, this.A08, this.A01, this.A0B, this.A02, this.A0Q, this.A0E, this.A0J, this.A05, this.A0C, this.A0A, i, i2, this.A0D, this.A0N, this.A03, this.A0G, this.A0P, this.A0H, this.A0I);
    }

    public final Format A0H(long j) {
        return new Format(this.A0M, this.A0L, this.A0O, this.A0K, this.A04, this.A09, this.A0F, this.A08, this.A01, this.A0B, this.A02, this.A0Q, this.A0E, this.A0J, this.A05, this.A0C, this.A0A, this.A06, this.A07, this.A0D, this.A0N, this.A03, j, this.A0P, this.A0H, this.A0I);
    }

    public final Format A0I(@Nullable DrmInitData drmInitData) {
        return new Format(this.A0M, this.A0L, this.A0O, this.A0K, this.A04, this.A09, this.A0F, this.A08, this.A01, this.A0B, this.A02, this.A0Q, this.A0E, this.A0J, this.A05, this.A0C, this.A0A, this.A06, this.A07, this.A0D, this.A0N, this.A03, this.A0G, this.A0P, drmInitData, this.A0I);
    }

    public final Format A0J(@Nullable Metadata metadata) {
        return new Format(this.A0M, this.A0L, this.A0O, this.A0K, this.A04, this.A09, this.A0F, this.A08, this.A01, this.A0B, this.A02, this.A0Q, this.A0E, this.A0J, this.A05, this.A0C, this.A0A, this.A06, this.A07, this.A0D, this.A0N, this.A03, this.A0G, this.A0P, this.A0H, metadata);
    }

    public final boolean A0K(Format format) {
        if (this.A0P.size() != format.A0P.size()) {
            return false;
        }
        int i = 0;
        while (true) {
            List<byte[]> list = this.A0P;
            if (A0S[3].charAt(4) == '0') {
                throw new RuntimeException();
            }
            A0S[2] = "uHGTVrJUseEQDWcSJLRyHn1PY5AFGLRu";
            int i2 = list.size();
            if (i < i2) {
                if (!Arrays.equals(this.A0P.get(i), format.A0P.get(i))) {
                    return false;
                }
                i++;
            } else {
                return true;
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x00c8, code lost:
        if (com.facebook.ads.redexgen.X.C0499Hs.A0g(r3, r7.A0M) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x00d2, code lost:
        if (com.facebook.ads.redexgen.X.C0499Hs.A0g(r6.A0N, r7.A0N) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x00d8, code lost:
        if (r6.A03 != r7.A03) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x00da, code lost:
        r3 = r6.A0L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x00e7, code lost:
        if (com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0S[6].length() == 12) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x00e9, code lost:
        r2 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0S;
        r2[0] = "f4qynKSZGBMQmFS8yoPbqVTy60hYeCHe";
        r2[7] = "pyecG5gqeuRBtn7wAU0OCN03CmXuXhcb";
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x00fb, code lost:
        if (com.facebook.ads.redexgen.X.C0499Hs.A0g(r3, r7.A0L) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0105, code lost:
        if (com.facebook.ads.redexgen.X.C0499Hs.A0g(r6.A0O, r7.A0O) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x010f, code lost:
        if (com.facebook.ads.redexgen.X.C0499Hs.A0g(r6.A0K, r7.A0K) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0119, code lost:
        if (com.facebook.ads.redexgen.X.C0499Hs.A0g(r6.A0H, r7.A0H) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0123, code lost:
        if (com.facebook.ads.redexgen.X.C0499Hs.A0g(r6.A0I, r7.A0I) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0125, code lost:
        r3 = r6.A0J;
        r2 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0S;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0139, code lost:
        if (r2[0].charAt(28) == r2[7].charAt(28)) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x013b, code lost:
        com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0S[4] = "rye8QllKI3Tp3xq4xqdTraq6YPVl5KkX";
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0148, code lost:
        if (com.facebook.ads.redexgen.X.C0499Hs.A0g(r3, r7.A0J) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0152, code lost:
        if (java.util.Arrays.equals(r6.A0Q, r7.A0Q) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0158, code lost:
        if (A0K(r7) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x015b, code lost:
        com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0S[2] = "P2mIdYJpvo0SLqii3TvA33Xjwdry7qiI";
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0168, code lost:
        if (com.facebook.ads.redexgen.X.C0499Hs.A0g(r3, r7.A0L) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0178, code lost:
        if (com.facebook.ads.redexgen.X.C0499Hs.A0g(r3, r7.A0M) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:?, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(@androidx.annotation.Nullable java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.exoplayer2.thirdparty.Format.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int i = 17 * 31;
            String str = this.A0M;
            int result = str == null ? 0 : str.hashCode();
            int result2 = (i + result) * 31;
            String str2 = this.A0L;
            int result3 = (result2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.A0O;
            int result4 = str3 == null ? 0 : str3.hashCode();
            int result5 = (result3 + result4) * 31;
            String str4 = this.A0K;
            int hashCode = str4 == null ? 0 : str4.hashCode();
            int result6 = this.A04;
            int result7 = this.A08;
            int result8 = this.A0C;
            int result9 = (((((((((((result5 + hashCode) * 31) + result6) * 31) + this.A0F) * 31) + result7) * 31) + this.A05) * 31) + result8) * 31;
            String str5 = this.A0N;
            int hashCode2 = str5 == null ? 0 : str5.hashCode();
            int result10 = this.A03;
            int result11 = (((result9 + hashCode2) * 31) + result10) * 31;
            DrmInitData drmInitData = this.A0H;
            int result12 = (result11 + (drmInitData == null ? 0 : drmInitData.hashCode())) * 31;
            Metadata metadata = this.A0I;
            this.A00 = result12 + (metadata != null ? metadata.hashCode() : 0);
        }
        return this.A00;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(A0C(5, 7, 69));
        sb.append(this.A0M);
        String A0C = A0C(0, 2, 101);
        sb.append(A0C);
        sb.append(this.A0L);
        sb.append(A0C);
        sb.append(this.A0O);
        sb.append(A0C);
        sb.append(this.A04);
        sb.append(A0C);
        sb.append(this.A0N);
        sb.append(A0C(2, 3, 74));
        sb.append(this.A0F);
        sb.append(A0C);
        sb.append(this.A08);
        sb.append(A0C);
        sb.append(this.A01);
        sb.append(A0C(14, 4, 123));
        sb.append(this.A05);
        sb.append(A0C);
        sb.append(this.A0C);
        sb.append(A0C(12, 2, 112));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0M);
        parcel.writeString(this.A0L);
        parcel.writeString(this.A0O);
        parcel.writeString(this.A0K);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A09);
        parcel.writeInt(this.A0F);
        parcel.writeInt(this.A08);
        parcel.writeFloat(this.A01);
        parcel.writeInt(this.A0B);
        parcel.writeFloat(this.A02);
        C0499Hs.A0V(parcel, this.A0Q != null);
        byte[] bArr = this.A0Q;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.A0E);
        parcel.writeParcelable(this.A0J, i);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A0C);
        parcel.writeInt(this.A0A);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A0D);
        parcel.writeString(this.A0N);
        parcel.writeInt(this.A03);
        parcel.writeLong(this.A0G);
        int i2 = this.A0P.size();
        parcel.writeInt(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            parcel.writeByteArray(this.A0P.get(i3));
        }
        parcel.writeParcelable(this.A0H, 0);
        parcel.writeParcelable(this.A0I, 0);
    }
}
