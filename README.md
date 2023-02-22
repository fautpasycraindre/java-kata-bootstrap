# java-kata-bootstrap

Java Bootstrap project for kata using Quarkus.

## Usage

- Clone project
- Run test using Quarkus [continuous testing](#continuous-testing)

## Continuous Testing

- Using [Maven](#maven): Using included Maven wrapper, only requires Java 17
- Using [CLI](#cli): Requires Java 17 and Quarkus CLI (see [quarkus cli](#related-guides))
- Running **without** [dev mode](#related-guides) is recommended for most use cases. This can be useful if dev mode
  will
  interfere with your tests (e.g. running wiremock on the same port), or if you only want to develop using tests

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

## Related Guides

- [More on testing](https://quarkus.io/guides/getting-started-testing) (Endpoint, Injection, Mock, Security, ...)
- [Continuous testing guide](https://quarkus.io/guides/continuous-testing)
- Run tests using Cucumber ([guide](https://quarkiverse.github.io/quarkiverse-docs/quarkus-cucumber/dev/index.html))
- [Quarkus CLI](https://quarkus.io/guides/cli-tooling)
- [Quarkus dev mode](https://quarkus.io/guides/dev-mode-differences#dev-mode-features)