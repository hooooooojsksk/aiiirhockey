package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import java.io.IOException;
import java.util.Stack;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes.dex */
public final class f implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.f, m {
    public static final int p = u.a("qt  ");
    public int e;
    public int f;
    public long g;
    public int h;
    public com.fyber.inneractive.sdk.player.exoplayer2.util.k i;
    public int j;
    public int k;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.h l;
    public a[] m;
    public long n;
    public boolean o;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k c = new com.fyber.inneractive.sdk.player.exoplayer2.util.k(16);
    public final Stack<a.C0039a> d = new Stack<>();
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k a = new com.fyber.inneractive.sdk.player.exoplayer2.util.k(com.fyber.inneractive.sdk.player.exoplayer2.util.i.a);
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k b = new com.fyber.inneractive.sdk.player.exoplayer2.util.k(4);

    /* loaded from: classes.dex */
    public static final class a {
        public final h a;
        public final k b;
        public final n c;
        public int d;

        public a(h hVar, k kVar, n nVar) {
            this.a = hVar;
            this.b = kVar;
            this.c = nVar;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
    public boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar) throws IOException, InterruptedException {
        return g.a(gVar, false);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void b() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
    public long c() {
        return this.n;
    }

    public final void d() {
        this.e = 0;
        this.h = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.h hVar) {
        this.l = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:526:0x00bd A[Catch: all -> 0x022a, TryCatch #0 {all -> 0x022a, blocks: (B:517:0x00a6, B:519:0x00aa, B:521:0x00b0, B:523:0x00b5, B:526:0x00bd, B:527:0x00c4, B:528:0x00cc, B:530:0x00d0, B:531:0x00d8, B:533:0x00dc, B:534:0x00e4, B:536:0x00e8, B:537:0x00f0, B:539:0x00f4, B:540:0x00fc, B:542:0x0100, B:544:0x0109, B:546:0x010d, B:547:0x0115, B:549:0x0119, B:550:0x0121, B:552:0x0125, B:553:0x012c, B:555:0x0130, B:556:0x0137, B:558:0x013b, B:559:0x0142, B:561:0x0146, B:562:0x014d, B:564:0x0151, B:565:0x0158, B:567:0x015c, B:568:0x0163, B:570:0x0167, B:571:0x016e, B:573:0x0172, B:574:0x0179, B:576:0x017d, B:612:0x01f0, B:577:0x0182, B:579:0x018a, B:581:0x0191, B:583:0x0195, B:586:0x019b, B:588:0x019f, B:591:0x01a5, B:593:0x01a9, B:594:0x01b0, B:596:0x01b4, B:597:0x01bb, B:599:0x01bf, B:600:0x01c6, B:602:0x01ca, B:603:0x01d1, B:605:0x01d5, B:606:0x01dc, B:608:0x01e0, B:609:0x01e5, B:611:0x01e9, B:614:0x020d, B:615:0x0215), top: B:916:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:527:0x00c4 A[Catch: all -> 0x022a, TryCatch #0 {all -> 0x022a, blocks: (B:517:0x00a6, B:519:0x00aa, B:521:0x00b0, B:523:0x00b5, B:526:0x00bd, B:527:0x00c4, B:528:0x00cc, B:530:0x00d0, B:531:0x00d8, B:533:0x00dc, B:534:0x00e4, B:536:0x00e8, B:537:0x00f0, B:539:0x00f4, B:540:0x00fc, B:542:0x0100, B:544:0x0109, B:546:0x010d, B:547:0x0115, B:549:0x0119, B:550:0x0121, B:552:0x0125, B:553:0x012c, B:555:0x0130, B:556:0x0137, B:558:0x013b, B:559:0x0142, B:561:0x0146, B:562:0x014d, B:564:0x0151, B:565:0x0158, B:567:0x015c, B:568:0x0163, B:570:0x0167, B:571:0x016e, B:573:0x0172, B:574:0x0179, B:576:0x017d, B:612:0x01f0, B:577:0x0182, B:579:0x018a, B:581:0x0191, B:583:0x0195, B:586:0x019b, B:588:0x019f, B:591:0x01a5, B:593:0x01a9, B:594:0x01b0, B:596:0x01b4, B:597:0x01bb, B:599:0x01bf, B:600:0x01c6, B:602:0x01ca, B:603:0x01d1, B:605:0x01d5, B:606:0x01dc, B:608:0x01e0, B:609:0x01e5, B:611:0x01e9, B:614:0x020d, B:615:0x0215), top: B:916:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:620:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:683:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:689:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:693:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:757:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:785:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:935:0x0226 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v45 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(long r88) throws com.fyber.inneractive.sdk.player.exoplayer2.l {
        /*
            Method dump skipped, instructions count: 2636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.f.c(long):void");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void a(long j, long j2) {
        this.d.clear();
        this.h = 0;
        this.j = 0;
        this.k = 0;
        if (j == 0) {
            d();
            return;
        }
        a[] aVarArr = this.m;
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                k kVar = aVar.b;
                int a2 = kVar.a(j2);
                if (a2 == -1) {
                    a2 = kVar.b(j2);
                }
                aVar.d = a2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:336:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x02aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0006 A[SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g r24, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l r25) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 683
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.f.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l):int");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
    public long a(long j) {
        a[] aVarArr = this.m;
        long j2 = LongCompanionObject.MAX_VALUE;
        for (a aVar : aVarArr) {
            k kVar = aVar.b;
            int a2 = kVar.a(j);
            if (a2 == -1) {
                a2 = kVar.b(j);
            }
            long j3 = kVar.b[a2];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }
}
