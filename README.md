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
