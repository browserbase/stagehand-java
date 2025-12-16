// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.proguard

import com.browserbase.api.client.okhttp.StagehandOkHttpClient
import com.browserbase.api.core.jsonMapper
import com.browserbase.api.models.sessions.Action
import com.browserbase.api.models.sessions.SessionExtractResponse
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/stagehand-java-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = StagehandOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.sessions()).isNotNull()
    }

    @Test
    fun actionRoundtrip() {
        val jsonMapper = jsonMapper()
        val action =
            Action.builder()
                .addArgument("string")
                .description("description")
                .method("method")
                .selector("selector")
                .backendNodeId(0L)
                .build()

        val roundtrippedAction =
            jsonMapper.readValue(jsonMapper.writeValueAsString(action), jacksonTypeRef<Action>())

        assertThat(roundtrippedAction).isEqualTo(action)
    }

    @Test
    fun sessionExtractResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val sessionExtractResponse =
            SessionExtractResponse.ofExtraction(
                SessionExtractResponse.Extraction.builder().extraction("extraction").build()
            )

        val roundtrippedSessionExtractResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sessionExtractResponse),
                jacksonTypeRef<SessionExtractResponse>(),
            )

        assertThat(roundtrippedSessionExtractResponse).isEqualTo(sessionExtractResponse)
    }
}
