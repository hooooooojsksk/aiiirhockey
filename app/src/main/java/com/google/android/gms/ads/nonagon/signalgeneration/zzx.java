package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbcd;
import com.google.android.gms.internal.ads.zzbxo;
import com.google.android.gms.internal.ads.zzbxv;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzbzg;
import com.google.android.gms.internal.ads.zzdpd;
import com.google.android.gms.internal.ads.zzdpn;
import com.google.android.gms.internal.ads.zzfec;
import com.google.android.gms.internal.ads.zzfen;
import com.google.android.gms.internal.ads.zzfuf;
import com.google.android.gms.internal.ads.zzfut;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
final class zzx implements zzfuf {
    final /* synthetic */ zzfut zza;
    final /* synthetic */ zzbxv zzb;
    final /* synthetic */ zzbxo zzc;
    final /* synthetic */ zzfec zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzac zzf;

    public zzx(zzac zzacVar, zzfut zzfutVar, zzbxv zzbxvVar, zzbxo zzbxoVar, zzfec zzfecVar, long j) {
        this.zzf = zzacVar;
        this.zza = zzfutVar;
        this.zzb = zzbxvVar;
        this.zzc = zzbxoVar;
        this.zzd = zzfecVar;
        this.zze = j;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        zzdpn zzdpnVar;
        zzdpd zzdpdVar;
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - this.zze;
        String message = th.getMessage();
        com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "SignalGeneratorImpl.generateSignals");
        zzac zzacVar = this.zzf;
        zzdpnVar = zzacVar.zzr;
        zzdpdVar = zzacVar.zzj;
        zzf.zzc(zzdpnVar, zzdpdVar, "sgf", new Pair("sgf_reason", message), new Pair("tqgt", String.valueOf(currentTimeMillis)));
        zzfen zzr = zzac.zzr(this.zza, this.zzb);
        if (((Boolean) zzbcd.zze.zze()).booleanValue() && zzr != null) {
            zzfec zzfecVar = this.zzd;
            zzfecVar.zzg(th);
            zzfecVar.zzf(false);
            zzr.zza(zzfecVar);
            zzr.zzg();
        }
        try {
            zzbxo zzbxoVar = this.zzc;
            zzbxoVar.zzb("Internal error. " + message);
        } catch (RemoteException e) {
            zzbza.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdpn zzdpnVar;
        zzdpd zzdpdVar;
        zzdpd zzdpdVar2;
        boolean z;
        boolean z2;
        zzdpn zzdpnVar2;
        zzdpd zzdpdVar3;
        String str;
        String str2;
        String str3;
        String str4;
        Context context;
        zzbzg zzbzgVar;
        String str5;
        String str6;
        AtomicInteger atomicInteger;
        zzdpn zzdpnVar3;
        zzdpd zzdpdVar4;
        zzdpn zzdpnVar4;
        zzdpd zzdpdVar5;
        zzao zzaoVar = (zzao) obj;
        zzfen zzr = zzac.zzr(this.zza, this.zzb);
        if (!((Boolean) zzba.zzc().zzb(zzbar.zzhd)).booleanValue()) {
            try {
                this.zzc.zzb("QueryInfo generation has been disabled.");
            } catch (RemoteException e) {
                zzbza.zzg("QueryInfo generation has been disabled.".concat(e.toString()));
            }
            if (!((Boolean) zzbcd.zze.zze()).booleanValue() || zzr == null) {
                return;
            }
            zzfec zzfecVar = this.zzd;
            zzfecVar.zzc("QueryInfo generation has been disabled.");
            zzfecVar.zzf(false);
            zzr.zza(zzfecVar);
            zzr.zzg();
            return;
        }
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - this.zze;
        try {
            try {
                if (zzaoVar == null) {
                    this.zzc.zzc(null, null, null);
                    zzac zzacVar = this.zzf;
                    zzdpnVar4 = zzacVar.zzr;
                    zzdpdVar5 = zzacVar.zzj;
                    zzf.zzc(zzdpnVar4, zzdpdVar5, "sgs", new Pair("rid", "-1"));
                    this.zzd.zzf(true);
                    if (!((Boolean) zzbcd.zze.zze()).booleanValue() || zzr == null) {
                        return;
                    }
                    zzr.zza(this.zzd);
                    zzr.zzg();
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(zzaoVar.zzb);
                    String optString = jSONObject.optString("request_id", "");
                    if (TextUtils.isEmpty(optString)) {
                        zzbza.zzj("The request ID is empty in request JSON.");
                        this.zzc.zzb("Internal error: request ID is empty in request JSON.");
                        zzac zzacVar2 = this.zzf;
                        zzdpnVar3 = zzacVar2.zzr;
                        zzdpdVar4 = zzacVar2.zzj;
                        zzf.zzc(zzdpnVar3, zzdpdVar4, "sgf", new Pair("sgf_reason", "rid_missing"));
                        zzfec zzfecVar2 = this.zzd;
                        zzfecVar2.zzc("Request ID empty");
                        zzfecVar2.zzf(false);
                        if (!((Boolean) zzbcd.zze.zze()).booleanValue() || zzr == null) {
                            return;
                        }
                        zzr.zza(this.zzd);
                        zzr.zzg();
                        return;
                    }
                    zzac zzacVar3 = this.zzf;
                    String str7 = zzaoVar.zzb;
                    zzdpdVar2 = zzacVar3.zzj;
                    zzac.zzG(zzacVar3, optString, str7, zzdpdVar2);
                    Bundle bundle = zzaoVar.zzc;
                    zzac zzacVar4 = this.zzf;
                    z = zzacVar4.zzw;
                    if (z && bundle != null) {
                        str5 = zzacVar4.zzy;
                        if (bundle.getInt(str5, -1) == -1) {
                            zzac zzacVar5 = this.zzf;
                            str6 = zzacVar5.zzy;
                            atomicInteger = zzacVar5.zzz;
                            bundle.putInt(str6, atomicInteger.get());
                        }
                    }
                    zzac zzacVar6 = this.zzf;
                    z2 = zzacVar6.zzv;
                    if (z2 && bundle != null) {
                        str = zzacVar6.zzx;
                        if (TextUtils.isEmpty(bundle.getString(str))) {
                            str2 = this.zzf.zzB;
                            if (TextUtils.isEmpty(str2)) {
                                zzac zzacVar7 = this.zzf;
                                com.google.android.gms.ads.internal.util.zzs zzp = com.google.android.gms.ads.internal.zzt.zzp();
                                zzac zzacVar8 = this.zzf;
                                context = zzacVar8.zzg;
                                zzbzgVar = zzacVar8.zzA;
                                zzacVar7.zzB = zzp.zzc(context, zzbzgVar.zza);
                            }
                            zzac zzacVar9 = this.zzf;
                            str3 = zzacVar9.zzx;
                            str4 = zzacVar9.zzB;
                            bundle.putString(str3, str4);
                        }
                    }
                    this.zzc.zzc(zzaoVar.zza, zzaoVar.zzb, bundle);
                    zzac zzacVar10 = this.zzf;
                    zzdpnVar2 = zzacVar10.zzr;
                    zzdpdVar3 = zzacVar10.zzj;
                    Pair[] pairArr = new Pair[2];
                    pairArr[0] = new Pair("tqgt", String.valueOf(currentTimeMillis));
                    String str8 = "na";
                    if (((Boolean) zzba.zzc().zzb(zzbar.zziK)).booleanValue()) {
                        try {
                            str8 = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                        } catch (JSONException e2) {
                            zzbza.zzh("Error retrieving JSONObject from the requestJson, ", e2);
                        }
                    }
                    pairArr[1] = new Pair("tpc", str8);
                    zzf.zzc(zzdpnVar2, zzdpdVar3, "sgs", pairArr);
                    this.zzd.zzf(true);
                    if (!((Boolean) zzbcd.zze.zze()).booleanValue() || zzr == null) {
                        return;
                    }
                    zzr.zza(this.zzd);
                    zzr.zzg();
                } catch (JSONException e3) {
                    zzbza.zzj("Failed to create JSON object from the request string.");
                    zzbxo zzbxoVar = this.zzc;
                    String obj2 = e3.toString();
                    zzbxoVar.zzb("Internal error for request JSON: " + obj2);
                    zzac zzacVar11 = this.zzf;
                    zzdpnVar = zzacVar11.zzr;
                    zzdpdVar = zzacVar11.zzj;
                    zzf.zzc(zzdpnVar, zzdpdVar, "sgf", new Pair("sgf_reason", "request_invalid"));
                    zzfec zzfecVar3 = this.zzd;
                    zzfecVar3.zzg(e3);
                    zzfecVar3.zzf(false);
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(e3, "SignalGeneratorImpl.generateSignals.onSuccess");
                    if (!((Boolean) zzbcd.zze.zze()).booleanValue() || zzr == null) {
                        return;
                    }
                    zzr.zza(this.zzd);
                    zzr.zzg();
                }
            } catch (Throwable th) {
                if (((Boolean) zzbcd.zze.zze()).booleanValue() && zzr != null) {
                    zzr.zza(this.zzd);
                    zzr.zzg();
                }
                throw th;
            }
        } catch (RemoteException e4) {
            zzfec zzfecVar4 = this.zzd;
            zzfecVar4.zzg(e4);
            zzfecVar4.zzf(false);
            zzbza.zzh("", e4);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e4, "SignalGeneratorImpl.generateSignals.onSuccess");
            if (!((Boolean) zzbcd.zze.zze()).booleanValue() || zzr == null) {
                return;
            }
            zzr.zza(this.zzd);
            zzr.zzg();
        }
    }
}
