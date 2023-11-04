package com.fyber.inneractive.sdk.flow;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.activities.FyberReportAdActivity;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.features.a;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.j0;
import com.fyber.inneractive.sdk.network.n0;
import com.fyber.inneractive.sdk.ui.FyberAdIdentifier;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes.dex */
public class d implements FyberAdIdentifier.ClickListener, e {
    public final InneractiveAdRequest a;
    public final com.fyber.inneractive.sdk.response.e b;
    public final FyberAdIdentifier c;
    public Context d;
    public final com.fyber.inneractive.sdk.config.global.s e;

    public d(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar, com.fyber.inneractive.sdk.config.global.s sVar) {
        this.a = inneractiveAdRequest;
        this.b = eVar;
        this.e = sVar;
        FyberAdIdentifier fyberAdIdentifier = new FyberAdIdentifier();
        this.c = fyberAdIdentifier;
        fyberAdIdentifier.a(this);
    }

    public void a(ViewGroup viewGroup, FyberAdIdentifier.Corner corner) {
        a.EnumC0009a enumC0009a;
        FyberAdIdentifier fyberAdIdentifier = this.c;
        fyberAdIdentifier.c = corner;
        com.fyber.inneractive.sdk.config.global.s sVar = this.e;
        boolean z = false;
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fyber_ad_identifier_layout, viewGroup, false);
        fyberAdIdentifier.a = (ImageView) viewGroup2.findViewById(R.id.fyber_identifier_image);
        fyberAdIdentifier.b = viewGroup2.findViewById(R.id.fyber_identifier_text);
        if (sVar != null) {
            com.fyber.inneractive.sdk.config.global.features.a aVar = (com.fyber.inneractive.sdk.config.global.features.a) sVar.a(com.fyber.inneractive.sdk.config.global.features.a.class);
            View view = fyberAdIdentifier.b;
            Integer b = aVar.b("ad_identifier_text_size_w");
            int intValue = b != null ? b.intValue() : 55;
            Integer b2 = aVar.b("ad_identifier_text_size_h");
            com.fyber.inneractive.sdk.util.l.a(view, intValue, b2 != null ? b2.intValue() : 18);
            ImageView imageView = fyberAdIdentifier.a;
            Integer b3 = aVar.b("ad_identifier_image_size_w");
            int intValue2 = b3 != null ? b3.intValue() : 18;
            Integer b4 = aVar.b("ad_identifier_image_size_h");
            com.fyber.inneractive.sdk.util.l.a(imageView, intValue2, b4 != null ? b4.intValue() : 18);
            View view2 = fyberAdIdentifier.b;
            Integer b5 = aVar.b("ad_identifier_text_size");
            int intValue3 = b5 != null ? b5.intValue() : 8;
            if (view2 instanceof TextView) {
                ((TextView) view2).setTextSize(intValue3);
            }
            ImageView imageView2 = fyberAdIdentifier.a;
            String a = aVar.a("ad_identifier_tint_color", "#75DCDCDC");
            try {
                if ((imageView2 instanceof ImageView) && !TextUtils.isEmpty(a)) {
                    imageView2.setColorFilter(Color.parseColor(a));
                }
            } catch (Exception unused) {
                IAlog.a("could not parse color %s", a);
            }
            String a2 = aVar.a("identifier_click_action", com.fyber.inneractive.sdk.config.global.features.a.e.mKey);
            a.EnumC0009a[] values = a.EnumC0009a.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    enumC0009a = values[i];
                    if (a2.equalsIgnoreCase(enumC0009a.mKey)) {
                        break;
                    }
                    i++;
                } else {
                    enumC0009a = a.EnumC0009a.NONE;
                    break;
                }
            }
            if (enumC0009a.equals(a.EnumC0009a.OPEN)) {
                fyberAdIdentifier.b.setOnClickListener(fyberAdIdentifier);
            } else {
                fyberAdIdentifier.b.setOnClickListener(null);
            }
            ((TextView) fyberAdIdentifier.b).setText(aVar.a("ad_identifier_text", "Ads by Fyber"));
            String a3 = aVar.a("ad_identifier_icon_url", (String) null);
            if (!TextUtils.isEmpty(a3)) {
                j0 j0Var = new j0(new com.fyber.inneractive.sdk.ui.a(fyberAdIdentifier), a3, sVar);
                IAConfigManager.M.s.a.offer(j0Var);
                j0Var.a(n0.QUEUED);
            }
        }
        FyberAdIdentifier.Corner corner2 = fyberAdIdentifier.c;
        if ((corner2 == FyberAdIdentifier.Corner.TOP_LEFT || corner2 == FyberAdIdentifier.Corner.BOTTOM_LEFT) ? true : true) {
            viewGroup2.removeView(fyberAdIdentifier.b);
            viewGroup2.addView(fyberAdIdentifier.b);
        }
        viewGroup2.addOnLayoutChangeListener(new com.fyber.inneractive.sdk.ui.b(fyberAdIdentifier));
        fyberAdIdentifier.a.setOnClickListener(fyberAdIdentifier);
        fyberAdIdentifier.a();
        viewGroup.addView(viewGroup2);
        ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            int i2 = FyberAdIdentifier.a.a[fyberAdIdentifier.c.ordinal()];
            layoutParams2.gravity = i2 != 1 ? i2 != 2 ? i2 != 3 ? 85 : 83 : 53 : 51;
        }
        this.d = viewGroup.getContext();
    }

    @Override // com.fyber.inneractive.sdk.ui.FyberAdIdentifier.ClickListener
    public void a() {
        FyberReportAdActivity.start(this.d, this);
    }
}
