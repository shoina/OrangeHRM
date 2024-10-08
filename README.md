"OrangeHRM-Automation-001" 
## **Test Plan for Demo OrangeHRM Website Automation**

###  **Introduction**
The purpose of this test plan is to define the scope, approach, resources, and schedule for automating the testing of critical features of the OrangeHRM demo website. This project aims to automate regression tests for key functionalities, including login, employee management, and leave management, to reduce manual testing efforts and improve test coverage.

---

###  **Scope**
#### **In Scope**:
The following modules of the OrangeHRM demo website are within the scope of automation:
   - **Login Functionality**
   - **Dashboard Verification**
   - **Employee Information Management** (Add, Edit, Delete)
   - **Leave Management** (Apply for Leave, Cancel Leave)
   - **PIM Module** (Add Employee, Search Employee)
   - **Logout**

#### **Out of Scope**:
   - **Performance Testing**
   - **Email Notification Testing**
   - **Third-party Integrations (e.g., LinkedIn, Google Sign-in)**

---

###  **Objectives**
The objectives of automating the tests for the OrangeHRM demo site are as follows:
   - Ensure critical functionalities of the OrangeHRM platform work as expected across different browsers.
   - Reduce the time spent on repetitive regression testing.
   - Provide faster feedback to developers by integrating automation into a CI/CD pipeline.

---

### **Test Approach**
The **Page Object Model (POM)** will be used to design the automation framework for maintainability and reusability. We will use **Selenium WebDriver** for browser automation, **TestNG** for test execution, and **Maven** for dependency management and build automation.

#### **Tools and Technologies**:
   - **Automation Tools**: Selenium WebDriver
   - **Test Framework**: TestNG
   - **Programming Language**: Java
   - **Build Tool**: Maven
   - **Browser Support**: Chrome, Firefox
   - **Reporting**: Allure Reports or Extent Reports for test reporting
   - **Version Control**: Git (for maintaining the test scripts)
   - **CI/CD**: Jenkins for continuous test execution

#### **Test Types**:
   - **Functional Testing**: Verify that the functionalities (login, dashboard, employee management) behave as expected.
   - **Regression Testing**: Automatically verify that new updates to the system do not break existing functionality.
   - **Cross-browser Testing**: Test the application on different browsers (Chrome, Firefox).

---

###  **Test Environment**
The tests will be executed on the following environment:
   - **URL**: [https://opensource-demo.orangehrmlive.com/](https://opensource-demo.orangehrmlive.com/)
   - **Browsers**: Chrome (latest version), Firefox (latest version)
   - **Operating System**: Windows 10 (primary), Linux (for CI/CD)
   - **Test Data**: Dummy test data will be used for creating, updating, and deleting employees, leave applications, etc.

---

###  **Test Cases and Scenarios**
#### **Module 1: Login Functionality**
   - **Test Case 1.1**: Verify that the login page loads successfully.
   - **Test Case 1.2**: Verify that the user can log in with valid credentials.
   - **Test Case 1.3**: Verify that an error message appears when logging in with invalid credentials.
   
#### **Module 2: Dashboard**
   - **Test Case 2.1**: Verify that the user is redirected to the dashboard after a successful login.
   - **Test Case 2.2**: Verify that the widgets and elements on the dashboard load correctly.
   
#### **Module 3: Employee Management (PIM)**
   - **Test Case 3.1**: Verify that an employee can be added successfully.
   - **Test Case 3.2**: Verify that an employee can be searched using valid search criteria.
   - **Test Case 3.3**: Verify that an employee's details can be updated.
   - **Test Case 3.4**: Verify that an employee can be deleted.
   
#### **Module 4: Leave Management**
   - **Test Case 4.1**: Verify that an employee can apply for leave.
   - **Test Case 4.2**: Verify that the applied leave is reflected in the leave list.
   - **Test Case 4.3**: Verify that an employee can cancel a leave application.

#### **Module 5: Logout**
   - **Test Case 5.1**: Verify that the user can successfully log out of the application.

---

###  **Test Data Management**
Test data for the automation will consist of dummy user accounts and employee records. The following will be created in advance:
   - **Login Credentials**: A standard user account (e.g., `Admin`, `admin123`).
   - **Employee Data**: Randomly generated employee data (names, positions, IDs) for add/edit/delete operations.
   - **Leave Data**: Dummy data to simulate leave applications and approvals.

**Data Reset**:
- Data (e.g., employees added/edited/deleted) should be reset after each test suite execution to ensure tests are independent.

---

###  **Test Deliverables**
The following deliverables will be produced during this project:
   - **Test Automation Scripts**: Selenium test scripts for all the test cases.
   - **Test Execution Reports**: Detailed execution reports generated via Allure or Extent Reports.
   - **Test Results Summary**: A summary of test pass/fail status with logs.
   - **CI/CD Integration**: Automated tests integrated with Jenkins for continuous testing.

---

###  **Test Execution Schedule**
The project will follow the following timeline:
   - **Week 1**: Define test cases, set up test environment, install dependencies.
   - **Week 2**: Develop the Page Object Model (POM) and base framework setup.
   - **Week 3**: Implement test cases for login, dashboard, and employee management.
   - **Week 4**: Implement test cases for leave management and logout.
   - **Week 5**: Integrate with Jenkins, set up cross-browser testing, generate reports.
   - **Week 6**: Perform final test run, review results, and adjust as needed.


