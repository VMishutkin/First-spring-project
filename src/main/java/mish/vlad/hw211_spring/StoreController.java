package mish.vlad.hw211_spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/order")
@RestController
public class StoreController {

    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/add")
    public String addToOrder(@RequestParam("id") Integer[] ids) {

        return storeService.addToOrder(ids);
    }

    @GetMapping("/get")
    public List<Integer> getOrder() {
        return storeService.getOrder();
    }

    @GetMapping
    public String greetings() {
        return "Добро пожаловать в магазин. Воспользуйтесь командами add или get";
    }
}
