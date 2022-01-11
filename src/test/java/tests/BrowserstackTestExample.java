package tests;

import com.codeborne.selenide.Condition;
import config.TestBase;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.*;

@Tag("selenide_android")
public class BrowserstackTestExample extends TestBase {

    @Test
    void exampleTest() {
        $(MobileBy.AccessibilityId("Search Wikipedia")).click();
        $(MobileBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("BrowserStack");
        $$(MobileBy.id("org.wikipedia.alpha:id/page_list_item_container")).shouldHave(sizeGreaterThan(0));
    }

    @Test
    void secondTest() {
        $(MobileBy.id("org.wikipedia.alpha:id/menu_overflow_button")).click();
        $(MobileBy.id("org.wikipedia.alpha:id/explore_overflow_settings")).click();
        $(MobileBy.id("android:id/summary")).shouldHave(Condition.text("English"));
    }
}
