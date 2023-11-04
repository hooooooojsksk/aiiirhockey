package com.fyber.inneractive.sdk.player.controller;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.util.m0;

/* loaded from: classes.dex */
public class t {
    public final Context a;
    public final c b;
    public final Dialog c;
    public final com.fyber.inneractive.sdk.config.global.features.c d;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
            t.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            t.this.c.dismiss();
            n nVar = (n) t.this.b;
            nVar.b.f(nVar.a);
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
            t.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            t.this.c.dismiss();
            t.this.b.getClass();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    public t(Context context, com.fyber.inneractive.sdk.config.global.features.c cVar, c cVar2) {
        this.a = context;
        this.d = cVar;
        this.b = cVar2;
        this.c = new Dialog(context);
        a();
    }

    public final void a() {
        this.c.requestWindowFeature(1);
        this.c.setContentView(R.layout.skip_rewarded_dialog);
        Button button = (Button) this.c.findViewById(R.id.keep_watching_button);
        Button button2 = (Button) this.c.findViewById(R.id.close_button);
        TextView textView = (TextView) this.c.findViewById(R.id.skip_dialog_title_textview);
        TextView textView2 = (TextView) this.c.findViewById(R.id.skip_dialog_sub_title_textview);
        String string = this.a.getString(R.string.skip_rewarded_dialog_keep_watching);
        String string2 = this.a.getString(R.string.skip_rewarded_dialog_close_button);
        String string3 = this.a.getString(R.string.skip_rewarded_dialog_title);
        String string4 = this.a.getString(R.string.skip_rewarded_dialog_sub_title);
        com.fyber.inneractive.sdk.config.global.features.c cVar = this.d;
        if (cVar != null) {
            String a2 = cVar.a("skip_reward_dialog_keep_watching_button", "KEEP WATCHING");
            String trim = a2.trim().length() > 0 ? a2.trim() : "KEEP WATCHING";
            if (!TextUtils.isEmpty(trim)) {
                string = trim;
            }
            String a3 = this.d.a("skip_reward_dialog_close_button", "CLOSE");
            String trim2 = a3.trim().length() > 0 ? a3.trim() : "CLOSE";
            if (!TextUtils.isEmpty(trim2)) {
                string2 = trim2;
            }
            String a4 = this.d.a("skip_reward_dialog_title", "Close Video?");
            String trim3 = a4.trim().length() > 0 ? a4.trim() : "Close Video?";
            if (!TextUtils.isEmpty(trim3)) {
                string3 = trim3;
            }
            String a5 = this.d.a("skip_reward_dialog_sub_title", "Reward will not be received before video completion.");
            String trim4 = a5.trim().length() > 0 ? a5.trim() : "Reward will not be received before video completion.";
            if (!TextUtils.isEmpty(trim4)) {
                string4 = trim4;
            }
        }
        button.setText(m0.a(string, 13));
        button2.setText(m0.a(string2, 13));
        textView.setText(m0.a(string3, 20));
        textView2.setText(m0.a(string4, 100));
        button2.setOnClickListener(new a());
        button.setOnClickListener(new b());
    }
}
