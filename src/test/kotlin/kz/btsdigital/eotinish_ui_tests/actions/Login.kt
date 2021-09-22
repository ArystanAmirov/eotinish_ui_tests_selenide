package kz.btsdigital.eotinish_ui_tests.actions

import kz.btsdigital.eotinish_ui_tests.pages.WelcomePage

private val welcomePage = WelcomePage()

fun login(userIIN: String = "110000000000", userPassword: String = "110000000000") {
    if (welcomePage.forWorkers_btn.exists()) {
        welcomePage.forWorkers_btn.click()
        welcomePage.IIN_et.value = userIIN
        welcomePage.password_et.value = userPassword
        welcomePage.enter_btn.click()
    }
}
