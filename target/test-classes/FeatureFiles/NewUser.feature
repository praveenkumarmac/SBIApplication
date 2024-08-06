Feature: NewUser

Background: Application Launch
Given Launch the browser and appilication1 "https://www.onlinesbi.sbi"

Scenario Outline: User register in SBI application
When User clicks on new user button
And User clicks on ok button
And User clicks on newUserRegisterOrActivate button "<newUserRegisterOrActivate>"
And User clicks on next button
And User enters the value in accountNo "<accountNo>"
And User enters the value in cifNo "<cifNo>"
And User enters the text in branchCode "<branchCode>"
And User select country in selCountry "<Country>"
And User enters the value in mobliNo "<mobliNo>"
And User select facility in facilityRequired "<facilityRequired>"
And User enters the text in newUserCaptcha "<newUserCaptchaText>"
And User clicks on IAgree button
And User clicks on submit button

Examples:
|newUserRegisterOrActivate |accountNo        |cifNo  |branchCode |Country |mobliNo   |facilityRequired        |newUserCaptchaText |
|registerHere              |12345678912      |123456 |1234556    | 91  |9840299620   |09                      |acbdgd             |