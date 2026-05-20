// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.BaseDeserializer
import com.browserbase.api.core.BaseSerializer
import com.browserbase.api.core.Enum
import com.browserbase.api.core.ExcludeMissing
import com.browserbase.api.core.JsonField
import com.browserbase.api.core.JsonMissing
import com.browserbase.api.core.JsonValue
import com.browserbase.api.core.allMaxBy
import com.browserbase.api.core.checkRequired
import com.browserbase.api.core.getOrThrow
import com.browserbase.api.core.toImmutable
import com.browserbase.api.errors.StagehandInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ModelConfig
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val modelName: JsonField<String>,
    private val apiKey: JsonField<String>,
    private val baseUrl: JsonField<String>,
    private val googleAuthOptions: JsonField<GoogleAuthOptions>,
    private val headers: JsonField<Headers>,
    private val location: JsonField<String>,
    private val project: JsonField<String>,
    private val provider: JsonField<Provider>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("modelName") @ExcludeMissing modelName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("apiKey") @ExcludeMissing apiKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("baseURL") @ExcludeMissing baseUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("googleAuthOptions")
        @ExcludeMissing
        googleAuthOptions: JsonField<GoogleAuthOptions> = JsonMissing.of(),
        @JsonProperty("headers") @ExcludeMissing headers: JsonField<Headers> = JsonMissing.of(),
        @JsonProperty("location") @ExcludeMissing location: JsonField<String> = JsonMissing.of(),
        @JsonProperty("project") @ExcludeMissing project: JsonField<String> = JsonMissing.of(),
        @JsonProperty("provider") @ExcludeMissing provider: JsonField<Provider> = JsonMissing.of(),
    ) : this(
        modelName,
        apiKey,
        baseUrl,
        googleAuthOptions,
        headers,
        location,
        project,
        provider,
        mutableMapOf(),
    )

    /**
     * Model name string with provider prefix (e.g., 'openai/gpt-5-nano')
     *
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun modelName(): String = modelName.getRequired("modelName")

    /**
     * API key for the model provider
     *
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun apiKey(): Optional<String> = apiKey.getOptional("apiKey")

    /**
     * Base URL for the model provider
     *
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun baseUrl(): Optional<String> = baseUrl.getOptional("baseURL")

    /**
     * google-auth-library options used to authenticate Vertex AI models
     *
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun googleAuthOptions(): Optional<GoogleAuthOptions> =
        googleAuthOptions.getOptional("googleAuthOptions")

    /**
     * Custom headers sent with every request to the model provider
     *
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun headers(): Optional<Headers> = headers.getOptional("headers")

    /**
     * Google Cloud location for Vertex AI models
     *
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun location(): Optional<String> = location.getOptional("location")

    /**
     * Google Cloud project ID for Vertex AI models
     *
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun project(): Optional<String> = project.getOptional("project")

    /**
     * AI provider for the model (or provide a baseURL endpoint instead)
     *
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun provider(): Optional<Provider> = provider.getOptional("provider")

    /**
     * Returns the raw JSON value of [modelName].
     *
     * Unlike [modelName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("modelName") @ExcludeMissing fun _modelName(): JsonField<String> = modelName

    /**
     * Returns the raw JSON value of [apiKey].
     *
     * Unlike [apiKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("apiKey") @ExcludeMissing fun _apiKey(): JsonField<String> = apiKey

    /**
     * Returns the raw JSON value of [baseUrl].
     *
     * Unlike [baseUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("baseURL") @ExcludeMissing fun _baseUrl(): JsonField<String> = baseUrl

    /**
     * Returns the raw JSON value of [googleAuthOptions].
     *
     * Unlike [googleAuthOptions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("googleAuthOptions")
    @ExcludeMissing
    fun _googleAuthOptions(): JsonField<GoogleAuthOptions> = googleAuthOptions

    /**
     * Returns the raw JSON value of [headers].
     *
     * Unlike [headers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("headers") @ExcludeMissing fun _headers(): JsonField<Headers> = headers

    /**
     * Returns the raw JSON value of [location].
     *
     * Unlike [location], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("location") @ExcludeMissing fun _location(): JsonField<String> = location

    /**
     * Returns the raw JSON value of [project].
     *
     * Unlike [project], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("project") @ExcludeMissing fun _project(): JsonField<String> = project

    /**
     * Returns the raw JSON value of [provider].
     *
     * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<Provider> = provider

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ModelConfig].
         *
         * The following fields are required:
         * ```java
         * .modelName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ModelConfig]. */
    class Builder internal constructor() {

        private var modelName: JsonField<String>? = null
        private var apiKey: JsonField<String> = JsonMissing.of()
        private var baseUrl: JsonField<String> = JsonMissing.of()
        private var googleAuthOptions: JsonField<GoogleAuthOptions> = JsonMissing.of()
        private var headers: JsonField<Headers> = JsonMissing.of()
        private var location: JsonField<String> = JsonMissing.of()
        private var project: JsonField<String> = JsonMissing.of()
        private var provider: JsonField<Provider> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(modelConfig: ModelConfig) = apply {
            modelName = modelConfig.modelName
            apiKey = modelConfig.apiKey
            baseUrl = modelConfig.baseUrl
            googleAuthOptions = modelConfig.googleAuthOptions
            headers = modelConfig.headers
            location = modelConfig.location
            project = modelConfig.project
            provider = modelConfig.provider
            additionalProperties = modelConfig.additionalProperties.toMutableMap()
        }

        /** Model name string with provider prefix (e.g., 'openai/gpt-5-nano') */
        fun modelName(modelName: String) = modelName(JsonField.of(modelName))

        /**
         * Sets [Builder.modelName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun modelName(modelName: JsonField<String>) = apply { this.modelName = modelName }

        /** API key for the model provider */
        fun apiKey(apiKey: String) = apiKey(JsonField.of(apiKey))

        /**
         * Sets [Builder.apiKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apiKey] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun apiKey(apiKey: JsonField<String>) = apply { this.apiKey = apiKey }

        /** Base URL for the model provider */
        fun baseUrl(baseUrl: String) = baseUrl(JsonField.of(baseUrl))

        /**
         * Sets [Builder.baseUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.baseUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun baseUrl(baseUrl: JsonField<String>) = apply { this.baseUrl = baseUrl }

        /** google-auth-library options used to authenticate Vertex AI models */
        fun googleAuthOptions(googleAuthOptions: GoogleAuthOptions) =
            googleAuthOptions(JsonField.of(googleAuthOptions))

        /**
         * Sets [Builder.googleAuthOptions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.googleAuthOptions] with a well-typed [GoogleAuthOptions]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun googleAuthOptions(googleAuthOptions: JsonField<GoogleAuthOptions>) = apply {
            this.googleAuthOptions = googleAuthOptions
        }

        /** Custom headers sent with every request to the model provider */
        fun headers(headers: Headers) = headers(JsonField.of(headers))

        /**
         * Sets [Builder.headers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.headers] with a well-typed [Headers] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun headers(headers: JsonField<Headers>) = apply { this.headers = headers }

        /** Google Cloud location for Vertex AI models */
        fun location(location: String) = location(JsonField.of(location))

        /**
         * Sets [Builder.location] to an arbitrary JSON value.
         *
         * You should usually call [Builder.location] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun location(location: JsonField<String>) = apply { this.location = location }

        /** Google Cloud project ID for Vertex AI models */
        fun project(project: String) = project(JsonField.of(project))

        /**
         * Sets [Builder.project] to an arbitrary JSON value.
         *
         * You should usually call [Builder.project] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun project(project: JsonField<String>) = apply { this.project = project }

        /** AI provider for the model (or provide a baseURL endpoint instead) */
        fun provider(provider: Provider) = provider(JsonField.of(provider))

        /**
         * Sets [Builder.provider] to an arbitrary JSON value.
         *
         * You should usually call [Builder.provider] with a well-typed [Provider] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun provider(provider: JsonField<Provider>) = apply { this.provider = provider }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [ModelConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .modelName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ModelConfig =
            ModelConfig(
                checkRequired("modelName", modelName),
                apiKey,
                baseUrl,
                googleAuthOptions,
                headers,
                location,
                project,
                provider,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws StagehandInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): ModelConfig = apply {
        if (validated) {
            return@apply
        }

        modelName()
        apiKey()
        baseUrl()
        googleAuthOptions().ifPresent { it.validate() }
        headers().ifPresent { it.validate() }
        location()
        project()
        provider().ifPresent { it.validate() }
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: StagehandInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (modelName.asKnown().isPresent) 1 else 0) +
            (if (apiKey.asKnown().isPresent) 1 else 0) +
            (if (baseUrl.asKnown().isPresent) 1 else 0) +
            (googleAuthOptions.asKnown().getOrNull()?.validity() ?: 0) +
            (headers.asKnown().getOrNull()?.validity() ?: 0) +
            (if (location.asKnown().isPresent) 1 else 0) +
            (if (project.asKnown().isPresent) 1 else 0) +
            (provider.asKnown().getOrNull()?.validity() ?: 0)

    /** google-auth-library options used to authenticate Vertex AI models */
    class GoogleAuthOptions
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val credentials: JsonField<Credentials>,
        private val projectId: JsonField<String>,
        private val scopes: JsonField<Scopes>,
        private val universeDomain: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("credentials")
            @ExcludeMissing
            credentials: JsonField<Credentials> = JsonMissing.of(),
            @JsonProperty("projectId")
            @ExcludeMissing
            projectId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("scopes") @ExcludeMissing scopes: JsonField<Scopes> = JsonMissing.of(),
            @JsonProperty("universeDomain")
            @ExcludeMissing
            universeDomain: JsonField<String> = JsonMissing.of(),
        ) : this(credentials, projectId, scopes, universeDomain, mutableMapOf())

        /**
         * Google Cloud service account credentials
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun credentials(): Optional<Credentials> = credentials.getOptional("credentials")

        /**
         * Google Cloud project ID used by google-auth-library
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun projectId(): Optional<String> = projectId.getOptional("projectId")

        /**
         * Google auth scopes for the desired API request
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun scopes(): Optional<Scopes> = scopes.getOptional("scopes")

        /**
         * Google Cloud universe domain
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun universeDomain(): Optional<String> = universeDomain.getOptional("universeDomain")

        /**
         * Returns the raw JSON value of [credentials].
         *
         * Unlike [credentials], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("credentials")
        @ExcludeMissing
        fun _credentials(): JsonField<Credentials> = credentials

        /**
         * Returns the raw JSON value of [projectId].
         *
         * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("projectId") @ExcludeMissing fun _projectId(): JsonField<String> = projectId

        /**
         * Returns the raw JSON value of [scopes].
         *
         * Unlike [scopes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("scopes") @ExcludeMissing fun _scopes(): JsonField<Scopes> = scopes

        /**
         * Returns the raw JSON value of [universeDomain].
         *
         * Unlike [universeDomain], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("universeDomain")
        @ExcludeMissing
        fun _universeDomain(): JsonField<String> = universeDomain

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [GoogleAuthOptions]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [GoogleAuthOptions]. */
        class Builder internal constructor() {

            private var credentials: JsonField<Credentials> = JsonMissing.of()
            private var projectId: JsonField<String> = JsonMissing.of()
            private var scopes: JsonField<Scopes> = JsonMissing.of()
            private var universeDomain: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(googleAuthOptions: GoogleAuthOptions) = apply {
                credentials = googleAuthOptions.credentials
                projectId = googleAuthOptions.projectId
                scopes = googleAuthOptions.scopes
                universeDomain = googleAuthOptions.universeDomain
                additionalProperties = googleAuthOptions.additionalProperties.toMutableMap()
            }

            /** Google Cloud service account credentials */
            fun credentials(credentials: Credentials) = credentials(JsonField.of(credentials))

            /**
             * Sets [Builder.credentials] to an arbitrary JSON value.
             *
             * You should usually call [Builder.credentials] with a well-typed [Credentials] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun credentials(credentials: JsonField<Credentials>) = apply {
                this.credentials = credentials
            }

            /** Google Cloud project ID used by google-auth-library */
            fun projectId(projectId: String) = projectId(JsonField.of(projectId))

            /**
             * Sets [Builder.projectId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.projectId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

            /** Google auth scopes for the desired API request */
            fun scopes(scopes: Scopes) = scopes(JsonField.of(scopes))

            /**
             * Sets [Builder.scopes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scopes] with a well-typed [Scopes] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun scopes(scopes: JsonField<Scopes>) = apply { this.scopes = scopes }

            /** Alias for calling [scopes] with `Scopes.ofString(string)`. */
            fun scopes(string: String) = scopes(Scopes.ofString(string))

            /** Alias for calling [scopes] with `Scopes.ofStrings(strings)`. */
            fun scopesOfStrings(strings: List<String>) = scopes(Scopes.ofStrings(strings))

            /** Google Cloud universe domain */
            fun universeDomain(universeDomain: String) =
                universeDomain(JsonField.of(universeDomain))

            /**
             * Sets [Builder.universeDomain] to an arbitrary JSON value.
             *
             * You should usually call [Builder.universeDomain] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun universeDomain(universeDomain: JsonField<String>) = apply {
                this.universeDomain = universeDomain
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [GoogleAuthOptions].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): GoogleAuthOptions =
                GoogleAuthOptions(
                    credentials,
                    projectId,
                    scopes,
                    universeDomain,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws StagehandInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): GoogleAuthOptions = apply {
            if (validated) {
                return@apply
            }

            credentials().ifPresent { it.validate() }
            projectId()
            scopes().ifPresent { it.validate() }
            universeDomain()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: StagehandInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (credentials.asKnown().getOrNull()?.validity() ?: 0) +
                (if (projectId.asKnown().isPresent) 1 else 0) +
                (scopes.asKnown().getOrNull()?.validity() ?: 0) +
                (if (universeDomain.asKnown().isPresent) 1 else 0)

        /** Google Cloud service account credentials */
        class Credentials
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val clientEmail: JsonField<String>,
            private val privateKey: JsonField<String>,
            private val authProviderX509CertUrl: JsonField<String>,
            private val authUri: JsonField<String>,
            private val clientId: JsonField<String>,
            private val clientX509CertUrl: JsonField<String>,
            private val privateKeyId: JsonField<String>,
            private val projectId: JsonField<String>,
            private val tokenUri: JsonField<String>,
            private val type: JsonField<Type>,
            private val universeDomain: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("client_email")
                @ExcludeMissing
                clientEmail: JsonField<String> = JsonMissing.of(),
                @JsonProperty("private_key")
                @ExcludeMissing
                privateKey: JsonField<String> = JsonMissing.of(),
                @JsonProperty("auth_provider_x509_cert_url")
                @ExcludeMissing
                authProviderX509CertUrl: JsonField<String> = JsonMissing.of(),
                @JsonProperty("auth_uri")
                @ExcludeMissing
                authUri: JsonField<String> = JsonMissing.of(),
                @JsonProperty("client_id")
                @ExcludeMissing
                clientId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("client_x509_cert_url")
                @ExcludeMissing
                clientX509CertUrl: JsonField<String> = JsonMissing.of(),
                @JsonProperty("private_key_id")
                @ExcludeMissing
                privateKeyId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("project_id")
                @ExcludeMissing
                projectId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("token_uri")
                @ExcludeMissing
                tokenUri: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("universe_domain")
                @ExcludeMissing
                universeDomain: JsonField<String> = JsonMissing.of(),
            ) : this(
                clientEmail,
                privateKey,
                authProviderX509CertUrl,
                authUri,
                clientId,
                clientX509CertUrl,
                privateKeyId,
                projectId,
                tokenUri,
                type,
                universeDomain,
                mutableMapOf(),
            )

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun clientEmail(): String = clientEmail.getRequired("client_email")

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun privateKey(): String = privateKey.getRequired("private_key")

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun authProviderX509CertUrl(): Optional<String> =
                authProviderX509CertUrl.getOptional("auth_provider_x509_cert_url")

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun authUri(): Optional<String> = authUri.getOptional("auth_uri")

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun clientId(): Optional<String> = clientId.getOptional("client_id")

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun clientX509CertUrl(): Optional<String> =
                clientX509CertUrl.getOptional("client_x509_cert_url")

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun privateKeyId(): Optional<String> = privateKeyId.getOptional("private_key_id")

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun projectId(): Optional<String> = projectId.getOptional("project_id")

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun tokenUri(): Optional<String> = tokenUri.getOptional("token_uri")

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = type.getOptional("type")

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun universeDomain(): Optional<String> = universeDomain.getOptional("universe_domain")

            /**
             * Returns the raw JSON value of [clientEmail].
             *
             * Unlike [clientEmail], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("client_email")
            @ExcludeMissing
            fun _clientEmail(): JsonField<String> = clientEmail

            /**
             * Returns the raw JSON value of [privateKey].
             *
             * Unlike [privateKey], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("private_key")
            @ExcludeMissing
            fun _privateKey(): JsonField<String> = privateKey

            /**
             * Returns the raw JSON value of [authProviderX509CertUrl].
             *
             * Unlike [authProviderX509CertUrl], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("auth_provider_x509_cert_url")
            @ExcludeMissing
            fun _authProviderX509CertUrl(): JsonField<String> = authProviderX509CertUrl

            /**
             * Returns the raw JSON value of [authUri].
             *
             * Unlike [authUri], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("auth_uri") @ExcludeMissing fun _authUri(): JsonField<String> = authUri

            /**
             * Returns the raw JSON value of [clientId].
             *
             * Unlike [clientId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("client_id") @ExcludeMissing fun _clientId(): JsonField<String> = clientId

            /**
             * Returns the raw JSON value of [clientX509CertUrl].
             *
             * Unlike [clientX509CertUrl], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("client_x509_cert_url")
            @ExcludeMissing
            fun _clientX509CertUrl(): JsonField<String> = clientX509CertUrl

            /**
             * Returns the raw JSON value of [privateKeyId].
             *
             * Unlike [privateKeyId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("private_key_id")
            @ExcludeMissing
            fun _privateKeyId(): JsonField<String> = privateKeyId

            /**
             * Returns the raw JSON value of [projectId].
             *
             * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("project_id")
            @ExcludeMissing
            fun _projectId(): JsonField<String> = projectId

            /**
             * Returns the raw JSON value of [tokenUri].
             *
             * Unlike [tokenUri], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("token_uri") @ExcludeMissing fun _tokenUri(): JsonField<String> = tokenUri

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [universeDomain].
             *
             * Unlike [universeDomain], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("universe_domain")
            @ExcludeMissing
            fun _universeDomain(): JsonField<String> = universeDomain

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Credentials].
                 *
                 * The following fields are required:
                 * ```java
                 * .clientEmail()
                 * .privateKey()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Credentials]. */
            class Builder internal constructor() {

                private var clientEmail: JsonField<String>? = null
                private var privateKey: JsonField<String>? = null
                private var authProviderX509CertUrl: JsonField<String> = JsonMissing.of()
                private var authUri: JsonField<String> = JsonMissing.of()
                private var clientId: JsonField<String> = JsonMissing.of()
                private var clientX509CertUrl: JsonField<String> = JsonMissing.of()
                private var privateKeyId: JsonField<String> = JsonMissing.of()
                private var projectId: JsonField<String> = JsonMissing.of()
                private var tokenUri: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var universeDomain: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(credentials: Credentials) = apply {
                    clientEmail = credentials.clientEmail
                    privateKey = credentials.privateKey
                    authProviderX509CertUrl = credentials.authProviderX509CertUrl
                    authUri = credentials.authUri
                    clientId = credentials.clientId
                    clientX509CertUrl = credentials.clientX509CertUrl
                    privateKeyId = credentials.privateKeyId
                    projectId = credentials.projectId
                    tokenUri = credentials.tokenUri
                    type = credentials.type
                    universeDomain = credentials.universeDomain
                    additionalProperties = credentials.additionalProperties.toMutableMap()
                }

                fun clientEmail(clientEmail: String) = clientEmail(JsonField.of(clientEmail))

                /**
                 * Sets [Builder.clientEmail] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.clientEmail] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun clientEmail(clientEmail: JsonField<String>) = apply {
                    this.clientEmail = clientEmail
                }

                fun privateKey(privateKey: String) = privateKey(JsonField.of(privateKey))

                /**
                 * Sets [Builder.privateKey] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.privateKey] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun privateKey(privateKey: JsonField<String>) = apply {
                    this.privateKey = privateKey
                }

                fun authProviderX509CertUrl(authProviderX509CertUrl: String) =
                    authProviderX509CertUrl(JsonField.of(authProviderX509CertUrl))

                /**
                 * Sets [Builder.authProviderX509CertUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.authProviderX509CertUrl] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun authProviderX509CertUrl(authProviderX509CertUrl: JsonField<String>) = apply {
                    this.authProviderX509CertUrl = authProviderX509CertUrl
                }

                fun authUri(authUri: String) = authUri(JsonField.of(authUri))

                /**
                 * Sets [Builder.authUri] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.authUri] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun authUri(authUri: JsonField<String>) = apply { this.authUri = authUri }

                fun clientId(clientId: String) = clientId(JsonField.of(clientId))

                /**
                 * Sets [Builder.clientId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.clientId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun clientId(clientId: JsonField<String>) = apply { this.clientId = clientId }

                fun clientX509CertUrl(clientX509CertUrl: String) =
                    clientX509CertUrl(JsonField.of(clientX509CertUrl))

                /**
                 * Sets [Builder.clientX509CertUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.clientX509CertUrl] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun clientX509CertUrl(clientX509CertUrl: JsonField<String>) = apply {
                    this.clientX509CertUrl = clientX509CertUrl
                }

                fun privateKeyId(privateKeyId: String) = privateKeyId(JsonField.of(privateKeyId))

                /**
                 * Sets [Builder.privateKeyId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.privateKeyId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun privateKeyId(privateKeyId: JsonField<String>) = apply {
                    this.privateKeyId = privateKeyId
                }

                fun projectId(projectId: String) = projectId(JsonField.of(projectId))

                /**
                 * Sets [Builder.projectId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.projectId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

                fun tokenUri(tokenUri: String) = tokenUri(JsonField.of(tokenUri))

                /**
                 * Sets [Builder.tokenUri] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tokenUri] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tokenUri(tokenUri: JsonField<String>) = apply { this.tokenUri = tokenUri }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun universeDomain(universeDomain: String) =
                    universeDomain(JsonField.of(universeDomain))

                /**
                 * Sets [Builder.universeDomain] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.universeDomain] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun universeDomain(universeDomain: JsonField<String>) = apply {
                    this.universeDomain = universeDomain
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Credentials].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .clientEmail()
                 * .privateKey()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Credentials =
                    Credentials(
                        checkRequired("clientEmail", clientEmail),
                        checkRequired("privateKey", privateKey),
                        authProviderX509CertUrl,
                        authUri,
                        clientId,
                        clientX509CertUrl,
                        privateKeyId,
                        projectId,
                        tokenUri,
                        type,
                        universeDomain,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws StagehandInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Credentials = apply {
                if (validated) {
                    return@apply
                }

                clientEmail()
                privateKey()
                authProviderX509CertUrl()
                authUri()
                clientId()
                clientX509CertUrl()
                privateKeyId()
                projectId()
                tokenUri()
                type().ifPresent { it.validate() }
                universeDomain()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: StagehandInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (clientEmail.asKnown().isPresent) 1 else 0) +
                    (if (privateKey.asKnown().isPresent) 1 else 0) +
                    (if (authProviderX509CertUrl.asKnown().isPresent) 1 else 0) +
                    (if (authUri.asKnown().isPresent) 1 else 0) +
                    (if (clientId.asKnown().isPresent) 1 else 0) +
                    (if (clientX509CertUrl.asKnown().isPresent) 1 else 0) +
                    (if (privateKeyId.asKnown().isPresent) 1 else 0) +
                    (if (projectId.asKnown().isPresent) 1 else 0) +
                    (if (tokenUri.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (universeDomain.asKnown().isPresent) 1 else 0)

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val SERVICE_ACCOUNT = of("service_account")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    SERVICE_ACCOUNT
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    SERVICE_ACCOUNT,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        SERVICE_ACCOUNT -> Value.SERVICE_ACCOUNT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws StagehandInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        SERVICE_ACCOUNT -> Known.SERVICE_ACCOUNT
                        else -> throw StagehandInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws StagehandInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        StagehandInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws StagehandInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Type = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: StagehandInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Credentials &&
                    clientEmail == other.clientEmail &&
                    privateKey == other.privateKey &&
                    authProviderX509CertUrl == other.authProviderX509CertUrl &&
                    authUri == other.authUri &&
                    clientId == other.clientId &&
                    clientX509CertUrl == other.clientX509CertUrl &&
                    privateKeyId == other.privateKeyId &&
                    projectId == other.projectId &&
                    tokenUri == other.tokenUri &&
                    type == other.type &&
                    universeDomain == other.universeDomain &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    clientEmail,
                    privateKey,
                    authProviderX509CertUrl,
                    authUri,
                    clientId,
                    clientX509CertUrl,
                    privateKeyId,
                    projectId,
                    tokenUri,
                    type,
                    universeDomain,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Credentials{clientEmail=$clientEmail, privateKey=$privateKey, authProviderX509CertUrl=$authProviderX509CertUrl, authUri=$authUri, clientId=$clientId, clientX509CertUrl=$clientX509CertUrl, privateKeyId=$privateKeyId, projectId=$projectId, tokenUri=$tokenUri, type=$type, universeDomain=$universeDomain, additionalProperties=$additionalProperties}"
        }

        /** Google auth scopes for the desired API request */
        @JsonDeserialize(using = Scopes.Deserializer::class)
        @JsonSerialize(using = Scopes.Serializer::class)
        class Scopes
        private constructor(
            private val string: String? = null,
            private val strings: List<String>? = null,
            private val _json: JsonValue? = null,
        ) {

            fun string(): Optional<String> = Optional.ofNullable(string)

            fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

            fun isString(): Boolean = string != null

            fun isStrings(): Boolean = strings != null

            fun asString(): String = string.getOrThrow("string")

            fun asStrings(): List<String> = strings.getOrThrow("strings")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```java
             * import com.browserbase.api.core.JsonValue;
             * import java.util.Optional;
             *
             * Optional<String> result = scopes.accept(new Scopes.Visitor<Optional<String>>() {
             *     @Override
             *     public Optional<String> visitString(String string) {
             *         return Optional.of(string.toString());
             *     }
             *
             *     // ...
             *
             *     @Override
             *     public Optional<String> unknown(JsonValue json) {
             *         // Or inspect the `json`.
             *         return Optional.empty();
             *     }
             * });
             * ```
             *
             * @throws StagehandInvalidDataException if [Visitor.unknown] is not overridden in
             *   [visitor] and the current variant is unknown.
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    string != null -> visitor.visitString(string)
                    strings != null -> visitor.visitStrings(strings)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws StagehandInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Scopes = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitString(string: String) {}

                        override fun visitStrings(strings: List<String>) {}
                    }
                )
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: StagehandInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                accept(
                    object : Visitor<Int> {
                        override fun visitString(string: String) = 1

                        override fun visitStrings(strings: List<String>) = strings.size

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Scopes && string == other.string && strings == other.strings
            }

            override fun hashCode(): Int = Objects.hash(string, strings)

            override fun toString(): String =
                when {
                    string != null -> "Scopes{string=$string}"
                    strings != null -> "Scopes{strings=$strings}"
                    _json != null -> "Scopes{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Scopes")
                }

            companion object {

                @JvmStatic fun ofString(string: String) = Scopes(string = string)

                @JvmStatic
                fun ofStrings(strings: List<String>) = Scopes(strings = strings.toImmutable())
            }

            /**
             * An interface that defines how to map each variant of [Scopes] to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitString(string: String): T

                fun visitStrings(strings: List<String>): T

                /**
                 * Maps an unknown variant of [Scopes] to a value of type [T].
                 *
                 * An instance of [Scopes] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws StagehandInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw StagehandInvalidDataException("Unknown Scopes: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Scopes>(Scopes::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Scopes {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    Scopes(string = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                                    Scopes(strings = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> Scopes(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<Scopes>(Scopes::class) {

                override fun serialize(
                    value: Scopes,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.string != null -> generator.writeObject(value.string)
                        value.strings != null -> generator.writeObject(value.strings)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Scopes")
                    }
                }
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is GoogleAuthOptions &&
                credentials == other.credentials &&
                projectId == other.projectId &&
                scopes == other.scopes &&
                universeDomain == other.universeDomain &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(credentials, projectId, scopes, universeDomain, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "GoogleAuthOptions{credentials=$credentials, projectId=$projectId, scopes=$scopes, universeDomain=$universeDomain, additionalProperties=$additionalProperties}"
    }

    /** Custom headers sent with every request to the model provider */
    class Headers
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Headers]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Headers]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(headers: Headers) = apply {
                additionalProperties = headers.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Headers].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Headers = Headers(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws StagehandInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Headers = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: StagehandInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Headers && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Headers{additionalProperties=$additionalProperties}"
    }

    /** AI provider for the model (or provide a baseURL endpoint instead) */
    class Provider @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val OPENAI = of("openai")

            @JvmField val ANTHROPIC = of("anthropic")

            @JvmField val GOOGLE = of("google")

            @JvmField val MICROSOFT = of("microsoft")

            @JvmField val BEDROCK = of("bedrock")

            @JvmField val VERTEX = of("vertex")

            @JvmStatic fun of(value: String) = Provider(JsonField.of(value))
        }

        /** An enum containing [Provider]'s known values. */
        enum class Known {
            OPENAI,
            ANTHROPIC,
            GOOGLE,
            MICROSOFT,
            BEDROCK,
            VERTEX,
        }

        /**
         * An enum containing [Provider]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Provider] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            OPENAI,
            ANTHROPIC,
            GOOGLE,
            MICROSOFT,
            BEDROCK,
            VERTEX,
            /** An enum member indicating that [Provider] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                OPENAI -> Value.OPENAI
                ANTHROPIC -> Value.ANTHROPIC
                GOOGLE -> Value.GOOGLE
                MICROSOFT -> Value.MICROSOFT
                BEDROCK -> Value.BEDROCK
                VERTEX -> Value.VERTEX
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws StagehandInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                OPENAI -> Known.OPENAI
                ANTHROPIC -> Known.ANTHROPIC
                GOOGLE -> Known.GOOGLE
                MICROSOFT -> Known.MICROSOFT
                BEDROCK -> Known.BEDROCK
                VERTEX -> Known.VERTEX
                else -> throw StagehandInvalidDataException("Unknown Provider: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws StagehandInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                StagehandInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws StagehandInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Provider = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: StagehandInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Provider && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ModelConfig &&
            modelName == other.modelName &&
            apiKey == other.apiKey &&
            baseUrl == other.baseUrl &&
            googleAuthOptions == other.googleAuthOptions &&
            headers == other.headers &&
            location == other.location &&
            project == other.project &&
            provider == other.provider &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            modelName,
            apiKey,
            baseUrl,
            googleAuthOptions,
            headers,
            location,
            project,
            provider,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ModelConfig{modelName=$modelName, apiKey=$apiKey, baseUrl=$baseUrl, googleAuthOptions=$googleAuthOptions, headers=$headers, location=$location, project=$project, provider=$provider, additionalProperties=$additionalProperties}"
}
