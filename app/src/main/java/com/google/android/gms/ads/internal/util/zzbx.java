package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzeyc;
import com.google.android.gms.internal.ads.zzfng;
import com.google.android.gms.internal.ads.zzfoh;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzbx {
    public static Point zza(MotionEvent motionEvent, View view) {
        int[] zzj = zzj(view);
        return new Point(((int) motionEvent.getRawX()) - zzj[0], ((int) motionEvent.getRawY()) - zzj[1]);
    }

    public static WindowManager.LayoutParams zzb() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhs)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    public static JSONObject zzc(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("x", com.google.android.gms.ads.internal.client.zzay.zzb().zzb(context, point2.x));
                    jSONObject3.put("y", com.google.android.gms.ads.internal.client.zzay.zzb().zzb(context, point2.y));
                    jSONObject3.put("start_x", com.google.android.gms.ads.internal.client.zzay.zzb().zzb(context, point.x));
                    jSONObject3.put("start_y", com.google.android.gms.ads.internal.client.zzay.zzb().zzb(context, point.y));
                    jSONObject = jSONObject3;
                } catch (JSONException e) {
                    zzbza.zzh("Error occurred while putting signals into JSON object.", e);
                }
                jSONObject2.put("click_point", jSONObject);
                jSONObject2.put("asset_id", str);
                return jSONObject2;
            } catch (Exception e2) {
                e = e2;
                jSONObject = jSONObject2;
                zzbza.zzh("Error occurred while grabbing click signals.", e);
                return jSONObject;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public static JSONObject zzd(Context context, Map map, Map map2, View view, ImageView.ScaleType scaleType) {
        String str;
        String str2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String str3 = "ad_view";
        String str4 = "relative_to";
        JSONObject jSONObject3 = new JSONObject();
        if (map == null || view == null) {
            return jSONObject3;
        }
        int[] zzj = zzj(view);
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            View view2 = (View) ((WeakReference) entry.getValue()).get();
            if (view2 != null) {
                int[] zzj2 = zzj(view2);
                JSONObject jSONObject4 = new JSONObject();
                JSONObject jSONObject5 = new JSONObject();
                Iterator it2 = it;
                try {
                    JSONObject jSONObject6 = jSONObject3;
                    try {
                        jSONObject5.put("width", com.google.android.gms.ads.internal.client.zzay.zzb().zzb(context, view2.getMeasuredWidth()));
                        jSONObject5.put("height", com.google.android.gms.ads.internal.client.zzay.zzb().zzb(context, view2.getMeasuredHeight()));
                        jSONObject5.put("x", com.google.android.gms.ads.internal.client.zzay.zzb().zzb(context, zzj2[0] - zzj[0]));
                        jSONObject5.put("y", com.google.android.gms.ads.internal.client.zzay.zzb().zzb(context, zzj2[1] - zzj[1]));
                        jSONObject5.put(str4, str3);
                        jSONObject4.put("frame", jSONObject5);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObject2 = zzk(context, rect);
                        } else {
                            jSONObject2 = new JSONObject();
                            jSONObject2.put("width", 0);
                            jSONObject2.put("height", 0);
                            jSONObject2.put("x", com.google.android.gms.ads.internal.client.zzay.zzb().zzb(context, zzj2[0] - zzj[0]));
                            jSONObject2.put("y", com.google.android.gms.ads.internal.client.zzay.zzb().zzb(context, zzj2[1] - zzj[1]));
                            jSONObject2.put(str4, str3);
                        }
                        jSONObject4.put("visible_bounds", jSONObject2);
                        if (((String) entry.getKey()).equals("3010")) {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhm)).booleanValue()) {
                                jSONObject4.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                            }
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhn)).booleanValue()) {
                                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                jSONObject4.put("view_width_layout_type", zzl(layoutParams.width) - 1);
                                jSONObject4.put("view_height_layout_type", zzl(layoutParams.height) - 1);
                            }
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzho)).booleanValue()) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(Integer.valueOf(view2.getId()));
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    arrayList.add(Integer.valueOf(((View) parent).getId()));
                                }
                                jSONObject4.put("view_path", TextUtils.join("/", arrayList));
                            }
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhp)).booleanValue() && scaleType != null) {
                                jSONObject4.put("mediaview_scale_type", scaleType.ordinal());
                            }
                        }
                        if (view2 instanceof TextView) {
                            TextView textView = (TextView) view2;
                            jSONObject4.put("text_color", textView.getCurrentTextColor());
                            str = str3;
                            str2 = str4;
                            try {
                                jSONObject4.put("font_size", textView.getTextSize());
                                jSONObject4.put("text", textView.getText());
                            } catch (JSONException unused) {
                                jSONObject = jSONObject6;
                                zzbza.zzj("Unable to get asset views information");
                                it = it2;
                                jSONObject3 = jSONObject;
                                str3 = str;
                                str4 = str2;
                            }
                        } else {
                            str = str3;
                            str2 = str4;
                        }
                        jSONObject4.put("is_clickable", map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable());
                        jSONObject = jSONObject6;
                        try {
                            jSONObject.put((String) entry.getKey(), jSONObject4);
                        } catch (JSONException unused2) {
                            zzbza.zzj("Unable to get asset views information");
                            it = it2;
                            jSONObject3 = jSONObject;
                            str3 = str;
                            str4 = str2;
                        }
                    } catch (JSONException unused3) {
                        str = str3;
                        str2 = str4;
                    }
                } catch (JSONException unused4) {
                    str = str3;
                    str2 = str4;
                    jSONObject = jSONObject3;
                }
                it = it2;
                jSONObject3 = jSONObject;
                str3 = str;
                str4 = str2;
            }
        }
        return jSONObject3;
    }

    public static JSONObject zze(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            com.google.android.gms.ads.internal.zzt.zzp();
            jSONObject.put("can_show_on_lock_screen", zzs.zzl(view));
            com.google.android.gms.ads.internal.zzt.zzp();
            jSONObject.put("is_keyguard_locked", zzs.zzz(context));
        } catch (JSONException unused) {
            zzbza.zzj("Unable to get lock screen information");
        }
        return jSONObject;
    }

    public static JSONObject zzf(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhl)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzp();
                ViewParent parent = view.getParent();
                while (parent != null && !(parent instanceof ScrollView)) {
                    parent = parent.getParent();
                }
                if (parent != null) {
                    r2 = true;
                }
                jSONObject.put("contained_in_scroll_view", r2);
            } else {
                com.google.android.gms.ads.internal.zzt.zzp();
                ViewParent parent2 = view.getParent();
                while (parent2 != null && !(parent2 instanceof AdapterView)) {
                    parent2 = parent2.getParent();
                }
                jSONObject.put("contained_in_scroll_view", (parent2 == null ? -1 : ((AdapterView) parent2).getPositionForView(view)) != -1);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:18|(9:45|46|21|22|23|(3:25|(1:29)|39)(3:40|(1:42)|39)|30|(2:32|(1:34)(1:37))(1:38)|35)|20|21|22|23|(0)(0)|30|(0)(0)|35) */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0175, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0176, code lost:
        com.google.android.gms.internal.ads.zzbza.zzh("Could not log native template signal to JSON", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0170 A[Catch: JSONException -> 0x0175, TRY_LEAVE, TryCatch #3 {JSONException -> 0x0175, blocks: (B:100:0x013c, B:117:0x0167, B:118:0x016b, B:119:0x0170), top: B:133:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x018d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:122:0x0176 -> B:132:0x017b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONObject zzg(android.content.Context r16, android.view.View r17) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzbx.zzg(android.content.Context, android.view.View):org.json.JSONObject");
    }

    public static boolean zzh(Context context, zzeyc zzeycVar) {
        if (zzeycVar.zzO) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhq)).booleanValue()) {
                return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzht)).booleanValue();
            }
            String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhr);
            if (!str.isEmpty() && context != null) {
                String packageName = context.getPackageName();
                for (String str2 : zzfoh.zzc(zzfng.zzc(';')).zzd(str)) {
                    if (str2.equals(packageName)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public static boolean zzi(int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcY)).booleanValue()) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcZ)).booleanValue() || i <= 15299999;
        }
        return true;
    }

    public static int[] zzj(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    private static JSONObject zzk(Context context, Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", com.google.android.gms.ads.internal.client.zzay.zzb().zzb(context, rect.right - rect.left));
        jSONObject.put("height", com.google.android.gms.ads.internal.client.zzay.zzb().zzb(context, rect.bottom - rect.top));
        jSONObject.put("x", com.google.android.gms.ads.internal.client.zzay.zzb().zzb(context, rect.left));
        jSONObject.put("y", com.google.android.gms.ads.internal.client.zzay.zzb().zzb(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    private static int zzl(int i) {
        if (i != -2) {
            return i != -1 ? 2 : 3;
        }
        return 4;
    }
}
