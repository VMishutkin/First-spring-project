package mish.vlad.hw211_spring;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StoreServiceImpl implements StoreService{


    private final List<Integer> items;
    public StoreServiceImpl() {
        this.items = new ArrayList<Integer>();

    }

    @Override
    public boolean addToOrder(Integer... newItems) {
        return items.addAll(Arrays.asList(newItems));

    }

    @Override
    public Order getOrder() {
        return null;
    }
}
