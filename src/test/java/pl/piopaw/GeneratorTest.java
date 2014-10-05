package pl.piopaw;

import java.util.Random;

import org.junit.Test;
import org.uncommons.maths.random.ExponentialGenerator;
import org.uncommons.maths.random.GaussianGenerator;

public class GeneratorTest {
	
	@Test
	public void testExponential() {
		int ROZMIAR_PROBY = 10_000_000;
		Random rand = new Random(System.currentTimeMillis());
		double lambda = ((double) 1/60);
		ExponentialGenerator exponentialGenerator = new ExponentialGenerator(lambda, rand);
		
		double sum = 0;
		for(int i=0; i<ROZMIAR_PROBY; i++) {
			sum += exponentialGenerator.nextValue();
		}
		
		System.out.println(sum/ROZMIAR_PROBY);
	}
	
	@Test
	public void testGauss() {
		int ROZMIAR_PROBY = 1000;
		Random rand = new Random(System.currentTimeMillis());
		double mean = 10;
		double standardDeviation = 2;
		GaussianGenerator gaussianGenerator = new GaussianGenerator(mean, standardDeviation, rand);
		
		double sum = 0;
		for(int i=0; i<ROZMIAR_PROBY; i++) {
			sum += gaussianGenerator.nextValue();
		}
		
		System.out.println(sum/ROZMIAR_PROBY);
	}

}
