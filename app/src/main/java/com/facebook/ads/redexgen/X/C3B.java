package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.3B */
/* loaded from: assets/audience_network.dex */
public final class C3B extends AbstractC0388Dh implements Handler.Callback {
    public static String[] A0B = {"0qSWVCRp", "8n", "TBzABSyg8R7UC4ujRNxCq", "jQt0eIY", "v3jD5iBy36", "AYhXU50alurSLkI0yvRIZkZn8z1ow4xX", "qUGfoy2tLuPBRFk8hkXJpZQuwVi5LQ1p", "rA70SaLYISjIKcft86AFQfJkzoYA33nr"};
    public int A00;
    public int A01;
    public D9 A02;
    public boolean A03;
    public final Handler A04;
    public final C9S A05;
    public final DB A06;
    public final C0381Cx A07;
    public final DC A08;
    public final long[] A09;
    public final Metadata[] A0A;

    public C3B(DC dc, Looper looper) {
        this(dc, looper, DB.A00);
    }

    public C3B(DC dc, Looper looper, DB db) {
        super(4);
        this.A08 = (DC) HD.A01(dc);
        this.A04 = looper == null ? null : new Handler(looper, this);
        this.A06 = (DB) HD.A01(db);
        this.A05 = new C9S();
        this.A07 = new C0381Cx();
        this.A0A = new Metadata[5];
        this.A09 = new long[5];
    }

    private void A00() {
        Arrays.fill(this.A0A, (Object) null);
        this.A01 = 0;
        this.A00 = 0;
    }

    private void A01(Metadata metadata) {
        Handler handler = this.A04;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(0, metadata);
            String[] strArr = A0B;
            if (strArr[3].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[5] = "HjLXVjnhMu7EB58lvrXa8leW0c4xSFXO";
            strArr2[6] = "qIzVCSliCuvFWhZzcfJ3ccTrGvRVj8IV";
            obtainMessage.sendToTarget();
            return;
        }
        A02(metadata);
    }

    private void A02(Metadata metadata) {
        this.A08.ABl(metadata);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0388Dh
    public final void A12() {
        A00();
        this.A02 = null;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0388Dh
    public final void A15(long j, boolean z) {
        A00();
        this.A03 = false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0388Dh
    public final void A17(Format[] formatArr, long j) throws C9F {
        this.A02 = this.A06.A4I(formatArr[0]);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Wu
    public final boolean A8h() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Wu
    public final boolean A8r() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Wu
    public final void AEH(long j, long j2) throws C9F {
        if (!this.A03 && this.A00 < 5) {
            this.A07.A07();
            if (A10(this.A05, this.A07, false) == -4) {
                if (this.A07.A04()) {
                    this.A03 = true;
                } else {
                    boolean A03 = this.A07.A03();
                    String[] strArr = A0B;
                    if (strArr[3].length() == strArr[2].length()) {
                        throw new RuntimeException();
                    }
                    A0B[7] = "LGLHrgLhu9uRK5PVWOv1cuvTksuxgVhV";
                    if (!A03) {
                        this.A07.A00 = this.A05.A00.A0G;
                        this.A07.A08();
                        try {
                            int index = (this.A01 + this.A00) % 5;
                            this.A0A[index] = this.A02.A4k(this.A07);
                            this.A09[index] = ((C0865Wg) this.A07).A00;
                            this.A00++;
                        } catch (DA e) {
                            throw C9F.A01(e, A0y());
                        }
                    }
                }
            }
        }
        int i = this.A00;
        if (A0B[1].length() == 1) {
            throw new RuntimeException();
        }
        A0B[1] = "3VtXKAcUijLRyWZ1CGRxfS";
        if (i > 0) {
            long[] jArr = this.A09;
            int i2 = this.A01;
            if (jArr[i2] <= j) {
                A01(this.A0A[i2]);
                Metadata[] metadataArr = this.A0A;
                int i3 = this.A01;
                metadataArr[i3] = null;
                this.A01 = (i3 + 1) % 5;
                this.A00--;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03089n
    public final int AFY(Format format) {
        if (this.A06.AFZ(format)) {
            return AbstractC0388Dh.A0x(null, format.A0H) ? 4 : 2;
        }
        return 0;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            A02((Metadata) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }
}
