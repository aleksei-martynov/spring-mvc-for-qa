# Тренинг «Введение в Spring MVC для тестировщиков API и веб-приложений»
15 часов.<br/>
_Рассмотрим разработку REST-приложений на Spring MVC и аспекты автоматизированного тестирования._

# Для кого
- ручные QA Spring REST API
- разработчики автотестов Spring REST API

# На выходе
- участники поймут структуру REST API и API-автотестов
- смогут ускорить разработку автотестов за счет возможностей Spring MVC и компонентов в его составе

# Рабочая кодовая база
```
git clone --depth 1 -b <YYYY-MM-project> https://github.com/eugene-krivosheyev/spring-mvc-for-qa
```

# Программа
## Введение в протокол HTTP и Java EE web-приложения (1/0)
- Задачи и ограничения протокола HTTP
- Методы запросов
- Заголовки
- Статусы ответов
- Параметры и аргументы запросов
- Cookies
- Web-контейнеры
- Структура Java EE web-приложений, веб-компоненты

### Live coding demo
- Демо протокола [HTTP](https://httpbin.org)
- [Демо](https://github.com/eugene-krivosheyev/servletjspdemo) контейнера [Tomcat](http://tomcat.apache.org)
- Сборка и развертывание демо-приложения на web-контейнере
- Отладка запросов и ответов в REST-клиенте (IDEA plugin)

## Введение в Spring container и чем он помогает разработчику (1/.5)
- Управление жизненным циклом компонентов
- Разрешение зависимостей через DI и их контекстная подмена
- Вплетение аспектов в компоненты: Tx, security, async, retry, cache, custom advices
- Виды конфигураций: xml, annotation-driven, groovy, java-based 
- Профили 
- Понятие контекста
- Поддержка в IDEA Ultimate
- Что дает Spring Boot
- Два способа сборки и запуска приложения: Spring MVC и Spring Boot

### Practice Iteration 0
- Анализ Spring CRUD REST API application
- Сборка и запуск
- Анализ запросов и ответов в браузере с помощью Swagger

## Концепция REST API и Spring RESTful Services (3/1)
- Сравнение RPC и REST
- Гайдлайны REST API
- JSON-сериализация данных
- REST-клиенты
- Архитектура MVC и ее редукция для REST API
- Spring MVC для реализации REST API
- Контроллеры
- Отображение данных на JSON

### Live coding demo
- Разработка простого REST-контролллера
- Сборка и развертывание приложения
- Вызовы из REST-клиента

### Practice Iteration 1
- Афиширование Spring CRUD через REST API
- Сборка и запуск
- Анализ запросов и ответов в REST-клиенте

## Автоматизированное тестирование Spring REST API (3/1)
- Структура автоматизированного теста на Spring MVC Test
- Тестовые дублеры для Spring-компонентов
- Тестовые конфигурации и профили
- Тестовые дублеры для внешних веб- и REST-сервисов
- [Чем Spring Boot помогает в тестировании](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-testing)

### Live coding demo
- Разработка полностью автономного модульного теста
- Замещение Spring-компонентов и внешних сервисов
- State-based testing и interaction-based testing
- Запуск тестового набора
- Анализ отчетности

### Practice Iteration 2
- Покрытие _интеграционными_ тестами Spring CRUD через REST API
- Сборка и запуск тестов
- Анализ тестовой отчетности

## Production-ready REST API (3/1)*
- Усложненная JSON-сериализация java-объектов
- Версионирование REST API
- Аутентификация
- Cериализация ошибок
- Документация на Swagger

### Practice Iteration 3
- Рефакторинг приложения до уровня production-ready
- Документирование API на Swagger
- Покрытие интеграционными тестами новых фич REST API
- Сборка и запуск тестов
- Анализ тестовой отчетности

## Микро-сервисная архитектура (3/2)*
- Микро-сервисная архитектура
- Архитектурные шаблоны
- Важность автотестов, сервисных тест-дублёров и документации

### Practice Iteration 4
- Разработка своего микро-сервисного приложения "с нуля" каждой командой
- Интеграция микро-сервисов команд в единое приложение

---

# Reading
- [Valuable Reading List](http://tinyurl.com/skilltrekreadinglist)