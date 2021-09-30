package kz.btsdigital.eotinish_ui_tests.pages

import com.codeborne.selenide.Selenide.element
import org.openqa.selenium.By

class InProgressAppealPage {
    val takeDecision_btn = element(By.xpath("/html/body/app-layout/div/div/div/div/div/div/app-executor-appeal-view/div[2]/div[1]/div/div/div[7]/app-get-answer/button"))
    val selectCategory_spinner = element(By.xpath("/html/body/ngb-modal-window/div/div/div/div[1]/div[1]/div[1]/app-dropdown/div"))
    val category = element(By.xpath("/html/body/ngb-modal-window/div/div/div/div[1]/div[1]/div[1]/app-dropdown/div/ng-select/ng-dropdown-panel/div/div[2]/div[3]"))
    val subCategory = element(By.xpath("/html/body/ngb-modal-window/div/div/div/div[1]/div[1]/div[1]/app-dropdown/div/ng-select/ng-dropdown-panel/div/div[2]/div[3]/div[3]/div[1]"))
    val selectSubSubCategory_spinner = element(By.xpath("/html/body/ngb-modal-window/div/div/div/div[1]/div[1]/div[2]/ng-select"))
    val subSubCategory = element(By.xpath("/html/body/ngb-modal-window/div/div/div/div[1]/div[1]/div[2]/ng-select/ng-dropdown-panel/div/div[2]/div[1]"))
    val hearing_spinner = element(By.xpath("/html/body/ngb-modal-window/div/div/div/div[1]/div[2]/ng-select"))
    val hearingNo = element(By.xpath("/html/body/ngb-modal-window/div/div/div/div[1]/div[2]/ng-select/ng-dropdown-panel/div/div[2]/div[2]"))
    val hearingReasons = element(By.xpath("/html/body/ngb-modal-window/div/div/div/div[1]/div[3]/textarea"))
    val selectDecision_spinner = element(By.xpath("/html/body/ngb-modal-window/div/div/div/div[1]/div[4]/div/div/ng-select"))
    val decision = element(By.xpath("/html/body/ngb-modal-window/div/div/div/div[1]/div[4]/div/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]"))
    val decisionText_et = element(By.xpath("/html/body/ngb-modal-window/div/div/div/div[1]/div[7]/div/div/textarea"))
    val decisionReason_spinner = element(By.xpath("/html/body/ngb-modal-window/div/div/div/div[1]/div[5]/div/div/ng-select"))
    val decisionReason = element(By.xpath("/html/body/ngb-modal-window/div/div/div/div[1]/div[5]/div/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]"))
    val answerText = element(By.xpath("/html/body/ngb-modal-window/div/div/div/div[1]/div[8]/div/div/textarea"))
    val saveDecision_btn = element(By.xpath("/html/body/ngb-modal-window/div/div/div/div[2]/button[1]"))
    val sendToApprove_btn  = element(By.xpath("/html/body/app-layout/div/div/div/div/div/div/app-executor-appeal-view/div[2]/div[1]/div/div/div[7]/app-send-approve/button"))
    val selectApprover_spinner = element(By.xpath("/html/body/ngb-modal-window/div/div/div[1]/form/div[1]/div/div/ng-select"))
    val approver = element(By.xpath("/html/body/ngb-modal-window/div/div/div[1]/form/div[1]/div/div/ng-select/ng-dropdown-panel/div/div[2]/div[2]"))
    val selectSigner_spinner = element(By.xpath("/html/body/ngb-modal-window/div/div/div[1]/form/div[2]/div/div/ng-select"))
    val signer = element(By.xpath("/html/body/ngb-modal-window/div/div/div[1]/form/div[2]/div/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]"))
    val send_btn = element(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/button[1]"))
    val back_btn = element(By.xpath("/html/body/app-layout/div/div/div/div/div/div/app-executor-appeal-view/div[1]/div/div[1]/a/i"))
}