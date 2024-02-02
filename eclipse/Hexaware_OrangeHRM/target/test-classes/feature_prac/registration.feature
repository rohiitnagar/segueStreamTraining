Feature:  Verify login of Demo Web Shop 

#Author: Rohit Nagar

Scenario: Login With Invalid and Valid Credentials 

Given Open the URL 
When enter username "<Username>" and Password "<Password>"
Then Click on Login Button
 Examples:
 |Username | Password|
 |rohiitnagar@gmail.com | qwertt |
 |rohiitnagar@gmail.com | Rohit@123|
 
Scenario: Add to Cart 
Then Click AddtoCart Button 

 Scenario: Go to Cart
 Then Click GoToCart Button 
 Then Click terms Button
 Then Click checkout Button
 