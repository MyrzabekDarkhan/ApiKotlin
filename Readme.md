# Api Kotlin
## Стек проекта

- Kotlin
- Postgresql
- Flyway
- Spring


## Запуск
```sh
1.Склонировать проект git clone
2.Нужно будет скачать докер если нету
3.В консоли прописать docker-compose -f docker-compose.yml up -d
4.В консоли прописать gradle bootRun (может зависнуть на 83 процента,нужно просто завершить выполнеине пакетного файла ctrl+c) 
5.Подключить базу данных к idea(если нужно)
6.Запустить проект через idea
```
![подключение к базе](https://i.ibb.co/ZTyM90g/database.gif)


## Запросы
```sh
В постмане можно протестить запросы
1. GET 'localhost:8080/v1/api/tasks' - запрос вернет все таски
2. GET 'localhost:8080/v1/api/tasks/1'' - запрос вернет таск с определенной id
3. POST 'localhost:8080/v1/api/tasks/' \
  в body(JSON)  '{
        "title": "new 2nd task",
        "status": 1,
        "priority": 1,
        "description":"new task created"
    }' - запрос создаст новый таск
4. PUT 'localhost:8080/v1/api/tasks/2' \
    в body(JSON) '{
        "title": "Updated task",
        "status": 1,
        "priority": 1,
        "description":"description of task updated"
    }' - запрос изменит выбранный таск
    
5. DELETE 'localhost:8080/v1/api/tasks/2' - запрос удалит определенный таск 
```