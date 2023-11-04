package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.r;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class l implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.f {
    public static final Pattern g = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern h = Pattern.compile("MPEGTS:(\\d+)");
    public final String a;
    public final r b;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.h d;
    public int f;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k c = new com.fyber.inneractive.sdk.player.exoplayer2.util.k();
    public byte[] e = new byte[1024];

    public l(String str, r rVar) {
        this.a = str;
        this.b = rVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar) throws IOException, InterruptedException {
        throw new IllegalStateException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void b() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.h hVar) {
        this.d = hVar;
        hVar.a(new m.a(-9223372036854775807L));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void a(long j, long j2) {
        throw new IllegalStateException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l lVar) throws IOException, InterruptedException {
        Matcher matcher;
        String d;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar;
        int i = (int) bVar.b;
        int i2 = this.f;
        byte[] bArr = this.e;
        if (i2 == bArr.length) {
            this.e = Arrays.copyOf(bArr, ((i != -1 ? i : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.e;
        int i3 = this.f;
        int a = bVar.a(bArr2, i3, bArr2.length - i3);
        if (a != -1) {
            int i4 = this.f + a;
            this.f = i4;
            if (i == -1 || i4 != i) {
                return 0;
            }
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.k(this.e);
        try {
            Pattern pattern = com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.b.a;
            String d2 = kVar.d();
            if (d2 == null || !com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.b.b.matcher(d2).matches()) {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.text.a("Expected WEBVTT. Got " + d2);
            }
            long j = 0;
            long j2 = 0;
            while (true) {
                String d3 = kVar.d();
                if (TextUtils.isEmpty(d3)) {
                    while (true) {
                        String d4 = kVar.d();
                        if (d4 == null) {
                            matcher = null;
                            break;
                        } else if (com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.b.a.matcher(d4).matches()) {
                            do {
                                d = kVar.d();
                                if (d != null) {
                                }
                            } while (!d.isEmpty());
                        } else {
                            matcher = com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.a.a.matcher(d4);
                            if (matcher.matches()) {
                                break;
                            }
                        }
                    }
                    if (matcher == null) {
                        a(0L);
                    } else {
                        long a2 = com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.b.a(matcher.group(1));
                        long a3 = this.b.a((j2 + a2) - j);
                        n a4 = a(a3 - a2);
                        this.c.a(this.e, this.f);
                        a4.a(this.c, this.f);
                        a4.a(a3, 1, this.f, 0, null);
                    }
                    return -1;
                } else if (d3.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher2 = g.matcher(d3);
                    if (matcher2.find()) {
                        Matcher matcher3 = h.matcher(d3);
                        if (matcher3.find()) {
                            j = com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.b.a(matcher2.group(1));
                            j2 = (Long.parseLong(matcher3.group(1)) * 1000000) / 90000;
                        } else {
                            throw new com.fyber.inneractive.sdk.player.exoplayer2.l("X-TIMESTAMP-MAP doesn't contain media timestamp: " + d3);
                        }
                    } else {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.l("X-TIMESTAMP-MAP doesn't contain local timestamp: " + d3);
                    }
                }
            }
        } catch (com.fyber.inneractive.sdk.player.exoplayer2.text.a e) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.l(e);
        }
    }

    public final n a(long j) {
        n a = this.d.a(0, 3);
        a.a(com.fyber.inneractive.sdk.player.exoplayer2.i.a(null, "text/vtt", null, -1, 0, this.a, -1, null, j, Collections.emptyList()));
        this.d.c();
        return a;
    }
}
