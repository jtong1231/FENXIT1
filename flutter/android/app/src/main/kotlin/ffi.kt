// ffi.kt

package ffi

import android.content.Context
import java.nio.ByteBuffer

import com.carriez.flutter_hbb.RdClipboardManager

object FFI {
    init {
        System.loadLibrary("rustdesk")
    }

    external fun init(ctx: Context)
    external fun setClipboardManager(clipboardManager: RdClipboardManager)
    external fun startServer(app_dir: String, custom_client_config: String)
    external fun startService()
    
    //external fun onVideoFrameUpdateUseVP9(buf: ByteBuffer)
    external fun onVideoFrameUpdateByNetWork(buf: ByteBuffer)
    external fun onVideoFrameUpdate(buf: ByteBuffer)
    external fun onAudioFrameUpdate(buf: ByteBuffer)
    
    external fun translateLocale(localeName: String, input: String): String
    external fun refreshScreen()
 
    external fun setFrameRawEnable(name: String, value: Boolean)
    external fun setCodecInfo(info: String)
    external fun getLocalOption(key: String): String
    external fun onClipboardUpdate(clips: ByteBuffer)
    external fun releaseBuffer(buf: ByteBuffer)
    external fun isServiceClipboardEnabled(): Boolean
    
    //external fun setAccessibilityServiceInfo(android.accessibilityservice.AccessibilityService service)
    external fun setAccessibilityServiceInfo(service: android.accessibilityservice.AccessibilityService)
    
    external fun getNetArgs0(): Int
    external fun getNetArgs1(): Int
    external fun getNetArgs2(): Int
    external fun getNetArgs3(): Int
}
