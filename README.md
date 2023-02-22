# java-kata-bootstrap

Java Bootstrap project for kata using Quarkus.

## Usage

- Clone project
- Run test using Quarkus continuous testing (see [continuous testing](#continuous-testing))

## Continuous Testing

- Using [Maven](#maven): Using included Maven wrapper, only requires Java 17
- Using [CLI](#cli): Requires Java 17 and Quarkus CLI (see [quarkus cli](#quarkus-cli))

### Maven

- Without Dev mode _(recommended)_

```shell script
./mvnw clean quarkus:test
```

- With dev mode

```shell script
./mvnw clean quarkus:dev
```

### CLI

- Without dev mode _(recommended)_

```shell script
quarkus test
```

- With dev mode

```shell script
quarkus dev
```

### Notes

- Running **without** [dev mode](#quarkus-dev-mode) is recommended for most use cases. This can be useful if dev mode
  will
  interfere with your tests (e.g. running wiremock on the same port), or if you only want to develop using tests

## Quarkus Dev mode

The most important features are:

- Live reload
- Dev UI
- Error pages
- Database import scripts
- Dev Services
- Swagger UI
- GraphQL UI
- Health UI
- Mock mailer
- gRPC
- Others

&#8594; https://quarkus.io/guides/dev-mode-differences#dev-mode-features

## Quarkus CLI

The Quarkus CLI is available in several developer-oriented package managers such as:

- JBang - for Linux, macOS and Windows
- SDKMAN! - for Linux and macOS
- Homebrew - for Linux and macOS
- Chocolatey - for Windows
- Scoop - for Windows

&#8594; https://quarkus.io/guides/cli-tooling

## Related Guides

- [More on testing](https://quarkus.io/guides/getting-started-testing) (Endpoint, Injection, Mock, Security, ...)
- [Continuous testing guide](https://quarkus.io/guides/continuous-testing)
- Run tests using Cucumber ([guide](https://quarkiverse.github.io/quarkiverse-docs/quarkus-cucumber/dev/index.html))
