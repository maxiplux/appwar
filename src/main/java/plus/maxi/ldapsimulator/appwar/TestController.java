package plus.maxi.ldapsimulator.appwar;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class TestController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<?> queryByPage() {


        return new ResponseEntity<String>("sOY UN war para was", HttpStatus.OK);
    }

}
