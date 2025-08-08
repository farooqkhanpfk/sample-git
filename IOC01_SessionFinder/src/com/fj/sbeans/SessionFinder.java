package com.fj.sbeans;

public class SessionFinder {
	private String session;
	
	public SessionFinder() {
		System.out.println("SessionFinder.SessionFinder() 0 ParamConstructor");
		
	}
	
	public void setSession(String session) {
		this.session=session;
		System.out.println("SessionFinder.setSession() SetterMethod");
	}
	
	public String sFinder(String user,int x) {
		
		System.out.println("SessionFinder.sFinder() Method Execution");
		if(x<13) {
			System.out.println("SessionFinder.sFinder() Condition is true");
			if(x<3)
				return "Winter Session: "+user;
			else if(x<6) 
				return "Summer Session: "+user;
			else if(x<9)
				return "Rainy Session: "+user;
			else
				return "Monsoon Session: "+user;
			
		}return "invalid";
	}
}
