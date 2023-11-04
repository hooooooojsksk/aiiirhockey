package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgqi;
import com.google.android.gms.internal.ads.zzgqm;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public class zzgqi<MessageType extends zzgqm<MessageType, BuilderType>, BuilderType extends zzgqi<MessageType, BuilderType>> extends zzgom<MessageType, BuilderType> {
    protected zzgqm zza;
    private final zzgqm zzb;

    public zzgqi(MessageType messagetype) {
        this.zzb = messagetype;
        if (!messagetype.zzaX()) {
            this.zza = messagetype.zzaD();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    private static void zza(Object obj, Object obj2) {
        zzgse.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzgom
    /* renamed from: zzai */
    public final zzgqi zzah() {
        zzgqi zzgqiVar = (zzgqi) this.zzb.zzb(5, null, null);
        zzgqiVar.zza = zzan();
        return zzgqiVar;
    }

    public final zzgqi zzaj(zzgqm zzgqmVar) {
        if (!this.zzb.equals(zzgqmVar)) {
            if (!this.zza.zzaX()) {
                zzaq();
            }
            zza(this.zza, zzgqmVar);
        }
        return this;
    }

    public final zzgqi zzak(byte[] bArr, int i, int i2, zzgpy zzgpyVar) throws zzgqy {
        if (!this.zza.zzaX()) {
            zzaq();
        }
        try {
            zzgse.zza().zzb(this.zza.getClass()).zzi(this.zza, bArr, 0, i2, new zzgoq(zzgpyVar));
            return this;
        } catch (zzgqy e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzgqy.zzj();
        }
    }

    public final MessageType zzal() {
        MessageType zzan = zzan();
        if (zzan.zzaW()) {
            return zzan;
        }
        throw new zzgtf(zzan);
    }

    @Override // com.google.android.gms.internal.ads.zzgrv
    /* renamed from: zzam */
    public MessageType zzan() {
        if (this.zza.zzaX()) {
            this.zza.zzaR();
            return (MessageType) this.zza;
        }
        return (MessageType) this.zza;
    }

    public final void zzap() {
        if (this.zza.zzaX()) {
            return;
        }
        zzaq();
    }

    protected void zzaq() {
        zzgqm zzaD = this.zzb.zzaD();
        zza(zzaD, this.zza);
        this.zza = zzaD;
    }

    @Override // com.google.android.gms.internal.ads.zzgrx
    public final /* synthetic */ zzgrw zzbf() {
        throw null;
    }
}
