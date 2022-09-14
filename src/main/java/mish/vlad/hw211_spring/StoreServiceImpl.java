package mish.vlad.hw211_spring;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {
    private final Order cart;

    public StoreServiceImpl() {
        this.cart = new Order();

    }

    @Override
    public String addToOrder(Integer... newItems) {
        cart.add(Arrays.asList(newItems));
        return "Товары " + Arrays.toString(newItems) + " добавлены в корзину";
    }

    @Override
    public List<Integer> getOrder() {
        return cart.get();
    }
}
