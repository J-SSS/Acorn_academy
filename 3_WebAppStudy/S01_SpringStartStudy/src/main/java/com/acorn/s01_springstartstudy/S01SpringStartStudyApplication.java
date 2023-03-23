package com.acorn.s01_springstartstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@Bean : 스프링 컨테이너에서 관리 하는 객체
@SpringBootApplication
public class S01SpringStartStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(S01SpringStartStudyApplication.class, args);
	}
	/*
	실행이 안되는 이유??
	스프링은 컨테이너에서 관리하는 객체를 주입하는 형태로 언어가 작성되는데 이것을 관점지향언어라 부른다
	그런데... spring-mybatis를 라이브러리로 사용하면 db접속을 컨테이너에서 관리한다...
	이때 db접속 내역이 없으면 오류가 뜬다..
	 */

	//sptring boot가 jar로 배포된다!?!?!?!?!?!?!?
	/*
	[war vs jar]

	war는 main이 없음.. 톰캣에게 있고 우리가 작성한 웹앱을 톰캣에게 배포함 => 톰캣이 jvm 실행해서 웹앱을 배포

	main이 있다는 것은 스프링부트가 jar로 배포된다는 뜻인데
	spring boot jar : spring이 jvm을 실행하고 톰캣의 서블릿을 사용 => 스프링 jar를 배포
	 */
}
