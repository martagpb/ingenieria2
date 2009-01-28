package aplicacion;

import java.sql.Date;
import java.util.*;




public class Formato_horario {

		private String pista;
		private Date dia_hora;
		private String dni;
		private double importe;
		private int pagado;
		

		
		public Formato_horario(){
			
		}
		
		public Formato_horario(String pista, Date dia_hora, String dni,double importe,int pagado){
			this.pista=pista;
			this.dia_hora=dia_hora;
			this.dni=dni;
			this.importe=importe;
			this.pagado=pagado;
		}

		public String getPista() {
			return pista;
		}
		public void setPista(String pista) {
			this.pista = pista;
		}
		public Date getDia_hora() {
			return dia_hora;
		}
		public void setDia_hora(Date dia_hora) {
			this.dia_hora = dia_hora;
		}
		public String getDni() {
			return dni;
		}
		public void setDni(String dni) {
			this.dni = dni;
		}
		public double getImporte() {
			return importe;
		}
		public void setImporte(double importe) {
			this.importe = importe;
		}
		public int getPagado() {
			return pagado;
		}
		public void setPagado(int pagado) {
			this.pagado = pagado;
		}

		
}
