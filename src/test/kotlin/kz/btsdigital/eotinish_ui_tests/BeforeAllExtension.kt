package kz.btsdigital.eotinish_ui_tests

import com.codeborne.selenide.Configuration
import org.junit.jupiter.api.extension.BeforeAllCallback
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.api.extension.ExtensionContext.Store.CloseableResource
import org.openqa.selenium.remote.DesiredCapabilities

class BeforeAllExtension : BeforeAllCallback, CloseableResource {

    override fun beforeAll(context: ExtensionContext) {
        if (!started) {
            started = true

            // start containers
//            Environment.start()

//            Runtime.getRuntime().exec("./selenoid")
//            Runtime.getRuntime().exec("./cm selenoid start --browsers 'chrome:latest'")

            val capabilities = DesiredCapabilities(mapOf("enableVNC" to true))
            Configuration.browserCapabilities = capabilities
            Configuration.timeout = 1000
            Configuration.pageLoadTimeout = 30000

            Configuration.browser = "chrome"
//            Configuration.remote = "http://localhost:4444/wd/hub"
//            Configuration.driverManagerEnabled = false

            // The following line registers a callback hook when the root test context is shut down
            context.root.getStore(ExtensionContext.Namespace.GLOBAL).put("any unique name", this)
        }
    }

    override fun close() {
//        Environment.stop()
    }

    companion object {
        private var started = false
    }
}