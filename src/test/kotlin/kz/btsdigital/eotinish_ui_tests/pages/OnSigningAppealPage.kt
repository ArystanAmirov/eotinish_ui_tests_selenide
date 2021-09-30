package kz.btsdigital.eotinish_ui_tests.pages

import com.codeborne.selenide.Selenide.element
import org.openqa.selenium.By

class OnSigningAppealPage {
    val sign_btn1 = element(By.xpath("/html/body/app-layout/div/div/div/div/div/div/app-executor-appeal-view/div[2]/div[1]/div/div/div[6]/app-sign/button"))
    val sign_btn2 = element(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/button[1]"))
    val NUTS_btn = element(By.xpath("/html/body/ngb-modal-window[2]/div/div/div/div[2]/button[1]"))
}