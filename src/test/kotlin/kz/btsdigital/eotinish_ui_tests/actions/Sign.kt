package kz.btsdigital.eotinish_ui_tests.actions

import com.codeborne.selenide.Selenide
import org.openqa.selenium.By
import org.sikuli.script.*
import java.awt.event.KeyEvent

val fileOpen_form = Pattern("/Users/arystan/Desktop/eotinish-ui-tests/src/test/kotlin/kz/btsdigital/eotinish_ui_tests/resources/fileOpen_form.png")
val submitPassword_btn = Pattern("/Users/arystan/Desktop/eotinish-ui-tests/src/test/kotlin/kz/btsdigital/eotinish_ui_tests/resources/submitPassword_btn.png")
val sign_btn = Pattern("/Users/arystan/Desktop/eotinish-ui-tests/src/test/kotlin/kz/btsdigital/eotinish_ui_tests/resources/sign_btn.png")
val goToRegistry_btn = Selenide.element(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/button[2]"))
val screen = Screen(0)

fun sign() {
    screen.wait(fileOpen_form).click()
    screen.type("RSA_Arystan.p12")
    screen.keyDown(KeyEvent.VK_ENTER)
    screen.type("Aika84")
    screen.find(submitPassword_btn).click()
    screen.wait(sign_btn).click()
    goToRegistry_btn.click()
}
