package kz.btsdigital.eotinish_ui_tests.tests

import com.codeborne.selenide.*
import com.codeborne.selenide.Selenide.open
import com.codeborne.selenide.logevents.SelenideLogger
import io.qameta.allure.selenide.AllureSelenide
import kz.btsdigital.eotinish_ui_tests.BeforeAllExtension
import kz.btsdigital.eotinish_ui_tests.actions.appointExecutor
import kz.btsdigital.eotinish_ui_tests.actions.fillAppealZapros
import kz.btsdigital.eotinish_ui_tests.actions.login
import kz.btsdigital.eotinish_ui_tests.actions.sign
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith


@ExtendWith(BeforeAllExtension::class)
@BeforeAll
fun setupAllureReports5() {
    SelenideLogger.addListener("AllureSelenide", AllureSelenide().screenshots(true).savePageSource(true))
}

class MainTest {
    @BeforeEach
    internal fun setUpAll() {
        Configuration.startMaximized = true
        Configuration.holdBrowserOpen = true
        open("https://backoffice.dev.eotinish.btsdapps.net/")
    }

    @Test
    fun main() {
        for (i in 0 until 2) {
            login()
            fillAppealZapros()
            sign()
            appointExecutor()
        }
    }
}


















//        val options = ChromeOptions()
//        options.addArguments("--user-data-dir=/Users/arystan/Library/Application Support/Google/Chrome")
//        options.addArguments("--profile-directory=Default")
//        System.setProperty("webdriver.chrome.driver", "/Users/arystan/Downloads/chromedriver")
//        val driver = ChromeDriver(options)
//        driver.navigate().to("https://backoffice.dev.eotinish.btsdapps.net/")
