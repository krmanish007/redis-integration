This creates does the following:
- Uses docker-compose to start a dockerized official redis instance
- Start a dockerized version of this service
- Create an endpoint to insert data in the cache
- Create an endpoint to retrieve cached data, if the data is not cached, it creates a UUID, and cache id, so next time you will get a cached UUID for that it.
- It has a swagger UI to play with the endpoints.
