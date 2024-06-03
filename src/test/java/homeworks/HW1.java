package homeworks;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import runner.UtilsBase;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HW1 extends UtilsBase {

    @Test
    protected void practiceFormTest() {

        browserRes();
        open("https://demoqa.com/automation-practice-form");

        $(By.id("firstName")).setValue("Oleg");
        $(By.id("lastName")).setValue("Fedorov");
        $(By.id("userEmail")).setValue("xxxx@yhooo.org");
        $(By.xpath("//label[normalize-space()='Male']")).click();
        $(By.id("userNumber")).setValue("555-00-731");
        $(By.id("dateOfBirthInput")).click();
        $(By.xpath("//div[@aria-label='Choose Monday, June 3rd, 2024']")).click();
        /*$(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']"))
                .setValue("co");*/
        $(By.xpath("//label[normalize-space()='Reading']")).click();

        $(By.xpath("//textarea[@placeholder=\"Current Address\"]")).setValue("Victory 2G");

        Selenide.sleep(10000);

    }
}
