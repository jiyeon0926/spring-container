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

# ✅ 빈 스코프 테스트 결과
```
SingletonBean.init
singletonBean1 = container.init.SingletonTest$SingletonBean@3224a577
singletonBean2 = container.init.SingletonTest$SingletonBean@3224a577
SingletonBean.destroy
```
---------------

# ✅ 프로토타입 스코프 테스트 결과
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
