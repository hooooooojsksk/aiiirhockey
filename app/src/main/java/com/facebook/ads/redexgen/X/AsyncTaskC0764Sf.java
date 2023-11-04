package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Sf */
/* loaded from: assets/audience_network.dex */
public final class AsyncTaskC0764Sf extends AsyncTask<String, Void, Bitmap[]> implements C7L {
    public static byte[] A0A;
    public static String[] A0B = {"Y", "r8ye64eLoQHeOJVpmB1uxWw1zCCHhuzX", "pvZIfONmKv3cVbimQPa9", "RLgA2SApOIsDDawooMs2KL5D8ZiCWoW1", "kM6akDIqkvY", "0vJdyNO9qrz2JF8Kt31GcmRDql8haFQB", "b8N1ZLVb0I2QrMIKflin5UtA7D7V4D", "X"};
    public int A00;
    public int A01;
    public N9 A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    @Nullable
    public final WeakReference<N7> A06;
    public final WeakReference<C0887Xc> A07;
    @Nullable
    public final WeakReference<ImageView> A08;
    @Nullable
    public final WeakReference<ViewGroup> A09;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 48);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0A = new byte[]{-89, -91, -82, -91, -78, -87, -93};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private final Bitmap[] A03(String... strArr) {
        if (C0548Jt.A02(this)) {
            return null;
        }
        try {
            String str = strArr[0];
            Bitmap bitmap = null;
            C0887Xc c0887Xc = this.A07.get();
            if (c0887Xc == null) {
                return new Bitmap[]{null, null};
            }
            Bitmap A0N = new C6M(c0887Xc).A0N(str, this.A00, this.A01);
            if (A0N != null && !this.A03) {
                bitmap = LS.A01(c0887Xc, A0N, this.A04, this.A05);
            }
            return new Bitmap[]{A0N, bitmap};
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
            return null;
        }
    }

    static {
        A01();
    }

    public AsyncTaskC0764Sf(ViewGroup viewGroup, int i, int i2, C0887Xc c0887Xc) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new WeakReference<>(c0887Xc);
        this.A06 = null;
        this.A08 = null;
        this.A09 = new WeakReference<>(viewGroup);
        this.A04 = i;
        this.A05 = i2;
    }

    public AsyncTaskC0764Sf(ViewGroup viewGroup, C0887Xc c0887Xc) {
        this(viewGroup, 12, 16, c0887Xc);
    }

    public AsyncTaskC0764Sf(ImageView imageView, C0887Xc c0887Xc) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new WeakReference<>(c0887Xc);
        this.A06 = null;
        this.A08 = new WeakReference<>(imageView);
        this.A09 = null;
        this.A04 = 0;
        this.A05 = 1;
    }

    public AsyncTaskC0764Sf(N7 n7, C0887Xc c0887Xc) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new WeakReference<>(c0887Xc);
        this.A06 = new WeakReference<>(n7);
        this.A08 = null;
        this.A09 = null;
        this.A04 = 12;
        this.A05 = 16;
    }

    private final void A02(Bitmap[] result) {
        N7 n7;
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            if (this.A08 != null) {
                ImageView imageView = this.A08.get();
                if (result[1] != null && !this.A03 && this.A04 != 0 && imageView != null) {
                    imageView.setImageBitmap(result[1]);
                    return;
                } else if (imageView != null) {
                    imageView.setImageBitmap(result[0]);
                }
            }
            if (this.A06 != null && (n7 = this.A06.get()) != null) {
                n7.setImage(result[0], result[1]);
            }
            if (this.A09 != null && this.A09.get() != null && result[1] != null) {
                LL.A0S(this.A09.get(), new BitmapDrawable(this.A07.get().getResources(), result[1]));
            }
            if (this.A02 != null) {
                this.A02.ABA(result[0] != null);
            }
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    public final AsyncTaskC0764Sf A04() {
        this.A00 = -1;
        this.A01 = -1;
        return this;
    }

    public final AsyncTaskC0764Sf A05(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        return this;
    }

    public final AsyncTaskC0764Sf A06(N9 n9) {
        this.A02 = n9;
        return this;
    }

    public final void A07(String str) {
        if (TextUtils.isEmpty(str)) {
            N9 n9 = this.A02;
            if (n9 != null) {
                n9.ABA(false);
                return;
            }
            return;
        }
        executeOnExecutor(LQ.A06, str);
    }

    @Override // com.facebook.ads.redexgen.X.C7L
    @Nullable
    public final C0887Xc A5d() {
        return this.A07.get();
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Bitmap[] doInBackground(String[] strArr) {
        if (C0548Jt.A02(this)) {
            return null;
        }
        try {
            return A03(strArr);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Bitmap[] bitmapArr) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A02(bitmapArr);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
            String[] strArr = A0B;
            if (strArr[0].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[0] = "X";
            strArr2[7] = "y";
        }
    }
}
