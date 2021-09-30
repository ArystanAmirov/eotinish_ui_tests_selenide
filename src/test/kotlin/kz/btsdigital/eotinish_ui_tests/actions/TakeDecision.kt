package kz.btsdigital.eotinish_ui_tests.actions

import com.codeborne.selenide.Selenide.`$x`
import com.codeborne.selenide.Selenide.sleep
import kz.btsdigital.eotinish_ui_tests.menu_navigation.Tabs
import kz.btsdigital.eotinish_ui_tests.pages.InProgressAppealPage
import kz.btsdigital.eotinish_ui_tests.pages.InProgressAppealsListPage


private val inProgressAppealsListPage = InProgressAppealsListPage()
private val inProgressAppealPage = InProgressAppealPage()
private val tabs = Tabs()

fun takeDecision(times: Int = 1) {
    for (i in 0 until times) {
        if (!inProgressAppealPage.takeDecision_btn.exists()) {
            tabs.myAnswers_tab.click()
            sleep(500)
            tabs.myActiveTasks_tab.click()
            sleep(500)
            tabs.inProgressTasks_tab.click()
            inProgressAppealsListPage.search_et.click()
            var path = "/html/body/app-layout/div/div/div/div/div/div/app-executor-list/div[2]/div/div/nat-table/div/table/tbody/tr[${i+1}]/td[1]/a"
            var appealInList = `$x`(path)
            appealInList.click()
        }
        if (inProgressAppealPage.takeDecision_btn.ownText == "Принять решение") {
            inProgressAppealPage.takeDecision_btn.click()
            inProgressAppealPage.selectCategory_spinner.click()
            sleep(300)
            inProgressAppealPage.category.click()
            sleep(300)
            inProgressAppealPage.subCategory.click()
            sleep(300)
            inProgressAppealPage.selectSubSubCategory_spinner.click()
            sleep(300)
            inProgressAppealPage.subSubCategory.click()
            inProgressAppealPage.hearing_spinner.click()
            sleep(300)
            inProgressAppealPage.hearingNo.click()
            inProgressAppealPage.hearingReasons.value = "Test reason"
            inProgressAppealPage.selectDecision_spinner.click()
            sleep(300)
            inProgressAppealPage.decision.click()
            if (inProgressAppealPage.decisionReason_spinner.exists()){
                inProgressAppealPage.decisionReason_spinner.click()
                inProgressAppealPage.decisionReason.click()
            }
            if (inProgressAppealPage.decisionText_et.exists()) {
                inProgressAppealPage.decisionText_et.value = "Test text"
            }
            if (inProgressAppealPage.answerText.exists()) {
                inProgressAppealPage.answerText.value = "Answer text"
            }
            inProgressAppealPage.saveDecision_btn.click()
            sleep(300)
            inProgressAppealPage.back_btn.click()
            sleep(300)
        }else{
            inProgressAppealPage.back_btn.click()
        }
    }
}