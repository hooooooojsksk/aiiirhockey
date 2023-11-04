package com.facebook.ads.redexgen.X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.facebook.ads.redexgen.X.Wt */
/* loaded from: assets/audience_network.dex */
public final class SurfaceHolder$CallbackC0878Wt implements IG, AM, FU, DC, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public static String[] A01 = {"nMHZhEZSp5EcTMzj890UQSIKsf7nOssk", "WLzxKTE2vNTMCpqDs", "SfczCGFglH", "X5aT15p3N3rGxVL5g", "GbnJfxrb9aQYK7s9S1Y8QTSWgx7P8ZxV", "tLWa3XxeFvyx8wOT4", "wILb6N7ReXeeP8cmU", "dyBLf42uqj"};
    public final /* synthetic */ C0385De A00;

    public SurfaceHolder$CallbackC0878Wt(C0385De c0385De) {
        this.A00 = c0385De;
    }

    @Override // com.facebook.ads.redexgen.X.AM
    public final void AAG(String str, long j, long j2) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        copyOnWriteArraySet = this.A00.A0I;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((AM) it.next()).AAG(str, j, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AM
    public final void AAH(C0335Ap c0335Ap) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        copyOnWriteArraySet = this.A00.A0I;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            AM am = (AM) it.next();
            String[] strArr = A01;
            if (strArr[1].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            A01[4] = "5uZ3F86UAJ67QZD2oUJwcWpEFJTFqeup";
            am.AAH(c0335Ap);
        }
        this.A00.A06 = null;
        this.A00.A09 = null;
        this.A00.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.AM
    public final void AAI(C0335Ap c0335Ap) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        this.A00.A09 = c0335Ap;
        copyOnWriteArraySet = this.A00.A0I;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((AM) it.next()).AAI(c0335Ap);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AM
    public final void AAJ(Format format) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        this.A00.A06 = format;
        copyOnWriteArraySet = this.A00.A0I;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((AM) it.next()).AAJ(format);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AM
    public final void AAK(int i) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        this.A00.A01 = i;
        copyOnWriteArraySet = this.A00.A0I;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((AM) it.next()).AAK(i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AM
    public final void AAL(int i, long j, long j2) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        copyOnWriteArraySet = this.A00.A0I;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((AM) it.next()).AAL(i, j, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.FU
    public final void AAf(List<FQ> list) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        this.A00.A0C = list;
        copyOnWriteArraySet = this.A00.A0K;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((FU) it.next()).AAf(list);
        }
    }

    @Override // com.facebook.ads.redexgen.X.IG
    public final void AAr(int i, long j) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        copyOnWriteArraySet = this.A00.A0L;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((IG) it.next()).AAr(i, j);
        }
    }

    @Override // com.facebook.ads.redexgen.X.DC
    public final void ABl(Metadata metadata) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        copyOnWriteArraySet = this.A00.A0J;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((DC) it.next()).ABl(metadata);
        }
    }

    @Override // com.facebook.ads.redexgen.X.IG
    public final void ACL(Surface surface) {
        Surface surface2;
        CopyOnWriteArraySet copyOnWriteArraySet;
        CopyOnWriteArraySet copyOnWriteArraySet2;
        surface2 = this.A00.A03;
        if (surface2 == surface) {
            copyOnWriteArraySet2 = this.A00.A0M;
            Iterator it = copyOnWriteArraySet2.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        copyOnWriteArraySet = this.A00.A0L;
        Iterator it2 = copyOnWriteArraySet.iterator();
        while (it2.hasNext()) {
            ((IG) it2.next()).ACL(surface);
        }
    }

    @Override // com.facebook.ads.redexgen.X.IG
    public final void ACw(String str, long j, long j2) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        copyOnWriteArraySet = this.A00.A0L;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((IG) it.next()).ACw(str, j, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.IG
    public final void ACx(C0335Ap c0335Ap) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        copyOnWriteArraySet = this.A00.A0L;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((IG) it.next()).ACx(c0335Ap);
        }
        this.A00.A07 = null;
        String[] strArr = A01;
        if (strArr[1].length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        A01[0] = "zG8NefRqMKYqbgzRufdCrC4W5rqrDhRZ";
        this.A00.A0A = null;
    }

    @Override // com.facebook.ads.redexgen.X.IG
    public final void ACy(C0335Ap c0335Ap) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        this.A00.A0A = c0335Ap;
        copyOnWriteArraySet = this.A00.A0L;
        Iterator it = copyOnWriteArraySet.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A01[0].charAt(5) == '7') {
                throw new RuntimeException();
            }
            A01[4] = "B3QwduSxUwudXX0SLqqw26pCzLpqq2sU";
            if (hasNext) {
                ((IG) it.next()).ACy(c0335Ap);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.IG
    public final void AD3(Format format) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        this.A00.A07 = format;
        copyOnWriteArraySet = this.A00.A0L;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((IG) it.next()).AD3(format);
        }
    }

    @Override // com.facebook.ads.redexgen.X.IG
    public final void AD9(int i, int i2, int i3, float f) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        CopyOnWriteArraySet copyOnWriteArraySet2;
        copyOnWriteArraySet = this.A00.A0M;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((I7) it.next()).AD9(i, i2, i3, f);
        }
        copyOnWriteArraySet2 = this.A00.A0L;
        Iterator it2 = copyOnWriteArraySet2.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            String[] strArr = A01;
            if (strArr[3].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[4] = "2vUTxC8fdDWhhRkArIujhTo4qLvFXYNt";
            if (hasNext) {
                ((IG) it2.next()).AD9(i, i2, i3, f);
            } else {
                return;
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A00.A0G(new Surface(surfaceTexture), true);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.A00.A0G(null, true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.A00.A0G(surfaceHolder.getSurface(), false);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.A00.A0G(null, false);
    }
}
