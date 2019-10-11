# Dosimetry Calculator
#### YSU Software Engineering Fall 2019
#### Christopher Barnhouse, Brandon Joyce, Treyveon Marshall, Benjamin Wakefield 

Here is the repo for the dosimetry project, once you have it cloned and working don't forget a git pull everytime you start working. (and push your changes when your done)

## Installation links
### Installation tips for windows, message me (Ben) for MacOS installation instructions
Here is the apache downloads page: 
https://tomcat.apache.org/download-90.cgi
(for windows the installer is all you need, also at the end of the installer don't hit run server)

Install Eclipse EE - Run the installer and hit the second item
https://www.eclipse.org/downloads/

I can explain the particular setup in Eclipse but installing those will get you most of the way.

## Details about JRE
Once you have done this you will have the code opened up in Eclipse, if you see errors for all the Java code you will have to right click on the project, go to properties (at the bottom) and make sure that Java Build Path > Libraries the JRE is pointed to your installed JRE, so hit edit and select your workspace JRE. 
The reason we have to do this is that the .classpath file (Now added to the .gitignore) tells what version of Java the code runs on, but we can all run it in different (Relatively similar) versions of Java by changing our build paths respectively.
