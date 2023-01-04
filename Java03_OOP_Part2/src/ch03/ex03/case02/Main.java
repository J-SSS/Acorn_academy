package ch03.ex03.case02;

import ch03.ex03.case02.Service.ServiceEng;
import ch03.ex03.case02.Service.ServiceKor;
import ch03.ex03.case02.presentation.Io;

public class Main {
	public static void main(String[] args) {
		
		ServiceKor serviceKor = new ServiceKor();
		ServiceEng serviceEng = new ServiceEng();
		
		Io io = new Io(serviceKor);
		io.greet();
		
		io.setService(serviceEng);
		io.greet();
	}
	

}
