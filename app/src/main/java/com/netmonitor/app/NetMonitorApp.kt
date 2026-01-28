package com.netmonitor.app

import android.app.Application
import com.netmonitor.app.util.CrashLogger

class NetMonitorApp : Application() {
    override fun onCreate() {
        super.onCreate()
        CrashLogger.init(this)
    }
}
