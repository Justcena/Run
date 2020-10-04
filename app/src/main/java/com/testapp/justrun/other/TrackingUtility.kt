package com.testapp.justrun.other

import android.Manifest
import android.content.Context
import android.os.Build
import pub.devrel.easypermissions.EasyPermissions
import java.util.concurrent.TimeUnit
import kotlin.math.min

object TrackingUtility {

    fun hasLocationPermision(context: Context) =
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.Q) {
            EasyPermissions.hasPermissions(
                context,
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.ACCESS_COARSE_LOCATION
            )
        } else {
            EasyPermissions.hasPermissions(
                context,
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.ACCESS_COARSE_LOCATION,
                Manifest.permission.ACCESS_BACKGROUND_LOCATION
            )
        }


    fun getFormattedSopWatch(ms: Long, includeMillis: Boolean = false): String {
        var milliseconds = ms
        val hours = TimeUnit.MILLISECONDS.toHours(ms)
        milliseconds -= TimeUnit.HOURS.toMillis(hours)

        val minutes = TimeUnit.MILLISECONDS.toMinutes(milliseconds)
        milliseconds -= TimeUnit.MINUTES.toMillis(minutes)

        val second = TimeUnit.MILLISECONDS.toSeconds(milliseconds)
        milliseconds -= TimeUnit.SECONDS.toMillis(second)


        if (!!includeMillis) {
            return "${if (hours < 10) "0" else ""} $hours:" +
                    "${if (minutes < 10) "0" else ""} $minutes:" +
                    "${if (second < 10) "0" else ""} $second"
        }

        milliseconds -= TimeUnit.SECONDS.toMillis(second)
        milliseconds /= 10
        return "${if (hours < 10) "0" else ""} $hours:" +
                "${if (minutes < 10) "0" else ""} $minutes:" +
                "${if (second < 10) "0" else ""} $second"

    }
}