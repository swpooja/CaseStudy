Feature: Place Order

Background: User Login
Given User is on login Page
When User enters "poojamalve" and "pooja@123"
Then User Should on Home page

Scenario: Add item to cart
When User add item to cart
#Then User click on OK
Then Item must be added