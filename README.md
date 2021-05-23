# Biilable_Hours_Test
API TESTS
------------

Prerequisites<br />
-----------
Install nodejs<br />
install newman<br />
install htmlextra reporter<br />

Use the command below to install newman from nodejs command prompt<br />
$ npm install -g newman<br />
Use the command below to run the tests and generate an HTML report<br />
$ newman run {{postmancollectionfilename.json}} -r htmlextra --reporter-htmlextra-title "Billable App API Tests"<br />

MOBILE TESTS<br />
-------------

Prerequisites<br />
------------
install Appium server<br />
install Android SDK<br />
install java(version 8 or higher)<br />

Set the desired capabilities for the application<br />
Start the Appium sever<br />
Launch the testNG.xml file from command prompt <br />
java {{pathToTestNg.xmlFile}}<br />
