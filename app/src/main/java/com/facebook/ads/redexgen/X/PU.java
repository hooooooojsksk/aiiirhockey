package com.facebook.ads.redexgen.X;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* loaded from: assets/audience_network.dex */
public class PU implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ C02386q A00;

    public PU(C02386q c02386q) {
        this.A00 = c02386q;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        new Handler(Looper.getMainLooper()).post(new C0550Jw(this, i));
    }
}
