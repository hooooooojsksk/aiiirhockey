package com.fyber.inneractive.sdk.interfaces;

import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.external.InneractiveAdRenderer;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.flow.o;

/* loaded from: classes.dex */
public interface b extends InneractiveAdRenderer {
    void a();

    void a(int i);

    void a(ViewGroup viewGroup);

    boolean a(View view);

    boolean a(o oVar);

    int f();

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    void initialize(InneractiveAdSpot inneractiveAdSpot);

    void n();

    int p();

    void r();

    void u();
}
