package esercizi.DeployEnviromentVar1.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetController {

    @Autowired
    private Environment environment;

    @GetMapping
    public ResponseEntity<String> greetAuthCode(){
        String greet = environment.getProperty("devName") + " " + environment.getProperty("authCode");
        return ResponseEntity.ok(greet);
    }
}
