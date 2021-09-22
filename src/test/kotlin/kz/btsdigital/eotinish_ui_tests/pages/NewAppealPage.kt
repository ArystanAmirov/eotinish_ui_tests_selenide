package kz.btsdigital.eotinish_ui_tests.pages

import com.codeborne.selenide.Selenide.`$`
import com.codeborne.selenide.Selenide.element


class NewAppealPage {
    val appealType_spinner =`$`("#kt_content > div > div > app-appeal-new > div.card.card-custom.gutter-b > div > form > div:nth-child(1) > div > div > app-select > div > div.pseudo-select")
    val appealType = `$`("#kt_content > div > div > app-appeal-new > div.card.card-custom.gutter-b > div > form > div:nth-child(1) > div > div > app-select > div > div.dropdown-menu.menu.w-100.show > div > div:nth-child(4)")
    val admProcedureType = `$`("#kt_content > div > div > app-appeal-new > div.card.card-custom.gutter-b > div > form > div:nth-child(1) > div:nth-child(2) > div > div > div")
    val category_spinner = `$`("#kt_content > div > div > app-appeal-new > div.card.card-custom.gutter-b > div > form > div:nth-child(3) > div:nth-child(1) > div > app-dropdown > div > ng-select > div")
    val category = element(org.openqa.selenium.By.xpath("/html/body/app-layout/div/div/div/div/div/div/app-appeal-new/div[2]/div/form/div[3]/div[1]/div/app-dropdown/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]/div[1]"))
    val subCategory = element(org.openqa.selenium.By.xpath("/html/body/app-layout/div/div/div/div/div/div/app-appeal-new/div[2]/div/form/div[3]/div[1]/div/app-dropdown/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]/div[3]/div[1]"))
    val appealForm_spinner = `$`("#kt_content > div > div > app-appeal-new > div.card.card-custom.gutter-b > div > form > div:nth-child(4) > div:nth-child(1) > div > ng-select > div > div > div.ng-input")
    val appealForm = element(org.openqa.selenium.By.xpath("/html/body/app-layout/div/div/div/div/div/div/app-appeal-new/div[2]/div/form/div[4]/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]"))
    val appealLanguage_spinner =`$`("#kt_content > div > div > app-appeal-new > div.card.card-custom.gutter-b > div > form > div:nth-child(4) > div:nth-child(2) > div > app-select > div > div.pseudo-select")
    val appealLanguage =`$`("#kt_content > div > div > app-appeal-new > div.card.card-custom.gutter-b > div > form > div:nth-child(4) > div:nth-child(2) > div > app-select > div > div.dropdown-menu.menu.w-100 > div > div:nth-child(1)")
    val appealDescription_et = `$`("#kt_content > div > div > app-appeal-new > div.card.card-custom.gutter-b > div > form > div:nth-child(6) > div > div > textarea")
    val appealCharacter_spinner = `$`("#kt_content > div > div > app-appeal-new > div.card.card-custom.gutter-b > div > form > app-applicant-form > div:nth-child(2) > div:nth-child(1) > div > ng-select > div > div > div.ng-input")
    val appealCharacter = element(org.openqa.selenium.By.xpath("/html/body/app-layout/div/div/div/div/div/div/app-appeal-new/div[2]/div/form/app-applicant-form/div[2]/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]"))
    var IIN_et = `$`("#kt_content > div > div > app-appeal-new > div.card.card-custom.gutter-b > div > form > app-applicant-form > div:nth-child(4) > div:nth-child(1) > div > div > input")
    var surname_et = `$`("#personSecondName")
    val name_et = `$`("#personFirstName")
    val address_et = `$`("#personFactAddress")
    val appealSend_btn = `$`("#kt_content > div > div > app-appeal-new > div.card.card-custom.gutter-b > div > form > div.d-flex.justify-content-between.border-top.pt-10 > div > button.btn.btn-primary.mr-4")
    val NUTS_btn = `$`("#kt_body > ngb-modal-window > div > div > div > div.modal-footer > button.btn.btn-primary.btn-lg.col-sm-4.mr-5")
}