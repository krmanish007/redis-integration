This spring boot service does the following:
- Uses docker-compose to start a dockerized official redis instance. It stores the cache outside the docker, so that redis restart should lose the cache data.
- Start a dockerized version of this service
- Create an endpoint to insert data in the cache
- Create an endpoint to retrieve cached data, if the data is not cached, it creates a UUID, and cache id, so next time you will get a cached UUID for that it.
- It has a swagger UI to play with the endpoints at http://localhost:8080/swagger-ui.html

To run the application:
`mvn clean install`
`docker-compose up --build`
`docker-compose down`
