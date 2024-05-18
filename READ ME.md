 <a name="readme-top"></a>

<!--
!!! IMPORTANT !!!
This README is an example of how you could professionally present your codebase. 
Writing documentation is a crucial part of your work as a professional software developer and cannot be ignored. 

You should modify this file to match your project and remove sections that don't apply.

REQUIRED SECTIONS:
- Table of Contents
- About the Project
  - Built With
  - Live Demo
- Getting Started
- Authors
- Future Features
- Contributing
- Show your support
- Acknowledgements
- License

OPTIONAL SECTIONS:
- FAQ

After you're finished please remove all the comments and instructions!

For more information on the importance of a professional README for your repositories: https://github.com/microverseinc/curriculum-transversal-skills/blob/main/documentation/articles/readme_best_practices.md
-->

<div align="center">
  <!-- You are encouraged to replace this logo with your own! Otherwise you can also remove it. -->
  <img src="murple_logo.png" alt="logo" width="140"  height="auto" /><h1>WEB WIZARD</h1>
  <br/>

  <h3><b>HOTEL MANAGEMENT SYSTEM</b></h3>

</div>

<!-- TABLE OF CONTENTS -->

# 📗 Table of Contents

- [📖 About the Project](#about-project)
  - [🛠 Built With](#built-with)
    - [Tech Stack](#tech-stack)
    - [Key Features](#key-features)
  - [🚀 Live Demo](#live-demo)
- [💻 Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Setup](#setup)
  - [Install](#install)
  - [Usage](#usage)
  - [Run tests](#run-tests)
  - [Deployment](#deployment)
- [👥 Authors](#authors)
- [🔭 Future Features](#future-features)
- [🤝 Contributing](#contributing)
- [⭐️ Show your support](#support)
- [🙏 Acknowledgements](#acknowledgements)
- [❓ FAQ (OPTIONAL)](#faq)
- [📝 License](#license)

<!-- PROJECT DESCRIPTION -->

# 📖 [ About the Project] <a name="about-project"></a>

>The Hotel Management System is a comprehensive software application designed to streamline and automate various operations within the Adila Hotel. It includes modules for managing reservations, guest check-ins and check-outs, room assignments, billing and invoicing, inventory management, staff scheduling, and reporting.

## 🛠 Built With <a name="built-with">HOTEL WEBSITE DESIGN</a>

Built With
The Adila Hotel Management System is built using the following technologies:

Programming Languages
HTML: The standard markup language for creating web pages.
PHP 8.0: A popular server-side scripting language used for the dynamic functionality of the website.
JavaScript: A client-side scripting language used for interactivity and user experience enhancement.
CSS: The style sheet language used for describing the presentation of the web pages.
Database
MySQL 8.0: The relational database management system used for storing and managing hotel data.



Testing and Quality Assurance
PHPUnit: A unit testing framework for PHP.


PHP_CodeSniffer: A tool that detects violations of a defined set of coding standards.
Other Tools and Services
Git: The distributed version control system used for managing the project's codebase.
GitHub: The code hosting and collaboration platform used for the project's repository.


The combination of these technologies and tools allows the Adila Hotel Management System to provide a robust, scalable, and user-friendly hotel management solution, leveraging the strengths of HTML, PHP, JavaScript, CSS, and MySQL.

Share





### Tech Stack <a name="tech-stack"></a>

> Describe the tech stack and include only the relevant sections that apply to your project.

<details>
  <summary>Client</summary>
  <ul>
    <li><a href="https://reactjs.org/">React.js</a></li>
  </ul>
</details>

<details>
  <summary>Server</summary>
  <ul>
    <li><a href="https://expressjs.com/">Express.js</a></li>
  </ul>
</details>

<details>
<summary>Database</summary>
  <ul>
    <li><a href="https://www.postgresql.org/">PostgreSQL</a></li>
  </ul>
</details>

<!-- Features -->

### Key Features <a name="key-features"></a>

> Describe between 1-3 key features of the application.

- **[ONLINE BOOKING]**
- **[CUSTOMER REALTION MANAGEMENT]**
- **[FINITIOAL ISSUE]**

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- LIVE DEMO -->

## 🚀 Live Demo <a name="live-demo"></a>

> Add a link to your deployed project.
https://github.com/TrezaSelamu/team-colaboration.git



<!-- GETTING STARTED -->

## 💻 Getting Started <a name="getting-started"></a>

> Describe how a new developer could make use of your project.

To get a local copy up and running, follow these steps.

### Prerequisites

Before you begin the deployment process, ensure that you have the following:

Production Server: A web server with PHP and a database management system (e.g., MySQL, PostgreSQL) installed and configured.
Domain Name: A domain name (e.g., adilahotel.com) that will be used to access the website.
SSL/TLS Certificate: A valid SSL/TLS certificate to enable HTTPS for the website.
Deployment User: A user account with the necessary permissions to deploy the website and manage the production server.

### Setup
<div>
1.Clone the repository:
Example commands:
  git clone https://github.com/samikenaw/hotel-management-system.git</div>
  <div>
2.Change to the project directory:
Example commands:
cd hotel-management-system </div>
<!--
Example commands:

```sh
  cd my-folder
  git clone git@github.com:myaccount/my-project.git
```
--->

### Install

Installation
Follow these steps to set up the Adila Hotel website:

Prerequisites:
Make sure you have a web server with PHP support installed (e.g., Apache, Nginx).
Ensure you have a database management system (e.g., MySQL, PostgreSQL) installed and configured.
Clone the Repository:
Open your terminal or command prompt.
Navigate to the directory where you want to install the website.
Run the following command to clone the repository:
Copy
git clone https://github.com/your-username/adila-hotel-website.git
Configure the Database:
Create a new database for the Adila Hotel website.
Open the config.php file located in the includes directory.
Update the database connection details (host, username, password, database name) with your own credentials.
Set Up the Web Server:
Copy the contents of the adila-hotel-website directory to your web server's document root (e.g., /var/www/html/ on Linux, C:\inetpub\wwwroot\ on Windows).
Ensure that the web server has the necessary permissions to access and execute the PHP scripts.
Initialize the Database:
Open a web browser and navigate to the install.php file in your website's directory (e.g., http://localhost/adila-hotel-website/install.php).
Follow the on-screen instructions to set up the initial database structure and administrator account.
Access the Website:
After the installation is complete, you can access the Adila Hotel website by navigating to the root URL (e.g., http://localhost/adila-hotel-website).
Log in using the administrator credentials you created during the installation process.

### Usage
Hotel Management
Room Management: Add, update, and manage hotel room information, including room types, availability, and pricing.
Reservation Management: Handle guest reservations, including check-in, check-out, and room assignments.
Billing and Invoicing: Generate invoices, process payments, and manage financial transactions.
Reporting and Analytics: Access real-time reports and analytics on hotel occupancy, revenue, and guest trends.
Guest Management
Guest Registration: Facilitate the registration of new guests, collecting essential information such as contact details and preferences.
Guest Profile Management: Maintain and update guest profiles, including past stays, preferences, and loyalty program information.
Guest Communication: Communicate with guests through email or SMS, sending updates, promotions, and other relevant information.
Online Booking: Allow guests to easily book their hotel stay through a user-friendly online booking system.
Food and Dining
Menu Management: Maintain and update the hotel's food and beverage menu, including item descriptions, pricing, and dietary information.
Online Ordering: Enable guests to place food and drink orders directly through the hotel's website or mobile app.
Order Tracking: Monitor and manage incoming food orders, ensuring timely preparation and delivery.
Integration with Kitchen: Seamlessly integrate the online ordering system with the hotel's kitchen operations for efficient order fulfillment.
Employee Management
Employee Scheduling: Manage employee schedules, shifts, and timekeeping for efficient hotel operations.
Task Allocation: Assign specific tasks and responsibilities to hotel staff, ensuring smooth workflow.
Performance Tracking: Monitor and evaluate employee performance, supporting professional development and training.

### Run tests

To ensure the Adila Hotel website is functioning correctly, you can run the following tests:

Unit Tests:
Navigate to the tests directory in your project.
Run the following command to execute the unit tests:
Copy
php vendor/bin/phpunit tests/unit
Integration Tests:
Navigate to the tests directory in your project.
Run the following command to execute the integration tests:
Copy
php vendor/bin/phpunit tests/integration
End-to-End (E2E) Tests:
Ensure you have a web browser (e.g., Google Chrome, Firefox) installed on your system.
Navigate to the tests/e2e directory.
Run the following command to execute the E2E tests:
Copy
php vendor/bin/codecept run

### Deployment
Follow these steps to deploy the Adila Hotel website to your production environment:

Prepare the Deployment Package:
Ensure that you have the latest version of the Adila Hotel website code.
Create a deployment package by compressing the entire website directory (e.g., adila-hotel-website.zip).
Transfer the Deployment Package:
Using a secure file transfer method (e.g., SFTP, SCP), upload the deployment package to your production server.
Transfer the package to the appropriate directory on the server, such as /var/www/html/ on Linux or C:\inetpub\wwwroot\ on Windows.
Extract the Deployment Package:
Log in to your production server using the deployment user account.
Navigate to the directory where you uploaded the deployment package.
Extract the contents of the package using the appropriate command for your operating system (e.g., unzip adila-hotel-website.zip on Linux, Expand-Archive adila-hotel-website.zip -DestinationPath . on Windows).
Configure the Database:
Create a new database for the Adila Hotel website on your production server.
Open the config.php file located in the includes directory.
Update the database connection details (host, username, password, database name) with your production server's credentials.
Set up the Web Server:
Ensure that the web server has the necessary permissions to access and execute the PHP scripts.
Configure the web server to serve the Adila Hotel website files. This may involve setting up a virtual host or modifying the server's document root.
Initialize the Database:
Open a web browser and navigate to the install.php file in your website's directory (e.g., https://www.adilahotel.com/install.php).
Follow the on-screen instructions to set up the initial database structure and administrator account.
Test the Deployment:
Open a web browser and navigate to the Adila Hotel website using the production domain (e.g., https://www.adilahotel.com).
Verify that the website is accessible and functioning correctly.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- AUTHORS -->

## 👥 Authors <a name="authors"></a>

> Mention all of the collaborators of this project.

👤 **YEABSIRA GETACHEW**

- GitHub: [@githubhandle](https://github.com/Yeabgethub)
- Twitter: [@twitterhandle](https://twitter.com/twitterhandle)
- LinkedIn: [LinkedIn](https://linkedin.com/in/linkedinhandle)
- PhoneNumber:0922761360

👤 **SAMUEL KENAW**

- GitHub: [@githubhandle](https://github.com/githubhandle)
- Twitter: [@twitterhandle](https://twitter.com/twitterhandle)
- LinkedIn: [LinkedIn](https://linkedin.com/in/linkedinhandle)
 
👤 **TSION TESFAYE**

- GitHub: [@githubhandle](https://github.com/githubhandle)
- Twitter: [@twitterhandle](https://twitter.com/twitterhandle)
- LinkedIn: [LinkedIn](https://linkedin.com/in/linkedinhandle)

👤 **TREZA SELAMU**

- GitHub: [@githubhandle](https://github.com/githubhandle)
- Twitter: [@twitterhandle](https://twitter.com/twitterhandle)
- LinkedIn: [LinkedIn](https://linkedin.com/in/linkedinhandle)
  
👤 **JEMILA KOJI**

- GitHub: [@githubhandle](https://github.com/githubhandle)
- Twitter: [@twitterhandle](https://twitter.com/twitterhandle)
- LinkedIn: [LinkedIn](https://linkedin.com/in/linkedinhandle)


<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- FUTURE FEATURES -->

## 🔭 Future Features <a name="future-features"></a>

> Describe 1 - 3 features you will add to the project.

- [ ] **[new_feature_1]**
- [ ] **[new_feature_2]**
- [ ] **[new_feature_3]**

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- CONTRIBUTING -->

## 🤝 Contributing <a name="contributing"></a>

Contributions, issues, and feature requests are welcome!

Feel free to check the [issues page](../../issues/).

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- SUPPORT -->

## ⭐️ Show your support <a name="support"></a>

> Write a message to encourage readers to support your project

If you like this project...

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- ACKNOWLEDGEMENTS -->

## 🙏 Project Maintainers
John Doe
Jane Smith
Alex Johnson
Core Contributors
Samantha Lee
Michael Chen
Olivia Nguyen

> Give credit to everyone who inspired your codebase.

I would like to thank...

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- FAQ (optional) -->

## ❓ FAQ (OPTIONAL) <a name="faq"></a>

> Add at least 2 questions new developers would ask when they decide to use your project.

- **[Question_1]**

  - [Answer_1]

- **[Question_2]**

  - [Answer_2]

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- LICENSE -->

## 📝 License <a name="license"></a>

This project is [MIT](./LICENSE) licensed.

_NOTE: we recommend using the [MIT license](https://choosealicense.com/licenses/mit/) - you can set it up quickly by [using templates available on GitHub](https://docs.github.com/en/communities/setting-up-your-project-for-healthy-contributions/adding-a-license-to-a-repository). You can also use [any other license](https://choosealicense.com/licenses/) if you wish._

<p align="right">(<a href="#readme-top">back to top</a>)</p>
