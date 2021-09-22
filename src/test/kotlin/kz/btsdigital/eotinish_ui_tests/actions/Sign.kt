package kz.btsdigital.eotinish_ui_tests.actions

import com.codeborne.selenide.Condition
import com.codeborne.selenide.Selenide
import kz.btsdigital.eotinish_ui_tests.pages.NewAppealPage
import org.openqa.selenium.By
import org.sikuli.script.Screen
import java.awt.Desktop
import java.io.File
import java.time.Duration

private val newAppealPage = NewAppealPage()
private val goToRegistry_btn = Selenide.element(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/button[2]"))
private val appealRegNumber = Selenide.element(By.xpath("/html/body/ngb-modal-window/div/div/div[1]/div/div[2]"))
private val app = File("/Applications/NCALayer.app")
private val screen = Screen()
var appealNumber = ""

fun sign() {
    newAppealPage.appealSend_btn.click()
    newAppealPage.NUTS_btn.click()
    Desktop.getDesktop().open(app)
    Thread.sleep(500)
    screen.type("RSA_Arystan.p12")
    Thread.sleep(500)
    screen.type("\n")
    Thread.sleep(500)
    screen.type("Aika84")
    screen.type("\n")
    screen.type("\n")
    goToRegistry_btn.shouldBe(Condition.visible, Duration.ofSeconds(25, 0))
    appealNumber = appealRegNumber.ownText
    goToRegistry_btn.click()
}
