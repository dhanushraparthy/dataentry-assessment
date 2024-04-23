# Running and Testing the Data Entry Application

## Prerequisites:

- Java Development Kit (JDK) installed on your machine (version 11 or higher).
- Gradle installed on your machine (if not, you can use the Gradle wrapper provided in the project).

## Steps:

1. **Clone the Repository:**
   Clone the repository containing the application code from GitHub.

## Clone the application and go the application path

   ```
   git clone <repository-url>
   cd <project-directory>
   ```

## Run the below commands to build and run the application

  ``` 
  ./gradlew build
  ./gradlew bootRun
  ```

or run using the jar as below

  ```
  java -jar build/libs/<jar-file-name>.jar
   ```

## Access the Application:

Open a web browser and navigate to http://localhost:8080 to access the data entry form.

## Fill out the Form:

Fill out the form with the required fields (Name and Title) and optional fields (Age and Hometown). The Submit button
should be enabled only if the required fields are filled in.

## Submit the Form:

Click on the Submit button to submit the form. You should be redirected to the confirmation page.

## Verify Confirmation Page:

On the confirmation page, you should see the details of the entry you submitted along with a table of previous entries (
if any). The latest entry should be displayed at the top.


