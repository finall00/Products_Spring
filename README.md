
# Projeto Spring

Um CRUD de produtos, como o objetivo de treinar 


## Documentação da API

#### Retorna todos os produtos

```http
  GET /products
```
 Resposta em json: 

```http
{
  {
        "idProduct": "4d5242dc-284c-4060-9fcb-7911b76dca55",
        "name": "exemplo",
        "value": 15.20,
        "links": [
            {
                "rel": "Details",
                "href": "http://localhost:8080/products/4d5242dc-284c-4060-9fcb-7911b76dca55"
            }
        ]   
}
```

#### Retorna um produto

```http
  GET /products/${id}
```
| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `UUID` | **Obrigatório**. O ID do item que você quer |

Resposta em json: 

```http
{
    "idProduct": "4d5242dc-284c-4060-9fcb-7911b76dca55",
    "name": "modificado",
    "value": 15.20,
    "_links": {
        "All Products": {
            "href": "http://localhost:8080/products"
        }
    }
}
```




#### Cadastra um produto

Recebe dois números e retorna a sua soma.

```http
  POST /products/
```
body :
```http
{
"name": "exemplo",
"value": 300.90
}
```

| Tipo       | Descrição                                  |
|:--------- | :------------------------------------------ |
|  `Json` | **Obrigatório**. Passar os valores do produto |



#### Atualizar um produto

```http
  PUT /products/${id}
```
| Parâmetro   | Tipo       |body| Descrição                                   |
| :---------- | :--------- |:---- |:------------------------------------------ |
| `id`      | `UUID` |   `json`   |**Obrigatório**. O ID do item que você quer alterar |

body :
```http
{
"name": "exemplo",
"value": 300.90
}
```

#### Deleta um produto

```http
  DELET /products/${id}
```
| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `UUID` | **Obrigatório**. O ID do item que você quer deletar |

