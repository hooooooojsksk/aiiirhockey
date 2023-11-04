package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbdh extends RelativeLayout {
    private static final float[] zza = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
    private AnimationDrawable zzb;

    public zzbdh(Context context, zzbdg zzbdgVar, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        Preconditions.checkNotNull(zzbdgVar);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(zza, null, null));
        shapeDrawable.getPaint().setColor(zzbdgVar.zzd());
        setLayoutParams(layoutParams);
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(zzbdgVar.zzg())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(zzbdgVar.zzg());
            textView.setTextColor(zzbdgVar.zze());
            textView.setTextSize(zzbdgVar.zzf());
            com.google.android.gms.ads.internal.client.zzay.zzb();
            int zzy = zzbyt.zzy(context, 4);
            com.google.android.gms.ads.internal.client.zzay.zzb();
            textView.setPadding(zzy, 0, zzbyt.zzy(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<zzbdj> zzi = zzbdgVar.zzi();
        if (zzi == null || zzi.size() <= 1) {
            if (zzi.size() == 1) {
                try {
                    imageView.setImageDrawable((Drawable) ObjectWrapper.unwrap(((zzbdj) zzi.get(0)).zzf()));
                } catch (Exception e) {
                    zzbza.zzh("Error while getting drawable.", e);
                }
            }
        } else {
            this.zzb = new AnimationDrawable();
            for (zzbdj zzbdjVar : zzi) {
                try {
                    this.zzb.addFrame((Drawable) ObjectWrapper.unwrap(zzbdjVar.zzf()), zzbdgVar.zzb());
                } catch (Exception e2) {
                    zzbza.zzh("Error while getting drawable.", e2);
                }
            }
            imageView.setBackground(this.zzb);
        }
        addView(imageView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.zzb;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
