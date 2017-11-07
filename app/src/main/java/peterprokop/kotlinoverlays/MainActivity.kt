package peterprokop.kotlinoverlays

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.showWaitOverlay()
//        var pb = ProgressBar(this)
//        pb.isIndeterminate = true
//        pb.minimumWidth = 100
//        pb.minimumHeight = 100
//
//        val ll = findViewById<LinearLayout>(R.id.test)
////        v.overlay.add(pb)
//        ll.addView(pb)
    }

}

fun Activity.showWaitOverlay() {
    val v = findViewById<ViewGroup>(android.R.id.content)
    var pb = ProgressBar(this)
    pb.isIndeterminate = true
    pb.minimumWidth = 100
    pb.minimumHeight = 100

    v.overlay.add(pb)
//    v.overlay
}

fun Activity.showWaitOverlayWithText(text: String) {

}

//// Wait overlay
//self.showWaitOverlay()
//
//// Wait overlay with text
//let text = "Please wait..."
//self.showWaitOverlayWithText(text)
//
//// Overlay with text only
//let text = "This is a text-only overlay...\n...spanning several lines"
//self.showTextOverlay(text)
//
//// Remove everything
//self.removeAllOverlays()
//
//// Notification on top of the status bar
//UIViewController.showNotificationOnTopOfStatusBar(annoyingNotificationView!, duration: 5)
//
//// Block user interaction
//SwiftOverlays.showBlockingWaitOverlayWithText("This is blocking overlay!")
//
//// Don't forget to unblock!
//SwiftOverlays.removeAllBlockingOverlays()