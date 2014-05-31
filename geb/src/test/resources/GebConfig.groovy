import com.gargoylesoftware.htmlunit.BrowserVersion
import org.openqa.selenium.htmlunit.HtmlUnitDriver


driver = {
    def htmlUnitDriver = new HtmlUnitDriver(BrowserVersion.FIREFOX_24)
    htmlUnitDriver.setJavascriptEnabled(true)
    return htmlUnitDriver
}
