package com.fyber.inneractive.sdk.util;

import java.nio.ByteBuffer;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public class d {
    public static d b = new d();
    public Queue<ByteBuffer> a = new ConcurrentLinkedQueue();

    public d() {
        for (int i = 0; i < 2; i++) {
            this.a.offer(a());
        }
    }

    public final ByteBuffer a() {
        return ByteBuffer.allocateDirect(16384);
    }

    public ByteBuffer b() {
        ByteBuffer poll = this.a.poll();
        return poll == null ? ByteBuffer.allocateDirect(16384) : poll;
    }

    public byte[] a(ByteBuffer byteBuffer) {
        return (byteBuffer == null || !byteBuffer.hasArray()) ? new byte[8192] : byteBuffer.array();
    }
}
