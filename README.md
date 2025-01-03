# Job Application Web App

This is a full-featured job application web application developed using **Spring Boot** as the backend and **HTML**, **CSS**, **JSP**, and **JSTL** for the frontend. The application allows users to view, add, and manage job listings, including details such as job description, required experience, and the technologies needed for each job. Users can also add their tech skills and specify their experience. Data is stored persistently in a **MySQL database** and is accessed using a **REST API** built with Spring Boot.

## Table of Contents
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Setup and Installation](#setup-and-installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

---

## Features

- **Add Job Listings**: Add new jobs with fields like job title, description, required experience, and technologies.
- **View All Jobs**: See all job listings with detailed information.
- **Add Skills and Experience**: Users can add their own skills and experience level.
- **Dynamic UI with JSP and JSTL**: Display job data dynamically using JSP and JSTL.
- **REST API Integration**: Access and manage job data using RESTful API endpoints.
- **Persistent Data Storage**: All job and user data is stored in a MySQL database.

## Technologies Used

### Frontend
- **HTML** and **CSS** for basic layout and styling.
- **JSP (Java Server Pages)** for rendering server-side HTML.
- **JSTL (JavaServer Pages Standard Tag Library)** for control flow and data iteration in JSP pages.

### Backend
- **Spring Boot**: Core framework to build and manage the backend, now enhanced with REST API functionality.
- **Spring Data JPA**: For interacting with the MySQL database.
- **MySQL**: Database for storing job listings and user skills.

## Project Structure

The project follows a traditional Spring Boot structure with controllers, services, repositories, and models organized in a modular way. The REST API endpoints are defined in the controllers, which interact with the service layer to handle business logic and data persistence.

## Setup and Installation

### Prerequisites

- **Java 17** or above
- **Maven** for building the project
- **MySQL** for the database
- **Spring Boot** (embedded in the project via dependencies)

### Steps

1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/job-application-web-app.git
   cd job-application-web-app
2.  **Database Configuration**:
   ```bash
   spring.datasource.url=jdbc:mysql://localhost:3306/job_app_db
   spring.datasource.username=your-username
   spring.datasource.password=your-password
   spring.jpa.hibernate.ddl-auto=update



