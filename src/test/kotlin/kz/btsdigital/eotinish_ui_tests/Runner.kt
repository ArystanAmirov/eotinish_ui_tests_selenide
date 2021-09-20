package kz.btsdigital.eotinish_ui_tests

import org.assertj.core.api.Assertions.assertThat
import org.junit.platform.engine.discovery.DiscoverySelectors.selectPackage
import org.junit.platform.launcher.Launcher
import org.junit.platform.launcher.TestPlan
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder
import org.junit.platform.launcher.core.LauncherFactory
import org.junit.platform.launcher.listeners.SummaryGeneratingListener
import org.junit.platform.launcher.listeners.TestExecutionSummary
import java.io.PrintWriter


fun main() {
//    SelenideLogger.addListener("AllureSelenide", AllureSelenide().screenshots(true).savePageSource(false));
//    SelenideLogger.addListener("AllureSelenide", AllureSelenide().enableLogs(LogType.BROWSER, Level.ALL));

    val request = LauncherDiscoveryRequestBuilder.request()
        .selectors(selectPackage("kz.btsdigital.eotinish_ui_tests.tests"))
//            .filters(includeClassNamePatterns(".*Test"))
        .build()
    val launcher: Launcher = LauncherFactory.create()
    val testPlan: TestPlan = launcher.discover(request)

    val listener = SummaryGeneratingListener()

    launcher.registerTestExecutionListeners(listener)
    launcher.execute(testPlan)

    //???

    val summary: TestExecutionSummary = listener.getSummary()
    summary.printFailuresTo(PrintWriter(System.out))
    summary.printTo(PrintWriter(System.out))

    assertThat(summary.testsFailedCount).isLessThanOrEqualTo(1)
    if (summary.failures.size > 0)
        assertThat(summary.failures[0].exception).isInstanceOf(RuntimeException::class.java)
}