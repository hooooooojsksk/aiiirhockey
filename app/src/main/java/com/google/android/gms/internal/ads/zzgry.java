package com.google.android.gms.internal.ads;

import cz.msebera.android.httpclient.message.TokenParser;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgry {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, (char) TokenParser.SP);
    }

    public static String zza(zzgrw zzgrwVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzd(zzgrwVar, sb, 0);
        return sb.toString();
    }

    public static void zzb(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                zzb(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                zzb(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            zzc(i, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i2 = 1; i2 < str.length(); i2++) {
                    char charAt = str.charAt(i2);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append("_");
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(zzgte.zza(zzgpe.zzx((String) obj)));
                sb.append('\"');
            } else if (obj instanceof zzgpe) {
                sb.append(": \"");
                sb.append(zzgte.zza((zzgpe) obj));
                sb.append('\"');
            } else if (obj instanceof zzgqm) {
                sb.append(" {");
                zzd((zzgqm) obj, sb, i + 2);
                sb.append("\n");
                zzc(i, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i3 = i + 2;
                zzb(sb, i3, "key", entry2.getKey());
                zzb(sb, i3, "value", entry2.getValue());
                sb.append("\n");
                zzc(i, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    private static void zzc(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(zza, 0, i2);
            i -= i2;
        }
    }

    private static void zzd(zzgrw zzgrwVar, StringBuilder sb, int i) {
        int i2;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzgrwVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            Method method3 = declaredMethods[i3];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (!substring.endsWith("List") || substring.endsWith("OrBuilderList") || substring.equals("List") || (method2 = (Method) entry.getValue()) == null || !method2.getReturnType().equals(List.class)) {
                if (!substring.endsWith("Map") || substring.equals("Map") || (method = (Method) entry.getValue()) == null || !method.getReturnType().equals(Map.class) || method.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method.getModifiers())) {
                    if (hashSet.contains("set".concat(String.valueOf(substring))) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                        Method method4 = (Method) entry.getValue();
                        Method method5 = (Method) hashMap.get("has".concat(String.valueOf(substring)));
                        if (method4 != null) {
                            Object zzaP = zzgqm.zzaP(method4, zzgrwVar, new Object[0]);
                            if (method5 == null) {
                                if (zzaP instanceof Boolean) {
                                    if (!((Boolean) zzaP).booleanValue()) {
                                    }
                                    zzb(sb, i, substring, zzaP);
                                } else if (zzaP instanceof Integer) {
                                    if (((Integer) zzaP).intValue() == 0) {
                                    }
                                    zzb(sb, i, substring, zzaP);
                                } else if (zzaP instanceof Float) {
                                    if (Float.floatToRawIntBits(((Float) zzaP).floatValue()) == 0) {
                                    }
                                    zzb(sb, i, substring, zzaP);
                                } else if (zzaP instanceof Double) {
                                    if (Double.doubleToRawLongBits(((Double) zzaP).doubleValue()) == 0) {
                                    }
                                    zzb(sb, i, substring, zzaP);
                                } else {
                                    if (zzaP instanceof String) {
                                        equals = zzaP.equals("");
                                    } else if (zzaP instanceof zzgpe) {
                                        equals = zzaP.equals(zzgpe.zzb);
                                    } else if (zzaP instanceof zzgrw) {
                                        if (zzaP == ((zzgrw) zzaP).zzbf()) {
                                        }
                                        zzb(sb, i, substring, zzaP);
                                    } else {
                                        if ((zzaP instanceof Enum) && ((Enum) zzaP).ordinal() == 0) {
                                        }
                                        zzb(sb, i, substring, zzaP);
                                    }
                                    if (equals) {
                                    }
                                    zzb(sb, i, substring, zzaP);
                                }
                            } else {
                                if (!((Boolean) zzgqm.zzaP(method5, zzgrwVar, new Object[0])).booleanValue()) {
                                }
                                zzb(sb, i, substring, zzaP);
                            }
                        }
                    }
                } else {
                    zzb(sb, i, substring.substring(0, substring.length() - 3), zzgqm.zzaP(method, zzgrwVar, new Object[0]));
                }
            } else {
                zzb(sb, i, substring.substring(0, substring.length() - 4), zzgqm.zzaP(method2, zzgrwVar, new Object[0]));
            }
            i2 = 3;
        }
        if (!(zzgrwVar instanceof zzgqj)) {
            zzgth zzgthVar = ((zzgqm) zzgrwVar).zzc;
            if (zzgthVar != null) {
                zzgthVar.zzi(sb, i);
                return;
            }
            return;
        }
        zzgqd zzgqdVar = ((zzgqj) zzgrwVar).zzb;
        throw null;
    }
}
