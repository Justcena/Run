package com.testapp.justrun.services

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.NotificationManager.IMPORTANCE_LOW
import android.app.PendingIntent
import android.app.PendingIntent.FLAG_UPDATE_CURRENT
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat
import androidx.lifecycle.LifecycleService
import com.testapp.justrun.R
import com.testapp.justrun.other.Contstant.ACTION_PAUSE_SERVICE
import com.testapp.justrun.other.Contstant.ACTION_SHOW_TRACKING_FRAGMENT
import com.testapp.justrun.other.Contstant.ACTION_START_OR_RESUME_SERVICE
import com.testapp.justrun.other.Contstant.ACTION_STOP_SERVICE
import com.testapp.justrun.other.Contstant.NOTIFICATION_CHANNEL_ID
import com.testapp.justrun.other.Contstant.NOTIFICATION_CHANNEL_NAME
import com.testapp.justrun.other.Contstant.NOTIFICATION_ID
import com.testapp.justrun.ui.MainActivity
import timber.log.Timber

class TrackingService : LifecycleService() {
    var isFirstRun = true
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        intent?.let {
            when (it.action) {
                ACTION_START_OR_RESUME_SERVICE -> {
                    if (isFirstRun) {
                        startForgroundService()
                        isFirstRun = false
                    } else {
                        Timber.d("Resume service")
                    }
                }
                ACTION_PAUSE_SERVICE -> {
                    Timber.d("Paused service")
                }
                ACTION_STOP_SERVICE -> {
                    Timber.d("Stop service")
                }

            }
        }
        return super.onStartCommand(intent, flags, startId)
    }


    private fun startForgroundService() {
        val notificationManager =
            getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            createNotificationChannel(notificationManager)
        }
        val builder = NotificationCompat.Builder(this, NOTIFICATION_CHANNEL_ID)
            .setAutoCancel(false)
            .setOngoing(true)
            .setSmallIcon(R.drawable.ic_directions_run_black_24dp)
            .setContentTitle("Ruuuuuuuuuuuuuuuun....")
            .setContentText("00:00:00")
            .setContentIntent(getMainActivityPendingIntent())

        startForeground(NOTIFICATION_ID, builder.build())
    }

    private fun getMainActivityPendingIntent() = PendingIntent.getActivity(
        this, 0,
        Intent(this, MainActivity::class.java).also {
            it.action = ACTION_SHOW_TRACKING_FRAGMENT
        },
        FLAG_UPDATE_CURRENT
    )



    @RequiresApi(Build.VERSION_CODES.O)
    private fun createNotificationChannel(notificationManager: NotificationManager) =
        notificationManager.createNotificationChannel(
            NotificationChannel(
                NOTIFICATION_CHANNEL_ID,
                NOTIFICATION_CHANNEL_NAME, IMPORTANCE_LOW
            )
        )
}