package techproed.pojos.studentManagement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
@JsonIgnoreProperties(ignoreUnknown = true)

public class StudentManagementPojo implements Serializable {
	private ObjectPojo object;
	private String message;

	public StudentManagementPojo() {
	}

	public StudentManagementPojo(ObjectPojo object, String message) {
		this.object = object;
		this.message = message;
	}

	public void setObject(ObjectPojo object){
		this.object = object;
	}

	public ObjectPojo getObject(){
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
			"StudentManagementPojo{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			"}";
		}
}