package kz.btsdigital.eotinish_ui_tests.pages

import com.codeborne.selenide.Selenide.`$`
import com.codeborne.selenide.Selenide.element
import net.serenitybdd.core.annotations.findby.By

class WelcomePage {
    var forWorkers_btn = `$`(By.xpath("/html/body/app-auth/div/div/div[2]/div/app-login/div/ul/li[1]/div[2]/p"))
    var IIN_et = `$`(By.xpath("/html/body/app-auth/div/div/div[2]/div/app-login/div/form/div[2]/input"))
    var password_et = `$`(By.xpath("/html/body/app-auth/div/div/div[2]/div/app-login/div/form/div[3]/input"))
    val enter_btn = `$`(By.xpath("/html/body/app-auth/div/div/div[2]/div/app-login/div/form/div[4]/button"))







}