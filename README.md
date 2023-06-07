# project-documentation

<p align="center">
  <a href="" rel="noopener">
     <img width=200px height=200px src="https://imgur.com/qgFN3t8" alt="Project logo">
 </a>
</p>

<h3 align="center">Resume-Portfolio-websites</h3>

<div align="center">

  [![Status](https://img.shields.io/badge/status-active-success.svg)]() 
  [![GitHub Issues](https://img.shields.io/github/issues/kylelobo/The-Documentation-Compendium.svg)](https://github.com/kylelobo/The-Documentation-Compendium/issues)
  [![GitHub Pull Requests](https://img.shields.io/github/issues-pr/kylelobo/The-Documentation-Compendium.svg)](https://github.com/kylelobo/The-Documentation-Compendium/pulls)
  [![License](https://img.shields.io/badge/license-MIT-blue.svg)](/LICENSE)

</div>

---

<p align="center"> Few lines describing your project.
    <br> 
</p>

## 📝 Table of Contents
- [About](#about)
- [Getting Started](#getting_started)
- [Deployment](#deployment)
- [Usage](#usage)
- [Built Using](#built_using)
- [Authors](#authors)
- [Acknowledgments](#acknowledgement)

## 🧐 About <a name = "about"></a>
This project serves as the foundation of my resume, encompassing updates on my educational background, employment history, and the projects I have completed. Additionally, I have included a contact option for individuals interested in connecting with me.

## 🏁 Getting Started <a name = "getting_started"></a>
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See [deployment](#deployment) for notes on how to deploy the project on a live system.

### Prerequisites
What things you need to install the software and how to install them.

```
1. Open the Spring initializr (https://start.spring.io.)
2. Provide the Group and Artifact name. We have provided the Group name net. javatpoint and Artifact resume.
3. Attach the dependency as per your requirement
4. Now click on the Generate button.
5. Extract the RAR file.
6. Import the folder {File -> Import -> Existing Maven Project -> Next -> Browse -> Select the project -> Finish}
```

## 🔧 Running the tests <a name = "tests"></a>
Explain how to run the automated tests for this system.
- Set up your testing environment:
   - Make sure you have the necessary testing dependencies and frameworks in your project's build configuration (e.g., Maven or Java).
   - Create a dedicated test folder (e.g., src/test/java) where you'll place your test classes.
- Write your automated tests:
   - Create test classes and methods that cover the desired functionality.
   - Utilize testing frameworks like JUnit or TestNG for writing test cases.
   - Use Spring's testing annotations such as `@RunWith(SpringRunner.class)` and `@SpringBootTest` to bootstrap the application context for testing.
   - Write individual test methods to cover specific scenarios, ensuring comprehensive test coverage.
- Run the tests:
   - Use your Eclipse test runner to execute the tests directly from the test class or method level.
   - Alternatively, you can use build tools like Maven or Java to run the tests from the command line using the respective test commands (`mvn test` or `Java test`).
-  Analyze test results:
   - Examine the test output to identify any test failures or errors.
   - Review the test coverage reports to ensure adequate coverage of your application's code

## 🎈 Usage <a name="usage"></a>
If you run this project in your system first you need to Set up some files inside database
- Create databases using this :
```
create database personaportfolio;
```
- After that you have to Create this table :
```
create table files(
id varchar(255) primary key,
data longblob,
file_name varchar(255),
file_type varchar(255)
);
```
- After run this project, you need to open postman in your system and update pdf file use this process : 
```
* Use this link in a post process :

  http://localhost:9005/uploadFile
```
![Screenshot 2023-05-22 092658](https://github.com/GauravPant47/Resume-Portfolio-websites/assets/115808373/9bedc9ac-1c34-45d2-bfc0-8dccb0161252)

- After set this :

- select Files -> and then go to files folder

![Screenshot 2023-05-22 100058](https://github.com/GauravPant47/Resume-Portfolio-websites/assets/115808373/0a703f55-5e4e-4ab1-a42e-9fc969c31cc0)

- select GauravResume.pdf file and press enter, and click Send icon in postman

![image](https://github.com/GauravPant47/Resume-Portfolio-websites/assets/115808373/d7672b60-0e6e-4495-8cab-88575df13a22)

- if you sow this image file it's means you upload file in data bases then go databases and right 

![Screenshot 2023-05-22 092658](https://github.com/GauravPant47/Resume-Portfolio-websites/assets/115808373/9bedc9ac-1c34-45d2-bfc0-8dccb0161252)
- After set this :
- select Files -> and then go to files folder
![Screenshot 2023-05-22 100058](https://github.com/GauravPant47/Resume-Portfolio-websites/assets/115808373/0a703f55-5e4e-4ab1-a42e-9fc969c31cc0)
- select GauravResume.pdf file and press enter, and click Send icon in postman
![image](https://github.com/GauravPant47/Resume-Portfolio-websites/assets/115808373/d7672b60-0e6e-4495-8cab-88575df13a22)

- if you sow this image file it's means you upload file in data bases then go databases and right 

```
select * from files;
```
![image](https://github.com/GauravPant47/Resume-Portfolio-websites/assets/115808373/b667d0c8-43be-41e3-b359-efa740f6d806)
- you sow this data in your databases then copy id and go index.html file
![Screenshot 2023-05-22 101011](https://github.com/GauravPant47/Resume-Portfolio-websites/assets/115808373/299b1361-8502-48ea-a042-23ba53f58086)
- So paste the copy id here

## 🚀 Deployment <a name = "deployment"></a>
Add additional notes about how to deploy this on a live system.

## ⛏️ Built Using <a name = "built_using"></a>
- [MySQl](https://www.mysql.com/) - Database
- [Apache](https://tomcat.apache.org/) - Server Framework
- [Spring](https://spring.io/) - Web Framework
- [GitHub](https://github.com/) - Server Environment

## ✍️ Authors <a name = "authors"></a>
- [@GauravPant47](https://github.com/GauravPant47) - Idea & Initial work

See also the list of [contributors](https://github.com/GauravPant47/Resume-Portfolio-websites/graphs/contributors) who participated in this project.

## 🎉 Acknowledgements <a name = "acknowledgement"></a>
- Help tip - If you Want to check this project in your system you then you must have my sql database in your system
And you need to change the add the new databases or create a new database

```
spring.datasource.url=jdbc:mysql://localhost:3306/(Database name)?useSSL=false
spring.datasource.username=<<username>>
spring.datasource.password=<<password>>
```
---
