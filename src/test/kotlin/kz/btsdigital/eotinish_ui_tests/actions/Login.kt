package kz.btsdigital.eotinish_ui_tests.actions

import kz.btsdigital.eotinish_ui_tests.pages.WelcomePage

private val welcomePage = WelcomePage()

fun login(userIIN: String,  userPassword: String) {
    welcomePage.forWorkers_btn.click()
    welcomePage.IIN_et.value = userIIN
    welcomePage.password_et.value = userPassword
    welcomePage.enter_btn.click()
}
