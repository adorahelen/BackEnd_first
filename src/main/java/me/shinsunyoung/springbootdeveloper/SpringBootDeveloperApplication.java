package me.shinsunyoung.springbootdeveloper;

import org.springframework.boot.SpringApplication; // 깃허브 추가
import org.springframework.boot.autoconfigure.SpringBootApplication; // 깃허브 추가

@SpringBootApplication
public class SpringBootDeveloperApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDeveloperApplication.class, args);
    }
} // 자바의 메인과 같으며, 스프링부트 시작지점
// @어노테이션을 추가하여 스프링 부트에 필요한 기본 설정을 한다.
