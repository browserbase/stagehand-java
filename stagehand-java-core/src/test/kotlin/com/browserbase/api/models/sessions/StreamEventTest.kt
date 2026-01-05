// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.JsonValue
import com.browserbase.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StreamEventTest {

    @Test
    fun create() {
        val streamEvent =
            StreamEvent.builder()
                .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                .data(
                    StreamEvent.Data.StreamEventSystemDataOutput.builder()
                        .status(StreamEvent.Data.StreamEventSystemDataOutput.Status.STARTING)
                        .error("error")
                        .result(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .type(StreamEvent.Type.SYSTEM)
                .build()

        assertThat(streamEvent.id()).isEqualTo("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
        assertThat(streamEvent.data())
            .isEqualTo(
                StreamEvent.Data.ofStreamEventSystemDataOutput(
                    StreamEvent.Data.StreamEventSystemDataOutput.builder()
                        .status(StreamEvent.Data.StreamEventSystemDataOutput.Status.STARTING)
                        .error("error")
                        .result(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
            )
        assertThat(streamEvent.type()).isEqualTo(StreamEvent.Type.SYSTEM)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val streamEvent =
            StreamEvent.builder()
                .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                .data(
                    StreamEvent.Data.StreamEventSystemDataOutput.builder()
                        .status(StreamEvent.Data.StreamEventSystemDataOutput.Status.STARTING)
                        .error("error")
                        .result(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .type(StreamEvent.Type.SYSTEM)
                .build()

        val roundtrippedStreamEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(streamEvent),
                jacksonTypeRef<StreamEvent>(),
            )

        assertThat(roundtrippedStreamEvent).isEqualTo(streamEvent)
    }
}
