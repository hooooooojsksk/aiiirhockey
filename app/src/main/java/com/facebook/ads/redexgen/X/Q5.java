package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.view.View;
import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public interface Q5 {
    void A87();

    boolean A8I();

    boolean A8J();

    boolean A8q();

    void ADO(boolean z, int i);

    void AFH(int i);

    void AFM(PK pk, int i);

    void AFT(int i);

    void destroy();

    int getCurrentPosition();

    int getDuration();

    long getInitialBufferTime();

    PK getStartReason();

    Q7 getState();

    int getVideoHeight();

    int getVideoWidth();

    View getView();

    float getVolume();

    void seekTo(int i);

    void setBackgroundPlaybackEnabled(boolean z);

    void setControlsAnchorView(View view);

    void setFullScreen(boolean z);

    void setRequestedVolume(float f);

    void setVideoMPD(@Nullable String str);

    void setVideoStateChangeListener(@Nullable Q8 q8);

    void setup(Uri uri);
}
