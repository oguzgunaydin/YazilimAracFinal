package tr.edu.medipol.yazilimaraclari.HastaTakipUygulama;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


 public class HastaTakipTest {
	 

	@Test
	void testListele() {
	List<String> hasta = Arrays.asList("Oğuzhan");
	List<String> liste = Arrays.asList("Oğuzhan");
	Assert.assertEquals(hasta, liste);
			
		}
}
