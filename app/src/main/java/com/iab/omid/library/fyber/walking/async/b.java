package com.iab.omid.library.fyber.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class b extends AsyncTask<Object, Void, String> {
    private a a;
    protected final InterfaceC0064b b;

    /* loaded from: classes2.dex */
    public interface a {
        void a(b bVar);
    }

    /* renamed from: com.iab.omid.library.fyber.walking.async.b$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC0064b {
        JSONObject a();

        void a(JSONObject jSONObject);
    }

    public b(InterfaceC0064b interfaceC0064b) {
        this.b = interfaceC0064b;
    }

    public void a(a aVar) {
        this.a = aVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
