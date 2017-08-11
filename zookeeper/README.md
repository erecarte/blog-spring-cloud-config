## Standalone Spring Cloud Config Server
This repository contains an example used in [this blog post](http://www.enriquerecarte.com/2017-08-11/spring-cloud-config-series-zookeeper-backend).

The examples consists of one application which connects to Zookeeper. The sample contains a `docker-compose.yml` which
will launch Zookeeper with [Exhibitor](https://github.com/soabase/exhibitor/wiki) as one docker container. 

In order to start the container, just run `docker-compose up -d`. Once the container is up and running, you can start your application, which
will use the connect string `localhost:2181` to connect to Zookeeper. If you want to play around with the configuration, Exhibitor is accessible
at http://localhost:8400/exhibitor/v1/ui/index.html.

All the endpoints return two runtime properties, but each endpoint loads the configuration in a different way. The response looks as follows:

```json
{
  "firstProperty": "mapped to sample.firstProperty", 
  "secondProperty": "mapped to sample.secondProperty" 
}
```

The endpoints available are:
- `http://localhost:{port}/configuration-properties`: This endpoints returns the configuration loaded with `@ConfigurationProperties` annotation.
- `http://localhost:{port}/annotated-properties`: This endpoints returns the configuration loaded with `@Value` annotations on each field.
- `http://localhost:{port}/refreshed-annotated-properties`: This endpoints returns the configuration loaded with `@Value` annotations on each field, but
declaring the bean with `@RefreshScope`.
- `http://localhost:{port}/environment-properties`: This endpoints returns the configuration loaded by querying the `Environment`.

The reason to have these different endpoints is because it's interesting to see what happens when you change the Zookeeper configuration...and looking at
which endpoints return updated configuration and which ones don't.
