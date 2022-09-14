package mish.vlad.hw211_spring;

import java.util.List;

public interface StoreService {

    public String addToOrder(Integer... items);

    public List<Integer> getOrder();
}
