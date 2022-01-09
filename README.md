# <img src="images/st.jpg" width="40" height="40">  Проект для SystemTechnologies

<img src="images/st.by.jpg" width="800" height="600"> 

## :gear: Использованы технологии:
| Java | Gradle | Junit5 | Selenide | GitHub | Jenkins | Selenoid | Allure Report | Allure TestOps | Jira | Telegram |
|:----:|:----:|:------:|:------:|:------:|:----:|:----:|:------:|:------:|:------:|:------:|
| <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/Java.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/Gradle.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/JUnit5.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/Selenide.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/Github.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/Jenkins.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/Selenoid.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/Allure_Report.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/AllureTestOps.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/Jira.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/Telegram.png" width="40" height="40"> |

___

## :person_in_tuxedo: Запуск тестов происходит в CI [Jenkins](http://localhost:9090/job/08-Veronika_Monarkhovich-8_SystemTechnologies/)

<img src="images/jenkins.jpg" width="600" height="300"> 

Создаем config.properties:

```bash
src/test/resources/config/config.properties
```
Text File Content:
```bash
webUrl=https://www.st.by
remoteUrl=http://172.17.0.1:4444/wd/hub
```
Запуск тестов:
- в параметре DvideoStorage указываем место для сохранения видео
- в параметре Dbrowser задаем браузер
```bash
clean test -Dbrowser=${BROWSER} -DvideoStorage=http://localhost:8080/video/
```

Генерация отчета:
```bash
allure serve 
```
```bash
build/allure-results
```
___

## :bar_chart: Отчет генерируется в Allure

<img src="images/all.jpg" width="600" height="300">

___

## <img src="images/ato1.jpg" width="20" height="20"> Тестовая документация, сгенерированная в Allure TestOps по итогам прохождения тестов

<img src="images/ato.jpg" width="600" height="300"> 

___
## <img src=https://github.com/VeronikaMonarkhovich/VeronikaMonarkhovich/blob/master/logo/Jira.png width="20" height="20"> Задача в таск-трекере Jira с данными, экспортированными из Allure TestOps

<img src="images/jira.jpg" width="600" height="300"> 
___

## :calling: Уведомления о прохождение тестов отправляются в Telegram

<img src="images/telegram.jpg" width="300" height="600"> 

___

## :movie_camera: Видеотчет теста "Проверка 'Связаться с нами'"

<img src="images/Connect.gif" width="600" height="300"> 