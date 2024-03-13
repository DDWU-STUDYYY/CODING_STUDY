### Comparable vs Comparator 

* 보통 자료구조의 경우 Heap. 백준에서는 정렬 문제에서 많이 사용이 된다. 

* Comparable 와 Comparator 모두 interface 이다. 즉 인터페이스 내에 선언된 메소드를 반드시 구현해야 한다. 

* Comparable 은 compareTo 를 구현해야 하고 Comparator 는 compare 을 구현해야 한다. 

* 결론적으로 우리는 객체를 비교할 수 있도록 하는 것이다. 

#### Comparable 은 자기 자신과 매개변수의 객체를 비교하는 것이다. 

```markdown
class Student implements Comparable<Student> {
   int age;
   int classNumber;

   Student(int age, int classNumber) {
      this.age = age;
      this.classNumber = classNumber;
   }
  
   public int compareTo(Student o){
       return this.age - o.age;
   }

```

#### Comparator 이다 

* 두 매개변수 객체를 비교하는 것이다. 
```markdown
class Student implements Comparator<Student> {
   int age;
   int classNumber;
  
   Student(int age, int classNumber) {
    this.age = age;
    this.classNumber = classNumber;
 }
  public int compare(Student o1, Student o2){
     return o1.classNumber - o2.classNumber;
}
```

* 우리가 원하는 것은 Comparator 비교 기능만 따로 두고 싶은 것이다. 즉 익명 클래스를 활용한다

* 익명 객체의 구현 예시이다. 
```markdown

  // 익명 객체 구현방법 1 
  public class Test{
    public static void main(String[] args){
      Comparator<Student> comp1 = new Comparator<Student>(){
         public int compare(Student o1, Student o2){
            return o1.classNumber - o2.classNumber;
}
};
}

  // 익명 객체 구현 방법 2 
   public static Comparator<Student> comp2 = new Comparator<Student>() {
          public int compare(Student o1, Student o2){
               return o1.classNumber - o2.classNumber;
}
};
}

class Student{
  int age;
  int classNumber;
  
   Student(int age, int classNumber){
     this.age = age;
     this.classNumber = classNumber;
}
}
```


* Comparable 를 익명 객체로 구현 
```markdown
public static Comparable<Student> comp = new Comparable<Student>(){
   public int compareTo(Student o1){
 
}
};

```

* 자바는 기본적으로 오름차순이 기본 정렬이다. 즉 선행 원소가 후행 원소보다 작은 경우에는 순서를 바꾸지 않는다. 
* 두 원소의 차가 양수라면 선행이 후행보다 크기 때문에 두 원소의 위치를 바꾸어 주어야 한다. 그러면 오름차순으로 정렬된다 
```markdown
 // 자신이 구현한 Comparator 익명 객체를 활용하여 정렬하기 

 public class Test{
   public static void main(String[] args) {
      MyInteger[] arr = new MyInteger[10];
   
     for(int i=0; i<10; i++){
          arr[i] = new MyInteger((int)(Math.random() * 100));
    }
   
    Arrays.sort(arr,comp);

   static Comparator<MyInteger> comp = new Comparator<MyInteger>(){
     public int compare(MyInteger o1, MyInteger o2){
      return o1.value - o2.value;
}
};
}

  class MyInteger{
      int value;
   
     public MyInteger(int value) {
       this.value = value;
   }
}
```

* 내림차순으로 정렬해주고 싶다면 ?
```markdown
 public int compareTo(MyClass o){
   return o1.value - this.value;
}
  public int compare(MyClass o1, MyClass o2){
   return o2.value - o1.value;
}
```

* 참조 링크 : https://velog.io/@minseojo/Java-Comparable-Comparator

* Comparable Comparator 

1. Comparable 
```markdown

@Override 
  public int compareTo(Object o) {
     User user = (User) o;
        if(this.age > user.age) 
            return 1;
        else if (this.age == user.age ) 
            return 0;
        else
            return -1;
 }
}

 public static void referenceCompare() {
    User user1 = new User("조민서" , 100);
    User user3 = new User("나비", 3000);
    User user2 = new User("가오리" , 40);
  
   List<User> list = new ArrayList<>();
  
   list.add(user1);
   list.add(user2);
   list.add(user3);

   Collections.sort(list);
   for(User user : list){
     System.out.println(user.name + " " + user.age);
}
}

  // 근데 위의 방법은 오버플로우가 발생할 수 있다. 

```

* 그러면 아래와 같은 방법으로 해보자 

```markdown
@Override 
public int compareTo(Object o) {
  User user = (User) o;
  return Integer.compare(this.age, user.age);
}

// 역순으로 정려하고 싶다면 ? 

@Override
public int compareTo(Object o) {
   User user  = (User) o;
   return Integer.compare(user.age, this.age);
}

```

* Comparator 
```markdown

comp.compare(user1, user2);

// 람다식을 사용하자 
// Comparable 와 Comparator 인터페이스를 구현하지 않고 즉석으로 할 수 있다. 

list.sort((User a, User b) -> Integer.compare(a.age,b.age));


```

* 우선순위큐의 정렬 
```markdown

@Override
public int compareTo(Object o) {
   User user = (User) o;
    if(this.name == user.name) {
        return Integer.compare(this.age, user.age); // 이름이 같으면 나이는 오름차순 정렬 
}  else {
        return this.name.compareTo(user.name); // 이름이 같으면 이름으로 오름차순 정렬을 해준다 
}






