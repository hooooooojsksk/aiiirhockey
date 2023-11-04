package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.games.GamesActivityResultCodes;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdzx {
    private final zzawe zza;
    private final Context zzb;
    private final zzdzb zzc;
    private final zzbzg zzd;
    private final String zze;
    private final zzfdk zzf;
    private final com.google.android.gms.ads.internal.util.zzg zzg = com.google.android.gms.ads.internal.zzt.zzo().zzh();

    public zzdzx(Context context, zzbzg zzbzgVar, zzawe zzaweVar, zzdzb zzdzbVar, String str, zzfdk zzfdkVar) {
        this.zzb = context;
        this.zzd = zzbzgVar;
        this.zza = zzaweVar;
        this.zzc = zzdzbVar;
        this.zze = str;
        this.zzf = zzfdkVar;
    }

    private static final void zzc(SQLiteDatabase sQLiteDatabase, ArrayList arrayList) {
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            zzayn zzaynVar = (zzayn) arrayList.get(i);
            if (zzaynVar.zzw() == 2 && zzaynVar.zze() > j) {
                j = zzaynVar.zze();
            }
        }
        if (j != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(j));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
    }

    public final void zzb(final boolean z) {
        try {
            this.zzc.zza(new zzfcd() { // from class: com.google.android.gms.internal.ads.zzdzt
                @Override // com.google.android.gms.internal.ads.zzfcd
                public final Object zza(Object obj) {
                    zzdzx.this.zza(z, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e) {
            zzbza.zzg("Error in offline signals database startup: ".concat(String.valueOf(e.getMessage())));
        }
    }

    public final /* synthetic */ Void zza(boolean z, SQLiteDatabase sQLiteDatabase) throws Exception {
        if (!z) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhS)).booleanValue()) {
                ArrayList zzc = zzdzq.zzc(sQLiteDatabase);
                zzayo zza = zzays.zza();
                zza.zzb(this.zzb.getPackageName());
                zza.zzd(Build.MODEL);
                zza.zze(zzdzq.zza(sQLiteDatabase, 0));
                zza.zza(zzc);
                zza.zzg(zzdzq.zza(sQLiteDatabase, 1));
                zza.zzc(zzdzq.zza(sQLiteDatabase, 3));
                zza.zzh(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis());
                zza.zzf(zzdzq.zzb(sQLiteDatabase, 2));
                final zzays zzaysVar = (zzays) zza.zzal();
                zzc(sQLiteDatabase, zzc);
                this.zza.zzb(new zzawd() { // from class: com.google.android.gms.internal.ads.zzdzu
                    @Override // com.google.android.gms.internal.ads.zzawd
                    public final void zza(zzaxt zzaxtVar) {
                        zzaxtVar.zzi(zzays.this);
                    }
                });
                zzazd zza2 = zzaze.zza();
                zza2.zza(this.zzd.zzb);
                zza2.zzc(this.zzd.zzc);
                zza2.zzb(true == this.zzd.zzd ? 0 : 2);
                final zzaze zzazeVar = (zzaze) zza2.zzal();
                this.zza.zzb(new zzawd() { // from class: com.google.android.gms.internal.ads.zzdzv
                    @Override // com.google.android.gms.internal.ads.zzawd
                    public final void zza(zzaxt zzaxtVar) {
                        zzaze zzazeVar2 = zzaze.this;
                        zzaxl zzaxlVar = (zzaxl) zzaxtVar.zzb().zzaB();
                        zzaxlVar.zzb(zzazeVar2);
                        zzaxtVar.zzg(zzaxlVar);
                    }
                });
                this.zza.zzc(GamesActivityResultCodes.RESULT_APP_MISCONFIGURED);
            } else {
                zzfdj zzb = zzfdj.zzb("oa_upload");
                zzb.zza("oa_failed_reqs", String.valueOf(zzdzq.zza(sQLiteDatabase, 0)));
                zzb.zza("oa_total_reqs", String.valueOf(zzdzq.zza(sQLiteDatabase, 1)));
                zzb.zza("oa_upload_time", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
                zzb.zza("oa_last_successful_time", String.valueOf(zzdzq.zzb(sQLiteDatabase, 2)));
                zzb.zza("oa_session_id", this.zzg.zzP() ? "" : this.zze);
                this.zzf.zzb(zzb);
                ArrayList zzc2 = zzdzq.zzc(sQLiteDatabase);
                zzc(sQLiteDatabase, zzc2);
                int size = zzc2.size();
                for (int i = 0; i < size; i++) {
                    zzayn zzaynVar = (zzayn) zzc2.get(i);
                    zzfdj zzb2 = zzfdj.zzb("oa_signals");
                    zzb2.zza("oa_session_id", this.zzg.zzP() ? "" : this.zze);
                    zzayi zzf = zzaynVar.zzf();
                    String valueOf = zzf.zzf() ? String.valueOf(zzf.zzh() - 1) : "-1";
                    String obj = zzfqy.zzb(zzaynVar.zzk(), new zzfnj() { // from class: com.google.android.gms.internal.ads.zzdzw
                        @Override // com.google.android.gms.internal.ads.zzfnj
                        public final Object apply(Object obj2) {
                            return ((zzaxc) obj2).name();
                        }
                    }).toString();
                    zzb2.zza("oa_sig_ts", String.valueOf(zzaynVar.zze()));
                    zzb2.zza("oa_sig_status", String.valueOf(zzaynVar.zzw() - 1));
                    zzb2.zza("oa_sig_resp_lat", String.valueOf(zzaynVar.zzd()));
                    zzb2.zza("oa_sig_render_lat", String.valueOf(zzaynVar.zzc()));
                    zzb2.zza("oa_sig_formats", obj);
                    zzb2.zza("oa_sig_nw_type", valueOf);
                    zzb2.zza("oa_sig_wifi", String.valueOf(zzaynVar.zzx() - 1));
                    zzb2.zza("oa_sig_airplane", String.valueOf(zzaynVar.zzt() - 1));
                    zzb2.zza("oa_sig_data", String.valueOf(zzaynVar.zzu() - 1));
                    zzb2.zza("oa_sig_nw_resp", String.valueOf(zzaynVar.zza()));
                    zzb2.zza("oa_sig_offline", String.valueOf(zzaynVar.zzv() - 1));
                    zzb2.zza("oa_sig_nw_state", String.valueOf(zzaynVar.zzj().zza()));
                    if (zzf.zze() && zzf.zzf() && zzf.zzh() == 2) {
                        zzb2.zza("oa_sig_cell_type", String.valueOf(zzf.zzg() - 1));
                    }
                    this.zzf.zzb(zzb2);
                }
            }
            zzdzq.zzf(sQLiteDatabase);
            return null;
        }
        this.zzb.deleteDatabase("OfflineUpload.db");
        return null;
    }
}
