The application is based on Spring Boot Tutorial https://www.youtube.com/watch?v=9SGDpanrc8U

It contains a web server, created via Spring Initializr, based on Maven, connected to a PostgreSQL database.

A table named 'student' is created and REST APIs are used to insert entries with 'name', 'email' and 'dob'. The 'age' field is calculated based on 'dob'. 'id' is auto-incremented.

Need to create a PostgreSQL DB on the server (recommneded to use a container).
