package com.google.android.gms.games;

import com.google.android.gms.common.Feature;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzd {
    public static final Feature zza;
    public static final Feature zzb;
    public static final Feature zzc;
    public static final Feature zzd;
    public static final Feature zze;
    public static final Feature[] zzf;

    static {
        Feature feature = new Feature("games_get_account_selection_intent", 1L);
        zza = feature;
        Feature feature2 = new Feature("games_get_privacy_settings_intent", 1L);
        zzb = feature2;
        Feature feature3 = new Feature("games_load_player_force_reload", 1L);
        zzc = feature3;
        Feature feature4 = new Feature("games_load_profile_capabilities", 2L);
        zzd = feature4;
        Feature feature5 = new Feature("games_recall", 1L);
        zze = feature5;
        zzf = new Feature[]{feature, feature2, feature3, feature4, feature5};
    }
}
