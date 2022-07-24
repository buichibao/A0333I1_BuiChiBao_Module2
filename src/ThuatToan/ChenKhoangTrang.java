package ThuatToan;

public class ChenKhoangTrang {
    public static void main(String[] args) {

    }
    public  String solution(String str){
        String str1="";
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){
                str1=str1+" "+str.charAt(i);
            }else{
                str1=str1+str.charAt(i);
            }
        }
        return  str1.toLowerCase().trim();
    }
}
