package com.udea.fsi.domain;

import static org.assertj.core.api.Assertions.assertThat;

public class ReservaAsserts {

    /**
     * Asserts that the entity has all properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertReservaAllPropertiesEquals(Reserva expected, Reserva actual) {
        assertReservaAutoGeneratedPropertiesEquals(expected, actual);
        assertReservaAllUpdatablePropertiesEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all updatable properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertReservaAllUpdatablePropertiesEquals(Reserva expected, Reserva actual) {
        assertReservaUpdatableFieldsEquals(expected, actual);
        assertReservaUpdatableRelationshipsEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all the auto generated properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertReservaAutoGeneratedPropertiesEquals(Reserva expected, Reserva actual) {
        assertThat(actual)
            .as("Verify Reserva auto generated properties")
            .satisfies(a -> assertThat(a.getId()).as("check id").isEqualTo(expected.getId()));
    }

    /**
     * Asserts that the entity has all the updatable fields set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertReservaUpdatableFieldsEquals(Reserva expected, Reserva actual) {
        assertThat(actual)
            .as("Verify Reserva relevant properties")
            .satisfies(a -> assertThat(a.getCodigo()).as("check codigo").isEqualTo(expected.getCodigo()))
            .satisfies(a -> assertThat(a.getFechaReserva()).as("check fechaReserva").isEqualTo(expected.getFechaReserva()))
            .satisfies(a -> assertThat(a.getEstado()).as("check estado").isEqualTo(expected.getEstado()));
    }

    /**
     * Asserts that the entity has all the updatable relationships set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertReservaUpdatableRelationshipsEquals(Reserva expected, Reserva actual) {
        assertThat(actual)
            .as("Verify Reserva relationships")
            .satisfies(a -> assertThat(a.getVuelo()).as("check vuelo").isEqualTo(expected.getVuelo()))
            .satisfies(a -> assertThat(a.getAsiento()).as("check asiento").isEqualTo(expected.getAsiento()))
            .satisfies(a -> assertThat(a.getPasajero()).as("check pasajero").isEqualTo(expected.getPasajero()));
    }
}
