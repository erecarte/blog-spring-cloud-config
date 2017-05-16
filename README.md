# Spring Cloud Config Overview

This is an overview for some of the different backends used by Spring Cloud Config:

- [**Standalone GIT**](standalone-git/): This is the classic Spring Cloud Config configuration where there is a service that takes care of all the configuration
for the different apps and is deployed independently.
- [**Embedded GIT**](embedded-git/): Example of how you can embed the Spring Cloud Config server in your application. This helps from an infrastructure point of view as well as from a resiliency
point of view.
- [**Zookeeper**](zookeeper/): Show how to integrate with [Zookeeper](https://zookeeper.apache.org/) as your configuration source.
- [**Consul**](consul/): Very similar to the previous example, but using [Consul](https://www.consul.io/) instead.
- [**Vault**](vault/): Integrates your application with [Vault](https://www.vaultproject.io/) which is a very good way of managing secrets.
- [**Composite**](composite/): It also provides a sample which uses a few backends at the same time.

### How to run
A `docker-compose.yml` file is provided to make it easier to load up the infrastructure. When running `docker-compose up`
you'll get:

- Zookeeper Exhibitor running on [http://localhost:8400/exhibitor/v1/ui/index.html](http://localhost:8400/exhibitor/v1/ui/index.html).
- Consul running on [http://localhost:8500/](http://localhost:8500/)
- Vault running on [http://localhost:8200/](http://localhost:8200/)
- A nice [Vault UI](https://github.com/djenriquez/vault-ui) running on [http://localhost:8300/](http://localhost:8300/)
- RabbitMQ running on port 5672 to use for automatic updates for the standalone example.

