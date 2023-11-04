package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.CollectionUtils;
import cz.msebera.android.httpclient.client.config.CookieSpecs;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbpz extends zzbqf {
    static final Set zza = CollectionUtils.setOf("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    private String zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private final Object zzj;
    private final zzcei zzk;
    private final Activity zzl;
    private zzcfx zzm;
    private ImageView zzn;
    private LinearLayout zzo;
    private final zzbqg zzp;
    private PopupWindow zzq;
    private RelativeLayout zzr;
    private ViewGroup zzs;

    public zzbpz(zzcei zzceiVar, zzbqg zzbqgVar) {
        super(zzceiVar, "resize");
        this.zzb = "top-right";
        this.zzc = true;
        this.zzd = 0;
        this.zze = 0;
        this.zzf = -1;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = -1;
        this.zzj = new Object();
        this.zzk = zzceiVar;
        this.zzl = zzceiVar.zzi();
        this.zzp = zzbqgVar;
    }

    public final void zza(boolean z) {
        synchronized (this.zzj) {
            PopupWindow popupWindow = this.zzq;
            if (popupWindow != null) {
                popupWindow.dismiss();
                this.zzr.removeView((View) this.zzk);
                ViewGroup viewGroup = this.zzs;
                if (viewGroup != null) {
                    viewGroup.removeView(this.zzn);
                    this.zzs.addView((View) this.zzk);
                    this.zzk.zzag(this.zzm);
                }
                if (z) {
                    zzk(CookieSpecs.DEFAULT);
                    zzbqg zzbqgVar = this.zzp;
                    if (zzbqgVar != null) {
                        zzbqgVar.zzb();
                    }
                }
                this.zzq = null;
                this.zzr = null;
                this.zzs = null;
                this.zzo = null;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0257 A[Catch: all -> 0x047c, TryCatch #1 {, blocks: (B:214:0x0007, B:216:0x000b, B:217:0x0010, B:219:0x0012, B:221:0x001a, B:222:0x001f, B:224:0x0021, B:226:0x002d, B:227:0x0032, B:229:0x0034, B:231:0x003c, B:233:0x004a, B:234:0x005b, B:236:0x0069, B:237:0x007a, B:239:0x0088, B:240:0x0099, B:242:0x00a7, B:243:0x00b8, B:245:0x00c6, B:246:0x00d4, B:248:0x00e2, B:249:0x00e4, B:251:0x00e8, B:253:0x00ec, B:255:0x00f4, B:258:0x00fc, B:262:0x0122, B:268:0x012e, B:336:0x0257, B:337:0x025c, B:339:0x025e, B:341:0x027e, B:343:0x0282, B:345:0x028f, B:347:0x02cb, B:379:0x0384, B:386:0x03b3, B:387:0x03cb, B:388:0x03ec, B:390:0x03f4, B:391:0x03fb, B:392:0x0421, B:395:0x0424, B:397:0x0449, B:398:0x045e, B:380:0x038b, B:381:0x0392, B:382:0x0399, B:383:0x03a0, B:384:0x03a6, B:385:0x03ad, B:346:0x02c8, B:400:0x0460, B:401:0x0465, B:269:0x0135, B:271:0x0139, B:299:0x018c, B:307:0x01dc, B:309:0x01e7, B:311:0x01ea, B:313:0x01ed, B:315:0x01f1, B:318:0x01f7, B:300:0x0197, B:302:0x01ad, B:304:0x01b8, B:301:0x01a2, B:303:0x01b0, B:305:0x01bd, B:306:0x01d1, B:308:0x01df, B:319:0x0208, B:325:0x0232, B:331:0x0242, B:328:0x0238, B:330:0x0240, B:322:0x022a, B:324:0x0230, B:332:0x0249, B:333:0x024f, B:403:0x0467, B:404:0x046c, B:406:0x046e, B:407:0x0473, B:409:0x0475, B:410:0x047a), top: B:419:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x025e A[Catch: all -> 0x047c, TryCatch #1 {, blocks: (B:214:0x0007, B:216:0x000b, B:217:0x0010, B:219:0x0012, B:221:0x001a, B:222:0x001f, B:224:0x0021, B:226:0x002d, B:227:0x0032, B:229:0x0034, B:231:0x003c, B:233:0x004a, B:234:0x005b, B:236:0x0069, B:237:0x007a, B:239:0x0088, B:240:0x0099, B:242:0x00a7, B:243:0x00b8, B:245:0x00c6, B:246:0x00d4, B:248:0x00e2, B:249:0x00e4, B:251:0x00e8, B:253:0x00ec, B:255:0x00f4, B:258:0x00fc, B:262:0x0122, B:268:0x012e, B:336:0x0257, B:337:0x025c, B:339:0x025e, B:341:0x027e, B:343:0x0282, B:345:0x028f, B:347:0x02cb, B:379:0x0384, B:386:0x03b3, B:387:0x03cb, B:388:0x03ec, B:390:0x03f4, B:391:0x03fb, B:392:0x0421, B:395:0x0424, B:397:0x0449, B:398:0x045e, B:380:0x038b, B:381:0x0392, B:382:0x0399, B:383:0x03a0, B:384:0x03a6, B:385:0x03ad, B:346:0x02c8, B:400:0x0460, B:401:0x0465, B:269:0x0135, B:271:0x0139, B:299:0x018c, B:307:0x01dc, B:309:0x01e7, B:311:0x01ea, B:313:0x01ed, B:315:0x01f1, B:318:0x01f7, B:300:0x0197, B:302:0x01ad, B:304:0x01b8, B:301:0x01a2, B:303:0x01b0, B:305:0x01bd, B:306:0x01d1, B:308:0x01df, B:319:0x0208, B:325:0x0232, B:331:0x0242, B:328:0x0238, B:330:0x0240, B:322:0x022a, B:324:0x0230, B:332:0x0249, B:333:0x024f, B:403:0x0467, B:404:0x046c, B:406:0x046e, B:407:0x0473, B:409:0x0475, B:410:0x047a), top: B:419:0x0007, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzb(java.util.Map r18) {
        /*
            Method dump skipped, instructions count: 1206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbpz.zzb(java.util.Map):void");
    }

    public final void zzc(int i, int i2, boolean z) {
        synchronized (this.zzj) {
            this.zzd = i;
            this.zze = i2;
        }
    }

    public final void zzd(int i, int i2) {
        this.zzd = i;
        this.zze = i2;
    }

    public final boolean zze() {
        boolean z;
        synchronized (this.zzj) {
            z = this.zzq != null;
        }
        return z;
    }
}
