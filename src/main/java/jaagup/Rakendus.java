package jaagup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
public class Rakendus {
    String tervitusfunktsioon() {
        return "Ahoi!";
    }

   public static void main(String[] args) {
      Rakendus r=new Rakendus();
      System.out.println(r.tervitusfunktsioon());   
   }
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/boot3-1.0-SNAPSHOT.jar
