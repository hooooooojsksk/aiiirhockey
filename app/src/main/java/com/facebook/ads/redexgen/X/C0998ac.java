package com.facebook.ads.redexgen.X;

import java.io.File;

/* renamed from: com.facebook.ads.redexgen.X.ac */
/* loaded from: assets/audience_network.dex */
public final class C0998ac implements AnonymousClass03<File> {
    @Override // com.facebook.ads.redexgen.X.AnonymousClass03
    public final AnonymousClass02<File> A3B(File file, C0L c0l) {
        if (file.exists()) {
            return new AnonymousClass02<>(true, file);
        }
        return new AnonymousClass02<>(false, null);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass03
    public final void A4E(File file, C0L c0l) {
    }
}
