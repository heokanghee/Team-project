package com.shoppingmall.general;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.shoppingmall.item.Category;
import com.shoppingmall.item.Item;
import com.shoppingmall.item.ItemService;
import com.shoppingmall.users.UserService;
import com.shoppingmall.users.Users;

import ch.qos.logback.classic.Logger;

@Component
public class InitDemo {

//    private static final Logger LOG = (Logger) LoggerFactory.getLogger(InitDemo.class);
//
//    private final ItemService itemService;
//    private final UserService userService;
//
//    public InitDemo(ItemService itemService,UserService userService) {
//        this.itemService = itemService;
//        this.userService =userService;
//        setupDemoItems();
//    }

//    public void setupDemoItems() {
//    	LOG.info("Setup demo Items");
//        itemService.save(new Item(39900L, "회색 후드티", "images/shop/hood.jpg","images/shop/detail.jpg",
//                "요즘 인싸들이 입는지는 잘 모르지만, 아무튼 잘팔리는 후드티",
//                (int) 20L, false , Category.상의));
//
//        itemService.save(new Item(29900L, "조거팬츠", "images/shop/jogger.jpg","images/shop/de.jpg",
//                "홍대에 가면 많이보이는 사람들이 즐겨입는 조거팬츠",
//                (int) 20L, true , Category.하의));
//
//    }
//    public void setupDemoUsers() {
//        LOG.info("Setup demo Users");
//        userService.saveUser(new Users("admin" , "admin" , "admin@admin.com" , "test", null));
//        userService.saveUser(new Users("test" , "test" , "test@test.com" , "test", null));
//      
//    }


}
