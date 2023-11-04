package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.PrivateCommand;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.SpliceInsertCommand;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.SpliceNullCommand;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.SpliceScheduleCommand;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.TimeSignalCommand;
import java.nio.ByteBuffer;

/* loaded from: assets/audience_network.dex */
public final class VL implements D9 {
    @Nullable
    public C0495Ho A00;
    public final C0483Hc A02 = new C0483Hc();
    public final C0482Hb A01 = new C0482Hb();

    @Override // com.facebook.ads.redexgen.X.D9
    public final Metadata A4k(C0381Cx c0381Cx) throws DA {
        if (this.A00 == null || c0381Cx.A00 != this.A00.A05()) {
            this.A00 = new C0495Ho(((C0865Wg) c0381Cx).A00);
            this.A00.A06(((C0865Wg) c0381Cx).A00 - c0381Cx.A00);
        }
        ByteBuffer buffer = c0381Cx.A01;
        byte[] array = buffer.array();
        int limit = buffer.limit();
        this.A02.A0b(array, limit);
        this.A01.A0C(array, limit);
        this.A01.A08(39);
        long ptsAdjustment = this.A01.A04(32);
        long A04 = (this.A01.A04(1) << 32) | ptsAdjustment;
        this.A01.A08(20);
        int spliceCommandType = this.A01.A04(12);
        int A042 = this.A01.A04(8);
        Metadata.Entry entry = null;
        this.A02.A0Z(14);
        if (A042 == 0) {
            entry = new SpliceNullCommand();
        } else if (A042 == 255) {
            entry = PrivateCommand.A00(this.A02, spliceCommandType, A04);
        } else if (A042 == 4) {
            entry = SpliceScheduleCommand.A00(this.A02);
        } else if (A042 == 5) {
            entry = SpliceInsertCommand.A00(this.A02, A04, this.A00);
        } else if (A042 == 6) {
            entry = TimeSignalCommand.A01(this.A02, A04, this.A00);
        }
        return entry == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(entry);
    }
}
