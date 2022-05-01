package GetNumberOfQs;

import Base.BaseTests;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LessonPage;
import pages.LessonsList;
import pages.WorksheetPage;

public class GetNumberOfQsTest extends BaseTests {

    @Parameters({"language","lesson","lessonNumber"})
    @Test
    public void numberOfQuestions(String language,String lesson, String lessonNumber){
        HomePage homePage = langPage.selectLanguage(language);
        LessonsList lessonsList = homePage.searchForLesson(lesson);
        LessonPage lessonPage = lessonsList.openLesson(Integer.parseInt(lessonNumber));
        WorksheetPage worksheetPage = lessonPage.openWorksheet();

        System.out.println(worksheetPage.countQuestions());
    }
}
