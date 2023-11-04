package cz.msebera.android.httpclient.conn.util;

import cz.msebera.android.httpclient.util.Args;
import java.net.IDN;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class PublicSuffixMatcher {
    private final Map<String, String> exceptions;
    private final Map<String, String> rules;

    public PublicSuffixMatcher(Collection<String> collection, Collection<String> collection2) {
        Args.notNull(collection, "Domain suffix rules");
        this.rules = new ConcurrentHashMap(collection.size());
        for (String str : collection) {
            this.rules.put(str, str);
        }
        if (collection2 != null) {
            this.exceptions = new ConcurrentHashMap(collection2.size());
            for (String str2 : collection2) {
                this.exceptions.put(str2, str2);
            }
            return;
        }
        this.exceptions = null;
    }

    public String getDomainRoot(String str) {
        if (str == null || str.startsWith(".")) {
            return null;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        String str2 = null;
        while (lowerCase != null) {
            Map<String, String> map = this.exceptions;
            if (map != null && map.containsKey(IDN.toUnicode(lowerCase))) {
                return lowerCase;
            }
            if (this.rules.containsKey(IDN.toUnicode(lowerCase))) {
                break;
            }
            int indexOf = lowerCase.indexOf(46);
            String substring = indexOf != -1 ? lowerCase.substring(indexOf + 1) : null;
            if (substring != null) {
                if (this.rules.containsKey("*." + IDN.toUnicode(substring))) {
                    break;
                }
            }
            if (indexOf != -1) {
                str2 = lowerCase;
            }
            lowerCase = substring;
        }
        return str2;
    }

    public boolean matches(String str) {
        if (str == null) {
            return false;
        }
        if (str.startsWith(".")) {
            str = str.substring(1);
        }
        return getDomainRoot(str) == null;
    }
}
