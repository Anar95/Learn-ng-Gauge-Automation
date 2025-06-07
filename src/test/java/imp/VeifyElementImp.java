package imp;

import com.thoughtworks.gauge.Step;
import helper.VerifyHelper;

public class VeifyElementImp  extends VerifyHelper {

    @Step("Element <element> icinde <text> yazisi var")
    public void verifyElementContains(String element, String text) {
        this.verifyElementContains(element, text);
    }

    @Step("<element> gorsensin deye maksimum <second> saniye gozle")
    public  void  waitForElement(String element, int seconds) {
        new VerifyHelper().waitUntilElementIsVisible(element,seconds);
    }


}
