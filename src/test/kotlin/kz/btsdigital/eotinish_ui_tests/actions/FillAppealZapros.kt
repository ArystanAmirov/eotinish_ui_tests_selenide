package kz.btsdigital.eotinish_ui_tests.actions

import com.codeborne.selenide.Condition
import kz.btsdigital.eotinish_ui_tests.pages.AppealsListPage
import kz.btsdigital.eotinish_ui_tests.pages.NewAppealPage


private val appealsListPage = AppealsListPage()
private val newAppealPage = NewAppealPage()

fun fillAppealZapros() {
    appealsListPage.createAppeal_btn.click()
    newAppealPage.appealType_spinner.click()
    newAppealPage.appealType.click()
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

    newAppealPage.admProcedureType.shouldHave(Condition.exactText("Упрощенная административная процедура"))
}
