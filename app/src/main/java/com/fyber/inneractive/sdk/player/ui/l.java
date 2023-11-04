package com.fyber.inneractive.sdk.player.ui;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.a0;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.features.r;
import com.fyber.inneractive.sdk.config.global.s;
import com.fyber.inneractive.sdk.ui.IAsmoothProgressBar;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.k0;
import com.fyber.inneractive.sdk.util.l0;
import com.fyber.inneractive.sdk.util.m0;
import com.fyber.inneractive.sdk.util.t0;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class l extends com.fyber.inneractive.sdk.player.ui.d {
    public static final k0 P;
    public View A;
    public l0 B;
    public l0 C;
    public int D;
    public int E;
    public Runnable F;
    public t0 G;
    public boolean H;
    public View I;
    public TextView J;
    public final s K;
    public ObjectAnimator L;
    public boolean M;
    public String N;
    public final l0 O;
    public ImageView i;
    public ViewGroup j;
    public TextView k;
    public Button l;
    public ImageView m;
    public TextView n;
    public TextView o;
    public View p;
    public TextView q;
    public int r;
    public int s;
    public boolean t;
    public ImageView u;
    public ImageView v;
    public IAsmoothProgressBar w;
    public View x;
    public View y;
    public ViewGroup z;

    /* loaded from: classes.dex */
    public class a implements t0.b {
        public final /* synthetic */ int a;

        public a(int i) {
            l.this = r1;
            this.a = i;
        }

        @Override // com.fyber.inneractive.sdk.util.t0.b
        public void a(t0 t0Var) {
            if (!l.this.h) {
                IAlog.a("Autoclick is triggered", new Object[0]);
                ((com.fyber.inneractive.sdk.player.controller.k) l.this.g).a(this.a, l.P);
            } else {
                IAlog.a("Autoclick is aborted - app in background", new Object[0]);
            }
            l.this.g();
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnLayoutChangeListener {
        public final /* synthetic */ Bitmap a;

        public b(Bitmap bitmap) {
            l.this = r1;
            this.a = bitmap;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (l.this.getWidth() <= 0 || l.this.getHeight() <= 0) {
                return;
            }
            l.this.b(true);
            l.this.removeOnLayoutChangeListener(this);
            l.this.a(this.a);
        }
    }

    /* loaded from: classes.dex */
    public class c extends GestureDetector.SimpleOnGestureListener {
        public final /* synthetic */ View a;
        public final /* synthetic */ int[] b;
        public final /* synthetic */ int c;

        public c(View view, int[] iArr, int i) {
            l.this = r1;
            this.a = view;
            this.b = iArr;
            this.c = i;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            onSingleTapConfirmed(motionEvent);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            onSingleTapConfirmed(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                this.a.getRootView().getLocationOnScreen(this.b);
                float rawX = motionEvent.getRawX() - this.b[0];
                float rawY = motionEvent.getRawY() - this.b[1];
                k0 k0Var = l.this.a;
                k0Var.a = rawX;
                k0Var.b = rawY;
            }
            l lVar = l.this;
            i iVar = lVar.g;
            if (iVar != null) {
                ((com.fyber.inneractive.sdk.player.controller.k) iVar).a(this.c, lVar.a);
            }
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnTouchListener {
        public final /* synthetic */ GestureDetector a;

        public d(l lVar, GestureDetector gestureDetector) {
            this.a = gestureDetector;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return this.a.onTouchEvent(motionEvent);
        }
    }

    static {
        k0 a2 = k0.a();
        a2.c = true;
        P = a2;
    }

    public l(Context context, s sVar, String str) {
        this(context, null, 0, sVar, str);
    }

    private void setAppInfoButtonRound(TextView textView) {
        textView.setBackgroundResource(R.drawable.bg_circle_overlay);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        layoutParams.width = (int) getContext().getResources().getDimension(R.dimen.ia_image_control_size);
        layoutParams.height = (int) getContext().getResources().getDimension(R.dimen.ia_image_control_size);
        textView.setLayoutParams(layoutParams);
    }

    public abstract void a(com.fyber.inneractive.sdk.player.ui.b bVar);

    public void a(boolean z, String str) {
        TextView textView = this.q;
        if (textView != null) {
            textView.setText(str);
            if (str != null && str.length() == 1) {
                setAppInfoButtonRound(this.q);
            }
            if (z) {
                h();
            }
            this.q.setVisibility(z ? 0 : 8);
        }
    }

    public void b(com.fyber.inneractive.sdk.player.ui.b bVar) {
        if (this.z != null) {
            if (com.fyber.inneractive.sdk.model.vast.g.Static == bVar.f && (!r.c.NONE.equals(bVar.k))) {
                a(this.z, bVar.k, bVar.l);
            } else {
                this.z.setVisibility(0);
            }
        }
    }

    public abstract void b(boolean z);

    public abstract void c();

    public void c(com.fyber.inneractive.sdk.player.ui.b bVar) {
        com.fyber.inneractive.sdk.model.vast.g gVar = bVar.f;
        com.fyber.inneractive.sdk.model.vast.g gVar2 = com.fyber.inneractive.sdk.model.vast.g.Static;
        if (gVar2 == gVar) {
            a(this.p, 4);
        }
        if (gVar2 == gVar || gVar == com.fyber.inneractive.sdk.model.vast.g.FMP_End_Card) {
            Integer num = bVar.d;
            if (!(num != null) || num == null) {
                return;
            }
            a(gVar != gVar2 ? 8 : 4, num.intValue());
        }
    }

    public abstract void d();

    public void d(com.fyber.inneractive.sdk.player.ui.b bVar) {
        String string;
        com.fyber.inneractive.sdk.ignite.k kVar;
        View view = this.y;
        if (view != null) {
            if (bVar.a) {
                if (!r.c.NONE.equals(bVar.k)) {
                    a(this.y, bVar.k, bVar.l);
                } else {
                    this.y.setVisibility(0);
                }
            } else {
                view.setVisibility(8);
            }
            this.l.setAllCaps(bVar.b);
            if (IAConfigManager.M.E.d() && (kVar = bVar.m) != null && kVar.e()) {
                this.l.setText(R.string.ia_video_instant_install_text);
                if (bVar.h) {
                    this.J.setVisibility(0);
                    String str = bVar.i;
                    if (str != null && str.length() == 1) {
                        setAppInfoButtonRound(this.J);
                    }
                    this.J.setText(str);
                }
            } else {
                this.J.setVisibility(8);
                String str2 = bVar.c;
                if (!TextUtils.isEmpty(str2)) {
                    string = m0.a(str2, 15);
                } else {
                    string = getContext().getString(R.string.ia_video_install_now_text);
                }
                this.l.setText(string);
            }
            UnitDisplayType unitDisplayType = ((a0) this.c).f.j;
            if (bVar.g) {
                this.l.setBackgroundResource(R.drawable.bg_green);
                this.m.setVisibility(0);
                ImageView imageView = this.m;
                float f = bVar.j;
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageView, PropertyValuesHolder.ofFloat(View.SCALE_X, f), PropertyValuesHolder.ofFloat(View.SCALE_Y, f));
                ofPropertyValuesHolder.setRepeatCount(-1);
                ofPropertyValuesHolder.setRepeatMode(2);
                ofPropertyValuesHolder.setDuration(700L);
                ofPropertyValuesHolder.start();
            } else if (!unitDisplayType.equals(UnitDisplayType.LANDSCAPE) && !unitDisplayType.equals(UnitDisplayType.MRECT)) {
                this.l.setBackgroundResource(R.drawable.bg_green);
                this.l.setTextSize(0, getResources().getDimension(R.dimen.ia_video_overlay_text_large_plus));
            } else {
                this.l.setBackgroundResource(R.drawable.bg_green_medium);
                this.l.setTextSize(0, getResources().getDimension(R.dimen.ia_video_overlay_text_large));
            }
            this.l.setVisibility(0);
            if (bVar.a) {
                Integer num = bVar.d;
                if (!(num != null) || num == null) {
                    return;
                }
                a(8, num.intValue());
            }
        }
    }

    public abstract void d(boolean z);

    @Override // com.fyber.inneractive.sdk.player.ui.d, com.fyber.inneractive.sdk.player.ui.h
    public void destroy() {
        super.destroy();
        IAlog.a("%sdestroyed called", IAlog.a(this));
        Runnable runnable = this.F;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.F = null;
        }
        g();
        ViewGroup viewGroup = this.j;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
    }

    public void e() {
        this.i = (ImageView) findViewById(R.id.ia_iv_last_frame);
        this.j = (ViewGroup) findViewById(R.id.ia_texture_view_host);
        this.k = (TextView) findViewById(R.id.ia_tv_call_to_action);
        this.v = (ImageView) findViewById(R.id.ia_iv_expand_collapse_button);
        this.y = findViewById(R.id.ia_default_endcard_video_overlay);
        this.z = (ViewGroup) findViewById(R.id.ia_endcard_video_overlay);
        this.x = findViewById(R.id.ia_paused_video_overlay);
        this.A = findViewById(R.id.ia_buffering_overlay);
        this.l = (Button) findViewById(R.id.ia_b_end_card_call_to_action);
        this.J = (TextView) findViewById(R.id.ia_endcard_tv_app_info_button);
        this.m = (ImageView) findViewById(R.id.hand_animation);
        this.q = (TextView) findViewById(R.id.ia_tv_app_info_button);
        a(this, 7);
        a(this.u, 1);
        a(this.k, 3);
        a(this.q, 10);
        a(this.J, 10);
        a(this.l, 8);
        a(this.v, 5);
        a(this.j, 7);
        a(this.x, 9);
        a(findViewById(R.id.ia_default_endcard_video_overlay), -1);
    }

    public boolean f() {
        return this.y.getVisibility() == 0 || this.z.getChildCount() > 0;
    }

    public final void g() {
        if (this.G != null) {
            IAlog.a("Autoclick is removed ", new Object[0]);
            this.G.e = null;
            this.G = null;
        }
    }

    public View getEndCardView() {
        return this.p;
    }

    public ViewGroup getTextureHost() {
        return this.j;
    }

    public abstract View[] getTrackingFriendlyView();

    public abstract View[] getTrackingFriendlyViewObstructionPurposeOther();

    public int getVideoHeight() {
        return this.s;
    }

    public int getVideoWidth() {
        return this.r;
    }

    public abstract void h();

    public void i() {
        ImageView imageView = this.v;
        if (imageView != null) {
            imageView.setVisibility(0);
            this.v.setSelected(true);
        }
    }

    public abstract void j();

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        a(this.O, size, size2);
        l0 l0Var = this.O;
        int i3 = l0Var.a;
        if (i3 > 0 && l0Var.b > 0) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            i2 = View.MeasureSpec.makeMeasureSpec(this.O.b, 1073741824);
            i = makeMeasureSpec;
        } else {
            l0Var.a = size;
            l0Var.b = size2;
        }
        if (!this.B.equals(this.O)) {
            l0 l0Var2 = this.B;
            l0 l0Var3 = this.O;
            l0Var2.getClass();
            l0Var2.a = l0Var3.a;
            l0Var2.b = l0Var3.b;
            j();
        }
        super.onMeasure(i, i2);
    }

    public void setLastFrameBitmapBlurred(Bitmap bitmap) {
        if (this.i == null || bitmap == null) {
            return;
        }
        com.fyber.inneractive.sdk.util.c cVar = new com.fyber.inneractive.sdk.util.c();
        cVar.c = 20;
        cVar.d = 1;
        cVar.a = bitmap.getWidth();
        cVar.b = bitmap.getHeight();
        this.i.setImageBitmap(com.fyber.inneractive.sdk.util.b.a(getContext(), bitmap, cVar));
    }

    public void setMuteButtonState(boolean z) {
        this.u.setSelected(z);
    }

    public abstract void setRemainingTime(String str);

    public abstract void setSkipText(String str);

    public l(Context context, AttributeSet attributeSet, int i, s sVar, String str) {
        super(context, null, i);
        this.r = -1;
        this.s = -1;
        this.t = false;
        this.B = new l0(0, 0);
        this.H = false;
        this.I = null;
        this.M = false;
        this.O = new l0(0, 0);
        IAlog.a("%sctor called", a());
        setBackgroundColor(getResources().getColor(R.color.ia_video_background_color));
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.K = sVar;
        this.N = str;
    }

    public void setLastFrameBitmap(Bitmap bitmap) {
        IAlog.a("%ssetLastFrameBitmap - %s", IAlog.a(this), bitmap);
        ImageView imageView = this.i;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
        l0 l0Var = this.B;
        if (l0Var.a != 0 && l0Var.b != 0) {
            a(bitmap);
            return;
        }
        b(false);
        addOnLayoutChangeListener(new b(bitmap));
    }

    public void c(boolean z) {
        View view = this.x;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void a(int i, int i2) {
        if (this.H || this.G != null) {
            return;
        }
        IAlog.a("Start Autoclick timer - %d seconds", Integer.valueOf(i2));
        t0 t0Var = new t0(TimeUnit.SECONDS, i2);
        this.G = t0Var;
        t0Var.e = new a(i);
        t0Var.c();
    }

    public void a(View view, r.c cVar, int i) {
        if (this.M || !r.c.ZOOM_IN.equals(cVar)) {
            return;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.SCALE_X, 0.0f, 1.0f), PropertyValuesHolder.ofFloat(View.SCALE_Y, 0.0f, 1.0f));
        this.L = ofPropertyValuesHolder;
        ofPropertyValuesHolder.setDuration(i);
    }

    public final void a(Bitmap bitmap) {
        if (bitmap != null) {
            UnitDisplayType unitDisplayType = this.d;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            l0 l0Var = this.B;
            int i = l0Var.a;
            int i2 = l0Var.b;
            if (width > 0 && height > 0) {
                float f = width;
                float f2 = height;
                float f3 = f / f2;
                if (unitDisplayType == UnitDisplayType.SQUARE) {
                    i = (int) (i2 * f3);
                } else {
                    if (Math.abs(f3 - 1.7777778f) >= 0.1f) {
                        Math.abs(f3 - 1.3333334f);
                    }
                    float min = Math.min(i / f, 10.0f);
                    float f4 = i2;
                    float f5 = min * f2;
                    if (f4 > f5) {
                        i = (int) (min * f);
                        i2 = (int) f5;
                    } else {
                        float min2 = Math.min(f4 / f2, 10.0f);
                        i = (int) (f * min2);
                        i2 = (int) (min2 * f2);
                    }
                }
            }
            ImageView imageView = this.i;
            if (imageView != null) {
                imageView.getLayoutParams().width = i;
                this.i.getLayoutParams().height = i2;
            }
        }
    }

    public void a(boolean z) {
        View view = this.A;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void a(View view, int i) {
        if (view != null) {
            view.setOnTouchListener(new d(this, new GestureDetector(view.getContext(), new c(view, new int[2], i))));
        }
    }
}
