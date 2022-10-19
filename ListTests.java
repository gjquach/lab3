import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
	@Test 
	public void testFilter() {
        List<String> input1 = new ArrayList<>(Arrays.asList("march", "parch", "startch", "book", "Arches"));
        StringChecker sc = new hasArch();
        assertEquals(new ArrayList<>(Arrays.asList("march", "parch", "Arches")), ListExamples.filter(input1, sc));
	}

    @Test
    public void testMerge() {

    }

}
