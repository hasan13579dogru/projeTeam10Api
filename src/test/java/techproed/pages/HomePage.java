package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='/register']")
    public WebElement register;
    @FindBy(css = "#name")
    public WebElement registerName;
    //(//div[@class='invalid-feedback'])[1]
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement required;
    @FindBy(css = "#surname")
    public WebElement registerSurname;
    @FindBy(id = "birthPlace")
    public WebElement registerBirthPlace;
    @FindBy(id = "phoneNumber")
    public WebElement registerPhone;
    @FindBy(xpath = "//*[@value='FEMALE']")
    public WebElement registerFemale;
    @FindBy(xpath = "//*[@value='MALE']")
    public WebElement registerMale;
    @FindBy(css = "#birthDay")
    public WebElement registerDate;
    @FindBy(css = "#ssn")
    public WebElement registerSsn;
    @FindBy(css = "#username")
    public WebElement registerUserName;
    @FindBy(css = "#password")
    public WebElement registerPassword;
    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement registerButton;
    @FindBy(css = "#username")
    public WebElement userName;

    @FindBy(css = "#password")
    public WebElement password;

    @FindBy(xpath = "(//button)[3]")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast-theme--colored Toastify__toast--error Toastify__toast--close-on-click']")
    public WebElement atleast2char;
    //(//div[@class='invalid-feedback'])[2]
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement register_surnamerequired;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
    public WebElement register_birthdayrequired;

    @FindBy(xpath = "//*[contains(text(),'Minimum 12 character')]")
    public WebElement min12char;

    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-center']")
    public WebElement exact12char;

    //"//*[contains(text(),'geçmiş bir tarih olmalı')]"
    @FindBy(xpath ="//*[contains(text(),'geçmiş bir tarih olmalı')]" )
    public WebElement registerGecmisTarih;

    @FindBy(xpath = "//*[contains(text(),'Guest User registered.')]")
    public WebElement guestUserRegistered;





    //us24






}
