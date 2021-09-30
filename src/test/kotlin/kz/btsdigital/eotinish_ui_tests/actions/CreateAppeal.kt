package kz.btsdigital.eotinish_ui_tests.actions

import com.codeborne.selenide.Condition
import kz.btsdigital.eotinish_ui_tests.pages.CommonPage
import kz.btsdigital.eotinish_ui_tests.pages.NewAppealPage


private val newAppealPage = NewAppealPage()
private val commonPage = CommonPage()


fun createAppeal(appealType: String = "Запрос") {
    commonPage.createAppeal_btn.click()
    newAppealPage.appealType_spinner.click()
    when(appealType) {
        "Запрос" -> newAppealPage.zapros.click()
        "Запросы адвокатов" -> newAppealPage.zaprosyAdvokatov.click()
        "Запросы о предоставлении информации" -> newAppealPage.zaprosyOPredostavleniiInformatsii.click()
        "Запросы средств массовой информации" -> newAppealPage.zaprosySMI.click()
        "Запросы судебных исполнителей" -> newAppealPage.zaprosySudebnyhIspolnitelei.click()
        "Заявление" -> newAppealPage.zayavlenie.click()
        "Отклик" -> newAppealPage.otklik.click()
        "Предложение" -> newAppealPage.predlozhenie.click()
        "Сообщение" -> newAppealPage.soobschenie.click()
    }
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
    NCALayerSign()


    //newAppealPage.admProcedureType.shouldHave(Condition.exactText("Упрощенная административная процедура"))


}
