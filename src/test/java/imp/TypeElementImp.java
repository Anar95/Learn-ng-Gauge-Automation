package imp;

import com.thoughtworks.gauge.Step;
import helper.TypeHelper;
import javax.lang.model.element.TypeElement;


public class TypeElementImp extends TypeHelper {

    @Step("<element> elementine <text> yaz ve Enter duymesine bas")
    public void typeAndEnter(String element, String text) {
        this.typeAndPressKey(element,text, "ENTER");
    }

    @Step("<element> elementine <text> yaz ve Tab duymesine bas")
    public void typeAndTab(String element, String text) {
        this.typeAndPressKey(element,text, "TAB");
    }


}
