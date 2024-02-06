
Welcome to the Photo application! This project is designed to demonstrate basic functionalities for managing photos, including uploading, downloading, and deleting photos via RESTful APIs.

Overview
The TestProject application consists of the following components:

Controllers: Spring MVC controllers responsible for handling HTTP requests and responses.
Models: POJO classes representing data entities, such as Photo.
Services: Business logic and data access operations are implemented in service classes.
Repositories: Interfaces for accessing data from the underlying database.
HTML Page: A simple HTML page for uploading photos using a web browser.
Endpoints
GET /photos: Retrieves all photos stored in the system.
GET /photos/{id}: Retrieves a photo by its unique ID.
POST /photos: Uploads a new photo to the system.
DELETE /photos/{id}: Deletes a photo from the system by its unique ID.
GET /download/{id}: Downloads a photo by its ID.
Usage
Uploading a Photo
Open the HTML page upload.html located in the src/main/resources/static directory.
Choose a photo file using the file input field.
Click the "Upload" button to upload the selected photo to the server.
Managing Photos via REST APIs
Use tools like cURL, Postman, or Swagger UI to interact with the RESTful APIs exposed by the application.
Send HTTP requests to the specified endpoints to perform CRUD operations on photos.
