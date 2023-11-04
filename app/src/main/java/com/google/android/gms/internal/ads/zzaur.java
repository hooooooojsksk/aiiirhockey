package com.google.android.gms.internal.ads;

import cz.msebera.android.httpclient.message.TokenParser;
import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzaur {
    private final zzaug zza;
    private final int zzb;
    private String zzc;
    private final int zzd;

    public zzaur(int i, int i2, int i3) {
        this.zzb = i;
        i2 = (i2 > 64 || i2 < 0) ? 64 : 64;
        if (i3 <= 0) {
            this.zzd = 1;
        } else {
            this.zzd = i3;
        }
        this.zza = new zzaup(i2);
    }

    public final String zza(ArrayList arrayList, ArrayList arrayList2) {
        Collections.sort(arrayList2, new zzauq(this));
        HashSet hashSet = new HashSet();
        loop0: for (int i = 0; i < arrayList2.size(); i++) {
            String[] split = Normalizer.normalize((CharSequence) arrayList.get(((zzauf) arrayList2.get(i)).zze()), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if (split.length != 0) {
                for (String str : split) {
                    if (str.contains("'")) {
                        StringBuilder sb = new StringBuilder(str);
                        int i2 = 1;
                        boolean z = false;
                        while (true) {
                            int i3 = i2 + 2;
                            if (i3 > sb.length()) {
                                break;
                            }
                            if (sb.charAt(i2) == '\'') {
                                if (sb.charAt(i2 - 1) != ' ') {
                                    int i4 = i2 + 1;
                                    if ((sb.charAt(i4) == 's' || sb.charAt(i4) == 'S') && (i3 == sb.length() || sb.charAt(i3) == ' ')) {
                                        sb.insert(i2, TokenParser.SP);
                                        i2 = i3;
                                        z = true;
                                    }
                                }
                                sb.setCharAt(i2, TokenParser.SP);
                                z = true;
                            }
                            i2++;
                        }
                        String sb2 = z ? sb.toString() : null;
                        if (sb2 != null) {
                            this.zzc = sb2;
                            str = sb2;
                        }
                    }
                    String[] zzb = zzauk.zzb(str, true);
                    if (zzb.length >= this.zzd) {
                        for (int i5 = 0; i5 < zzb.length; i5++) {
                            String str2 = "";
                            for (int i6 = 0; i6 < this.zzd; i6++) {
                                int i7 = i5 + i6;
                                if (i7 >= zzb.length) {
                                    break;
                                }
                                if (i6 > 0) {
                                    str2 = str2.concat(" ");
                                }
                                str2 = str2.concat(String.valueOf(zzb[i7]));
                            }
                            hashSet.add(str2);
                            if (hashSet.size() >= this.zzb) {
                                break loop0;
                            }
                        }
                        if (hashSet.size() >= this.zzb) {
                            break loop0;
                        }
                    }
                }
                continue;
            }
        }
        zzaui zzauiVar = new zzaui();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                zzauiVar.zzb.write(this.zza.zzb((String) it.next()));
            } catch (IOException e) {
                zzbza.zzh("Error while writing hash to byteStream", e);
            }
        }
        return zzauiVar.toString();
    }
}
