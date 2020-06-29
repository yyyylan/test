package jmeterpractice;

public class Student implements Cloneable{
    private String name;
    private Subject subj;
    public Student(String s, String sub){
        name =s;
        subj = new Subject(sub);

    }

    public Subject getSubject() {
        return subj;
    }

    public String getName() {
        return name;
    }
    @Override
    public Object clone(){
        try {
            //浅拷贝，直接调用父类的clone
            return super.clone();
        }catch (CloneNotSupportedException e){
            return null;
        }

    }
    private void test1(){
        Student stud = new Student("wang","do");
        System.out.println("原始"+stud.getName()+stud.getSubject());

        //拷贝对象
        Student copystud = (Student) stud.clone();
        System.out.println("拷贝"+copystud.getName()+copystud.getSubject());
    }
}
