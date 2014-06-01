package pl.jagm.playground.bdd;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HelloController {

    private String message = "Hello world!";

    @RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
        model.addAttribute("message", message);
		return "hello";
	}

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String printTest(ModelMap model) {
        model.addAttribute("message", "Test");
        return "hello2";
    }

    @RequestMapping(value = "/transform", method = RequestMethod.POST)
    @ResponseBody
    public String transformMessage(ModelMap model, @RequestParam String message) {
        return new StringBuilder(message).reverse().toString();
    }
}