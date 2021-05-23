# Biilable_Hours_Test
API TESTS
------------

Prerequisites<br />
-----------
Install nodejs<br />
install newman
install htmlextra reporter

Use the command below to install newman from nodejs command prompt
$ npm install -g newman
Use the command below to run the tests and generate an HTML report
$ newman run {{postmancollectionfilename.json}} -r htmlextra --reporter-htmlextra-title "Billable App API Tests"

MOBILE TESTS
-------------

Prerequisites
------------
install Appium server
install Android SDK
install java(version 8 or higher)

Set the desired capabilities for the application
Start the Appium sever
Launch the testNG.xml file from command prompt 
java {{pathToTestNg.xmlFile}}
