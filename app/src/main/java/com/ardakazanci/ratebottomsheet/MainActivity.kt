package com.ardakazanci.ratebottomsheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.mikhaellopez.ratebottomsheet.RateBottomSheet
import com.mikhaellopez.ratebottomsheet.RateBottomSheetManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        RateBottomSheetManager(this)
            .setDebugForceOpenEnable(true)
            .setInstallDays(1) // 3 by default
            .setLaunchTimes(2) // 5 by default
            .setRemindInterval(1) // 2 by default
            .setShowAskBottomSheet(true) // True by default
            .setShowLaterButton(true) // True by default
            .setShowCloseButtonIcon(true) // True by default
            .monitor()

        val button : Button = findViewById(R.id.button)

    
        button.setOnClickListener {
            RateBottomSheet.showRateBottomSheetIfMeetsConditions(this)
        }


    }
}
