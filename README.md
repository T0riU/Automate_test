# Automated Testing — Lab Work

Two Java lab projects: core language exercises and a Selenium UI test suite for rozetka.com.ua.

---

## Project Structure

```
test_lab_1/                         Java fundamentals exercises (no build tool)
  src/
    Main.java                       HashSet deduplication with equals/hashCode
    Sort.java                       Bubble sort implementation
    MyCode.java                     Polymorphism and method overriding demo

test_lab_2/                         Selenium UI tests for rozetka.com.ua (Maven)
  src/main/java/
    elements/MainPageElements.java  Login modal element locators
    pages/
      RozetkaFactory.java           PageFactory initializer
      MainPage.java                 Page actions and assertions
    utils/
      DriverConfig.java             Owner config interface
      DriverManager.java            ChromeDriver singleton
  src/main/resources/
    DriverConfig.properties         URL and credentials
    chromedriver.exe                Bundled ChromeDriver binary
  src/test/java/
    MainPageTest.java               Login modal test cases
  pom.xml                           Maven dependencies
```

---

## Lab 1 — Java Fundamentals

Three standalone programs, each with its own main():

Main.java — adds four identical User objects to a HashSet and verifies only one entry is stored. Demonstrates correct equals() and hashCode() implementation: both are overridden to compare name and age fields, so duplicate users are deduplicated. Prints "Passed!" if the set size is 1.

Sort.java — sorts an int array {23, 12, 13, 17, 23, 19} using bubble sort and prints the result in ascending order.

MyCode.java — declares a class B that extends A and overrides print(). Instantiates B via an A reference (A ab = new B()) to demonstrate runtime polymorphism: the overridden print() from B is called despite the compile-time type being A.

### Running Lab 1

```bash
javac test_lab_1/src/Main.java && java -cp test_lab_1/src Main
javac test_lab_1/src/Sort.java && java -cp test_lab_1/src Sort
javac test_lab_1/src/MyCode.java && java -cp test_lab_1/src MyCode
```

---

## Lab 2 — Selenium UI Tests (rozetka.com.ua)

Tests the login modal on rozetka.com.ua using the Page Object Model pattern.

### Configuration

Set credentials in src/main/resources/DriverConfig.properties:

| Key | Description | Default |
|-----|-------------|---------|
| url | Target site | https://rozetka.com.ua |
| email | Login email | test@test |
| password | Login password | (empty) |

### Test Cases

testSteps — opens the login modal, verifies the email field is visible with the correct label text ("Ел. пошта або телефон"), enters credentials, submits, then checks the modal header shows "Вхід", the registration button shows "Зареєструватися", and the Facebook/Google social login buttons are present with correct labels.

testLoginError — submits invalid credentials and verifies that both the email error message ("Введено невірну адресу ел. пошти або номер телефону") and the password error indicator are displayed.

All assertions use AssertJ SoftAssertions so all checks in a step are evaluated before failing.

### Page Object Structure

RozetkaFactory initializes WebElements via PageFactory. MainPageElements extends it and declares all @FindBy locators. MainPage extends MainPageElements and exposes fluent action/assertion methods that return the page instance for chaining.

### Running Lab 2

```bash
cd test_lab_2
mvn test

# Single test class:
mvn test -Dtest=MainPageTest
```

### Dependencies

| Library | Version | Purpose |
|---------|---------|---------|
| TestNG | 7.8.0 | Test runner |
| Selenium Java | 4.13.0 | Browser automation |
| WebDriverManager | 5.5.3 | Driver management |
| Owner | 1.0.12 | Properties config binding |
| AssertJ | 3.24.2 | Fluent soft assertions |

### Requirements

- Windows (bundled chromedriver.exe)
- Java 19
- Maven
- Google Chrome matching the bundled ChromeDriver version
