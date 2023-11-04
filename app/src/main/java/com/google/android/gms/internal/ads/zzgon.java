package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgom;
import com.google.android.gms.internal.ads.zzgon;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public abstract class zzgon<MessageType extends zzgon<MessageType, BuilderType>, BuilderType extends zzgom<MessageType, BuilderType>> implements zzgrw {
    protected int zza = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static void zzav(Iterable iterable, List list) {
        zzgqw.zze(iterable);
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
        }
        int size = list.size();
        for (Object obj : iterable) {
            if (obj != null) {
                list.add(obj);
            } else {
                String str = "Element at index " + (list.size() - size) + " is null.";
                int size2 = list.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        break;
                    }
                    list.remove(size2);
                }
                throw new NullPointerException(str);
            }
        }
    }

    public int zzat(zzgsp zzgspVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgrw
    public final zzgpe zzau() {
        try {
            int zzaz = zzaz();
            zzgpe zzgpeVar = zzgpe.zzb;
            byte[] bArr = new byte[zzaz];
            zzgpt zzG = zzgpt.zzG(bArr);
            zzaV(zzG);
            zzG.zzI();
            return new zzgpa(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    public final void zzaw(OutputStream outputStream) throws IOException {
        zzgpt zzH = zzgpt.zzH(outputStream, zzgpt.zzB(zzaz()));
        zzaV(zzH);
        zzH.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzgrw
    public final byte[] zzax() {
        try {
            byte[] bArr = new byte[zzaz()];
            zzgpt zzG = zzgpt.zzG(bArr);
            zzaV(zzG);
            zzG.zzI();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}
