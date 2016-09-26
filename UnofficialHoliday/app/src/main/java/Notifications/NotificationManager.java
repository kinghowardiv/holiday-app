package Notifications;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;

import com.example.peter.unofficialholiday.R;

/**
 * Created by peter on 4/9/2016.
 */
public class NotificationManager {



    public void NotificationSender(Context currentContext, String messageText){
       // NotificationCompat.Builder notifBuilder = new NotificationCompat.Builder(currentContext);
       // NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        Notification notification = new Notification(R.drawable.leaf,messageText, System.currentTimeMillis());

      //  notifBuilder.setContentText(messageText);
        //notifBuilder.setContentTitle("Unofficial Holiday For Today!");
        //notifBuilder.setSmallIcon(R.drawable.leaf);
    }
}
