package com.google.android.gms.internal.drive;

import cz.msebera.android.httpclient.message.TokenParser;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzlt {
    public static String zza(zzlq zzlqVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zza(zzlqVar, sb, 0);
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:241:0x01f2, code lost:
        if (((java.lang.Boolean) r11).booleanValue() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x01f4, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0204, code lost:
        if (((java.lang.Integer) r11).intValue() == 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0215, code lost:
        if (((java.lang.Float) r11).floatValue() == 0.0f) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0227, code lost:
        if (((java.lang.Double) r11).doubleValue() == 0.0d) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zza(com.google.android.gms.internal.drive.zzlq r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instructions count: 677
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.drive.zzlt.zza(com.google.android.gms.internal.drive.zzlq, java.lang.StringBuilder, int):void");
    }

    public static final void zza(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                zza(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                zza(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(TokenParser.SP);
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(zzmt.zzc(zzjc.zzk((String) obj)));
                sb.append('\"');
            } else if (obj instanceof zzjc) {
                sb.append(": \"");
                sb.append(zzmt.zzc((zzjc) obj));
                sb.append('\"');
            } else if (obj instanceof zzkk) {
                sb.append(" {");
                zza((zzkk) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(TokenParser.SP);
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i4 = i + 2;
                zza(sb, i4, "key", entry2.getKey());
                zza(sb, i4, "value", entry2.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(TokenParser.SP);
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    private static final String zzo(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }
}
