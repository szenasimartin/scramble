package scramble;

import static org.junit.Assert.*;

import org.junit.Test;

public class ScrambleTest {

	@Test
	public void Scrambletest() {
		Program junit = new Program();
		
		String result = junit.scramble("thing whole important problem");
		assertEquals("tnihg wlohe inatropmt pelborm",result);
		
		String result1 = junit.scramble("On...");
		assertEquals("On...",result1);
		
		String result2 = junit.scramble("I know that.");
		assertEquals("I konw taht.",result2);
		
		String result3 = junit.scramble("I");
		assertEquals("I",result3);
		
		String result4 = junit.scramble("I.");
		assertEquals("I.",result4);
		
		String result5 = junit.scramble("Are ");
		assertEquals("Are",result5);
		
		String result6 = junit.scramble("According to research at Cambridge University, it dosen't matter in what order the letters in a word are, the only important thing is that the first and last letter be at the right place. This is because....");
		assertEquals("Anidroccg to rcraeseh at Cgdirbmae Utisreviny, it d'nesot mettar in waht oedrr the lrettes in a wrod are, the olny inatropmt tnihg is taht the fsrit and lsat letter be at the rhgit pcale. Tihs is bsuacee....",result6);
		
		String result7 = junit.scramble("abcaaddrta");
		assertEquals("atrddaacba",result7);
	}

}
