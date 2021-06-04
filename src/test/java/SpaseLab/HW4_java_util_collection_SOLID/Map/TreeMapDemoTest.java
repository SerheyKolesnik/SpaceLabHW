package SpaseLab.HW4_java_util_collection_SOLID.Map;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.TreeMap;

public class TreeMapDemoTest extends TestCase {

    @Test
    public void testCreateTestMap() {
        TreeMap<String, String> tmt = TreeMapDemo.createTreeMap();
        assertEquals("CEM II A-S 32.5", tmt.get("000124"));
    }
}