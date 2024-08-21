package calculatorsmp;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author oweny
 */
public class OperationsTest {
    
    public OperationsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }    
    
    @Test
    @DisplayName("Verificar que MakeFormula selecciona todos los operadores (+, -, *, /) al menos una vez")
    public void testMakeFormula01() {
        Set<String> operators = new HashSet<>();
        String[] expectedOperators = {"+", "-", "*", "/"};

        // Ejecuta el método MakeFormula múltiples veces para asegurar que todos los operadores son seleccionados
        for (int i = 0; i < 1000; i++) {
            String formula = Operations.MakeFormula();
            for (String op : expectedOperators) {
                if (formula.contains(op)) {
                    operators.add(op);
                }
            }
            // Si ya hemos encontrado todos los operadores, podemos detenernos
            if (operators.size() == 4) {
                break;
            }
        }

        // Verifica que todos los operadores (+, -, *, /) fueron seleccionados
        assertArrayEquals(expectedOperators, operators.toArray(), "No se seleccionaron todos los operadores.");
    }
    
    //@DisplayName("")
    @Test
    public void TCS01() {
        System.out.println("Solve");
        String formula = "";
        String expResult = "";
        String result = Operations.Solve(formula);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

}
