package kz.btsdigital.eotinish_ui_tests.actions

import com.codeborne.selenide.Selenide.sleep
import kz.btsdigital.eotinish_ui_tests.menu_navigation.Tabs
import kz.btsdigital.eotinish_ui_tests.pages.InProgressAppealPage
import kz.btsdigital.eotinish_ui_tests.pages.InProgressAppealsListPage
import kz.btsdigital.eotinish_ui_tests.pages.OnAgreeingAppealPage
import kz.btsdigital.eotinish_ui_tests.pages.OnAgreeingAppealsListPage

private val onAgreeingAppealPage = OnAgreeingAppealPage()
private val onAgreeingAppealsListPage = OnAgreeingAppealsListPage()
private val tabs = Tabs()

fun approveAppeal(times: Int = 1) {
    for (i in 0 until times) {
        if (!onAgreeingAppealPage.approve_btn1.exists()) {
            tabs.myAnswers_tab.click()
            sleep(500)
            tabs.myActiveTasks_tab.click()
            sleep(500)
            tabs.tasksOnAgreeing_tab.click()
            onAgreeingAppealsListPage.search_et.click()
            onAgreeingAppealsListPage.appealInList.click()
        }
        onAgreeingAppealPage.approve_btn1.click()
        sleep(300)
        onAgreeingAppealPage.approve_btn2.click()
        onAgreeingAppealPage.back_btn.click()
    }
}