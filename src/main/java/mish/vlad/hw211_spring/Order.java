package mish.vlad.hw211_spring;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
@Component
@SessionScope
public class Order {
    List<Integer> items;

    public Order() {
        this.items = new ArrayList<>();
    }
    public void add(List<Integer> items){
        this.items.addAll(items);
    }
    public List<Integer> get(){
        return items;
    }

}
