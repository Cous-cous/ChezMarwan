package org.martini.kartit.monapplication;


import android.app.IntentService;
import android.content.Intent;
import android.content.Context;
import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class DrinkDownload extends IntentService {

    // TODO: Rename actions, choose action names that describe tasks that this
    // IntentService can perform, e.g. ACTION_FETCH_NEW_ITEMS
    private static final String ACTION_Get_Drink = "org.martini.kartit.monapplication.action.Get_Drink";

    public static final String TAG = "TAG";
    /**
     * Starts this service to perform action Foo with the given parameters. If
     * the service is already performing a task this action will be queued.
     *
     * @see IntentService
     */
    // TODO: Customize helper method
    public static void startActionGetJson(Context context) {

        Intent intent = new Intent(context, DrinkDownload.class);
        intent.setAction(ACTION_Get_Drink);

        context.startService(intent);
    }

    /**
     * Starts this service to perform action Baz with the given parameters. If
     * the service is already performing a task this action will be queued.
     *
     * @see IntentService
     */
    // TODO: Customize helper method

    public DrinkDownload() {
        super("DrinkDownload");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            final String action = intent.getAction();
            if (ACTION_Get_Drink.equals(action)) {
                handleActionGetJson();
            }
        }
    }


    private void copyInputStreamToFile(InputStream inputStream, File file) {
        try {
            OutputStream out = new FileOutputStream(file);
            byte[] buf = new byte[1024];
            int len;
            while((len=inputStream.read(buf))>0) {
                out.write(buf,0,len);
            }
            out.close();
            inputStream.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private void handleActionGetJson() {

        // TODO: Handle action Get_Json
        Log.d(TAG, "Thread service name:" + Thread.currentThread().getName());
        URL url = null;

        try {
            url = new URL("http://binouze.fabrigli.fr/bieres.json");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            if(HttpURLConnection.HTTP_OK == conn.getResponseCode()){
                copyInputStreamToFile(conn.getInputStream(), new File(getCacheDir(), "bieres.json"));
                Log.d(TAG, "Drink Menu downloaded !");

                Intent i = new Intent("BEERS_UPDATE");
                sendBroadcast(i);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
