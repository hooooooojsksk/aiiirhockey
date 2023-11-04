package com.facebook.ads.redexgen.X;

import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.MediaViewVideoRenderer;

/* loaded from: assets/audience_network.dex */
public class Y7 implements InterfaceC0596Ls {
    public final /* synthetic */ MediaViewListener A00;
    public final /* synthetic */ Y6 A01;

    public Y7(Y6 y6, MediaViewListener mediaViewListener) {
        this.A01 = y6;
        this.A00 = mediaViewListener;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0596Ls
    public final void AAY() {
        MediaView mediaView;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A03;
        mediaViewListener.onComplete(mediaView);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0596Ls
    public final void AAt() {
        MediaView mediaView;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A03;
        mediaViewListener.onEnterFullscreen(mediaView);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0596Ls
    public final void AAz() {
        MediaView mediaView;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A03;
        mediaViewListener.onExitFullscreen(mediaView);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0596Ls
    public final void AB5() {
        MediaView mediaView;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A03;
        mediaViewListener.onFullscreenBackground(mediaView);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0596Ls
    public final void AB7() {
        MediaView mediaView;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A03;
        mediaViewListener.onFullscreenForeground(mediaView);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0596Ls
    public final void ABy() {
        MediaView mediaView;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A03;
        mediaViewListener.onPlay(mediaView);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0596Ls
    public final void ADC() {
        MediaView mediaView;
        MediaViewVideoRenderer mediaViewVideoRenderer;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A03;
        mediaViewVideoRenderer = this.A01.A05;
        mediaViewListener.onVolumeChange(mediaView, mediaViewVideoRenderer.getVolume());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0596Ls
    public final void onPause() {
        MediaView mediaView;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A03;
        mediaViewListener.onPause(mediaView);
    }
}
