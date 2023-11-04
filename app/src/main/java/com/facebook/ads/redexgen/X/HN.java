package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

@TargetApi(17)
/* loaded from: assets/audience_network.dex */
public final class HN implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static byte[] A06;
    public static String[] A07 = {"5TSO5lr", "Uiq36pf0DX0u", "dNHqZ55iPnem4y3dhzVH4NhC", "DOJEdaaUqp1LV7wfBlv79qDRQsxW0GTY", "guLhPKZ6AS5yiDivKc9wkx6W", "v4VlaWQwn4OHm3pLjlth", "v4A3PsxLBQ1NNAoAwErdhJ5LwmF6", "7Ce6kiHf90JXyVCEwcuj9iqZ78CWnN5B"};
    public static final int[] A08;
    @Nullable
    public SurfaceTexture A00;
    @Nullable
    public EGLContext A01;
    @Nullable
    public EGLDisplay A02;
    @Nullable
    public EGLSurface A03;
    public final Handler A04;
    public final int[] A05 = new int[1];

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 98);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{4, 6, 11, -30, 7, 14, 14, 18, 4, -30, 14, 13, 5, 8, 6, -65, 5, 0, 8, 11, 4, 3, -39, -65, 18, 20, 2, 2, 4, 18, 18, -36, -60, 1, -53, -65, 13, 20, 12, -30, 14, 13, 5, 8, 6, 18, -6, -49, -4, -36, -60, 3, -53, -65, 2, 14, 13, 5, 8, 6, 18, -6, -49, -4, -36, -60, 18, 0, 2, 7, -34, 13, 0, -4, 15, 0, -34, 10, 9, 15, 0, 19, 15, -69, 1, -4, 4, 7, 0, -1, 50, 52, 57, 16, 63, 50, 46, 65, 50, 29, 47, airhockey.P_NATION, 51, 51, 50, 63, 32, airhockey.P_NATION, 63, 51, 46, 48, 50, -19, 51, 46, 54, 57, 50, 49, 39, 41, 46, 9, 39, 54, 6, 43, 53, 50, 46, 35, 59, -30, 40, 35, 43, 46, 39, 38, 7, 9, 14, -21, 16, 11, 22, 11, 3, 14, 11, 28, 7, -62, 8, 3, 11, 14, 7, 6, 23, 25, 30, -1, 19, 29, 23, -11, 39, 36, 36, 23, 32, 38, -46, 24, 19, 27, 30, 23, 22, -35, -30, -67, -37, -28, -54, -37, -18, -22, -21, -24, -37, -23, -106, -36, -41, -33, -30, -37, -38, -92, -106, -69, -24, -24, -27, -24, -80, -106};
    }

    static {
        A05();
        A08 = new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    }

    public HN(Handler handler) {
        this.A04 = handler;
    }

    public static EGLConfig A00(EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, A08, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (eglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null) {
            return eGLConfigArr[0];
        }
        throw new HL(C0499Hs.A0P(A04(0, 67, 61), Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
    }

    public static EGLContext A01(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        int[] iArr;
        if (i == 0) {
            String[] strArr = A07;
            if (strArr[2].length() == strArr[4].length()) {
                String[] strArr2 = A07;
                strArr2[6] = "5hWHC0oHfUbpO4ZjPgiVB2smhvQu";
                strArr2[1] = "3zAqevRSq2wA";
                iArr = new int[]{12440, 2, 12344};
            }
            throw new RuntimeException();
        }
        iArr = new int[]{12440, 2, 12992, 1, 12344};
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
        String[] strArr3 = A07;
        if (strArr3[2].length() == strArr3[4].length()) {
            String[] strArr4 = A07;
            strArr4[2] = "8RdjgOIihguPHROERfozGy04";
            strArr4[4] = "3uRpawq9n2XXKe4b8O5R7KVo";
            if (eglCreateContext != null) {
                return eglCreateContext;
            }
            throw new HL(A04(67, 23, 57));
        }
        throw new RuntimeException();
    }

    public static EGLDisplay A02() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay == null) {
            throw new HL(A04(120, 20, 96));
        }
        int[] iArr = new int[2];
        boolean eglInitialized = EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1);
        if (!eglInitialized) {
            throw new HL(A04(140, 20, 64));
        }
        return eglGetDisplay;
    }

    public static EGLSurface A03(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i) {
        int[] pbufferAttributes;
        EGLSurface eglCreatePbufferSurface;
        if (i == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            if (i == 2) {
                String[] strArr = A07;
                if (strArr[2].length() != strArr[4].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A07;
                strArr2[5] = "50bPomhroWylyyFBvpVs";
                strArr2[0] = "L3rJnP7";
                pbufferAttributes = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
            } else {
                pbufferAttributes = new int[]{12375, 1, 12374, 1, 12344};
            }
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, pbufferAttributes, 0);
            if (eglCreatePbufferSurface == null) {
                throw new HL(A04(90, 30, 107));
            }
        }
        if (!EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eGLContext)) {
            throw new HL(A04(160, 21, 80));
        }
        return eglCreatePbufferSurface;
    }

    public static void A06(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        throw new HL(A04(181, 29, 20) + Integer.toHexString(glGetError));
    }

    public final SurfaceTexture A07() {
        return (SurfaceTexture) HD.A01(this.A00);
    }

    public final void A08() {
        this.A04.removeCallbacks(this);
        try {
            if (this.A00 != null) {
                this.A00.release();
                GLES20.glDeleteTextures(1, this.A05, 0);
            }
            EGLDisplay eGLDisplay = this.A02;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglMakeCurrent(this.A02, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface = this.A03;
            String[] strArr = A07;
            if (strArr[2].length() == strArr[4].length()) {
                String[] strArr2 = A07;
                strArr2[6] = "8PllVlNdMAAu4TKgTKAS29fkCg54";
                strArr2[1] = "Tgpvj88vDtzw";
                if (eGLSurface != null && !eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
                    EGL14.eglDestroySurface(this.A02, this.A03);
                }
                EGLContext eGLContext = this.A01;
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(this.A02, eGLContext);
                }
                if (C0499Hs.A02 >= 19) {
                    EGL14.eglReleaseThread();
                }
                this.A02 = null;
                this.A01 = null;
                this.A03 = null;
                this.A00 = null;
                return;
            }
        } catch (Throwable th) {
            EGLDisplay eGLDisplay2 = this.A02;
            if (eGLDisplay2 != null && !eGLDisplay2.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglMakeCurrent(this.A02, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.A03;
            if (eGLSurface2 != null) {
                boolean equals = eGLSurface2.equals(EGL14.EGL_NO_SURFACE);
                String[] strArr3 = A07;
                if (strArr3[6].length() != strArr3[1].length()) {
                    String[] strArr4 = A07;
                    strArr4[6] = "r3Hb0yez8M7noZnY3ze2YxiUHxrs";
                    strArr4[1] = "CWlkNsK28M1O";
                    if (!equals) {
                        EGL14.eglDestroySurface(this.A02, this.A03);
                    }
                }
            }
            EGLContext eGLContext2 = this.A01;
            if (eGLContext2 != null) {
                EGL14.eglDestroyContext(this.A02, eGLContext2);
            }
            if (C0499Hs.A02 >= 19) {
                EGL14.eglReleaseThread();
            }
            this.A02 = null;
            this.A01 = null;
            this.A03 = null;
            this.A00 = null;
            throw th;
        }
        throw new RuntimeException();
    }

    public final void A09(int i) {
        this.A02 = A02();
        EGLConfig A00 = A00(this.A02);
        this.A01 = A01(this.A02, A00, i);
        this.A03 = A03(this.A02, A00, this.A01, i);
        A06(this.A05);
        this.A00 = new SurfaceTexture(this.A05[0]);
        this.A00.setOnFrameAvailableListener(this);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.A04.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            if (this.A00 != null) {
                this.A00.updateTexImage();
            }
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
            String[] strArr = A07;
            if (strArr[3].charAt(20) != strArr[7].charAt(20)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[5] = "ZzjuVJHgrnVVHlBPGowR";
            strArr2[0] = "0e2m0w7";
        }
    }
}
