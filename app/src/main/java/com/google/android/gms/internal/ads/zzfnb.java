package com.google.android.gms.internal.ads;

import cz.msebera.android.httpclient.message.TokenParser;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfnb {
    public static String zza(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (zze(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (zze(c)) {
                        charArray[i] = (char) (c ^ TokenParser.SP);
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static String zzb(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (zzd(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (zzd(c)) {
                        charArray[i] = (char) (c ^ TokenParser.SP);
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static boolean zzc(CharSequence charSequence, CharSequence charSequence2) {
        int zzf;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length == charSequence2.length()) {
            for (int i = 0; i < length; i++) {
                char charAt = charSequence.charAt(i);
                char charAt2 = charSequence2.charAt(i);
                if (charAt != charAt2 && ((zzf = zzf(charAt)) >= 26 || zzf != zzf(charAt2))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean zzd(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static boolean zze(char c) {
        return c >= 'A' && c <= 'Z';
    }

    private static int zzf(char c) {
        return (char) ((c | TokenParser.SP) - 97);
    }
}
