package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public class zzalt extends zzako {
    private final Object zza;
    private final zzakt zzb;

    public zzalt(int i, String str, zzakt zzaktVar, zzaks zzaksVar) {
        super(i, str, zzaksVar);
        this.zza = new Object();
        this.zzb = zzaktVar;
    }

    @Override // com.google.android.gms.internal.ads.zzako
    public final zzaku zzh(zzakk zzakkVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzakkVar.zzb;
            Map map = zzakkVar.zzc;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] split = str2.split(";", 0);
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    String[] split2 = split[i].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str3 = split2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzakkVar.zzb);
        }
        return zzaku.zzb(str, zzall.zzb(zzakkVar));
    }

    @Override // com.google.android.gms.internal.ads.zzako
    /* renamed from: zzz */
    public void zzo(String str) {
        zzakt zzaktVar;
        synchronized (this.zza) {
            zzaktVar = this.zzb;
        }
        zzaktVar.zza(str);
    }
}
