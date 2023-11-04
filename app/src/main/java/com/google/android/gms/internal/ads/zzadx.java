package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import cz.msebera.android.httpclient.message.TokenParser;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzadx extends zzadp {
    public static final Parcelable.Creator<zzadx> CREATOR = new zzadw();
    public final String zza;
    @Deprecated
    public final String zzb;
    public final zzfqk zzc;

    public zzadx(String str, String str2, List list) {
        super(str);
        zzdl.zzd(!list.isEmpty());
        this.zza = str2;
        zzfqk zzm = zzfqk.zzm(list);
        this.zzc = zzm;
        this.zzb = (String) zzm.get(0);
    }

    private static List zzb(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzadx zzadxVar = (zzadx) obj;
            if (zzew.zzU(this.zzf, zzadxVar.zzf) && zzew.zzU(this.zza, zzadxVar.zza) && this.zzc.equals(zzadxVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzf.hashCode() + 527;
        String str = this.zza;
        return (((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.zzc.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final String toString() {
        String str = this.zzf;
        String str2 = this.zza;
        String valueOf = String.valueOf(this.zzc);
        return str + ": description=" + str2 + ": values=" + valueOf;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeStringArray((String[]) this.zzc.toArray(new String[0]));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzadp, com.google.android.gms.internal.ads.zzbp
    public final void zza(zzbk zzbkVar) {
        char c;
        String str = this.zzf;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c = TokenParser.CR;
                    break;
                }
                c = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
                zzbkVar.zzq((CharSequence) this.zzc.get(0));
                return;
            case 2:
            case 3:
                zzbkVar.zze((CharSequence) this.zzc.get(0));
                return;
            case 4:
            case 5:
                zzbkVar.zzc((CharSequence) this.zzc.get(0));
                return;
            case 6:
            case 7:
                zzbkVar.zzd((CharSequence) this.zzc.get(0));
                return;
            case '\b':
            case '\t':
                String[] zzah = zzew.zzah((String) this.zzc.get(0), "/");
                try {
                    int parseInt = Integer.parseInt(zzah[0]);
                    Integer valueOf = zzah.length > 1 ? Integer.valueOf(Integer.parseInt(zzah[1])) : null;
                    zzbkVar.zzs(Integer.valueOf(parseInt));
                    zzbkVar.zzr(valueOf);
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            case '\n':
            case 11:
                try {
                    zzbkVar.zzl(Integer.valueOf(Integer.parseInt((String) this.zzc.get(0))));
                    return;
                } catch (NumberFormatException unused2) {
                    return;
                }
            case '\f':
            case '\r':
                try {
                    String str2 = (String) this.zzc.get(0);
                    int parseInt2 = Integer.parseInt(str2.substring(2, 4));
                    int parseInt3 = Integer.parseInt(str2.substring(0, 2));
                    zzbkVar.zzk(Integer.valueOf(parseInt2));
                    zzbkVar.zzj(Integer.valueOf(parseInt3));
                    return;
                } catch (NumberFormatException | StringIndexOutOfBoundsException unused3) {
                    return;
                }
            case 14:
                List zzb = zzb((String) this.zzc.get(0));
                int size = zzb.size();
                if (size != 1) {
                    if (size != 2) {
                        if (size != 3) {
                            return;
                        }
                        zzbkVar.zzj((Integer) zzb.get(2));
                    }
                    zzbkVar.zzk((Integer) zzb.get(1));
                }
                zzbkVar.zzl((Integer) zzb.get(0));
                return;
            case 15:
                List zzb2 = zzb((String) this.zzc.get(0));
                int size2 = zzb2.size();
                if (size2 != 1) {
                    if (size2 != 2) {
                        if (size2 != 3) {
                            return;
                        }
                        zzbkVar.zzm((Integer) zzb2.get(2));
                    }
                    zzbkVar.zzn((Integer) zzb2.get(1));
                }
                zzbkVar.zzo((Integer) zzb2.get(0));
                return;
            case 16:
            case 17:
                zzbkVar.zzf((CharSequence) this.zzc.get(0));
                return;
            case 18:
            case 19:
                zzbkVar.zzg((CharSequence) this.zzc.get(0));
                return;
            case 20:
            case 21:
                zzbkVar.zzt((CharSequence) this.zzc.get(0));
                return;
            default:
                return;
        }
    }
}
