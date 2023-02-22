package fr.norsys;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


@QuarkusTest
public class KataTest {

    @Test
    void do_something() {
        Kata kata = new Kata();
        String value = kata.doSomething();
        assertThat(value).isEqualTo("something");
    }

    @Test
    void dummy() {
        assertThat(42).isEqualTo(42);
    }

}