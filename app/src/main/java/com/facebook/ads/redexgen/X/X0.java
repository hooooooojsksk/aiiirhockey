package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public class X0 implements InterfaceC02788j {
    public final List<C02838o> A00 = new ArrayList();
    public final boolean A01;
    public final /* synthetic */ C0884Wz A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC02788j
    public final synchronized int A5P() {
        int i;
        i = 0;
        for (C02838o c02838o : this.A00) {
            i += c02838o.A01;
        }
        return i;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X0 != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    public X0(C0884Wz c0884Wz, List<C02748f> list, boolean z) throws IOException {
        this.A02 = c0884Wz;
        this.A01 = z;
        for (C02748f fetch : list) {
            C8e A01 = fetch.A01();
            this.A00.add(new C02838o(new C02728c(fetch.A00(), A01.A01()), A01.A00() - A01.A01(), A01.A00()));
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X0 != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    public final C02838o A00() {
        return this.A00.get(0);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X0 != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    public final C02838o A01() {
        List<C02838o> list = this.A00;
        return list.get(list.size() - 1);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X0 != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    @Override // com.facebook.ads.redexgen.X.InterfaceC02788j
    public final void A4l() throws C02888t {
        this.A02.A03(this);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X0 != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    @Override // com.facebook.ads.redexgen.X.InterfaceC02788j
    public final boolean A9h() {
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X0 != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A02.A06(this);
    }
}
