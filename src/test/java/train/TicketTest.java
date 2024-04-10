package train;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TicketTest {

    @Test
    void calcolaPrezzo() {
        Ticket  ticket = new Ticket(50, 100);
        assertEquals(21, ticket.calcolaPrezzo());

        Ticket ticketDiscounted1 = new Ticket(18, 100);
        assertEquals(16.8, ticketDiscounted1.calcolaPrezzo());

        Ticket  ticketDiscounted2 = new Ticket(65, 100);
        assertEquals(12.6, ticketDiscounted2.calcolaPrezzo());

        assertThrows(IllegalArgumentException.class, () -> new Ticket(0, 100));
        assertThrows(IllegalArgumentException.class, () -> new Ticket(100, 0));
    }
}