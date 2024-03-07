### Comparator 와 Comparable 

* Comparable 인터페이스는 compareTo 를 구현해야 한다. 
* Comparator 인터페이스는 compare(T o1, T o2 ) 를 구현해야 한다. 

* Comparable 은 자기 자신과 매개변수 객체를 비교한다. 
* Comparator 는 두 매개변수 객체를 비교한다. 

```markdown
class Student implements Comparable<Student> {
   int age; // 나이 
   int classNumber; // 학급 

   Student(int age, int classNumber){
     this.age = age;
     this.classNumber = classNumber;
}
 
  public int compareTo(Student o){
   
      // 자기 자신의 age 가 o 의 age 보다 크다면 양수이다. 
     if(this.age > o. age){
        return 1;
    }
   // 자시 자신의 age 와 o 의 age 가 같다면 0 이다 
    else if(this.age == o.age){
       return 0;
   }
      // 자기 자신의 age 가 o 의 age 보다 작다면 음수이다. 
    else {
       return -1;
  } 

}

}

```

```markdown

class Student implements Comparator<Student>{
  int age;
  int classNumber;
  
  Student(int age, int classNumber){
    this.age = age;
    this.classNumber = classNumber;
}
  
  @Override
    public int compare(Student o1, Student o2){
        if(o1.classNumber > o2.classNumber){
             return 1;
        }
        else if(o1.classNumber == o2.classNumber){
             return 0;
      }
      else {
             return -1;
    }
}
}









