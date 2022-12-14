# **๐ป** Shiftworksboot (2022)

***KOSTA FINAL PROJECT - 2์ฐจ / [ํฌํธํด๋ฆฌ์ค](https://docs.google.com/presentation/d/1mwzoWcrF-YmYtobXlks01ZUQAqpD0xYfLgqcOwehdrc/edit?usp=sharing)***

- ์ฐธ์ฌ์ธ์: 4๋ช
- ํ๋ก์ ํธ ๊ธฐ๊ฐ: 221125 - 221201(1์ฃผ)
- ํ๋ก์ ํธ ์ฃผ์ : ๋ ๊ฑฐ์ ํ๋ก์ ํธ([1์ฐจ ํ๋ก์ ํธ](https://github.com/cocobini/shiftworks)) ๋ง์ด๊ทธ๋ ์ด์
- ํ๋ก์ ํธ ๊ฐ์: ๊ธฐ์กด์ SpringFramework(xml ์ค์ ), MyBatis, OracleDB๋ฅผ ํตํด ๊ตฌํํ ํ๋ก์ ํธ๋ฅผ SpringBoot(Java ์ค์ ), JPA(Spring Data JPA, Querydsl), MySQL ๋ฑ์ผ๋ก ์ ํํ์ฌ ์ต์  ๋ํฅ์ ๋ง๊ฒ ์์ , MVC ํจํด์ ํ์ฉํ์ฌ View ์์  ์์ด Controller, Model ๋ก์ง๋ง ๋ณํ ์งํ

## ๋ด๋น์ญํ 

โ ๊ฐ ํ์์ ์ด๋ฆ์ ํด๋ฆญํ๋ฉด ๊ฐ์ธ ๋ฆฌํฌ์งํ ๋ฆฌ๋ก ์ด๋ํฉ๋๋ค. (ํ์ ์ด๋ฆ ใฑ-ใ ์)

### [๐ธ ๊ถํด๋ฆผ](https://github.com/podo9264/shiftworksboot)

- Project Master: ํ๋ก์ ํธ ์ด๊ด, ํ๋ก์ ํธ ์ผ์  ๊ด๋ฆฌ
- ๋ฉ์ ์ (์ฑํ) ๊ธฐ๋ฅ ๊ตฌํ
    - [Controller](https://github.com/cocobini/shiftworksboot/blob/master/src/main/java/org/shiftworksboot/controller/MessengerController.java)
    - [Repository](https://github.com/cocobini/shiftworksboot/blob/master/src/main/java/org/shiftworksboot/repository/ChatRepository.java)

### [๐ฑโโ๏ธ ์ด์งํ](https://github.com/jh1359753/shiftworksboot)

- UI ๋ด๋น: ๋ฉ์ธํ์ด์ง ๋ฐ ์ ์ฒด UI ํํ๋ฆฟ ์ค๊ณ ๋ฐ ๊ตฌํ
- ๋ฉ์ธํ์ด์ง ๋ฐ UI ๊ตฌํ
- ์์๊ด๋ฆฌ ๊ธฐ๋ฅ ๊ตฌํ
    - [Controller](https://github.com/cocobini/shiftworksboot/blob/master/src/main/java/org/shiftworksboot/controller/BookingController.java)
    - [Repository](https://github.com/cocobini/shiftworksboot/blob/master/src/main/java/org/shiftworksboot/repository/BookingRepositoryCustomImpl.java)

### [๐ฑโโ๏ธ ์ด์ฑ๋น](https://github.com/chaebini/shiftworksboot)

- Git ๋ด๋น: Github์ ํตํ ํ์๊ด๋ฆฌ ์ด๊ด
- ๋ก๊ทธ์ธ ๊ธฐ๋ฅ ๊ตฌํ
    - [Controller](https://github.com/cocobini/shiftworksboot/blob/master/src/main/java/org/shiftworksboot/controller/EmployeeController.java)
    - [Repository](https://github.com/cocobini/shiftworksboot/blob/master/src/main/java/org/shiftworksboot/repository/EmployeeRepository.java)
    - [Security](https://github.com/cocobini/shiftworksboot/blob/master/src/main/java/org/shiftworksboot/config/SecurityConfig.java)
- ์๋ฌด๊ด๋ฆฌ ๊ธฐ๋ฅ ๊ตฌํ
    - [Controller](https://github.com/cocobini/shiftworksboot/blob/master/src/main/java/org/shiftworksboot/controller/TaskController.java)
    - [Repository](https://github.com/cocobini/shiftworksboot/blob/master/src/main/java/org/shiftworksboot/repository/TaskRepositoryCustomImpl.java)
- ์ผ์ ๊ด๋ฆฌ ๊ธฐ๋ฅ ๊ตฌํ
    - [Controller](https://github.com/cocobini/shiftworksboot/blob/master/src/main/java/org/shiftworksboot/controller/ScheduleController.java)
    - [Repository](https://github.com/cocobini/shiftworksboot/blob/master/src/main/java/org/shiftworksboot/repository/ScheduleRepositoryCustomImpl.java)
- ์๋ฆผ ๊ธฐ๋ฅ ๊ตฌํ
    - [Repository](https://github.com/cocobini/shiftworksboot/blob/master/src/main/java/org/shiftworksboot/repository/AlarmRepository.java)

### [๐ฑโโ๏ธ ์กฐํ์](https://github.com/brightvvater/shiftworksboot)

- DB ๋ด๋น: ๊ด๊ณํ ๋ฐ์ดํฐ๋ฒ ์ด์ค ์ค๊ณ ๋ฐ ๊ตฌ์ถ, ๊ด๋ฆฌ
- ๊ฒ์ํ ๊ธฐ๋ฅ ๊ตฌํ
    - [Controller(๊ฒ์๊ธ)](https://github.com/cocobini/shiftworksboot/blob/master/src/main/java/org/shiftworksboot/controller/PostController.java)
    - [Controller(๊ฒ์ํ)](https://github.com/cocobini/shiftworksboot/blob/master/src/main/java/org/shiftworksboot/controller/BoardController.java)
    - [Repository](https://github.com/cocobini/shiftworksboot/blob/master/src/main/java/org/shiftworksboot/repository/PostRepositoryCustomImpl.java)
- ๋ฌธ์ํจ ๊ธฐ๋ฅ ๊ตฌํ
    - [Controller](https://github.com/cocobini/shiftworks/blob/master/src/main/java/org/shiftworks/controller/DocumentController.java)
    - [Repository](https://github.com/cocobini/shiftworksboot/blob/master/src/main/java/org/shiftworksboot/repository/ScrapRepository.java)

---

## ๊ฐ๋ฐํ๊ฒฝ

![๊ฐ๋ฐํ๊ฒฝ](/img/readme1.png)

![๊ฐ๋ฐํ๊ฒฝ](/img/readme2.png)

![REST](/img/readme3.png)

![MVC](/img/readme4.png)

---

## ํ๋ก์ ํธ ์งํ ๋ฐฉ์

### ๐ ์ ์์ผ ์คํฌ๋ผ ํ์ฉ

๐ ๋งค์ผ ๊ฐ๋ฐ์ ์์ํ๊ธฐ์ ์์ ์คํฌ๋ผ๋ณด๋ ์์์ 15๋ถ๊ฐ ํ์๋ฅผ ์งํ
๐ ๋ชจ๋  ํ์์ด ์ฐธ์ํด์ผ ํ๋ฉฐ ํ ์ฌ๋์ฉ ์ ์ผ ํ ์ผ, ์ค๋ ์งํํ  ์ผ, ์ด์์ ๋ํด ๊ณต์ 
๐ Jira๋ฅผ ํตํด Issue, Task ๊ด๋ฆฌ

![jira](/img/readme5.png)

### ๐ Git-Flow, Upstream Repository๋ฅผ ํ์ฉํ ํ์๊ด๋ฆฌ(Git/Github ์ฌ์ฉ)

![git](/img/readme6.png)

---

## Sample

![sample](/img/readme7.png)

![sample](/img/readme8.png)

![swagger](/img/swagger.png)

๐๋ ์์ธํ ๋ด์ฉ์ [ํฌํธํด๋ฆฌ์ค](h/img/readme1.pngttps://docs.google.com/presentation/d/1mwzoWcrF-YmYtobXlks01ZUQAqpD0xYfLgqcOwehdrc/edit?usp=sharing)์์ ํ์ธํ์ค ์ ์์ต๋๋ค.
