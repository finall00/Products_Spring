
# Projeto Spring

Um CRUD de produtos, como o objetivo de treinar 


## Documentação da API

#### Retorna todos os produtos

```
  GET /products
```
 Resposta em json: 

```
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

```
  GET /products/${id}
```
| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `UUID` | **Obrigatório**. O ID do item que você quer |

Resposta em json: 

```
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

Recebe os dados do produto

```
  POST /products/
```
body :
```
{
"name": "exemplo",
"value": 300.90
}
```

| Tipo       | Descrição                                  |
|:--------- | :------------------------------------------ |
|  `Json` | **Obrigatório**. Passar os valores do produto |



#### Atualizar um produto

```
  PUT /products/${id}
```
| Parâmetro   | Tipo       |body| Descrição                                   |
| :---------- | :--------- |:---- |:------------------------------------------ |
| `id`      | `UUID` |   `json`   |**Obrigatório**. O ID do item que você quer alterar |

body :
```
{
"name": "exemplo",
"value": 300.90
}
```

#### Deleta um produto

```
  DELET /products/${id}
```
| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `UUID` | **Obrigatório**. O ID do item que você quer deletar |

