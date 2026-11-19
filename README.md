\# Employee Management REST API



This is a simple REST API project built using Java and Spring Boot.



I created this project to learn how backend applications work and how REST APIs can be developed using Spring Boot. The application currently provides an endpoint to retrieve employee details in JSON format.



\### Technologies Used

\- Java 17

\- Spring Boot 4.1.2

\- Spring Web

\- Maven

\- Postman

\- Eclipse IDE



\### Current Features

\- Retrieve all employee records.

\- Return employee details in JSON format.

\- Manage employee data using Spring components.

\- Run the application on a local server.



\### API Endpoint



| Method | Endpoint | Description |

|---|---|---|

| GET | `/employees` | Get all employees |



\*\*Local URL:\*\* `http://localhost:8084/employees`



The API currently returns four sample employee records.



\### Employee Details

Each employee record includes:

\- Employee ID

\- First name

\- Last name

\- Email

\- Job title



\### Running the Project



Make sure Java is installed and open the project folder in a terminal.



Run:



```powershell

.\\mvnw.cmd spring-boot:run

```



The application will start on port `8084`. You can test the endpoint using Postman.



\### Project Status



Phase 1 is complete. The Spring Boot application is running successfully, and the GET API is returning employee records in the expected JSON format.



\### Future Improvements

\- Add POST, PUT and DELETE APIs.

\- Connect the application to a database.

\- Store and manage employee records instead of using sample data.



This project is part of my hands-on learning journey with Java, Spring Boot and backend development.

