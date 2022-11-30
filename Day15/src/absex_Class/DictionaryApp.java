package absex_Class;

public class DictionaryApp { //ID PW에 사용하는 방법
public static void main(String[] args) {
	Dictionary dic=new Dictionary(10);
    dic.put("가길동","자바");   //  key = ID    value = PW    라고 보면 됨!
    System.out.println(dic.length());
    dic.put("나길동","파이썬"); //
    System.out.println(dic.length());
    dic.put("나길동","C++");  //

    System.out.println("가길동의 값은 "+dic.get("가길동"));
    System.out.println("나길동의 값은 "+dic.get("나길동"));
    dic.delete("가길동");
    System.out.println("가길동의 값은 "+dic.get("가길동"));  // delete 해서 null
    System.out.println(dic.length());
 }
}