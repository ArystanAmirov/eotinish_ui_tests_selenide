package kz.btsdigital.eotinish_ui_tests.tests

import com.codeborne.selenide.*
import com.codeborne.selenide.Selenide.open
import com.codeborne.selenide.logevents.SelenideLogger
import io.qameta.allure.selenide.AllureSelenide
import kz.btsdigital.eotinish_ui_tests.BeforeAllExtension
import kz.btsdigital.eotinish_ui_tests.actions.*
import kz.btsdigital.eotinish_ui_tests.lists.listOfAppealTypes
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith


@ExtendWith(BeforeAllExtension::class)
@BeforeAll
fun setupAllureReports() {
    SelenideLogger.addListener("AllureSelenide", AllureSelenide().screenshots(true).savePageSource(true))
}

class MainTest {
    @BeforeEach
    internal fun setUpAll() {
        Configuration.startMaximized = true
        Configuration.holdBrowserOpen = true
        open("https://backoffice.dev.eotinish.btsdapps.net/")
        login()
    }

    @Test
    fun mainTest() {
        createAppealTest()
        appointExecutorTest()
        takeDecisionTest()
        sendAppealToApproveTest()
        approveAppealTest()
        signAppealTest()
    }

    @Test
    fun createAppealTest() {
        for (appealType in listOfAppealTypes) {
            createAppeal(appealType)
        }
    }

    @Test
    fun appointExecutorTest() {
        appointExecutor(9)
    }

    @Test
    fun takeDecisionTest() {
        takeDecision(9)
    }

    @Test
    fun sendAppealToApproveTest() {
        sendAppealToApprove(9)
    }

    @Test
    fun approveAppealTest() {
        approveAppeal(9)
    }

    @Test
    fun signAppealTest() {
        signAppeal(2)
    }
}

