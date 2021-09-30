package kz.btsdigital.eotinish_ui_tests.pages

import com.codeborne.selenide.Selenide.element

class RegisteredAppealsListPage {
    val search_et = element(org.openqa.selenium.By.xpath("/html/body/app-layout/div/div/div/div/div/div/app-executor-list/div[2]/div/div/div/div[2]/div/form/input"))
    val search_btn = element(org.openqa.selenium.By.xpath("/html/body/app-layout/div/div/div/div/div/div/app-executor-list/div[2]/div/div/div/div[2]/div/form/span"))
    val appealInList = element(org.openqa.selenium.By.xpath("/html/body/app-layout/div/div/div/div/div/div/app-executor-list/div[2]/div/div/nat-table/div/table/tbody/tr/td[1]/a"))
}
