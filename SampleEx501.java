import java.util.*;

public class SampleEx501{
    public static void main(String args[]){
        //ジェネリクス
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student("安藤一郎", 1, 1));
        al.add(new Student("伊藤花子", 1, 2));
        al.add(new Student("太田たかし",2, 3));
        al.add(new Student("加藤きこ",2, 4));
        al.add(new Student("木田直美", 3, 5));
        // 三番目を削除
        al.remove(3);
        for(Student s:al){
            //Student s = (Student)al.get(i);
            System.out.println("番号：" + s.getNumber() + " 名前: " + s.getName() + " 学年" + s.getGrade());
        }
    }
}