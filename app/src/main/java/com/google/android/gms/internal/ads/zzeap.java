package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzeap implements zzeaq {
    private static zzffp zzf(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 112202875) {
            if (hashCode == 714893483 && str.equals("nativeDisplay")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("video")) {
                c = 2;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    return null;
                }
                return zzffp.VIDEO;
            }
            return zzffp.NATIVE_DISPLAY;
        }
        return zzffp.HTML_DISPLAY;
    }

    private static zzffr zzg(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -1104128070) {
            if (str.equals("beginToRender")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 1318088141) {
            if (hashCode == 1988248512 && str.equals("onePixel")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("definedByJavascript")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                if (c == 2) {
                    return zzffr.ONE_PIXEL;
                }
                return zzffr.UNSPECIFIED;
            }
            return zzffr.DEFINED_BY_JAVASCRIPT;
        }
        return zzffr.BEGIN_TO_RENDER;
    }

    private static zzffs zzh(String str) {
        if ("native".equals(str)) {
            return zzffs.NATIVE;
        }
        if ("javascript".equals(str)) {
            return zzffs.JAVASCRIPT;
        }
        return zzffs.NONE;
    }

    @Override // com.google.android.gms.internal.ads.zzeaq
    public final IObjectWrapper zza(String str, WebView webView, String str2, String str3, String str4, zzeas zzeasVar, zzear zzearVar, String str5) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeC)).booleanValue() && zzffi.zzb()) {
            zzfft zza = zzfft.zza("Google", str);
            zzffs zzh = zzh("javascript");
            zzffp zzf = zzf(zzearVar.toString());
            if (zzh == zzffs.NONE) {
                zzbza.zzj("Omid html session error; Unable to parse impression owner: javascript");
                return null;
            } else if (zzf == null) {
                zzbza.zzj("Omid html session error; Unable to parse creative type: ".concat(String.valueOf(String.valueOf(zzearVar))));
                return null;
            } else {
                zzffs zzh2 = zzh(str4);
                if (zzf != zzffp.VIDEO || zzh2 != zzffs.NONE) {
                    return ObjectWrapper.wrap(zzffk.zza(zzffl.zza(zzf, zzg(zzeasVar.toString()), zzh, zzh2, true), zzffm.zzb(zza, webView, str5, "")));
                }
                zzbza.zzj("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
                return null;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzeaq
    public final IObjectWrapper zzb(String str, WebView webView, String str2, String str3, String str4, String str5, zzeas zzeasVar, zzear zzearVar, String str6) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeC)).booleanValue() && zzffi.zzb()) {
            zzfft zza = zzfft.zza(str5, str);
            zzffs zzh = zzh("javascript");
            zzffs zzh2 = zzh(str4);
            zzffp zzf = zzf(zzearVar.toString());
            if (zzh == zzffs.NONE) {
                zzbza.zzj("Omid js session error; Unable to parse impression owner: javascript");
                return null;
            } else if (zzf == null) {
                zzbza.zzj("Omid js session error; Unable to parse creative type: ".concat(String.valueOf(String.valueOf(zzearVar))));
                return null;
            } else if (zzf != zzffp.VIDEO || zzh2 != zzffs.NONE) {
                return ObjectWrapper.wrap(zzffk.zza(zzffl.zza(zzf, zzg(zzeasVar.toString()), zzh, zzh2, true), zzffm.zzc(zza, webView, str6, "")));
            } else {
                zzbza.zzj("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
                return null;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzeaq
    public final void zzc(IObjectWrapper iObjectWrapper, View view) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeC)).booleanValue() && zzffi.zzb()) {
            Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (unwrap instanceof zzffk) {
                ((zzffk) unwrap).zzd(view);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeaq
    public final void zzd(IObjectWrapper iObjectWrapper) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeC)).booleanValue() && zzffi.zzb()) {
            Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (unwrap instanceof zzffk) {
                ((zzffk) unwrap).zze();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeaq
    public final boolean zze(Context context) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeC)).booleanValue()) {
            zzbza.zzj("Omid flag is disabled");
            return false;
        } else if (zzffi.zzb()) {
            return true;
        } else {
            zzffi.zza(context);
            return zzffi.zzb();
        }
    }
}
