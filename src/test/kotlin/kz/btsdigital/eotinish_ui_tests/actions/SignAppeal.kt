package kz.btsdigital.eotinish_ui_tests.actions

import com.codeborne.selenide.Selenide.sleep
import kz.btsdigital.eotinish_ui_tests.menu_navigation.Tabs
import kz.btsdigital.eotinish_ui_tests.pages.OnSigningAppealPage
import kz.btsdigital.eotinish_ui_tests.pages.OnSigningAppealsListPage


private val onSigningAppealPage = OnSigningAppealPage()
private val onSigningAppealsListPage = OnSigningAppealsListPage()

private val tabs = Tabs()

fun signAppeal(times: Int = 1) {
    for (i in 0 until times){
        if (!onSigningAppealPage.sign_btn1.exists()) {
            tabs.myAnswers_tab.click()
            sleep(500)
            tabs.myActiveTasks_tab.click()
            sleep(500)
            tabs.taskOnSigning_tab.click()
            onSigningAppealsListPage.search_et.click()
            onSigningAppealsListPage.appealInList.click()
        }
        onSigningAppealPage.sign_btn1.click()
        sleep(500)
        onSigningAppealPage.sign_btn2.click()
        onSigningAppealPage.NUTS_btn.click()
        sleep(300)
        NCALayerSign()
        sleep(300)
    }
}