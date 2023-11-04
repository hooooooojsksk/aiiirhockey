package com.google.android.gms.measurement.internal;

import java.util.BitSet;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: classes2.dex */
public final class zzaa extends zzkn {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    public zzaa(zzkz zzkzVar) {
        super(zzkzVar);
    }

    private final zzu zzd(Integer num) {
        if (this.zzc.containsKey(num)) {
            return (zzu) this.zzc.get(num);
        }
        zzu zzuVar = new zzu(this, this.zza, null);
        this.zzc.put(num, zzuVar);
        return zzuVar;
    }

    private final boolean zzf(int i, int i2) {
        BitSet bitSet;
        zzu zzuVar = (zzu) this.zzc.get(Integer.valueOf(i));
        if (zzuVar == null) {
            return false;
        }
        bitSet = zzuVar.zze;
        return bitSet.get(i2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:2|(2:4|(2:6|7))(2:541|542))|8|(3:10|11|12)|16|(16:(6:19|20|21|22|23|(21:(7:25|26|27|28|(1:30)(3:517|(1:519)(1:521)|520)|31|(1:34)(1:33))|(1:36)|37|38|39|40|41|42|(3:44|(1:46)|47)(4:475|(6:476|477|478|479|480|(1:483)(1:482))|(1:485)|486)|48|(1:50)(6:284|(6:286|287|288|289|290|(2:(3:292|(1:294)|295)|297)(1:460))(1:474)|304|(10:307|(3:311|(4:314|(5:316|317|(1:319)(1:323)|320|321)(1:324)|322|312)|325)|326|(3:330|(4:333|(3:338|339|340)|341|331)|344)|345|(3:347|(6:350|(2:352|(3:354|355|356))(1:359)|357|358|356|348)|360)|361|(3:370|(8:373|(1:375)|376|(1:378)|379|(3:381|382|383)(1:385)|384|371)|386)|387|305)|393|394)|51|(3:182|(4:185|(10:187|188|(1:190)(1:281)|191|(10:193|194|195|196|197|198|199|200|(4:202|(11:203|204|205|206|207|208|209|(3:211|212|213)(1:256)|214|215|(1:218)(1:217))|(1:220)|221)(2:262|263)|222)(1:280)|223|(4:226|(3:244|245|246)(4:228|229|(2:230|(2:232|(1:234)(2:235|236))(1:243))|(3:238|239|240)(1:242))|241|224)|247|248|249)(1:282)|250|183)|283)|53|54|(3:81|(6:84|(7:86|87|88|89|90|(3:(9:92|93|94|95|96|(1:98)(1:157)|99|100|(1:103)(1:102))|(1:105)|106)(2:164|165)|107)(1:180)|108|(2:109|(2:111|(3:147|148|149)(8:113|(2:114|(4:116|(3:118|(1:120)(1:143)|121)(1:144)|122|(1:1)(2:126|(1:128)(2:129|130)))(2:145|146))|137|(1:139)(1:141)|140|132|133|134))(0))|150|82)|181)|56|57|(9:60|61|62|63|64|65|(2:67|68)(1:70)|69|58)|78|79)(1:525))|41|42|(0)(0)|48|(0)(0)|51|(0)|53|54|(0)|56|57|(1:58)|78|79)|540|38|39|40|(5:(0)|(0)|(0)|(0)|(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(26:1|(2:2|(2:4|(2:6|7))(2:541|542))|8|(3:10|11|12)|16|(6:19|20|21|22|23|(21:(7:25|26|27|28|(1:30)(3:517|(1:519)(1:521)|520)|31|(1:34)(1:33))|(1:36)|37|38|39|40|41|42|(3:44|(1:46)|47)(4:475|(6:476|477|478|479|480|(1:483)(1:482))|(1:485)|486)|48|(1:50)(6:284|(6:286|287|288|289|290|(2:(3:292|(1:294)|295)|297)(1:460))(1:474)|304|(10:307|(3:311|(4:314|(5:316|317|(1:319)(1:323)|320|321)(1:324)|322|312)|325)|326|(3:330|(4:333|(3:338|339|340)|341|331)|344)|345|(3:347|(6:350|(2:352|(3:354|355|356))(1:359)|357|358|356|348)|360)|361|(3:370|(8:373|(1:375)|376|(1:378)|379|(3:381|382|383)(1:385)|384|371)|386)|387|305)|393|394)|51|(3:182|(4:185|(10:187|188|(1:190)(1:281)|191|(10:193|194|195|196|197|198|199|200|(4:202|(11:203|204|205|206|207|208|209|(3:211|212|213)(1:256)|214|215|(1:218)(1:217))|(1:220)|221)(2:262|263)|222)(1:280)|223|(4:226|(3:244|245|246)(4:228|229|(2:230|(2:232|(1:234)(2:235|236))(1:243))|(3:238|239|240)(1:242))|241|224)|247|248|249)(1:282)|250|183)|283)|53|54|(3:81|(6:84|(7:86|87|88|89|90|(3:(9:92|93|94|95|96|(1:98)(1:157)|99|100|(1:103)(1:102))|(1:105)|106)(2:164|165)|107)(1:180)|108|(2:109|(2:111|(3:147|148|149)(8:113|(2:114|(4:116|(3:118|(1:120)(1:143)|121)(1:144)|122|(1:1)(2:126|(1:128)(2:129|130)))(2:145|146))|137|(1:139)(1:141)|140|132|133|134))(0))|150|82)|181)|56|57|(9:60|61|62|63|64|65|(2:67|68)(1:70)|69|58)|78|79)(1:525))|540|38|39|40|41|42|(0)(0)|48|(0)(0)|51|(0)|53|54|(0)|56|57|(1:58)|78|79|(5:(0)|(0)|(0)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x0151, code lost:
        if (r5 != null) goto L527;
     */
    /* JADX WARN: Code restructure failed: missing block: B:611:0x0153, code lost:
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:621:0x0175, code lost:
        if (r5 == null) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:655:0x0228, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:656:0x0229, code lost:
        r18 = "audience_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:658:0x022e, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:0x022f, code lost:
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:660:0x0232, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x0233, code lost:
        r18 = "audience_id";
        r19 = "data";
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:680:0x02cc, code lost:
        if (r5 != null) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:681:0x02ce, code lost:
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:683:0x02d6, code lost:
        if (r5 != null) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:694:0x02fb, code lost:
        if (r5 == null) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:696:0x02fe, code lost:
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r1);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r13);
        r1 = new androidx.collection.ArrayMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:697:0x030d, code lost:
        if (r13.isEmpty() == false) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:698:0x030f, code lost:
        r21 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:699:0x0313, code lost:
        r3 = r13.keySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:701:0x031f, code lost:
        if (r3.hasNext() == false) goto L459;
     */
    /* JADX WARN: Code restructure failed: missing block: B:702:0x0321, code lost:
        r4 = ((java.lang.Integer) r3.next()).intValue();
        r5 = java.lang.Integer.valueOf(r4);
        r6 = (com.google.android.gms.internal.measurement.zzgh) r13.get(r5);
        r7 = (java.util.List) r0.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:703:0x033b, code lost:
        if (r7 == null) goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:705:0x0341, code lost:
        if (r7.isEmpty() == false) goto L402;
     */
    /* JADX WARN: Code restructure failed: missing block: B:707:0x0345, code lost:
        r17 = r0;
        r0 = r64.zzf.zzu().zzq(r6.zzk(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:708:0x0359, code lost:
        if (r0.isEmpty() != false) goto L404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:709:0x035b, code lost:
        r5 = (com.google.android.gms.internal.measurement.zzgg) r6.zzby();
        r5.zzf();
        r5.zzb(r0);
        r20 = r3;
        r0 = r64.zzf.zzu().zzq(r6.zzn(), r7);
        r5.zzh();
        r5.zzd(r0);
        com.google.android.gms.internal.measurement.zzob.zzc();
        r21 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:710:0x038f, code lost:
        if (r64.zzs.zzf().zzs(null, com.google.android.gms.measurement.internal.zzeb.zzaA) == false) goto L436;
     */
    /* JADX WARN: Code restructure failed: missing block: B:711:0x0391, code lost:
        r0 = new java.util.ArrayList();
        r3 = r6.zzj().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:713:0x03a2, code lost:
        if (r3.hasNext() == false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:714:0x03a4, code lost:
        r8 = (com.google.android.gms.internal.measurement.zzfq) r3.next();
        r23 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:715:0x03ba, code lost:
        if (r7.contains(java.lang.Integer.valueOf(r8.zza())) != false) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:716:0x03bc, code lost:
        r0.add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:717:0x03bf, code lost:
        r3 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:718:0x03c3, code lost:
        r5.zze();
        r5.zza(r0);
        r0 = new java.util.ArrayList();
        r3 = r6.zzm().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:720:0x03da, code lost:
        if (r3.hasNext() == false) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:721:0x03dc, code lost:
        r6 = (com.google.android.gms.internal.measurement.zzgj) r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:722:0x03ee, code lost:
        if (r7.contains(java.lang.Integer.valueOf(r6.zzb())) != false) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:723:0x03f0, code lost:
        r0.add(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:724:0x03f4, code lost:
        r5.zzg();
        r5.zzc(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:725:0x03fb, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:727:0x0400, code lost:
        if (r0 >= r6.zza()) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:729:0x0412, code lost:
        if (r7.contains(java.lang.Integer.valueOf(r6.zze(r0).zza())) == false) goto L444;
     */
    /* JADX WARN: Code restructure failed: missing block: B:730:0x0414, code lost:
        r5.zzi(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:731:0x0417, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:732:0x041a, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:734:0x041f, code lost:
        if (r0 >= r6.zzc()) goto L455;
     */
    /* JADX WARN: Code restructure failed: missing block: B:736:0x0431, code lost:
        if (r7.contains(java.lang.Integer.valueOf(r6.zzi(r0).zzb())) == false) goto L454;
     */
    /* JADX WARN: Code restructure failed: missing block: B:737:0x0433, code lost:
        r5.zzj(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:738:0x0436, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:739:0x0439, code lost:
        r1.put(java.lang.Integer.valueOf(r4), (com.google.android.gms.internal.measurement.zzgh) r5.zzaE());
     */
    /* JADX WARN: Code restructure failed: missing block: B:740:0x0447, code lost:
        r0 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:741:0x044b, code lost:
        r17 = r0;
        r20 = r3;
        r21 = r8;
        r1.put(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:742:0x0454, code lost:
        r0 = r17;
        r3 = r20;
        r8 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:743:0x045c, code lost:
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:859:0x0794, code lost:
        if (r5 != null) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:860:0x0796, code lost:
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:875:0x07c6, code lost:
        if (r5 != null) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:930:0x0945, code lost:
        if (r13 != null) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:931:0x0947, code lost:
        r13.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:941:0x096d, code lost:
        if (r13 == null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:982:0x0a99, code lost:
        if (r7 != false) goto L135;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:624:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x01b4 A[Catch: SQLiteException -> 0x0228, all -> 0x0b5a, TRY_LEAVE, TryCatch #12 {SQLiteException -> 0x0228, blocks: (B:629:0x01ae, B:631:0x01b4, B:635:0x01c4, B:636:0x01c9, B:637:0x01d3, B:638:0x01e3, B:640:0x01f2), top: B:1024:0x01ae }] */
    /* JADX WARN: Removed duplicated region for block: B:635:0x01c4 A[Catch: SQLiteException -> 0x0228, all -> 0x0b5a, TRY_ENTER, TryCatch #12 {SQLiteException -> 0x0228, blocks: (B:629:0x01ae, B:631:0x01b4, B:635:0x01c4, B:636:0x01c9, B:637:0x01d3, B:638:0x01e3, B:640:0x01f2), top: B:1024:0x01ae }] */
    /* JADX WARN: Removed duplicated region for block: B:664:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:668:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:669:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:745:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:819:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:901:0x087c  */
    /* JADX WARN: Removed duplicated region for block: B:989:0x0aca  */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v59, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v61, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List zza(java.lang.String r65, java.util.List r66, java.util.List r67, java.lang.Long r68, java.lang.Long r69) {
        /*
            Method dump skipped, instructions count: 2916
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzaa.zza(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }

    @Override // com.google.android.gms.measurement.internal.zzkn
    protected final boolean zzb() {
        return false;
    }
}
