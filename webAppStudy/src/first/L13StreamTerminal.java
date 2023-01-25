package first;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class L13StreamTerminal {
    class Person{
        private String name;
        private int birth;
        private String gender;
        public Person(String name,int birth,String gender) {
            this.name=name;
            this.birth=birth;
            this.gender=gender;
        }
        @Override
        public String toString() {
            return "["+name+", "+birth+", "+gender+"]";
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getBirth() {
            return birth;
        }
        public void setBirth(int birth) {
            this.birth = birth;
        }
        public String getGender() {
            return gender;
        }
        public void setGender(String gender) {
            this.gender = gender;
        }

    }
    public static void main(String[] args) {
        //StreamAPI 의 최종연산
        //forEach(Consumer (T)->{} )  : 보통 결과를 출력할 때 많이 사용
        L13StreamTerminal out=new L13StreamTerminal();
        ArrayList<Person> personList=new ArrayList<Person>();
        personList.add(out.new Person("김유진",2000,"여자"));
        personList.add(out.new Person("박현우",1995,"남자"));
        personList.add(out.new Person("김승현",2002,"남자"));
        personList.add(out.new Person("김성현",1999,"남자"));
        personList.add(out.new Person("이서윤",2004,"여자"));
        personList.add(out.new Person("김지영",1980,"여자"));
        personList.add(out.new Person("박시우",1990,"남자"));
        System.out.println(personList.toString());
        //personList에서 남자의 이름만 출력하세요!

        ArrayList<String> nameList=new ArrayList<String>();

        //Collection은 Stream을 반환하는 함수를 제공 (List,Set)
        //Map 은 entrySet() 으로 key와 value를 Entry로 갖는 Set으로 변경해서 stream 작성

        List<String> nameList2=personList.stream()
                .filter((Person p)->{return 2022-p.getBirth()< 31;})
                .filter((Person p)->{return p.getGender().equals("여자");})
                .map((Person p)->{return p.getName();})
                .peek((String name)->{System.out.println("30살 이하의 여성의 이름  :"+name);})
                .collect(Collectors.toList());

        System.out.println(nameList2);

        for(int i=0; i<personList.size(); i++) {
            Person p=personList.get(i);
            String gender=p.getGender();
            if(gender.equals("남자")) {
                String name=p.getName();
                nameList.add(name);
            }
        }
        for(int i=0; i<nameList.size(); i++) {
            System.out.println("남자의 이름 : "+nameList.get(i));
        }
        //문제 나이가 30이하인데 여자인 사람의 이름을 출력하세요!
        nameList.clear();
        int nowYear=LocalDate.now().getYear();
        Iterator<Person> personIt=personList.iterator();
        while(personIt.hasNext()) {
            Person p=personIt.next();
            int age=nowYear-p.getBirth()+1;
            String gender=p.getGender();
            if(age<=30) {
                if(gender.equals("여자")) {
                    nameList.add(p.getName());
                }
            }
        }
        Iterator<String> nameIt=nameList.iterator();
        while(nameIt.hasNext()) {
            System.out.println("30살 이하 여성의 이름: "+nameIt.next());
        }

        //void forEach(Consumer) : 각 요소 마다 실행되는 함수를 재정의
        //personList.forEach(null);  Collection 에 존재하는 forEach();
        Stream<Person> personStream=personList.stream();
        personStream.forEach((p)->{
            System.out.println(p.name);
        });
        //Optional<T> reduce(BiOperator (i1,i2)->{return ?? }) : Stream<T> 각요소들을 하나 요소로 변형해서 반환하는 함수 정의
        //1. 한번 사용한 Stream을 재사용할 수 없다.
        //2. reduce 처음에 생성된 Stream type으로 반환해야한다.
//		personStream.reduce((p,p1)->{
//			return p.getName()+", "+p1.getName();
//		})
        Optional<String> names=personList.stream()
                .map((p)->p.getName()) //Stream<String>
                .reduce((name1,name2)->name1+", "+name2);
        System.out.println(names);

        //Stream.of(data,data,data) =>Stream 객체로 반환

        Stream<Integer> numStream=Stream.of(-13,13,20,50,1,100,-1);
        List<Integer> numsList=numStream
                .map((num)->num*num)
                .collect(Collectors.toList());
        //.forEach((num)->{System.out.println(num);});
        System.out.println(numsList);

        Stream<Integer> numStream2=Stream.of(-13,13,20,50,1,100,-1);
        Set<Integer> numsSet=numStream2
                .map((num)->num*num)
                .collect(Collectors.toSet());
        System.out.println(numsSet);

        List<String> nameList3=personList.stream()
                .map((p)->p.getName())
                .collect(Collectors.toList());
        System.out.println(nameList3);

        Map<Integer,String> personMap=personList.stream()
                .collect(Collectors.toMap((p)->p.getBirth(),(p)->p.getName()));
        System.out.println(personMap);
        //collect(Collectors.??) : 수집한 스트림을 특정 자료구조로 변환해서 반환하는 함수


        //위의 반복문 두개와 같은 스트림을 구현해 보세요!
    }
}

