package techproed.utilities;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import techproed.pages.AddUserPage;

import java.util.Random;

import static techproed.utilities.ReusableMethods.bekle;

public class Methods {

    AddUserPage addUserPage = new AddUserPage();

    public void ViceDeanLogin(String userName, String password) {
        addUserPage.login.click();
        addUserPage.username.clear();
        addUserPage.username.sendKeys(userName);
        addUserPage.passsword.clear();
        bekle(3);
        addUserPage.passsword.sendKeys(password);
        addUserPage.loginButton.click();
        bekle(3);
        addUserPage.menuButton.click();
        bekle(3);
        addUserPage.teacherMannagement.click();
        bekle(3);
        addUserPage.name.click();
        bekle(3);
      // addUserPage.chooseLessonsEdit.sendKeys(Keys.SHIFT,Keys.TAB,Keys.ARROW_DOWN, Keys.ENTER);
    }


    public Methods  teacheradd(String nameValue, String surnameValue, String birthPlaceValue,
                                             String eMailValue,
                                             String phoneNumberValue, String genderValue, String birthDayValue,
                                             String ssnValue, String userNameValue, String passwordValue) {
        if (nameValue != null) {
            addUserPage.name.sendKeys(nameValue);
        }
        if (surnameValue != null) {
            addUserPage.surname.sendKeys(surnameValue);
        }
        if (birthPlaceValue != null) {
            addUserPage.birthPlace.sendKeys(birthPlaceValue);
        }
        if (eMailValue != null) {
            addUserPage.email.sendKeys(eMailValue);
        }
        if (phoneNumberValue != null) {
            addUserPage.phone.sendKeys(phoneNumberValue);

        }
        if (genderValue != null) {
            if (genderValue.equalsIgnoreCase("FEMALE")) {

                ReusableMethods.click
                        (addUserPage.female);
            } else if (genderValue.equalsIgnoreCase("MALE")) {

                ReusableMethods.click
                        (addUserPage.male);
            }
        }
        if (birthDayValue != null) {
            addUserPage.birthday.sendKeys(birthDayValue);
        }
        if (ssnValue != null) {
            addUserPage.ssn.sendKeys(ssnValue);

        }
        if (userNameValue != ".") {
            addUserPage.userName.sendKeys(userNameValue);

        }
        if (passwordValue != null) {
            addUserPage.password.sendKeys(passwordValue);
        }
        return this;
    }


    //Auto Teacher Editer

    public static void autoTeacherEdit(){
        AddUserPage addUserPage = new AddUserPage(); //Locator'larimizin oldugu page class'i
        Random random = new Random();
        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();
        if (addUserPage.chooseLessonEdit.getText().isEmpty()){
            addUserPage.chooseLessonEdit.click();
            String[] dersler = {"English", "Cypress", "Java", "JavaScript", "Selenium", "Fluid", "Lambda", "CSS", "HTML"};
            int rastgeleIndeks = random.nextInt(dersler.length);
            String secilenDers = dersler[rastgeleIndeks];
            actions.sendKeys(secilenDers).perform();
            bekle(2);
            actions.sendKeys(Keys.TAB).perform();
            bekle(2);
        }
        if (addUserPage.editTeacherName.getText().isEmpty()){
            String newName = faker.name().name();
            addUserPage.editTeacherName.sendKeys(Keys.CONTROL + "a");
            addUserPage.editTeacherName.sendKeys(Keys.DELETE);
            if (newName.length() > 8) {
                newName = newName.substring(0, 8);
            }
            addUserPage.editTeacherName.sendKeys(newName);
        }
        if (addUserPage.editTeacherSurname.getText().isEmpty()){
            addUserPage.editTeacherSurname.sendKeys(Keys.CONTROL + "a");
            addUserPage.editTeacherSurname.sendKeys(Keys.DELETE);
            addUserPage.editTeacherSurname.sendKeys(faker.name().lastName());
        }
        if (addUserPage.editTeacherBirthplace.getText().isEmpty()){
            String birthCity = faker.address().city();
            if (birthCity.length() > 8) {
                birthCity = birthCity.substring(0, 8);
            }
            addUserPage.editTeacherBirthplace.sendKeys(birthCity);
        }
        if (addUserPage.editTeacherEmail.getText().isEmpty()){
            addUserPage.editTeacherEmail.sendKeys(Keys.CONTROL + "a");
            addUserPage.editTeacherEmail.sendKeys(Keys.DELETE);
            addUserPage.editTeacherEmail.sendKeys(faker.internet().emailAddress());
        }
        if (addUserPage.editTeacherPhoneNumber.getText().isEmpty()){
            int first = 100 + random.nextInt(900);
            int second = 100 + random.nextInt(900);
            int third = 1000 + random.nextInt(9000);
            String randomPhoneNumber = String.format("%03d-%03d-%04d", first, second, third);
            addUserPage.editTeacherPhoneNumber.sendKeys(randomPhoneNumber);
        }
        if (!addUserPage.editTeacherMale.isSelected() && !addUserPage.female.isSelected()){
            int randomclickNumber = random.nextInt(2);
            if (randomclickNumber == 0){
                addUserPage.editTeacherMale.click();
            }else {
                addUserPage.editTeacherFemale.click();
            }
        }
        if (addUserPage.editTeacherMale.isSelected()){
            addUserPage.editTeacherFemale.click();
        }
        if (addUserPage.editTeacherFemale.isSelected()){
            addUserPage.editTeacherMale.click();
        }
        if (addUserPage.editTeacherBirthDay.getText().isEmpty()){
            int year = faker.number().numberBetween(1950, 2000);
            int month = faker.number().numberBetween(1, 13);
            int day = faker.number().numberBetween(1, 30);
            String formattedBirthdate = String.format("%02d%02d%04d", day, month, year);
            addUserPage.editTeacherBirthDay.sendKeys(formattedBirthdate);
        }
        if (addUserPage.editTeacherSsn.getText().isEmpty()){
            int first = random.nextInt(1000);
            int second = random.nextInt(100);
            int third = random.nextInt(10000);
            String randomSsnNumber = String.format("%03d-%02d-%04d", first, second, third);
            addUserPage.editTeacherSsn.sendKeys(randomSsnNumber);
        }
        if (addUserPage.editTeacherUsername.getText().isEmpty()){
            String randomUsername = faker.name().username();
            if (randomUsername.length() > 8) {
                randomUsername = randomUsername.substring(0, 8);
            }
            addUserPage.editTeacherUsername.sendKeys(Keys.CONTROL + "a");
            addUserPage.editTeacherUsername.sendKeys(Keys.DELETE);
            addUserPage.editTeacherUsername.sendKeys(randomUsername);
        }
        if (addUserPage.editTeacherPassword.getText().isEmpty()){
            String fakerPassword = faker.regexify("[A-Z][a-z]{5}[A-Z][0-9]{2}");
            addUserPage.editTeacherPassword.sendKeys(Keys.CONTROL + "a");
            addUserPage.editTeacherPassword.sendKeys(Keys.DELETE);
            addUserPage.editTeacherPassword.sendKeys(fakerPassword);
        }
        addUserPage.editTeacherSubmitButton.click();
    }

}
