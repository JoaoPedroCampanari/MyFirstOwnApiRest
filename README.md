# First Own APi - 2024

## Diagrama de classes


```mermaid
classDiagram
    class Livro {
        -String bookName
        -String categoria
        -Author author
        -String yearPublication
        -String description
    }

    class Author {
        -String nameAutor
        -int age
        -String country
        -String biography
    }

    Livro *-- Author

```
#Exemplo de Json para usar no Swagger UI.

```json
{
  "bookName": "Joao",
  "categoria": "Ação",
  "author": {
    "nameAutor": "Joao",
    "age": 22,
    "country": "Brazil",
    "biography": "Um bom autor"
  },
  "yearPublication": "1999",
  "description": "Um livro de ação"
}

