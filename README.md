# Spring Boot

Spring Boot 웹 개발 연습용 프로젝트입니다.  
[뉴렉처(Newlecture)의 강의](https://www.youtube.com/watch?v=4-0scAf5tpU&list=PLq8wAnVUcTFWVdN74gn8FksCqwfI_GuJY)를 참고하여 개인 학습 및 연습용으로 제작되었으며,  
게시판 기능을 중심으로 Spring MVC의 구조와 흐름을 익히고자 했습니다.

---

## 🛠 기술 스택

- **프레임워크**: Spring Boot (MVC)
- **템플릿 엔진**: Thymeleaf
- **언어**: Java 17
- **빌드 도구**: Maven
- **개발 환경**: Eclipse

---

## 📁 주요 기능 (실습 중심)

- [x] 공지사항 리스트 출력
- [x] 공지사항 상세 페이지 연결 (`detail?id={id}`)
- [ ] 공지사항 등록, 수정, 삭제 (추후 추가 예정)
- [ ] 페이징 및 검색 기능
- [ ] 사용자 권한별 기능 분기 처리 (계획 중)

---

## 🔍 구조적 특징

- 관리자(admin)와 일반 사용자(user) 페이지를 명확히 구분하여 컨트롤러 및 템플릿을 별도로 구성
- 실습 목적이지만, 실제 서비스 구조를 염두에 두고 기능 단위별로 분리 설계

---

## 🎯 학습 목표

- Spring Boot 기반의 웹 애플리케이션 개발 흐름 이해
- 컨트롤러, 서비스, 뷰(Thymeleaf) 간의 연계 경험
- 동적 URL 처리 (`th:href`, 파라미터 전달 등) 연습
- 실전 구조를 고려한 MVC 분리 설계 연습

