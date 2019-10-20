*** Settings ***
Library    SeleniumLibrary    



*** Test Cases ***
# MyFirstProject
    # Log    Hello World...  
    
# MySecondCase
    # Open Browser    https://www.google.com    chrome
    # Set Browser Implicit Wait    5
    # Input Text    name=q    ankur malviya
    # Sleep    5   
    # Click Button    name=btnK     
    # Sleep    5    
    
    # Close Browser
    
SampleLoginTest
    
    Open Browser    ${url}                 ff    
    KeyLogIn       
    Sleep    1    
    Close Browser
    
***variables***
${url}    https://opensource-demo.orangehrmlive.com/
@{credential}     Admin    admin123    AA    BB    11    22

*** Keywords ***
KeyLogIn
    Input Text      id=txtUsername        @{credential}[0]         
    Input Password  id=txtPassword    	  @{credential}[1]
    Click Button    id=btnLogin