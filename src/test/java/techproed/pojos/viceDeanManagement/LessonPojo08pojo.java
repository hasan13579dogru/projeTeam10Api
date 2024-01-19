package techproed.pojos.viceDeanManagement;

import java.io.Serializable;

public class LessonPojo08pojo implements Serializable {
	private Objectpojo object;
	private String message;
	private String httpStatus;

	public LessonPojo08pojo() {
	}

	public LessonPojo08pojo(Objectpojo object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
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

	public void setHttpStatus(String httpStatus){
		this.httpStatus = httpStatus;
	}

	public String getHttpStatus(){
		return httpStatus;
	}

	@Override
 	public String toString(){
		return 
			"LessonPojo08pojo{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			",httpStatus = '" + httpStatus + '\'' + 
			"}";
		}
}