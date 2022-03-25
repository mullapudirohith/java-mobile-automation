# java-mobile-automation
Java is one of the most versatile programming languages which is platform independent. My current aim is to create an automation framework for applications(native, hybrid) on real Android devices, which can run on any OS.

Setup Steps:
1. Install latest Eclipse.
2. Install TestNG Eclipse Plugin from Eclipse Marketplace.
3. Import the maven project.
4. Install Appium Studio
5. Turn on USB debugging in Android device from developer options.
6. Install the application to be automated in the Android device.
7. Connect it to PC via usb cable and verify the device is recognised in Appium Studio.
8. Go to src/test/resources/TestData.properties in IDE and put the UDID of the device, app package and activity names.
9. Run testng.xml
10. Check if the desired application is opened on the device.

This is a Page Object Model type automation framework. You can add more objects and methods for the objects for respective pages under src/test/java/pageObjects/. You can refer the default HomePage.java file for info on objects and methods.
You Can add more tests under src/test/java/tests. You can refer to test1.java for reference on how to create a constructor, call methods from Page Object files and how default methods can be calle from baseTest.java using inheritance.
