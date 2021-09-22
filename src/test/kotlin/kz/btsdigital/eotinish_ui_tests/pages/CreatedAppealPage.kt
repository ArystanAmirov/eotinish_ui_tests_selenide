package kz.btsdigital.eotinish_ui_tests.pages

import com.codeborne.selenide.Selenide.element

class CreatedAppealPage {
    val sendToWork_btn = element(org.openqa.selenium.By.xpath("/html/body/app-layout/div/div/div/div/div/div/app-appeal-registrar-view/div[2]/div[1]/div/div/div[7]/app-set-executor-registrar/button"))
    val selectExecutor_spinner = element(org.openqa.selenium.By.xpath("/html/body/ngb-modal-window/div/div/div[1]/div/div[2]/div/div/ng-select"))
    val executor = element(org.openqa.selenium.By.xpath("/html/body/ngb-modal-window/div/div/div[1]/div/div[2]/div/div/ng-select/ng-dropdown-panel/div/div[2]/div[5]"))
    val assign_btn = element(org.openqa.selenium.By.xpath("/html/body/ngb-modal-window/div/div/div[2]/button[1]"))
    val back_btn = element(org.openqa.selenium.By.xpath("/html/body/app-layout/div/div/div/div/div/div/app-appeal-registrar-view/div[1]/div/div/a/i"))
}