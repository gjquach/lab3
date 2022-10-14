import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
	@Test 
	public void testFilter() {
        List<String> input1 = new ArrayList<>(Arrays.asList("march", "parch"));
        StringChecker checker = new chChecker();
        assertEquals(new ArrayList<>(Arrays.asList("march", "parch")), ListExamples.filter(input1, checker));
	}

    @Test
    public void testMerge() {

    }

}
