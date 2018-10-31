package Terminal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TerminalTest {

    @BeforeEach
    void setUp() {
        Terminal t = new Terminal();
        t.setPrice("Молоко", 70);
        t.setPrice("Шампунь", 200);
        t.setPrice("Чипсы", 40);
        t.setPrice("Шоколад", 50);
        t.setPrice("Кола", 89);
    }

    @Test
    void calculate() {

    }
}