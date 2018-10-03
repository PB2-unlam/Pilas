package ar.edu.unlam.pb2;

public class Pilas {
	private Integer velocidadDeCarga;
	private Integer velocidadDeConsumo;
	private Integer nivelDeCarga=0;
	private Integer consumoTotal=0;
	private Integer cargasTotales=0;
	
	public Pilas (Integer velocidadDeCarga, Integer velocidadDeConsumo) {
		this.velocidadDeCarga = velocidadDeCarga;
		this.velocidadDeConsumo = velocidadDeConsumo;
	}
	
	public Integer medirCarga() {
		return this.nivelDeCarga;
	}
	
	public void consumir(Integer minutos) {
		if(this.nivelDeCarga-(minutos*velocidadDeConsumo)<0) {
			this.consumoTotal+=this.nivelDeCarga;
		} else {
			this.nivelDeCarga-=(minutos*velocidadDeConsumo);
			this.consumoTotal+=minutos;
		}
		
		if(this.nivelDeCarga<=0) {
			this.nivelDeCarga=0;
		}
	}
	
	public void cargar(Integer minutos) {
		this.nivelDeCarga+=(minutos*velocidadDeCarga);
		if(this.nivelDeCarga>=100) {
			this.nivelDeCarga=100;
			this.cargasTotales+=1;
		}
	}
	
	public Integer medirConsumoTotal() {
		return this.consumoTotal;
	}
	
	public Integer contarCargasTotales() {
		return this.cargasTotales;
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