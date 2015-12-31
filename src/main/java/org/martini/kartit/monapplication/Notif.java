package org.martini.kartit.monapplication;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

public class Notif extends BroadcastReceiver {

    public static final String TAG = "TAG";

    @Override
    public void onReceive(Context context, Intent intent) {

        Log.d(TAG, intent.getAction());

        PendingIntent pi = PendingIntent.getActivity(context,0,new Intent(context,Recycler.class),0);

        NotificationCompat.Builder notif = new NotificationCompat.Builder(context);
        notif.setSmallIcon(R.drawable.kro_notif);
        notif.setContentText(context.getString(R.string.beerNotif));
        notif.setContentTitle(context.getString(R.string.beerList));
        notif.setContentIntent(pi);
        notif.setAutoCancel(true);

        NotificationManager manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(42, notif.build());

    }
}