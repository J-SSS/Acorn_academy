package com.acon;

import java.util.*;
import java.util.stream.*;

public class L15StreamEx {
    class Student{
        private String name;
        private boolean isMale;
        private int hak;
        private int ban;
        private int score;
        public Student(String name,boolean isMale,int hak,int ban,int score) {
            this.name=name;
            this.isMale=isMale;
            this.hak=hak;
            this.ban=ban;
            this.score=score;
        }
        public String getName() {return name;}
        public boolean isMale() {return isMale;}
        public int getHak() {return hak;}
        public int getBan() {return ban;}
        public int getScore() {return score;}


        @Override
        public String toString() {
            return "{"+name +","+isMale+","+hak+","+ban+","+ score+"}";
        }
    }
    public static void main(String[] args) {
        List<Student> studentList=new ArrayList<Student>();
        L15StreamEx out=new L15StreamEx();
        studentList.add(out.new Student("나자바", true, 1, 1, 300));
        studentList.add(out.new Student("김지미", false, 1, 1, 250));
        studentList.add(out.new Student("김자바", true, 1, 1, 200));
        studentList.add(out.new Student("이지미", false, 1, 2, 150));
        studentList.add(out.new Student("남자바", true, 1, 2, 100));
        studentList.add(out.new Student("안지미", false, 1, 2, 50));
        studentList.add(out.new Student("황지미", false, 1, 3, 100));
        studentList.add(out.new Student("강지미", false, 1, 3, 150));

        studentList.add(out.new Student("나자바", true, 2, 1, 300));
        studentList.add(out.new Student("김지미", false, 2, 1, 250));
        studentList.add(out.new Student("김자바", true, 2, 1, 200));
        studentList.add(out.new Student("이지미", false, 2, 2, 150));
        studentList.add(out.new Student("남자바", true, 2, 2, 100));
        studentList.add(out.new Student("안지미", false, 2, 2, 50));
        studentList.add(out.new Student("황지미", false, 2, 3, 100));
        studentList.add(out.new Student("강지미", false, 2, 3, 150));

        studentList.add(out.new Student("나자바", true, 3, 1, 300));
        studentList.add(out.new Student("김지미", false, 3, 1, 250));
        studentList.add(out.new Student("김자바", true, 3, 1, 200));
        studentList.add(out.new Student("이지미", false, 3, 2, 150));
        studentList.add(out.new Student("남자바", true, 3, 2, 100));
        studentList.add(out.new Student("안지미", false, 3, 2, 50));
        studentList.add(out.new Student("황지미", false, 3, 3, 100));
        studentList.add(out.new Student("강지미", false, 3, 3, 150));

        //System.out.println(studentList);

        //1학년 남자들의 점수
        int sum=studentList.stream()
                .filter((Student s)->{return s.getHak()==1;})
                .filter((Student s)->{return s.isMale;})
                .mapToInt((Student s)->{return s.getScore();})
                .sum();
//        System.out.println("1학년 남자들의 점수 :"+sum);
        //2학년 여자들의 점수


        int sum2=studentList.stream()
                .filter((s)->s.getHak()==2)
                .filter((s)->!s.isMale)
                .mapToInt(Student::getScore)

                .sum();


//        System.out.println("2학년 여자들의 점수 :"+sum2);
        //1한년의 남자 여자의 수를 collect로 구현하세요!

        Map<Boolean, Long> map=studentList.stream()
                .filter((Student s)->s.getHak()==1)
                .collect(Collectors.partitioningBy((Student s)->s.isMale() , Collectors.counting()));

//        System.out.println(map);



//        System.out.println(map);
        //1한년을 남자 여자의 그룹으로 나누고 다시 통과(score>=150)와 낙제 그룹으로 나누세요.
        Map<Boolean, Map<Boolean, List<Student>>> map2=studentList.stream()
                .filter((s)->s.getHak()==1)
                .collect(Collectors.partitioningBy(Student::isMale ,
                        Collectors.partitioningBy((Student s)->{return s.getScore()>=150;})));

//        System.out.println(map2);


        //각학년별 남자 여자 그룹의  접수가 가장 높은 사람을 구하세요


        Map<Integer, Map<Boolean, Optional<Student>>> map3=studentList.stream()
                .collect(Collectors.groupingBy(Student::getHak,
                                Collectors.partitioningBy(Student::isMale,
                                        Collectors.maxBy(Comparator.comparingInt(Student::getScore))

                                )
                        )
                );
//        System.out.println(map3);

///////////////////////////////////////////////////////////////////////////////

        //1학년 남자,여자 그룹의 평균 점수를 구하세요
        Map<Boolean, Double> map4 = studentList.stream()
                .filter((Student s)->s.getHak()==1)
                .collect(Collectors.partitioningBy(Student::isMale,
                     Collectors.averagingInt(Student::getScore)));


        //2학년을 남자 여자의 그룹으로 나누고 다시 통과한 사람과 낙제 한 사람의 수를 구하세요
        //낙제 기준은 100점으로 가정
        Map<Boolean, Map<Boolean, Long>> map5 =  studentList.stream()
                .filter((Student s)->s.getHak()==2)
                .collect(Collectors.partitioningBy(Student::isMale,
                    Collectors.partitioningBy((Student s)->s.getScore()>=100,
                            Collectors.counting())));


        //모든 학년을 그룹으로 나누고 학년 마다  남자와 여자 그룹의 수를 구하세요
        Map<Integer, Map<Boolean, Long>> map6 = studentList.stream()
                .collect(Collectors.groupingBy(Student::getHak,
                        Collectors.groupingBy(Student::isMale,
                                Collectors.counting())));


        //모든 학년을 그룹으로 나누고 학년 마다  반 그룹으로 나누세요
        Map<Integer, Map<Integer, List<Student>>> map7 = studentList.stream()
                .collect(Collectors.groupingBy(Student::getHak,
                        Collectors.groupingBy(Student::getBan)));


        //모든 학년을 그룹으로 나누고 학년 마다  반 그룹의 수를 구하세요
        Map<Integer, Map<Integer, Long>> map8 = studentList.stream()
                .collect(Collectors.groupingBy(Student::getHak,
//                        .collect(Collectors.groupingBy((Student s) -> s.getHak(); ,
//                        .collect(Collectors.groupingBy((Student s) ->  s.getHak();} ,
//                        .collect(Collectors.groupingBy((Student s) -> {s.getHak();}; ,
//                        .collect(Collectors.groupingBy((Student s) -> {s.getHak()}; ,
                        Collectors.groupingBy(Student::getBan, Collectors.counting())));

        System.out.println(map8);

    }
}







