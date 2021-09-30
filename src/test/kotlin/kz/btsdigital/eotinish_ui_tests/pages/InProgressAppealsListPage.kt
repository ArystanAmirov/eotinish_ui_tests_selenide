package kz.btsdigital.eotinish_ui_tests.pages

import com.codeborne.selenide.Selenide.`$x`
import com.codeborne.selenide.Selenide.element
import org.openqa.selenium.By

class InProgressAppealsListPage {
    var appealInList = `$x`("/html/body/app-layout/div/div/div/div/div/div/app-executor-list/div[2]/div/div/nat-table/div/table/tbody/tr[1]/td[1]/a")
    val search_et = element(By.xpath("/html/body/app-layout/div/div/div/div/div/div/app-executor-list/div[2]/div/div/div/div[2]/form/input"))
}