# movie-api

# Movie API – Spring Boot REST Application

This is a simple Spring Boot backend application that provides RESTful APIs
to manage a collection of movies.  
The project was built as a sample task to demonstrate backend fundamentals,
REST API design, validation, exception handling, and cloud deployment.

---

## 🚀 Live Deployment

Base URL (Render):
https://movie-api-vmx3.onrender.com

---

## 📌 Features

- Add a new movie
- Get all movies
- Get a movie by ID
- Input validation using Jakarta Validation
- Global exception handling using @RestControllerAdvice
- In-memory data storage (ArrayList)
- Dockerized and deployed on Render

---

## 🛠️ Technologies Used

- Java 17
- Spring Boot
- Spring MVC
- Jakarta Validation
- Maven
- Docker
- Render (Cloud Deployment)

---

## 📂 API Endpoints

### 1️⃣ Add Movie

**POST** `/api/movies`

Request Body:
```json
{
  "name": "Inception",
  "description": "Sci-fi thriller",
  "rating": 9
}

Response:

Status: 201 Created

Body: Movie object with generated ID


### 2. Get All movies

GET /api/movies

Response:

[]


### 3. Get Movie by id
GET /api/movies/1

Response:

Status: 200 OK

Body: Movie object


#Note
This application uses in-memory storage (ArrayList) as per the task requirement.
Since it is deployed on a free cloud instance, the application may restart after
inactivity, which resets the in-memory data.

For persistent storage, a database such as MySQL or PostgreSQL can be integrated.



