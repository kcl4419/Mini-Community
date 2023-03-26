package PIA.MiniCommunity.user.controller;

import PIA.MiniCommunity.user.repository.UserJpaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j//Simple Logging Facad for java 추상 로깅 프레임워크
@Controller //컨트롤러는 model이 업무수행을 완료하면 그 결과를 가지고 화면을 생서하도록 view에 전달
//Contorller는 뷰(화면)return이 목적
//RestController는 뷰없이 API로 @RequestMapping메서드가 @RequestBody 의미를가정하여 data(json,xml)return이 목적
public class UserController {

    private UserJpaRepository user;

    public UserController(UserJpaRepository user) {
        this.user = user;
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}
