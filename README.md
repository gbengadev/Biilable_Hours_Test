# Biilable_Hours_Test
Billable Hours test framework is designed with a few frameworks and tools which are:<br />
Appium with Java, Maven and TestNG for UI automation<br />
Postman with Newman runner for API test automation<br />

API TESTS
------------

Prerequisites<br />
-----------
Install nodejs<br />
install newman<br />
install htmlextra reporter<br />

Use the command below to install newman from nodejs command prompt<br />
$ npm install -g newman<br />
Use the command below to run the tests and generate an HTML report from the folder location where the collection resides<br />
$ newman run {{postmancollectionfilename.json}} -r htmlextra --reporter-htmlextra-title "$API test name"<br />
View the HTML report inside the "Newman" folder located in  the folder location of the API collection

MOBILE TESTS<br />
-------------

Prerequisites<br />
------------
Install Appium server<br />
Install Android SDK<br />
Install java(version 8 or higher)<br />

Set the desired capabilities for the application<br />
Start the Appium sever<br />
Launch the testNG.xml file from command prompt <br />
java {{pathToTestNg.xmlFile}}<br />
Get the report from the "Test Output" folder in the projects location
