import com.gargoylesoftware.htmlunit.BrowserVersion
import org.openqa.selenium.htmlunit.HtmlUnitDriver


driver = {
    def htmlUnitDriver = new HtmlUnitDriver(BrowserVersion.FIREFOX_24)
    htmlUnitDriver.setJavascriptEnabled(true)
    return htmlUnitDriver
}

environments {
    ie9 {
        driver = {
            def htmlUnitDriver = new HtmlUnitDriver(BrowserVersion.INTERNET_EXPLORER_9)
            htmlUnitDriver.setJavascriptEnabled(true)
            return htmlUnitDriver
        }
    }
}
