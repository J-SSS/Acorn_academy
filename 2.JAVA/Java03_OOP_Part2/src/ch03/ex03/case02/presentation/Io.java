package ch03.ex03.case02.presentation;

import ch03.ex03.case02.Service.Service;

public class Io {

		private Service service; // Has-A관계 Io has a Service
		
		public Io(Service service) { // DI
			this.service = service;
		}
		
		public void setService(Service service) {
			this.service = service;
		}
		
		public void greet() {
			System.out.println(service.greet()); //Service로부터 받은 리턴값을 IO가 화면에 출력하는데에 이용
			
		}
}
