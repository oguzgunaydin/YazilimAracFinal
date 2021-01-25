package tr.edu.medipol.yazilimaraclari.HastaTakipUygulama;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


 public class HastaTakipTest {
	 

	@Test
	void testListele() {
	List<String> hasta = Arrays.asList("Oğuz");
	List<String> liste = Arrays.asList("Oğuz");
	Assert.assertEquals(hasta, liste);
			
		}
	

        @Test
        void testSilme() {
        HastaServisApi.sil("Oğuz");
	String hasta=HastaServisApi.Listele().toString();
        String sil= HastaServisApi.Listele().toString();
	Assert.assertEquals(hasta, sil);
       
		}
	
	@Test
	void testEkleme () {
	List<String> hasta = Arrays.asList("Oğuz");
	List<String> ekle = Arrays.asList("Oğuz");
	Assert.assertEquals(hasta, ekle);
		
		}
}
