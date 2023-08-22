package test;

public class Auto {

	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	int cantidadCreados;

	int cantidadAsientos() {
		int cantidad = 0;
		for (int i = 0; i < asientos.length; i++) {
			if (this.asientos[i] != null) {
				cantidad++;
			}
		}
		return cantidad;
	}

	String verificarIntegridad() {
		boolean verificado = false;
		if (this.motor.registro == this.registro) {
			for (int i = 0; i <asientos.length; i++) {
				if (asientos[i] != null) {
					if (asientos[i].registro != this.registro) {
						verificado = true;
						break;
					}
				}
			}
			if (verificado == false) {
				return "Auto original";
			} else {
				return "Las piezas no son originales";
			}
		} else {
			return "Las piezas no son originales";
		}
	}

}
