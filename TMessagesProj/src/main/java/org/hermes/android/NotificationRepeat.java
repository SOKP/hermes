/*
 * This is the source code of Hermes for Android v. 1.7.x.
 * It is licensed under GNU GPL v. 2 or later.
 * You should have received a copy of the license in this archive (see LICENSE).
 *
 * Copyright Umang Raghuvanshi, 2015.
 */

package org.hermes.android;

import android.app.IntentService;
import android.content.Intent;

import org.hermes.messenger.Utilities;

public class NotificationRepeat extends IntentService {

    public NotificationRepeat() {
        super("NotificationRepeat");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public void run() {
                NotificationsController.getInstance().repeatNotificationMaybe();
            }
        });
    }
}
