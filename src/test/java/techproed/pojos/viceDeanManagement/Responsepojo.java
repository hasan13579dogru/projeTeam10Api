package techproed.pojos.viceDeanManagement;

import java.io.Serializable;

public class Responsepojo implements Serializable {
	private Objectpojo object;
	private String message;

	public Responsepojo() {
	}

	public Responsepojo(Objectpojo object, String message) {
		this.object = object;
		this.message = message;
	}

	public void setObject(Objectpojo object){
		this.object = object;
	}

	public Objectpojo getObject(){
		return object;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	@Override
 	public String toString(){
		return 
			"Responsepojo{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			"}";
		}
}