package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzcdf extends zzfa implements zzgd {
    private static final Pattern zzb = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference zzc = new AtomicReference();
    private final SSLSocketFactory zzd;
    private final int zze;
    private final int zzf;
    private final String zzg;
    private final zzgc zzh;
    private zzfl zzi;
    private HttpURLConnection zzj;
    private InputStream zzk;
    private boolean zzl;
    private int zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private int zzr;
    private final Set zzs;

    public zzcdf(String str, zzgi zzgiVar, int i, int i2, int i3) {
        super(true);
        this.zzd = new zzcde(this);
        this.zzs = new HashSet();
        zzdl.zzc(str);
        this.zzg = str;
        this.zzh = new zzgc();
        this.zze = i;
        this.zzf = i2;
        this.zzr = i3;
        if (zzgiVar != null) {
            zzf(zzgiVar);
        }
    }

    private final void zzn() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                zzbza.zzh("Unexpected error while disconnecting", e);
            }
            this.zzj = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x0102, code lost:
        if (r2 == 0) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00b9 A[Catch: IOException -> 0x0292, TryCatch #3 {IOException -> 0x0292, blocks: (B:130:0x000e, B:131:0x0025, B:133:0x002b, B:135:0x0035, B:136:0x003d, B:137:0x0055, B:139:0x005b, B:146:0x007f, B:148:0x0099, B:149:0x00ab, B:150:0x00b0, B:152:0x00b9, B:153:0x00c0, B:166:0x00e8, B:220:0x0237, B:222:0x0242, B:224:0x0253, B:227:0x025c, B:228:0x026b, B:230:0x0273, B:231:0x027a, B:232:0x027b, B:233:0x0291), top: B:244:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0242 A[Catch: IOException -> 0x0292, TryCatch #3 {IOException -> 0x0292, blocks: (B:130:0x000e, B:131:0x0025, B:133:0x002b, B:135:0x0035, B:136:0x003d, B:137:0x0055, B:139:0x005b, B:146:0x007f, B:148:0x0099, B:149:0x00ab, B:150:0x00b0, B:152:0x00b9, B:153:0x00c0, B:166:0x00e8, B:220:0x0237, B:222:0x0242, B:224:0x0253, B:227:0x025c, B:228:0x026b, B:230:0x0273, B:231:0x027a, B:232:0x027b, B:233:0x0291), top: B:244:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0273 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzfg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzb(com.google.android.gms.internal.ads.zzfl r21) throws com.google.android.gms.internal.ads.zzfz {
        /*
            Method dump skipped, instructions count: 689
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdf.zzb(com.google.android.gms.internal.ads.zzfl):long");
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    public final void zzd() throws zzfz {
        try {
            if (this.zzk != null) {
                HttpURLConnection httpURLConnection = this.zzj;
                long j = this.zzo;
                if (j != -1) {
                    j -= this.zzq;
                }
                if (zzew.zza == 19 || zzew.zza == 20) {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (j == -1) {
                            if (inputStream.read() != -1) {
                            }
                        } else if (j <= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) {
                        }
                        String name = inputStream.getClass().getName();
                        if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || name.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                            Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                            declaredMethod.setAccessible(true);
                            declaredMethod.invoke(inputStream, new Object[0]);
                        }
                    } catch (Exception unused) {
                    }
                }
                try {
                    this.zzk.close();
                } catch (IOException e) {
                    throw new zzfz(e, this.zzi, 2000, 3);
                }
            }
        } finally {
            this.zzk = null;
            zzn();
            if (this.zzl) {
                this.zzl = false;
                zzh();
            }
            this.zzs.clear();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfa, com.google.android.gms.internal.ads.zzfg
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public final void zzm(int i) {
        this.zzr = i;
        for (Socket socket : this.zzs) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzr);
                } catch (SocketException e) {
                    zzbza.zzk("Failed to update receive buffer size.", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzr
    public final int zza(byte[] bArr, int i, int i2) throws zzfz {
        try {
            if (this.zzp != this.zzn) {
                byte[] bArr2 = (byte[]) zzc.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j = this.zzp;
                    long j2 = this.zzn;
                    if (j != j2) {
                        int read = this.zzk.read(bArr2, 0, (int) Math.min(j2 - j, bArr2.length));
                        if (Thread.interrupted()) {
                            throw new InterruptedIOException();
                        }
                        if (read != -1) {
                            this.zzp += read;
                            zzg(read);
                        } else {
                            throw new EOFException();
                        }
                    } else {
                        zzc.set(bArr2);
                        break;
                    }
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.zzo;
            if (j3 != -1) {
                long j4 = j3 - this.zzq;
                if (j4 != 0) {
                    i2 = (int) Math.min(i2, j4);
                }
                return -1;
            }
            int read2 = this.zzk.read(bArr, i, i2);
            if (read2 == -1) {
                if (this.zzo == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.zzq += read2;
            zzg(read2);
            return read2;
        } catch (IOException e) {
            throw new zzfz(e, this.zzi, 2000, 2);
        }
    }
}
