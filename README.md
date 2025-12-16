# Browserbase Java API Library

<!-- x-release-please-start-version -->

[![Maven Central](https://img.shields.io/maven-central/v/com.browserbase.api/browserbase-java)](https://central.sonatype.com/artifact/com.browserbase.api/browserbase-java/0.0.1)
[![javadoc](https://javadoc.io/badge2/com.browserbase.api/browserbase-java/0.0.1/javadoc.svg)](https://javadoc.io/doc/com.browserbase.api/browserbase-java/0.0.1)

<!-- x-release-please-end -->

The Browserbase Java SDK provides convenient access to the [Browserbase REST API](https://browserbase.com) from applications written in Java.

It is generated with [Stainless](https://www.stainless.com/).

<!-- x-release-please-start-version -->

The REST API documentation can be found on [browserbase.com](https://browserbase.com). Javadocs are available on [javadoc.io](https://javadoc.io/doc/com.browserbase.api/browserbase-java/0.0.1).

<!-- x-release-please-end -->

## Installation

<!-- x-release-please-start-version -->

### Gradle

```kotlin
implementation("com.browserbase.api:browserbase-java:0.0.1")
```

### Maven

```xml
<dependency>
  <groupId>com.browserbase.api</groupId>
  <artifactId>browserbase-java</artifactId>
  <version>0.0.1</version>
</dependency>
```

<!-- x-release-please-end -->

## Requirements

This library requires Java 8 or later.

## Usage

```java
import com.browserbase.api.client.BrowserbaseClient;
import com.browserbase.api.client.okhttp.BrowserbaseOkHttpClient;
import com.browserbase.api.models.sessions.SessionStartParams;
import com.browserbase.api.models.sessions.SessionStartResponse;

// Configures using the `browserbase.stagehandApiKey` and `browserbase.baseUrl` system properties
// Or configures using the `STAGEHAND_API_KEY` and `BROWSERBASE_BASE_URL` environment variables
BrowserbaseClient client = BrowserbaseOkHttpClient.fromEnv();

SessionStartParams params = SessionStartParams.builder()
    .env(SessionStartParams.Env.LOCAL)
    .build();
SessionStartResponse response = client.sessions().start(params);
```

## Client configuration

Configure the client using system properties or environment variables:

```java
import com.browserbase.api.client.BrowserbaseClient;
import com.browserbase.api.client.okhttp.BrowserbaseOkHttpClient;

// Configures using the `browserbase.stagehandApiKey` and `browserbase.baseUrl` system properties
// Or configures using the `STAGEHAND_API_KEY` and `BROWSERBASE_BASE_URL` environment variables
BrowserbaseClient client = BrowserbaseOkHttpClient.fromEnv();
```

Or manually:

```java
import com.browserbase.api.client.BrowserbaseClient;
import com.browserbase.api.client.okhttp.BrowserbaseOkHttpClient;

BrowserbaseClient client = BrowserbaseOkHttpClient.builder()
    .apiKey("My API Key")
    .build();
```

Or using a combination of the two approaches:

```java
import com.browserbase.api.client.BrowserbaseClient;
import com.browserbase.api.client.okhttp.BrowserbaseOkHttpClient;

BrowserbaseClient client = BrowserbaseOkHttpClient.builder()
    // Configures using the `browserbase.stagehandApiKey` and `browserbase.baseUrl` system properties
    // Or configures using the `STAGEHAND_API_KEY` and `BROWSERBASE_BASE_URL` environment variables
    .fromEnv()
    .apiKey("My API Key")
    .build();
```

See this table for the available options:

| Setter    | System property               | Environment variable   | Required | Default value                                |
| --------- | ----------------------------- | ---------------------- | -------- | -------------------------------------------- |
| `apiKey`  | `browserbase.stagehandApiKey` | `STAGEHAND_API_KEY`    | true     | -                                            |
| `baseUrl` | `browserbase.baseUrl`         | `BROWSERBASE_BASE_URL` | true     | `"https://api.stagehand.browserbase.com/v1"` |

System properties take precedence over environment variables.

> [!TIP]
> Don't create more than one client in the same application. Each client has a connection pool and
> thread pools, which are more efficient to share between requests.

### Modifying configuration

To temporarily use a modified client configuration, while reusing the same connection and thread pools, call `withOptions()` on any client or service:

```java
import com.browserbase.api.client.BrowserbaseClient;

BrowserbaseClient clientWithOptions = client.withOptions(optionsBuilder -> {
    optionsBuilder.baseUrl("https://example.com");
    optionsBuilder.maxRetries(42);
});
```

The `withOptions()` method does not affect the original client or service.

## Requests and responses

To send a request to the Browserbase API, build an instance of some `Params` class and pass it to the corresponding client method. When the response is received, it will be deserialized into an instance of a Java class.

For example, `client.sessions().start(...)` should be called with an instance of `SessionStartParams`, and it will return an instance of `SessionStartResponse`.

## Immutability

Each class in the SDK has an associated [builder](https://blogs.oracle.com/javamagazine/post/exploring-joshua-blochs-builder-design-pattern-in-java) or factory method for constructing it.

Each class is [immutable](https://docs.oracle.com/javase/tutorial/essential/concurrency/immutable.html) once constructed. If the class has an associated builder, then it has a `toBuilder()` method, which can be used to convert it back to a builder for making a modified copy.

Because each class is immutable, builder modification will _never_ affect already built class instances.

## Asynchronous execution

The default client is synchronous. To switch to asynchronous execution, call the `async()` method:

```java
import com.browserbase.api.client.BrowserbaseClient;
import com.browserbase.api.client.okhttp.BrowserbaseOkHttpClient;
import com.browserbase.api.models.sessions.SessionStartParams;
import com.browserbase.api.models.sessions.SessionStartResponse;
import java.util.concurrent.CompletableFuture;

// Configures using the `browserbase.stagehandApiKey` and `browserbase.baseUrl` system properties
// Or configures using the `STAGEHAND_API_KEY` and `BROWSERBASE_BASE_URL` environment variables
BrowserbaseClient client = BrowserbaseOkHttpClient.fromEnv();

SessionStartParams params = SessionStartParams.builder()
    .env(SessionStartParams.Env.LOCAL)
    .build();
CompletableFuture<SessionStartResponse> response = client.async().sessions().start(params);
```

Or create an asynchronous client from the beginning:

```java
import com.browserbase.api.client.BrowserbaseClientAsync;
import com.browserbase.api.client.okhttp.BrowserbaseOkHttpClientAsync;
import com.browserbase.api.models.sessions.SessionStartParams;
import com.browserbase.api.models.sessions.SessionStartResponse;
import java.util.concurrent.CompletableFuture;

// Configures using the `browserbase.stagehandApiKey` and `browserbase.baseUrl` system properties
// Or configures using the `STAGEHAND_API_KEY` and `BROWSERBASE_BASE_URL` environment variables
BrowserbaseClientAsync client = BrowserbaseOkHttpClientAsync.fromEnv();

SessionStartParams params = SessionStartParams.builder()
    .env(SessionStartParams.Env.LOCAL)
    .build();
CompletableFuture<SessionStartResponse> response = client.sessions().start(params);
```

The asynchronous client supports the same options as the synchronous one, except most methods return `CompletableFuture`s.

## Raw responses

The SDK defines methods that deserialize responses into instances of Java classes. However, these methods don't provide access to the response headers, status code, or the raw response body.

To access this data, prefix any HTTP method call on a client or service with `withRawResponse()`:

```java
import com.browserbase.api.core.http.Headers;
import com.browserbase.api.core.http.HttpResponseFor;
import com.browserbase.api.models.sessions.SessionStartParams;
import com.browserbase.api.models.sessions.SessionStartResponse;

SessionStartParams params = SessionStartParams.builder()
    .env(SessionStartParams.Env.LOCAL)
    .build();
HttpResponseFor<SessionStartResponse> response = client.sessions().withRawResponse().start(params);

int statusCode = response.statusCode();
Headers headers = response.headers();
```

You can still deserialize the response into an instance of a Java class if needed:

```java
import com.browserbase.api.models.sessions.SessionStartResponse;

SessionStartResponse parsedResponse = response.parse();
```

## Error handling

The SDK throws custom unchecked exception types:

- [`BrowserbaseServiceException`](browserbase-java-core/src/main/kotlin/com/browserbase/api/errors/BrowserbaseServiceException.kt): Base class for HTTP errors. See this table for which exception subclass is thrown for each HTTP status code:

  | Status | Exception                                                                                                                            |
  | ------ | ------------------------------------------------------------------------------------------------------------------------------------ |
  | 400    | [`BadRequestException`](browserbase-java-core/src/main/kotlin/com/browserbase/api/errors/BadRequestException.kt)                     |
  | 401    | [`UnauthorizedException`](browserbase-java-core/src/main/kotlin/com/browserbase/api/errors/UnauthorizedException.kt)                 |
  | 403    | [`PermissionDeniedException`](browserbase-java-core/src/main/kotlin/com/browserbase/api/errors/PermissionDeniedException.kt)         |
  | 404    | [`NotFoundException`](browserbase-java-core/src/main/kotlin/com/browserbase/api/errors/NotFoundException.kt)                         |
  | 422    | [`UnprocessableEntityException`](browserbase-java-core/src/main/kotlin/com/browserbase/api/errors/UnprocessableEntityException.kt)   |
  | 429    | [`RateLimitException`](browserbase-java-core/src/main/kotlin/com/browserbase/api/errors/RateLimitException.kt)                       |
  | 5xx    | [`InternalServerException`](browserbase-java-core/src/main/kotlin/com/browserbase/api/errors/InternalServerException.kt)             |
  | others | [`UnexpectedStatusCodeException`](browserbase-java-core/src/main/kotlin/com/browserbase/api/errors/UnexpectedStatusCodeException.kt) |

- [`BrowserbaseIoException`](browserbase-java-core/src/main/kotlin/com/browserbase/api/errors/BrowserbaseIoException.kt): I/O networking errors.

- [`BrowserbaseRetryableException`](browserbase-java-core/src/main/kotlin/com/browserbase/api/errors/BrowserbaseRetryableException.kt): Generic error indicating a failure that could be retried by the client.

- [`BrowserbaseInvalidDataException`](browserbase-java-core/src/main/kotlin/com/browserbase/api/errors/BrowserbaseInvalidDataException.kt): Failure to interpret successfully parsed data. For example, when accessing a property that's supposed to be required, but the API unexpectedly omitted it from the response.

- [`BrowserbaseException`](browserbase-java-core/src/main/kotlin/com/browserbase/api/errors/BrowserbaseException.kt): Base class for all exceptions. Most errors will result in one of the previously mentioned ones, but completely generic errors may be thrown using the base class.

## Logging

The SDK uses the standard [OkHttp logging interceptor](https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor).

Enable logging by setting the `BROWSERBASE_LOG` environment variable to `info`:

```sh
export BROWSERBASE_LOG=info
```

Or to `debug` for more verbose logging:

```sh
export BROWSERBASE_LOG=debug
```

## ProGuard and R8

Although the SDK uses reflection, it is still usable with [ProGuard](https://github.com/Guardsquare/proguard) and [R8](https://developer.android.com/topic/performance/app-optimization/enable-app-optimization) because `browserbase-java-core` is published with a [configuration file](browserbase-java-core/src/main/resources/META-INF/proguard/browserbase-java-core.pro) containing [keep rules](https://www.guardsquare.com/manual/configuration/usage).

ProGuard and R8 should automatically detect and use the published rules, but you can also manually copy the keep rules if necessary.

## Jackson

The SDK depends on [Jackson](https://github.com/FasterXML/jackson) for JSON serialization/deserialization. It is compatible with version 2.13.4 or higher, but depends on version 2.18.2 by default.

The SDK throws an exception if it detects an incompatible Jackson version at runtime (e.g. if the default version was overridden in your Maven or Gradle config).

If the SDK threw an exception, but you're _certain_ the version is compatible, then disable the version check using the `checkJacksonVersionCompatibility` on [`BrowserbaseOkHttpClient`](browserbase-java-client-okhttp/src/main/kotlin/com/browserbase/api/client/okhttp/BrowserbaseOkHttpClient.kt) or [`BrowserbaseOkHttpClientAsync`](browserbase-java-client-okhttp/src/main/kotlin/com/browserbase/api/client/okhttp/BrowserbaseOkHttpClientAsync.kt).

> [!CAUTION]
> We make no guarantee that the SDK works correctly when the Jackson version check is disabled.

## Network options

### Retries

The SDK automatically retries 2 times by default, with a short exponential backoff between requests.

Only the following error types are retried:

- Connection errors (for example, due to a network connectivity problem)
- 408 Request Timeout
- 409 Conflict
- 429 Rate Limit
- 5xx Internal

The API may also explicitly instruct the SDK to retry or not retry a request.

To set a custom number of retries, configure the client using the `maxRetries` method:

```java
import com.browserbase.api.client.BrowserbaseClient;
import com.browserbase.api.client.okhttp.BrowserbaseOkHttpClient;

BrowserbaseClient client = BrowserbaseOkHttpClient.builder()
    .fromEnv()
    .maxRetries(4)
    .build();
```

### Timeouts

Requests time out after 1 minute by default.

To set a custom timeout, configure the method call using the `timeout` method:

```java
import com.browserbase.api.models.sessions.SessionStartResponse;

SessionStartResponse response = client.sessions().start(
  params, RequestOptions.builder().timeout(Duration.ofSeconds(30)).build()
);
```

Or configure the default for all method calls at the client level:

```java
import com.browserbase.api.client.BrowserbaseClient;
import com.browserbase.api.client.okhttp.BrowserbaseOkHttpClient;
import java.time.Duration;

BrowserbaseClient client = BrowserbaseOkHttpClient.builder()
    .fromEnv()
    .timeout(Duration.ofSeconds(30))
    .build();
```

### Proxies

To route requests through a proxy, configure the client using the `proxy` method:

```java
import com.browserbase.api.client.BrowserbaseClient;
import com.browserbase.api.client.okhttp.BrowserbaseOkHttpClient;
import java.net.InetSocketAddress;
import java.net.Proxy;

BrowserbaseClient client = BrowserbaseOkHttpClient.builder()
    .fromEnv()
    .proxy(new Proxy(
      Proxy.Type.HTTP, new InetSocketAddress(
        "https://example.com", 8080
      )
    ))
    .build();
```

### HTTPS

> [!NOTE]
> Most applications should not call these methods, and instead use the system defaults. The defaults include
> special optimizations that can be lost if the implementations are modified.

To configure how HTTPS connections are secured, configure the client using the `sslSocketFactory`, `trustManager`, and `hostnameVerifier` methods:

```java
import com.browserbase.api.client.BrowserbaseClient;
import com.browserbase.api.client.okhttp.BrowserbaseOkHttpClient;

BrowserbaseClient client = BrowserbaseOkHttpClient.builder()
    .fromEnv()
    // If `sslSocketFactory` is set, then `trustManager` must be set, and vice versa.
    .sslSocketFactory(yourSSLSocketFactory)
    .trustManager(yourTrustManager)
    .hostnameVerifier(yourHostnameVerifier)
    .build();
```

### Environments

The SDK sends requests to the production by default. To send requests to a different environment, configure the client like so:

```java
import com.browserbase.api.client.BrowserbaseClient;
import com.browserbase.api.client.okhttp.BrowserbaseOkHttpClient;

BrowserbaseClient client = BrowserbaseOkHttpClient.builder()
    .fromEnv()
    // Other options include `local`
    .dev()
    .build();
```

### Custom HTTP client

The SDK consists of three artifacts:

- `browserbase-java-core`
  - Contains core SDK logic
  - Does not depend on [OkHttp](https://square.github.io/okhttp)
  - Exposes [`BrowserbaseClient`](browserbase-java-core/src/main/kotlin/com/browserbase/api/client/BrowserbaseClient.kt), [`BrowserbaseClientAsync`](browserbase-java-core/src/main/kotlin/com/browserbase/api/client/BrowserbaseClientAsync.kt), [`BrowserbaseClientImpl`](browserbase-java-core/src/main/kotlin/com/browserbase/api/client/BrowserbaseClientImpl.kt), and [`BrowserbaseClientAsyncImpl`](browserbase-java-core/src/main/kotlin/com/browserbase/api/client/BrowserbaseClientAsyncImpl.kt), all of which can work with any HTTP client
- `browserbase-java-client-okhttp`
  - Depends on [OkHttp](https://square.github.io/okhttp)
  - Exposes [`BrowserbaseOkHttpClient`](browserbase-java-client-okhttp/src/main/kotlin/com/browserbase/api/client/okhttp/BrowserbaseOkHttpClient.kt) and [`BrowserbaseOkHttpClientAsync`](browserbase-java-client-okhttp/src/main/kotlin/com/browserbase/api/client/okhttp/BrowserbaseOkHttpClientAsync.kt), which provide a way to construct [`BrowserbaseClientImpl`](browserbase-java-core/src/main/kotlin/com/browserbase/api/client/BrowserbaseClientImpl.kt) and [`BrowserbaseClientAsyncImpl`](browserbase-java-core/src/main/kotlin/com/browserbase/api/client/BrowserbaseClientAsyncImpl.kt), respectively, using OkHttp
- `browserbase-java`
  - Depends on and exposes the APIs of both `browserbase-java-core` and `browserbase-java-client-okhttp`
  - Does not have its own logic

This structure allows replacing the SDK's default HTTP client without pulling in unnecessary dependencies.

#### Customized [`OkHttpClient`](https://square.github.io/okhttp/3.x/okhttp/okhttp3/OkHttpClient.html)

> [!TIP]
> Try the available [network options](#network-options) before replacing the default client.

To use a customized `OkHttpClient`:

1. Replace your [`browserbase-java` dependency](#installation) with `browserbase-java-core`
2. Copy `browserbase-java-client-okhttp`'s [`OkHttpClient`](browserbase-java-client-okhttp/src/main/kotlin/com/browserbase/api/client/okhttp/OkHttpClient.kt) class into your code and customize it
3. Construct [`BrowserbaseClientImpl`](browserbase-java-core/src/main/kotlin/com/browserbase/api/client/BrowserbaseClientImpl.kt) or [`BrowserbaseClientAsyncImpl`](browserbase-java-core/src/main/kotlin/com/browserbase/api/client/BrowserbaseClientAsyncImpl.kt), similarly to [`BrowserbaseOkHttpClient`](browserbase-java-client-okhttp/src/main/kotlin/com/browserbase/api/client/okhttp/BrowserbaseOkHttpClient.kt) or [`BrowserbaseOkHttpClientAsync`](browserbase-java-client-okhttp/src/main/kotlin/com/browserbase/api/client/okhttp/BrowserbaseOkHttpClientAsync.kt), using your customized client

### Completely custom HTTP client

To use a completely custom HTTP client:

1. Replace your [`browserbase-java` dependency](#installation) with `browserbase-java-core`
2. Write a class that implements the [`HttpClient`](browserbase-java-core/src/main/kotlin/com/browserbase/api/core/http/HttpClient.kt) interface
3. Construct [`BrowserbaseClientImpl`](browserbase-java-core/src/main/kotlin/com/browserbase/api/client/BrowserbaseClientImpl.kt) or [`BrowserbaseClientAsyncImpl`](browserbase-java-core/src/main/kotlin/com/browserbase/api/client/BrowserbaseClientAsyncImpl.kt), similarly to [`BrowserbaseOkHttpClient`](browserbase-java-client-okhttp/src/main/kotlin/com/browserbase/api/client/okhttp/BrowserbaseOkHttpClient.kt) or [`BrowserbaseOkHttpClientAsync`](browserbase-java-client-okhttp/src/main/kotlin/com/browserbase/api/client/okhttp/BrowserbaseOkHttpClientAsync.kt), using your new client class

## Undocumented API functionality

The SDK is typed for convenient usage of the documented API. However, it also supports working with undocumented or not yet supported parts of the API.

### Parameters

To set undocumented parameters, call the `putAdditionalHeader`, `putAdditionalQueryParam`, or `putAdditionalBodyProperty` methods on any `Params` class:

```java
import com.browserbase.api.core.JsonValue;
import com.browserbase.api.models.sessions.SessionStartParams;

SessionStartParams params = SessionStartParams.builder()
    .putAdditionalHeader("Secret-Header", "42")
    .putAdditionalQueryParam("secret_query_param", "42")
    .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
    .build();
```

These can be accessed on the built object later using the `_additionalHeaders()`, `_additionalQueryParams()`, and `_additionalBodyProperties()` methods.

To set undocumented parameters on _nested_ headers, query params, or body classes, call the `putAdditionalProperty` method on the nested class:

```java
import com.browserbase.api.core.JsonValue;
import com.browserbase.api.models.sessions.SessionStartParams;

SessionStartParams params = SessionStartParams.builder()
    .localBrowserLaunchOptions(SessionStartParams.LocalBrowserLaunchOptions.builder()
        .putAdditionalProperty("secretProperty", JsonValue.from("42"))
        .build())
    .build();
```

These properties can be accessed on the nested built object later using the `_additionalProperties()` method.

To set a documented parameter or property to an undocumented or not yet supported _value_, pass a [`JsonValue`](browserbase-java-core/src/main/kotlin/com/browserbase/api/core/Values.kt) object to its setter:

```java
import com.browserbase.api.core.JsonValue;
import com.browserbase.api.models.sessions.SessionStartParams;

SessionStartParams params = SessionStartParams.builder()
    .env(JsonValue.from(42))
    .build();
```

The most straightforward way to create a [`JsonValue`](browserbase-java-core/src/main/kotlin/com/browserbase/api/core/Values.kt) is using its `from(...)` method:

```java
import com.browserbase.api.core.JsonValue;
import java.util.List;
import java.util.Map;

// Create primitive JSON values
JsonValue nullValue = JsonValue.from(null);
JsonValue booleanValue = JsonValue.from(true);
JsonValue numberValue = JsonValue.from(42);
JsonValue stringValue = JsonValue.from("Hello World!");

// Create a JSON array value equivalent to `["Hello", "World"]`
JsonValue arrayValue = JsonValue.from(List.of(
  "Hello", "World"
));

// Create a JSON object value equivalent to `{ "a": 1, "b": 2 }`
JsonValue objectValue = JsonValue.from(Map.of(
  "a", 1,
  "b", 2
));

// Create an arbitrarily nested JSON equivalent to:
// {
//   "a": [1, 2],
//   "b": [3, 4]
// }
JsonValue complexValue = JsonValue.from(Map.of(
  "a", List.of(
    1, 2
  ),
  "b", List.of(
    3, 4
  )
));
```

Normally a `Builder` class's `build` method will throw [`IllegalStateException`](https://docs.oracle.com/javase/8/docs/api/java/lang/IllegalStateException.html) if any required parameter or property is unset.

To forcibly omit a required parameter or property, pass [`JsonMissing`](browserbase-java-core/src/main/kotlin/com/browserbase/api/core/Values.kt):

```java
import com.browserbase.api.core.JsonMissing;
import com.browserbase.api.models.sessions.SessionStartParams;

SessionStartParams params = SessionStartParams.builder()
    .env(JsonMissing.of())
    .build();
```

### Response properties

To access undocumented response properties, call the `_additionalProperties()` method:

```java
import com.browserbase.api.core.JsonValue;
import java.util.Map;

Map<String, JsonValue> additionalProperties = client.sessions().start(params)._additionalProperties();
JsonValue secretPropertyValue = additionalProperties.get("secretProperty");

String result = secretPropertyValue.accept(new JsonValue.Visitor<>() {
    @Override
    public String visitNull() {
        return "It's null!";
    }

    @Override
    public String visitBoolean(boolean value) {
        return "It's a boolean!";
    }

    @Override
    public String visitNumber(Number value) {
        return "It's a number!";
    }

    // Other methods include `visitMissing`, `visitString`, `visitArray`, and `visitObject`
    // The default implementation of each unimplemented method delegates to `visitDefault`, which throws by default, but can also be overridden
});
```

To access a property's raw JSON value, which may be undocumented, call its `_` prefixed method:

```java
import com.browserbase.api.core.JsonField;
import com.browserbase.api.models.sessions.SessionStartParams;
import java.util.Optional;

JsonField<SessionStartParams.Env> env = client.sessions().start(params)._env();

if (env.isMissing()) {
  // The property is absent from the JSON response
} else if (env.isNull()) {
  // The property was set to literal null
} else {
  // Check if value was provided as a string
  // Other methods include `asNumber()`, `asBoolean()`, etc.
  Optional<String> jsonString = env.asString();

  // Try to deserialize into a custom type
  MyClass myObject = env.asUnknown().orElseThrow().convert(MyClass.class);
}
```

### Response validation

In rare cases, the API may return a response that doesn't match the expected type. For example, the SDK may expect a property to contain a `String`, but the API could return something else.

By default, the SDK will not throw an exception in this case. It will throw [`BrowserbaseInvalidDataException`](browserbase-java-core/src/main/kotlin/com/browserbase/api/errors/BrowserbaseInvalidDataException.kt) only if you directly access the property.

If you would prefer to check that the response is completely well-typed upfront, then either call `validate()`:

```java
import com.browserbase.api.models.sessions.SessionStartResponse;

SessionStartResponse response = client.sessions().start(params).validate();
```

Or configure the method call to validate the response using the `responseValidation` method:

```java
import com.browserbase.api.models.sessions.SessionStartResponse;

SessionStartResponse response = client.sessions().start(
  params, RequestOptions.builder().responseValidation(true).build()
);
```

Or configure the default for all method calls at the client level:

```java
import com.browserbase.api.client.BrowserbaseClient;
import com.browserbase.api.client.okhttp.BrowserbaseOkHttpClient;

BrowserbaseClient client = BrowserbaseOkHttpClient.builder()
    .fromEnv()
    .responseValidation(true)
    .build();
```

## FAQ

### Why don't you use plain `enum` classes?

Java `enum` classes are not trivially [forwards compatible](https://www.stainless.com/blog/making-java-enums-forwards-compatible). Using them in the SDK could cause runtime exceptions if the API is updated to respond with a new enum value.

### Why do you represent fields using `JsonField<T>` instead of just plain `T`?

Using `JsonField<T>` enables a few features:

- Allowing usage of [undocumented API functionality](#undocumented-api-functionality)
- Lazily [validating the API response against the expected shape](#response-validation)
- Representing absent vs explicitly null values

### Why don't you use [`data` classes](https://kotlinlang.org/docs/data-classes.html)?

It is not [backwards compatible to add new fields to a data class](https://kotlinlang.org/docs/api-guidelines-backward-compatibility.html#avoid-using-data-classes-in-your-api) and we don't want to introduce a breaking change every time we add a field to a class.

### Why don't you use checked exceptions?

Checked exceptions are widely considered a mistake in the Java programming language. In fact, they were omitted from Kotlin for this reason.

Checked exceptions:

- Are verbose to handle
- Encourage error handling at the wrong level of abstraction, where nothing can be done about the error
- Are tedious to propagate due to the [function coloring problem](https://journal.stuffwithstuff.com/2015/02/01/what-color-is-your-function)
- Don't play well with lambdas (also due to the function coloring problem)

## Semantic versioning

This package generally follows [SemVer](https://semver.org/spec/v2.0.0.html) conventions, though certain backwards-incompatible changes may be released as minor versions:

1. Changes to library internals which are technically public but not intended or documented for external use. _(Please open a GitHub issue to let us know if you are relying on such internals.)_
2. Changes that we do not expect to impact the vast majority of users in practice.

We take backwards-compatibility seriously and work hard to ensure you can rely on a smooth upgrade experience.

We are keen for your feedback; please open an [issue](https://www.github.com/browserbase/stagehand-java/issues) with questions, bugs, or suggestions.
