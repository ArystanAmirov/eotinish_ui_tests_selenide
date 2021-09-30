package kz.btsdigital.eotinish_ui_tests.actions

import com.codeborne.selenide.Selenide.sleep
import kz.btsdigital.eotinish_ui_tests.menu_navigation.Tabs
import kz.btsdigital.eotinish_ui_tests.pages.InProgressAppealPage
import kz.btsdigital.eotinish_ui_tests.pages.InProgressAppealsListPage

private val inProgressAppealPage = InProgressAppealPage()
private val inProgressAppealsListPage = InProgressAppealsListPage()
private val tabs = Tabs()

fun sendAppealToApprove(times: Int = 1) {
    for (i in 0 until times) {
        if (!inProgressAppealPage.sendToApprove_btn.exists()) {
            tabs.myAnswers_tab.click()
            sleep(500)
            tabs.myActiveTasks_tab.click()
            sleep(500)
            tabs.inProgressTasks_tab.click()
            inProgressAppealsListPage.search_et.click()
            inProgressAppealsListPage.appealInList.click()
        }
        inProgressAppealPage.sendToApprove_btn.click()
        inProgressAppealPage.selectApprover_spinner.click()
        sleep(300)
        inProgressAppealPage.approver.click()
        inProgressAppealPage.selectSigner_spinner.click()
        sleep(300)
        inProgressAppealPage.signer.click()
        sleep(300)
        inProgressAppealPage.send_btn.click()
        inProgressAppealPage.back_btn.click()
    }
}