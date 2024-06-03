package lessons;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import runner.UtilsBase;

import static com.codeborne.selenide.Selenide.*;

public class Practice1 extends UtilsBase {

    @Test
    protected void textBoxTest(){

        browserRes();
        open("https://demoqa.com/text-box");
        $("#userName").setValue("Oleg Fedorov");
        $(By.xpath("//input[@placeholder='name@example.com']")).setValue("ozymberg@yhooo.org");
        $(By.id("currentAddress")).setValue("Oxen street 3");
        $(By.id("permanentAddress")).setValue("Victory 2G");
        $(By.id("submit")).click();



    }

}
