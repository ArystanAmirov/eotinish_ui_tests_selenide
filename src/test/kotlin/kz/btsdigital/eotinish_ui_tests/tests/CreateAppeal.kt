package kz.btsdigital.eotinish_ui_tests.tests

import com.codeborne.selenide.Condition
import com.codeborne.selenide.Configuration
import com.codeborne.selenide.Selenide.open
import com.codeborne.selenide.logevents.SelenideLogger
import io.qameta.allure.selenide.AllureSelenide
import kz.btsdigital.eotinish_ui_tests.BeforeAllExtension
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import kz.btsdigital.eotinish_ui_tests.actions.login
import kz.btsdigital.eotinish_ui_tests.actions.sign
import kz.btsdigital.eotinish_ui_tests.pages.AppealsListPage
import kz.btsdigital.eotinish_ui_tests.pages.NewAppealPage




@ExtendWith(BeforeAllExtension::class)
@BeforeAll
fun setupAllureReports5() {
    SelenideLogger.addListener("AllureSelenide", AllureSelenide().screenshots(true).savePageSource(true))
}


class CreateAppeal {
    @BeforeEach
    internal fun setUpAll() {
        Configuration.startMaximized = true
        Configuration.holdBrowserOpen = true
        open("https://backoffice.dev.eotinish.btsdapps.net/")
    }
    val appealsListPage = AppealsListPage()
    val newAppealPage = NewAppealPage()

    @Test
    fun createAppeal() {
        login("110000000000", "110000000000")
        appealsListPage.createAppeal_btn.click()
        newAppealPage.appealType_spinner.click()
        newAppealPage.appealType.click()
        newAppealPage.admProcedureType.shouldHave(Condition.exactText("Упрощенная административная процедура"))
        newAppealPage.category_spinner.click()
        newAppealPage.category.click()
        newAppealPage.subCategory.click()
        newAppealPage.appealForm_spinner.click()
        newAppealPage.appealForm.click()
        newAppealPage.appealLanguage_spinner.click()
        newAppealPage.appealLanguage.click()
        newAppealPage.appealDescription_et.value = "Тестовое описание"
        newAppealPage.appealCharacter_spinner.click()
        newAppealPage.appealCharacter.click()
        newAppealPage.IIN_et.value = "123123123123"
        newAppealPage.surname_et.value = "Testov"
        newAppealPage.name_et.value = "Test"
        newAppealPage.address_et.value = "Test Address"
        newAppealPage.appealSend_btn.click()
        newAppealPage.NUTS_btn.click()
        sign()
    }
}