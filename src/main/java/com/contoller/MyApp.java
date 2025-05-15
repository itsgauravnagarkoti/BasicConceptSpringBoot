package com.contoller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyApp {
	
	@Value("${myapp.name}")
	public String appliactionName;
	

	

	public MyApp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyApp(String appliactionName, String version, String descripition) {
		super();
		this.appliactionName = appliactionName;
		Version = version;
		Descripition = descripition;
	}

	public String getAppliactionName() {
		return appliactionName;
	}

	public void setAppliactionName(String appliactionName) {
		this.appliactionName = appliactionName;
	}

	public String getVersion() {
		return Version;
	}

	public void setVersion(String version) {
		Version = version;
	}

	public String getDescripition() {
		return Descripition;
	}

	public void setDescripition(String descripition) {
		Descripition = descripition;
	}

	@Value("${myapp.version}")
	public String Version;
	
	@Value("${myapp.description}")
	public String Descripition;

	

}
