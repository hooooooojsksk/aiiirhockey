package com.google.android.gms.internal.drive;

import java.util.Iterator;

/* loaded from: classes2.dex */
final class zznc implements Iterator<String> {
    private final /* synthetic */ zzna zzvw;
    private Iterator<String> zzvx;

    public zznc(zzna zznaVar) {
        zzkz zzkzVar;
        this.zzvw = zznaVar;
        zzkzVar = zznaVar.zzvt;
        this.zzvx = zzkzVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzvx.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.zzvx.next();
    }
}
