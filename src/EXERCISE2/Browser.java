package EXERCISE2;

import java.util.ArrayList;

enum Permission{location,camera,microphone};

public class Browser {
	
	public Browser() {
	

	}
	
	public void whoAmI() {
		System.out.println("Iam a Browser");
	}
	
}
class GoogleChrome extends Browser{
	
	private boolean isLocationAccessible,isCameraAccessible , isMicroponeAccessible;
	public static final float versionNo=1.0f;   //Ones initialized cannot be changed(cuz of "final" keyword)

	public GoogleChrome() {
		super();
	}
	
	@Override
	public void whoAmI() {
		System.out.println("Iam GoogleChrome");
	}


	
	//Can be overloaded this WAY   :)
	public void setPermissions(Permission permissionFor,boolean permission) {
		
		switch(permissionFor) {
		case location:
			this.isLocationAccessible=permission;
			break;
		case camera:
			this.isCameraAccessible=permission;
			break;
		case microphone:
			this.isMicroponeAccessible=permission;
			break;
		}				
	}

	public void setPermissions(boolean isLocationAccessible,boolean isCameraAccessible,boolean isMicroponeAccessible) {
		this.isLocationAccessible=isLocationAccessible;
		this.isCameraAccessible=isCameraAccessible;
		this.isMicroponeAccessible=isMicroponeAccessible;
	}
	
	
	public void resetPermissions(Permission permissionFor) {
		switch(permissionFor) {
		case location:
			this.isLocationAccessible=false;
			break;
		case camera:
			this.isCameraAccessible=false;
			break;
		case microphone:
			this.isMicroponeAccessible=false;
			break;
		}	
	}
	
	public void resetPermissions() {
		this.isLocationAccessible=false;
		this.isCameraAccessible=false;
		this.isMicroponeAccessible=false;
	}
	
	
	
	
	
	//Overloading cant be used this way
//	public void setPermissionForLocation(boolean isLocationAccessible) {
//		this.isLocationAccessible=isLocationAccessible;
//	}
//	public void setPermissionForCamera(boolean isCameraAccessible) {
//		this.isCameraAccessible=isCameraAccessible;
//	}
//	public void setPermissionForMicrophone(boolean isMicroponeAccessible) {
//		this.isMicroponeAccessible=isMicroponeAccessible;
//	}
//	public void setPermissions(boolean isLocationAccessible,boolean isCameraAccessible,boolean isMicroponeAccessible ) {
//		this.isLocationAccessible=isLocationAccessible;
//		this.isCameraAccessible=isCameraAccessible;
//		this.isMicroponeAccessible=isMicroponeAccessible;
//	}

//	public void resetPermissionForLocation() {
//		this.isLocationAccessible=false;
//	}
//	public void resetPermissionForCamera() {
//		this.isCameraAccessible=false;
//	}
//	public void resetPermissionForMicrophone() {
//		this.isMicroponeAccessible=false;
//	}
//	public void resetPermissions() {
//		this.isLocationAccessible=false;
//		this.isCameraAccessible=false;
//		this.isMicroponeAccessible=false;
//	}
	
	
}
class Firefox extends Browser implements MultipleAccountContainers{
	ArrayList<String> containers=new ArrayList<String>();
	
	public Firefox() {
		super();
	}
	
	@Override
	public void whoAmI() {
		System.out.println("Iam FireFox");
	}
	
	@Override
	public void addContainer(String container) {
	containers.add(container);	
	}
	@Override
	public void leaveContainer(String container) {
		for(String i:containers) {
			if(i.equals(container)) {
	          containers.remove(i);
			}
		}
	}
}
