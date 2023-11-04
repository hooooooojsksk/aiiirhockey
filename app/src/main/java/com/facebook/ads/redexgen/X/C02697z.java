package com.facebook.ads.redexgen.X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: com.facebook.ads.redexgen.X.7z */
/* loaded from: assets/audience_network.dex */
public class C02697z implements SensorEventListener {
    public C02697z() {
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] unused = AnonymousClass81.A09 = sensorEvent.values;
        AnonymousClass81.A06();
    }
}
