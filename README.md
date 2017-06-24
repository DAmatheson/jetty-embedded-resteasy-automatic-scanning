This example demonstrates automatic scanning of JAX-RS resources with embedded Jetty and RESTEasy.

The key to enabling this is the 
    `<Call class="org.eclipse.jetty.webapp.Configuration$ClassList" name="setServerDefault">`
section of `webserver/src/main/resources/server_config.xml` and the appropriate dependency libraries.

# Build
`mvn clean package`

# Prepare to run
Copy `webserver/target/webserver-1.0.0-SNAPSHOT-jar-with-dependencies.jar` to `web-api/target/`

# Run
From a terminal open in `web-api/target`:  
`java -jar webserver-1.0.0-SNAPSHOT-jar-with-dependencies.jar`

## View the index page
`http://localhost:8080`

## Execute the Library API Resource
`http://localhost:8080/api/library/books`