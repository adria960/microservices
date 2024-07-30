

1. STEP

Product service:
GET
localhost:8081/api/product
...

RESPONSE
GET
localhost:8081/api/product/803
Response
...

USER service
localhost:8082/api/user
RESPONSE
[
    {
        "id": 901,
        "name": "Isaac Newton",
        "email": "isaac@newton.com",
        "birthdate": "1643-01-04",
        "address": "gravity street - England"
    },
    {
        "id": 902,
        "name": "Nikola Tesla",
        "email": "nicola@tesla.com",
        "birthdate": "1853-07-10",
        "address": "electric street - England"
    },
    {
        "id": 903,
        "name": "John von Neumann",
        "email": "john@neumann.com",
        "birthdate": "1903-12-28",
        "address": "logic street - EUA"
    },
    {
        "id": 904,
        "name": "Stephen Hawking",
        "email": "stephen@hawking.com",
        "birthdate": "1942-01-08",
        "address": "universe street - England"
    }
]
End of individual test of product and user service!!!


---------------------------------------------------
http://localhost:8081/
RESPONSE
{
  "_links" : {
    "product" : {
      "href" : "http://localhost:8081/product{?page,size,sort}",
      "templated" : true
    },
    "profile" : {
      "href" : "http://localhost:8081/profile"
    }
  }
}

http://localhost:8081/product

{
  "_embedded" : {
    "product" : [ ]
  },
  "_links" : {
    "self" : {
      "href" : "http://localhost:8081/product"
    },
    "profile" : {
      "href" : "http://localhost:8081/profile/product"
    }
  },
  "page" : {
    "size" : 20,
    "totalElements" : 0,
    "totalPages" : 0,
    "number" : 0
  }
}