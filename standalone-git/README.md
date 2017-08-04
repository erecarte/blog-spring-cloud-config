## Standalone Spring Cloud Config Server
This repository contains an example used in [this blog post](http://www.enriquerecarte.com/2017-08-04/spring-cloud-config-series-git-backend).

The examples consists of two client applications that connect to the Spring Cloud Config Server. The server uses the configuration
repository in [https://github.com/erecarte/blog-spring-cloud-config-configuration.git](https://github.com/erecarte/blog-spring-cloud-config-configuration.git).

Both clients contain the same endpoints to show how the different configuration for the applications trigger different responses.

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

The reason to have these different endpoints is because it's interesting to see what happens when you hit the `/refresh` endpoints...and looking at
which endpoints return updated configuration and which ones don't.
