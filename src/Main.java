import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static File findFile(String name, File file){
        File[] fileList = file.listFiles();
        if(fileList!= null){
            for(File file1 : fileList){

            }
        }
    }

    public static void main(String[] args) {

        /**
         * 정렬 sort
         */
        List<Person> list = new ArrayList<>();
        list.add(new Person("홍성훈",33));
        list.add(new Person("홍성충",31));
        list.add(new Person("헤헤헤",43));
        list.add(new Person("가나다",53));
        list.add(new Person("홍가나",23));


        System.out.println(list);
        list.sort((p1,p2)->p1.getName().compareTo(p2.getName()));
        System.out.println(list);
        list.sort((p1,p2)->Integer.compare(p1.getAge(),p2.getAge()));
        System.out.println(list);


        /**
         * 파일 입출력
         */
        try{
            //파일 입력
            File file = new File("test.txt");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("test22");
            bufferedWriter.newLine();
            bufferedWriter.write("test");

            bufferedWriter.close();
            fileWriter.close();


            //파일 출력
            File fileout = new File("test.txt");
            FileReader fileReader = new FileReader(fileout);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = "";
            while((line=bufferedReader.readLine())!=null)
                System.out.println(line);

        }catch(IOException e){
            System.out.println("file not");
        }


        /**
         * 폴더 탐색
         */



        /**
         * 소켓
         */
    }
}
