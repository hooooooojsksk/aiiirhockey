package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzgqz extends InputStream {
    private Iterator zza;
    private ByteBuffer zzb;
    private int zzc = 0;
    private int zzd;
    private int zze;
    private boolean zzf;
    private byte[] zzg;
    private int zzh;
    private long zzi;

    public zzgqz(Iterable iterable) {
        this.zza = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            this.zzc++;
        }
        this.zzd = -1;
        if (zzb()) {
            return;
        }
        this.zzb = zzgqw.zze;
        this.zzd = 0;
        this.zze = 0;
        this.zzi = 0L;
    }

    private final void zza(int i) {
        int i2 = this.zze + i;
        this.zze = i2;
        if (i2 == this.zzb.limit()) {
            zzb();
        }
    }

    private final boolean zzb() {
        this.zzd++;
        if (this.zza.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) this.zza.next();
            this.zzb = byteBuffer;
            this.zze = byteBuffer.position();
            if (this.zzb.hasArray()) {
                this.zzf = true;
                this.zzg = this.zzb.array();
                this.zzh = this.zzb.arrayOffset();
            } else {
                this.zzf = false;
                this.zzi = zzgtq.zze(this.zzb);
                this.zzg = null;
            }
            return true;
        }
        return false;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.zzd == this.zzc) {
            return -1;
        }
        if (this.zzf) {
            int i = this.zzg[this.zze + this.zzh] & UByte.MAX_VALUE;
            zza(1);
            return i;
        }
        int zza = zzgtq.zza(this.zze + this.zzi) & UByte.MAX_VALUE;
        zza(1);
        return zza;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.zzd == this.zzc) {
            return -1;
        }
        int limit = this.zzb.limit();
        int i3 = this.zze;
        int i4 = limit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.zzf) {
            System.arraycopy(this.zzg, i3 + this.zzh, bArr, i, i2);
            zza(i2);
        } else {
            int position = this.zzb.position();
            ByteBuffer byteBuffer = (ByteBuffer) this.zzb.position(this.zze);
            this.zzb.get(bArr, i, i2);
            ByteBuffer byteBuffer2 = (ByteBuffer) this.zzb.position(position);
            zza(i2);
        }
        return i2;
    }
}
