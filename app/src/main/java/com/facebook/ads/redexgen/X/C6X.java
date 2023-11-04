package com.facebook.ads.redexgen.X;

import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.6X */
/* loaded from: assets/audience_network.dex */
public final class C6X extends PR {
    public static String[] A01 = {"4h8fvEACfo1aNbNL", "KiY64Fil", "L", "TPcthrsJz3ToBiwYAQ4xewU", "cWfSExW1cmjdZd3Ek8eXqqhjC3VFU", "NINEnIjXlG8iO8hrf55I2V2lHb1VufX", "CO", "8GF4DU4RrtKBXlYvExHV9F2Nh74lSozH"};
    public final C8V<MK> A00;

    public C6X(C0887Xc c0887Xc) {
        this(c0887Xc, null);
    }

    public C6X(C0887Xc c0887Xc, AttributeSet attributeSet) {
        this(c0887Xc, attributeSet, 0);
    }

    public C6X(C0887Xc c0887Xc, AttributeSet attributeSet, int i) {
        super(c0887Xc, attributeSet, i);
        this.A00 = new JX(this);
        int applyDimension = (int) TypedValue.applyDimension(1, 40.0f, getResources().getDisplayMetrics());
        ProgressBar progressBar = new ProgressBar(getContext());
        progressBar.setIndeterminate(true);
        progressBar.getIndeterminateDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_IN);
        RelativeLayout.LayoutParams spinnerParams = new RelativeLayout.LayoutParams(applyDimension, applyDimension);
        spinnerParams.addRule(13);
        addView(progressBar, spinnerParams);
    }

    @Override // com.facebook.ads.redexgen.X.PR
    public final void A07() {
        super.A07();
        setVisibility(0);
        if (getVideoView() != null) {
            RA videoView = getVideoView();
            String[] strArr = A01;
            if (strArr[2].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[7] = "LLc1CvKTLQ71W60sfu5S1t2gX7MmeGtJ";
            videoView.getEventBus().A05(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.PR
    public final void A08() {
        if (getVideoView() != null) {
            C8U<C8V, C8T> eventBus = getVideoView().getEventBus();
            C8V<MK> c8v = this.A00;
            String[] strArr = A01;
            if (strArr[2].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[3] = "4Zu3PRCBzV1MZjgNBq7KORh";
            strArr2[1] = "VnRIjxfO";
            eventBus.A06(c8v);
        }
        setVisibility(8);
        super.A08();
    }
}
