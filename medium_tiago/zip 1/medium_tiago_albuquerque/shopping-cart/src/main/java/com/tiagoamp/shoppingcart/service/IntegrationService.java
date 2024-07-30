package com.tiagoamp.shoppingcart.service;

import com.tiagoamp.shoppingcart.domain.Item;
import com.tiagoamp.shoppingcart.domain.ProductOverview;
import com.tiagoamp.shoppingcart.domain.UserInfo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class IntegrationService {

    private final UserFeignClient userFeignClient;
    private final ProductFeignClient productFeignClient;

    public IntegrationService(UserFeignClient userFeignClient, ProductFeignClient productFeignClient) {
        this.userFeignClient = userFeignClient;
        this.productFeignClient = productFeignClient;
    }

    public UserInfo getRemoteUserInfo(Long userId) {
        log.info("getRemoteUserInfo = userId {}", userId);
        UserInfo user = userFeignClient.findById(userId);
        return user;
    }

    public List<Item> getRemoteProductItemsInfo(List<Item> items) {
        items.forEach(item -> {
            ProductOverview product = productFeignClient.findById(item.getProduct().getId());
            item.setProduct(product);
        });
        log.info("getRemoteProductItemsInfo - get(0) -  {}", items.get(0).getProduct().getId());
        return items;
    }
}