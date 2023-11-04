package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.g;
import java.io.IOException;
import java.util.Stack;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class a implements b {
    public final byte[] a = new byte[8];
    public final Stack<C0038a> b = new Stack<>();
    public final f c = new f();
    public c d;
    public int e;
    public int f;
    public long g;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.a$a */
    /* loaded from: classes.dex */
    public static final class C0038a {
        public final int a;
        public final long b;

        public C0038a(int i, long j) {
            this.a = i;
            this.b = j;
        }
    }

    public void a(c cVar) {
        this.d = cVar;
    }

    public final long b(g gVar, int i) throws IOException, InterruptedException {
        ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).b(this.a, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.a[i2] & UByte.MAX_VALUE);
        }
        return j;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:921:0x0641, code lost:
        if (r2.i() == r6.getLeastSignificantBits()) goto L332;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:925:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:929:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:941:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:942:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:945:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:946:0x06e1  */
    /* JADX WARN: Type inference failed for: r2v75 */
    /* JADX WARN: Type inference failed for: r2v76 */
    /* JADX WARN: Type inference failed for: r3v34, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v28, types: [com.fyber.inneractive.sdk.player.exoplayer2.extractor.b] */
    /* JADX WARN: Type inference failed for: r4v94, types: [int] */
    /* JADX WARN: Type inference failed for: r4v96 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g r35) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 3102
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.a.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g):boolean");
    }

    public final String c(g gVar, int i) throws IOException, InterruptedException {
        if (i == 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).b(bArr, 0, i, false);
        return new String(bArr);
    }

    public final double a(g gVar, int i) throws IOException, InterruptedException {
        long b = b(gVar, i);
        if (i == 4) {
            return Float.intBitsToFloat((int) b);
        }
        return Double.longBitsToDouble(b);
    }
}
