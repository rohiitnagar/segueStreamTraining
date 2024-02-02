Feature:  Verify login of Demo Web Shop 

#Author: Rohit Nagar

Scenario: Login With Invalid and Valid Credentials
 
Given Open the URL
Then Click Login Button 
When enter username "<Username>"
Then Click Continue Button

Examples:
 |Username | 
 |998173522 | 
 |09981735227|
 |9981735227|
 
 
 Scenario: Veirfy the Bottom Banner Page
 
 Given Open the URL 
 Then Click Banner