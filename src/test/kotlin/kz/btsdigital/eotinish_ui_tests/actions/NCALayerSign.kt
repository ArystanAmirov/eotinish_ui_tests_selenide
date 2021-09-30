package kz.btsdigital.eotinish_ui_tests.actions

import com.codeborne.selenide.Condition
import com.codeborne.selenide.Selenide.sleep
import com.codeborne.selenide.Selenide.element
import kz.btsdigital.eotinish_ui_tests.pages.InProgressAppealPage
import kz.btsdigital.eotinish_ui_tests.pages.NewAppealPage
import kz.btsdigital.eotinish_ui_tests.tests.Password
import org.openqa.selenium.By
import org.sikuli.script.Screen
import java.awt.Desktop
import java.io.File
import java.time.Duration

private val goToRegistry_btn = element(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/button[2]"))
private val appealRegNumber = element(By.xpath("/html/body/ngb-modal-window/div/div/div[1]/div/div[2]"))

private val app = File("/Applications/NCALayer.app")
private val inProgressAppealPage = InProgressAppealPage()
private val newAppealPage = NewAppealPage()
private val screen = Screen()
var appealNumber = ""

fun NCALayerSign() {
    Desktop.getDesktop().open(app)
    Thread.sleep(800)
    screen.type("RSA.p12")
    Thread.sleep(300)
    screen.type("\n")
    Thread.sleep(300)
    screen.type(Password().password)
    screen.type("\n")
    screen.type("\n")
    sleep(1000)
    if (newAppealPage.appealSend_btn.exists()) {
        goToRegistry_btn.shouldBe(Condition.visible, Duration.ofSeconds(60, 0))
        appealNumber = appealRegNumber.ownText
    }
    if (goToRegistry_btn.exists()) {
        goToRegistry_btn.click()
    }
    if (inProgressAppealPage.back_btn.exists()) {
        inProgressAppealPage.back_btn.click()
    }
}
