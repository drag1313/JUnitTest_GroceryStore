package Terminal;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TerminalTest {

    private Terminal t;

    @Test
    public void calculate1() {
        t = new Terminal();
        t.setPrice("Молоко", 70);
        t.setPrice("Шампунь", 200);
        t.setPrice("Чипсы", 40);
        t.setPrice("Шоколад", 50);
        t.setPrice("Кола", 89);
        t.purchase("Молоко");
        t.purchase("Шампунь");
        t.purchase("Чипсы");
        t.purchase("Шоколад");
        t.purchase("Кола");
        t.purchase("Молоко");
        t.purchase("Кола");
        t.purchase("Молоко");
        assertEquals(608, t.calculate());
    }

    @Test
    public void calculste2() {
        t = new Terminal();
        t.setPrice("Молоко", 70);
        t.setPrice("Шампунь", 200);
        t.setPrice("Чипсы", 40);
        t.setPrice("Шоколад", 50);
        t.setPrice("Кола", 89);
        t.purchase("Чипсы");
        t.purchase("Чипсы");
        t.purchase("Чипсы");
        t.purchase("Чипсы");
        t.purchase("Чипсы");
        assertEquals(169, t.calculate());
    }

    @Test
    public void calculate3() {
        t = new Terminal();
        t.setPrice("Молоко", 70);
        t.setPrice("Шампунь", 200);
        t.setPrice("Чипсы", 40);
        t.setPrice("Шоколад", 50);
        t.setPrice("Кола", 89);
        t.purchase("Молоко");
        t.purchase("Шампунь");
        t.purchase("Чипсы");
        t.purchase("Шоколад");
        t.purchase("Кола");
        assertEquals(449, t.calculate());
    }
}