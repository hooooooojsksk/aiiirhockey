package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.s;
import com.fyber.inneractive.sdk.response.i;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class e implements i {
    public final /* synthetic */ List a;
    public final /* synthetic */ g b;

    public e(f fVar, List list, g gVar) {
        this.a = list;
        this.b = gVar;
    }

    @Override // com.fyber.inneractive.sdk.response.i
    public List<String> a(s sVar) {
        if (this.a == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : this.a) {
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str.replace("[REASON]", String.valueOf(this.b.mReason)));
            }
        }
        return arrayList;
    }
}
