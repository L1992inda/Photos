
# Welcome to the Photo application!
<h3>This project is designed to demonstrate basic functionalities for managing photos, including uploading, downloading, and deleting photos via RESTful APIs.</h3>
Overview
The TestProject application consists of the following components:

Controllers: Spring MVC controllers responsible for handling HTTP requests and responses.<br/>
Models: POJO classes representing data entities, such as Photo.<br/>
Services: Business logic and data access operations are implemented in service classes.<br/>
Repositories: Interfaces for accessing data from the underlying database.<br/>
HTML Page: A simple HTML page for uploading photos using a web browser.<br/><br/>
Endpoints:<br/>
GET /photos: Retrieves all photos stored in the system.<br/>
GET /photos/{id}: Retrieves a photo by its unique ID.<br/>
POST /photos: Uploads a new photo to the system.<br/>
DELETE /photos/{id}: Deletes a photo from the system by its unique ID.<br/>
GET /download/{id}: Downloads a photo by its ID.<br/><br/>
Usage:<br/>
Uploading a Photo<br/>
Open the HTML page upload.html located in the src/main/resources/static directory.<br/>
Choose a photo file using the file input field.<br/>
Click the "Upload" button to upload the selected photo to the server.<br/>
Managing Photos via REST APIs<br/>
Use tools like Postman to interact with the RESTful APIs exposed by the application.<br/>
