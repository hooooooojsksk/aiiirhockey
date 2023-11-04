package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.bA */
/* loaded from: assets/audience_network.dex */
public class C1022bA<ModelType, StateType> {
    public final ModelType A02;
    public final StateType A03;
    public final String A04;
    @Nullable
    public List<InterfaceC1024bC<ModelType, StateType>> A01 = null;
    public C1021b9 A00 = C1021b9.A08;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bA != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public C1022bA(ModelType model, StateType state, String str) {
        this.A02 = model;
        this.A03 = state;
        this.A04 = str;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bA != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bC != com.instagram.common.viewpoint.core.ViewpointAction<ModelType, StateType> */
    public final C1022bA<ModelType, StateType> A05(InterfaceC1024bC<ModelType, StateType> interfaceC1024bC) {
        if (this.A01 == null) {
            this.A01 = new ArrayList();
        }
        this.A01.add(interfaceC1024bC);
        return this;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bA != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public final C1021b9<ModelType, StateType> A06() {
        return new C1021b9<>(this);
    }
}
