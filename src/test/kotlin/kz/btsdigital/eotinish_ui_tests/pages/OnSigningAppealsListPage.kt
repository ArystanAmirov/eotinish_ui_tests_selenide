package kz.btsdigital.eotinish_ui_tests.pages

import com.codeborne.selenide.Selenide
import com.codeborne.selenide.Selenide.`$x`

class OnSigningAppealsListPage {
    var appealInList = `$x`("/html/body/app-layout/div/div/div/div/div/div/app-executor-list/div[2]/div/div/nat-table/div/table/tbody/tr/td[1]/a")
    var search_et = `$x`("/html/body/app-layout/div/div/div/div/div/div/app-executor-list/div[2]/div/div/div/div[2]/form/input")
}