package kz.btsdigital.eotinish_ui_tests.actions

import kz.btsdigital.eotinish_ui_tests.pages.AppealsListPage
import kz.btsdigital.eotinish_ui_tests.pages.CreatedAppealPage

private val appealsListPage = AppealsListPage()
private val createdAppealPage = CreatedAppealPage()

fun appointExecutor() {
        appealsListPage.search_et.value = appealNumber
        appealsListPage.search_btn.click()
        appealsListPage.appealInList.click()
        createdAppealPage.sendToWork_btn.click()
        Thread.sleep(500)
        createdAppealPage.selectExecutor_spinner.click()
        Thread.sleep(500)
        createdAppealPage.executor.click()
        createdAppealPage.assign_btn.click()
        createdAppealPage.back_btn.click()
        Thread.sleep(500)
}