# ✅ 빈 생명주기 콜백 테스트 결과
```
생성자 호출, url = null
초기화
connect: http://hello-spring.dev
call: http://hello-spring.dev message = 초기화 연결 메시지
소멸
close: http://hello-spring.dev
```
--------------

# ✅ 싱글톤 스코프 테스트 결과
- 스프링은 싱글톤 패턴이기 때문에 스프링 빈은 싱글톤 스코프로 생성됨
- 스프링 컨테이너는 항상 같은 인스턴스의 스프링 빈을 반환
```
SingletonBean.init
singletonBean1 = container.init.SingletonTest$SingletonBean@3224a577
singletonBean2 = container.init.SingletonTest$SingletonBean@3224a577
SingletonBean.destroy
```
---------------

# ✅ 프로토타입 스코프 테스트 결과
- 스프링 컨테이너가 빈의 생성, 의존관계 주입, 빈 초기화까지만 관여하고 더는 관리하지 않음
- 스프링 컨테이너는 항상 새로운 인스턴스의 빈을 생성해서 반환
- 스프링 컨테이너가 빈의 소멸까지 관여하지 않음
```
[prototypeBean1]
PrototypeBean.init
[prototypeBean2]
PrototypeBean.init
[prototypeBean3]
PrototypeBean.init
prototypeBean1 = container.init.PrototypeTest$PrototypeBean@3224a577
prototypeBean2 = container.init.PrototypeTest$PrototypeBean@2e32ccc5
prototypeBean3 = container.init.PrototypeTest$PrototypeBean@748741cb
```
---------------------

# 🏗️ 스프링 컨테이너
스프링 컨테이너는 스프링 빈을 관리하는 역할을 하고, 스프링 빈을 재사용하기 위해 사용된다
- 스프링 빈 생성
- 의존관계 주입
- 빈 초기화
- 빈 소멸

# 1. 스프링의 컨테이너 초기화 순서에 대해 설명해주세요.
먼저, 스프링 컨테이너는 기본적으로 싱글톤 패턴을 사용해 빈을 관리하기 때문에 항상 같은 인스턴스의 스프링 빈을 생성합니다 </br>
빈이 생성된 후, Repository → Service → Controller 순으로 의존관계가 주입됩니다 </br>
의존성 주입이 완료되면 스프링 컨테이너는 스프링 컨테이너에 등록된 스프링 빈을 재사용하기 위해 초기화 작업을 합니다 </br>
초기화 작업이 이루어지면 스프링 빈은 애플리케이션 내에서 재사용할 수 있는 상태가 됩니다 </br>

# 2. 서블릿 컨테이너와 스프링 컨테이너의 관계는 무엇인가요?
서블릿 컨테이너는 WAS가 위임한 요청을 토대로 클라이언트의 요청과 응답을 처리하는 역할을 합니다 </br>
스프링 컨테이너는 스프링 빈을 생성하고, 빈의 생명주기를 관리하는 역할을 합니다 </br>
서블릿 컨테이너와 스프링 컨테이너는 수행하는 역할이 다르기 때문에 웹 어플리케이션을 동작하는 데에 있어서 서로 필요한 관계라고 생각할 수 있습니다 </br>

# 3. 스프링 부트에서는 이 초기화 순서가 어떻게 달라지나요?
