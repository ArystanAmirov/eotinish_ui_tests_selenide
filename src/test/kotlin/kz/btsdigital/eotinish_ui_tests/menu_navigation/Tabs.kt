package kz.btsdigital.eotinish_ui_tests.menu_navigation

import com.codeborne.selenide.Selenide.element
import org.openqa.selenium.By

class Tabs {
    val myActiveTasks_tab = element(By.xpath("/html/body/app-layout/div/div/app-aside-dynamic/div[2]/div/ul/li[7]"))
    val inProgressTasks_tab = element(By.xpath("/html/body/app-layout/div/div/app-aside-dynamic/div[2]/div/ul/li[7]/div/ul/li[2]/a/span"))
    val tasksOnAgreeing_tab = element(By.xpath("/html/body/app-layout/div/div/app-aside-dynamic/div[2]/div/ul/li[7]/div/ul/li[3]/a/span"))
    val taskOnSigning_tab = element(By.xpath("/html/body/app-layout/div/div/app-aside-dynamic/div[2]/div/ul/li[7]/div/ul/li[4]/a/span"))

    val myAnswers_tab = element(By.xpath("/html/body/app-layout/div/div/app-aside-dynamic/div[2]/div/ul/li[8]/a"))
}

