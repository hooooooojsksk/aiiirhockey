package com.fyber.inneractive.sdk.util;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class d0 extends BufferedInputStream {
    public final /* synthetic */ AtomicInteger a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(InputStream inputStream, AtomicInteger atomicInteger) {
        super(inputStream);
        this.a = atomicInteger;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        int read;
        read = super.read(bArr, i, i2);
        if (read != -1) {
            this.a.getAndAdd(read);
        }
        return read;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        this.a.set(0);
        super.reset();
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j) throws IOException {
        long skip;
        skip = super.skip(j);
        this.a.addAndGet((int) skip);
        return skip;
    }
}
