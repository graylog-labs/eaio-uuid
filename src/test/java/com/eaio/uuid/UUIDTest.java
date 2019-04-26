package com.eaio.uuid;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UUIDTest {
    @Test
    public void newUUID() {
        final UUID uuid = new UUID();

        assertThat(new UUID(uuid.getTime(), uuid.getClockSeqAndNode())).isEqualTo(uuid);
    }

    @Test
    public void nilUUID() {
        assertThat(UUID.nilUUID()).isEqualTo(new UUID(0, 0));
        assertThat(UUID.nilUUID().toString()).isEqualTo("00000000-0000-0000-0000-000000000000");
    }
}