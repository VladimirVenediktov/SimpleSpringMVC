package spitter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rest")
public class RestController {
    TestObject testObject = new TestObject();
    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    TestObject getObjectInJSON() {
        testObject.setName("Vladimir");
        testObject.setSurname("Venediktov");
        return testObject;
    }
}
