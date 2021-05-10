package com.ederfmatos.prepush;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ApplicationTest {

    @Test
    @DisplayName("Deve validar soma")
    void shouldValidateSum() {
        assertEquals(5, 2 + 3);
    }

}
