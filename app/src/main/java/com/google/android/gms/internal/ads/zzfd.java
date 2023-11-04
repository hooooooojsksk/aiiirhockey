package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.ads.AdError;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfd extends zzfa {
    private final ContentResolver zza;
    private Uri zzb;
    private AssetFileDescriptor zzc;
    private FileInputStream zzd;
    private long zze;
    private boolean zzf;

    public zzfd(Context context) {
        super(false);
        this.zza = context.getContentResolver();
    }

    @Override // com.google.android.gms.internal.ads.zzr
    public final int zza(byte[] bArr, int i, int i2) throws zzfc {
        if (i2 == 0) {
            return 0;
        }
        long j = this.zze;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new zzfc(e, 2000);
                }
            }
            FileInputStream fileInputStream = this.zzd;
            int i3 = zzew.zza;
            int read = fileInputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            long j2 = this.zze;
            if (j2 != -1) {
                this.zze = j2 - read;
            }
            zzg(read);
            return read;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    public final long zzb(zzfl zzflVar) throws zzfc {
        AssetFileDescriptor openAssetFileDescriptor;
        long j;
        try {
            Uri uri = zzflVar.zza;
            this.zzb = uri;
            zzi(zzflVar);
            if (FirebaseAnalytics.Param.CONTENT.equals(zzflVar.zza.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = this.zza.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                openAssetFileDescriptor = this.zza.openAssetFileDescriptor(uri, "r");
            }
            this.zzc = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new zzfc(new IOException("Could not open file descriptor for: " + String.valueOf(uri)), 2000);
            }
            long length = openAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
            this.zzd = fileInputStream;
            if (length != -1 && zzflVar.zzf > length) {
                throw new zzfc(null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            long startOffset = openAssetFileDescriptor.getStartOffset();
            long skip = fileInputStream.skip(zzflVar.zzf + startOffset) - startOffset;
            if (skip != zzflVar.zzf) {
                throw new zzfc(null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.zze = -1L;
                    j = -1;
                } else {
                    j = size - channel.position();
                    this.zze = j;
                    if (j < 0) {
                        throw new zzfc(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                }
            } else {
                long j2 = length - skip;
                this.zze = j2;
                if (j2 < 0) {
                    throw new zzfc(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
                j = j2;
            }
            long j3 = zzflVar.zzg;
            if (j3 != -1) {
                if (j != -1) {
                    j3 = Math.min(j, j3);
                }
                this.zze = j3;
            }
            this.zzf = true;
            zzj(zzflVar);
            long j4 = zzflVar.zzg;
            return j4 != -1 ? j4 : this.zze;
        } catch (zzfc e) {
            throw e;
        } catch (IOException e2) {
            throw new zzfc(e2, true == (e2 instanceof FileNotFoundException) ? 2005 : 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    public final void zzd() throws zzfc {
        this.zzb = null;
        try {
            try {
                FileInputStream fileInputStream = this.zzd;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.zzd = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.zzc;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new zzfc(e, 2000);
                    }
                } finally {
                    this.zzc = null;
                    if (this.zzf) {
                        this.zzf = false;
                        zzh();
                    }
                }
            } catch (Throwable th) {
                this.zzd = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.zzc;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.zzc = null;
                        if (this.zzf) {
                            this.zzf = false;
                            zzh();
                        }
                        throw th;
                    } catch (Throwable th2) {
                        this.zzc = null;
                        if (this.zzf) {
                            this.zzf = false;
                            zzh();
                        }
                        throw th2;
                    }
                } catch (IOException e2) {
                    throw new zzfc(e2, 2000);
                }
            }
        } catch (IOException e3) {
            throw new zzfc(e3, 2000);
        }
    }
}
