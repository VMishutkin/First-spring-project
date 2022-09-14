package mish.vlad.hw211_spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/store/order")
@RestController
public class StoreController {

    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    public boolean addToOrder(@RequestParam Integer items){
        return storeService.addToOrder(items);
    }

    public Order getOrder(){
        return storeService.getOrder();
    }
}
