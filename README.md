# Spring Cloud Config Overview

This is an overview for some of the different backends used by Spring Cloud Config:

- Standalone GIT:
- Embedded GIT:
- Zookeeper:
- Consul:
- Vault:

It also provides a sample with a composite application which uses all of them at the same time.

### How to run
A `docker-compose.yml` file is provided to make it easier to load up the infrastructure. When running `docker-compose up`
you'll get:

- Zookeeper Exhibitor running on [http://localhost:8400/exhibitor/v1/ui/index.html](http://localhost:8400/exhibitor/v1/ui/index.html).
- Consul running on [http://localhost:8500/](http://localhost:8500/)
- Vault running on [http://localhost:8200/](http://localhost:8200/)
- A nice [Vault UI](https://github.com/djenriquez/vault-ui) running on [http://localhost:8300/](http://localhost:8300/)

