package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.os.Handler;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.i;

/* loaded from: classes.dex */
public interface AudioRendererEventListener {

    /* loaded from: classes.dex */
    public static final class EventDispatcher {
        private final Handler handler;
        private final AudioRendererEventListener listener;

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public final /* synthetic */ DecoderCounters a;

            public a(DecoderCounters decoderCounters) {
                EventDispatcher.this = r1;
                this.a = decoderCounters;
            }

            @Override // java.lang.Runnable
            public void run() {
                EventDispatcher.this.listener.onAudioEnabled(this.a);
            }
        }

        /* loaded from: classes.dex */
        public class b implements Runnable {
            public final /* synthetic */ String a;
            public final /* synthetic */ long b;
            public final /* synthetic */ long c;

            public b(String str, long j, long j2) {
                EventDispatcher.this = r1;
                this.a = str;
                this.b = j;
                this.c = j2;
            }

            @Override // java.lang.Runnable
            public void run() {
                EventDispatcher.this.listener.onAudioDecoderInitialized(this.a, this.b, this.c);
            }
        }

        /* loaded from: classes.dex */
        public class c implements Runnable {
            public final /* synthetic */ i a;

            public c(i iVar) {
                EventDispatcher.this = r1;
                this.a = iVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                EventDispatcher.this.listener.onAudioInputFormatChanged(this.a);
            }
        }

        /* loaded from: classes.dex */
        public class d implements Runnable {
            public final /* synthetic */ int a;
            public final /* synthetic */ long b;
            public final /* synthetic */ long c;

            public d(int i, long j, long j2) {
                EventDispatcher.this = r1;
                this.a = i;
                this.b = j;
                this.c = j2;
            }

            @Override // java.lang.Runnable
            public void run() {
                EventDispatcher.this.listener.onAudioTrackUnderrun(this.a, this.b, this.c);
            }
        }

        /* loaded from: classes.dex */
        public class e implements Runnable {
            public final /* synthetic */ DecoderCounters a;

            public e(DecoderCounters decoderCounters) {
                EventDispatcher.this = r1;
                this.a = decoderCounters;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.a.ensureUpdated();
                EventDispatcher.this.listener.onAudioDisabled(this.a);
            }
        }

        /* loaded from: classes.dex */
        public class f implements Runnable {
            public final /* synthetic */ int a;

            public f(int i) {
                EventDispatcher.this = r1;
                this.a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                EventDispatcher.this.listener.onAudioSessionId(this.a);
            }
        }

        public EventDispatcher(Handler handler, AudioRendererEventListener audioRendererEventListener) {
            this.handler = audioRendererEventListener != null ? (Handler) com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(handler) : null;
            this.listener = audioRendererEventListener;
        }

        public void audioSessionId(int i) {
            if (this.listener != null) {
                this.handler.post(new f(i));
            }
        }

        public void audioTrackUnderrun(int i, long j, long j2) {
            if (this.listener != null) {
                this.handler.post(new d(i, j, j2));
            }
        }

        public void decoderInitialized(String str, long j, long j2) {
            if (this.listener != null) {
                this.handler.post(new b(str, j, j2));
            }
        }

        public void disabled(DecoderCounters decoderCounters) {
            if (this.listener != null) {
                this.handler.post(new e(decoderCounters));
            }
        }

        public void enabled(DecoderCounters decoderCounters) {
            if (this.listener != null) {
                this.handler.post(new a(decoderCounters));
            }
        }

        public void inputFormatChanged(i iVar) {
            if (this.listener != null) {
                this.handler.post(new c(iVar));
            }
        }
    }

    void onAudioDecoderInitialized(String str, long j, long j2);

    void onAudioDisabled(DecoderCounters decoderCounters);

    void onAudioEnabled(DecoderCounters decoderCounters);

    void onAudioInputFormatChanged(i iVar);

    void onAudioSessionId(int i);

    void onAudioTrackUnderrun(int i, long j, long j2);
}
