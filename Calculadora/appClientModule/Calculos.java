/**
 * 
 * @Franklin
 */
public class Calculos {
	int valor1;
	int valor2;
//Soma dos valores	
	public int getSoma() {
		return this.valor1 + this.valor2;
	}
	public void setSoma(int valor1, int valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}
//Subtra��o dos valores
	public int getSub() {
		return this.valor1 - this.valor2;
	}
	public void setSub(int valor1, int valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}
//Multiplica��o dos valores
		public int getMult() {
			return this.valor1 * this.valor2;
		}
		public void setMult(int valor1, int valor2) {
			this.valor1 = valor1;
			this.valor2 = valor2;
		}
//Divis�o dos valores
		public float getDiv() {
			return this.valor1 / this.valor2;
		}
		public void setDiv(int valor1, int valor2) {
			this.valor1 = valor1;
			this.valor2 = valor2;
		}		
}
