package com.facebook.ads.redexgen.X;

import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.9z */
/* loaded from: assets/audience_network.dex */
public interface InterfaceC03199z {
    void onAudioSessionId(C03189y c03189y, int i);

    void onAudioUnderrun(C03189y c03189y, int i, long j, long j2);

    void onDecoderDisabled(C03189y c03189y, int i, C0335Ap c0335Ap);

    void onDecoderEnabled(C03189y c03189y, int i, C0335Ap c0335Ap);

    void onDecoderInitialized(C03189y c03189y, int i, String str, long j);

    void onDecoderInputFormatChanged(C03189y c03189y, int i, Format format);

    void onDownstreamFormatChanged(C03189y c03189y, C0413Eg c0413Eg);

    void onDrmKeysLoaded(C03189y c03189y);

    void onDrmKeysRemoved(C03189y c03189y);

    void onDrmKeysRestored(C03189y c03189y);

    void onDrmSessionManagerError(C03189y c03189y, Exception exc);

    void onDroppedVideoFrames(C03189y c03189y, int i, long j);

    void onLoadError(C03189y c03189y, C0412Ef c0412Ef, C0413Eg c0413Eg, IOException iOException, boolean z);

    void onLoadingChanged(C03189y c03189y, boolean z);

    void onMediaPeriodCreated(C03189y c03189y);

    void onMediaPeriodReleased(C03189y c03189y);

    void onMetadata(C03189y c03189y, Metadata metadata);

    void onPlaybackParametersChanged(C03189y c03189y, C02959a c02959a);

    void onPlayerError(C03189y c03189y, C9F c9f);

    void onPlayerStateChanged(C03189y c03189y, boolean z, int i);

    void onPositionDiscontinuity(C03189y c03189y, int i);

    void onReadingStarted(C03189y c03189y);

    void onRenderedFirstFrame(C03189y c03189y, Surface surface);

    void onSeekProcessed(C03189y c03189y);

    void onSeekStarted(C03189y c03189y);

    void onTimelineChanged(C03189y c03189y, int i);

    void onTracksChanged(C03189y c03189y, TrackGroupArray trackGroupArray, GK gk);

    void onVideoSizeChanged(C03189y c03189y, int i, int i2, int i3, float f);
}
