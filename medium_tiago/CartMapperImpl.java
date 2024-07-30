package com.tiagoamp.shoppingcart.service;

import com.tiagoamp.shoppingcart.controller.ItemDTO;
import com.tiagoamp.shoppingcart.controller.ShoppingCartRequestDTO;
import com.tiagoamp.shoppingcart.controller.ShoppingCartResponseDTO;
import com.tiagoamp.shoppingcart.domain.Cart;
import com.tiagoamp.shoppingcart.domain.Item;
import com.tiagoamp.shoppingcart.domain.ProductOverview;
import com.tiagoamp.shoppingcart.domain.UserInfo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-15T20:16:23+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.16.1 (Oracle Corporation)"
)
@Component
public class CartMapperImpl implements CartMapper {

    @Override
    public Cart toModel(ShoppingCartRequestDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Cart cart = new Cart();

        cart.setUser( shoppingCartRequestDTOToUserInfo( dto ) );
        cart.setItems( toModel( dto.getItems() ) );

        return cart;
    }

    @Override
    public ShoppingCartResponseDTO toResponseDTO(Cart model) {
        if ( model == null ) {
            return null;
        }

        ShoppingCartResponseDTO shoppingCartResponseDTO = new ShoppingCartResponseDTO();

        shoppingCartResponseDTO.setUserId( modelUserId( model ) );
        shoppingCartResponseDTO.setUserName( modelUserName( model ) );
        shoppingCartResponseDTO.setId( model.getId() );
        shoppingCartResponseDTO.setItems( toDTO( model.getItems() ) );
        shoppingCartResponseDTO.setTotalPrice( model.getTotalPrice() );

        return shoppingCartResponseDTO;
    }

    @Override
    public Item toModel(ItemDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Item item = new Item();

        item.setProduct( itemDTOToProductOverview( dto ) );
        item.setQuantity( dto.getQuantity() );

        return item;
    }

    @Override
    public List<Item> toModel(List<ItemDTO> dto) {
        if ( dto == null ) {
            return null;
        }

        List<Item> list = new ArrayList<Item>( dto.size() );
        for ( ItemDTO itemDTO : dto ) {
            list.add( toModel( itemDTO ) );
        }

        return list;
    }

    @Override
    public ItemDTO toDTO(Item model) {
        if ( model == null ) {
            return null;
        }

        ItemDTO itemDTO = new ItemDTO();

        itemDTO.setProductId( modelProductId( model ) );
        itemDTO.setProductName( modelProductName( model ) );
        itemDTO.setQuantity( model.getQuantity() );

        return itemDTO;
    }

    @Override
    public List<ItemDTO> toDTO(List<Item> model) {
        if ( model == null ) {
            return null;
        }

        List<ItemDTO> list = new ArrayList<ItemDTO>( model.size() );
        for ( Item item : model ) {
            list.add( toDTO( item ) );
        }

        return list;
    }

    protected UserInfo shoppingCartRequestDTOToUserInfo(ShoppingCartRequestDTO shoppingCartRequestDTO) {
        if ( shoppingCartRequestDTO == null ) {
            return null;
        }

        UserInfo userInfo = new UserInfo();

        userInfo.setId( shoppingCartRequestDTO.getUserId() );

        return userInfo;
    }

    private Long modelUserId(Cart cart) {
        if ( cart == null ) {
            return null;
        }
        UserInfo user = cart.getUser();
        if ( user == null ) {
            return null;
        }
        Long id = user.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String modelUserName(Cart cart) {
        if ( cart == null ) {
            return null;
        }
        UserInfo user = cart.getUser();
        if ( user == null ) {
            return null;
        }
        String name = user.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    protected ProductOverview itemDTOToProductOverview(ItemDTO itemDTO) {
        if ( itemDTO == null ) {
            return null;
        }

        ProductOverview productOverview = new ProductOverview();

        productOverview.setId( itemDTO.getProductId() );
        productOverview.setName( itemDTO.getProductName() );

        return productOverview;
    }

    private Long modelProductId(Item item) {
        if ( item == null ) {
            return null;
        }
        ProductOverview product = item.getProduct();
        if ( product == null ) {
            return null;
        }
        Long id = product.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String modelProductName(Item item) {
        if ( item == null ) {
            return null;
        }
        ProductOverview product = item.getProduct();
        if ( product == null ) {
            return null;
        }
        String name = product.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }
}
