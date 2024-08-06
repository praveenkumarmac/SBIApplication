Feature: StateBankOfIndia

Background: Application Launch
Given Launch the browser and appilication "https://www.onlinesbi.sbi"

Scenario Outline: User loign in SBI application
When User initially clicks on login button
And User clicks on continue to login button
And User enters the value in username "<userName>"
And User enters the value in password "<password>"
And User enters the text in captcha "<captchaText>"
And User finally clicks on login button

Examples:
|userName  |password     |captchaText |
|praveen   |praveen@213  |acbdgd      |