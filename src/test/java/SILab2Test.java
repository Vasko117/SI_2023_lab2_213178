import org.junit.jupiter.api.Test;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    @Test
    void EveryBranchtest(){
        //a-b-u
        RuntimeException e = assertThrows(RuntimeException.class, () -> SILab2.function(null, null));
        assertEquals("Mandatory information missing!", e.getMessage());

        List<User> users = new LinkedList<>();
        users.add(new User("vasil", "!hjgvasiljgh", "Vasko@primer.com"));

        //a-c-e-f-g.1-g.2-h-i-j-k-g.3-l-m-n-u
        assertFalse(SILab2.function(new User("vasil", "!hfgvasilhfgh", "Vasko@primer.com"), users));
        //a-c-d-e-m-o-t-u
        assertFalse(SILab2.function(new User(null, "!dfgdgdg sdw2dw", "vasilpriemrcom"), users));
        //a-c-e-f-g.1-g.2-h-j-g.3-l-m-o-p.1-p.2-q-r-u
        assertTrue(SILab2.function(new User("sergej", "!asdasdasdasdw2dw", "Vase3@primer.com"), users));
        //a-c-e-f-g.1-g.2-h-j-g.3-l-m-o-p.1-p.2-q-p.3-s-t-u
        assertFalse(SILab2.function(new User("sergej", "hfghfghgfh", "vasil@primer.com"), users));
    }

    @Test
    void multipleConditiontest(){
        RuntimeException e;
        //TXX
        e = assertThrows(RuntimeException.class, () -> SILab2.function(new User(null, null, null), null));
        assertEquals("Mandatory information missing!", e.getMessage());
        //FTX
        e = assertThrows(RuntimeException.class, () -> SILab2.function(new User("vasko", null, null), null));
        assertEquals("Mandatory information missing!", e.getMessage());
        //FFT
        e = assertThrows(RuntimeException.class, () -> SILab2.function(new User("vasko", "rwerwrewr!sdo", null), null));
        assertEquals("Mandatory information missing!", e.getMessage());
        //FFF
        e = assertThrows(RuntimeException.class, () -> SILab2.function(new User("vasko", "gdgdfdg!dwa", "vasil@primer.com"), null));
        assertNotEquals("Mandatory information missing!", e.getMessage());
    }
}
