package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CalcTests {
    @Test
    @DisplayName("1 + 1 == 2")
    void t1() {
        assertThat(Calc.run("1 + 1")).isEqualTo(2);
    }

    @Test
    @DisplayName("2 + 1 == 3")
    void t2() {
        assertThat(Calc.run("2 + 1")).isEqualTo(3);
    }

    @Test
    @DisplayName("2 + 2 == 4")
    void t3() {
        assertThat(Calc.run("2 + 2")).isEqualTo(4);
    }

    @Test
    @DisplayName("1000 + 280 == 1280")
    void t4() {
        assertThat(Calc.run("1000 + 280")).isEqualTo(1280);
    }

    @Test
    @DisplayName("1000 - 280 == 720")
    void t5() {
        assertThat(Calc.run("1000 - 280")).isEqualTo(720);
    }

    @Test
    @DisplayName("10 + 20 + 30 == 60")
    void t7() {
        assertThat(Calc.run("10 + 20 + 30")).isEqualTo(60);
    }
    @Test
    @DisplayName("10 - 20 + 30 == 20")
    void t8() {
        assertThat(Calc.run("10 - 20 + 30")).isEqualTo(20);
    }

    @Test
    @DisplayName("10 - 10 - 10 - 10 + 10 + 10 - 10 == -10")
    void t9() {
        assertThat(Calc.run("10 - 10 - 10 - 10 + 10 + 10 - 10")).isEqualTo(-10);
    }

    @Test
    @DisplayName("10 * 10 * 10 == 1000")
    void t10() {
        assertThat(Calc.run("10 * 10 * 10")).isEqualTo(1000);
    }

}
