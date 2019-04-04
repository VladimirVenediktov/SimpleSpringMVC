package spitter;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// Объявить как контроллер
public class HomeController {

    @RequestMapping({"/", "/home"})
// Обрабатывать запросы на получение главной страницы
    public String showHomePage(Map<String, Object> model) {
        model.put("name", "user"); //Добавить сообщения в модель
        return "home"; // Вернуть имя представления
    }
}