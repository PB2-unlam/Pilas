package ar.edu.unlam.pb2;

import org.junit.Assert;
import org.junit.Test;

public class PilasTest {

	@Test
	public void TestMedirCarga() {
		Pilas medirCarga = new Pilas(10, 5);
		Integer expected = 100;
		medirCarga.cargar(10);
		Integer actual = medirCarga.medirCarga();
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void TestConsumir() {
		Pilas consumoTest = new Pilas(1, 1); 
		consumoTest.cargar(10);
		consumoTest.consumir(1);
		Integer expected = 9;
		Integer actual = consumoTest.medirCarga();
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void TestCargar() {
		Pilas cargarTest = new Pilas(10, 1);
		cargarTest.cargar(1);
		Integer expected = 10;
		Integer actual = cargarTest.medirCarga();
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void TestMedirConsumoTotal() {
		Pilas consumoTotal = new Pilas(1, 1);
		consumoTotal.cargar(10);
		consumoTotal.consumir(5);
		consumoTotal.consumir(5);
		Integer expected = 10;
		Integer actual = consumoTotal.medirConsumoTotal();
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void TestContarCargasTotales() {
		Pilas cargasTotales = new Pilas(1, 1);
		cargasTotales.cargar(100);
		cargasTotales.consumir(50);
		cargasTotales.cargar(51);
		cargasTotales.cargar(100);
		Integer expected = 3;
		Integer actual = cargasTotales.contarCargasTotales();
		Assert.assertEquals(expected, actual);
	}
	
	

}

//Implementar la clase PilaRecargable con las siguientes operaciones:
//• crearla recibiendo como parámetro de la velocidad de carga [% / minuto] y de consumo [ % / minuto]
//• medirCarga: devolver el nivel de carga [%]
//• consumir: recibe como parámetro el tiempo [minutos]
//• cargar: recibe como parámetro el tiempo [minutos]
//• medirConsumoTotal: devuelve el tiempo [minutos] total de consumos
//• contarCargasTotales: devuelve la cantidad de veces que fue cargada hasta el 100%
//Ejemplifique el uso de la clase, indicando el resultado esperado.