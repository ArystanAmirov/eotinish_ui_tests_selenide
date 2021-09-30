package kz.btsdigital.eotinish_ui_tests.actions

import kz.btsdigital.eotinish_ui_tests.pages.RegisteredAppealsListPage
import kz.btsdigital.eotinish_ui_tests.pages.RegisteredAppealPage

private val registeredAppealsListPage = RegisteredAppealsListPage()
private val registeredAppealPage = RegisteredAppealPage()

fun appointExecutor(times: Int = 1) {
    for (i in 0 until times) {
//        registeredAppealsListPage.search_et.value = appealNumber
//        registeredAppealsListPage.search_btn.click()
        registeredAppealsListPage.appealInList.click()
        registeredAppealPage.sendToWork_btn.click()
        Thread.sleep(500)
        registeredAppealPage.selectExecutor_spinner.click()
        Thread.sleep(500)
        registeredAppealPage.executor.click()
        registeredAppealPage.assign_btn.click()
        registeredAppealPage.back_btn.click()
        Thread.sleep(500)
    }
}