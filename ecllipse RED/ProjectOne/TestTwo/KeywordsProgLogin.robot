***Settings***
Library   SeleniumLibrary

*** Test Cases ***
KeywordUrlLoginTest
     
    LoginKW
    Close Browser
    
*** Keywords ***
LoginKW
    Open Browser      ${url}         ff
    Input Text        id=username    admin
    Input Password    name=pwd       admin123   
    
    Click Element    id=loginButton    
*** Variables ***
    
${url}    https://www.freecrm.com/
