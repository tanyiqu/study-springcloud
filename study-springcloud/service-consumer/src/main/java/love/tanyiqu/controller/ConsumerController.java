package love.tanyiqu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SuppressWarnings("SpringJavaAutowiredFieldsWarningInspection")
@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/web/hello")
    public String hello() {
        // 调用服务
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://127.0.0.1:8080/service/hello", String.class);

        return responseEntity.getBody();
    }
}
