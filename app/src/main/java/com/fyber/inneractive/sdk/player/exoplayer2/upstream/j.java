package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j {
    public final Uri a;
    public final byte[] b;
    public final long c;
    public final long d;
    public final long e;
    public final String f;
    public final int g;

    public j(Uri uri, int i) {
        this(uri, 0L, -1L, null, i);
    }

    public boolean a(int i) {
        return (this.g & i) == i;
    }

    public String toString() {
        return "DataSpec[" + this.a + ", " + Arrays.toString(this.b) + ", " + this.c + ", " + this.d + ", " + this.e + ", " + this.f + ", " + this.g + "]";
    }

    public j(Uri uri, long j, long j2, String str, int i) {
        this(uri, j, j, j2, null, i);
    }

    public j(Uri uri, long j, long j2, long j3, String str, int i) {
        this(uri, null, j, j2, j3, str, i);
    }

    public j(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        boolean z = true;
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(j >= 0);
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(z);
        this.a = uri;
        this.b = null;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = str;
        this.g = i;
    }
}
