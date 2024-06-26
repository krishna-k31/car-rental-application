# Selenium testing of Car Rental Portal
## Description
The Car Rental Portal application is designed for administrative management of a car rental service. It includes functionalities for user registration, vehicle management, brand management, and more.

## Version 1
Login Page: Initial page where users log in to access the dashboard.
Dashboard: Displays registered users, listed vehicles, total bookings, listed brands, etc.
Create Brand: Allows the creation of car brands with price range and EV brand options.
Manage Brands: Provides functionalities to update or delete brands.
Post Vehicle: Enables posting a vehicle for rental.
Manage Vehicles: Allows updating or deleting vehicle details.
Edit Vehicle: Enables editing vehicle details such as title, price, fuel type, and accessories.
Registered Users: Lists all registered users.
Additional Pages: Includes Manage Testimonials, Manage Contact Us queries, Manage Pages, Update Contact Info, and Manage Subscribers.

## Version 2
Introduced modifications such as changes in the size, location, and orientation of GUI elements.
Additional change: Redirects from the manage booking button to the registered users page instead of the manage bookings page.
GUI Testing with Selenium
Selenium was used for GUI testing to ensure the functionalities and appearances of the application were as expected. Selenium automates interactions with web browsers and supports multiple programming languages and various browsers.

## Features of Selenium
Automation: Mimics user actions like clicking buttons, entering text, and navigating through pages.
Cross-Browser Testing: Ensures consistency across Chrome, Firefox, Safari, etc.
Language Support: Supports Java, Python, C#, etc.
Integration: Integrates with other testing frameworks and tools.
Parallel Testing: Allows simultaneous testing on multiple browsers or devices.

## Scope and Usage
### Selenium is primarily used for:
Functional Testing: Verifying the functionality of web applications.
Regression Testing: Ensuring updates do not break existing functionalities.
Compatibility Testing: Checking performance across various browsers and platforms.
UI/UX Testing: Validating the user interface's appearance and usability.

## Test Cases
Add Brand Functionality: Creates the brand Tesla within the luxury price range and EV brand type.
Add Vehicle Feature: Adds a Tesla model and checks the existence and correctness of GUI elements and links.
Profile Image Size Check: Validates the profile image size.
GUI Element Location: Checks the location of the GUI element 'Page Heading'.
Page Flow Check: Validates the navigation flow between pages.
Dashboard Page Heading: Checks the existence and content of the GUI element 'Page Heading' on the dashboard.

## Test Results
Version 1: All test cases passed, indicating the application’s GUI elements, their location, size, and page flow work as expected.
Version 2: Three out of six test cases passed due to changes in the location, size, and flow of the GUI elements.

## Assessment of Selenium
Features and Functionalities
Supports various browsers and element identification using different locators (ID, name, XPath, CSS).
Provides actions to interact with elements and handles implicit waits.

## Coverage Types
Functional Coverage: Checks functionalities like adding brands or vehicles.
Visual Coverage: Verifies the appearance and layout of elements.
Flow Coverage: Ensures correct navigation flow.
Content Coverage: Checks the content displayed on the website.
Element Location Coverage: Validates the position of elements on the web page.

## Reuse of Test Cases
Test cases developed for one application can be reused for similar applications. In this case, test cases for Version 1 were reused for Version 2.

## Test Results
Selenium produces clear pass/fail results through assertions comparing expected and actual outcomes.

## Ease of Use
Requires understanding of HTML/CSS selectors and basic programming skills. Moderate effort needed to navigate Selenium documentation.

## Types of GUI Elements Tested
Selenium can interact with various GUI elements like buttons, input fields, images, text, etc.
