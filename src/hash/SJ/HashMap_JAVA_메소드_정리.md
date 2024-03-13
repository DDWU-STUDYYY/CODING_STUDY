## HashMap

> https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/HashMap.html
>

HashMap은 자료를 key - value의 쌍으로 저장한다. key 값을 통해서 value에 접근할 수 있으며, key 값은 중복될 수 없다(value는 가능). java.util.Map을 구현하기때문에 Map의 메소드도 사용할 수 있다.

다음과 같이 선언한다.

```java
HashMap<Integer, String> hm = new HashMap<>();
```

메소드는 다음과 같다.

### 값 넣기

```java
// put() : 값을 넣는 메소드
// 선언할 때 지정한 데이터 타입으로 key와 value를 넣는다.(key - value순)
// key는 중복을 허용하지 않기 때문에, 이미 존재하는 key라면 새 값이 기존의 value를 대체한다.
hm.put(1, "this is value1"); 
hm.put(2, "this is value2");

// putIfAbsent() : 이미 존재하는 값인지 확인하고, 없는 경우에만 값을 넣는 메소드
// 이미 존재할 경우, 추가하지 않고 이전 값을 반환함
String oldValue = hm.putIfAbsent(1, "this is already exist"); // oldValue에는 새로운 값이 할당
// 존재하지 않을 경우, 값을 추가하고 null을 반환한다.
String nullValue = map.putIfAbsent(5, "this is new value");

// putAll() : HashMap의 데이터를 다른 HashMap에 복사
HashMap<Integer, String> hm2 = new HashMap<>();

hm2.put(3, "this is value3");
hm2.put(4, "this is value4");

hm.putAll(hm2); // hm의 값을 hm2에 복사한다. 
// hm2 = {1=this is value1, 2=this is value2, 3=this is value3, 4=this is value4}
System.out.println(map1); // 출력: {1=value1, 2=value2, 3=value3, 4=value4}

```

### 값 변경

```java
// 기존의 value 한꺼번에 변경, 아래 예시는 기존 값에 ?를 덧붙이는 예제
hm.replaceAll((key, value) -> value +"?");

// replace의 형태는 2가지가 있음 

// 1. 키가 이미 존재하고, 연관된 값이 주어진 값과 같음을 검사. 같은 경우에만 변경한다. 
// 키 1의 값이  "oldvalue"일 때, "newValue"로 변경
hm.replace(1, "oldValue", "newValue");

// 2. 이미 존재하는 key를 전달된 value로 바꿈
// 키 1의 값을 "this is original value"로 변경
hm.replace(1, "this is original value");
```

### 값 출력, 연산

```java
int key01 = 1;
int newValue = "this is new value";

// get() : 특정 key 값에 매핑된 value를 반환, 없으면 null을 반환
hm.get(key01값);

// getOrDefault() : 특정 key 값에 매핑된 value를 반환, 없으면 Default 값을 반환
// 첫번째 매개변수가 key 값, 두번째 매개변수가 Default값
hm.getOrDefault(key01, "this is default value"); 

// hm.entrySet() : hashmap의 데이터 값을 엔트리 set으로 반환
for (Map.Entry<Integer, String> entry : hm.entrySet()) {
	System.out.println(entry.getKey() + " - " + entry.getValue());
}

// keySet() : 모든 key들을 set으로 반환
for (Integer key : hm.keySet()) {
	System.out.println(key);
}

// values() : 모든 values들을 출력 
for (String value : hm.values()) {
	System.out.println(value);
}

// forEach 사용. 연산, 출력 모두 가능
hm.forEach((key, value) -> {
	System.out.println(+ key + " - " + value);
});

// compute() : 연산 수행
hm.compute(1, (key, value) -> value.toLowerCase());

// computeIfPresent() : key값이 존재하는 경우에만 연산 수행
hm.computeIfPresent(1, (key, value) -> value + "!!");

// computeIfAbsent() : key값이 존재하지 않는 경우에만 연산 수행
hm.computeIfAbsent(7, key -> "??"); // 이미 "apple" 키가 존재하므로 값을 추가하지 않고, 기존 값인 3을 반환함
```

### 값 여부 확인

```java
hm.containsKey(key01); // 특정 key 값이 있는지의 여부. 있으면 true, 없으면 false

hm.containsValue(newValue); // 특정 value 값이 있는지의 여부를 확인

int size = hm.size(); // map의 크기를 반환, int형

hm.isEmpty(); // 비었는지 확인, 비었으면 true, 값이 있으면 false
```

### 값 삭제

```java
hm.remove(key01); // key값과 key값에 매핑된 value를 map에서 삭제, key값 존재하지 않아도 예외 발생 x
hm.clear(); // 모든 데이터를 map에서 지운다.
```