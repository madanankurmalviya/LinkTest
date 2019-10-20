*** Settings ***
Library    SeleniumLibrary    

*** Test Cases ***
TestCasePrint
    [Documentation]    Hello this first Self Made Prog
       
    
    Open Browser    https://www.freecrm.com/     chrome
   
    Sleep    3    
    
    Click Element    xpath=//span[text()='Log In'] 
    Input Text       name=email        ankur88   
    Input Password    name=password    ankur123      
    Log               Its completed         
    