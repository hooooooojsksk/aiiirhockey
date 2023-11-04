package com.fyber.inneractive.sdk.config;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class p implements Runnable {
    public final /* synthetic */ IAConfigManager a;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            p.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            IAConfigManager iAConfigManager = p.this.a;
            iAConfigManager.s.c(iAConfigManager.B);
        }
    }

    public p(IAConfigManager iAConfigManager) {
        this.a = iAConfigManager;
    }

    @Override // java.lang.Runnable
    public void run() {
        IAConfigManager iAConfigManager = this.a;
        if (iAConfigManager.q == null) {
            Context context = iAConfigManager.f;
            HashSet hashSet = new HashSet();
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
            List<InputMethodInfo> list = null;
            try {
                list = inputMethodManager.getEnabledInputMethodList();
            } catch (Throwable unused) {
            }
            if (list != null) {
                int i = 0;
                for (InputMethodInfo inputMethodInfo : list) {
                    for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                        if (inputMethodSubtype.getMode().equals("keyboard") && i < 10) {
                            String locale = inputMethodSubtype.getLocale();
                            if (!TextUtils.isEmpty(locale)) {
                                try {
                                    String replace = locale.replace("_", "-");
                                    hashSet.add(replace);
                                    IAlog.a("Available input language: %s", replace);
                                    i++;
                                } catch (Exception unused2) {
                                }
                            }
                        }
                    }
                }
            }
            if (hashSet.isEmpty()) {
                if (Build.VERSION.SDK_INT >= 24) {
                    hashSet.addAll(Arrays.asList(LocaleList.getDefault().toLanguageTags().split(",")));
                } else {
                    Locale locale2 = Locale.getDefault();
                    if (locale2 != null) {
                        hashSet.add(locale2.toString().replace("_", "-"));
                    }
                }
            }
            iAConfigManager.q = new ArrayList(hashSet);
        }
        com.fyber.inneractive.sdk.util.m.b.post(new a());
    }
}
