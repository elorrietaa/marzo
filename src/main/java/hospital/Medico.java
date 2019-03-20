package hospital;

import java.util.Date;

public class Medico extends EmpleadoPlantilla {
	//atributos:
	protected String especialidad;
	protected String servicio;
	protected int numeroConsultorio;
	
	//constructor:
	public Medico(String dni, String nombre, String apellido, Date fechaNac, String direccion, String ciudad,
			float salarioMensual, float porcentajeHoraExtra, String especialidad,String servicio, int numeroConsultorio ) {
		super(dni, nombre, apellido, fechaNac, direccion, ciudad, salarioMensual, porcentajeHoraExtra);
		this.especialidad=especialidad;
		this.servicio=servicio;
		this.numeroConsultorio=numeroConsultorio;
	}

	//get y set
	public String getEspecialidad() {
		return especialidad;
	}

	

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getServicio() {
		return servicio;
	}

	public void setServicio(String servicio) {
		this.servicio = servicio;
	}

	public int getNumeroConsultorio() {
		return numeroConsultorio;
	}

	public void setNumeroConsultorio(int numeroConsultorio) {
		this.numeroConsultorio = numeroConsultorio;
	}
	

	
}
