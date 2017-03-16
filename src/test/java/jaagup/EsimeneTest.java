package jaagup;

import org.junit.*;
import static org.junit.Assert.*;

public class EsimeneTest{
	@Test
	public void katse1(){
		assertEquals(3, 2+1);
	}

    @Test
   public void tervituseTest(){
		Rakendus r=new Rakendus();
		assertEquals("Ahoi!", r.tervitusfunktsioon());
	}	

	@Test
	public void keskmiseTest1(){
		Rakendus r=new Rakendus();
		assertEquals("5", r.keskmine("5"));
		assertEquals("6", r.keskmine("6"));
	}
}
