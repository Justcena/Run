package com.testapp.justrun.other

import android.graphics.Color
import com.google.android.gms.maps.model.LatLng

typealias  Polyline = MutableList<LatLng>
typealias Polylines = MutableList<Polyline>

object Contstant {
    val RUNNING_DATABASE_NAME = "running_db"
    val REQUEST_CODE_LOCATION_PERMISSION = 0

    const val ACTION_START_OR_RESUME_SERVICE = "ACTION_START_OR_RESUME_SERVICE"
    const val ACTION_PAUSE_SERVICE = "ACTION_PAUSE_SERVICE"
    const val ACTION_STOP_SERVICE = "ACTION_STOP_SERVICE"

    const val ACTION_SHOW_TRACKING_FRAGMENT = "ACTION_SHOW_TRACKING_FRAGMENT"

    const val PLYLINE_COLOR = Color.RED
    const val POLYINE_WIDTH = 8f
    const val MAP_ZOOM = 15f

    const val NOTIFICATION_CHANNEL_ID = "tracking_channel"
    const val NOTIFICATION_CHANNEL_NAME = "Tracking"
    const val NOTIFICATION_ID = 1

}