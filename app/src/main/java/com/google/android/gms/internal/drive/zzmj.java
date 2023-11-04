package com.google.android.gms.internal.drive;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzmj<FieldDescriptorType> extends zzmi<FieldDescriptorType, Object> {
    public zzmj(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.drive.zzmi
    public final void zzbp() {
        if (!isImmutable()) {
            for (int i = 0; i < zzer(); i++) {
                Map.Entry<FieldDescriptorType, Object> zzaw = zzaw(i);
                if (((zzkd) zzaw.getKey()).zzcs()) {
                    zzaw.setValue(Collections.unmodifiableList((List) zzaw.getValue()));
                }
            }
            for (Map.Entry<FieldDescriptorType, Object> entry : zzes()) {
                if (((zzkd) entry.getKey()).zzcs()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zzbp();
    }
}
