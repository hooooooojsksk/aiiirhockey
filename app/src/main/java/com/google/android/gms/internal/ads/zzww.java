package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzww implements zzws, zzgi {
    public static final zzfqk zza = zzfqk.zzs(4400000L, 3200000L, 2300000L, 1600000L, 810000L);
    public static final zzfqk zzb = zzfqk.zzs(1400000L, 990000L, 730000L, 510000L, 230000L);
    public static final zzfqk zzc = zzfqk.zzs(2100000L, 1400000L, 1000000L, 890000L, 640000L);
    public static final zzfqk zzd = zzfqk.zzs(2600000L, 1700000L, 1300000L, 1000000L, 700000L);
    public static final zzfqk zze = zzfqk.zzs(5700000L, 3700000L, 2300000L, 1700000L, 990000L);
    public static final zzfqk zzf = zzfqk.zzs(2800000L, 1800000L, 1400000L, 1100000L, 870000L);
    private static zzww zzg;
    private final zzfqn zzh;
    private final zzwq zzi;
    private final zzxl zzj;
    private final zzdm zzk;
    private final boolean zzl;
    private int zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private long zzt;

    @Deprecated
    public zzww() {
        zzfqn.zzd();
        zzdm zzdmVar = zzdm.zza;
        throw null;
    }

    private final long zzi(int i) {
        Long l = (Long) this.zzh.get(Integer.valueOf(i));
        if (l == null) {
            l = (Long) this.zzh.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    private final void zzj(int i, long j, long j2) {
        int i2;
        long j3;
        if (i == 0) {
            if (j != 0) {
                j3 = j;
            } else if (j2 == this.zzt) {
                return;
            } else {
                j3 = 0;
            }
            i2 = 0;
        } else {
            i2 = i;
            j3 = j;
        }
        this.zzt = j2;
        this.zzi.zzb(i2, j3, j2);
    }

    public final synchronized void zzk(int i) {
        int i2 = this.zzp;
        if (i2 == 0 || this.zzl) {
            if (i2 == i) {
                return;
            }
            this.zzp = i;
            if (i != 1 && i != 0 && i != 8) {
                this.zzs = zzi(i);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                zzj(this.zzm > 0 ? (int) (elapsedRealtime - this.zzn) : 0, this.zzo, this.zzs);
                this.zzn = elapsedRealtime;
                this.zzo = 0L;
                this.zzr = 0L;
                this.zzq = 0L;
                this.zzj.zzc();
            }
        }
    }

    private static boolean zzl(zzfl zzflVar, boolean z) {
        return z && !zzflVar.zzb(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:1000:0x0125, code lost:
        if (r3.equals("YE") != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1007:0x013d, code lost:
        if (r3.equals("WS") != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1010:0x0147, code lost:
        if (r3.equals("WF") != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1029:0x0189, code lost:
        if (r3.equals("VE") != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1032:0x0193, code lost:
        if (r3.equals("VC") != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1035:0x019d, code lost:
        if (r3.equals("VA") != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1042:0x01b5, code lost:
        if (r3.equals("UY") != false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1049:0x01cd, code lost:
        if (r3.equals("UG") != false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1056:0x01e5, code lost:
        if (r3.equals("TZ") != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1063:0x01fd, code lost:
        if (r3.equals("TV") != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1074:0x0223, code lost:
        if (r3.equals("TO") != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1077:0x022d, code lost:
        if (r3.equals("TN") != false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1079:0x0234, code lost:
        return new int[]{2, 1, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1081:0x023b, code lost:
        if (r3.equals("TM") != false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1088:0x0253, code lost:
        if (r3.equals("TK") != false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1091:0x025d, code lost:
        if (r3.equals("TJ") != false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1098:0x0275, code lost:
        if (r3.equals("TG") != false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1101:0x027f, code lost:
        if (r3.equals("TD") != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1112:0x02a5, code lost:
        if (r3.equals("SY") != false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1115:0x02af, code lost:
        if (r3.equals("SX") != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1118:0x02b9, code lost:
        if (r3.equals("SV") != false) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1125:0x02d1, code lost:
        if (r3.equals("SS") != false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1127:0x02d8, code lost:
        return new int[]{4, 2, 2, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1137:0x02fb, code lost:
        if (r3.equals("SN") != false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1140:0x0305, code lost:
        if (r3.equals("SM") != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1143:0x030f, code lost:
        if (r3.equals("SL") != false) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1150:0x0327, code lost:
        if (r3.equals("SJ") != false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1153:0x0331, code lost:
        if (r3.equals("SI") != false) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1156:0x033b, code lost:
        if (r3.equals("SH") != false) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1175:0x037d, code lost:
        if (r3.equals("SB") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1177:0x0384, code lost:
        return new int[]{4, 2, 4, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1179:0x038b, code lost:
        if (r3.equals("SA") != false) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1206:0x03e9, code lost:
        if (r3.equals("PY") != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1225:0x042b, code lost:
        if (r3.equals("PM") != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1232:0x0443, code lost:
        if (r3.equals("PK") != false) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1239:0x045b, code lost:
        if (r3.equals(com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_PG) != false) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1242:0x0465, code lost:
        if (r3.equals("PF") != false) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1244:0x046c, code lost:
        return new int[]{2, 3, 3, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1290:0x050d, code lost:
        if (r3.equals("NE") != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1301:0x0533, code lost:
        if (r3.equals("MZ") != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1303:0x053a, code lost:
        return new int[]{3, 1, 2, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1321:0x0579, code lost:
        if (r3.equals("MU") != false) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1323:0x0580, code lost:
        return new int[]{3, 1, 1, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1325:0x0587, code lost:
        if (r3.equals("MT") != false) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1328:0x0591, code lost:
        if (r3.equals("MS") != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1335:0x05a9, code lost:
        if (r3.equals("MQ") != false) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1338:0x05b3, code lost:
        if (r3.equals("MP") != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1353:0x05e7, code lost:
        if (r3.equals("ML") != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1355:0x05ee, code lost:
        return new int[]{3, 4, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1365:0x0611, code lost:
        if (r3.equals("MG") != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1368:0x061b, code lost:
        if (r3.equals("MF") != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1370:0x0622, code lost:
        return new int[]{1, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1388:0x0661, code lost:
        if (r3.equals("LY") != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1390:0x0668, code lost:
        return new int[]{3, 2, 4, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1392:0x066f, code lost:
        if (r3.equals("LV") != false) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1399:0x0687, code lost:
        if (r3.equals("LT") != false) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1402:0x0691, code lost:
        if (r3.equals("LS") != false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1404:0x0698, code lost:
        return new int[]{3, 3, 3, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1414:0x06bb, code lost:
        if (r3.equals("LI") != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1417:0x06c5, code lost:
        if (r3.equals("LC") != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1420:0x06cf, code lost:
        if (r3.equals("LB") != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1422:0x06d6, code lost:
        return new int[]{3, 2, 1, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1428:0x06eb, code lost:
        if (r3.equals("KZ") != false) goto L512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1431:0x06f5, code lost:
        if (r3.equals("KY") != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1442:0x071b, code lost:
        if (r3.equals("KN") != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1445:0x0725, code lost:
        if (r3.equals("KM") != false) goto L528;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1448:0x072f, code lost:
        if (r3.equals("KI") != false) goto L532;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1455:0x0747, code lost:
        if (r3.equals("KG") != false) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1457:0x074e, code lost:
        return new int[]{2, 1, 1, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1475:0x078d, code lost:
        if (r3.equals("JE") != false) goto L558;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1490:0x07c1, code lost:
        if (r3.equals("IQ") != false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1492:0x07c8, code lost:
        return new int[]{3, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1494:0x07cf, code lost:
        if (r3.equals("IO") != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1496:0x07d6, code lost:
        return new int[]{4, 2, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1510:0x0807, code lost:
        if (r3.equals("IE") != false) goto L590;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1517:0x081f, code lost:
        if (r3.equals("HU") != false) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1520:0x0829, code lost:
        if (r3.equals("HT") != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1523:0x0833, code lost:
        if (r3.equals("HR") != false) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1542:0x0875, code lost:
        if (r3.equals("GU") != false) goto L620;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1549:0x088d, code lost:
        if (r3.equals("GR") != false) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1568:0x08cf, code lost:
        if (r3.equals("GL") != false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1570:0x08d6, code lost:
        return new int[]{2, 2, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1572:0x08dd, code lost:
        if (r3.equals("GI") != false) goto L558;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1574:0x08e4, code lost:
        return new int[]{1, 2, 0, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1576:0x08eb, code lost:
        if (r3.equals("GH") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1578:0x08f2, code lost:
        return new int[]{3, 3, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1584:0x0907, code lost:
        if (r3.equals("GF") != false) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1586:0x090e, code lost:
        return new int[]{3, 2, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1592:0x0923, code lost:
        if (r3.equals("GD") != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1594:0x092a, code lost:
        return new int[]{1, 2, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1600:0x093f, code lost:
        if (r3.equals("GA") != false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1602:0x0946, code lost:
        return new int[]{3, 4, 1, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1608:0x095b, code lost:
        if (r3.equals("FO") != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1623:0x098f, code lost:
        if (r3.equals("ET") != false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1625:0x0996, code lost:
        return new int[]{4, 4, 3, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1627:0x099d, code lost:
        if (r3.equals("ES") != false) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1630:0x09a7, code lost:
        if (r3.equals("ER") != false) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1633:0x09b1, code lost:
        if (r3.equals("EG") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1635:0x09b8, code lost:
        return new int[]{3, 4, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1637:0x09bf, code lost:
        if (r3.equals("EE") != false) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1644:0x09d6, code lost:
        if (r3.equals("DZ") != false) goto L702;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1651:0x09ee, code lost:
        if (r3.equals("DM") != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1654:0x09f8, code lost:
        if (r3.equals("DK") != false) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1656:0x09ff, code lost:
        return new int[]{0, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1658:0x0a06, code lost:
        if (r3.equals("DJ") != false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1660:0x0a0d, code lost:
        return new int[]{4, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1670:0x0a30, code lost:
        if (r3.equals("CY") != false) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1672:0x0a37, code lost:
        return new int[]{1, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1674:0x0a3e, code lost:
        if (r3.equals("CX") != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1677:0x0a48, code lost:
        if (r3.equals("CW") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1684:0x0a60, code lost:
        if (r3.equals("CU") != false) goto L532;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1686:0x0a67, code lost:
        return new int[]{4, 2, 4, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1708:0x0ab4, code lost:
        if (r3.equals("CK") != false) goto L758;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1711:0x0abe, code lost:
        if (r3.equals("CD") != false) goto L528;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1713:0x0ac5, code lost:
        return new int[]{4, 3, 3, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1727:0x0af6, code lost:
        if (r3.equals("BI") != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1729:0x0afd, code lost:
        return new int[]{4, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1735:0x0b12, code lost:
        if (r3.equals("BG") != false) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1737:0x0b19, code lost:
        return new int[]{0, 0, 0, 0, 1, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1739:0x0b20, code lost:
        if (r3.equals("BF") != false) goto L702;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1746:0x0b37, code lost:
        if (r3.equals("BD") != false) goto L512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1748:0x0b3e, code lost:
        return new int[]{2, 1, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1750:0x0b45, code lost:
        if (r3.equals("AZ") != false) goto L702;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1752:0x0b4c, code lost:
        return new int[]{3, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1754:0x0b53, code lost:
        if (r3.equals("AQ") != false) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1756:0x0b5a, code lost:
        return new int[]{4, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1762:0x0b6f, code lost:
        if (r3.equals("AI") != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1769:0x0b86, code lost:
        if (r3.equals("AF") != false) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1771:0x0b8d, code lost:
        return new int[]{4, 3, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1777:0x0ba2, code lost:
        if (r3.equals("AD") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1779:0x0ba9, code lost:
        return new int[]{2, 2, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1781:0x0bb0, code lost:
        if (r3.equals("BZ") != false) goto L758;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1783:0x0bb7, code lost:
        return new int[]{2, 2, 2, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1789:0x0bcc, code lost:
        if (r3.equals("BB") != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1791:0x0bd3, code lost:
        return new int[]{0, 2, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1793:0x0bda, code lost:
        if (r3.equals("BA") != false) goto L590;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1795:0x0be1, code lost:
        return new int[]{1, 1, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1797:0x0be8, code lost:
        if (r3.equals("AX") != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1799:0x0bef, code lost:
        return new int[]{0, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1801:0x0bf6, code lost:
        if (r3.equals("AW") != false) goto L620;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1803:0x0bfd, code lost:
        return new int[]{1, 2, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:933:0x003f, code lost:
        if (r3.equals("CI") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:940:0x0057, code lost:
        if (r3.equals("CG") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:943:0x0061, code lost:
        if (r3.equals("CF") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:946:0x006b, code lost:
        if (r3.equals("BT") != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:949:0x0075, code lost:
        if (r3.equals("BS") != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:956:0x008d, code lost:
        if (r3.equals("BQ") != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:967:0x00b3, code lost:
        if (r3.equals("BM") != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:970:0x00bd, code lost:
        if (r3.equals("BL") != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:985:0x00f1, code lost:
        if (r3.equals("ZW") != false) goto L86;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int[] zzm(java.lang.String r3) {
        /*
            Method dump skipped, instructions count: 6680
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzww.zzm(java.lang.String):int[]");
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final synchronized void zza(zzfg zzfgVar, zzfl zzflVar, boolean z, int i) {
        if (zzl(zzflVar, z)) {
            this.zzo += i;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final synchronized void zzb(zzfg zzfgVar, zzfl zzflVar, boolean z) {
        if (zzl(zzflVar, z)) {
            zzdl.zzf(this.zzm > 0);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i = (int) (elapsedRealtime - this.zzn);
            this.zzq += i;
            long j = this.zzr;
            long j2 = this.zzo;
            this.zzr = j + j2;
            if (i > 0) {
                this.zzj.zzb((int) Math.sqrt(j2), (((float) j2) * 8000.0f) / i);
                if (this.zzq >= 2000 || this.zzr >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                    this.zzs = this.zzj.zza(0.5f);
                }
                zzj(i, this.zzo, this.zzs);
                this.zzn = elapsedRealtime;
                this.zzo = 0L;
            }
            this.zzm--;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final void zzc(zzfg zzfgVar, zzfl zzflVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final synchronized void zzd(zzfg zzfgVar, zzfl zzflVar, boolean z) {
        if (zzl(zzflVar, z)) {
            if (this.zzm == 0) {
                this.zzn = SystemClock.elapsedRealtime();
            }
            this.zzm++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzws
    public final void zzf(zzwr zzwrVar) {
        this.zzi.zzc(zzwrVar);
    }

    public static synchronized zzww zzg(Context context) {
        zzww zzwwVar;
        synchronized (zzww.class) {
            if (zzg == null) {
                Context applicationContext = context == null ? null : context.getApplicationContext();
                int[] zzm = zzm(zzew.zzL(context));
                HashMap hashMap = new HashMap(8);
                hashMap.put(0, 1000000L);
                zzfqk zzfqkVar = zza;
                hashMap.put(2, (Long) zzfqkVar.get(zzm[0]));
                hashMap.put(3, (Long) zzb.get(zzm[1]));
                hashMap.put(4, (Long) zzc.get(zzm[2]));
                hashMap.put(5, (Long) zzd.get(zzm[3]));
                hashMap.put(10, (Long) zze.get(zzm[4]));
                hashMap.put(9, (Long) zzf.get(zzm[5]));
                hashMap.put(7, (Long) zzfqkVar.get(zzm[0]));
                zzg = new zzww(applicationContext, hashMap, 2000, zzdm.zza, true, null);
            }
            zzwwVar = zzg;
        }
        return zzwwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzws
    public final void zze(Handler handler, zzwr zzwrVar) {
        Objects.requireNonNull(zzwrVar);
        this.zzi.zza(handler, zzwrVar);
    }

    /* synthetic */ zzww(Context context, Map map, int i, zzdm zzdmVar, boolean z, zzwv zzwvVar) {
        this.zzh = zzfqn.zzc(map);
        this.zzi = new zzwq();
        this.zzj = new zzxl(2000);
        this.zzk = zzdmVar;
        this.zzl = true;
        if (context != null) {
            zzel zzb2 = zzel.zzb(context);
            int zza2 = zzb2.zza();
            this.zzp = zza2;
            this.zzs = zzi(zza2);
            zzb2.zzd(new zzwu(this));
            return;
        }
        this.zzp = 0;
        this.zzs = zzi(0);
    }
}
