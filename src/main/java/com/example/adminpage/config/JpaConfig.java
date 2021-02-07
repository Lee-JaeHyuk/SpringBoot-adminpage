package com.example.adminpage.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration // 설정 파일에 대한 것이 들어갑니다
@EnableJpaAuditing // JPA 감시를 활성화시키겠다.
public class JpaConfig {

}
