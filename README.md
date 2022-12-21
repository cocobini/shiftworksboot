# **💻** Shiftworksboot (2022)

***KOSTA FINAL PROJECT - 2차 / [포트폴리오](https://docs.google.com/presentation/d/1mwzoWcrF-YmYtobXlks01ZUQAqpD0xYfLgqcOwehdrc/edit?usp=sharing)***

- 참여인원: 4명
- 프로젝트 기간: 221125 - 221201(1주)
- 프로젝트 주제: 레거시 프로젝트([1차 프로젝트](https://github.com/cocobini/shiftworks)) 마이그레이션
- 프로젝트 개요: 기존에 SpringFramework(xml 설정), MyBatis, OracleDB를 통해 구현한 프로젝트를 SpringBoot(Java 설정), JPA(Spring Data JPA, Querydsl), MySQL 등으로 전환하여 최신 동향에 맞게 수정, MVC 패턴을 활용하여 View 수정 없이 Controller, Model 로직만 변환 진행

## 담당역할

✔ 각 팀원의 이름을 클릭하면 개인 리포지토리로 이동합니다. (팀원 이름 ㄱ-ㅎ 순)

### [👸 권해림](https://github.com/podo9264/shiftworksboot)

- Project Master: 프로젝트 총괄, 프로젝트 일정 관리
- 메신저(채팅) 기능 구현
    - [Controller](https://github.com/cocobini/shiftworksboot/blob/master/src/main/java/org/shiftworksboot/controller/MessengerController.java)
    - [Repository](https://github.com/cocobini/shiftworksboot/blob/master/src/main/java/org/shiftworksboot/repository/ChatRepository.java)

### [👱‍♀️ 이지현](https://github.com/jh1359753/shiftworksboot)

- UI 담당: 메인페이지 및 전체 UI 템플릿 설계 및 구현
- 메인페이지 및 UI 구현
- 자원관리 기능 구현
    - [Controller](https://github.com/cocobini/shiftworksboot/blob/master/src/main/java/org/shiftworksboot/controller/BookingController.java)
    - [Repository](https://github.com/cocobini/shiftworksboot/blob/master/src/main/java/org/shiftworksboot/repository/BookingRepositoryCustomImpl.java)

### [👱‍♀️ 이채빈](https://github.com/chaebini/shiftworksboot)

- Git 담당: Github을 통한 형상관리 총괄
- 로그인 기능 구현
    - [Controller](https://github.com/cocobini/shiftworksboot/blob/master/src/main/java/org/shiftworksboot/controller/EmployeeController.java)
    - [Repository](https://github.com/cocobini/shiftworksboot/blob/master/src/main/java/org/shiftworksboot/repository/EmployeeRepository.java)
    - [Security](https://github.com/cocobini/shiftworksboot/blob/master/src/main/java/org/shiftworksboot/config/SecurityConfig.java)
- 업무관리 기능 구현
    - [Controller](https://github.com/cocobini/shiftworksboot/blob/master/src/main/java/org/shiftworksboot/controller/TaskController.java)
    - [Repository](https://github.com/cocobini/shiftworksboot/blob/master/src/main/java/org/shiftworksboot/repository/TaskRepositoryCustomImpl.java)
- 일정관리 기능 구현
    - [Controller](https://github.com/cocobini/shiftworksboot/blob/master/src/main/java/org/shiftworksboot/controller/ScheduleController.java)
    - [Repository](https://github.com/cocobini/shiftworksboot/blob/master/src/main/java/org/shiftworksboot/repository/ScheduleRepositoryCustomImpl.java)
- 알림 기능 구현
    - [Repository](https://github.com/cocobini/shiftworksboot/blob/master/src/main/java/org/shiftworksboot/repository/AlarmRepository.java)

### [👱‍♀️ 조현수](https://github.com/brightvvater/shiftworksboot)

- DB 담당: 관계형 데이터베이스 설계 및 구축, 관리
- 게시판 기능 구현
    - [Controller(게시글)](https://github.com/cocobini/shiftworksboot/blob/master/src/main/java/org/shiftworksboot/controller/PostController.java)
    - [Controller(게시판)](https://github.com/cocobini/shiftworksboot/blob/master/src/main/java/org/shiftworksboot/controller/BoardController.java)
    - [Repository](https://github.com/cocobini/shiftworksboot/blob/master/src/main/java/org/shiftworksboot/repository/PostRepositoryCustomImpl.java)
- 문서함 기능 구현
    - [Controller](https://github.com/cocobini/shiftworks/blob/master/src/main/java/org/shiftworks/controller/DocumentController.java)
    - [Repository](https://github.com/cocobini/shiftworksboot/blob/master/src/main/java/org/shiftworksboot/repository/ScrapRepository.java)

---

## 개발환경

![개발환경](/img/readme1.png)

![개발환경](/img/readme2.png)

![REST](/img/readme3.png)

![MVC](/img/readme4.png)

---

## 프로젝트 진행 방식

### 🕐 애자일 스크럼 활용

👉 매일 개발을 시작하기에 앞서 스크럼보드 앞에서 15분간 회의를 진행
👉 모든 팀원이 참석해야 하며 한 사람씩 전일 한 일, 오늘 진행할 일, 이슈에 대해 공유
👉 Jira를 통해 Issue, Task 관리

![jira](/img/readme5.png)

### 🕑 Git-Flow, Upstream Repository를 활용한 형상관리(Git/Github 사용)

![git](/img/readme6.png)

---

## Sample

![sample](/img/readme7.png)

![sample](/img/readme8.png)

![swagger](/img/swagger.png)

🎞더 자세한 내용은 [포트폴리오](h/img/readme1.pngttps://docs.google.com/presentation/d/1mwzoWcrF-YmYtobXlks01ZUQAqpD0xYfLgqcOwehdrc/edit?usp=sharing)에서 확인하실 수 있습니다.
