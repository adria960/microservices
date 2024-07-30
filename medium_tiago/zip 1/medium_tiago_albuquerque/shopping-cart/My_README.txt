
!!!
We can trigger the MapStruct processing by executing an
 > mvn clean install
This will generate the implementation class under /target/generated-sources/annotations/.

Here is the class that MapStruct auto-creates for us:
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
    ...

https://www.baeldung.com/mapstruct

------------------------ TEST ----------------------------

http://localhost:8083/api/cart
POST
REQUEST
	{
		"userId": 901,
		"items": [
			{
			"productId": 801,
			"quantity":	2
			}
		]
	}
RESPONSE (ResponseEntity.created(URI.create(responseDTO.getId())).body(responseDTO);)
{
    "id": "55e7a1a5-e761-4f9b-a1c3-92db2364346a",
    "userId": 901,
    "userName": "Isaac Newton",
    "items": [
        {
            "productId": 801,
            "productName": "laptop",
            "quantity": 2
        }
    ],
    "totalPrice": 4000.00
}


	log
	-----------
	2023-06-15 22:15:13.876  INFO 12036 --- [nio-8083-exec-4] c.t.s.controller.ShoppingCartController  : START
    2023-06-15 22:15:13.876  INFO 12036 --- [nio-8083-exec-4] c.t.s.service.IntegrationService         : getRemoteUserInfo = userId 901
    2023-06-15 22:15:13.884  INFO 12036 --- [nio-8083-exec-4] c.t.s.service.ShoppingCartService        : 1 purchase - usr Id 901
    2023-06-15 22:15:13.927  INFO 12036 --- [nio-8083-exec-4] c.t.s.service.IntegrationService         : getRemoteProductItemsInfo - get(0) -  801
    2023-06-15 22:15:13.927  INFO 12036 --- [nio-8083-exec-4] c.t.s.service.ShoppingCartService        : 2 purchase = items g=

1.
    Feign Client
    http://localhost:8082/api/user/901
 GET
 RESPONSE:
    {
        "id": 901,
        "name": "Isaac Newton",
        "email": "isaac@newton.com",
        "birthdate": "1643-01-04",
        "address": "gravity street - England"
    }

 2. http://localhost:8081/api/product/801
 GET
 RESPONSE:
 {
     "id": 801,
     "name": "laptop",
     "description": "Super fast laptop",
     "brand": "new brand",
     "price": 2000.00
 }
